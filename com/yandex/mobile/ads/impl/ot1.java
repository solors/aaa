package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ot1 {

    /* renamed from: a */
    private final long f83604a;
    @Nullable

    /* renamed from: b */
    private final String f83605b;

    /* renamed from: c */
    private final int f83606c;
    @NotNull

    /* renamed from: d */
    private final pt1 f83607d;

    public ot1() {
        this(0);
    }

    /* renamed from: a */
    public final long m30888a() {
        return this.f83604a;
    }

    @NotNull
    /* renamed from: b */
    public final pt1 m30887b() {
        return this.f83607d;
    }

    @Nullable
    /* renamed from: c */
    public final String m30886c() {
        return this.f83605b;
    }

    /* renamed from: d */
    public final int m30885d() {
        return this.f83606c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot1)) {
            return false;
        }
        ot1 ot1Var = (ot1) obj;
        if (this.f83604a == ot1Var.f83604a && Intrinsics.m17075f(this.f83605b, ot1Var.f83605b) && this.f83606c == ot1Var.f83606c && this.f83607d == ot1Var.f83607d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.f83604a) * 31;
        String str = this.f83605b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f83607d.hashCode() + nt1.m31295a(this.f83606c, (hashCode2 + hashCode) * 31, 31);
    }

    @NotNull
    public final String toString() {
        long j = this.f83604a;
        String str = this.f83605b;
        int i = this.f83606c;
        pt1 pt1Var = this.f83607d;
        return "ShowNotice(delay=" + j + ", url=" + str + ", visibilityPercent=" + i + ", type=" + pt1Var + ")";
    }

    public /* synthetic */ ot1(int i) {
        this(0, 0L, pt1.f84075d, null);
    }

    public ot1(int i, long j, @NotNull pt1 type, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f83604a = j;
        this.f83605b = str;
        this.f83606c = i;
        this.f83607d = type;
    }
}
