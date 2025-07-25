package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* loaded from: classes5.dex */
abstract class AI013x0xDecoder extends AI01weightDecoder {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AI013x0xDecoder(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() throws NotFoundException {
        if (m65772b().getSize() == 60) {
            StringBuilder sb2 = new StringBuilder();
            m65778d(sb2, 5);
            m65774h(sb2, 45, 15);
            return sb2.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
