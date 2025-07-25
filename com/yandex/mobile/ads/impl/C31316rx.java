package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC31192qc;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.rx */
/* loaded from: classes8.dex */
public final class C31316rx implements InterfaceC31192qc {

    /* renamed from: a */
    private final boolean f84930a;

    /* renamed from: b */
    private final int f84931b;
    @Nullable

    /* renamed from: c */
    private final byte[] f84932c;

    /* renamed from: d */
    private int f84933d;

    /* renamed from: e */
    private int f84934e;

    /* renamed from: f */
    private int f84935f;

    /* renamed from: g */
    private C31102pc[] f84936g;

    public C31316rx() {
        this(0);
    }

    /* renamed from: a */
    public final synchronized C31102pc m29913a() {
        C31102pc c31102pc;
        int i = this.f84934e + 1;
        this.f84934e = i;
        int i2 = this.f84935f;
        if (i2 > 0) {
            C31102pc[] c31102pcArr = this.f84936g;
            int i3 = i2 - 1;
            this.f84935f = i3;
            c31102pc = c31102pcArr[i3];
            c31102pc.getClass();
            this.f84936g[this.f84935f] = null;
        } else {
            C31102pc c31102pc2 = new C31102pc(0, new byte[this.f84931b]);
            C31102pc[] c31102pcArr2 = this.f84936g;
            if (i > c31102pcArr2.length) {
                this.f84936g = (C31102pc[]) Arrays.copyOf(c31102pcArr2, c31102pcArr2.length * 2);
            }
            c31102pc = c31102pc2;
        }
        return c31102pc;
    }

    /* renamed from: b */
    public final int m29909b() {
        return this.f84931b;
    }

    /* renamed from: c */
    public final synchronized int m29908c() {
        return this.f84934e * this.f84931b;
    }

    /* renamed from: d */
    public final synchronized void m29907d() {
        if (this.f84930a) {
            m29912a(0);
        }
    }

    /* renamed from: e */
    public final synchronized void m29906e() {
        int i = this.f84933d;
        int i2 = this.f84931b;
        int i3 = y32.f88010a;
        int i4 = (((i + i2) - 1) / i2) - this.f84934e;
        int i5 = 0;
        int max = Math.max(0, i4);
        int i6 = this.f84935f;
        if (max >= i6) {
            return;
        }
        if (this.f84932c != null) {
            int i7 = i6 - 1;
            while (i5 <= i7) {
                C31102pc c31102pc = this.f84936g[i5];
                c31102pc.getClass();
                if (c31102pc.f83792a == this.f84932c) {
                    i5++;
                } else {
                    C31102pc c31102pc2 = this.f84936g[i7];
                    c31102pc2.getClass();
                    if (c31102pc2.f83792a != this.f84932c) {
                        i7--;
                    } else {
                        C31102pc[] c31102pcArr = this.f84936g;
                        c31102pcArr[i5] = c31102pc2;
                        c31102pcArr[i7] = c31102pc;
                        i7--;
                        i5++;
                    }
                }
            }
            max = Math.max(max, i5);
            if (max >= this.f84935f) {
                return;
            }
        }
        Arrays.fill(this.f84936g, max, this.f84935f, (Object) null);
        this.f84935f = max;
    }

    public C31316rx(int i) {
        this.f84930a = true;
        this.f84931b = 65536;
        this.f84935f = 0;
        this.f84936g = new C31102pc[100];
        this.f84932c = null;
    }

    /* renamed from: a */
    public final synchronized void m29911a(C31102pc c31102pc) {
        C31102pc[] c31102pcArr = this.f84936g;
        int i = this.f84935f;
        this.f84935f = i + 1;
        c31102pcArr[i] = c31102pc;
        this.f84934e--;
        notifyAll();
    }

    /* renamed from: a */
    public final synchronized void m29910a(@Nullable InterfaceC31192qc.InterfaceC31193a interfaceC31193a) {
        while (interfaceC31193a != null) {
            C31102pc[] c31102pcArr = this.f84936g;
            int i = this.f84935f;
            this.f84935f = i + 1;
            c31102pcArr[i] = interfaceC31193a.mo26810a();
            this.f84934e--;
            interfaceC31193a = interfaceC31193a.next();
        }
        notifyAll();
    }

    /* renamed from: a */
    public final synchronized void m29912a(int i) {
        boolean z = i < this.f84933d;
        this.f84933d = i;
        if (z) {
            m29906e();
        }
    }
}
