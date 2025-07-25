package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class it1 {
    @Nullable

    /* renamed from: a */
    private final String f80623a;
    @Nullable

    /* renamed from: b */
    private final Long f80624b;

    /* renamed from: c */
    private final boolean f80625c;

    /* renamed from: d */
    private final boolean f80626d;
    @Nullable

    /* renamed from: e */
    private final pu1 f80627e;

    public it1(@Nullable String str, @Nullable Long l, boolean z, boolean z2, @Nullable pu1 pu1Var) {
        this.f80623a = str;
        this.f80624b = l;
        this.f80625c = z;
        this.f80626d = z2;
        this.f80627e = pu1Var;
    }

    @Nullable
    /* renamed from: a */
    public final pu1 m33118a() {
        return this.f80627e;
    }

    @Nullable
    /* renamed from: b */
    public final Long m33117b() {
        return this.f80624b;
    }

    /* renamed from: c */
    public final boolean m33116c() {
        return this.f80626d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it1)) {
            return false;
        }
        it1 it1Var = (it1) obj;
        if (Intrinsics.m17075f(this.f80623a, it1Var.f80623a) && Intrinsics.m17075f(this.f80624b, it1Var.f80624b) && this.f80625c == it1Var.f80625c && this.f80626d == it1Var.f80626d && Intrinsics.m17075f(this.f80627e, it1Var.f80627e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.f80623a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Long l = this.f80624b;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int m29848a = C31331s6.m29848a(this.f80626d, C31331s6.m29848a(this.f80625c, (i2 + hashCode2) * 31, 31), 31);
        pu1 pu1Var = this.f80627e;
        if (pu1Var != null) {
            i = pu1Var.hashCode();
        }
        return m29848a + i;
    }

    @NotNull
    public final String toString() {
        String str = this.f80623a;
        Long l = this.f80624b;
        boolean z = this.f80625c;
        boolean z2 = this.f80626d;
        pu1 pu1Var = this.f80627e;
        return "Settings(templateType=" + str + ", multiBannerAutoScrollInterval=" + l + ", isHighlightingEnabled=" + z + ", isLoopingVideo=" + z2 + ", mediaAssetImageFallbackSize=" + pu1Var + ")";
    }
}
