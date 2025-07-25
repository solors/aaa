package com.google.zxing.aztec;

import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;

/* loaded from: classes5.dex */
public final class AztecDetectorResult extends DetectorResult {

    /* renamed from: c */
    private final boolean f44186c;

    /* renamed from: d */
    private final int f44187d;

    /* renamed from: e */
    private final int f44188e;

    public AztecDetectorResult(BitMatrix bitMatrix, ResultPoint[] resultPointArr, boolean z, int i, int i2) {
        super(bitMatrix, resultPointArr);
        this.f44186c = z;
        this.f44187d = i;
        this.f44188e = i2;
    }

    public int getNbDatablocks() {
        return this.f44187d;
    }

    public int getNbLayers() {
        return this.f44188e;
    }

    public boolean isCompact() {
        return this.f44186c;
    }
}
