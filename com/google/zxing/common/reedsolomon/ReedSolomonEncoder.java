package com.google.zxing.common.reedsolomon;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class ReedSolomonEncoder {

    /* renamed from: a */
    private final GenericGF f44398a;

    /* renamed from: b */
    private final List<GenericGFPoly> f44399b;

    public ReedSolomonEncoder(GenericGF genericGF) {
        this.f44398a = genericGF;
        ArrayList arrayList = new ArrayList();
        this.f44399b = arrayList;
        arrayList.add(new GenericGFPoly(genericGF, new int[]{1}));
    }

    /* renamed from: a */
    private GenericGFPoly m65990a(int i) {
        if (i >= this.f44399b.size()) {
            List<GenericGFPoly> list = this.f44399b;
            GenericGFPoly genericGFPoly = list.get(list.size() - 1);
            for (int size = this.f44399b.size(); size <= i; size++) {
                GenericGF genericGF = this.f44398a;
                genericGFPoly = genericGFPoly.m65995i(new GenericGFPoly(genericGF, new int[]{1, genericGF.m66009c((size - 1) + genericGF.getGeneratorBase())}));
                this.f44399b.add(genericGFPoly);
            }
        }
        return this.f44399b.get(i);
    }

    public void encode(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                GenericGFPoly m65990a = m65990a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] m65999e = new GenericGFPoly(this.f44398a, iArr2).m65994j(i, 1).m66002b(m65990a)[1].m65999e();
                int length2 = i - m65999e.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(m65999e, 0, iArr, length + length2, m65999e.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
