package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class bh0 {

    /* renamed from: a */
    private final int f77297a;

    /* renamed from: b */
    private final int f77298b;
    @NotNull

    /* renamed from: c */
    private final String f77299c;
    @Nullable

    /* renamed from: d */
    private final String f77300d;
    @Nullable

    /* renamed from: e */
    private final aw1 f77301e;

    /* renamed from: f */
    private final boolean f77302f;
    @Nullable

    /* renamed from: g */
    private final String f77303g;

    public /* synthetic */ bh0(int i, int i2, String str, String str2, int i3) {
        this(i, i2, str, (i3 & 8) != 0 ? null : str2, null, true, null);
    }

    /* renamed from: a */
    public final int m35475a() {
        return this.f77298b;
    }

    /* renamed from: b */
    public final boolean m35474b() {
        return this.f77302f;
    }

    @Nullable
    /* renamed from: c */
    public final String m35473c() {
        return this.f77303g;
    }

    @Nullable
    /* renamed from: d */
    public final String m35472d() {
        return this.f77300d;
    }

    @Nullable
    /* renamed from: e */
    public final aw1 m35471e() {
        return this.f77301e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh0)) {
            return false;
        }
        bh0 bh0Var = (bh0) obj;
        if (this.f77297a == bh0Var.f77297a && this.f77298b == bh0Var.f77298b && Intrinsics.m17075f(this.f77299c, bh0Var.f77299c) && Intrinsics.m17075f(this.f77300d, bh0Var.f77300d) && Intrinsics.m17075f(this.f77301e, bh0Var.f77301e) && this.f77302f == bh0Var.f77302f && Intrinsics.m17075f(this.f77303g, bh0Var.f77303g)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final String m35470f() {
        return this.f77299c;
    }

    /* renamed from: g */
    public final int m35469g() {
        return this.f77297a;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int m31189a = C31014o3.m31189a(this.f77299c, nt1.m31295a(this.f77298b, Integer.hashCode(this.f77297a) * 31, 31), 31);
        String str = this.f77300d;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (m31189a + hashCode) * 31;
        aw1 aw1Var = this.f77301e;
        if (aw1Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aw1Var.hashCode();
        }
        int m29848a = C31331s6.m29848a(this.f77302f, (i2 + hashCode2) * 31, 31);
        String str2 = this.f77303g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return m29848a + i;
    }

    @NotNull
    public final String toString() {
        int i = this.f77297a;
        int i2 = this.f77298b;
        String str = this.f77299c;
        String str2 = this.f77300d;
        aw1 aw1Var = this.f77301e;
        boolean z = this.f77302f;
        String str3 = this.f77303g;
        return "ImageValue(width=" + i + ", height=" + i2 + ", url=" + str + ", sizeType=" + str2 + ", smartCenterSettings=" + aw1Var + ", preload=" + z + ", preview=" + str3 + ")";
    }

    public bh0(int i, int i2, @NotNull String url, @Nullable String str, @Nullable aw1 aw1Var, boolean z, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f77297a = i;
        this.f77298b = i2;
        this.f77299c = url;
        this.f77300d = str;
        this.f77301e = aw1Var;
        this.f77302f = z;
        this.f77303g = str2;
    }
}
