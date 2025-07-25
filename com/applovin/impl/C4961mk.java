package com.applovin.impl;

/* renamed from: com.applovin.impl.mk */
/* loaded from: classes2.dex */
final class C4961mk {

    /* renamed from: a */
    private final C4066ah f8443a = new C4066ah(8);

    /* renamed from: b */
    private int f8444b;

    /* renamed from: a */
    private long m97091a(InterfaceC4703k8 interfaceC4703k8) {
        int i = 0;
        interfaceC4703k8.mo98002c(this.f8443a.m100787c(), 0, 1);
        int i2 = this.f8443a.m100787c()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        interfaceC4703k8.mo98002c(this.f8443a.m100787c(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.f8443a.m100787c()[i] & 255) + (i5 << 8);
        }
        this.f8444b += i4 + 1;
        return i5;
    }

    /* renamed from: b */
    public boolean m97090b(InterfaceC4703k8 interfaceC4703k8) {
        long m97091a;
        int i;
        long mo98011a = interfaceC4703k8.mo98011a();
        int i2 = (mo98011a > (-1L) ? 1 : (mo98011a == (-1L) ? 0 : -1));
        long j = 1024;
        if (i2 != 0 && mo98011a <= 1024) {
            j = mo98011a;
        }
        int i3 = (int) j;
        interfaceC4703k8.mo98002c(this.f8443a.m100787c(), 0, 4);
        long m100760y = this.f8443a.m100760y();
        this.f8444b = 4;
        while (m100760y != 440786851) {
            int i4 = this.f8444b + 1;
            this.f8444b = i4;
            if (i4 == i3) {
                return false;
            }
            interfaceC4703k8.mo98002c(this.f8443a.m100787c(), 0, 1);
            m100760y = ((m100760y << 8) & (-256)) | (this.f8443a.m100787c()[0] & 255);
        }
        long m97091a2 = m97091a(interfaceC4703k8);
        long j2 = this.f8444b;
        if (m97091a2 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j2 + m97091a2 >= mo98011a) {
            return false;
        }
        while (true) {
            int i5 = (this.f8444b > (j2 + m97091a2) ? 1 : (this.f8444b == (j2 + m97091a2) ? 0 : -1));
            if (i5 < 0) {
                if (m97091a(interfaceC4703k8) != Long.MIN_VALUE && (m97091a(interfaceC4703k8)) >= 0 && m97091a <= 2147483647L) {
                    if (i != 0) {
                        int i6 = (int) m97091a;
                        interfaceC4703k8.mo98003c(i6);
                        this.f8444b += i6;
                    }
                }
            } else if (i5 != 0) {
                return false;
            } else {
                return true;
            }
        }
    }
}
