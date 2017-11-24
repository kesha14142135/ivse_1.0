package com.thunderrise.ivse.data.test;

import com.thunderrise.ivse.data.model.Key;

import java.util.List;

/**
 * Created by sergejkozin on 11/22/17.
 */

public interface TestDataKey {
    List<Key> testActiveKey();

    List<Key> testCensouredKey();

    List<Key> testEccomerceKey();

    List<Key> testCompanyKey();
}
