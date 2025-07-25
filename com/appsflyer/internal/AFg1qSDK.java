package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class AFg1qSDK {
    @NotNull
    private final String AFKeystoreWrapper;
    @NotNull
    private final Map<String, Object> valueOf;
    @Nullable
    private final PackageManager values;

    public AFg1qSDK(@NotNull AFd1nSDK aFd1nSDK, @NotNull AFd1sSDK aFd1sSDK) {
        PackageManager packageManager;
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        this.valueOf = new LinkedHashMap();
        Context context = aFd1nSDK.AFKeystoreWrapper;
        if (context != null) {
            packageManager = context.getPackageManager();
        } else {
            packageManager = null;
        }
        this.values = packageManager;
        String packageName = aFd1sSDK.valueOf.AFKeystoreWrapper.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        this.AFKeystoreWrapper = packageName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
        r2 = r3.getInstallSourceInfo(r2);
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> AFInAppEventParameterName() {
        /*
            r5 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.valueOf
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6b
            android.content.pm.PackageManager r0 = r5.values     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L22
            java.lang.String r1 = r5.AFKeystoreWrapper     // Catch: java.lang.Exception -> L1c
            java.lang.String r0 = r0.getInstallerPackageName(r1)     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L22
            java.util.Map<java.lang.String, java.lang.Object> r1 = r5.valueOf     // Catch: java.lang.Exception -> L1c
            java.lang.String r2 = "installer_package"
            r1.put(r2, r0)     // Catch: java.lang.Exception -> L1c
            goto L22
        L1c:
            r0 = move-exception
            java.lang.String r1 = "Exception while getting the app's installer package. "
            com.appsflyer.AFLogger.afErrorLog(r1, r0)
        L22:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L6b
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.valueOf
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.String r2 = r5.AFKeystoreWrapper
            android.content.pm.PackageManager r3 = r5.values
            if (r3 == 0) goto L66
            android.content.pm.InstallSourceInfo r2 = com.appsflyer.internal.C6301s.m92110a(r3, r2)
            if (r2 == 0) goto L66
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.String r3 = com.appsflyer.internal.C6302t.m92109a(r2)
            if (r3 == 0) goto L50
            java.lang.String r4 = "initiating_package"
            r1.put(r4, r3)
        L50:
            java.lang.String r3 = com.appsflyer.internal.C6303u.m92108a(r2)
            if (r3 == 0) goto L5b
            java.lang.String r4 = "installing_package"
            r1.put(r4, r3)
        L5b:
            java.lang.String r2 = com.appsflyer.internal.C6304v.m92107a(r2)
            if (r2 == 0) goto L66
            java.lang.String r3 = "originating_package"
            r1.put(r3, r2)
        L66:
            java.lang.String r2 = "install_source_info"
            r0.put(r2, r1)
        L6b:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.valueOf
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1qSDK.AFInAppEventParameterName():java.util.Map");
    }
}
