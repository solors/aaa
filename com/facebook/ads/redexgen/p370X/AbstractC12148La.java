package com.facebook.ads.redexgen.p370X;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.La */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12148La {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{62, 50, 48, 115, 59, 60, 62, 56, 63, 50, 50, 54, 115, 54, 60, 41, 60, 51, 60};
    }

    public static PackageInfo A00(C113257j c113257j) {
        return A01(c113257j, A02(0, 19, 49));
    }

    public static PackageInfo A01(C113257j c113257j, String str) {
        PackageManager packageManager;
        if (TextUtils.isEmpty(str) || (packageManager = c113257j.getPackageManager()) == null) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(str, 1);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    public static boolean A04(C113257j c113257j, String str) {
        PackageInfo packageInfo = A01(c113257j, str);
        return packageInfo != null;
    }
}
