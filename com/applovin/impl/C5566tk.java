package com.applovin.impl;

import com.applovin.impl.C4061af;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.tk */
/* loaded from: classes2.dex */
public final class C5566tk extends AbstractC4267dk {

    /* renamed from: a */
    private final C4066ah f10903a = new C4066ah();

    /* renamed from: b */
    private final C5971zg f10904b = new C5971zg();

    /* renamed from: c */
    private C4537ho f10905c;

    @Override // com.applovin.impl.AbstractC4267dk
    /* renamed from: a */
    protected C4061af mo93618a(C4256df c4256df, ByteBuffer byteBuffer) {
        C4061af.InterfaceC4063b c5705vk;
        C4537ho c4537ho = this.f10905c;
        if (c4537ho == null || c4256df.f5619j != c4537ho.m98644c()) {
            C4537ho c4537ho2 = new C4537ho(c4256df.f8727f);
            this.f10905c = c4537ho2;
            c4537ho2.m98647a(c4256df.f8727f - c4256df.f5619j);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f10903a.m100791a(array, limit);
        this.f10904b.m92398a(array, limit);
        this.f10904b.m92390d(39);
        long m92403a = (this.f10904b.m92403a(1) << 32) | this.f10904b.m92403a(32);
        this.f10904b.m92390d(20);
        int m92403a2 = this.f10904b.m92403a(12);
        int m92403a3 = this.f10904b.m92403a(8);
        this.f10903a.m100778g(14);
        if (m92403a3 != 0) {
            if (m92403a3 != 255) {
                if (m92403a3 != 4) {
                    if (m92403a3 != 5) {
                        if (m92403a3 != 6) {
                            c5705vk = null;
                        } else {
                            c5705vk = C4277do.m99727a(this.f10903a, m92403a, this.f10905c);
                        }
                    } else {
                        c5705vk = C5640uk.m94074a(this.f10903a, m92403a, this.f10905c);
                    }
                } else {
                    c5705vk = C5785wk.m93498a(this.f10903a);
                }
            } else {
                c5705vk = C5917yh.m92742a(this.f10903a, m92403a2, m92403a);
            }
        } else {
            c5705vk = new C5705vk();
        }
        if (c5705vk == null) {
            return new C4061af(new C4061af.InterfaceC4063b[0]);
        }
        return new C4061af(c5705vk);
    }
}
