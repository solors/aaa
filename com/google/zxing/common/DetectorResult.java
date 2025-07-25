package com.google.zxing.common;

import com.google.zxing.ResultPoint;

/* loaded from: classes5.dex */
public class DetectorResult {

    /* renamed from: a */
    private final BitMatrix f44362a;

    /* renamed from: b */
    private final ResultPoint[] f44363b;

    public DetectorResult(BitMatrix bitMatrix, ResultPoint[] resultPointArr) {
        this.f44362a = bitMatrix;
        this.f44363b = resultPointArr;
    }

    public final BitMatrix getBits() {
        return this.f44362a;
    }

    public final ResultPoint[] getPoints() {
        return this.f44363b;
    }
}
