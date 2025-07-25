package com.yandex.mobile.ads.impl;

import android.os.Build;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class jo1 {
    @NotNull

    /* renamed from: a */
    public static final jo1 f81024a = new jo1();
    @NotNull

    /* renamed from: b */
    private static final String[] f81025b = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};

    private jo1() {
    }

    /* renamed from: a */
    public static boolean m32829a() {
        try {
            if (new File("/system/app/Superuser/Superuser.apk").exists()) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            String[] strArr = f81025b;
            boolean z = false;
            for (int i = 0; i < 8; i++) {
                String str = strArr[i];
                if (!z && (Build.VERSION.SDK_INT >= 31 || !new File(str).exists())) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                return true;
            }
        } catch (Throwable unused2) {
        }
        return false;
    }
}
