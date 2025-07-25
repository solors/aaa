package com.applovin.impl;

import com.applovin.impl.C4310e9;
import com.applovin.impl.InterfaceC4279dp;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.l7 */
/* loaded from: classes2.dex */
public final class C4759l7 implements InterfaceC5107p7 {

    /* renamed from: a */
    private final List f7699a;

    /* renamed from: b */
    private final InterfaceC5209qo[] f7700b;

    /* renamed from: c */
    private boolean f7701c;

    /* renamed from: d */
    private int f7702d;

    /* renamed from: e */
    private int f7703e;

    /* renamed from: f */
    private long f7704f = -9223372036854775807L;

    public C4759l7(List list) {
        this.f7699a = list;
        this.f7700b = new InterfaceC5209qo[list.size()];
    }

    /* renamed from: a */
    private boolean m97783a(C4066ah c4066ah, int i) {
        if (c4066ah.m100797a() == 0) {
            return false;
        }
        if (c4066ah.m100762w() != i) {
            this.f7701c = false;
        }
        this.f7702d--;
        return this.f7701c;
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: b */
    public void mo92452b() {
        if (this.f7701c) {
            if (this.f7704f != -9223372036854775807L) {
                for (InterfaceC5209qo interfaceC5209qo : this.f7700b) {
                    interfaceC5209qo.mo96254a(this.f7704f, 1, this.f7703e, 0, null);
                }
            }
            this.f7701c = false;
        }
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92454a(C4066ah c4066ah) {
        InterfaceC5209qo[] interfaceC5209qoArr;
        if (this.f7701c) {
            if (this.f7702d != 2 || m97783a(c4066ah, 32)) {
                if (this.f7702d != 1 || m97783a(c4066ah, 0)) {
                    int m100785d = c4066ah.m100785d();
                    int m100797a = c4066ah.m100797a();
                    for (InterfaceC5209qo interfaceC5209qo : this.f7700b) {
                        c4066ah.m100780f(m100785d);
                        interfaceC5209qo.m96253a(c4066ah, m100797a);
                    }
                    this.f7703e += m100797a;
                }
            }
        }
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92453a(InterfaceC4760l8 interfaceC4760l8, InterfaceC4279dp.C4283d c4283d) {
        for (int i = 0; i < this.f7700b.length; i++) {
            InterfaceC4279dp.C4280a c4280a = (InterfaceC4279dp.C4280a) this.f7699a.get(i);
            c4283d.m99724a();
            InterfaceC5209qo mo97782a = interfaceC4760l8.mo97782a(c4283d.m99722c(), 3);
            mo97782a.mo96251a(new C4310e9.C4312b().m99615c(c4283d.m99723b()).m99606f("application/dvbsubs").m99623a(Collections.singletonList(c4280a.f5689c)).m99609e(c4280a.f5687a).m99632a());
            this.f7700b[i] = mo97782a;
        }
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92455a(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f7701c = true;
        if (j != -9223372036854775807L) {
            this.f7704f = j;
        }
        this.f7703e = 0;
        this.f7702d = 2;
    }

    @Override // com.applovin.impl.InterfaceC5107p7
    /* renamed from: a */
    public void mo92456a() {
        this.f7701c = false;
        this.f7704f = -9223372036854775807L;
    }
}
