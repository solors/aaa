package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import com.ironsource.C21114v8;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.AdGlobalSdk;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.cii2c2 */
/* loaded from: classes8.dex */
public class C32458cii2c2 {
    private static final Set<String> c2oc2i = new HashSet(Arrays.asList("AT", "BE", "BG", "CY", "CZ", "DE", "DK", "EE", "ES", "FI", "FR", "GB", "GR", "HR", "HU", "IE", "IT", "LT", "LU", "LV", "MT", "NL", "PL", "PT", "RO", "SE", "SI", "SK"));
    private static final String coi222o222 = "com.zeus.gmc.sdk.mobileads.columbus.cmpLib.CMPLib";
    private static final String coo2iico = "GMC";

    public static boolean c2oc2i() {
        try {
            Object obj = Class.forName("miui.os.Build").getField("IS_INTERNATIONAL_BUILD").get(null);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean coi222o222() {
        return c2oc2i.contains(C32464ciio2c.coo2iico("ro.miui.region", "unknown"));
    }

    public static boolean coo2iico(Context context) {
        if (coi222o222()) {
            return coi222o222(context);
        }
        return true;
    }

    public static boolean coi222o222(Context context) {
        Boolean gDPRConsent = AdGlobalSdk.getGDPRConsent();
        if (gDPRConsent == null) {
            return true;
        }
        MLog.m25887i(coo2iico, "user set gdpr = " + gDPRConsent);
        if (!gDPRConsent.booleanValue()) {
            MLog.m25887i(coo2iico, "isPersonalizedAdEnabled: false");
            return false;
        }
        try {
            Object invoke = Class.forName("android.provider.MiuiSettings$Ad").getDeclaredMethod("isPersonalizedAdEnabled", ContentResolver.class).invoke(null, context.getContentResolver());
            MLog.m25887i(coo2iico, "isPersonalizedAdEnabled: " + invoke);
            if (invoke instanceof Boolean) {
                return ((Boolean) invoke).booleanValue();
            }
        } catch (Exception unused) {
            MLog.m25889e(coo2iico, "isPersonalizedAdEnabled exception");
        }
        MLog.m25887i(coo2iico, "isPersonalizedAdEnabled: true");
        return true;
    }

    public static void coo2iico(Activity activity) {
        try {
            Class.forName(coi222o222).getMethod("onCreate", Activity.class).invoke(null, activity);
        } catch (Exception unused) {
        }
    }

    public static void c2oc2i(Activity activity) {
        try {
            Class.forName(coi222o222).getMethod(C21114v8.C21122h.f54094u0, Activity.class).invoke(null, activity);
        } catch (Exception unused) {
        }
    }

    public static void coo2iico() {
        try {
            Class.forName(coi222o222).getMethod("reviewPrivacy", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public static void coi222o222(Activity activity) {
        try {
            Class.forName(coi222o222).getMethod("onDestroy", Activity.class).invoke(null, activity);
        } catch (Exception unused) {
        }
    }
}
