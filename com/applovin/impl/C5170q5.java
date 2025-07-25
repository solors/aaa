package com.applovin.impl;

import java.util.Arrays;

/* renamed from: com.applovin.impl.q5 */
/* loaded from: classes2.dex */
public final class C5170q5 implements InterfaceC4982n0 {

    /* renamed from: a */
    private final boolean f9143a;

    /* renamed from: b */
    private final int f9144b;

    /* renamed from: c */
    private final byte[] f9145c;

    /* renamed from: d */
    private final C4803m0[] f9146d;

    /* renamed from: e */
    private int f9147e;

    /* renamed from: f */
    private int f9148f;

    /* renamed from: g */
    private int f9149g;

    /* renamed from: h */
    private C4803m0[] f9150h;

    public C5170q5(boolean z, int i) {
        this(z, i, 0);
    }

    @Override // com.applovin.impl.InterfaceC4982n0
    /* renamed from: a */
    public synchronized void mo96423a(C4803m0 c4803m0) {
        C4803m0[] c4803m0Arr = this.f9146d;
        c4803m0Arr[0] = c4803m0;
        mo96422a(c4803m0Arr);
    }

    @Override // com.applovin.impl.InterfaceC4982n0
    /* renamed from: b */
    public synchronized C4803m0 mo96421b() {
        C4803m0 c4803m0;
        this.f9148f++;
        int i = this.f9149g;
        if (i > 0) {
            C4803m0[] c4803m0Arr = this.f9150h;
            int i2 = i - 1;
            this.f9149g = i2;
            c4803m0 = (C4803m0) AbstractC4100b1.m100583a(c4803m0Arr[i2]);
            this.f9150h[this.f9149g] = null;
        } else {
            c4803m0 = new C4803m0(new byte[this.f9144b], 0);
        }
        return c4803m0;
    }

    @Override // com.applovin.impl.InterfaceC4982n0
    /* renamed from: c */
    public int mo96420c() {
        return this.f9144b;
    }

    /* renamed from: d */
    public synchronized int m96419d() {
        return this.f9148f * this.f9144b;
    }

    /* renamed from: e */
    public synchronized void m96418e() {
        if (this.f9143a) {
            m96424a(0);
        }
    }

    public C5170q5(boolean z, int i, int i2) {
        AbstractC4100b1.m100580a(i > 0);
        AbstractC4100b1.m100580a(i2 >= 0);
        this.f9143a = z;
        this.f9144b = i;
        this.f9149g = i2;
        this.f9150h = new C4803m0[i2 + 100];
        if (i2 > 0) {
            this.f9145c = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f9150h[i3] = new C4803m0(this.f9145c, i3 * i);
            }
        } else {
            this.f9145c = null;
        }
        this.f9146d = new C4803m0[1];
    }

    @Override // com.applovin.impl.InterfaceC4982n0
    /* renamed from: a */
    public synchronized void mo96422a(C4803m0[] c4803m0Arr) {
        int i = this.f9149g;
        int length = c4803m0Arr.length + i;
        C4803m0[] c4803m0Arr2 = this.f9150h;
        if (length >= c4803m0Arr2.length) {
            this.f9150h = (C4803m0[]) Arrays.copyOf(c4803m0Arr2, Math.max(c4803m0Arr2.length * 2, i + c4803m0Arr.length));
        }
        for (C4803m0 c4803m0 : c4803m0Arr) {
            C4803m0[] c4803m0Arr3 = this.f9150h;
            int i2 = this.f9149g;
            this.f9149g = i2 + 1;
            c4803m0Arr3[i2] = c4803m0;
        }
        this.f9148f -= c4803m0Arr.length;
        notifyAll();
    }

    /* renamed from: a */
    public synchronized void m96424a(int i) {
        boolean z = i < this.f9147e;
        this.f9147e = i;
        if (z) {
            mo96425a();
        }
    }

    @Override // com.applovin.impl.InterfaceC4982n0
    /* renamed from: a */
    public synchronized void mo96425a() {
        int i = 0;
        int max = Math.max(0, AbstractC5863xp.m93040a(this.f9147e, this.f9144b) - this.f9148f);
        int i2 = this.f9149g;
        if (max >= i2) {
            return;
        }
        if (this.f9145c != null) {
            int i3 = i2 - 1;
            while (i <= i3) {
                C4803m0 c4803m0 = (C4803m0) AbstractC4100b1.m100583a(this.f9150h[i]);
                if (c4803m0.f7856a == this.f9145c) {
                    i++;
                } else {
                    C4803m0 c4803m02 = (C4803m0) AbstractC4100b1.m100583a(this.f9150h[i3]);
                    if (c4803m02.f7856a != this.f9145c) {
                        i3--;
                    } else {
                        C4803m0[] c4803m0Arr = this.f9150h;
                        c4803m0Arr[i] = c4803m02;
                        c4803m0Arr[i3] = c4803m0;
                        i3--;
                        i++;
                    }
                }
            }
            max = Math.max(max, i);
            if (max >= this.f9149g) {
                return;
            }
        }
        Arrays.fill(this.f9150h, max, this.f9149g, (Object) null);
        this.f9149g = max;
    }
}
