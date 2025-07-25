package com.bytedance.sdk.openadsdk.core.p314Kg;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.Kg.eqN */
/* loaded from: classes3.dex */
public class C8569eqN {

    /* renamed from: IL */
    private static int f18878IL;

    /* renamed from: bX */
    private static volatile C8569eqN f18879bX;

    /* renamed from: bg */
    private final List<C8590zx> f18880bg = new ArrayList();

    /* renamed from: bg */
    public static C8569eqN m85700bg() {
        if (f18879bX == null) {
            synchronized (C8569eqN.class) {
                if (f18879bX == null) {
                    f18879bX = new C8569eqN();
                }
            }
        }
        return f18879bX;
    }

    @Nullable
    /* renamed from: IL */
    public C8590zx m85704IL() {
        C8590zx remove;
        if (m85702bX() > 0 && (remove = this.f18880bg.remove(0)) != null) {
            return remove;
        }
        return null;
    }

    /* renamed from: bX */
    public int m85702bX() {
        return this.f18880bg.size();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: bX */
    public void m85701bX(C8590zx c8590zx) {
        if (c8590zx == null || c8590zx.getWebView() == null) {
            return;
        }
        if (c8590zx.getParent() != null) {
            ((ViewGroup) c8590zx.getParent()).removeView(c8590zx);
        }
        try {
            c8590zx.removeAllViews();
            c8590zx.m89401bX();
            c8590zx.setWebChromeClient(null);
            c8590zx.setWebViewClient(null);
            c8590zx.setDownloadListener(null);
            c8590zx.setDefaultTextEncodingName("UTF-8");
            c8590zx.setAllowFileAccess(false);
            c8590zx.setJavaScriptEnabled(true);
            c8590zx.setAppCacheEnabled(true);
            c8590zx.setDatabaseEnabled(true);
            c8590zx.setSupportZoom(false);
            c8590zx.getWebView().setLayerType(0, null);
            c8590zx.setBackgroundColor(0);
            c8590zx.getWebView().setHorizontalScrollBarEnabled(false);
            c8590zx.getWebView().setHorizontalScrollbarOverlay(false);
            c8590zx.getWebView().setVerticalScrollBarEnabled(false);
            c8590zx.getWebView().setVerticalScrollbarOverlay(false);
            c8590zx.m89390bg(true);
            c8590zx.m89387eo();
            c8590zx.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }

    /* renamed from: IL */
    public void m85703IL(C8590zx c8590zx) {
        if (c8590zx != null) {
            if (this.f18880bg.size() >= f18878IL) {
                c8590zx.mo85614PX();
            } else if (this.f18880bg.contains(c8590zx)) {
            } else {
                m85701bX(c8590zx);
                this.f18880bg.add(c8590zx);
            }
        }
    }

    @UiThread
    /* renamed from: bg */
    public void m85699bg(C8590zx c8590zx) {
        if (c8590zx != null) {
            m85703IL(c8590zx);
        }
    }
}
