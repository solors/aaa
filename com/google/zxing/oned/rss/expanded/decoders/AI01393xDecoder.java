package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class AI01393xDecoder extends AI01decoder {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AI01393xDecoder(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() throws NotFoundException, FormatException {
        if (m65772b().getSize() >= 48) {
            StringBuilder sb2 = new StringBuilder();
            m65778d(sb2, 8);
            int m65743f = m65773a().m65743f(48, 2);
            sb2.append("(393");
            sb2.append(m65743f);
            sb2.append(')');
            int m65743f2 = m65773a().m65743f(50, 10);
            if (m65743f2 / 100 == 0) {
                sb2.append('0');
            }
            if (m65743f2 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(m65743f2);
            sb2.append(m65773a().m65746c(60, null).m65759b());
            return sb2.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
