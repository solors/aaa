package com.google.zxing;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes5.dex */
public abstract class Binarizer {

    /* renamed from: a */
    private final LuminanceSource f44147a;

    /* JADX INFO: Access modifiers changed from: protected */
    public Binarizer(LuminanceSource luminanceSource) {
        this.f44147a = luminanceSource;
    }

    public abstract Binarizer createBinarizer(LuminanceSource luminanceSource);

    public abstract BitMatrix getBlackMatrix() throws NotFoundException;

    public abstract BitArray getBlackRow(int i, BitArray bitArray) throws NotFoundException;

    public final int getHeight() {
        return this.f44147a.getHeight();
    }

    public final LuminanceSource getLuminanceSource() {
        return this.f44147a;
    }

    public final int getWidth() {
        return this.f44147a.getWidth();
    }
}
