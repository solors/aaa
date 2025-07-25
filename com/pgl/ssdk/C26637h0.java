package com.pgl.ssdk;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;

/* renamed from: com.pgl.ssdk.h0 */
/* loaded from: classes7.dex */
public class C26637h0 {
    /* renamed from: a */
    public static String m40857a() {
        PackageInfo currentWebViewPackage;
        ApplicationInfo applicationInfo;
        if (Build.VERSION.SDK_INT >= 26) {
            currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage != null && (applicationInfo = currentWebViewPackage.applicationInfo) != null) {
                return applicationInfo.publicSourceDir;
            }
            return "!error!";
        }
        return "!version_error!";
    }
}
