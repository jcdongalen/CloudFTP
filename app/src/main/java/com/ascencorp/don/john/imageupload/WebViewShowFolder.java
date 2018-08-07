package com.ascencorp.don.john.imageupload;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewShowFolder extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_show_folder);
        mWebView = findViewById(R.id.webView);

        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());

        //Load the url
        if ((Providers.PROVIDER_NAME) getIntent().getSerializableExtra("provider") != null)
            loadURL((Providers.PROVIDER_NAME) getIntent().getSerializableExtra("provider"));
    }

    private void loadURL(Providers.PROVIDER_NAME provider) {
        switch (provider) {
            case GOOGLE_DRIVE:
                mWebView.loadUrl("https://drive.google.com/drive/folders/1OJHRfKMAVPgSgGyi1rZ76R04yfPZ_jFo?usp=sharing");
                break;
            case DROPBOX:
                mWebView.loadUrl("https://www.dropbox.com/sh/oeevoj2a9jkoy7l/AAAmEOzt8Dx6ZVDeYcl0p93da?dl=0");
                break;
        }
    }
}
