package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class AFi1jSDK implements AFi1nSDK {
    private static ProviderInfo values(Context context) {
        ProviderInfo resolveContentProvider;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                resolveContentProvider = context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", PackageManager.ComponentInfoFlags.of(0L));
            } else {
                resolveContentProvider = context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 0);
            }
            return resolveContentProvider;
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1bSDK aFg1bSDK = AFg1bSDK.REFERRER;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            AFg1cSDK.e$default(aFLogger, aFg1bSDK, message, th, false, false, false, false, 96, null);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFi1nSDK
    public final boolean AFKeystoreWrapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (values(context) != null) {
            return true;
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFi1nSDK
    public final boolean valueOf(@NotNull Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "");
        ProviderInfo values = values(context);
        if (values == null) {
            return false;
        }
        try {
            return new ServiceVerifyKit.PkgVerifyBuilder(context).setPackageName(((PackageItemInfo) values).packageName).setCertChainKey("com.huawei.appgallery.sign_certchain").setCertSignerKey("com.huawei.appgallery.fingerprint_signature").addLegacyInfo("com.huawei.appmarket", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212").addLegacyInfo("com.huawei.appmarket", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F").isValidPkg();
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1bSDK aFg1bSDK = AFg1bSDK.REFERRER;
            String message = th.getMessage();
            if (message == null) {
                str = "";
            } else {
                str = message;
            }
            AFg1cSDK.e$default(aFLogger, aFg1bSDK, str, th, false, false, false, false, 96, null);
            return false;
        }
    }
}
