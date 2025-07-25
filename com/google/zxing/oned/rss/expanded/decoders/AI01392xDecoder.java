package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class AI01392xDecoder extends AI01decoder {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AI01392xDecoder(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() throws NotFoundException, FormatException {
        if (m65772b().getSize() >= 48) {
            StringBuilder sb2 = new StringBuilder();
            m65778d(sb2, 8);
            int m65743f = m65773a().m65743f(48, 2);
            sb2.append("(392");
            sb2.append(m65743f);
            sb2.append(')');
            sb2.append(m65773a().m65746c(50, null).m65759b());
            return sb2.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
