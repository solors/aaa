package com.pubmatic.sdk.webrendering.mraid;

import com.pubmatic.sdk.common.view.POBWebView;

/* renamed from: com.pubmatic.sdk.webrendering.mraid.t */
/* loaded from: classes7.dex */
class C26940t implements POBWebView.WebViewBackPress {

    /* renamed from: a */
    final /* synthetic */ View$OnTouchListenerC26942v f71235a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C26940t(View$OnTouchListenerC26942v view$OnTouchListenerC26942v) {
        this.f71235a = view$OnTouchListenerC26942v;
    }

    @Override // com.pubmatic.sdk.common.view.POBWebView.WebViewBackPress
    public void onBackPress() {
        this.f71235a.m39859b();
    }
}
