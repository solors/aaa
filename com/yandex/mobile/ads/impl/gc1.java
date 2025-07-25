package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes8.dex */
public class gc1 extends IOException {

    /* renamed from: b */
    public final boolean f79595b;

    /* renamed from: c */
    public final int f79596c;

    /* JADX INFO: Access modifiers changed from: protected */
    public gc1(@Nullable String str, @Nullable Exception exc, boolean z, int i) {
        super(str, exc);
        this.f79595b = z;
        this.f79596c = i;
    }

    /* renamed from: a */
    public static gc1 m33884a(@Nullable String str, @Nullable IllegalArgumentException illegalArgumentException) {
        return new gc1(str, illegalArgumentException, true, 0);
    }

    /* renamed from: a */
    public static gc1 m33885a(@Nullable String str, @Nullable Exception exc) {
        return new gc1(str, exc, true, 1);
    }

    /* renamed from: a */
    public static gc1 m33886a(@Nullable String str) {
        return new gc1(str, null, false, 1);
    }
}
