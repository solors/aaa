package com.taurusx.tax.p606j.p614c0;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;

/* renamed from: com.taurusx.tax.j.c0.c */
/* loaded from: classes7.dex */
public class C28516c extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        LogUtil.m37905d(C28162a.f73047a.m23824a(new byte[]{45, -112, 44, -125, 44, -126, 33}, new byte[]{89, -15}), str2);
        jsResult.confirm();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        LogUtil.m37905d(C28162a.f73047a.m23824a(new byte[]{-62, -61, -61, -48, -61, -47, -50}, new byte[]{-74, -94}), str2);
        jsResult.confirm();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        LogUtil.m37905d(C28162a.f73047a.m23824a(new byte[]{-103, 58, -104, 41, -104, 40, -107}, new byte[]{-19, 91}), str2);
        jsResult.confirm();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        LogUtil.m37905d(C28162a.f73047a.m23824a(new byte[]{35, 45, 34, 62, 34, 63, 47}, new byte[]{87, 76}), str2);
        jsPromptResult.confirm();
        return true;
    }
}
