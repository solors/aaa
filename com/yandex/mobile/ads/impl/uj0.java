package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class uj0 {
    @NotNull

    /* renamed from: a */
    private final List<df1> f86298a;
    @Nullable

    /* renamed from: b */
    private final C31920yr f86299b;
    @Nullable

    /* renamed from: c */
    private final C31920yr f86300c;

    public uj0(@NotNull ArrayList midrollItems, @Nullable C31920yr c31920yr, @Nullable C31920yr c31920yr2) {
        Intrinsics.checkNotNullParameter(midrollItems, "midrollItems");
        this.f86298a = midrollItems;
        this.f86299b = c31920yr;
        this.f86300c = c31920yr2;
    }

    @NotNull
    /* renamed from: a */
    public final List<df1> m28755a() {
        return this.f86298a;
    }

    @Nullable
    /* renamed from: b */
    public final C31920yr m28754b() {
        return this.f86300c;
    }

    @Nullable
    /* renamed from: c */
    public final C31920yr m28753c() {
        return this.f86299b;
    }
}
