package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* renamed from: com.ironsource.sdk.controller.r */
/* loaded from: classes6.dex */
class C20895r {

    /* renamed from: a */
    private C20896s f53190a;

    /* renamed from: b */
    private boolean f53191b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20895r(C20896s c20896s) {
        this.f53190a = c20896s;
    }

    @JavascriptInterface
    public String getTokenForMessaging() {
        if (this.f53191b) {
            return "";
        }
        this.f53191b = true;
        return this.f53190a.m55198b();
    }
}
