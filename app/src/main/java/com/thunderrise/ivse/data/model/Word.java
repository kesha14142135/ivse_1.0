package com.thunderrise.ivse.data.model;

/**
 * Created by sergejkozin on 11/17/17.
 */

public class Word {

    private String mWord;
    private int mType;
    private int mView;

    public Word() {
        mWord = "";
        mType = -1;
        mView = -1;
    }

    public Word(String word) {
        mWord = word;
        mType = -1;
        mView = -1;
    }

    public Word(String word, int type, int view) {
        mWord = word;
        mType = type;
        mView = view;
    }

    public String getWord() {
        return mWord;
    }

    public void setWord(String word) {
        mWord = word;
    }

    public int getType() {
        return mType;
    }

    public void setType(int type) {
        mType = type;
    }

    public int getView() {
        return mView;
    }

    public void setView(int view) {
        mView = view;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Word && mWord.equals(((Word) obj).getWord());
    }

    @Override
    public int hashCode() {
        int hash = 37;
        hash = hash * 17 + mWord.hashCode();
        return hash;
    }
}
