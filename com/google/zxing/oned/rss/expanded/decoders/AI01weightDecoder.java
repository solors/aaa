package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class AI01weightDecoder extends AI01decoder {
    public AI01weightDecoder(BitArray bitArray) {
        super(bitArray);
    }

    /* renamed from: f */
    protected abstract void mo65776f(StringBuilder sb2, int i);

    /* renamed from: g */
    protected abstract int mo65775g(int i);

    /* renamed from: h */
    public final void m65774h(StringBuilder sb2, int i, int i2) {
        int m65743f = m65773a().m65743f(i, i2);
        mo65776f(sb2, m65743f);
        int mo65775g = mo65775g(m65743f);
        int i3 = 100000;
        for (int i4 = 0; i4 < 5; i4++) {
            if (mo65775g / i3 == 0) {
                sb2.append('0');
            }
            i3 /= 10;
        }
        sb2.append(mo65775g);
    }
}
