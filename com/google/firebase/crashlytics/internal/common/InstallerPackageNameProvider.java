package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

/* loaded from: classes4.dex */
class InstallerPackageNameProvider {

    /* renamed from: a */
    private String f42414a;

    /* renamed from: b */
    private static String m67078b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName == null) {
            return "";
        }
        return installerPackageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String m67079a(Context context) {
        String str;
        if (this.f42414a == null) {
            this.f42414a = m67078b(context);
        }
        if ("".equals(this.f42414a)) {
            str = null;
        } else {
            str = this.f42414a;
        }
        return str;
    }
}
