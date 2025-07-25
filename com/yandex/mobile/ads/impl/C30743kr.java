package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.kr */
/* loaded from: classes8.dex */
public final class C30743kr {
    @NotNull

    /* renamed from: a */
    private final String f81531a;
    @Nullable

    /* renamed from: b */
    private final C31727w8 f81532b;
    @Nullable

    /* renamed from: c */
    private final String f81533c;

    public C30743kr(@NotNull String adUnitId, @Nullable C31727w8 c31727w8, @Nullable String str) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f81531a = adUnitId;
        this.f81532b = c31727w8;
        this.f81533c = str;
    }

    @Nullable
    /* renamed from: a */
    public final C31727w8 m32462a() {
        return this.f81532b;
    }

    @NotNull
    /* renamed from: b */
    public final String m32461b() {
        return this.f81531a;
    }

    @Nullable
    /* renamed from: c */
    public final String m32460c() {
        return this.f81533c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30743kr)) {
            return false;
        }
        C30743kr c30743kr = (C30743kr) obj;
        if (Intrinsics.m17075f(this.f81531a, c30743kr.f81531a) && Intrinsics.m17075f(this.f81532b, c30743kr.f81532b) && Intrinsics.m17075f(this.f81533c, c30743kr.f81533c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f81531a.hashCode() * 31;
        C31727w8 c31727w8 = this.f81532b;
        int i = 0;
        if (c31727w8 == null) {
            hashCode = 0;
        } else {
            hashCode = c31727w8.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str = this.f81533c;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        String str = this.f81531a;
        C31727w8 c31727w8 = this.f81532b;
        String str2 = this.f81533c;
        return "CoreAdInfo(adUnitId=" + str + ", adSize=" + c31727w8 + ", data=" + str2 + ")";
    }
}
