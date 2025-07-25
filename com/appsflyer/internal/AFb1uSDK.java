package com.appsflyer.internal;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes2.dex */
public final class AFb1uSDK {
    @Nullable
    public static Boolean AFInAppEventParameterName;
    static String values;

    @Nullable
    public static AFa1cSDK AFInAppEventType(ContentResolver contentResolver) {
        String str;
        if (values() && contentResolver != null && AppsFlyerProperties.getInstance().getString("amazon_aid") == null && "Amazon".equals(Build.MANUFACTURER)) {
            int i = Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING, 2);
            if (i == 0) {
                return new AFa1cSDK(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
            }
            if (i == 2) {
                return null;
            }
            try {
                str = Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (Throwable th) {
                AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
                str = "";
            }
            return new AFa1cSDK(str, Boolean.TRUE);
        }
        return null;
    }

    private static boolean values() {
        Boolean bool = AFInAppEventParameterName;
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c A[RETURN] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.appsflyer.internal.AFa1cSDK AFInAppEventType(android.content.Context r5) {
        /*
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = com.appsflyer.internal.AFb1uSDK.values
            r2 = 1
            if (r1 == 0) goto Lb
            r3 = r2
            goto Lc
        Lb:
            r3 = 0
        Lc:
            r4 = 0
            if (r3 == 0) goto L11
        Lf:
            r5 = r4
            goto L4e
        L11:
            java.lang.Boolean r1 = com.appsflyer.internal.AFb1uSDK.AFInAppEventParameterName
            if (r1 == 0) goto L1b
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L27
        L1b:
            java.lang.Boolean r1 = com.appsflyer.internal.AFb1uSDK.AFInAppEventParameterName
            if (r1 != 0) goto L4c
            java.lang.String r1 = "collectOAID"
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L4c
        L27:
            com.appsflyer.oaid.OaidClient r1 = new com.appsflyer.oaid.OaidClient     // Catch: java.lang.Throwable -> L45
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L45
            boolean r5 = r0.isEnableLog()     // Catch: java.lang.Throwable -> L45
            r1.setLogging(r5)     // Catch: java.lang.Throwable -> L45
            com.appsflyer.oaid.OaidClient$Info r5 = r1.fetch()     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L4c
            java.lang.String r0 = r5.getId()     // Catch: java.lang.Throwable -> L45
            java.lang.Boolean r5 = r5.getLat()     // Catch: java.lang.Throwable -> L43
            r1 = r0
            goto L4e
        L43:
            r1 = r0
            goto L46
        L45:
            r1 = r4
        L46:
            java.lang.String r5 = "No OAID library"
            com.appsflyer.AFLogger.afDebugLog(r5)
            goto Lf
        L4c:
            r5 = r4
            r1 = r5
        L4e:
            if (r1 == 0) goto L5c
            com.appsflyer.internal.AFa1cSDK r0 = new com.appsflyer.internal.AFa1cSDK
            r0.<init>(r1, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r0.AFKeystoreWrapper = r5
            return r0
        L5c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1uSDK.AFInAppEventType(android.content.Context):com.appsflyer.internal.AFa1cSDK");
    }
}
