package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.GN */
/* loaded from: assets/audience_network.dex */
public final class C11836GN {
    public static byte[] A02;
    public static String[] A03 = {"dzuBgE9s0LFJQmHWqmsbDjHZoDONF0gP", "J6iOrW1", "90R0Iw1LOyQi3zvTIzvnIWu931qBE2zm", "4GptalUYKF4Tciga7NCIJ92BgFvhnZhd", "G6plhQrIB9CQIGPBrjH5j9IMBbkUgwP1", "Y7lPZ", "v9PXbz", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS};
    public static final Pattern A04;
    public final C11939I4 A00 = new C11939I4();
    public final StringBuilder A01 = new StringBuilder();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A02 = new byte[]{30, 63, 20, 94, 94, 7, 17, 1, 78, 112, 2, 69, 66, 111, 118, 112, 122, 124, 36, 59, 49, 66, 71, 59, 68, 51, 48, 59, 69, 68, 95, 92, 94, 86, 90, 79, 82, 72, 83, 89, 16, 94, 82, 81, 82, 79, 5, 8, 11, 3, 37, 41, 42, 41, 52, 52, 61, 60, 38, Byte.MAX_VALUE, 52, 51, 63, 59, 62, 43, 41, 32, 33, 59, 98, 60, 59, 54, 35, 42, 4, 13, 12, 22, 79, 21, 7, 11, 5, 10, 22, 85, 72, 93, 80, 85, 95, 99, 114, 111, 99, 58, 115, 114, 116, 120, 101, 118, 99, 126, 120, 121, 92, 71, 77, 76, 91, 69, SignedBytes.MAX_POWER_OF_TWO, 71, 76, 53, 125};
    }

    static {
        A07();
        A04 = Pattern.compile(A01(11, 19, 83));
    }

    public static char A00(C11939I4 c11939i4, int i) {
        return (char) c11939i4.A00[i];
    }

    public static String A02(C11939I4 c11939i4) {
        int limit = c11939i4.A06();
        int A07 = c11939i4.A07();
        char c = 0;
        while (limit < A07 && c == 0) {
            int i = limit + 1;
            int position = c11939i4.A00[limit];
            int limit2 = (char) position;
            c = limit2 == 41 ? (char) 1 : (char) 0;
            limit = i;
        }
        int position2 = c11939i4.A06();
        return c11939i4.A0S((limit - 1) - position2).trim();
    }

    public static String A03(C11939I4 c11939i4, StringBuilder sb2) {
        sb2.setLength(0);
        int A06 = c11939i4.A06();
        int A07 = c11939i4.A07();
        boolean z = false;
        while (A06 < A07 && !z) {
            int position = c11939i4.A00[A06];
            char c = (char) position;
            if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                A06++;
                sb2.append(c);
            } else {
                z = true;
            }
        }
        int position2 = c11939i4.A06();
        c11939i4.A0Z(A06 - position2);
        return sb2.toString();
    }

    public static String A04(C11939I4 c11939i4, StringBuilder sb2) {
        A0A(c11939i4);
        if (c11939i4.A04() == 0) {
            if (A03[1].length() != 5) {
                A03[1] = "";
                return null;
            }
            throw new RuntimeException();
        }
        String A032 = A03(c11939i4, sb2);
        String A01 = A01(0, 0, 30);
        if (!A01.equals(A032)) {
            return A032;
        }
        String identifier = A01 + ((char) c11939i4.A0E());
        return identifier;
    }

    public static String A05(C11939I4 c11939i4, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int A06 = c11939i4.A06();
            String token = A04(c11939i4, sb2);
            if (token == null) {
                return null;
            }
            if (A01(118, 1, 74).equals(token) || A01(8, 1, 63).equals(token)) {
                c11939i4.A0Y(A06);
                z = true;
            } else {
                sb3.append(token);
            }
        }
        return sb3.toString();
    }

    public static String A06(C11939I4 c11939i4, StringBuilder sb2) {
        A0A(c11939i4);
        if (c11939i4.A04() < 5) {
            return null;
        }
        String A0S = c11939i4.A0S(5);
        String cueSelector = A01(3, 5, 46);
        if (cueSelector.equals(A0S)) {
            int A06 = c11939i4.A06();
            String token = A04(c11939i4, sb2);
            if (token == null) {
                return null;
            }
            String cueSelector2 = A01(117, 1, 4);
            if (cueSelector2.equals(token)) {
                c11939i4.A0Y(A06);
                String cueSelector3 = A01(0, 0, 30);
                return cueSelector3;
            }
            String target = null;
            String cueSelector4 = A01(0, 1, 124);
            if (cueSelector4.equals(token)) {
                target = A02(c11939i4);
            }
            String token2 = A04(c11939i4, sb2);
            String cueSelector5 = A01(1, 1, 92);
            if (!cueSelector5.equals(token2) || token2 == null) {
                return null;
            }
            return target;
        }
        return null;
    }

    private void A08(C11840GR c11840gr, String str) {
        if (A01(0, 0, 30).equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = A04.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                c11840gr.A0K(matcher.group(1));
            }
            str = str.substring(0, indexOf);
        }
        String[] A0l = AbstractC11953IK.A0l(str, A01(9, 2, 102));
        String str2 = A0l[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            c11840gr.A0J(str2.substring(0, indexOf2));
            int voiceStartIndex = indexOf2 + 1;
            c11840gr.A0I(str2.substring(voiceStartIndex));
        } else {
            c11840gr.A0J(str2);
        }
        int voiceStartIndex2 = A0l.length;
        if (voiceStartIndex2 > 1) {
            int voiceStartIndex3 = A0l.length;
            c11840gr.A0L((String[]) Arrays.copyOfRange(A0l, 1, voiceStartIndex3));
        }
    }

    public static void A09(C11939I4 c11939i4) {
        String line;
        do {
            line = c11939i4.A0P();
        } while (!TextUtils.isEmpty(line));
    }

    public static void A0A(C11939I4 c11939i4) {
        boolean skipping = true;
        while (c11939i4.A04() > 0 && skipping) {
            boolean skipping2 = A0D(c11939i4);
            if (!skipping2) {
                boolean skipping3 = A0C(c11939i4);
                if (!skipping3) {
                    skipping = false;
                }
            }
            skipping = true;
        }
    }

    public static void A0B(C11939I4 c11939i4, C11840GR c11840gr, StringBuilder sb2) {
        A0A(c11939i4);
        String A032 = A03(c11939i4, sb2);
        String A01 = A01(0, 0, 30);
        if (A01.equals(A032)) {
            return;
        }
        String A012 = A01(2, 1, 100);
        String property = A04(c11939i4, sb2);
        if (!A012.equals(property)) {
            return;
        }
        A0A(c11939i4);
        String token = A05(c11939i4, sb2);
        if (token == null || A01.equals(token)) {
            return;
        }
        int A06 = c11939i4.A06();
        String A042 = A04(c11939i4, sb2);
        String property2 = A01(8, 1, 63);
        if (!property2.equals(A042)) {
            String property3 = A01(118, 1, 74);
            if (property3.equals(A042)) {
                c11939i4.A0Y(A06);
            } else {
                return;
            }
        }
        String property4 = A01(50, 5, 12);
        if (property4.equals(A032)) {
            c11840gr.A0C(AbstractC11919Hk.A02(token));
            return;
        }
        String property5 = A01(30, 16, 119);
        if (property5.equals(A032)) {
            c11840gr.A0B(AbstractC11919Hk.A02(token));
            return;
        }
        String property6 = A01(93, 15, 93);
        if (property6.equals(A032)) {
            String property7 = A01(108, 9, 99);
            if (!property7.equals(token)) {
                return;
            }
            c11840gr.A0G(true);
            return;
        }
        String property8 = A01(55, 11, 24);
        if (property8.equals(A032)) {
            c11840gr.A0D(token);
            return;
        }
        String property9 = A01(76, 11, 40);
        if (property9.equals(A032)) {
            String property10 = A01(46, 4, 45);
            if (!property10.equals(token)) {
                return;
            }
            c11840gr.A0E(true);
            return;
        }
        String property11 = A01(66, 10, 5);
        if (!property11.equals(A032)) {
            return;
        }
        String property12 = A01(87, 6, 118);
        if (!property12.equals(token)) {
            return;
        }
        c11840gr.A0F(true);
    }

    public static boolean A0C(C11939I4 c11939i4) {
        int A06 = c11939i4.A06();
        int position = c11939i4.A07();
        byte[] bArr = c11939i4.A00;
        if (A06 + 2 > position) {
            return false;
        }
        int limit = A06 + 1;
        if (bArr[A06] != 47) {
            return false;
        }
        int i = limit + 1;
        if (bArr[limit] != 42) {
            return false;
        }
        while (true) {
            int i2 = i + 1;
            if (A03[1].length() == 5) {
                throw new RuntimeException();
            }
            A03[3] = "qxUn1ZvzITFnnAGK8xWAc6HMiAJqKZWm";
            if (i2 < position) {
                int limit2 = i + 1;
                char skippedChar = (char) bArr[i];
                if (skippedChar == '*') {
                    char skippedChar2 = (char) bArr[limit2];
                    if (skippedChar2 == '/') {
                        position = limit2 + 1;
                        i = position;
                    }
                }
                i = limit2;
            } else {
                int position2 = position - c11939i4.A06();
                if (A03[0].charAt(24) != 83) {
                    A03[1] = "Yz7L54LolwLHSdc7Qqu";
                    c11939i4.A0Z(position2);
                    return true;
                }
                throw new RuntimeException();
            }
        }
    }

    public static boolean A0D(C11939I4 c11939i4) {
        switch (A00(c11939i4, c11939i4.A06())) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
                c11939i4.A0Z(1);
                return true;
            default:
                return false;
        }
    }

    public final C11840GR A0E(C11939I4 c11939i4) {
        String A01;
        this.A01.setLength(0);
        int A06 = c11939i4.A06();
        A09(c11939i4);
        C11939I4 c11939i42 = this.A00;
        byte[] bArr = c11939i4.A00;
        int initialInputPosition = c11939i4.A06();
        c11939i42.A0b(bArr, initialInputPosition);
        this.A00.A0Y(A06);
        String A062 = A06(this.A00, this.A01);
        if (A062 != null) {
            if (A01(117, 1, 4).equals(A04(this.A00, this.A01))) {
                C11840GR c11840gr = new C11840GR();
                A08(c11840gr, A062);
                String str = null;
                boolean z = false;
                while (true) {
                    A01 = A01(118, 1, 74);
                    if (z) {
                        break;
                    }
                    int A063 = this.A00.A06();
                    str = A04(this.A00, this.A01);
                    z = str == null || A01.equals(str);
                    if (!z) {
                        this.A00.A0Y(A063);
                        A0B(this.A00, c11840gr, this.A01);
                    }
                }
                if (A01.equals(str)) {
                    return c11840gr;
                }
                return null;
            }
        }
        return null;
    }
}
