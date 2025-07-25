package com.applovin.impl;

import com.applovin.impl.AbstractC3977a;
import com.applovin.impl.AbstractC5855xl;
import com.applovin.impl.C4310e9;
import java.util.Collections;

/* renamed from: com.applovin.impl.s1 */
/* loaded from: classes2.dex */
final class C5300s1 extends AbstractC5855xl {

    /* renamed from: e */
    private static final int[] f9551e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    private boolean f9552b;

    /* renamed from: c */
    private boolean f9553c;

    /* renamed from: d */
    private int f9554d;

    public C5300s1(InterfaceC5209qo interfaceC5209qo) {
        super(interfaceC5209qo);
    }

    @Override // com.applovin.impl.AbstractC5855xl
    /* renamed from: a */
    protected boolean mo92617a(C4066ah c4066ah) {
        String str;
        if (!this.f9552b) {
            int m100762w = c4066ah.m100762w();
            int i = (m100762w >> 4) & 15;
            this.f9554d = i;
            if (i == 2) {
                this.f12126a.mo96251a(new C4310e9.C4312b().m99606f("audio/mpeg").m99617c(1).m99591n(f9551e[(m100762w >> 2) & 3]).m99632a());
                this.f9553c = true;
            } else if (i != 7 && i != 8) {
                if (i != 10) {
                    throw new AbstractC5855xl.C5856a("Audio format not supported: " + this.f9554d);
                }
            } else {
                if (i == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                this.f12126a.mo96251a(new C4310e9.C4312b().m99606f(str).m99617c(1).m99591n(8000).m99632a());
                this.f9553c = true;
            }
            this.f9552b = true;
        } else {
            c4066ah.m100778g(1);
        }
        return true;
    }

    @Override // com.applovin.impl.AbstractC5855xl
    /* renamed from: b */
    protected boolean mo92616b(C4066ah c4066ah, long j) {
        if (this.f9554d == 2) {
            int m100797a = c4066ah.m100797a();
            this.f12126a.m96253a(c4066ah, m100797a);
            this.f12126a.mo96254a(j, 1, m100797a, 0, null);
            return true;
        }
        int m100762w = c4066ah.m100762w();
        if (m100762w == 0 && !this.f9553c) {
            int m100797a2 = c4066ah.m100797a();
            byte[] bArr = new byte[m100797a2];
            c4066ah.m100790a(bArr, 0, m100797a2);
            AbstractC3977a.C3979b m101087a = AbstractC3977a.m101087a(bArr);
            this.f12126a.mo96251a(new C4310e9.C4312b().m99606f("audio/mp4a-latm").m99624a(m101087a.f4455c).m99617c(m101087a.f4454b).m99591n(m101087a.f4453a).m99623a(Collections.singletonList(bArr)).m99632a());
            this.f9553c = true;
            return false;
        } else if (this.f9554d == 10 && m100762w != 1) {
            return false;
        } else {
            int m100797a3 = c4066ah.m100797a();
            this.f12126a.m96253a(c4066ah, m100797a3);
            this.f12126a.mo96254a(j, 1, m100797a3, 0, null);
            return true;
        }
    }
}
