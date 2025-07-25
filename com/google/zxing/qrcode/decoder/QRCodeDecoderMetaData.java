package com.google.zxing.qrcode.decoder;

import com.google.zxing.ResultPoint;

/* loaded from: classes5.dex */
public final class QRCodeDecoderMetaData {

    /* renamed from: a */
    private final boolean f44704a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public QRCodeDecoderMetaData(boolean z) {
        this.f44704a = z;
    }

    public void applyMirroredCorrection(ResultPoint[] resultPointArr) {
        if (this.f44704a && resultPointArr != null && resultPointArr.length >= 3) {
            ResultPoint resultPoint = resultPointArr[0];
            resultPointArr[0] = resultPointArr[2];
            resultPointArr[2] = resultPoint;
        }
    }

    public boolean isMirrored() {
        return this.f44704a;
    }
}
