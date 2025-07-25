package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* loaded from: classes5.dex */
final class SimpleToken extends Token {

    /* renamed from: c */
    private final short f44220c;

    /* renamed from: d */
    private final short f44221d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SimpleToken(Token token, int i, int i2) {
        super(token);
        this.f44220c = (short) i;
        this.f44221d = (short) i2;
    }

    @Override // com.google.zxing.aztec.encoder.Token
    void appendTo(BitArray bitArray, byte[] bArr) {
        bitArray.appendBits(this.f44220c, this.f44221d);
    }

    public String toString() {
        short s = this.f44220c;
        short s2 = this.f44221d;
        int i = (s & ((1 << s2) - 1)) | (1 << s2);
        return "<" + Integer.toBinaryString(i | (1 << this.f44221d)).substring(1) + '>';
    }
}
