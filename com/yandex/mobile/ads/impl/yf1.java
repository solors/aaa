package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class yf1 {
    @NotNull

    /* renamed from: a */
    private final String f88189a;
    @NotNull

    /* renamed from: b */
    private final String f88190b;
    @Nullable

    /* renamed from: c */
    private final Map<String, Object> f88191c;
    @Nullable

    /* renamed from: d */
    private final Integer f88192d;

    public yf1(@NotNull String packageName, @NotNull String url, @Nullable LinkedHashMap linkedHashMap, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f88189a = packageName;
        this.f88190b = url;
        this.f88191c = linkedHashMap;
        this.f88192d = num;
    }

    @Nullable
    /* renamed from: a */
    public final Map<String, Object> m26933a() {
        return this.f88191c;
    }

    @Nullable
    /* renamed from: b */
    public final Integer m26932b() {
        return this.f88192d;
    }

    @NotNull
    /* renamed from: c */
    public final String m26931c() {
        return this.f88189a;
    }

    @NotNull
    /* renamed from: d */
    public final String m26930d() {
        return this.f88190b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf1)) {
            return false;
        }
        yf1 yf1Var = (yf1) obj;
        if (Intrinsics.m17075f(this.f88189a, yf1Var.f88189a) && Intrinsics.m17075f(this.f88190b, yf1Var.f88190b) && Intrinsics.m17075f(this.f88191c, yf1Var.f88191c) && Intrinsics.m17075f(this.f88192d, yf1Var.f88192d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int m31189a = C31014o3.m31189a(this.f88190b, this.f88189a.hashCode() * 31, 31);
        Map<String, Object> map = this.f88191c;
        int i = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i2 = (m31189a + hashCode) * 31;
        Integer num = this.f88192d;
        if (num != null) {
            i = num.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        String str = this.f88189a;
        String str2 = this.f88190b;
        Map<String, Object> map = this.f88191c;
        Integer num = this.f88192d;
        return "PreferredPackage(packageName=" + str + ", url=" + str2 + ", extras=" + map + ", flags=" + num + ")";
    }
}
