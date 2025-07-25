package com.yandex.mobile.ads.impl;

import com.google.firebase.ktx.BuildConfig;
import com.ironsource.C21114v8;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;

/* loaded from: classes8.dex */
public enum bi0 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("definedByJavaScript"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(BuildConfig.VERSION_NAME),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(C21114v8.C21122h.f54087r),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("beginToRender"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("onePixel"),
    f77314c(MRAIDCommunicatorUtil.KEY_VIEWABLE),
    /* JADX INFO: Fake field, exist only in values array */
    EF69("audible"),
    /* JADX INFO: Fake field, exist only in values array */
    EF79("other");
    

    /* renamed from: b */
    private final String f77316b;

    bi0(String str) {
        this.f77316b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f77316b;
    }
}
