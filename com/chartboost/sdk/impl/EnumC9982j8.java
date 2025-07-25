package com.chartboost.sdk.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;

/* renamed from: com.chartboost.sdk.impl.j8 */
/* loaded from: classes3.dex */
public enum EnumC9982j8 {
    PREROLL(InstreamAdBreakType.PREROLL),
    MIDROLL(InstreamAdBreakType.MIDROLL),
    POSTROLL(InstreamAdBreakType.POSTROLL),
    STANDALONE("standalone");
    

    /* renamed from: b */
    public final String f22441b;

    EnumC9982j8(String str) {
        this.f22441b = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f22441b;
    }
}
