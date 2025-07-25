package com.zeus.gmc.sdk.mobileads.msa.adjump.internal.uppjpjj;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import com.zeus.gmc.sdk.mobileads.msa.adjump.common.MLog;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.zeus.gmc.sdk.mobileads.msa.adjump.internal.uppjpjj.jujujpjjp */
/* loaded from: classes8.dex */
public class C32793jujujpjjp {
    private static final int jjuuju = -1;
    private static final String jujujpjjp = "AdJumpCommonUtils";
    private static final int puujujuupp = -2;
    private static final Set<String> uppjpjj = new HashSet(Arrays.asList("AT", "BE", "BG", "CY", "CZ", "DE", "DK", "EE", "ES", "FI", "FR", "GB", "GR", "HR", "HU", "IE", "IT", "LT", "LU", "LV", "MT", "NL", "PL", "PT", "RO", "SE", "SI", "SK"));

    private C32793jujujpjjp() {
    }

    public static int jujujpjjp(Context context) {
        return jujujpjjp(context, context.getPackageName());
    }

    public static boolean uppjpjj() {
        return jupppjuju.jujujpjjp("ro.product.mod_device", "").contains("_global");
    }

    public static int jujujpjjp(Context context, String str) {
        PackageInfo jujujpjjp2 = jujujpjjp(context, str, 0);
        if (jujujpjjp2 == null) {
            return -1;
        }
        if (jujujpjjp2.applicationInfo.enabled) {
            return jujujpjjp2.versionCode;
        }
        return -2;
    }

    public static boolean uppjpjj(Context context, String str) {
        try {
            Object invoke = Class.forName(str).getDeclaredMethod("isPersonalizedAdEnabled", ContentResolver.class).invoke(null, context.getContentResolver());
            if (invoke instanceof Boolean) {
                return ((Boolean) invoke).booleanValue();
            }
        } catch (Exception e) {
            MLog.m25878e(jujujpjjp, "isPersonalizedAdEnabled exception: ", e);
        }
        return false;
    }

    public static PackageInfo jujujpjjp(Context context, String str, int i) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, i);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean jujujpjjp(Context context, String str, String str2) {
        if (uppjpjj()) {
            if (jujujpjjp(str)) {
                return uppjpjj(context, str2);
            }
            return true;
        }
        return false;
    }

    public static boolean jujujpjjp(String str) {
        return uppjpjj() && uppjpjj.contains(jupppjuju.jujujpjjp(str, "unknown"));
    }

    public static boolean jujujpjjp(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 32);
            if (queryIntentActivities != null) {
                return queryIntentActivities.size() > 0;
            }
            return false;
        } catch (Exception e) {
            MLog.m25878e(jujujpjjp, "IsIntentExist Exception", e);
            return false;
        }
    }

    public static void jujujpjjp() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new RuntimeException("Should not run on main thread!");
        }
    }
}
