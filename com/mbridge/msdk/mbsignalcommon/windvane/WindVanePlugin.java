package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.h */
/* loaded from: classes6.dex */
public abstract class WindVanePlugin {

    /* renamed from: b */
    protected Context f57763b;

    /* renamed from: c */
    protected Object f57764c;

    /* renamed from: d */
    protected WindVaneWebView f57765d;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f57763b = context;
        this.f57765d = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f57764c = obj;
        this.f57765d = windVaneWebView;
    }
}
