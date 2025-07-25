package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class y52 {
    @NotNull

    /* renamed from: a */
    private final List<m62<u71>> f88070a;
    @Nullable

    /* renamed from: b */
    private final ga2 f88071b;
    @Nullable

    /* renamed from: c */
    private final bh0 f88072c;

    public y52(@NotNull ArrayList videoAdsInfo, @Nullable ga2 ga2Var, @Nullable bh0 bh0Var) {
        Intrinsics.checkNotNullParameter(videoAdsInfo, "videoAdsInfo");
        this.f88070a = videoAdsInfo;
        this.f88071b = ga2Var;
        this.f88072c = bh0Var;
    }

    @Nullable
    /* renamed from: a */
    public final bh0 m27027a() {
        return this.f88072c;
    }

    @NotNull
    /* renamed from: b */
    public final m62<u71> m27026b() {
        Object m17531p0;
        m17531p0 = _Collections.m17531p0(this.f88070a);
        return (m62) m17531p0;
    }

    @NotNull
    /* renamed from: c */
    public final List<m62<u71>> m27025c() {
        return this.f88070a;
    }

    @Nullable
    /* renamed from: d */
    public final ga2 m27024d() {
        return this.f88071b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y52)) {
            return false;
        }
        y52 y52Var = (y52) obj;
        if (Intrinsics.m17075f(this.f88070a, y52Var.f88070a) && Intrinsics.m17075f(this.f88071b, y52Var.f88071b) && Intrinsics.m17075f(this.f88072c, y52Var.f88072c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f88070a.hashCode() * 31;
        ga2 ga2Var = this.f88071b;
        int i = 0;
        if (ga2Var == null) {
            hashCode = 0;
        } else {
            hashCode = ga2Var.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        bh0 bh0Var = this.f88072c;
        if (bh0Var != null) {
            i = bh0Var.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        List<m62<u71>> list = this.f88070a;
        ga2 ga2Var = this.f88071b;
        bh0 bh0Var = this.f88072c;
        return "Video(videoAdsInfo=" + list + ", videoSettings=" + ga2Var + ", preview=" + bh0Var + ")";
    }
}
