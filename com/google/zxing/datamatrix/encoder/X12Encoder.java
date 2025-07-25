package com.google.zxing.datamatrix.encoder;

/* loaded from: classes5.dex */
public final class X12Encoder extends C40Encoder {
    @Override // com.google.zxing.datamatrix.encoder.C40Encoder
    /* renamed from: b */
    int mo65911b(char c, StringBuilder sb2) {
        if (c != '\r') {
            if (c != ' ') {
                if (c != '*') {
                    if (c != '>') {
                        if (c >= '0' && c <= '9') {
                            sb2.append((char) ((c - '0') + 4));
                        } else if (c >= 'A' && c <= 'Z') {
                            sb2.append((char) ((c - 'A') + 14));
                        } else {
                            HighLevelEncoder.m65925c(c);
                        }
                    } else {
                        sb2.append((char) 2);
                    }
                } else {
                    sb2.append((char) 1);
                }
            } else {
                sb2.append((char) 3);
            }
        } else {
            sb2.append((char) 0);
        }
        return 1;
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder
    /* renamed from: d */
    void mo65910d(EncoderContext encoderContext, StringBuilder sb2) {
        encoderContext.updateSymbolInfo();
        int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity() - encoderContext.getCodewordCount();
        encoderContext.f44441f -= sb2.length();
        if (encoderContext.getRemainingCharacters() > 1 || dataCapacity > 1 || encoderContext.getRemainingCharacters() != dataCapacity) {
            encoderContext.writeCodeword((char) 254);
        }
        if (encoderContext.getNewEncoding() < 0) {
            encoderContext.signalEncoderChange(0);
        }
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder, com.google.zxing.datamatrix.encoder.Encoder
    public void encode(EncoderContext encoderContext) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!encoderContext.hasMoreCharacters()) {
                break;
            }
            char currentChar = encoderContext.getCurrentChar();
            encoderContext.f44441f++;
            mo65911b(currentChar, sb2);
            if (sb2.length() % 3 == 0) {
                C40Encoder.m65942e(encoderContext, sb2);
                if (HighLevelEncoder.m65916l(encoderContext.getMessage(), encoderContext.f44441f, getEncodingMode()) != getEncodingMode()) {
                    encoderContext.signalEncoderChange(0);
                    break;
                }
            }
        }
        mo65910d(encoderContext, sb2);
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder, com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 3;
    }
}
