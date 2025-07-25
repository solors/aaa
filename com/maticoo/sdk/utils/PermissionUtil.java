package com.maticoo.sdk.utils;

import android.content.Context;

/* loaded from: classes6.dex */
public final class PermissionUtil {
    public static boolean hasPermission(Context context, String... strArr) {
        for (String str : strArr) {
            if (!hasPermission(context, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isGranted(Context context, String... strArr) {
        for (String str : strArr) {
            if (!isGranted(context, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasPermission(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    private static boolean isGranted(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }
}
