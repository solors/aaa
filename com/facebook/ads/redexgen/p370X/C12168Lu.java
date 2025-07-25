package com.facebook.ads.redexgen.p370X;

import android.util.Log;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Lu */
/* loaded from: assets/audience_network.dex */
public final class C12168Lu {
    public static byte[] A00;
    public static String[] A01 = {"kzsYhm9LKsU0BkYF5GBD4cHOfO5I2S", "FiiX6q", "juV27aOscABEXHLMFQmBucT", "1EXxaj", "f1sOyyKe81qkTfSynlEtElAllv4GRKo", "lzeqJRba", "GXB72S", "F9UQYukVDOEwI1lxcupNtKixpZh4OtVr"};
    public static final InterfaceC12167Lt A02 = null;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{SignedBytes.MAX_POWER_OF_TWO, 75, 86, 3, 23, 8, 20, 21, 18, 16, 50, 61, 116, 39, 115, 53, 60, 33, 62, 50, 39, 115, 39, 58, 62, 54, 125};
    }

    static {
        A07();
    }

    public static long A00() {
        if (A02 != null) {
            return A02.A5M();
        }
        return System.currentTimeMillis();
    }

    public static long A01(long j) {
        if (j == -1) {
            return -1L;
        }
        return System.currentTimeMillis() - j;
    }

    public static String A02(double d) {
        try {
            return String.format(Locale.US, A03(0, 4, 115), Double.valueOf(d));
        } catch (Exception e) {
            String simpleName = C12168Lu.class.getSimpleName();
            if (A01[3].length() == 20) {
                Exception e2 = new RuntimeException();
                throw e2;
            }
            A01[0] = "ylDYykVZ0MQgZWbzvTC4Y0QCoTAruV";
            Log.e(simpleName, A03(9, 18, 69), e);
            return A03(4, 5, 48);
        }
    }

    public static String A04(long j) {
        return String.valueOf(A01(j));
    }

    @Deprecated
    public static String A05(long j) {
        return A02(j / 1000.0d);
    }

    public static String A06(long j) {
        return Long.toString(j);
    }
}
