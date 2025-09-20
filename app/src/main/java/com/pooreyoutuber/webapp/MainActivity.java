package com.pooreyoutuber.webapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find WebView from layout
        webView = findViewById(R.id.webview);

        // Enable JavaScript
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Open links inside app (not in external browser)
        webView.setWebViewClient(new WebViewClient());

        // Load your GitHub Pages website
        webView.loadUrl("https://pooreyoutuber.github.io/");
    }

    // Handle back button (navigate back in WebView if possible)
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}

