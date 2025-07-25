package com.mobilefuse.sdk.omid;

import android.content.Context;
import android.webkit.WebView;

/* loaded from: classes7.dex */
public interface MraidOmidBridge extends OmidBridge {
    void initAdSession(Context context, WebView webView) throws Throwable;

    String injectOmidScriptContentIntoAdm(String str) throws Throwable;

    void signalAdLoadedEvent() throws Throwable;
}
