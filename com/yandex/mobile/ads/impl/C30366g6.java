package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.g6 */
/* loaded from: classes8.dex */
public final class C30366g6 {
    @Nullable

    /* renamed from: a */
    private final ev1 f79526a;
    @Nullable

    /* renamed from: b */
    private final gv1 f79527b;

    /* renamed from: c */
    private final long f79528c;

    public C30366g6(@Nullable ev1 ev1Var, @Nullable gv1 gv1Var, long j) {
        this.f79526a = ev1Var;
        this.f79527b = gv1Var;
        this.f79528c = j;
    }

    /* renamed from: a */
    public final long m33918a() {
        return this.f79528c;
    }

    @Nullable
    /* renamed from: b */
    public final ev1 m33917b() {
        return this.f79526a;
    }

    @Nullable
    /* renamed from: c */
    public final gv1 m33916c() {
        return this.f79527b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30366g6)) {
            return false;
        }
        C30366g6 c30366g6 = (C30366g6) obj;
        if (this.f79526a == c30366g6.f79526a && this.f79527b == c30366g6.f79527b && this.f79528c == c30366g6.f79528c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        ev1 ev1Var = this.f79526a;
        int i = 0;
        if (ev1Var == null) {
            hashCode = 0;
        } else {
            hashCode = ev1Var.hashCode();
        }
        int i2 = hashCode * 31;
        gv1 gv1Var = this.f79527b;
        if (gv1Var != null) {
            i = gv1Var.hashCode();
        }
        return Long.hashCode(this.f79528c) + ((i2 + i) * 31);
    }

    @NotNull
    public final String toString() {
        ev1 ev1Var = this.f79526a;
        gv1 gv1Var = this.f79527b;
        long j = this.f79528c;
        return "AdPodSkip(transitionStrategy=" + ev1Var + ", visibility=" + gv1Var + ", delay=" + j + ")";
    }
}
