package com.thunderrise.ivse.data.model;

import java.util.List;

/**
 * Created by sergejkozin on 11/24/17.
 */

public class RelatedKey {
    private Key mKey;
    private List<Integer> mAttitudeDown;
    private List<Integer> mAttitudeUp;

    public RelatedKey() {

    }

    public RelatedKey(Key key, List<Integer> attitudeDown, List<Integer> attitudeUp) {
        mKey = key;
        mAttitudeDown = attitudeDown;
        mAttitudeUp = attitudeUp;
    }

    public Key getKey() {
        return mKey;
    }

    public void setKey(Key key) {
        mKey = key;
    }

    public List<Integer> getAttitudeDown() {
        return mAttitudeDown;
    }

    public void setAttitudeDown(List<Integer> attitudeDown) {
        mAttitudeDown = attitudeDown;
    }

    public List<Integer> getAttitudeUp() {
        return mAttitudeUp;
    }

    public void setAttitudeUp(List<Integer> attitudeUp) {
        mAttitudeUp = attitudeUp;
    }

}
