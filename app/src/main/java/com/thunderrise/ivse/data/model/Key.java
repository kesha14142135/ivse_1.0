package com.thunderrise.ivse.data.model;

/**
 * Created by sergejkozin on 11/23/17.
 */
public class Key {

    private int mId;
    private Type mType;
    private String mName;

    public Key() {

    }

    public Key(int id, Type type, String name) {
        mId = id;
        mType = type;
        mName = name;
    }

    public int getId() {
        return mId;
    }

    public void setId(int mId) {
        this.mId = mId;
    }

    public Type getType() {
        return mType;
    }

    public void setType(Type type) {
        mType = type;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
