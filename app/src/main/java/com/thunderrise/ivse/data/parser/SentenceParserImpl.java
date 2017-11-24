package com.thunderrise.ivse.data.parser;

import com.thunderrise.ivse.data.model.Word;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergejkozin on 11/20/17.
 */

public class SentenceParserImpl implements SentenceParser{

    private final String WORD_SEPARATOR = " ";

    public SentenceParserImpl() {
    }

    @Override
    public List<Word> WordSplitting(String stringForParcing) {
        List<Word> wordList = new ArrayList<>();
        stringForParcing = stringForParcing.toLowerCase();
        String[] words = stringForParcing.split(WORD_SEPARATOR);
        for (String word : words) {
            wordList.add(new Word(word));
        }
        return wordList;
    }
}
