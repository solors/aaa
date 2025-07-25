package com.smaato.sdk.core.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class BaseWebView extends WebView {
    public BaseWebView(Context context) {
        super(context.getApplicationContext());
        init();
    }

    private void disableContentAccess() {
        getSettings().setAllowContentAccess(false);
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
    }

    private void init() {
        initWebViewSettings();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void initWebViewSettings() {
        getSettings().setJavaScriptEnabled(true);
        disableContentAccess();
    }

    public void loadHtml(@NonNull String str) {
        loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        init();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i) {
        super(context.getApplicationContext(), attributeSet, i);
        init();
    }

    @TargetApi(21)
    public BaseWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context.getApplicationContext(), attributeSet, i, i2);
        init();
    }
}
