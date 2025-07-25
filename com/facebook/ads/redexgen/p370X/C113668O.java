package com.facebook.ads.redexgen.p370X;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8O */
/* loaded from: assets/audience_network.dex */
public final class C113668O {
    public static byte[] A02;
    public static String[] A03 = {"ksHi49HeyLxhEuEQ3ZpH94jUoJqLqgaO", "OjCJx3NFQ0DFgiyf16DgggNozGEs4R4q", "GEO9tIl26J6KBxgfZlF82GfP7HtNAY9Z", "nOASZQwcdTvox6Zrqcm6Ob1f72Bs0sPe", "97ugpJwHRGNEpoGk3FmXenG", "0hX3UIoeWP89IzRfugcPHePTUXouBxgf", "dDjk4aEiSkmoIE6VCcWXk7EEukMkdVWT", "2G0bY4RpV1kXQIyv7KcyHSXfT8fWnCKY"};
    public static final String A04;
    public final C113257j A00;
    public final String A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 19);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-57, -44, -54, -40, -43, -49, -54, -108, -42, -53, -40, -45, -49, -39, -39, -49, -43, -44, -108, -88, -81, -76, -86, -59, -89, -87, -87, -85, -71, -71, -81, -88, -81, -78, -81, -70, -65, -59, -71, -85, -72, -68, -81, -87, -85, -103, -105, -96, -105, -92, -101, -107, -65, -73, -66, -67, -76};
    }

    static {
        A02();
        A04 = Build.VERSION.RELEASE;
    }

    public C113668O(C113257j c113257j) {
        this(c113257j, null);
    }

    public C113668O(C113257j c113257j, String str) {
        this.A00 = c113257j;
        this.A01 = str;
    }

    private String A00() {
        int i;
        if (this.A01 != null) {
            return this.A01;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            i = 67108864;
        } else {
            i = 0;
        }
        PendingIntent activity = PendingIntent.getActivity(this.A00, 0, new Intent(), i);
        if (activity == null) {
            return A01(0, 0, 54);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            return activity.getCreatorPackage();
        }
        return activity.getTargetPackage();
    }

    public final int A03() {
        return AbstractC12126LE.A01(this.A00);
    }

    public final int A04() {
        try {
            return this.A00.getPackageManager().getPackageInfo(A00(), 0).versionCode;
        } catch (Throwable t) {
            this.A00.A07().AA0(A01(45, 7, 31), AbstractC113568E.A1M, new C113578F(t));
            return 0;
        }
    }

    public final String A05() {
        try {
            CharSequence appLabel = this.A00.getPackageManager().getApplicationLabel(this.A00.getPackageManager().getApplicationInfo(A00(), 0));
            if (appLabel != null && appLabel.length() > 0) {
                return appLabel.toString();
            }
        } catch (Throwable th) {
            this.A00.A07().AA0(A01(45, 7, 31), AbstractC113568E.A1M, new C113578F(th));
        }
        return A01(0, 0, 54);
    }

    public final String A06() {
        String str = null;
        try {
            str = this.A00.getPackageManager().getPackageInfo(A00(), 0).versionName;
        } catch (Throwable t) {
            InterfaceC113558D A07 = this.A00.A07();
            int i = AbstractC113568E.A1M;
            C113578F c113578f = new C113578F(t);
            String appVersionName = A01(45, 7, 31);
            A07.AAS(appVersionName, i, c113578f);
        }
        return !TextUtils.isEmpty(str) ? str : A01(0, 0, 54);
    }

    public final String A07() {
        String bundleOverride = this.A00.A04().A6c();
        if (bundleOverride != null) {
            return bundleOverride;
        }
        return A00();
    }

    public final String A08() {
        TelephonyManager telephonyManager = (TelephonyManager) this.A00.getSystemService(A01(52, 5, 60));
        if (telephonyManager != null) {
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (A03[2].charAt(10) != '6') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "Y0rO6junFBlFHafjvJcSeB7fUCyZ4Mo6";
            strArr[7] = "E4dacaRM3DS0bJ8W8Pcl72SYoh6IL0u8";
            if (networkOperatorName != null && networkOperatorName.length() > 0) {
                return networkOperatorName;
            }
        }
        return A01(0, 0, 54);
    }

    public final String A09() {
        if (Build.MANUFACTURER != null) {
            String str = Build.MANUFACTURER;
            String[] strArr = A03;
            if (strArr[3].charAt(20) == strArr[0].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[3] = "17co7YvrhvaQQJ3lRMCxQ7nYKJi0wzqK";
            strArr2[0] = "xVh8HKEIQLp4oZwybdpyhu7U8ElYQBbb";
            if (str.length() > 0) {
                return Build.MANUFACTURER;
            }
        }
        return A01(0, 0, 54);
    }

    public final String A0A() {
        return (Build.MODEL == null || Build.MODEL.length() <= 0) ? A01(0, 0, 54) : Build.MODEL;
    }

    public final String A0B() {
        String installer_name;
        try {
            String A00 = A00();
            if (A00 != null && A00.length() >= 0 && (installer_name = this.A00.getPackageManager().getInstallerPackageName(A00)) != null) {
                if (installer_name.length() > 0) {
                    return installer_name;
                }
            }
        } catch (Throwable th) {
            this.A00.A07().AAS(A01(45, 7, 31), AbstractC113568E.A1M, new C113578F(th));
        }
        return A01(0, 0, 54);
    }

    public final boolean A0C() {
        return this.A00.checkCallingOrSelfPermission(A01(0, 45, 83)) == 0;
    }
}
