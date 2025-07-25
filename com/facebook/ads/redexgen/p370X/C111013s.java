package com.facebook.ads.redexgen.p370X;

import android.graphics.Rect;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.common.primitives.SignedBytes;
import com.unity3d.mediation.LevelPlayAdError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3s */
/* loaded from: assets/audience_network.dex */
public final class C111013s {
    public static byte[] A02;
    public static String[] A03 = {"MIyaG5GGMOxZGMlafXmCt20n5rwr84Cp", "2d7Ue4OLDSzNDZ0wIaqfb27lMuRlGrEq", "mYVPmAfRmW7XSvdIWjd", "xGy6wksCbV1DRuK7mqOXpPoeqCYQ0xXA", "bG0ONBuurvv92UazdjN2MWGsVI3Uiutq", "DcUOjHhMMeDdpHUeoCsuhqU8ztRHLrD6", "9Z29anAmU4sgj9dhE7", "NGIsWgcUmAFv5dLZHkD"};
    public static final C110973o A04;
    public int A00 = -1;
    public final AccessibilityNodeInfo A01;

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 94);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{122, 118, 118, 109, 22, 80, 75, 9, 4, 30, 5, 15, 24, 34, 5, 59, 10, 25, 14, 5, 31, 81, 75, SignedBytes.MAX_POWER_OF_TWO, 91, 25, 20, 14, 21, 31, 8, 50, 21, 40, 24, 9, 30, 30, 21, 65, 91, 125, 102, 37, 46, 35, 37, 45, 39, 36, 42, 35, 124, 102, 61, 38, 101, 110, 99, 101, 109, 99, 98, 60, 38, 7, 28, 95, 80, 93, 79, 79, 114, 93, 81, 89, 6, 28, SignedBytes.MAX_POWER_OF_TWO, 91, 24, 23, 18, 24, 16, 26, 25, 23, 30, 65, 91, 97, 122, 57, 53, 52, 46, 63, 52, 46, 30, 63, 41, 57, 40, 51, 42, 46, 51, 53, 52, 96, 122, 36, 63, 122, 113, 126, 125, 115, 122, 123, 37, 63, 96, 123, 61, 52, 56, 46, 40, 58, 57, 55, 62, 97, 123, 4, 31, 89, 80, 92, 74, 76, 90, 91, 5, 31, 29, 6, 74, 73, 72, 65, 101, 74, 79, 69, 77, 71, 68, 74, 67, 28, 6, 89, 66, 18, 3, 1, 9, 3, 5, 7, 44, 3, 15, 7, 88, 66, 8, 19, 67, 82, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, 68, 92, 65, 87, 9, 19, 25, 2, 81, 65, 80, 77, 78, 78, 67, SignedBytes.MAX_POWER_OF_TWO, 78, 71, 24, 2, 8, 19, SignedBytes.MAX_POWER_OF_TWO, 86, 95, 86, 80, 71, 86, 87, 9, 19, 81, 74, 30, 15, 18, 30, 80, 74, 76, 87, 1, 30, 18, 0, 62, 19, 77, 87, 42, 40, 63, 34, 36, 37, 52, 42, 40, 40, 46, 56, 56, 34, 41, 34, 39, 34, 63, 50, 52, 45, 36, 40, 62, 56, 76, 78, 89, 68, 66, 67, 82, 78, 65, 72, 76, 95, 82, 76, 78, 78, 72, 94, 94, 68, 79, 68, 65, 68, 89, 84, 82, 75, 66, 78, 88, 94, 6, 4, 19, 14, 8, 9, 24, 4, 11, 2, 6, 21, 24, 1, 8, 4, 18, 20, 109, 111, 120, 101, 99, 98, 115, 111, 96, 105, 109, 126, 115, Byte.MAX_VALUE, 105, 96, 105, 111, 120, 101, 99, 98, 94, 92, 75, 86, 80, 81, SignedBytes.MAX_POWER_OF_TWO, 92, 83, 86, 92, 84, 79, 77, 90, 71, 65, SignedBytes.MAX_POWER_OF_TWO, 81, 77, 65, 94, 87, 31, 29, 10, 23, 17, 16, 1, 29, 11, 10, 16, 18, 5, 24, 30, 31, 14, 23, 30, 18, 4, 2, 123, 121, 110, 115, 117, 116, 101, 118, 117, 116, 125, 101, 121, 118, 115, 121, 113, 49, 51, 36, 57, 63, 62, 47, 62, 53, 40, 36, 47, 49, 36, 47, 61, 63, 38, 53, 61, 53, 62, 36, 47, 55, 34, 49, 62, 37, 60, 49, 34, 57, 36, 41, 116, 118, 97, 124, 122, 123, 106, 123, 112, 109, 97, 106, 125, 97, 120, 121, 106, 112, 121, 112, 120, 112, 123, 97, 109, 111, 120, 101, 99, 98, 115, 124, 109, Byte.MAX_VALUE, 120, 105, 37, 39, 48, 45, 43, 42, 59, 52, 54, 33, 50, 45, 43, 49, 55, 59, 37, 48, 59, 41, 43, 50, 33, 41, 33, 42, 48, 59, 35, 54, 37, 42, 49, 40, 37, 54, 45, 48, 61, 68, 70, 81, 76, 74, 75, 90, 85, 87, SignedBytes.MAX_POWER_OF_TWO, 83, 76, 74, 80, 86, 90, 77, 81, 72, 73, 90, SignedBytes.MAX_POWER_OF_TWO, 73, SignedBytes.MAX_POWER_OF_TWO, 72, SignedBytes.MAX_POWER_OF_TWO, 75, 81, 98, 96, 119, 106, 108, 109, 124, 112, 96, 113, 108, 111, 111, 124, 97, 98, 96, 104, 116, 98, 113, 103, 77, 79, 88, 69, 67, 66, 83, 95, 79, 94, 67, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, 83, 74, 67, 94, 91, 77, 94, 72, 22, 20, 3, 30, 24, 25, 8, 4, 18, 27, 18, 20, 3, 124, 126, 105, 116, 114, 115, 98, 110, 120, 105, 98, 110, 120, 113, 120, 126, 105, 116, 114, 115, 97, 99, 116, 105, 111, 110, Byte.MAX_VALUE, 117, 110, 107, 110, 111, 119, 110, 65};
    }

    static {
        A09();
        if (Build.VERSION.SDK_INT >= 24) {
            A04 = new C109371C() { // from class: com.facebook.ads.redexgen.X.0c
            };
        } else if (Build.VERSION.SDK_INT >= 23) {
            A04 = new C109371C();
        } else if (Build.VERSION.SDK_INT >= 22) {
            A04 = new C109711k();
        } else if (Build.VERSION.SDK_INT >= 21) {
            A04 = new C110102N();
        } else if (Build.VERSION.SDK_INT >= 19) {
            A04 = new C110653H();
        } else if (Build.VERSION.SDK_INT >= 18) {
            A04 = new C112806n();
        } else if (Build.VERSION.SDK_INT >= 17) {
            A04 = new C11784FX();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A04 = new C13098b0();
        } else {
            A04 = new C110973o();
        }
    }

    public C111013s(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.A01 = accessibilityNodeInfo;
    }

    private final int A00() {
        return this.A01.getActions();
    }

    public static C111013s A01(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C111013s(accessibilityNodeInfo);
    }

    private final CharSequence A02() {
        return this.A01.getClassName();
    }

    private final CharSequence A03() {
        return this.A01.getContentDescription();
    }

    private final CharSequence A04() {
        return this.A01.getPackageName();
    }

    private final CharSequence A05() {
        return this.A01.getText();
    }

    private final String A06() {
        return A04.A02(this.A01);
    }

    public static String A07(int i) {
        switch (i) {
            case 1:
                return A08(367, 12, 15);
            case 2:
                return A08(294, 18, 25);
            case 4:
                return A08(577, 13, 9);
            case 8:
                return A08(312, 22, 114);
            case 16:
                return A08(334, 12, 65);
            case 32:
                String A08 = A08(379, 17, 100);
                String[] strArr = A03;
                if (strArr[2].length() == strArr[7].length()) {
                    A03[0] = "SoHELriMkQBcnBScVZvUK7T5g3K9Fm6N";
                    return A08;
                }
                break;
            case 64:
                if (A03[0].charAt(4) != 'k') {
                    String[] strArr2 = A03;
                    strArr2[2] = "WqW7FwrDIFS0bz5Pv3V";
                    strArr2[7] = "9aPQSHdK8ccW2UHKig7";
                    return A08(236, 26, 53);
                }
                A03[0] = "EQhP22rcQn8uHJztvMH4f7UvmkKbnpEF";
                return A08(236, 26, 53);
            case 128:
                return A08(262, 32, 83);
            case 256:
                return A08(396, 35, 46);
            case 512:
                return A08(467, 39, 58);
            case 1024:
                return A08(431, 24, 107);
            case 2048:
                return A08(506, 28, 91);
            case 4096:
                return A08(556, 21, 82);
            case 8192:
                String A082 = A08(534, 22, 125);
                String[] strArr3 = A03;
                if (strArr3[4].charAt(1) == strArr3[3].charAt(1)) {
                    String[] strArr4 = A03;
                    strArr4[2] = "qK4Dr1iI0ffiXenjEdF";
                    strArr4[7] = "zXyhBsmJjFlVcoSAhS3";
                    return A082;
                }
                break;
            case 16384:
                return A08(346, 11, 80);
            case 32768:
                return A08(455, 12, 114);
            case 65536:
                return A08(357, 10, 0);
            case 131072:
                return A08(590, 20, 99);
            default:
                return A08(610, 14, 126);
        }
        throw new RuntimeException();
    }

    private final void A0A(Rect rect) {
        this.A01.getBoundsInParent(rect);
    }

    private final void A0B(Rect rect) {
        this.A01.getBoundsInScreen(rect);
    }

    private final boolean A0C() {
        return this.A01.isCheckable();
    }

    private final boolean A0D() {
        return this.A01.isChecked();
    }

    private final boolean A0E() {
        return this.A01.isClickable();
    }

    private final boolean A0F() {
        return this.A01.isEnabled();
    }

    private final boolean A0G() {
        return this.A01.isFocusable();
    }

    private final boolean A0H() {
        return this.A01.isFocused();
    }

    private final boolean A0I() {
        return this.A01.isLongClickable();
    }

    private final boolean A0J() {
        return this.A01.isPassword();
    }

    private final boolean A0K() {
        return this.A01.isScrollable();
    }

    private final boolean A0L() {
        return this.A01.isSelected();
    }

    public final AccessibilityNodeInfo A0M() {
        return this.A01;
    }

    public final void A0N(int i) {
        this.A01.addAction(i);
    }

    public final void A0O(CharSequence charSequence) {
        this.A01.setClassName(charSequence);
    }

    public final void A0P(Object obj) {
        A04.A03(this.A01, ((C110983p) obj).A00);
    }

    public final void A0Q(Object obj) {
        A04.A04(this.A01, ((C110993q) obj).A00);
    }

    public final void A0R(boolean z) {
        this.A01.setScrollable(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C111013s c111013s = (C111013s) obj;
        if (this.A01 == null) {
            if (c111013s.A01 != null) {
                return false;
            }
        } else if (!this.A01.equals(c111013s.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A01 == null) {
            return 0;
        }
        return this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        A0A(rect);
        StringBuilder builder = new StringBuilder().append(A08(5, 18, 53));
        sb2.append(builder.append(rect).toString());
        A0B(rect);
        StringBuilder builder2 = new StringBuilder().append(A08(23, 18, 37));
        sb2.append(builder2.append(rect).toString());
        sb2.append(A08(165, 15, 60)).append(A04());
        sb2.append(A08(65, 13, 98)).append(A02());
        sb2.append(A08(218, 8, 52)).append(A05());
        sb2.append(A08(91, 22, 4)).append(A03());
        sb2.append(A08(226, 10, 41)).append(A06());
        sb2.append(A08(41, 13, 24)).append(A0C());
        sb2.append(A08(54, 11, 88)).append(A0D());
        sb2.append(A08(124, 13, 5)).append(A0G());
        sb2.append(A08(137, 11, 97)).append(A0H());
        sb2.append(A08(206, 12, 109)).append(A0L());
        sb2.append(A08(78, 13, 37)).append(A0E());
        sb2.append(A08(148, 17, 120)).append(A0I());
        sb2.append(A08(113, 11, 65)).append(A0F());
        sb2.append(A08(180, 12, 109)).append(A0J());
        StringBuilder builder3 = new StringBuilder().append(A08(192, 14, 124)).append(A0K());
        sb2.append(builder3.toString());
        sb2.append(A08(2, 3, 19));
        int A00 = A00();
        while (A00 != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(A00);
            A00 &= numberOfTrailingZeros ^ (-1);
            sb2.append(A07(numberOfTrailingZeros));
            String[] strArr = A03;
            if (strArr[1].charAt(26) != strArr[5].charAt(26)) {
                throw new RuntimeException();
            }
            A03[0] = "u7URBkmoClRMdzvgw4WX3UmEFyKryATB";
            if (A00 != 0) {
                sb2.append(A08(0, 2, 8));
            }
        }
        sb2.append(A08(LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, 1, 66));
        return sb2.toString();
    }
}
