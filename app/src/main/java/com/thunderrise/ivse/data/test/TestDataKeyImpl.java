package com.thunderrise.ivse.data.test;

import com.thunderrise.ivse.data.model.Key;
import com.thunderrise.ivse.data.model.Type;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergejkozin on 11/22/17.
 */

public class TestDataKeyImpl implements TestDataKey {

    @Override
    public List<Key> testActiveKey() {
        List<Key> systemTypes = new ArrayList<>();
        Type type = new Type(1, 1, "active");
        systemTypes.add(new Key(1, type, "купи"));
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
        return systemTypes;
    }

    @Override
    public List<Key> testCensouredKey() {
        List<Key> systemTypes = new ArrayList<>();
        Type type = new Type(2, 2, "censoured");
        systemTypes.add(new Key(13, type, "лох"));
        systemTypes.add(new Key(14, type, "пидр"));
        systemTypes.add(new Key(15, type, "дыбил"));
        systemTypes.add(new Key(16, type, "гандон"));
        return systemTypes;
    }

    @Override
    public List<Key> testEccomerceKey() {
        List<Key> baseEccomerce = new ArrayList<>();
        Type type = new Type(3, 3, "eccomerce");
        baseEccomerce.add(new Key(17, type, "такси"));
        baseEccomerce.add(new Key(18, type, "еда"));
        baseEccomerce.add(new Key(19, type, "билеты"));
        baseEccomerce.add(new Key(20, type, "жд билеты"));
        baseEccomerce.add(new Key(21, type, "авио билеты"));
        return baseEccomerce;
    }

    @Override
    public List<Key> testCompanyKey() {
        List<Key> company = new ArrayList<>();
        Type type = new Type(4, 4, "company");
        company.add(new Key(22, type, "uber"));
        company.add(new Key(23, type, "яндекс"));
        company.add(new Key(24, type, "лафка"));
        company.add(new Key(25, type, "море пива"));
        company.add(new Key(26, type, "салат"));
        return company;
    }
}
