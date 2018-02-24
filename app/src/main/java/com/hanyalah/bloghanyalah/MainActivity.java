package com.hanyalah.bloghanyalah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView myview;

    @Override
    public void onBackPressed(){
        if(myview.canGoBack()){
            myview.goBack();
        }else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myview = (WebView) findViewById(R.id.myview);

        //Javascript aktif
        myview.getSettings().setJavaScriptEnabled(true);
        myview.setFocusable(true);
        myview.setFocusableInTouchMode(true);
        //Setting Prioritas Render
        myview.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        myview.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        myview.getSettings().setDatabaseEnabled(true);
        myview.getSettings().setDatabaseEnabled(true);
        myview.getSettings().setDomStorageEnabled(true);
        myview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        //Load URL
        myview.loadUrl("https://www.hanyalah.com");
        myview.setWebViewClient(new WebViewClient());
    }
}
