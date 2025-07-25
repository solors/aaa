package com.mobilefuse.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.ProxyConfig;
import com.iab.omid.library.mobilefuse.Omid;
import com.mobilefuse.sdk.component.MraidAdRendererComponent;
import com.mobilefuse.sdk.component.VastAdRendererComponent;
import com.mobilefuse.sdk.config.ExternalUsageHelpers;
import com.mobilefuse.sdk.config.UsageInfoType;
import com.mobilefuse.sdk.core.BuildConfig;
import com.mobilefuse.sdk.device.UserAgentInfoKt;
import com.mobilefuse.sdk.identity.EidService;
import com.mobilefuse.sdk.identity.IdentifierUpdateSignal;
import com.mobilefuse.sdk.logging.HttpRequestTracker;
import com.mobilefuse.sdk.telemetry.ExceptionHandler;
import com.mobilefuse.sdk.telemetry.Telemetry;
import com.mobilefuse.sdk.telemetry.TelemetryActionFactory;
import com.mobilefuse.sdk.telemetry.TelemetryActionParam;
import com.mobilefuse.sdk.telemetry.TelemetrySdkActionType;
import com.mobilefuse.sdk.telemetry.TelemetrySdkParamType;
import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import com.mobilefuse.videoplayer.VideoPlayerSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes7.dex */
public class MobileFuseSettings {
    @Nullable
    private static String advertisingId = null;
    private static String appName = null;
    private static PackageInfo appPackageInfo = null;
    private static int appVersionCode = 0;
    private static String appVersionName = null;
    private static boolean initialized = false;
    private static boolean limitTrackingEnabled = true;
    private static boolean spoofMode;
    private static boolean tabletDevice;
    private static Map<String, String> testCeltraIdsMap;
    private static boolean testMode;
    private static HashMap<MobileFuseSetting, String> overrideSettings = new HashMap<>();
    private static boolean expiredAdReloading = true;
    private static boolean logHttpRequests = false;

    /* renamed from: com.mobilefuse.sdk.MobileFuseSettings$1 */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C234031 {
        static final /* synthetic */ int[] $SwitchMap$com$mobilefuse$sdk$MobileFuseSetting;

        static {
            int[] iArr = new int[MobileFuseSetting.values().length];
            $SwitchMap$com$mobilefuse$sdk$MobileFuseSetting = iArr;
            try {
                iArr[MobileFuseSetting.IFA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$mobilefuse$sdk$MobileFuseSetting[MobileFuseSetting.LMT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void configureTestCeltraIds(Map<String, String> map) {
        testCeltraIdsMap = map;
    }

    @Nullable
    public static String getAdvertisingId() {
        return advertisingId;
    }

    public static String getAppName() {
        return appName;
    }

    public static int getAppVersionCode() {
        return appVersionCode;
    }

    public static String getAppVersionName() {
        return appVersionName;
    }

    @Nullable
    public static String getDeviceLanguage() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Throwable th) {
            StabilityHelper.logException((Class<?>) MobileFuseSettings.class, th);
            return null;
        }
    }

    @Deprecated
    public static long getMaxInterstitialCloseButtonDelayMs() {
        return 0L;
    }

    @Deprecated
    public static float getMaxInterstitialCloseButtonDelaySeconds() {
        return 0.0f;
    }

    @NonNull
    public static String getMfxBidEndpointUrl() {
        try {
            String override = getOverride(MobileFuseSetting.MFX_BID_ENDPOINT_URL);
            if (override != null) {
                return override;
            }
            return BuildConfig.MFX_BID_ENDPOINT_URL;
        } catch (Throwable th) {
            StabilityHelper.logException((Class<?>) MobileFuseSettings.class, th);
            return BuildConfig.MFX_BID_ENDPOINT_URL;
        }
    }

    public static String getOverride(@NonNull MobileFuseSetting mobileFuseSetting) {
        return overrideSettings.get(mobileFuseSetting);
    }

    @Nullable
    public static String getSdkAdapterName() {
        return ExternalUsageHelpers.getUsageInfoName(UsageInfoType.ADAPTER);
    }

    @Nullable
    public static String getSdkAdapterVersion() {
        return ExternalUsageHelpers.getUsageInfoVersion(UsageInfoType.ADAPTER);
    }

    @Nullable
    public static String getSdkModuleName() {
        return ExternalUsageHelpers.getUsageInfoName(UsageInfoType.MODULE);
    }

    @Nullable
    public static String getSdkModuleVersion() {
        return ExternalUsageHelpers.getUsageInfoVersion(UsageInfoType.MODULE);
    }

    public static String getTestCeltraIdForPlacement(String str) {
        Map<String, String> map;
        try {
            map = testCeltraIdsMap;
        } catch (Throwable th) {
            StabilityHelper.logException((Class<?>) MobileFuseSettings.class, th);
        }
        if (map == null) {
            return null;
        }
        if (map.containsKey(str)) {
            return testCeltraIdsMap.get(str);
        }
        if (testCeltraIdsMap.containsKey(ProxyConfig.MATCH_ALL_SCHEMES)) {
            return testCeltraIdsMap.get(ProxyConfig.MATCH_ALL_SCHEMES);
        }
        return null;
    }

    @NonNull
    public static String getUserAgent() {
        return UserAgentInfoKt.getUserAgentInfo().getUserAgent();
    }

    @NonNull
    @Deprecated
    public static ClickthroughBehaviour getVideoClickthroughBehaviour() {
        return MobileFuseDefaults.DEFAULT_VIDEO_CLICKTHROUGH_BEHAVIOUR;
    }

    public static void initSettings() throws Throwable {
        String str;
        if (initialized) {
            return;
        }
        initialized = true;
        MraidAdRendererComponent.register();
        VastAdRendererComponent.register();
        ExceptionHandler.registerModule(BuildConfig.LIBRARY_PACKAGE_NAME, "1.8.0");
        try {
            str = Omid.getVersion();
        } catch (Throwable unused) {
            str = "unknown";
        }
        ExceptionHandler.registerModule("com.iab.omid.library.mobilefuse", str);
        ExceptionHandler.registerModule(com.mobilefuse.sdk.common.BuildConfig.LIBRARY_PACKAGE_NAME, "1.8.0");
        VideoPlayerSettings.setSdkName("MobileFuse Ads");
        VideoPlayerSettings.setSdkVersion(MobileFuse.getSdkVersion());
        try {
            Context globalContext = AppLifecycleHelper.getGlobalContext();
            appName = Utils.getApplicationName(globalContext);
            tabletDevice = Utils.isDeviceTypeTablet();
            PackageInfo packageInfo = Utils.getPackageInfo(globalContext);
            appPackageInfo = packageInfo;
            appVersionName = packageInfo.versionName;
            appVersionCode = packageInfo.versionCode;
        } catch (Throwable th) {
            StabilityHelper.logException((Class<?>) MobileFuseSettings.class, th);
        }
    }

    public static boolean isExpiredAdReloading() {
        return expiredAdReloading;
    }

    public static boolean isLimitTrackingEnabled() {
        return limitTrackingEnabled;
    }

    public static boolean isSpoofMode() {
        return spoofMode;
    }

    public static boolean isTabletDevice() {
        return tabletDevice;
    }

    public static boolean isTestMode() {
        return testMode;
    }

    static void reset() {
        initialized = false;
        appName = null;
        tabletDevice = false;
        appPackageInfo = null;
        appVersionName = null;
        appVersionCode = 0;
        advertisingId = null;
        limitTrackingEnabled = false;
        overrideSettings.clear();
        testCeltraIdsMap = null;
        expiredAdReloading = true;
        logHttpRequests = false;
        ExternalUsageHelpers.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setAdvertisingId(@Nullable String str) throws Throwable {
        String override = getOverride(MobileFuseSetting.IFA);
        if (override != null) {
            advertisingId = override;
        } else {
            advertisingId = str;
        }
        EidService.getService().handleSdkStateChanged(IdentifierUpdateSignal.IFA_CHANGED);
    }

    public static void setExpiredAdReloading(boolean z) {
        expiredAdReloading = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setLimitTrackingEnabled(boolean z) {
        if (getOverride(MobileFuseSetting.LMT) != null) {
            MobileFuse.logDebug("Can't apply the lmt value because its override is active.");
            return;
        }
        limitTrackingEnabled = z;
        EidService.getService().handleSdkStateChanged(IdentifierUpdateSignal.LMT_CHANGED);
    }

    public static void setLogHttpRequests(boolean z) {
        logHttpRequests = z;
        HttpRequestTracker.setEnabled(z);
    }

    public static void setOverride(@NonNull MobileFuseSetting mobileFuseSetting, @NonNull String str) {
        try {
            overrideSettings.put(mobileFuseSetting, str);
            int i = C234031.$SwitchMap$com$mobilefuse$sdk$MobileFuseSetting[mobileFuseSetting.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    limitTrackingEnabled = Boolean.parseBoolean(str);
                    EidService.getService().handleSdkStateChanged(IdentifierUpdateSignal.LMT_CHANGED);
                }
            } else if (advertisingId != null) {
                advertisingId = str;
            }
        } catch (Throwable th) {
            StabilityHelper.logException((Class<?>) MobileFuseSettings.class, th);
        }
    }

    public static void setSdkAdapter(@NonNull String str, @NonNull String str2) {
        if (str != null && str2 != null) {
            ExternalUsageHelpers.addUsageInfo(UsageInfoType.ADAPTER, str, str2);
        }
    }

    public static void setSdkModule(@NonNull String str, @NonNull String str2) {
        if (str != null && str2 != null) {
            ExternalUsageHelpers.addUsageInfo(UsageInfoType.MODULE, str, str2);
        }
    }

    public static void setSpoofMode(boolean z) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.SPOOF_MODE, String.valueOf(z), true));
            Telemetry.onAction(TelemetryActionFactory.createDebugAction(MobileFuseSetting.class, TelemetrySdkActionType.SDK_SET_SPOOF_MODE_GLOBALLY, arrayList));
        } catch (Throwable unused) {
        }
        spoofMode = z;
    }

    public static void setTestMode(boolean z) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.TEST_MODE, String.valueOf(z), true));
            Telemetry.onAction(TelemetryActionFactory.createDebugAction(MobileFuseSetting.class, TelemetrySdkActionType.SDK_SET_TEST_MODE_GLOBALLY, arrayList));
        } catch (Throwable unused) {
        }
        testMode = z;
    }

    public static boolean shouldLogHttpRequests() {
        return logHttpRequests;
    }

    @Deprecated
    public static void clearMaxInterstitialCloseButtonDelay() {
    }

    @Deprecated
    public static void setMaxInterstitialCloseButtonDelayInSeconds(float f) {
    }

    @Deprecated
    public static void setVideoClickthroughBehaviour(@NonNull ClickthroughBehaviour clickthroughBehaviour) {
    }
}
