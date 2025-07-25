package com.applovin.impl;

import com.applovin.impl.C4998nc;
import com.applovin.impl.InterfaceC4768lc;
import com.applovin.impl.InterfaceC5110pa;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.applovin.impl.f6 */
/* loaded from: classes2.dex */
public class C4380f6 implements InterfaceC4768lc {

    /* renamed from: a */
    private final int f6058a;

    public C4380f6() {
        this(-1);
    }

    @Override // com.applovin.impl.InterfaceC4768lc
    /* renamed from: a */
    public int mo97720a(int i) {
        int i2 = this.f6058a;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    public C4380f6(int i) {
        this.f6058a = i;
    }

    @Override // com.applovin.impl.InterfaceC4768lc
    /* renamed from: a */
    public long mo97718a(InterfaceC4768lc.C4769a c4769a) {
        IOException iOException = c4769a.f7728c;
        if ((iOException instanceof C4187ch) || (iOException instanceof FileNotFoundException) || (iOException instanceof InterfaceC5110pa.C5111a) || (iOException instanceof C4998nc.C5006h) || C4567i5.m98539a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((c4769a.f7729d - 1) * 1000, 5000);
    }
}
