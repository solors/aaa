package net.pubnative.lite.sdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

/* loaded from: classes10.dex */
public class PNBeaconWebView extends WebView {
    public PNBeaconWebView(Context context) {
        super(context);
        init();
    }

    private void init() {
        getSettings().setJavaScriptEnabled(true);
    }

    public void loadBeacon(String str) {
        loadUrl("javascript:" + str);
    }

    public PNBeaconWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public PNBeaconWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
