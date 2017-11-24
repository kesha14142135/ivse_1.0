package com.thunderrise.ivse.data.parser;

import com.thunderrise.ivse.data.model.Word;

import java.util.List;

/**
 * Created by sergejkozin on 11/24/17.
 */

public interface SentenceParser {
    List<Word> WordSplitting(String stringForParcing);
}
