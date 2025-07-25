package com.applovin.impl;

import java.util.Arrays;

/* renamed from: com.applovin.impl.hg */
/* loaded from: classes2.dex */
final class C4526hg {

    /* renamed from: a */
    private final C4587ig f6640a = new C4587ig();

    /* renamed from: b */
    private final C4066ah f6641b = new C4066ah(new byte[65025], 0);

    /* renamed from: c */
    private int f6642c = -1;

    /* renamed from: d */
    private int f6643d;

    /* renamed from: e */
    private boolean f6644e;

    /* renamed from: a */
    private int m98687a(int i) {
        int i2;
        int i3 = 0;
        this.f6643d = 0;
        do {
            int i4 = this.f6643d;
            int i5 = i + i4;
            C4587ig c4587ig = this.f6640a;
            if (i5 >= c4587ig.f6899g) {
                break;
            }
            int[] iArr = c4587ig.f6902j;
            this.f6643d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: b */
    public C4066ah m98685b() {
        return this.f6641b;
    }

    /* renamed from: c */
    public void m98684c() {
        this.f6640a.m98430a();
        this.f6641b.m100784d(0);
        this.f6642c = -1;
        this.f6644e = false;
    }

    /* renamed from: d */
    public void m98683d() {
        if (this.f6641b.m100787c().length == 65025) {
            return;
        }
        C4066ah c4066ah = this.f6641b;
        c4066ah.m100791a(Arrays.copyOf(c4066ah.m100787c(), Math.max(65025, this.f6641b.m100783e())), this.f6641b.m100783e());
    }

    /* renamed from: a */
    public C4587ig m98688a() {
        return this.f6640a;
    }

    /* renamed from: a */
    public boolean m98686a(InterfaceC4703k8 interfaceC4703k8) {
        int i;
        AbstractC4100b1.m100577b(interfaceC4703k8 != null);
        if (this.f6644e) {
            this.f6644e = false;
            this.f6641b.m100784d(0);
        }
        while (!this.f6644e) {
            if (this.f6642c < 0) {
                if (!this.f6640a.m98429a(interfaceC4703k8) || !this.f6640a.m98427a(interfaceC4703k8, true)) {
                    return false;
                }
                C4587ig c4587ig = this.f6640a;
                int i2 = c4587ig.f6900h;
                if ((c4587ig.f6894b & 1) == 1 && this.f6641b.m100783e() == 0) {
                    i2 += m98687a(0);
                    i = this.f6643d;
                } else {
                    i = 0;
                }
                if (!AbstractC4823m8.m97563a(interfaceC4703k8, i2)) {
                    return false;
                }
                this.f6642c = i;
            }
            int m98687a = m98687a(this.f6642c);
            int i3 = this.f6642c + this.f6643d;
            if (m98687a > 0) {
                C4066ah c4066ah = this.f6641b;
                c4066ah.m100795a(c4066ah.m100783e() + m98687a);
                if (!AbstractC4823m8.m97559b(interfaceC4703k8, this.f6641b.m100787c(), this.f6641b.m100783e(), m98687a)) {
                    return false;
                }
                C4066ah c4066ah2 = this.f6641b;
                c4066ah2.m100782e(c4066ah2.m100783e() + m98687a);
                this.f6644e = this.f6640a.f6902j[i3 + (-1)] != 255;
            }
            if (i3 == this.f6640a.f6899g) {
                i3 = -1;
            }
            this.f6642c = i3;
        }
        return true;
    }
}
