package io.appmetrica.analytics.coreutils.internal.system;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.io.File;

/* loaded from: classes9.dex */
public final class RootChecker {

    /* renamed from: a */
    private static final String[] f92468a = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};

    /* loaded from: classes9.dex */
    public static final class RootStatus {
        public static final int NOT_ROOT = 0;
        public static final int ROOT = 1;
    }

    public static int isRootedPhone() {
        if (!isSuperuserApkExists() && !isSuperuserNativeLibExists()) {
            return 0;
        }
        return 1;
    }

    public static boolean isSuperuserApkExists() {
        try {
            if (new File("/system/app/Superuser/Superuser.apk").exists()) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isSuperuserNativeLibExists() {
        String[] strArr = f92468a;
        for (int i = 0; i < 8; i++) {
            String str = strArr[i];
            try {
                if (AndroidUtils.isApiAchieved(31)) {
                    continue;
                } else {
                    if (new File(str + "su").exists()) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
