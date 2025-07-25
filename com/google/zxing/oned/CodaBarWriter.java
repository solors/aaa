package com.google.zxing.oned;

/* loaded from: classes5.dex */
public final class CodaBarWriter extends OneDimensionalCodeWriter {

    /* renamed from: a */
    private static final char[] f44476a;

    /* renamed from: b */
    private static final char[] f44477b = {'T', 'N', '*', 'E'};

    /* renamed from: c */
    private static final char[] f44478c = {'/', ':', '+', '.'};

    /* renamed from: d */
    private static final char f44479d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f44476a = cArr;
        f44479d = cArr[0];
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            char c = f44479d;
            sb2.append(c);
            sb2.append(str);
            sb2.append(c);
            str = sb2.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f44476a;
            boolean m65892e = CodaBarReader.m65892e(cArr, upperCase);
            boolean m65892e2 = CodaBarReader.m65892e(cArr, upperCase2);
            char[] cArr2 = f44477b;
            boolean m65892e3 = CodaBarReader.m65892e(cArr2, upperCase);
            boolean m65892e4 = CodaBarReader.m65892e(cArr2, upperCase2);
            if (m65892e) {
                if (!m65892e2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (m65892e3) {
                if (!m65892e4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!m65892e2 && !m65892e4) {
                StringBuilder sb3 = new StringBuilder();
                char c2 = f44479d;
                sb3.append(c2);
                sb3.append(str);
                sb3.append(c2);
                str = sb3.toString();
            } else {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (!Character.isDigit(str.charAt(i3)) && str.charAt(i3) != '-' && str.charAt(i3) != '$') {
                if (CodaBarReader.m65892e(f44478c, str.charAt(i3))) {
                    i2 += 10;
                } else {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
                }
            } else {
                i2 += 9;
            }
        }
        boolean[] zArr = new boolean[i2 + (str.length() - 1)];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 != '*') {
                    if (upperCase3 != 'E') {
                        if (upperCase3 != 'N') {
                            if (upperCase3 == 'T') {
                                upperCase3 = 'A';
                            }
                        } else {
                            upperCase3 = 'B';
                        }
                    } else {
                        upperCase3 = 'D';
                    }
                } else {
                    upperCase3 = 'C';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = CodaBarReader.f44470d;
                if (i6 < cArr3.length) {
                    if (upperCase3 == cArr3[i6]) {
                        i = CodaBarReader.f44471e[i6];
                        break;
                    }
                    i6++;
                } else {
                    i = 0;
                    break;
                }
            }
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i >> (6 - i7)) & 1) != 0 && i8 != 1) {
                    i8++;
                } else {
                    z = !z;
                    i7++;
                    i8 = 0;
                }
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
