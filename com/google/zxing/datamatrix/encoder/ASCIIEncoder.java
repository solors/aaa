package com.google.zxing.datamatrix.encoder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class ASCIIEncoder implements Encoder {
    /* renamed from: a */
    private static char m65946a(char c, char c2) {
        if (HighLevelEncoder.m65924d(c) && HighLevelEncoder.m65924d(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public void encode(EncoderContext encoderContext) {
        if (HighLevelEncoder.determineConsecutiveDigitCount(encoderContext.getMessage(), encoderContext.f44441f) >= 2) {
            encoderContext.writeCodeword(m65946a(encoderContext.getMessage().charAt(encoderContext.f44441f), encoderContext.getMessage().charAt(encoderContext.f44441f + 1)));
            encoderContext.f44441f += 2;
            return;
        }
        char currentChar = encoderContext.getCurrentChar();
        int m65916l = HighLevelEncoder.m65916l(encoderContext.getMessage(), encoderContext.f44441f, getEncodingMode());
        if (m65916l != getEncodingMode()) {
            if (m65916l != 1) {
                if (m65916l != 2) {
                    if (m65916l != 3) {
                        if (m65916l != 4) {
                            if (m65916l == 5) {
                                encoderContext.writeCodeword((char) 231);
                                encoderContext.signalEncoderChange(5);
                                return;
                            }
                            throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(m65916l)));
                        }
                        encoderContext.writeCodeword((char) 240);
                        encoderContext.signalEncoderChange(4);
                        return;
                    }
                    encoderContext.writeCodeword((char) 238);
                    encoderContext.signalEncoderChange(3);
                    return;
                }
                encoderContext.writeCodeword((char) 239);
                encoderContext.signalEncoderChange(2);
                return;
            }
            encoderContext.writeCodeword((char) 230);
            encoderContext.signalEncoderChange(1);
        } else if (HighLevelEncoder.m65923e(currentChar)) {
            encoderContext.writeCodeword((char) 235);
            encoderContext.writeCodeword((char) ((currentChar - 128) + 1));
            encoderContext.f44441f++;
        } else {
            encoderContext.writeCodeword((char) (currentChar + 1));
            encoderContext.f44441f++;
        }
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 0;
    }
}
