package com.p551my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: com.my.tracker.obfuscated.k */
/* loaded from: classes7.dex */
public abstract class AbstractC26356k {
    /* renamed from: a */
    public static PackageInfo m41975a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable th) {
            C26468z0.m41525b("InstallHandler: unable to read app version from package manager: " + th);
            return null;
        }
    }

    /* renamed from: b */
    public static String m41974b(Context context) {
        try {
            return context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th) {
            C26468z0.m41527a("ReferrerHandler: cannot retrieve \"installer\", exception", th);
            return null;
        }
    }
}
