package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.of */
/* loaded from: classes8.dex */
public final class C31034of<T> {
    @NotNull

    /* renamed from: a */
    private final String f83469a;
    @NotNull

    /* renamed from: b */
    private final String f83470b;

    /* renamed from: c */
    private final T f83471c;
    @Nullable

    /* renamed from: d */
    private final xo0 f83472d;

    /* renamed from: e */
    private final boolean f83473e;

    /* renamed from: f */
    private final boolean f83474f;

    public C31034of(@NotNull String name, @NotNull String type, T t, @Nullable xo0 xo0Var, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f83469a = name;
        this.f83470b = type;
        this.f83471c = t;
        this.f83472d = xo0Var;
        this.f83473e = z;
        this.f83474f = z2;
    }

    @Nullable
    /* renamed from: a */
    public final xo0 m31044a() {
        return this.f83472d;
    }

    @NotNull
    /* renamed from: b */
    public final String m31043b() {
        return this.f83469a;
    }

    @NotNull
    /* renamed from: c */
    public final String m31042c() {
        return this.f83470b;
    }

    /* renamed from: d */
    public final T m31041d() {
        return this.f83471c;
    }

    /* renamed from: e */
    public final boolean m31040e() {
        return this.f83473e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31034of)) {
            return false;
        }
        C31034of c31034of = (C31034of) obj;
        if (Intrinsics.m17075f(this.f83469a, c31034of.f83469a) && Intrinsics.m17075f(this.f83470b, c31034of.f83470b) && Intrinsics.m17075f(this.f83471c, c31034of.f83471c) && Intrinsics.m17075f(this.f83472d, c31034of.f83472d) && this.f83473e == c31034of.f83473e && this.f83474f == c31034of.f83474f) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m31039f() {
        return this.f83474f;
    }

    public final int hashCode() {
        int hashCode;
        int m31189a = C31014o3.m31189a(this.f83470b, this.f83469a.hashCode() * 31, 31);
        T t = this.f83471c;
        int i = 0;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        int i2 = (m31189a + hashCode) * 31;
        xo0 xo0Var = this.f83472d;
        if (xo0Var != null) {
            i = xo0Var.hashCode();
        }
        return Boolean.hashCode(this.f83474f) + C31331s6.m29848a(this.f83473e, (i2 + i) * 31, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f83469a;
        String str2 = this.f83470b;
        T t = this.f83471c;
        xo0 xo0Var = this.f83472d;
        boolean z = this.f83473e;
        boolean z2 = this.f83474f;
        return "Asset(name=" + str + ", type=" + str2 + ", value=" + t + ", link=" + xo0Var + ", isClickable=" + z + ", isRequired=" + z2 + ")";
    }
}
