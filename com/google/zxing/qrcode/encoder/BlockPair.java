package com.google.zxing.qrcode.encoder;

/* loaded from: classes5.dex */
final class BlockPair {

    /* renamed from: a */
    private final byte[] f44739a;

    /* renamed from: b */
    private final byte[] f44740b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BlockPair(byte[] bArr, byte[] bArr2) {
        this.f44739a = bArr;
        this.f44740b = bArr2;
    }

    public byte[] getDataBytes() {
        return this.f44739a;
    }

    public byte[] getErrorCorrectionBytes() {
        return this.f44740b;
    }
}
