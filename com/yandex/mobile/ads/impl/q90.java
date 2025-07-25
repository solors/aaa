package com.yandex.mobile.ads.impl;

import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class q90 {
    @Nullable

    /* renamed from: a */
    private final Typeface f84259a;
    @Nullable

    /* renamed from: b */
    private final Typeface f84260b;
    @Nullable

    /* renamed from: c */
    private final Typeface f84261c;
    @Nullable

    /* renamed from: d */
    private final Typeface f84262d;

    public q90(@Nullable Typeface typeface, @Nullable Typeface typeface2, @Nullable Typeface typeface3, @Nullable Typeface typeface4) {
        this.f84259a = typeface;
        this.f84260b = typeface2;
        this.f84261c = typeface3;
        this.f84262d = typeface4;
    }

    @Nullable
    /* renamed from: a */
    public final Typeface m30442a() {
        return this.f84262d;
    }

    @Nullable
    /* renamed from: b */
    public final Typeface m30441b() {
        return this.f84259a;
    }

    @Nullable
    /* renamed from: c */
    public final Typeface m30440c() {
        return this.f84261c;
    }

    @Nullable
    /* renamed from: d */
    public final Typeface m30439d() {
        return this.f84260b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q90)) {
            return false;
        }
        q90 q90Var = (q90) obj;
        if (Intrinsics.m17075f(this.f84259a, q90Var.f84259a) && Intrinsics.m17075f(this.f84260b, q90Var.f84260b) && Intrinsics.m17075f(this.f84261c, q90Var.f84261c) && Intrinsics.m17075f(this.f84262d, q90Var.f84262d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Typeface typeface = this.f84259a;
        int i = 0;
        if (typeface == null) {
            hashCode = 0;
        } else {
            hashCode = typeface.hashCode();
        }
        int i2 = hashCode * 31;
        Typeface typeface2 = this.f84260b;
        if (typeface2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = typeface2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Typeface typeface3 = this.f84261c;
        if (typeface3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = typeface3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Typeface typeface4 = this.f84262d;
        if (typeface4 != null) {
            i = typeface4.hashCode();
        }
        return i4 + i;
    }

    @NotNull
    public final String toString() {
        Typeface typeface = this.f84259a;
        Typeface typeface2 = this.f84260b;
        Typeface typeface3 = this.f84261c;
        Typeface typeface4 = this.f84262d;
        return "FontTypefaceData(light=" + typeface + ", regular=" + typeface2 + ", medium=" + typeface3 + ", bold=" + typeface4 + ")";
    }
}
