package com.zeus.gmc.sdk.mobileads.columbus.internal.coiio2;

import android.content.Context;
import android.webkit.WebSettings;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coiio2.c2oc2i */
/* loaded from: classes8.dex */
public class C32723c2oc2i extends C32727coo2iico {
    private static final String coi222o222 = "HtmlWebView";

    public C32723c2oc2i(Context context) {
        super(context);
        c2oc2i();
        getSettings().setJavaScriptEnabled(true);
        getSettings().setBlockNetworkImage(false);
        getSettings().setMixedContentMode(2);
        enablePlugins(true);
        setBackgroundColor(0);
    }

    private void c2oc2i() {
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (this.mIsDestroyed) {
            MLog.m25892d(coi222o222, "WebView stop loading called after destroyed()");
            return;
        }
        WebSettings settings = getSettings();
        if (settings == null) {
            return;
        }
        settings.setJavaScriptEnabled(false);
        super.stopLoading();
        settings.setJavaScriptEnabled(true);
    }
}
