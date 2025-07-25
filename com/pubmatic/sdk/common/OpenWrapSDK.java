package com.pubmatic.sdk.common;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.OpenWrapSDKInitializer;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBApplicationInfo;
import com.pubmatic.sdk.common.models.POBDSAComplianceStatus;
import com.pubmatic.sdk.common.models.POBExternalUserId;
import com.pubmatic.sdk.common.models.POBLocation;
import com.pubmatic.sdk.common.models.POBUserInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class OpenWrapSDK {
    public static final String KEY_SELECTED_REWARD = "selected_reward";

    /* loaded from: classes7.dex */
    public enum LogLevel {
        All(0),
        Verbose(1),
        Debug(2),
        Info(3),
        Warn(4),
        Error(5),
        Off(6);
        

        /* renamed from: b */
        final int f69999b;

        LogLevel(int i) {
            this.f69999b = i;
        }

        public int getLevel() {
            return this.f69999b;
        }
    }

    public static void addExternalUserId(@NonNull POBExternalUserId pOBExternalUserId) {
        POBInstanceProvider.getSdkConfig().addExternalUserId(pOBExternalUserId);
    }

    public static void allowAdvertisingId(boolean z) {
        POBInstanceProvider.getSdkConfig().allowAdvertisingId(z);
    }

    public static void allowLocationAccess(boolean z) {
        POBInstanceProvider.getSdkConfig().allowLocationAccess(z);
    }

    @Nullable
    public static POBApplicationInfo getApplicationInfo() {
        return POBInstanceProvider.getSdkConfig().getApplicationInfo();
    }

    public static POBDSAComplianceStatus getDSAComplianceStatus() {
        return POBInstanceProvider.getSdkConfig().getDsaComplianceStatus();
    }

    @NonNull
    public static List<POBExternalUserId> getExternalUserIds() {
        Map<String, List<POBExternalUserId>> externalUserIds = POBInstanceProvider.getSdkConfig().getExternalUserIds();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<POBExternalUserId>> entry : externalUserIds.entrySet()) {
            arrayList.addAll(entry.getValue());
        }
        return arrayList;
    }

    @Nullable
    public static POBUserInfo getUserInfo() {
        return POBInstanceProvider.getSdkConfig().getUserInfo();
    }

    public static String getVersion() {
        return "4.4.0";
    }

    @AnyThread
    public static void initialize(@NonNull Context context, @NonNull OpenWrapSDKConfig openWrapSDKConfig, @NonNull OpenWrapSDKInitializer.Listener listener) {
        OpenWrapSDKInitializerImpl.INSTANCE.initialize(context, openWrapSDKConfig, listener);
    }

    public static void removeAllExternalUserIds() {
        POBInstanceProvider.getSdkConfig().removeAllExternalUserIds();
    }

    public static void removeExternalUserIds(@NonNull String str) {
        POBInstanceProvider.getSdkConfig().removeExternalUserIds(str);
    }

    public static void setApplicationInfo(POBApplicationInfo pOBApplicationInfo) {
        POBInstanceProvider.getSdkConfig().setApplicationInfo(pOBApplicationInfo);
    }

    public static void setCoppa(boolean z) {
        POBInstanceProvider.getSdkConfig().setCoppa(z);
    }

    public static void setDSAComplianceStatus(@NonNull POBDSAComplianceStatus pOBDSAComplianceStatus) {
        POBInstanceProvider.getSdkConfig().setDSAComplianceStatus(pOBDSAComplianceStatus);
    }

    public static void setLocation(POBLocation pOBLocation) {
        POBInstanceProvider.getSdkConfig().setLocation(pOBLocation);
    }

    public static void setLogLevel(LogLevel logLevel) {
        POBLog.setLogLevel(logLevel);
    }

    public static void setSSLEnabled(boolean z) {
        POBInstanceProvider.getSdkConfig().setRequestSecureCreative(z);
    }

    public static void setUseInternalBrowser(boolean z) {
        POBInstanceProvider.getSdkConfig().setUseInternalBrowser(z);
    }

    public static void setUserInfo(POBUserInfo pOBUserInfo) {
        POBInstanceProvider.getSdkConfig().setUserInfo(pOBUserInfo);
    }
}
