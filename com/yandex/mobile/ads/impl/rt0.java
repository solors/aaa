package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes8.dex */
public class rt0 {

    /* renamed from: a */
    public final Object f84878a;

    /* renamed from: b */
    public final int f84879b;

    /* renamed from: c */
    public final int f84880c;

    /* renamed from: d */
    public final long f84881d;

    /* renamed from: e */
    public final int f84882e;

    public rt0(int i, long j, Object obj) {
        this(obj, -1, -1, j, i);
    }

    /* renamed from: a */
    public final rt0 m29953a(Object obj) {
        return this.f84878a.equals(obj) ? this : new rt0(obj, this.f84879b, this.f84880c, this.f84881d, this.f84882e);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt0)) {
            return false;
        }
        rt0 rt0Var = (rt0) obj;
        if (this.f84878a.equals(rt0Var.f84878a) && this.f84879b == rt0Var.f84879b && this.f84880c == rt0Var.f84880c && this.f84881d == rt0Var.f84881d && this.f84882e == rt0Var.f84882e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f84878a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f84879b) * 31) + this.f84880c) * 31) + ((int) this.f84881d)) * 31) + this.f84882e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public rt0(rt0 rt0Var) {
        this.f84878a = rt0Var.f84878a;
        this.f84879b = rt0Var.f84879b;
        this.f84880c = rt0Var.f84880c;
        this.f84881d = rt0Var.f84881d;
        this.f84882e = rt0Var.f84882e;
    }

    /* renamed from: a */
    public final boolean m29954a() {
        return this.f84879b != -1;
    }

    public rt0(Object obj) {
        this(obj, -1L);
    }

    public rt0(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private rt0(Object obj, int i, int i2, long j, int i3) {
        this.f84878a = obj;
        this.f84879b = i;
        this.f84880c = i2;
        this.f84881d = j;
        this.f84882e = i3;
    }

    public rt0(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }
}
