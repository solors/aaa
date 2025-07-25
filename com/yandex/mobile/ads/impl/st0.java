package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.vt0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class st0 {

    /* renamed from: a */
    public final vt0.C31682b f85373a;

    /* renamed from: b */
    public final long f85374b;

    /* renamed from: c */
    public final long f85375c;

    /* renamed from: d */
    public final long f85376d;

    /* renamed from: e */
    public final long f85377e;

    /* renamed from: f */
    public final boolean f85378f;

    /* renamed from: g */
    public final boolean f85379g;

    /* renamed from: h */
    public final boolean f85380h;

    /* renamed from: i */
    public final boolean f85381i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public st0(vt0.C31682b c31682b, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        boolean z7 = false;
        if (z4 && !z2) {
            z5 = false;
        } else {
            z5 = true;
        }
        C30937nf.m31567a(z5);
        if (z3 && !z2) {
            z6 = false;
        } else {
            z6 = true;
        }
        C30937nf.m31567a(z6);
        if (!z || (!z2 && !z3 && !z4)) {
            z7 = true;
        }
        C30937nf.m31567a(z7);
        this.f85373a = c31682b;
        this.f85374b = j;
        this.f85375c = j2;
        this.f85376d = j3;
        this.f85377e = j4;
        this.f85378f = z;
        this.f85379g = z2;
        this.f85380h = z3;
        this.f85381i = z4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || st0.class != obj.getClass()) {
            return false;
        }
        st0 st0Var = (st0) obj;
        if (this.f85374b == st0Var.f85374b && this.f85375c == st0Var.f85375c && this.f85376d == st0Var.f85376d && this.f85377e == st0Var.f85377e && this.f85378f == st0Var.f85378f && this.f85379g == st0Var.f85379g && this.f85380h == st0Var.f85380h && this.f85381i == st0Var.f85381i && y32.m27076a(this.f85373a, st0Var.f85373a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f85373a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f85374b)) * 31) + ((int) this.f85375c)) * 31) + ((int) this.f85376d)) * 31) + ((int) this.f85377e)) * 31) + (this.f85378f ? 1 : 0)) * 31) + (this.f85379g ? 1 : 0)) * 31) + (this.f85380h ? 1 : 0)) * 31) + (this.f85381i ? 1 : 0);
    }
}
