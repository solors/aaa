package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.tj */
/* loaded from: classes8.dex */
public abstract class AbstractC31461tj implements pk1, qk1 {

    /* renamed from: b */
    private final int f85715b;
    @Nullable

    /* renamed from: d */
    private rk1 f85717d;

    /* renamed from: e */
    private int f85718e;

    /* renamed from: f */
    private le1 f85719f;

    /* renamed from: g */
    private int f85720g;
    @Nullable

    /* renamed from: h */
    private ap1 f85721h;
    @Nullable

    /* renamed from: i */
    private v90[] f85722i;

    /* renamed from: j */
    private long f85723j;

    /* renamed from: l */
    private boolean f85725l;

    /* renamed from: m */
    private boolean f85726m;

    /* renamed from: c */
    private final w90 f85716c = new w90();

    /* renamed from: k */
    private long f85724k = Long.MIN_VALUE;

    public AbstractC31461tj(int i) {
        this.f85715b = i;
    }

    @Override // com.yandex.mobile.ads.impl.me1.InterfaceC30845b
    /* renamed from: a */
    public void mo27835a(int i, @Nullable Object obj) throws a40 {
    }

    /* renamed from: a */
    protected abstract void mo27832a(long j, boolean z) throws a40;

    /* renamed from: a */
    protected abstract void mo27870a(v90[] v90VarArr, long j, long j2) throws a40;

    @Override // com.yandex.mobile.ads.impl.pk1
    /* renamed from: b */
    public final void mo29137b() {
        if (this.f85720g == 0) {
            w90 w90Var = this.f85716c;
            w90Var.f87160a = null;
            w90Var.f87161b = null;
            mo27801v();
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.pk1
    /* renamed from: c */
    public final void mo29135c() {
        if (this.f85720g == 1) {
            w90 w90Var = this.f85716c;
            w90Var.f87160a = null;
            w90Var.f87161b = null;
            this.f85720g = 0;
            this.f85721h = null;
            this.f85722i = null;
            this.f85725l = false;
            mo27802u();
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.pk1
    /* renamed from: e */
    public final boolean mo29134e() {
        if (this.f85724k == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo29133f() throws a40 {
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.pk1
    @Nullable
    /* renamed from: g */
    public final ap1 mo29132g() {
        return this.f85721h;
    }

    @Override // com.yandex.mobile.ads.impl.pk1
    public final int getState() {
        return this.f85720g;
    }

    @Override // com.yandex.mobile.ads.impl.pk1
    /* renamed from: h */
    public final void mo29131h() {
        this.f85725l = true;
    }

    @Override // com.yandex.mobile.ads.impl.pk1
    /* renamed from: i */
    public final void mo29130i() throws IOException {
        ap1 ap1Var = this.f85721h;
        ap1Var.getClass();
        ap1Var.mo26166a();
    }

    @Override // com.yandex.mobile.ads.impl.pk1
    /* renamed from: j */
    public final long mo29129j() {
        return this.f85724k;
    }

    @Override // com.yandex.mobile.ads.impl.pk1
    /* renamed from: k */
    public final boolean mo29128k() {
        return this.f85725l;
    }

    @Override // com.yandex.mobile.ads.impl.pk1
    @Nullable
    /* renamed from: l */
    public gs0 mo29127l() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.pk1
    /* renamed from: m */
    public final int mo29126m() {
        return this.f85715b;
    }

    /* renamed from: p */
    public final rk1 m29124p() {
        rk1 rk1Var = this.f85717d;
        rk1Var.getClass();
        return rk1Var;
    }

    /* renamed from: q */
    public final w90 m29123q() {
        w90 w90Var = this.f85716c;
        w90Var.f87160a = null;
        w90Var.f87161b = null;
        return w90Var;
    }

    /* renamed from: r */
    public final le1 m29122r() {
        le1 le1Var = this.f85719f;
        le1Var.getClass();
        return le1Var;
    }

    /* renamed from: s */
    public final v90[] m29121s() {
        v90[] v90VarArr = this.f85722i;
        v90VarArr.getClass();
        return v90VarArr;
    }

    @Override // com.yandex.mobile.ads.impl.pk1
    public final void start() throws a40 {
        if (this.f85720g == 1) {
            this.f85720g = 2;
            mo27800w();
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.pk1
    public final void stop() {
        if (this.f85720g == 2) {
            this.f85720g = 1;
            mo27799x();
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: t */
    public final boolean m29120t() {
        if (mo29134e()) {
            return this.f85725l;
        }
        ap1 ap1Var = this.f85721h;
        ap1Var.getClass();
        return ap1Var.mo26162d();
    }

    /* renamed from: u */
    protected abstract void mo27802u();

    /* renamed from: a */
    protected void mo27813a(boolean z, boolean z2) throws a40 {
    }

    /* renamed from: a */
    public final a40 m29143a(int i, @Nullable v90 v90Var, Exception exc, boolean z) {
        int i2;
        if (v90Var != null && !this.f85726m) {
            this.f85726m = true;
            try {
                i2 = mo27871a(v90Var) & 7;
            } catch (a40 unused) {
            } finally {
                this.f85726m = false;
            }
            return a40.m35971a(exc, getName(), this.f85718e, v90Var, i2, z, i);
        }
        i2 = 4;
        return a40.m35971a(exc, getName(), this.f85718e, v90Var, i2, z, i);
    }

    /* renamed from: b */
    public final int m29136b(long j) {
        ap1 ap1Var = this.f85721h;
        ap1Var.getClass();
        return ap1Var.mo26165a(j - this.f85723j);
    }

    /* renamed from: a */
    public final a40 m29139a(Exception exc, @Nullable v90 v90Var, int i) {
        return m29143a(i, v90Var, exc, false);
    }

    @Override // com.yandex.mobile.ads.impl.pk1
    /* renamed from: a */
    public final void mo29141a(rk1 rk1Var, v90[] v90VarArr, ap1 ap1Var, long j, boolean z, boolean z2, long j2, long j3) throws a40 {
        if (this.f85720g == 0) {
            this.f85717d = rk1Var;
            this.f85720g = 1;
            mo27813a(z, z2);
            mo29138a(v90VarArr, ap1Var, j2, j3);
            this.f85725l = false;
            this.f85724k = j;
            mo27832a(j, z);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.pk1
    /* renamed from: n */
    public final AbstractC31461tj mo29125n() {
        return this;
    }

    /* renamed from: v */
    protected void mo27801v() {
    }

    /* renamed from: w */
    protected void mo27800w() throws a40 {
    }

    /* renamed from: x */
    protected void mo27799x() {
    }

    @Override // com.yandex.mobile.ads.impl.pk1
    /* renamed from: a */
    public final void mo29144a(int i, le1 le1Var) {
        this.f85718e = i;
        this.f85719f = le1Var;
    }

    @Override // com.yandex.mobile.ads.impl.pk1
    /* renamed from: a */
    public boolean mo28095a() {
        return mo29134e();
    }

    /* renamed from: a */
    public final int m29140a(w90 w90Var, C30423gx c30423gx, int i) {
        ap1 ap1Var = this.f85721h;
        ap1Var.getClass();
        int mo26164a = ap1Var.mo26164a(w90Var, c30423gx, i);
        if (mo26164a == -4) {
            if (c30423gx.m34134f()) {
                this.f85724k = Long.MIN_VALUE;
                return this.f85725l ? -4 : -3;
            }
            long j = c30423gx.f79795f + this.f85723j;
            c30423gx.f79795f = j;
            this.f85724k = Math.max(this.f85724k, j);
        } else if (mo26164a == -5) {
            v90 v90Var = w90Var.f87161b;
            v90Var.getClass();
            if (v90Var.f86627q != Long.MAX_VALUE) {
                w90Var.f87161b = v90Var.m28486a().m28451a(v90Var.f86627q + this.f85723j).m28454a();
            }
        }
        return mo26164a;
    }

    @Override // com.yandex.mobile.ads.impl.pk1
    /* renamed from: a */
    public final void mo29138a(v90[] v90VarArr, ap1 ap1Var, long j, long j2) throws a40 {
        if (!this.f85725l) {
            this.f85721h = ap1Var;
            if (this.f85724k == Long.MIN_VALUE) {
                this.f85724k = j;
            }
            this.f85722i = v90VarArr;
            this.f85723j = j2;
            mo27870a(v90VarArr, j, j2);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.pk1
    /* renamed from: a */
    public final void mo29142a(long j) throws a40 {
        this.f85725l = false;
        this.f85724k = j;
        mo27832a(j, false);
    }
}
