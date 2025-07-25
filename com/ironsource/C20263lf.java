package com.ironsource;

import android.webkit.JavascriptInterface;

/* renamed from: com.ironsource.lf */
/* loaded from: classes6.dex */
public class C20263lf {

    /* renamed from: a */
    private C20583of f50997a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20263lf(C20583of c20583of) {
        this.f50997a = c20583of;
    }

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        this.f50997a.handleMessageFromAd(str);
    }
}
