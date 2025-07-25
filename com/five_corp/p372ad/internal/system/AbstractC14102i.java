package com.five_corp.p372ad.internal.system;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: com.five_corp.ad.internal.system.i */
/* loaded from: classes4.dex */
public abstract class AbstractC14102i {
    /* renamed from: a */
    public static PackageInfo m78100a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT < 33) {
            return packageManager.getPackageInfo(str, 128);
        }
        return packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(128L));
    }
}
