package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;

/* loaded from: classes8.dex */
public enum nf1 {
    f82749c(InstreamAdBreakType.PREROLL),
    f82750d(InstreamAdBreakType.MIDROLL),
    f82751e(InstreamAdBreakType.POSTROLL),
    f82752f("standalone");
    

    /* renamed from: b */
    private final String f82754b;

    nf1(String str) {
        this.f82754b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f82754b;
    }
}
