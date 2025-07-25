package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class aw1 {
    @Nullable

    /* renamed from: a */
    private final String f76928a;
    @Nullable

    /* renamed from: b */
    private final String f76929b;
    @Nullable

    /* renamed from: c */
    private final String f76930c;
    @Nullable

    /* renamed from: d */
    private final String f76931d;
    @Nullable

    /* renamed from: e */
    private final C31896yh f76932e;
    @Nullable

    /* renamed from: f */
    private final sv1 f76933f;
    @Nullable

    /* renamed from: g */
    private final List<sv1> f76934g;

    public aw1() {
        this(0);
    }

    @Nullable
    /* renamed from: a */
    public final C31896yh m35753a() {
        return this.f76932e;
    }

    @Nullable
    /* renamed from: b */
    public final sv1 m35752b() {
        return this.f76933f;
    }

    @Nullable
    /* renamed from: c */
    public final List<sv1> m35751c() {
        return this.f76934g;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw1)) {
            return false;
        }
        aw1 aw1Var = (aw1) obj;
        if (Intrinsics.m17075f(this.f76928a, aw1Var.f76928a) && Intrinsics.m17075f(this.f76929b, aw1Var.f76929b) && Intrinsics.m17075f(this.f76930c, aw1Var.f76930c) && Intrinsics.m17075f(this.f76931d, aw1Var.f76931d) && Intrinsics.m17075f(this.f76932e, aw1Var.f76932e) && Intrinsics.m17075f(this.f76933f, aw1Var.f76933f) && Intrinsics.m17075f(this.f76934g, aw1Var.f76934g)) {
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
        int hashCode6;
        String str = this.f76928a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.f76929b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.f76930c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.f76931d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        C31896yh c31896yh = this.f76932e;
        if (c31896yh == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c31896yh.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        sv1 sv1Var = this.f76933f;
        if (sv1Var == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = sv1Var.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        List<sv1> list = this.f76934g;
        if (list != null) {
            i = list.hashCode();
        }
        return i7 + i;
    }

    @NotNull
    public final String toString() {
        String str = this.f76928a;
        String str2 = this.f76929b;
        String str3 = this.f76930c;
        String str4 = this.f76931d;
        C31896yh c31896yh = this.f76932e;
        sv1 sv1Var = this.f76933f;
        List<sv1> list = this.f76934g;
        return "SmartCenterSettings(colorWizButton=" + str + ", colorWizButtonText=" + str2 + ", colorWizBack=" + str3 + ", colorWizBackRight=" + str4 + ", backgroundColors=" + c31896yh + ", smartCenter=" + sv1Var + ", smartCenters=" + list + ")";
    }

    public /* synthetic */ aw1(int i) {
        this(null, null, null, null, null, null, null);
    }

    public aw1(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable C31896yh c31896yh, @Nullable sv1 sv1Var, @Nullable List<sv1> list) {
        this.f76928a = str;
        this.f76929b = str2;
        this.f76930c = str3;
        this.f76931d = str4;
        this.f76932e = c31896yh;
        this.f76933f = sv1Var;
        this.f76934g = list;
    }
}
