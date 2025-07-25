package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class AI013x0x1xDecoder extends AI01weightDecoder {

    /* renamed from: c */
    private final String f44567c;

    /* renamed from: d */
    private final String f44568d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AI013x0x1xDecoder(BitArray bitArray, String str, String str2) {
        super(bitArray);
        this.f44567c = str2;
        this.f44568d = str;
    }

    /* renamed from: i */
    private void m65780i(StringBuilder sb2, int i) {
        int m65743f = m65773a().m65743f(i, 16);
        if (m65743f == 38400) {
            return;
        }
        sb2.append('(');
        sb2.append(this.f44567c);
        sb2.append(')');
        int i2 = m65743f % 32;
        int i3 = m65743f / 32;
        int i4 = (i3 % 12) + 1;
        int i5 = i3 / 12;
        if (i5 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i5);
        if (i4 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i4);
        if (i2 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i2);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    /* renamed from: f */
    protected void mo65776f(StringBuilder sb2, int i) {
        sb2.append('(');
        sb2.append(this.f44568d);
        sb2.append(i / 100000);
        sb2.append(')');
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    /* renamed from: g */
    protected int mo65775g(int i) {
        return i % 100000;
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() throws NotFoundException {
        if (m65772b().getSize() == 84) {
            StringBuilder sb2 = new StringBuilder();
            m65778d(sb2, 8);
            m65774h(sb2, 48, 20);
            m65780i(sb2, 68);
            return sb2.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
