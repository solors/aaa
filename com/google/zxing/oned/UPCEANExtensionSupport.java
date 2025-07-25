package com.google.zxing.oned;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;

/* loaded from: classes5.dex */
public final class UPCEANExtensionSupport {

    /* renamed from: c */
    private static final int[] f44514c = {1, 1, 2};

    /* renamed from: a */
    private final UPCEANExtension2Support f44515a = new UPCEANExtension2Support();

    /* renamed from: b */
    private final UPCEANExtension5Support f44516b = new UPCEANExtension5Support();

    /* renamed from: a */
    public Result m65840a(int i, BitArray bitArray, int i2) throws NotFoundException {
        int[] m65837j = UPCEANReader.m65837j(bitArray, i2, false, f44514c);
        try {
            return this.f44516b.m65845b(i, bitArray, m65837j);
        } catch (ReaderException unused) {
            return this.f44515a.m65848b(i, bitArray, m65837j);
        }
    }
}
