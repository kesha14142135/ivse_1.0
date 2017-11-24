package com.thunderrise.ivse.data.parser;

import com.thunderrise.ivse.data.constant.ConstantType;
import com.thunderrise.ivse.data.model.Key;
import com.thunderrise.ivse.data.model.Word;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by sergejkozin on 11/22/17.
 */

public class TypeParserImpl implements TypeParser {

    @Override
    public List<Word> searchOffensiveWords(List<Word> words, List<Key> keys) {
        List<Word> newWords = new ArrayList<>();
        Observable.fromIterable(words)
                .filter(this::filterWord)
                .flatMap(word ->
                        Observable.just(word)
                                .map(s -> foundOffensive(s, keys))
                                .subscribeOn(Schedulers.computation())
                ).subscribe(s -> {
            if (s.getType() == keys.get(0).getType().getId())
                newWords.add(s);
        });
        return deleteWords(words, newWords);
    }

    @Override
    public List<Word> searchType(List<Word> words, List<Key> keys) {
        List<Word> newWords = new ArrayList<>();
        Observable.fromIterable(words)
                .filter(this::filterWord)
                .flatMap(word ->
                        Observable.just(word)
                                .map(s -> foundType(s, keys))
                                .subscribeOn(Schedulers.computation())
                ).subscribe(s -> {
            if (s.getType() != ConstantType.TYPE_UNKNOWN)
                newWords.add(s);
        });
        return redefinitionOfWords(words, newWords);
    }

    private List<Word> deleteWords(List<Word> words, List<Word> newWords) {
        List<Word> w = new ArrayList<>();
        boolean flag = false;
        for (Word word : words) {
            for (Word newWord : newWords) {
                if (word.equals(newWord)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                flag = false;
            } else {
                w.add(word);
            }
        }
        return w;
    }

    private Word foundOffensive(Word word, List<Key> keys) {
        for (Key key : keys)
            if (key.getName().equals(word.getWord())) {
                word.setType(key.getType().getId());
            }
        return word;
    }

    private List<Word> redefinitionOfWords(List<Word> words, List<Word> newWords) {
        for (Word word : words) {
            for (Word newWord : newWords) {
                if (word.equals(newWord)) {
                    word.setType(newWord.getType());
                    break;
                }
            }
        }
        return words;
    }

    private boolean filterWord(Word word) {
        return word.getType() == ConstantType.TYPE_UNKNOWN;
    }

    private Word foundType(Word word, List<Key> keys) {
        int i = 0;
        for (Key key : keys) {
            ++i;
            if (key.getName().equals(word.getWord())) {
                word.setType(key.getType().getId());
                word.setView(i);
            }
        }
        return word;
    }
}
