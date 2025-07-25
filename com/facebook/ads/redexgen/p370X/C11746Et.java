package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Et */
/* loaded from: assets/audience_network.dex */
public final class C11746Et {
    public static String[] A04 = {"QJblDe3wVK6feXal4ldrY3QcOGG4UkHt", "2zepy1PmZTCf4jSxyWiaVOuG1uYDUhxq", "yYSZkIRTXInaVK1F9QQ9YZR4hxi7L96x", "9Bt0bU", "BsbuUwvwQ1kbtWiwTekQfziPaSue0dsw", "yLqexVAazno3TL8TDAW38tYF3t4XrW", "8DUKE7RXBSYmkSj7feSXhV2S4GEg6t2h", "8s5VPXlVl4Lwrm8gOC5ZhnLqGhthAU"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;

    public C11746Et(int i) {
        this(i, -1L);
    }

    public C11746Et(int i, int i2, int i3, long j) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = j;
    }

    public C11746Et(int i, long j) {
        this(i, -1, -1, j);
    }

    public final C11746Et A00(int i) {
        if (this.A02 == i) {
            return this;
        }
        return new C11746Et(i, this.A00, this.A01, this.A03);
    }

    public final boolean A01() {
        return this.A00 != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11746Et c11746Et = (C11746Et) obj;
        if (this.A02 == c11746Et.A02 && this.A00 == c11746Et.A00) {
            int i = this.A01;
            String[] strArr = A04;
            if (strArr[2].charAt(6) != strArr[6].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "3akbSKdkYbqYqb8XM8EoWhMtdFIZ3n";
            strArr2[5] = "92eUK6p4zC0e1AjStm6aKeEHBLYU05";
            if (i == c11746Et.A01 && this.A03 == c11746Et.A03) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A02;
        int result2 = this.A01;
        return (((((((17 * 31) + result) * 31) + this.A00) * 31) + result2) * 31) + ((int) this.A03);
    }
}
