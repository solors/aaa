package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class AI01320xDecoder extends AI013x0xDecoder {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AI01320xDecoder(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    /* renamed from: f */
    protected void mo65776f(StringBuilder sb2, int i) {
        if (i < 10000) {
            sb2.append("(3202)");
        } else {
            sb2.append("(3203)");
        }
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    /* renamed from: g */
    protected int mo65775g(int i) {
        if (i < 10000) {
            return i;
        }
        return i - 10000;
    }
}
