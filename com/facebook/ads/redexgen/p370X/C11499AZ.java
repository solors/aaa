package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.AZ */
/* loaded from: assets/audience_network.dex */
public final class C11499AZ {
    public static byte[] A02;
    public static String[] A03 = {"YhFZQFr5dax73ozSX3y7z", "0btPcBid", "ccoOANicPnMaV5nGgfUfxklFPaiOf", "EI4dAbYlql723fSQ7wPmX", "GMl1WwxQIEaOrmGnDE2kCLCvMTZHsy6h", "mJA5IgjVymHjj3K0kYceOrCjwxroXsXj", "PK6Ri7QZ9VeoID4nNvuWqmskCo8ysON", "6oX6tIACB6eNkHgkORRDTyBhnrBo8d"};
    public static final C11499AZ A04;
    public final int A00;
    public final int[] A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[3] = "b4a6tq0rhenSiy1wxrgE6";
            strArr2[0] = "JlQN55oRRBTOQ1CUDCmRG";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 18);
            i4++;
        }
    }

    public static void A03() {
        A02 = new byte[]{74, 62, -111, -109, -114, -114, -115, -112, -110, -125, -126, 99, -116, -127, -115, -126, -121, -116, -123, -111, 91, -67, -15, -32, -27, -21, -65, -35, -20, -35, -34, -27, -24, -27, -16, -27, -31, -17, -41, -23, -35, -12, -65, -28, -35, -22, -22, -31, -24, -65, -21, -15, -22, -16, -71, -40, -99, -86, -96, -82, -85, -91, -96, 106, -87, -95, -96, -91, -99, 106, -99, -97, -80, -91, -85, -86, 106, -124, UnsignedBytes.MAX_POWER_OF_TWO, -119, -123, -101, 125, -111, UnsignedBytes.MAX_POWER_OF_TWO, -123, -117, -101, -116, -120, -111, -125, -58, -45, -55, -41, -44, -50, -55, -109, -46, -54, -55, -50, -58, -109, -54, -35, -39, -41, -58, -109, -90, -70, -87, -82, -76, -60, -75, -79, -70, -84, -60, -72, -71, -90, -71, -86, -106, -93, -103, -89, -92, -98, -103, 99, -94, -102, -103, -98, -106, 99, -102, -83, -87, -89, -106, 99, 122, -125, 120, -124, 121, 126, -125, 124, -120, -50, -37, -47, -33, -36, -42, -47, -101, -38, -46, -47, -42, -50, -101, -46, -27, -31, -33, -50, -101, -70, -82, -59, -52, -80, -75, -82, -69, -69, -78, -71, -52, -80, -68, -62, -69, -63};
    }

    static {
        A03();
        A04 = new C11499AZ(new int[]{2}, 2);
    }

    public C11499AZ(int[] iArr, int i) {
        if (iArr != null) {
            this.A01 = Arrays.copyOf(iArr, iArr.length);
            Arrays.sort(this.A01);
        } else {
            this.A01 = new int[0];
        }
        this.A00 = i;
    }

    public static C11499AZ A00(Context context) {
        return A01(AbstractC12116L4.A00(context, null, new IntentFilter(A02(56, 36, 42))));
    }

    public static C11499AZ A01(Intent intent) {
        if (intent == null || intent.getIntExtra(A02(92, 36, 83), 0) == 0) {
            return A04;
        }
        return new C11499AZ(intent.getIntArrayExtra(A02(128, 29, 35)), intent.getIntExtra(A02(157, 37, 91), 0));
    }

    public final boolean A04(int i) {
        return Arrays.binarySearch(this.A01, i) >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (java.util.Arrays.equals(r5.A01, r6.A01) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r5.A00 != r6.A00) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
        if (java.util.Arrays.equals(r5.A01, r6.A01) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 1
            if (r5 != r6) goto L4
            return r4
        L4:
            boolean r3 = r6 instanceof com.facebook.ads.redexgen.p370X.C11499AZ
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11499AZ.A03
            r0 = 4
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 22
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L20
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L20:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11499AZ.A03
            java.lang.String r1 = "w1USCXg8ZjnjNvDZ7X2MerCQwxzm0Nu8"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "U4AkfkKqs2F6cZLTDE14qhCk0AeglZbB"
            r0 = 5
            r2[r0] = r1
            r0 = 0
            if (r3 != 0) goto L30
            return r0
        L30:
            java.lang.String[] r1 = com.facebook.ads.redexgen.p370X.C11499AZ.A03
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 16
            if (r1 == r0) goto L57
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11499AZ.A03
            java.lang.String r1 = ""
            r0 = 1
            r2[r0] = r1
            com.facebook.ads.redexgen.X.AZ r6 = (com.facebook.ads.redexgen.p370X.C11499AZ) r6
            int[] r1 = r5.A01
            int[] r0 = r6.A01
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L70
        L50:
            int r1 = r5.A00
            int r0 = r6.A00
            if (r1 != r0) goto L70
        L56:
            return r4
        L57:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11499AZ.A03
            java.lang.String r1 = "wah0xQyFlUnv3HrXTdrAvgDlPnbONWV"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "LcutVO6kpZJheUIWjBQzEq2ri8qFF"
            r0 = 2
            r2[r0] = r1
            com.facebook.ads.redexgen.X.AZ r6 = (com.facebook.ads.redexgen.p370X.C11499AZ) r6
            int[] r1 = r5.A01
            int[] r0 = r6.A01
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L70
            goto L50
        L70:
            r4 = 0
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11499AZ.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.A00 + (Arrays.hashCode(this.A01) * 31);
    }

    public final String toString() {
        return A02(21, 34, 106) + this.A00 + A02(0, 21, 12) + Arrays.toString(this.A01) + A02(55, 1, 105);
    }
}
