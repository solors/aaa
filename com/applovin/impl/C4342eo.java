package com.applovin.impl;

import java.util.Arrays;

/* renamed from: com.applovin.impl.eo */
/* loaded from: classes2.dex */
public final class C4342eo {

    /* renamed from: a */
    private long[] f5948a;

    /* renamed from: b */
    private Object[] f5949b;

    /* renamed from: c */
    private int f5950c;

    /* renamed from: d */
    private int f5951d;

    public C4342eo() {
        this(10);
    }

    /* renamed from: b */
    private void m99472b(long j, Object obj) {
        int i = this.f5950c;
        int i2 = this.f5951d;
        Object[] objArr = this.f5949b;
        int length = (i + i2) % objArr.length;
        this.f5948a[length] = j;
        objArr[length] = obj;
        this.f5951d = i2 + 1;
    }

    /* renamed from: d */
    private Object m99469d() {
        boolean z;
        if (this.f5951d > 0) {
            z = true;
        } else {
            z = false;
        }
        AbstractC4100b1.m100577b(z);
        Object[] objArr = this.f5949b;
        int i = this.f5950c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f5950c = (i + 1) % objArr.length;
        this.f5951d--;
        return obj;
    }

    /* renamed from: a */
    public synchronized void m99476a(long j, Object obj) {
        m99477a(j);
        m99474b();
        m99472b(j, obj);
    }

    /* renamed from: c */
    public synchronized Object m99471c() {
        return this.f5951d == 0 ? null : m99469d();
    }

    /* renamed from: e */
    public synchronized int m99468e() {
        return this.f5951d;
    }

    public C4342eo(int i) {
        this.f5948a = new long[i];
        this.f5949b = m99478a(i);
    }

    /* renamed from: c */
    public synchronized Object m99470c(long j) {
        return m99475a(j, true);
    }

    /* renamed from: a */
    public synchronized void m99479a() {
        this.f5950c = 0;
        this.f5951d = 0;
        Arrays.fill(this.f5949b, (Object) null);
    }

    /* renamed from: b */
    private void m99474b() {
        int length = this.f5949b.length;
        if (this.f5951d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] m99478a = m99478a(i);
        int i2 = this.f5950c;
        int i3 = length - i2;
        System.arraycopy(this.f5948a, i2, jArr, 0, i3);
        System.arraycopy(this.f5949b, this.f5950c, m99478a, 0, i3);
        int i4 = this.f5950c;
        if (i4 > 0) {
            System.arraycopy(this.f5948a, 0, jArr, i3, i4);
            System.arraycopy(this.f5949b, 0, m99478a, i3, this.f5950c);
        }
        this.f5948a = jArr;
        this.f5949b = m99478a;
        this.f5950c = 0;
    }

    /* renamed from: a */
    private void m99477a(long j) {
        int i = this.f5951d;
        if (i > 0) {
            if (j <= this.f5948a[((this.f5950c + i) - 1) % this.f5949b.length]) {
                m99479a();
            }
        }
    }

    /* renamed from: a */
    private static Object[] m99478a(int i) {
        return new Object[i];
    }

    /* renamed from: a */
    private Object m99475a(long j, boolean z) {
        Object obj = null;
        long j2 = Long.MAX_VALUE;
        while (this.f5951d > 0) {
            long j3 = j - this.f5948a[this.f5950c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            obj = m99469d();
            j2 = j3;
        }
        return obj;
    }

    /* renamed from: b */
    public synchronized Object m99473b(long j) {
        return m99475a(j, false);
    }
}
