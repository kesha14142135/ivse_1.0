package com.thunderrise.ivse.data.model;

import java.util.List;

/**
 * Created by sergejkozin on 11/17/17.
 */

public class Sentence {

    private int mId;
    private int mType;
    private int mStatus;
    private List<Word> mWords;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getType() {
        return mType;
    }

    public void setType(int type) {
        mType = type;
    }

    public int getStatus() {
        return mStatus;
    }

    public void setStatus(int status) {
        mStatus = status;
    }

    public List<Word> getWords() {
        return mWords;
    }

    public void setWords(List<Word> words) {
        mWords = words;
    }
}
