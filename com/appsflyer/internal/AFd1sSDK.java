package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.pm.PackageItemInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class AFd1sSDK {
    private static String AFKeystoreWrapper = "292";
    private Bundle AFInAppEventParameterName = null;
    public final AFd1oSDK AFInAppEventType;
    public final AFd1nSDK valueOf;
    public final AFd1pSDK values;

    public AFd1sSDK(AFd1nSDK aFd1nSDK, AFd1pSDK aFd1pSDK, AFd1oSDK aFd1oSDK) {
        this.valueOf = aFd1nSDK;
        this.values = aFd1pSDK;
        this.AFInAppEventType = aFd1oSDK;
    }

    public static String AFInAppEventParameterName() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    @NonNull
    public static String AFKeystoreWrapper() {
        return "6.14.2";
    }

    public static String registerClient() {
        StringBuilder sb2 = new StringBuilder("version: 6.14.2 (build ");
        sb2.append(AFKeystoreWrapper);
        sb2.append(")");
        return sb2.toString();
    }

    public static String valueOf() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    @NonNull
    public static String values() {
        return UUID.randomUUID().toString();
    }

    @Nullable
    public final String AFInAppEventType(String str) {
        Object obj;
        try {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = ((PackageItemInfo) this.valueOf.AFKeystoreWrapper.getPackageManager().getApplicationInfo(this.valueOf.AFKeystoreWrapper.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.AFInAppEventParameterName;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("Could not load manifest metadata!");
            sb2.append(th.getMessage());
            AFLogger.afErrorLog(sb2.toString(), th);
            return null;
        }
    }

    @Nullable
    public final String AFLogger() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = AFInAppEventType("CHANNEL");
        }
        if (string != null && string.equals("")) {
            return null;
        }
        return string;
    }

    public final boolean unregisterClient() {
        if (!this.AFInAppEventType.AFKeystoreWrapper()) {
            return true;
        }
        return false;
    }

    @Nullable
    @SuppressLint({"DiscouragedApi"})
    public final String AFKeystoreWrapper(String str) {
        try {
            int identifier = this.valueOf.AFKeystoreWrapper.getResources().getIdentifier(str, "string", this.valueOf.AFKeystoreWrapper.getPackageName());
            if (identifier != 0) {
                return this.valueOf.AFKeystoreWrapper.getString(identifier);
            }
            return null;
        } catch (Resources.NotFoundException e) {
            StringBuilder sb2 = new StringBuilder("Could not load string resource!");
            sb2.append(e.getMessage());
            AFLogger.afErrorLog(sb2.toString(), e);
            return null;
        }
    }

    public final boolean values(String str) {
        String AFInAppEventType = AFInAppEventType(str);
        if (AFInAppEventType != null) {
            return Boolean.parseBoolean(AFInAppEventType);
        }
        return false;
    }

    @Nullable
    public final String AFInAppEventType() {
        AFh1tSDK aFh1tSDK = this.AFInAppEventType.AFLogger;
        AFa1cSDK aFa1cSDK = aFh1tSDK != null ? new AFa1cSDK(aFh1tSDK.valueOf, aFh1tSDK.values) : null;
        if (aFa1cSDK != null) {
            return aFa1cSDK.valueOf;
        }
        return null;
    }
}
