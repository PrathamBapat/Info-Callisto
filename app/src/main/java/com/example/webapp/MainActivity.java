package com.example.webapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

        webview = (WebView) findViewById(R.id.webview);
       webview.loadUrl("https://mayeshamonjur.github.io");

       webview.setWebViewClient(new WebViewClient());

       //WebView webview = new WebView(MainActivity.this);
       // setContentView(webview);
       // webview.loadUrl("http://website.callistoitsolutions.com");
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            webview.loadUrl(url);
            return true;
        }
    }

    @Override
    public void onBackPressed(){
        if(webview.canGoBack()){
            webview.goBack();
        }
        else{
            super.onBackPressed();
        }
    }


}
