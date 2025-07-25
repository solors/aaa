package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class cf0 {

    /* renamed from: a */
    private final HashMap f77618a = new HashMap();
    @Nullable

    /* renamed from: b */
    private Map<String, String> f77619b;

    /* renamed from: a */
    public final synchronized Map<String, String> m35237a() {
        if (this.f77619b == null) {
            this.f77619b = Collections.unmodifiableMap(new HashMap(this.f77618a));
        }
        return this.f77619b;
    }
}
