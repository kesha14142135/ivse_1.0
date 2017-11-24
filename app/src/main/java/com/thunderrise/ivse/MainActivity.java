package com.thunderrise.ivse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.thunderrise.ivse.data.parser.SentenceParser;
import com.thunderrise.ivse.data.parser.TypeParser;
import com.thunderrise.ivse.data.test.TestDataKey;
import com.thunderrise.ivse.data.test.TestDataKeyImpl;
import com.thunderrise.ivse.data.model.Word;
import com.thunderrise.ivse.data.parser.SentenceParserImpl;
import com.thunderrise.ivse.data.parser.TypeParserImpl;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String QUERY = "Закажи такси лох на 18:30";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TypeParser parserType = new TypeParserImpl();
        SentenceParser parser = new SentenceParserImpl();
        TestDataKey testData = new TestDataKeyImpl();

        List<Word> words = parser.WordSplitting(QUERY);

        words = parserType.searchOffensiveWords(words, testData.testCensouredKey());
        words = parserType.searchType(words, testData.testActiveKey());
        words = parserType.searchType(words, testData.testEccomerceKey());


    }
}
