package com.applovin.impl;

import com.applovin.impl.C5764wa;
import java.io.EOFException;

/* renamed from: com.applovin.impl.ya */
/* loaded from: classes2.dex */
public final class C5906ya {

    /* renamed from: a */
    private final C4066ah f12306a = new C4066ah(10);

    /* renamed from: a */
    public C4061af m92781a(InterfaceC4703k8 interfaceC4703k8, C5764wa.InterfaceC5765a interfaceC5765a) {
        C4061af c4061af = null;
        int i = 0;
        while (true) {
            try {
                interfaceC4703k8.mo98002c(this.f12306a.m100787c(), 0, 10);
                this.f12306a.m100780f(0);
                if (this.f12306a.m100759z() != 4801587) {
                    break;
                }
                this.f12306a.m100778g(3);
                int m100763v = this.f12306a.m100763v();
                int i2 = m100763v + 10;
                if (c4061af == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f12306a.m100787c(), 0, bArr, 0, 10);
                    interfaceC4703k8.mo98002c(bArr, 10, m100763v);
                    c4061af = new C5764wa(interfaceC5765a).m93617a(bArr, i2);
                } else {
                    interfaceC4703k8.mo98003c(m100763v);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        interfaceC4703k8.mo98007b();
        interfaceC4703k8.mo98003c(i);
        return c4061af;
    }
}
