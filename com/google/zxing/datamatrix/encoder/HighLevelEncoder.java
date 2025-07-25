package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class HighLevelEncoder {
    private HighLevelEncoder() {
    }

    /* renamed from: a */
    private static int m65927a(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 6; i2++) {
            int ceil = (int) Math.ceil(fArr[i2]);
            iArr[i2] = ceil;
            if (i > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i = ceil;
            }
            if (i == ceil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    /* renamed from: b */
    private static int m65926b(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m65925c(char c) {
        String hexString;
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + Integer.toHexString(c)) + ')');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m65924d(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    public static int determineConsecutiveDigitCount(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (m65924d(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m65923e(char c) {
        if (c >= 128 && c <= 255) {
            return true;
        }
        return false;
    }

    public static String encodeHighLevel(String str) {
        return encodeHighLevel(str, SymbolShapeHint.FORCE_NONE, null, null);
    }

    /* renamed from: f */
    private static boolean m65922f(char c) {
        if (c != ' ') {
            if (c < '0' || c > '9') {
                if (c < 'A' || c > 'Z') {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m65921g(char c) {
        if (c >= ' ' && c <= '^') {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m65920h(char c) {
        if (c != ' ') {
            if (c < '0' || c > '9') {
                if (c < 'a' || c > 'z') {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* renamed from: i */
    private static boolean m65919i(char c) {
        if (!m65917k(c) && c != ' ') {
            if (c < '0' || c > '9') {
                if (c < 'A' || c > 'Z') {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* renamed from: j */
    private static boolean m65918j(char c) {
        return false;
    }

    /* renamed from: k */
    private static boolean m65917k(char c) {
        if (c != '\r' && c != '*' && c != '>') {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static int m65916l(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        char c;
        if (i >= charSequence.length()) {
            return i2;
        }
        int i3 = 6;
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i4 = 0;
        while (true) {
            int i5 = i + i4;
            if (i5 == charSequence.length()) {
                byte[] bArr = new byte[i3];
                int[] iArr = new int[i3];
                int m65927a = m65927a(fArr, iArr, Integer.MAX_VALUE, bArr);
                int m65926b = m65926b(bArr);
                if (iArr[0] == m65927a) {
                    return 0;
                }
                if (m65926b == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (m65926b == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (m65926b == 1 && bArr[2] > 0) {
                    return 2;
                }
                if (m65926b == 1 && bArr[3] > 0) {
                    return 3;
                }
                return 1;
            }
            char charAt = charSequence.charAt(i5);
            i4++;
            if (m65924d(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m65923e(charAt)) {
                float ceil = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + 2.0f;
            } else {
                float ceil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + 1.0f;
            }
            if (m65922f(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m65923e(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (m65920h(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m65923e(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m65919i(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m65923e(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (m65921g(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (m65923e(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m65918j(charAt)) {
                c = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i4 >= 4) {
                int[] iArr2 = new int[i3];
                byte[] bArr2 = new byte[i3];
                m65927a(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int m65926b2 = m65926b(bArr2);
                int i6 = iArr2[0];
                int i7 = iArr2[c];
                if (i6 < i7 && i6 < iArr2[1] && i6 < iArr2[2] && i6 < iArr2[3] && i6 < iArr2[4]) {
                    return 0;
                }
                if (i7 >= i6) {
                    byte b = bArr2[1];
                    byte b2 = bArr2[2];
                    byte b3 = bArr2[3];
                    byte b4 = bArr2[4];
                    if (b + b2 + b3 + b4 != 0) {
                        if (m65926b2 == 1 && b4 > 0) {
                            return 4;
                        }
                        if (m65926b2 == 1 && b2 > 0) {
                            return 2;
                        }
                        if (m65926b2 == 1 && b3 > 0) {
                            return 3;
                        }
                        int i8 = iArr2[1];
                        if (i8 + 1 < i6 && i8 + 1 < i7 && i8 + 1 < iArr2[4] && i8 + 1 < iArr2[2]) {
                            int i9 = iArr2[3];
                            if (i8 < i9) {
                                return 1;
                            }
                            if (i8 == i9) {
                                for (int i10 = i + i4 + 1; i10 < charSequence.length(); i10++) {
                                    char charAt2 = charSequence.charAt(i10);
                                    if (m65917k(charAt2)) {
                                        return 3;
                                    }
                                    if (!m65919i(charAt2)) {
                                        break;
                                    }
                                }
                                return 1;
                            }
                        }
                    } else {
                        return 5;
                    }
                } else {
                    return 5;
                }
            }
            i3 = 6;
        }
    }

    /* renamed from: m */
    private static char m65915m(char c, int i) {
        int i2 = c + ((i * 149) % 253) + 1;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }

    public static String encodeHighLevel(String str, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2) {
        int i = 0;
        Encoder[] encoderArr = {new ASCIIEncoder(), new C40Encoder(), new TextEncoder(), new X12Encoder(), new EdifactEncoder(), new Base256Encoder()};
        EncoderContext encoderContext = new EncoderContext(str);
        encoderContext.setSymbolShape(symbolShapeHint);
        encoderContext.setSizeConstraints(dimension, dimension2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            encoderContext.writeCodeword((char) 236);
            encoderContext.setSkipAtEnd(2);
            encoderContext.f44441f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            encoderContext.writeCodeword((char) 237);
            encoderContext.setSkipAtEnd(2);
            encoderContext.f44441f += 7;
        }
        while (encoderContext.hasMoreCharacters()) {
            encoderArr[i].encode(encoderContext);
            if (encoderContext.getNewEncoding() >= 0) {
                i = encoderContext.getNewEncoding();
                encoderContext.resetEncoderSignal();
            }
        }
        int codewordCount = encoderContext.getCodewordCount();
        encoderContext.updateSymbolInfo();
        int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity();
        if (codewordCount < dataCapacity && i != 0 && i != 5 && i != 4) {
            encoderContext.writeCodeword((char) 254);
        }
        StringBuilder codewords = encoderContext.getCodewords();
        if (codewords.length() < dataCapacity) {
            codewords.append((char) 129);
        }
        while (codewords.length() < dataCapacity) {
            codewords.append(m65915m((char) 129, codewords.length() + 1));
        }
        return encoderContext.getCodewords().toString();
    }
}
