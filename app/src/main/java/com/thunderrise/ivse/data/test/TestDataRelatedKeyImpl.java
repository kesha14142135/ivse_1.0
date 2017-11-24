package com.thunderrise.ivse.data.test;

import com.thunderrise.ivse.data.model.RelatedKey;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergejkozin on 11/24/17.
 */

public class TestDataRelatedKeyImpl implements TestDataRelatedKey {
    @Override
    public List<RelatedKey> testActiveRelatedKey() {
        List<RelatedKey> systemTypes = new ArrayList<>();
        /*
        Type type = new Type(1, 1, "active");
        systemTypes.add(new Key(1, type, "купи"),);
        systemTypes.add(new Key(2, type, "хочу"));
        systemTypes.add(new Key(3, type, "получить"));
        systemTypes.add(new Key(4, type, "скачать"));
        systemTypes.add(new Key(5, type, "ответить"));
        systemTypes.add(new Key(6, type, "закажи"));
        systemTypes.add(new Key(7, type, "сьесть"));
        systemTypes.add(new Key(8, type, "заполучить"));
        systemTypes.add(new Key(9, type, "ставить"));
        systemTypes.add(new Key(10, type, "сьесть"));
        systemTypes.add(new Key(11, type, "взять"));
        systemTypes.add(new Key(12, type, "стянуть"));
        */
        return systemTypes;
    }

    @Override
    public List<RelatedKey> testEccomerceRelatedKey() {
        return null;
    }

    @Override
    public List<RelatedKey> testCompanyRelatedKey() {
        return null;
    }
}
