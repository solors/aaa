package com.google.zxing.pdf417.detector;

import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import java.util.List;

/* loaded from: classes5.dex */
public final class PDF417DetectorResult {

    /* renamed from: a */
    private final BitMatrix f44650a;

    /* renamed from: b */
    private final List<ResultPoint[]> f44651b;

    public PDF417DetectorResult(BitMatrix bitMatrix, List<ResultPoint[]> list) {
        this.f44650a = bitMatrix;
        this.f44651b = list;
    }

    public BitMatrix getBits() {
        return this.f44650a;
    }

    public List<ResultPoint[]> getPoints() {
        return this.f44651b;
    }
}
