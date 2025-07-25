package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class hb0 {
    @NotNull

    /* renamed from: a */
    private final String f80017a;
    @Nullable

    /* renamed from: b */
    private final String f80018b;
    @Nullable

    /* renamed from: c */
    private final String f80019c;
    @Nullable

    /* renamed from: d */
    private final String f80020d;
    @Nullable

    /* renamed from: e */
    private final List<String> f80021e;
    @Nullable

    /* renamed from: f */
    private final Map<String, String> f80022f;
    @Nullable

    /* renamed from: g */
    private final fm1 f80023g;

    public hb0(@NotNull String adUnitId, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, @Nullable Map<String, String> map, @Nullable fm1 fm1Var) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f80017a = adUnitId;
        this.f80018b = str;
        this.f80019c = str2;
        this.f80020d = str3;
        this.f80021e = list;
        this.f80022f = map;
        this.f80023g = fm1Var;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb0)) {
            return false;
        }
        hb0 hb0Var = (hb0) obj;
        if (Intrinsics.m17075f(this.f80017a, hb0Var.f80017a) && Intrinsics.m17075f(this.f80018b, hb0Var.f80018b) && Intrinsics.m17075f(this.f80019c, hb0Var.f80019c) && Intrinsics.m17075f(this.f80020d, hb0Var.f80020d) && Intrinsics.m17075f(this.f80021e, hb0Var.f80021e) && Intrinsics.m17075f(this.f80022f, hb0Var.f80022f) && this.f80023g == hb0Var.f80023g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.f80017a.hashCode() * 31;
        String str = this.f80018b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode6 + hashCode) * 31;
        String str2 = this.f80019c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.f80020d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        List<String> list = this.f80021e;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Map<String, String> map = this.f80022f;
        if (map == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = map.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        fm1 fm1Var = this.f80023g;
        if (fm1Var != null) {
            i = fm1Var.hashCode();
        }
        return i6 + i;
    }

    @NotNull
    public final String toString() {
        String str = this.f80017a;
        String str2 = this.f80018b;
        String str3 = this.f80019c;
        String str4 = this.f80020d;
        List<String> list = this.f80021e;
        Map<String, String> map = this.f80022f;
        fm1 fm1Var = this.f80023g;
        return "FullscreenCacheParams(adUnitId=" + str + ", age=" + str2 + ", gender=" + str3 + ", contextQuery=" + str4 + ", contextTags=" + list + ", parameters=" + map + ", preferredTheme=" + fm1Var + ")";
    }
}
