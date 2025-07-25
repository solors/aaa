package com.google.zxing.datamatrix.encoder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class C40Encoder implements Encoder {
    /* renamed from: a */
    private int m65944a(EncoderContext encoderContext, StringBuilder sb2, StringBuilder sb3, int i) {
        int length = sb2.length();
        sb2.delete(length - i, length);
        encoderContext.f44441f--;
        int mo65911b = mo65911b(encoderContext.getCurrentChar(), sb3);
        encoderContext.resetSymbolInfo();
        return mo65911b;
    }

    /* renamed from: c */
    private static String m65943c(CharSequence charSequence, int i) {
        int charAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * '(') + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m65942e(EncoderContext encoderContext, StringBuilder sb2) {
        encoderContext.writeCodewords(m65943c(sb2, 0));
        sb2.delete(0, 3);
    }

    /* renamed from: b */
    int mo65911b(char c, StringBuilder sb2) {
        if (c == ' ') {
            sb2.append((char) 3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb2.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            sb2.append((char) ((c - 'A') + 14));
            return 1;
        } else if (c < ' ') {
            sb2.append((char) 0);
            sb2.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c - '!'));
            return 2;
        } else if (c >= ':' && c <= '@') {
            sb2.append((char) 1);
            sb2.append((char) ((c - ':') + 15));
            return 2;
        } else if (c >= '[' && c <= '_') {
            sb2.append((char) 1);
            sb2.append((char) ((c - '[') + 22));
            return 2;
        } else if (c >= '`' && c <= 127) {
            sb2.append((char) 2);
            sb2.append((char) (c - '`'));
            return 2;
        } else {
            sb2.append("\u0001\u001e");
            return mo65911b((char) (c - 128), sb2) + 2;
        }
    }

    /* renamed from: d */
    void mo65910d(EncoderContext encoderContext, StringBuilder sb2) {
        int length = sb2.length() % 3;
        int codewordCount = encoderContext.getCodewordCount() + ((sb2.length() / 3) << 1);
        encoderContext.updateSymbolInfo(codewordCount);
        int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity() - codewordCount;
        if (length == 2) {
            sb2.append((char) 0);
            while (sb2.length() >= 3) {
                m65942e(encoderContext, sb2);
            }
            if (encoderContext.hasMoreCharacters()) {
                encoderContext.writeCodeword((char) 254);
            }
        } else if (dataCapacity == 1 && length == 1) {
            while (sb2.length() >= 3) {
                m65942e(encoderContext, sb2);
            }
            if (encoderContext.hasMoreCharacters()) {
                encoderContext.writeCodeword((char) 254);
            }
            encoderContext.f44441f--;
        } else if (length == 0) {
            while (sb2.length() >= 3) {
                m65942e(encoderContext, sb2);
            }
            if (dataCapacity > 0 || encoderContext.hasMoreCharacters()) {
                encoderContext.writeCodeword((char) 254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        encoderContext.signalEncoderChange(0);
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public void encode(EncoderContext encoderContext) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!encoderContext.hasMoreCharacters()) {
                break;
            }
            char currentChar = encoderContext.getCurrentChar();
            encoderContext.f44441f++;
            int mo65911b = mo65911b(currentChar, sb2);
            int codewordCount = encoderContext.getCodewordCount() + ((sb2.length() / 3) << 1);
            encoderContext.updateSymbolInfo(codewordCount);
            int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity() - codewordCount;
            if (!encoderContext.hasMoreCharacters()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && (dataCapacity < 2 || dataCapacity > 2)) {
                    mo65911b = m65944a(encoderContext, sb2, sb3, mo65911b);
                }
                while (sb2.length() % 3 == 1 && ((mo65911b <= 3 && dataCapacity != 1) || mo65911b > 3)) {
                    mo65911b = m65944a(encoderContext, sb2, sb3, mo65911b);
                }
            } else if (sb2.length() % 3 == 0 && HighLevelEncoder.m65916l(encoderContext.getMessage(), encoderContext.f44441f, getEncodingMode()) != getEncodingMode()) {
                encoderContext.signalEncoderChange(0);
                break;
            }
        }
        mo65910d(encoderContext, sb2);
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 1;
    }
}
