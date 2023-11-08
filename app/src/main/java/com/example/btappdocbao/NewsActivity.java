package com.example.btappdocbao;


import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class NewsActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        webView = (WebView) findViewById(R.id.wv);

        Intent intent = getIntent();

        String link = intent.getStringExtra("linkTinTuc");
        webView.loadUrl(link);
        webView.setWebViewClient(new WebViewClient());
    }
}