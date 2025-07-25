package com.helpshift.views;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* loaded from: classes5.dex */
public class HSWebView extends WebView {
    public HSWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65428b();
    }

    /* renamed from: a */
    private void m65429a() {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportMultipleWindows(true);
        settings.setDomStorageEnabled(true);
        settings.setMixedContentMode(2);
        settings.setCacheMode(2);
        settings.setAllowFileAccess(true);
        setLayerType(2, null);
    }

    /* renamed from: b */
    private void m65428b() {
        if (!isInEditMode()) {
            m65429a();
        }
    }

    public void destroyCustomWebview() {
        removeAllViews();
        destroy();
    }

    public HSWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65428b();
    }

    public HSWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        m65428b();
    }

    public HSWebView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i, z);
        m65428b();
    }

    public HSWebView(Context context) {
        super(context);
        m65428b();
    }
}
