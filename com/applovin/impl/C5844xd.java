package com.applovin.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.impl.xd */
/* loaded from: classes2.dex */
public class C5844xd {

    /* renamed from: a */
    public final Object f12086a;

    /* renamed from: b */
    public final int f12087b;

    /* renamed from: c */
    public final int f12088c;

    /* renamed from: d */
    public final long f12089d;

    /* renamed from: e */
    public final int f12090e;

    /* JADX INFO: Access modifiers changed from: protected */
    public C5844xd(C5844xd c5844xd) {
        this.f12086a = c5844xd.f12086a;
        this.f12087b = c5844xd.f12087b;
        this.f12088c = c5844xd.f12088c;
        this.f12089d = c5844xd.f12089d;
        this.f12090e = c5844xd.f12090e;
    }

    /* renamed from: a */
    public C5844xd m93127a(Object obj) {
        return this.f12086a.equals(obj) ? this : new C5844xd(obj, this.f12087b, this.f12088c, this.f12089d, this.f12090e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5844xd)) {
            return false;
        }
        C5844xd c5844xd = (C5844xd) obj;
        if (this.f12086a.equals(c5844xd.f12086a) && this.f12087b == c5844xd.f12087b && this.f12088c == c5844xd.f12088c && this.f12089d == c5844xd.f12089d && this.f12090e == c5844xd.f12090e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.f12086a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f12087b) * 31) + this.f12088c) * 31) + ((int) this.f12089d)) * 31) + this.f12090e;
    }

    /* renamed from: a */
    public boolean m93128a() {
        return this.f12087b != -1;
    }

    public C5844xd(Object obj) {
        this(obj, -1L);
    }

    public C5844xd(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private C5844xd(Object obj, int i, int i2, long j, int i3) {
        this.f12086a = obj;
        this.f12087b = i;
        this.f12088c = i2;
        this.f12089d = j;
        this.f12090e = i3;
    }

    public C5844xd(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public C5844xd(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
