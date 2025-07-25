package com.amazon.device.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.ads.ApsMigrationUtil;
import com.amazon.aps.ads.model.ApsLogLevel;
import com.amazon.aps.ads.privacy.ApsPrivacyManager;
import com.amazon.aps.ads.util.ApsUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AdRegistration {
    private static final String LOGTAG = "AdRegistration";
    private static AdRegistration adRegistrationInstance = null;
    private static CMPFlavor cmpFlavor = null;
    private static boolean consentStringDirty = false;
    private static ConsentStatus currentConsentStatus = null;
    private static String currentVendorListString = null;
    private static Map<String, String> customDictionary = null;
    private static JSONObject dsaTransparencyData = null;
    private static HashMap<String, SlotGroup> groups = null;
    private static boolean isOmSdkActivated = false;
    private static String lastSeenNonIABEncodedConsentString = null;
    private static boolean locationEnabled = false;
    private static String mAppKey = null;
    private static Context mContext = null;
    static List<String> providersProprietaryKeys = null;
    private static String sdkDistributionPlace = null;
    private static boolean testMode = false;
    private ActivityMonitor activityMonitor;
    private static Integer initCount = 0;
    static MRAIDPolicy mraidPolicy = MRAIDPolicy.AUTO_DETECT;
    static String[] serverlessMarkers = {"com.amazon.admob_adapter.APSAdMobCustomBannerEvent", "com.amazon.mopub_adapter.APSMopubCustomBannerEvent", "com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter"};
    private static Map<String, DTBCacheData> adMobRequestIdMap = new HashMap();
    private Set<AdProvider> providers = new HashSet();
    private EventDistributor eventDistributor = new EventDistributor();

    /* renamed from: com.amazon.device.ads.AdRegistration$1 */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C36411 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$DTBBannerType;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$DTBSlotType;

        static {
            int[] iArr = new int[DTBSlotType.values().length];
            $SwitchMap$com$amazon$device$ads$DTBSlotType = iArr;
            try {
                iArr[DTBSlotType.SLOT_320_50.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$DTBSlotType[DTBSlotType.SLOT_300_250.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$DTBSlotType[DTBSlotType.SLOT_728_90.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$DTBSlotType[DTBSlotType.SLOT_SMART.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[DTBBannerType.values().length];
            $SwitchMap$com$amazon$device$ads$DTBBannerType = iArr2;
            try {
                iArr2[DTBBannerType.PHONE_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$DTBBannerType[DTBBannerType.TABLET_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public enum CMPFlavor {
        CMP_NOT_DEFINED,
        GOOGLE_CMP,
        MOPUB_CMP,
        ADMOB_CMP
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public enum ConsentStatus {
        CONSENT_NOT_DEFINED,
        EXPLICIT_YES,
        EXPLICIT_NO,
        UNKNOWN
    }

    /* loaded from: classes2.dex */
    public static class SlotGroup {
        String name;
        Set<DTBAdSize> slots;

        public SlotGroup(String str) {
            if (!DtbCommonUtils.isNullOrEmpty(str)) {
                this.name = str;
                this.slots = new HashSet();
                return;
            }
            throw new IllegalArgumentException("Slot Group name cannot be null or empty");
        }

        public void addSlot(DTBAdSize dTBAdSize) {
            try {
                for (DTBAdSize dTBAdSize2 : this.slots) {
                    if (dTBAdSize2.getWidth() == dTBAdSize.getWidth() && dTBAdSize2.getHeight() == dTBAdSize.getHeight() && dTBAdSize2.getDTBAdType() == dTBAdSize.getDTBAdType()) {
                        return;
                    }
                }
                this.slots.add(dTBAdSize);
            } catch (RuntimeException e) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute addSlot method in SlotGroup class", e);
            }
        }

        public DTBAdSize getSizeByBannerType(DTBBannerType dTBBannerType) {
            try {
                int i = C36411.$SwitchMap$com$amazon$device$ads$DTBBannerType[dTBBannerType.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        return getSizeByWidthAndHeight(728, 90);
                    }
                    return null;
                }
                return getSizeByWidthAndHeight(320, 50);
            } catch (RuntimeException e) {
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getSizeByBannerType method in SlotGroup class", e);
                return null;
            }
        }

        public DTBAdSize getSizeBySlotType(DTBSlotType dTBSlotType) {
            try {
                int i = C36411.$SwitchMap$com$amazon$device$ads$DTBSlotType[dTBSlotType.ordinal()];
                int i2 = 50;
                int i3 = 320;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                if (DtbDeviceDataRetriever.isTablet()) {
                                    i2 = 90;
                                    i3 = 728;
                                }
                                return getSizeByWidthAndHeight(i3, i2);
                            }
                            return null;
                        }
                        return getSizeByWidthAndHeight(728, 90);
                    }
                    return getSizeByWidthAndHeight(300, 250);
                }
                return getSizeByWidthAndHeight(320, 50);
            } catch (RuntimeException e) {
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getSizeBySlotType method in SlotGroup class", e);
                return null;
            }
        }

        public DTBAdSize getSizeBySlotUUID(String str) {
            for (DTBAdSize dTBAdSize : this.slots) {
                if (dTBAdSize.getSlotUUID().equals(str)) {
                    return dTBAdSize;
                }
            }
            return null;
        }

        public DTBAdSize getSizeByWidthAndHeight(int i, int i2) {
            return getSizeByWidthHeightType(i, i2, AdType.DISPLAY);
        }

        public DTBAdSize getSizeByWidthHeightType(int i, int i2, AdType adType) {
            try {
                for (DTBAdSize dTBAdSize : this.slots) {
                    if (dTBAdSize.getHeight() == i2 && dTBAdSize.getWidth() == i && dTBAdSize.getDTBAdType() == adType) {
                        return dTBAdSize;
                    }
                }
                return null;
            } catch (RuntimeException e) {
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getSizeByWidthHeightType method in SlotGroup class", e);
                return null;
            }
        }
    }

    private AdRegistration(String str, Context context) throws IllegalArgumentException {
        PackageInfo currentWebViewPackage;
        if (context != null && str != null && !"".equals(str.trim())) {
            try {
                String str2 = APSAnalytics.DEFAULT_SDK_VERSION;
                if (Build.VERSION.SDK_INT >= 26) {
                    currentWebViewPackage = WebView.getCurrentWebViewPackage();
                    if (currentWebViewPackage == null) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No WebView Installed");
                        APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "No WebView Installed");
                        throw illegalArgumentException;
                    }
                }
                mAppKey = str;
                Context applicationContext = context.getApplicationContext();
                mContext = applicationContext;
                APSAnalytics.init(applicationContext);
                APSAnalytics.setVersion(getVersion());
                ApsUtils.Companion.setupMetrics(mContext);
                DtbSharedPreferences createInstance = DtbSharedPreferences.createInstance();
                context.checkCallingOrSelfPermission("android.permission.INTERNET");
                if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
                    DtbLog.error(LOGTAG, "Network task cannot commence because the INTERNET permission is missing from the app's manifest.");
                }
                String versionInUse = createInstance.getVersionInUse();
                if (versionInUse == null || DtbCommonUtils.isNullOrEmpty(versionInUse)) {
                    createInstance.setVersionInUse(DtbConstants.SDK_VERSION);
                }
                DtbOmSdkSessionManager.activateOMSDK(mContext);
                currentConsentStatus = ConsentStatus.CONSENT_NOT_DEFINED;
                cmpFlavor = CMPFlavor.CMP_NOT_DEFINED;
                consentStringDirty = false;
                customDictionary = new HashMap();
                JSONObject loadJsonFromAsset = DTBAdUtil.loadJsonFromAsset("aps_distribution_marker.json");
                if (loadJsonFromAsset != null) {
                    try {
                        sdkDistributionPlace = loadJsonFromAsset.getString("distribution");
                        return;
                    } catch (Exception unused) {
                        DtbLog.warn("Unable to get distribution place value");
                        return;
                    }
                }
                return;
            } catch (ClassNotFoundException unused2) {
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Missing the dependency libraries - Ex; com.iabtcf:iabtcf-decoder:2.0.10. For further details, please refer to our Android SDK documentation.");
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Missing the dependency libraries - Ex; com.iabtcf:iabtcf-decoder:2.0.10. For further details, please refer to our Android SDK documentation.");
                throw illegalArgumentException2;
            }
        }
        IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Invalid parameters for initialization. SDK initialize failed due to invalid registration parameters");
        APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Invalid parameters for initialization. SDK initialize failed due to invalid registration parameters");
        throw illegalArgumentException3;
    }

    public static void addAdMobCache(String str, DTBCacheData dTBCacheData) {
        if (adMobRequestIdMap == null) {
            adMobRequestIdMap = new HashMap();
        }
        removeExpiredAdMobCache();
        synchronized (adMobRequestIdMap) {
            adMobRequestIdMap.put(str, dTBCacheData);
        }
    }

    public static void addCustomAttribute(String str, String str2) {
        if (!isInitialized() && !ApsMigrationUtil.isApsInitInProgress()) {
            throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
        }
        try {
            if (customDictionary == null) {
                customDictionary = new HashMap();
            }
            customDictionary.put(str, str2);
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute addCustomAttribute method", e);
        }
    }

    public static void addProvider(AdProvider adProvider) {
        if (adRegistrationInstance != null) {
            Class<?> cls = adProvider.getClass();
            for (AdProvider adProvider2 : adRegistrationInstance.providers) {
                if (adProvider2.getClass().equals(cls)) {
                    return;
                }
            }
            adRegistrationInstance.providers.add(adProvider);
            appendProprietaryProviderKeys(adProvider.getProprietaryKeys());
            return;
        }
        throw new IllegalStateException("Instance must be initialized prior to adding providers");
    }

    public static void addSlotGroup(SlotGroup slotGroup) {
        try {
            if (groups == null) {
                groups = new HashMap<>();
            }
            groups.put(slotGroup.name, slotGroup);
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute addSlotGroup method", e);
        }
    }

    static void appendProprietaryProviderKeys(String[] strArr) {
        if (providersProprietaryKeys == null) {
            providersProprietaryKeys = new ArrayList();
        }
        for (String str : strArr) {
            providersProprietaryKeys.add(str);
        }
    }

    public static void enableLogging(boolean z) {
        try {
            if (z) {
                DTBLogLevel dTBLogLevel = DTBLogLevel.All;
                DtbLog.setLogLevel(dTBLogLevel);
                ApsLog.setLogLevel(ApsLogLevel.values()[dTBLogLevel.intValue()]);
            } else {
                DTBLogLevel dTBLogLevel2 = DTBLogLevel.Error;
                DtbLog.setLogLevel(dTBLogLevel2);
                ApsLog.setLogLevel(ApsLogLevel.values()[dTBLogLevel2.intValue()]);
            }
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute enableLogging method", e);
        }
    }

    public static void enableTesting(boolean z) {
        try {
            if (!z) {
                testMode = false;
            } else if (!DTBAdUtil.isInstalledFromAppStore(mContext)) {
                testMode = z;
                DtbLog.enableCallerInfo(z);
            }
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute enableTesting method", e);
        }
    }

    private ActivityMonitor getActivityMonitor() {
        return this.activityMonitor;
    }

    public static DTBCacheData getAdMobCache(String str) {
        if (!DtbCommonUtils.isNullOrEmpty(str) && adMobRequestIdMap != null) {
            removeExpiredAdMobCache();
            return adMobRequestIdMap.get(str);
        }
        return null;
    }

    public static Map<String, DTBCacheData> getAdMobCacheData() {
        return adMobRequestIdMap;
    }

    public static Set<AdProvider> getAdProviders() {
        AdRegistration adRegistration = adRegistrationInstance;
        if (adRegistration != null) {
            return adRegistration.providers;
        }
        return null;
    }

    public static String getAppKey() {
        return mAppKey;
    }

    public static CMPFlavor getCMPFlavor() {
        if (isInitialized()) {
            String cMPFlavor = DtbSharedPreferences.getInstance().getCMPFlavor();
            if (cMPFlavor == null) {
                return cmpFlavor;
            }
            return CMPFlavor.valueOf(cMPFlavor);
        }
        throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
    }

    public static ConsentStatus getConsentStatus() {
        if (isInitialized()) {
            String consentStatus = DtbSharedPreferences.getInstance().getConsentStatus();
            if (consentStatus == null) {
                return currentConsentStatus;
            }
            return ConsentStatus.valueOf(consentStatus);
        }
        throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
    }

    public static Context getContext() {
        return mContext;
    }

    public static Activity getCurrentActivity() {
        return adRegistrationInstance.getActivityMonitor().getCurrentActivity();
    }

    public static Map<String, String> getCustomDictionary() {
        return customDictionary;
    }

    public static JSONObject getDsaTransparencyData() {
        return dsaTransparencyData;
    }

    public static String getEncodedNonIABString() {
        String encodedNonIABConsentString;
        if (consentStringDirty) {
            String vendorList = DtbSharedPreferences.getInstance().getVendorList();
            String consentStatus = DtbSharedPreferences.getInstance().getConsentStatus();
            String cMPFlavor = DtbSharedPreferences.getInstance().getCMPFlavor();
            if (vendorList == null && consentStatus == null && cMPFlavor == null) {
                encodedNonIABConsentString = "";
            } else {
                encodedNonIABConsentString = DTBGDPREncoder.getEncodedNonIABConsentString(getVendorListFromString(vendorList));
                if (!DtbCommonUtils.isNullOrEmpty(encodedNonIABConsentString)) {
                    DtbSharedPreferences.getInstance().saveNonIABCustomConsent(encodedNonIABConsentString);
                }
            }
            consentStringDirty = false;
            lastSeenNonIABEncodedConsentString = encodedNonIABConsentString;
            return encodedNonIABConsentString;
        }
        return lastSeenNonIABEncodedConsentString;
    }

    @Deprecated
    public static EventDistributor getEventDistributer() {
        AdRegistration adRegistration = adRegistrationInstance;
        if (adRegistration != null) {
            return adRegistration.eventDistributor;
        }
        throw new IllegalStateException("Instance must be initialized prior using getEventDistributer API");
    }

    public static AdRegistration getInstance(@NonNull String str, @NonNull Context context) throws IllegalArgumentException {
        String str2;
        String str3;
        if (DtbCommonUtils.isNullOrEmpty(str) || context == null) {
            if (ApsMigrationUtil.getIsApsInitCalled()) {
                str2 = "apsInitCallFailed";
            } else {
                str2 = "initCallFailed";
            }
            ApsMetrics.customEvent(str2, str, null);
        }
        if (!isInitialized()) {
            ApsPrivacyManager apsPrivacyManager = ApsPrivacyManager.INSTANCE;
            apsPrivacyManager.init(context);
            adRegistrationInstance = new AdRegistration(str, context);
            apsPrivacyManager.removeStoragesByApsIfNoConsent();
            DTBMetricsConfiguration.getInstance();
            if (DTBMetricsConfiguration.getInstance().isFeatureEnabled(DTBMetricsConfiguration.FEATURE_CONFIG_IN_INIT)) {
                DtbDeviceRegistration.verifyRegistration();
            }
        } else if (str != null && !str.equals(mAppKey)) {
            mAppKey = str;
            DtbSharedPreferences.createInstance();
        }
        adRegistrationInstance.setActivityMonitor(new ActivityMonitor(context));
        if (ApsMigrationUtil.getIsApsInitCalled()) {
            str3 = "apsInitCall";
        } else {
            str3 = "initCall";
        }
        Integer valueOf = Integer.valueOf(initCount.intValue() + 1);
        initCount = valueOf;
        ApsMetrics.customEvent(str3, String.valueOf(valueOf), null);
        return adRegistrationInstance;
    }

    public static MRAIDPolicy getMRAIDPolicy() {
        return mraidPolicy;
    }

    public static List<String> getProprietaryProviderKeys() {
        if (providersProprietaryKeys == null) {
            providersProprietaryKeys = new ArrayList();
        }
        return providersProprietaryKeys;
    }

    public static String getSDKDistributionPlace() {
        return sdkDistributionPlace;
    }

    public static String[] getServerlessMarkers() {
        return serverlessMarkers;
    }

    public static SlotGroup getSlotGroup(String str) {
        if (str != null) {
            try {
                HashMap<String, SlotGroup> hashMap = groups;
                if (hashMap != null) {
                    return hashMap.get(str);
                }
                return null;
            } catch (RuntimeException e) {
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getSlotGroup method", e);
                return null;
            }
        }
        return null;
    }

    private static String getStringFromVendorList(List<Integer> list) {
        return list.toString();
    }

    private static List<Integer> getVendorListFromString(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && str.length() > 2) {
            for (String str2 : str.substring(1, str.length() - 1).split(",")) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str2.trim())));
            }
        }
        return arrayList;
    }

    public static String getVersion() {
        return DtbCommonUtils.getSDKVersion();
    }

    static boolean hasAdapters() {
        for (String str : serverlessMarkers) {
            try {
                Class.forName(str);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Deprecated
    public static boolean isConsentStatusUnknown() {
        try {
            if (currentConsentStatus == ConsentStatus.CONSENT_NOT_DEFINED || currentConsentStatus == ConsentStatus.UNKNOWN) {
                return true;
            }
            if (DtbSharedPreferences.getInstance().getVendorList() == null) {
                return true;
            }
            return false;
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute isConsentStatusUnknown method", e);
            return true;
        }
    }

    public static boolean isInitialized() {
        if (adRegistrationInstance != null) {
            return true;
        }
        return false;
    }

    public static boolean isLocationEnabled() {
        return locationEnabled;
    }

    public static boolean isTestMode() {
        return testMode;
    }

    public static void removeAdMobCache(String str) {
        Map<String, DTBCacheData> map = adMobRequestIdMap;
        if (map != null) {
            synchronized (map) {
                adMobRequestIdMap.remove(str);
            }
        }
    }

    public static void removeCustomAttribute(String str) {
        if (!isInitialized() && !ApsMigrationUtil.isApsInitInProgress()) {
            throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
        }
        try {
            if (!DtbCommonUtils.isNullOrEmpty(customDictionary)) {
                customDictionary.remove(str);
            }
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute removeCustomAttribute method", e);
        }
    }

    static void removeExpiredAdMobCache() {
        Map<String, DTBCacheData> map = adMobRequestIdMap;
        if (map != null) {
            synchronized (map) {
                long time = new Date().getTime();
                Iterator<Map.Entry<String, DTBCacheData>> it = adMobRequestIdMap.entrySet().iterator();
                while (it.hasNext()) {
                    if (time - it.next().getValue().getResponseTimeStamp() > 29000) {
                        it.remove();
                    }
                }
            }
        }
    }

    @Deprecated
    public static void resetNonIAB() {
        try {
            DtbSharedPreferences.getInstance().removeCMPFlavor();
            DtbSharedPreferences.getInstance().removeConsentStatus();
            DtbSharedPreferences.getInstance().removeVendorList();
            DtbSharedPreferences.getInstance().removeNonIABCustomConsent();
            currentVendorListString = null;
            currentConsentStatus = ConsentStatus.CONSENT_NOT_DEFINED;
            cmpFlavor = CMPFlavor.CMP_NOT_DEFINED;
            consentStringDirty = false;
            lastSeenNonIABEncodedConsentString = null;
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute resetNonIAB method", e);
        }
    }

    private void setActivityMonitor(ActivityMonitor activityMonitor) {
        this.activityMonitor = activityMonitor;
    }

    public static void setAdNetworkInfo(DTBAdNetworkInfo dTBAdNetworkInfo) {
        try {
            addCustomAttribute(DtbConstants.MEDIATION_NAME, dTBAdNetworkInfo.getAdNetworkName());
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute addCustomAttribute method", e);
        }
    }

    @Deprecated
    public static void setAppKey(@NonNull String str) throws IllegalArgumentException {
        if (isInitialized()) {
            if (!DtbCommonUtils.isNullOrEmpty(str)) {
                mAppKey = str;
                DtbSharedPreferences.createInstance();
                return;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid parameters:appKey for initialization.");
            DtbLog.fatal(LOGTAG, "mDTB SDK initialize failed due to invalid registration parameter:appKey.", illegalArgumentException);
            throw illegalArgumentException;
        }
        throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
    }

    @Deprecated
    public static void setCMPFlavor(CMPFlavor cMPFlavor) {
        if (isInitialized()) {
            try {
                if (cMPFlavor == CMPFlavor.CMP_NOT_DEFINED) {
                    DtbLog.error(LOGTAG, "Set cmp type failed due to invalid cmp type parameters. Not allowed to set cmp type to not defined.");
                    return;
                }
                CMPFlavor cMPFlavor2 = cmpFlavor;
                if (cMPFlavor2 != null && cMPFlavor2 == cMPFlavor) {
                    return;
                }
                consentStringDirty = true;
                cmpFlavor = cMPFlavor;
                DtbSharedPreferences.getInstance().saveCMPFlavor(cMPFlavor.name());
                return;
            } catch (RuntimeException e) {
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute setCMPFlavor method", e);
                return;
            }
        }
        throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
    }

    @Deprecated
    public static void setConsentStatus(ConsentStatus consentStatus) {
        if (isInitialized()) {
            try {
                if (consentStatus == ConsentStatus.CONSENT_NOT_DEFINED) {
                    DtbLog.error(LOGTAG, "Set consent status failed due to invalid consent status parameters. Not allowed to set consent not defined.");
                    return;
                }
                ConsentStatus consentStatus2 = currentConsentStatus;
                if (consentStatus2 != null && consentStatus2 == consentStatus) {
                    return;
                }
                consentStringDirty = true;
                currentConsentStatus = consentStatus;
                DtbSharedPreferences.getInstance().saveConsentStatus(consentStatus.name());
                return;
            } catch (RuntimeException e) {
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute setConsentStatus method", e);
                return;
            }
        }
        throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
    }

    @Deprecated
    public static void setContext(Context context) {
        if (context != null) {
            mContext = context.getApplicationContext();
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid parameters:context for initialization.");
        DtbLog.fatal(LOGTAG, "mDTB SDK initialize failed due to invalid registration parameter:context.", illegalArgumentException);
        throw illegalArgumentException;
    }

    public static void setDsaTransparency(JSONObject jSONObject) {
        dsaTransparencyData = jSONObject;
    }

    public static void setMRAIDPolicy(MRAIDPolicy mRAIDPolicy) {
        mraidPolicy = mRAIDPolicy;
        DTBAdRequest.resetMraid();
    }

    public static void setMRAIDSupportedVersions(String[] strArr) {
        DTBAdRequest.setMRAIDSupportedVersions(strArr);
    }

    @Deprecated
    public static void setServerlessMarkers(String[] strArr) {
        serverlessMarkers = strArr;
    }

    @Deprecated
    public static void setVendorList(List<Integer> list) {
        if (isInitialized()) {
            try {
                if (list == null) {
                    DtbLog.error(LOGTAG, "Set vendor list failed due to invalid vendor list parameters with value null.");
                    return;
                }
                String stringFromVendorList = getStringFromVendorList(list);
                String str = currentVendorListString;
                if (str != null && str.equals(stringFromVendorList)) {
                    return;
                }
                consentStringDirty = true;
                currentVendorListString = stringFromVendorList;
                DtbSharedPreferences.getInstance().saveVendorList(stringFromVendorList);
                return;
            } catch (RuntimeException e) {
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute setVendorList method", e);
                return;
            }
        }
        throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
    }

    public static void useGeoLocation(boolean z) {
        locationEnabled = z;
    }

    public static void enableLogging(boolean z, DTBLogLevel dTBLogLevel) {
        try {
            if (z) {
                DtbLog.setLogLevel(dTBLogLevel);
                ApsLog.setLogLevel(ApsLogLevel.values()[dTBLogLevel.intValue()]);
            } else {
                DtbLog.setLogLevel(DTBLogLevel.Error);
            }
        } catch (RuntimeException e) {
            DtbLog.error(LOGTAG, "Fail to execute enableLogging method with logLevel argument");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute enableLogging method with logLevel argument", e);
        }
    }
}
