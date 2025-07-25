package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* loaded from: classes5.dex */
final class BinaryShiftToken extends Token {

    /* renamed from: c */
    private final short f44211c;

    /* renamed from: d */
    private final short f44212d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinaryShiftToken(Token token, int i, int i2) {
        super(token);
        this.f44211c = (short) i;
        this.f44212d = (short) i2;
    }

    @Override // com.google.zxing.aztec.encoder.Token
    public void appendTo(BitArray bitArray, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f44212d;
            if (i < s) {
                if (i == 0 || (i == 31 && s <= 62)) {
                    bitArray.appendBits(31, 5);
                    short s2 = this.f44212d;
                    if (s2 > 62) {
                        bitArray.appendBits(s2 - 31, 16);
                    } else if (i == 0) {
                        bitArray.appendBits(Math.min((int) s2, 31), 5);
                    } else {
                        bitArray.appendBits(s2 - 31, 5);
                    }
                }
                bitArray.appendBits(bArr[this.f44211c + i], 8);
                i++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append((int) this.f44211c);
        sb2.append("::");
        sb2.append((this.f44211c + this.f44212d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
