package com.google.zxing.datamatrix.encoder;

/* loaded from: classes5.dex */
public final class EdifactEncoder implements Encoder {
    /* renamed from: a */
    private static void m65933a(char c, StringBuilder sb2) {
        if (c >= ' ' && c <= '?') {
            sb2.append(c);
        } else if (c >= '@' && c <= '^') {
            sb2.append((char) (c - '@'));
        } else {
            HighLevelEncoder.m65925c(c);
        }
    }

    /* renamed from: b */
    private static String m65932b(CharSequence charSequence, int i) {
        char c;
        char c2;
        int length = charSequence.length() - i;
        if (length != 0) {
            char charAt = charSequence.charAt(i);
            char c3 = 0;
            if (length >= 2) {
                c = charSequence.charAt(i + 1);
            } else {
                c = 0;
            }
            if (length >= 3) {
                c2 = charSequence.charAt(i + 2);
            } else {
                c2 = 0;
            }
            if (length >= 4) {
                c3 = charSequence.charAt(i + 3);
            }
            int i2 = (charAt << 18) + (c << '\f') + (c2 << 6) + c3;
            char c4 = (char) ((i2 >> 8) & 255);
            char c5 = (char) (i2 & 255);
            StringBuilder sb2 = new StringBuilder(3);
            sb2.append((char) ((i2 >> 16) & 255));
            if (length >= 2) {
                sb2.append(c4);
            }
            if (length >= 3) {
                sb2.append(c5);
            }
            return sb2.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    /* renamed from: c */
    private static void m65931c(EncoderContext encoderContext, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z = true;
            if (length == 1) {
                encoderContext.updateSymbolInfo();
                int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity() - encoderContext.getCodewordCount();
                int remainingCharacters = encoderContext.getRemainingCharacters();
                if (remainingCharacters > dataCapacity) {
                    encoderContext.updateSymbolInfo(encoderContext.getCodewordCount() + 1);
                    dataCapacity = encoderContext.getSymbolInfo().getDataCapacity() - encoderContext.getCodewordCount();
                }
                if (remainingCharacters <= dataCapacity && dataCapacity <= 2) {
                    return;
                }
            }
            if (length <= 4) {
                int i = length - 1;
                String m65932b = m65932b(charSequence, 0);
                if (!(!encoderContext.hasMoreCharacters()) || i > 2) {
                    z = false;
                }
                if (i <= 2) {
                    encoderContext.updateSymbolInfo(encoderContext.getCodewordCount() + i);
                    if (encoderContext.getSymbolInfo().getDataCapacity() - encoderContext.getCodewordCount() >= 3) {
                        encoderContext.updateSymbolInfo(encoderContext.getCodewordCount() + m65932b.length());
                        z = false;
                    }
                }
                if (z) {
                    encoderContext.resetSymbolInfo();
                    encoderContext.f44441f -= i;
                } else {
                    encoderContext.writeCodewords(m65932b);
                }
                return;
            }
            throw new IllegalStateException("Count must not exceed 4");
        } finally {
            encoderContext.signalEncoderChange(0);
        }
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public void encode(EncoderContext encoderContext) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!encoderContext.hasMoreCharacters()) {
                break;
            }
            m65933a(encoderContext.getCurrentChar(), sb2);
            encoderContext.f44441f++;
            if (sb2.length() >= 4) {
                encoderContext.writeCodewords(m65932b(sb2, 0));
                sb2.delete(0, 4);
                if (HighLevelEncoder.m65916l(encoderContext.getMessage(), encoderContext.f44441f, getEncodingMode()) != getEncodingMode()) {
                    encoderContext.signalEncoderChange(0);
                    break;
                }
            }
        }
        sb2.append((char) 31);
        m65931c(encoderContext, sb2);
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 4;
    }
}
