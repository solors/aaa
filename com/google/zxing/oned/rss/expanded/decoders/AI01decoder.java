package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class AI01decoder extends AbstractExpandedDecoder {
    public AI01decoder(BitArray bitArray) {
        super(bitArray);
    }

    /* renamed from: c */
    private static void m65779c(StringBuilder sb2, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 13; i4++) {
            int charAt = sb2.charAt(i4 + i) - '0';
            if ((i4 & 1) == 0) {
                charAt *= 3;
            }
            i3 += charAt;
        }
        int i5 = 10 - (i3 % 10);
        if (i5 != 10) {
            i2 = i5;
        }
        sb2.append(i2);
    }

    /* renamed from: d */
    public final void m65778d(StringBuilder sb2, int i) {
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append('9');
        m65777e(sb2, i, length);
    }

    /* renamed from: e */
    public final void m65777e(StringBuilder sb2, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int m65743f = m65773a().m65743f((i3 * 10) + i, 10);
            if (m65743f / 100 == 0) {
                sb2.append('0');
            }
            if (m65743f / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(m65743f);
        }
        m65779c(sb2, i2);
    }
}
