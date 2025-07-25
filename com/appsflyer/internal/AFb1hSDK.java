package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.KeyStoreException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AFb1hSDK {
    @NotNull
    public static final AFb1hSDK INSTANCE = new AFb1hSDK();

    private AFb1hSDK() {
    }

    public static final void AFInAppEventParameterName(@NotNull AFd1nSDK aFd1nSDK, @NotNull AFd1pSDK aFd1pSDK) {
        int i;
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFb1vSDK.valueOf()) {
            AFLogger.afRDLog("OPPO device found");
            i = 23;
        } else {
            i = 18;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= i && !appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            StringBuilder sb2 = new StringBuilder("OS SDK is=");
            sb2.append(i2);
            sb2.append("; use KeyStore");
            AFLogger.afRDLog(sb2.toString());
            AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(aFd1nSDK.AFKeystoreWrapper);
            if (!aFKeystoreWrapper.AFInAppEventParameterName()) {
                aFKeystoreWrapper.valueOf = AFb1jSDK.AFInAppEventType(aFd1nSDK, aFd1pSDK);
                aFKeystoreWrapper.AFInAppEventType = 0;
                aFKeystoreWrapper.valueOf(aFKeystoreWrapper.AFInAppEventType());
            } else {
                String AFInAppEventType = aFKeystoreWrapper.AFInAppEventType();
                synchronized (aFKeystoreWrapper.values) {
                    aFKeystoreWrapper.AFInAppEventType++;
                    AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(AFInAppEventType)));
                    try {
                        synchronized (aFKeystoreWrapper.values) {
                            aFKeystoreWrapper.AFInAppEventParameterName.deleteEntry(AFInAppEventType);
                        }
                    } catch (KeyStoreException e) {
                        StringBuilder sb3 = new StringBuilder("Exception ");
                        sb3.append(e.getMessage());
                        sb3.append(" occurred");
                        AFLogger.afErrorLog(sb3.toString(), e);
                    }
                }
                aFKeystoreWrapper.valueOf(aFKeystoreWrapper.AFInAppEventType());
            }
            appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.valueOf());
            appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.values()));
            return;
        }
        StringBuilder sb4 = new StringBuilder("OS SDK is=");
        sb4.append(i2);
        sb4.append("; no KeyStore usage");
        AFLogger.afRDLog(sb4.toString());
    }

    @Nullable
    public static String AFInAppEventType() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }

    @Nullable
    public static String values() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }
}
