package com.applovin.impl;

import com.applovin.impl.InterfaceC4279dp;
import com.applovin.impl.InterfaceC4591ij;

/* renamed from: com.applovin.impl.i */
/* loaded from: classes2.dex */
public final class C4551i implements InterfaceC4641j8 {

    /* renamed from: d */
    public static final InterfaceC4994n8 f6712d = new InterfaceC4994n8() { // from class: com.applovin.impl.vx
        @Override // com.applovin.impl.InterfaceC4994n8
        /* renamed from: a */
        public final InterfaceC4641j8[] mo92610a() {
            InterfaceC4641j8[] m98622b;
            m98622b = C4551i.m98622b();
            return m98622b;
        }
    };

    /* renamed from: a */
    private final C4618j f6713a = new C4618j();

    /* renamed from: b */
    private final C4066ah f6714b = new C4066ah(2786);

    /* renamed from: c */
    private boolean f6715c;

    /* renamed from: b */
    public static /* synthetic */ InterfaceC4641j8[] m98622b() {
        return new InterfaceC4641j8[]{new C4551i()};
    }

    @Override // com.applovin.impl.InterfaceC4641j8
    /* renamed from: a */
    public void mo93192a() {
    }

    @Override // com.applovin.impl.InterfaceC4641j8
    /* renamed from: a */
    public void mo93175a(InterfaceC4760l8 interfaceC4760l8) {
        this.f6713a.mo92453a(interfaceC4760l8, new InterfaceC4279dp.C4283d(0, 1));
        interfaceC4760l8.mo97780c();
        interfaceC4760l8.mo97781a(new InterfaceC4591ij.C4593b(-9223372036854775807L));
    }

    @Override // com.applovin.impl.InterfaceC4641j8
    /* renamed from: a */
    public int mo93179a(InterfaceC4703k8 interfaceC4703k8, C5563th c5563th) {
        int mo94271a = interfaceC4703k8.mo94271a(this.f6714b.m100787c(), 0, 2786);
        if (mo94271a == -1) {
            return -1;
        }
        this.f6714b.m100780f(0);
        this.f6714b.m100782e(mo94271a);
        if (!this.f6715c) {
            this.f6713a.mo92455a(0L, 4);
            this.f6715c = true;
        }
        this.f6713a.mo92454a(this.f6714b);
        return 0;
    }

    @Override // com.applovin.impl.InterfaceC4641j8
    /* renamed from: a */
    public void mo93184a(long j, long j2) {
        this.f6715c = false;
        this.f6713a.mo92456a();
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
            interfaceC4703k8.mo98002c(c4066ah.m100787c(), 0, 6);
            c4066ah.m100780f(0);
            if (c4066ah.m100799C() != 2935) {
                interfaceC4703k8.mo98007b();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                interfaceC4703k8.mo98003c(i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int m98095a = AbstractC4682k.m98095a(c4066ah.m100787c());
                if (m98095a == -1) {
                    return false;
                }
                interfaceC4703k8.mo98003c(m98095a - 6);
            }
        }
    }
}
