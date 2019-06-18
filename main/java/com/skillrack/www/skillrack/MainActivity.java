package com.skillrack.www.skillrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mywebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //getActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mywebView=findViewById(R.id.webView);
        WebSettings webSettings=mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("https://socializerofficial.000webhostapp.com/login.html");

        //CODE FOR OPENING THE APP
        mywebView.setWebViewClient(new WebViewClient());

    }


    //code for back phrase


    @Override
    public void onBackPressed() {
        if(mywebView.canGoBack())
        {
            mywebView.goBack();
        }
        else
        {
            super.onBackPressed();
        }
        super.onBackPressed();
    }
}
