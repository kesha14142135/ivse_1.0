package com.thunderrise.ivse.data.parser;

import com.thunderrise.ivse.data.model.Key;
import com.thunderrise.ivse.data.model.Word;

import java.util.List;

/**
 * Created by sergejkozin on 11/24/17.
 */

public interface TypeParser {
    List<Word> searchOffensiveWords(List<Word> words, List<Key> keys);

    List<Word> searchType(List<Word> words, List<Key> keys);
}
