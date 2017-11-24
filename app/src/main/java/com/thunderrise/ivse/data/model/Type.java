package com.thunderrise.ivse.data.model;

/**
 * Created by sergejkozin on 11/23/17.
 */

public class Type {
    private int mId;
    private int mLevel;
    private String mName;

    public Type() {
        mId = -1;
        mLevel = -1;
        mName = "";
    }

    public Type(int id, int level, String name) {
        mId = id;
        mLevel = level;
        mName = name;
    }


    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getLevel() {
        return mLevel;
    }

    public void setLevel(int level) {
        mLevel = level;
    }
}
