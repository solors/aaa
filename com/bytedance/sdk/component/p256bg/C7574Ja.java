package com.bytedance.sdk.component.p256bg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

/* renamed from: com.bytedance.sdk.component.bg.Ja */
/* loaded from: classes3.dex */
public class C7574Ja extends AbstractC7586bg {

    /* renamed from: eo */
    static final /* synthetic */ boolean f16504eo = true;

    /* renamed from: Kg */
    protected String f16505Kg;

    /* renamed from: WR */
    protected WebView f16506WR;

    @Override // com.bytedance.sdk.component.p256bg.AbstractC7586bg
    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    /* renamed from: IL */
    protected void mo88474IL(C7588eo c7588eo) {
        this.f16506WR = c7588eo.f16537bg;
        this.f16505Kg = c7588eo.f16536bX;
        if (c7588eo.yDt) {
            return;
        }
        mo87428bX();
    }

    @SuppressLint({"AddJavascriptInterface"})
    /* renamed from: bX */
    protected void mo87428bX() {
        if (!f16504eo && this.f16506WR == null) {
            throw new AssertionError();
        }
        this.f16506WR.addJavascriptInterface(this, this.f16505Kg);
    }

    @Override // com.bytedance.sdk.component.p256bg.AbstractC7586bg
    /* renamed from: bg */
    protected Context mo88469bg(C7588eo c7588eo) {
        Context context = c7588eo.f16541zx;
        if (context != null) {
            return context;
        }
        WebView webView = c7588eo.f16537bg;
        if (webView != null) {
            return webView.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    protected void eqN() {
        this.f16506WR.removeJavascriptInterface(this.f16505Kg);
    }

    @Override // com.bytedance.sdk.component.p256bg.AbstractC7586bg
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.p256bg.AbstractC7586bg
    /* renamed from: IL */
    public void mo88475IL() {
        super.mo88475IL();
        eqN();
    }

    @Override // com.bytedance.sdk.component.p256bg.AbstractC7586bg
    /* renamed from: bg */
    protected String mo88471bg() {
        return this.f16506WR.getUrl();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.p256bg.AbstractC7586bg
    /* renamed from: bg */
    public void mo88465bg(String str, C7602xxp c7602xxp) {
        if (c7602xxp != null && !TextUtils.isEmpty(c7602xxp.f16568Kg)) {
            String str2 = c7602xxp.f16568Kg;
            m88500bg(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Base64.encodeToString(String.format("iframe[src=\"%s\"", str2).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)));
            return;
        }
        super.mo88465bg(str, c7602xxp);
    }

    @Override // com.bytedance.sdk.component.p256bg.AbstractC7586bg
    /* renamed from: bg */
    protected void mo88466bg(String str) {
        m88500bg(str, "javascript:" + this.f16505Kg + "._handleMessageFromToutiao(" + str + ")");
    }

    /* renamed from: bg */
    private void m88500bg(String str, final String str2) {
        if (this.ldr || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.bg.Ja.1
            @Override // java.lang.Runnable
            public void run() {
                if (C7574Ja.this.ldr) {
                    return;
                }
                try {
                    C7574Ja.this.f16506WR.evaluateJavascript(str2, null);
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.eqN.post(runnable);
        } else {
            runnable.run();
        }
    }
}
