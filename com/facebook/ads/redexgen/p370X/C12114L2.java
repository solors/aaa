package com.facebook.ads.redexgen.p370X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.common.primitives.SignedBytes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlayAdError;
import io.bidmachine.protobuf.EventTypeExtended;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.L2 */
/* loaded from: assets/audience_network.dex */
public final class C12114L2 {
    public static byte[] A00;
    public static String[] A01 = {"T4dPy6oALRnRtXie0LYtNa7PXoaz5xNV", "GuB", "", "N5ZcwGbFLOfjQt8i7LOYdNhhAY9bfZ8J", "XGEF2r9HzP4eyBZiq0puzcaX55o", "r68Pu4BAqG0jUrZ19Ek7iVXcY822rh1q", "w97ZnD7u", "Y1Vl"};

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{77, 66, 83, 74, 78, 56, 77, 83, 95, 73, 79, 89, 94, 73, 83, 88, 67, 71, 73, 66, 84, 91, 74, 82, 69, 70, 74, 84, 81, 74, 86, 90, 91, 65, 80, 91, 65, 85, 87, 90, 90, 83, 68, 73, 82, 89, 91, 87, 95, 88, 88, 122, 117, 60, 111, 59, 104, 111, 122, 105, 111, 59, 90, 110, Byte.MAX_VALUE, 114, 126, 117, 120, 126, 85, 126, 111, 108, 116, 105, 112, 90, 120, 111, 114, 109, 114, 111, 98, 53, 59, 86, 122, 112, 126, 59, 104, 110, 105, 126, 59, 111, 115, 122, 111, 59, 114, 111, 60, 104, 59, 114, 117, 59, 98, 116, 110, 105, 59, 90, 117, Byte.MAX_VALUE, 105, 116, 114, Byte.MAX_VALUE, 86, 122, 117, 114, 125, 126, 104, 111, 53, 99, 118, 119, 59, 125, 114, 119, 126, 53, 28, 1, 13, 11, 24, 6, 12, 11, 21, 21, 17, 18, 38, 55, 58, 54, 61, 48, 54, 29, 54, 39, 36, 60, 33, 56, 26, 104, SignedBytes.MAX_POWER_OF_TWO, 79, 126, SignedBytes.MAX_POWER_OF_TWO, 66, 85, 72, 87, 72, 85, 88, 41, 38, 44, 58, 39, 33, 44, 36, 43, 33, 55, 42, 44, 33, 107, 44, 43, 49, 32, 43, 49, 107, 36, 38, 49, 44, 42, 43, 107, 19, 12, 0, 18, 58, 53, 63, 41, 52, 50, 63, 117, 50, 53, 47, 62, 53, 47, 117, 56, 58, 47, 62, 60, 52, 41, 34, 117, 25, 9, 20, 12, 8, 26, 25, 23, 30, 112, 125, 125, 126, 70, 86, 75, 83, 87, 65, 86, 113, 118, 104, 50, 48, 61, 61, 52, 35, 24, 53, 20, 22, 27, 27, 18, 5, 35, 14, 7, 18, 54, 57, 60, 48, 59, 33, 1, 58, 62, 48, 59, 113, 125, Byte.MAX_VALUE, 60, 115, 124, 118, 96, 125, 123, 118, 60, 112, 96, 125, 101, 97, 119, 96, 60, 115, 98, 98, 126, 123, 113, 115, 102, 123, 125, 124, 77, 123, 118, 15, 3, 1, 66, 13, 2, 8, 30, 3, 5, 8, 66, 26, 9, 2, 8, 5, 2, 11, 103, 107, 105, 42, 98, 101, 103, 97, 102, 107, 107, 111, 42, 99, 107, 107, 99, 104, 97, 116, 104, 101, 125, 119, 112, 107, 118, 97, 101, 106, 42, 67, 107, 107, 99, 104, 97, 84, 104, 101, 125, 87, 112, 107, 118, 97, 69, 74, 75, 114, 97, 118, 104, 101, 125, 65, 124, 112, 97, 118, 106, 101, 104, 69, 103, 112, 109, 114, 109, 112, 125, 109, 97, 99, 32, 104, 111, 109, 107, 108, 97, 97, 101, 32, 101, 111, 122, 111, 96, 111, 66, 78, 79, 71, 72, 70, 126, 82, 84, 81, 81, 78, 83, 85, 82, 108, 84, 77, 85, 72, 118, 72, 79, 69, 78, 86, 3, 15, 14, 6, 9, 7, 63, 19, 21, 16, 16, 15, 18, 20, 19, 51, 16, 12, 9, 20, 51, 3, 18, 5, 5, 14, 45, 21, 12, 20, 9, 55, 9, 14, 4, 15, 23, 5, 20, 3, 7, 18, 3, 57, 8, 3, 17, 57, 18, 7, 4, 75, 79, 4, 11, 14, 22, 7, 16, 7, 6, 61, 1, 14, 11, 1, 9, 61, 6, 7, 14, 3, 27, 61, 15, 17, 39, 46, 33, 43, 35, 42, 61, 27, 38, 34, 42, 23, 11, 11, 15, 36, 56, 56, 60, 118, 99, 99, 60, 32, 45, 53, 98, 43, 35, 35, 43, 32, 41, 98, 47, 35, 33, 99, 63, 56, 35, 62, 41, 99, 45, 60, 60, 63, 99, 38, 58, 58, 62, 61, 83, 94, 24, 31, 2, 5, 16, 31, 5, 46, 22, 16, 28, 20, 2, SignedBytes.MAX_POWER_OF_TWO, 90, 118, 74, 72, 74, 118, 79, SignedBytes.MAX_POWER_OF_TWO, 69, 93, 76, 91, 118, 74, 69, SignedBytes.MAX_POWER_OF_TWO, 74, 66, 90, 118, 70, 71, 118, 74, 93, 72, 61, 39, 11, 55, 38, 49, 53, 32, 61, 34, 49, 11, 53, 39, 11, 55, 32, 53, 11, 34, 102, 9, 5, 22, 15, 1, 16, 104, 113, 98, 117, 107, 102, 126, 74, 86, 91, 67, 20, 93, 85, 85, 93, 86, 95, 20, 89, 85, 87, 59, 44, 58, 32, 51, 44, 4, 38, 45, 44, 50, 41, 46, 54, 50, 34, 14, 35, 32, 63, 51, 33, 2, 47, 38, 51};
    }

    static {
        A08();
    }

    private int A00(C13029Zs c13029Zs) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = c13029Zs.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(A06(412, 19, 65), 0)) != null && !TextUtils.isEmpty(packageInfo.versionName)) {
                return Integer.parseInt(packageInfo.versionName.split(A06(166, 2, 9), 2)[0]);
            }
            return -1;
        } catch (PackageManager.NameNotFoundException | NumberFormatException unused) {
            return -1;
        }
    }

    public static Intent A01(Uri uri) {
        Intent intent = new Intent(A06(186, 26, 10), uri);
        intent.setComponent(null);
        if (Build.VERSION.SDK_INT >= 15) {
            intent.setSelector(null);
        }
        return intent;
    }

    public static Intent A02(C13029Zs c13029Zs, Uri uri) {
        Intent A012 = A01(uri);
        A012.addCategory(A06(212, 33, 20));
        A012.addFlags(268435456);
        A012.putExtra(A06(288, 34, 93), c13029Zs.getPackageName());
        A012.putExtra(A06(494, 14, 41), false);
        if (C11979Im.A1u(c13029Zs)) {
            if (A06(508, 2, 98).equals(uri.getScheme())) {
                A012.setPackage(A06(412, 19, 65));
            }
        }
        return A012;
    }

    public static Intent A03(C13029Zs c13029Zs, Uri uri) {
        Intent A012 = A01(uri);
        A012.setPackage(A06(322, 19, 35));
        A012.putExtra(A06(259, 8, 30), c13029Zs.getPackageName());
        A012.putExtra(A06(656, 7, 72), true);
        return A012;
    }

    private final EnumC109060g A04(C13029Zs c13029Zs, Uri uri, String str, Map<String, String> map) throws C12102Ko {
        boolean A05 = AbstractC11980In.A05(c13029Zs);
        boolean isInAppBrowserEnabled = A0E(uri);
        if (isInAppBrowserEnabled && A05) {
            A0B(c13029Zs, uri, str, map);
            EnumC109060g enumC109060g = EnumC109060g.A08;
            if (A01[7].length() != 30) {
                String[] strArr = A01;
                strArr[2] = "";
                strArr[1] = "Q7p";
                return enumC109060g;
            }
            throw new RuntimeException();
        }
        c13029Zs.A0E().A94(A05);
        A09(c13029Zs, uri);
        return EnumC109060g.A07;
    }

    public static EnumC109060g A05(C12114L2 c12114l2, C13029Zs c13029Zs, Uri uri, String str, Map<String, String> extraData) throws C12102Ko {
        boolean z = A0E(uri) && A06(EventTypeExtended.EVENT_TYPE_EXTENDED_SK_OVERLAY_DISMISSING_VALUE, 15, 117).equals(uri.getHost());
        boolean isGooglePlayWebLink = A06(650, 6, 43).equals(uri.getScheme());
        if (!isGooglePlayWebLink && !z) {
            return c12114l2.A04(c13029Zs, uri, str, extraData);
        }
        try {
            c12114l2.A0A(c13029Zs, uri, str);
            return EnumC109060g.A03;
        } catch (C12112L0 unused) {
            return c12114l2.A04(c13029Zs, uri, str, extraData);
        }
    }

    private String A07(String str) {
        return Base64.encodeToString(str.getBytes(), 0);
    }

    private void A09(C13029Zs c13029Zs, Uri uri) throws C12102Ko {
        C12104Kq.A0C(c13029Zs, A02(c13029Zs, uri));
    }

    private final void A0A(C13029Zs c13029Zs, Uri uri, String str) throws C12112L0, C12102Ko {
        if (A0G(c13029Zs)) {
            if (C11979Im.A1B(c13029Zs)) {
                String queryParameter = uri.getQueryParameter(A06(587, 2, 117));
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (A01[3].charAt(29) != 'Z') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[4] = "AXwrjbGi2NqoDqohSkmHlyhQGK6";
                    strArr[6] = "xSKC0PNk";
                    String A06 = A06(589, 13, 62);
                    String packageName = uri.toString();
                    AbstractC110092M.A03(queryParameter, A06, packageName);
                }
            }
            boolean z = (c13029Zs.A0G().A01() && C11979Im.A1W(c13029Zs)) || (C11979Im.A1v(c13029Zs) && A0H(c13029Zs));
            if (!z) {
                boolean shouldTryToOpenSplitScreen = C11979Im.A2H(c13029Zs);
                if (shouldTryToOpenSplitScreen) {
                    boolean shouldTryToOpenSplitScreen2 = C12104Kq.A0D(c13029Zs, A03(c13029Zs, uri));
                    if (shouldTryToOpenSplitScreen2) {
                        return;
                    }
                }
            }
            boolean A0K = A0K(c13029Zs, uri, str);
            if (A01[3].charAt(29) != 'Z') {
                A01[7] = "w5Gj6271lmeoEbiTTMEsWTdaWp";
                if (A0K) {
                    return;
                }
            } else {
                A01[3] = "TMuIQjN9vpUXBqY7VYY4Z8DVMg5lcZnK";
                if (A0K) {
                    return;
                }
            }
            Intent A02 = A02(c13029Zs, uri);
            A02.setPackage(A06(322, 19, 35));
            if (Build.VERSION.SDK_INT >= 24 && z) {
                A02.addFlags(268472320);
            }
            C12104Kq.A0C(c13029Zs, A02);
            return;
        }
        throw new C12112L0();
    }

    private void A0B(C13029Zs c13029Zs, Uri uri, String str, Map<String, String> extraData) {
        AdActivityIntent A04 = C12104Kq.A04(c13029Zs);
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            A04.addFlags(268435456);
        }
        A04.putExtra(A06(696, 8, 25), EnumC12069KG.A03);
        A04.putExtra(A06(249, 10, 107), uri.toString());
        A04.putExtra(A06(277, 11, 26), str);
        A04.putExtra(A06(533, 11, 0), System.currentTimeMillis());
        if (extraData != null) {
            String A06 = A06(267, 10, 56);
            A04.putExtra(A06, extraData.get(A06));
            String A062 = A06(LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, 21, 27);
            A04.putExtra(A062, extraData.get(A062));
            String A063 = A06(602, 27, 102);
            A04.putExtra(A063, extraData.get(A063));
            String A064 = A06(510, 23, 45);
            A04.putExtra(A064, extraData.get(A064));
            String A065 = A06(688, 8, 8);
            String str2 = extraData.get(A065);
            if (str2 != null) {
                A04.putExtra(A065, str2);
            }
        }
        try {
            C12104Kq.A0A(c13029Zs, A04);
        } catch (C12102Ko e) {
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            c13029Zs.A07().AA0(A06(168, 11, 110), AbstractC113568E.A0D, new C113578F(th));
            Log.e(A06(149, 17, 28), A06(50, 90, 84), th);
        }
    }

    public static void A0C(C12114L2 c12114l2, C13029Zs c13029Zs, Uri uri, String str) {
        c12114l2.A0L(c13029Zs, uri, str);
    }

    public static void A0D(C12114L2 c12114l2, C13029Zs c13029Zs, Uri uri, String str) throws C12102Ko {
        A05(c12114l2, c13029Zs, uri, str, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r0 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0E(android.net.Uri r5) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            r4 = 0
            if (r1 < r0) goto L1f
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r0 = r0.isCleartextTrafficPermitted()
            if (r0 != 0) goto L1f
            android.security.NetworkSecurityPolicy r1 = android.security.NetworkSecurityPolicy.getInstance()
            java.lang.String r0 = r5.getHost()
            boolean r0 = r1.isCleartextTrafficPermitted(r0)
            if (r0 == 0) goto L45
        L1f:
            r0 = 1
        L20:
            java.lang.String r3 = r5.getScheme()
            if (r0 == 0) goto L35
            r2 = 544(0x220, float:7.62E-43)
            r1 = 4
            r0 = 48
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L43
        L35:
            r2 = 582(0x246, float:8.16E-43)
            r1 = 5
            r0 = 1
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L44
        L43:
            r4 = 1
        L44:
            return r4
        L45:
            r0 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12114L2.A0E(android.net.Uri):boolean");
    }

    private boolean A0F(C13029Zs c13029Zs) {
        if (C11979Im.A19(c13029Zs)) {
            int deviceFBVersion = C11979Im.A0E(c13029Zs);
            int A002 = A00(c13029Zs);
            if (deviceFBVersion == -1 || A002 == -1 || deviceFBVersion > A002) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[6];
            int length = str.length();
            int fbVersionWithGPOverlay = str2.length();
            if (length != fbVersionWithGPOverlay) {
                A01[7] = "9F";
                if (i < 28) {
                    return false;
                }
                String[] strArr2 = A01;
                String str3 = strArr2[2];
                String str4 = strArr2[1];
                int length2 = str3.length();
                int fbVersionWithGPOverlay2 = str4.length();
                if (length2 != fbVersionWithGPOverlay2) {
                    String[] strArr3 = A01;
                    strArr3[4] = "HTEWLbQNfCJbfH7LEcJTogLCYG9";
                    strArr3[6] = "jIuteURS";
                    return true;
                }
                return true;
            }
            throw new RuntimeException();
        }
        return false;
    }

    private boolean A0G(C13029Zs c13029Zs) {
        Intent playStoreIntent = new Intent(A06(186, 26, 10), AbstractC12117L5.A00(A06(548, 34, 3)));
        Iterator<ResolveInfo> it = c13029Zs.getPackageManager().queryIntentActivities(playStoreIntent, 0).iterator();
        do {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[5].charAt(7) != strArr[0].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "NqbTETCkL6wtg2G74gvKWlTJws9";
            strArr2[6] = "JszVyiBC";
            if (!hasNext) {
                return false;
            }
        } while (!it.next().activityInfo.applicationInfo.packageName.equals(A06(322, 19, 35)));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
        if (r0 != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
        r9 = android.content.res.Resources.getSystem().getBoolean(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
        r1 = r4.getIdentifier(A06(457, 37, 47), r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
        if (r1 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
        r10 = android.content.res.Resources.getSystem().getBoolean(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
        r11 = com.facebook.ads.redexgen.p370X.AbstractC12126LE.A0C(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
        if (r9 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
        if (r10 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
        if (r11 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
        r8 = r8 & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
        if (r0 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0H(com.facebook.ads.redexgen.p370X.C13029Zs r12) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12114L2.A0H(com.facebook.ads.redexgen.X.Zs):boolean");
    }

    public static boolean A0I(C13029Zs c13029Zs) {
        Activity A0D;
        PackageManager packageManager;
        ActivityInfo activityInfo;
        try {
            A0D = c13029Zs.A0D();
            packageManager = c13029Zs.getPackageManager();
        } catch (PackageManager.NameNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            c13029Zs.A0E().AAV(e.getMessage());
        }
        if (A0D == null || packageManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT > 32) {
            activityInfo = packageManager.getActivityInfo(A0D.getComponentName(), PackageManager.ComponentInfoFlags.of(0L));
        } else {
            activityInfo = packageManager.getActivityInfo(A0D.getComponentName(), 128);
        }
        Field declaredField = ActivityInfo.class.getDeclaredField(A06(678, 10, 6));
        declaredField.setAccessible(true);
        Object obj = declaredField.get(activityInfo);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() != 0;
        }
        return false;
    }

    private boolean A0J(C13029Zs c13029Zs, Uri uri, String str) throws C12102Ko {
        try {
            Activity A0D = c13029Zs.A0D();
            String uri2 = uri.toString();
            if (A0D != null && !TextUtils.isEmpty(uri2)) {
                Intent fbIntent = new Intent();
                if (C11979Im.A1A(c13029Zs)) {
                    String A06 = AbstractC13171cD.A06(str);
                    if (TextUtils.isEmpty(A06)) {
                        return false;
                    }
                    fbIntent.putExtra(A06(0, 20, 67), A07(A06));
                }
                fbIntent.setComponent(new ComponentName(A06(412, 19, 65), A06(FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS, 71, 75)));
                fbIntent.putExtra(A06(IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 9, 22), uri2);
                fbIntent.putExtra(A06(37, 13, 89), A07(A06(20, 17, 90)));
                if (!C12104Kq.A0D(c13029Zs, fbIntent)) {
                    A0D.startActivityForResult(fbIntent, 2);
                    return true;
                }
                return true;
            }
            return false;
        } catch (ActivityNotFoundException | IllegalStateException e) {
            c13029Zs.A0E().AA4(e.getMessage());
            return false;
        }
    }

    private boolean A0K(C13029Zs c13029Zs, Uri uri, String str) throws C12102Ko {
        return A0F(c13029Zs) && A0J(c13029Zs, uri, str);
    }

    private final boolean A0L(C13029Zs c13029Zs, Uri uri, String str) {
        return C12104Kq.A0H(c13029Zs, uri, str);
    }

    public static boolean A0M(C12114L2 c12114l2, C13029Zs c13029Zs, Uri uri, String str) {
        try {
            A0D(c12114l2, c13029Zs, uri, str);
            return true;
        } catch (C12102Ko e) {
            Throwable cause = e.getCause();
            Throwable exceptionToLog = e;
            if (cause != null) {
                exceptionToLog = e.getCause();
            }
            c13029Zs.A07().AA0(A06(168, 11, 110), AbstractC113568E.A05, new C113578F(exceptionToLog));
            return false;
        }
    }
}
