package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class n12 {
    @NotNull

    /* renamed from: a */
    private final String f82522a;

    /* renamed from: b */
    private final long f82523b;

    /* renamed from: c */
    private final int f82524c;
    @NotNull

    /* renamed from: d */
    private final pt1 f82525d;
    @Nullable

    /* renamed from: e */
    private Long f82526e;

    public n12(int i, long j, @NotNull pt1 showNoticeType, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(showNoticeType, "showNoticeType");
        this.f82522a = url;
        this.f82523b = j;
        this.f82524c = i;
        this.f82525d = showNoticeType;
    }

    /* renamed from: a */
    public final long m31714a() {
        return this.f82523b;
    }

    @Nullable
    /* renamed from: b */
    public final Long m31712b() {
        return this.f82526e;
    }

    @NotNull
    /* renamed from: c */
    public final pt1 m31711c() {
        return this.f82525d;
    }

    @NotNull
    /* renamed from: d */
    public final String m31710d() {
        return this.f82522a;
    }

    /* renamed from: e */
    public final int m31709e() {
        return this.f82524c;
    }

    /* renamed from: a */
    public final void m31713a(@Nullable Long l) {
        this.f82526e = l;
    }
}
