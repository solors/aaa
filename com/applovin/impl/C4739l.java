package com.applovin.impl;

import com.applovin.impl.InterfaceC4279dp;
import com.applovin.impl.InterfaceC4591ij;

/* renamed from: com.applovin.impl.l */
/* loaded from: classes2.dex */
public final class C4739l implements InterfaceC4641j8 {

    /* renamed from: d */
    public static final InterfaceC4994n8 f7587d = new InterfaceC4994n8() { // from class: com.applovin.impl.ty
        @Override // com.applovin.impl.InterfaceC4994n8
        /* renamed from: a */
        public final InterfaceC4641j8[] mo92610a() {
            InterfaceC4641j8[] m97895b;
            m97895b = C4739l.m97895b();
            return m97895b;
        }
    };

    /* renamed from: a */
    private final C4802m f7588a = new C4802m();

    /* renamed from: b */
    private final C4066ah f7589b = new C4066ah(16384);

    /* renamed from: c */
    private boolean f7590c;

    /* renamed from: b */
    public static /* synthetic */ InterfaceC4641j8[] m97895b() {
        return new InterfaceC4641j8[]{new C4739l()};
    }

    @Override // com.applovin.impl.InterfaceC4641j8
    /* renamed from: a */
    public void mo93192a() {
    }

    @Override // com.applovin.impl.InterfaceC4641j8
    /* renamed from: a */
    public void mo93175a(InterfaceC4760l8 interfaceC4760l8) {
        this.f7588a.mo92453a(interfaceC4760l8, new InterfaceC4279dp.C4283d(0, 1));
        interfaceC4760l8.mo97780c();
        interfaceC4760l8.mo97781a(new InterfaceC4591ij.C4593b(-9223372036854775807L));
    }

    @Override // com.applovin.impl.InterfaceC4641j8
    /* renamed from: a */
    public int mo93179a(InterfaceC4703k8 interfaceC4703k8, C5563th c5563th) {
        int mo94271a = interfaceC4703k8.mo94271a(this.f7589b.m100787c(), 0, 16384);
        if (mo94271a == -1) {
            return -1;
        }
        this.f7589b.m100780f(0);
        this.f7589b.m100782e(mo94271a);
        if (!this.f7590c) {
            this.f7588a.mo92455a(0L, 4);
            this.f7590c = true;
        }
        this.f7588a.mo92454a(this.f7589b);
        return 0;
    }

    @Override // com.applovin.impl.InterfaceC4641j8
    /* renamed from: a */
    public void mo93184a(long j, long j2) {
        this.f7590c = false;
        this.f7588a.mo92456a();
    }

    @Override // com.applovin.impl.InterfaceC4641j8
    /* renamed from: a */
    public boolean mo93182a(InterfaceC4703k8 interfaceC4703k8) {
        C4066ah c4066ah = new C4066ah(10);
        int i = 0;
        while (true) {
            interfaceC4703k8.mo98002c(c4066ah.m100787c(), 0, 10);
            c4066ah.m100780f(0);
            if (c4066ah.m100759z() != 4801587) {
                break;
            }
            c4066ah.m100778g(3);
            int m100763v = c4066ah.m100763v();
            i += m100763v + 10;
            interfaceC4703k8.mo98003c(m100763v);
        }
        interfaceC4703k8.mo98007b();
        interfaceC4703k8.mo98003c(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            interfaceC4703k8.mo98002c(c4066ah.m100787c(), 0, 7);
            c4066ah.m100780f(0);
            int m100799C = c4066ah.m100799C();
            if (m100799C == 44096 || m100799C == 44097) {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int m97047a = AbstractC4979n.m97047a(c4066ah.m100787c(), m100799C);
                if (m97047a == -1) {
                    return false;
                }
                interfaceC4703k8.mo98003c(m97047a - 7);
            } else {
                interfaceC4703k8.mo98007b();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                interfaceC4703k8.mo98003c(i3);
                i2 = 0;
            }
        }
    }
}
