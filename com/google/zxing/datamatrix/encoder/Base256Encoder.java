package com.google.zxing.datamatrix.encoder;

import androidx.core.view.InputDeviceCompat;

/* loaded from: classes5.dex */
public final class Base256Encoder implements Encoder {
    /* renamed from: a */
    private static char m65945a(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        if (i2 <= 255) {
            return (char) i2;
        }
        return (char) (i2 + InputDeviceCompat.SOURCE_ANY);
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public void encode(EncoderContext encoderContext) {
        boolean z;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 0);
        while (true) {
            if (!encoderContext.hasMoreCharacters()) {
                break;
            }
            sb2.append(encoderContext.getCurrentChar());
            encoderContext.f44441f++;
            if (HighLevelEncoder.m65916l(encoderContext.getMessage(), encoderContext.f44441f, getEncodingMode()) != getEncodingMode()) {
                encoderContext.signalEncoderChange(0);
                break;
            }
        }
        int length = sb2.length() - 1;
        int codewordCount = encoderContext.getCodewordCount() + length + 1;
        encoderContext.updateSymbolInfo(codewordCount);
        if (encoderContext.getSymbolInfo().getDataCapacity() - codewordCount > 0) {
            z = true;
        } else {
            z = false;
        }
        if (encoderContext.hasMoreCharacters() || z) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb2.setCharAt(0, (char) ((length / 250) + 249));
                sb2.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = sb2.length();
        for (int i = 0; i < length2; i++) {
            encoderContext.writeCodeword(m65945a(sb2.charAt(i), encoderContext.getCodewordCount() + 1));
        }
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 5;
    }
}
