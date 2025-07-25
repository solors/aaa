package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class AI013103decoder extends AI013x0xDecoder {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AI013103decoder(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    /* renamed from: f */
    protected void mo65776f(StringBuilder sb2, int i) {
        sb2.append("(3103)");
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    /* renamed from: g */
    protected int mo65775g(int i) {
        return i;
    }
}
