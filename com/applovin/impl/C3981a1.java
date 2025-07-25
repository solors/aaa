package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: com.applovin.impl.a1 */
/* loaded from: classes2.dex */
public final class C3981a1 extends AbstractC4267dk {
    @Override // com.applovin.impl.AbstractC4267dk
    /* renamed from: a */
    protected C4061af mo93618a(C4256df c4256df, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return m101077a(new C5971zg(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }

    /* renamed from: a */
    private static C4061af m101077a(C5971zg c5971zg) {
        c5971zg.m92390d(12);
        int m92391d = (c5971zg.m92391d() + c5971zg.m92403a(12)) - 4;
        c5971zg.m92390d(44);
        c5971zg.m92388e(c5971zg.m92403a(12));
        c5971zg.m92390d(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (c5971zg.m92391d() >= m92391d) {
                break;
            }
            c5971zg.m92390d(48);
            int m92403a = c5971zg.m92403a(8);
            c5971zg.m92390d(4);
            int m92391d2 = c5971zg.m92391d() + c5971zg.m92403a(12);
            String str2 = null;
            while (c5971zg.m92391d() < m92391d2) {
                int m92403a2 = c5971zg.m92403a(8);
                int m92403a3 = c5971zg.m92403a(8);
                int m92391d3 = c5971zg.m92391d() + m92403a3;
                if (m92403a2 == 2) {
                    int m92403a4 = c5971zg.m92403a(16);
                    c5971zg.m92390d(8);
                    if (m92403a4 != 3) {
                    }
                    while (c5971zg.m92391d() < m92391d3) {
                        str = c5971zg.m92401a(c5971zg.m92403a(8), Charsets.US_ASCII);
                        int m92403a5 = c5971zg.m92403a(8);
                        for (int i = 0; i < m92403a5; i++) {
                            c5971zg.m92388e(c5971zg.m92403a(8));
                        }
                    }
                } else if (m92403a2 == 21) {
                    str2 = c5971zg.m92401a(m92403a3, Charsets.US_ASCII);
                }
                c5971zg.m92392c(m92391d3 * 8);
            }
            c5971zg.m92392c(m92391d2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new C5940z0(m92403a, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C4061af(arrayList);
    }
}
