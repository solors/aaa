package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;

/* renamed from: com.ironsource.yu */
/* loaded from: classes6.dex */
public class C21281yu {

    /* renamed from: a */
    private static String f54677a = "yu";

    /* renamed from: a */
    public static FrameLayout m53937a(Context context, View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.setVisibility(8);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout3.addView(view);
        frameLayout.addView(frameLayout2, layoutParams);
        frameLayout.addView(frameLayout3);
        return frameLayout;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private static void m53934b(WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    /* renamed from: a */
    private static void m53936a(WebSettings webSettings) {
        webSettings.setDisplayZoomControls(false);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: a */
    public static void m53935a(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        try {
            m53936a(settings);
            m53934b(settings);
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            String str = f54677a;
            Logger.m54972e(str, "setWebSettings - " + th.toString());
        }
    }
}
