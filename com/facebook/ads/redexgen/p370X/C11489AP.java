package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.AP */
/* loaded from: assets/audience_network.dex */
public final class C11489AP {
    public static String[] A02 = {"z5cWhBKwyfDPSiydbjddEPZfwt53ja0x", "cRtyb", "3nl2uEmm3Y6v2r6DUjAJFGqyxF5bM8Tl", "Xh7r", "szA3L8LMw85djaignONCiRG8", "IkzVIE", "xrsAK", "aL7FDs2Gv9osoDuKJqGKfwNkNHCE1i97"};
    public final int A00;
    public final C11746Et A01;

    public C11489AP(int i, C11746Et c11746Et) {
        this.A00 = i;
        this.A01 = c11746Et;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11489AP c11489ap = (C11489AP) obj;
        String[] strArr = A02;
        if (strArr[5].length() != strArr[3].length()) {
            String[] strArr2 = A02;
            strArr2[2] = "kxld16OEBNgi84xJjJHT7I1GCW5BWB1v";
            strArr2[0] = "YhTGjjkd4nQlp6zPvBFYrrZ7l65Vw2gm";
            if (this.A00 == c11489ap.A00) {
                C11746Et c11746Et = this.A01;
                if (A02[7].charAt(9) != '6') {
                    String[] strArr3 = A02;
                    strArr3[5] = "HGjNL7";
                    strArr3[3] = "NcRh";
                    if (c11746Et.equals(c11489ap.A01)) {
                        return true;
                    }
                } else {
                    String[] strArr4 = A02;
                    strArr4[6] = "oEAqE";
                    strArr4[1] = "ZR52c";
                    if (c11746Et.equals(c11489ap.A01)) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw new RuntimeException();
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }
}
