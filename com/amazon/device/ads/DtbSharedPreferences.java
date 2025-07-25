package com.amazon.device.ads;

import android.content.SharedPreferences;
import androidx.work.PeriodicWorkRequest;
import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.ads.privacy.ApsPrivacyManager;
import com.amazon.aps.ads.util.ApsInMemoryManager;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DtbSharedPreferences {
    private static final String AAX_HOSTNAME_PREF_NAME = "amzn-dtb-ad-aax-hostname";
    private static final String AAX_VIDEO_HOSTNAME_PREF_NAME = "amzn-dtb-ad-aax-video-hostname";
    private static final String ADID_PREF_NAME = "amzn-dtb-ad-id";
    private static final String BID_TIMEOUT_PREF_NAME = "amzn-dtb-bid-timeout";
    private static final String CONFIG_LAST_CHECKIN_PREF_NAME = "amzn-dtb-ad-config-last-checkin";
    private static final String CONFIG_TTL_PREF_NAME = "amzn-dtb-ad-config-ttl";
    private static final String DTB_VERSION_IN_USE = "amzn-dtb-version_in_use";
    private static final String ENCODED_PRICE_CHECK_PREF_NAME = "amzn-dtb-enable-encoded-price-check";
    private static final String IDFA_PREF_NAME = "amzn-dtb-idfa";
    private static final String IS_ADID_CHANGED_PREF_NAME = "amzn-dtb-adid-changed";
    private static final String IS_ADID_NEW_PREF_NAME = "amzn-dtb-adid-new";
    private static final String IS_GPS_UNAVAILABLE_PREF_NAME = "amzn-dtb-is-gps-unavailable";
    private static final String LOG_TAG = "DtbSharedPreferences";
    private static final String NON_IAB_CMP_FLAVOR = "NON_IAB_CMP_FLAVOR";
    private static final String NON_IAB_CONSENT_STATUS = "NON_IAB_CONSENT_STATUS";
    private static final String NON_IAB_CUSTOM_CONSENT = "NON_IAB_Custom_Consent";
    private static final String NON_IAB_VENDORLIST = "NON_IAB_VENDORLIST";
    private static final String OO_PREF_NAME = "amzn-dtb-oo";
    private static final String PJ_TEMPLATE_PREF_NAME = "amzn-dtb-pj-template";
    private static final String PREF_FILE_NAME = "com.amazon.device.ads.dtb.preferences";
    private static final String PRIVACY_LOCATION_ACCURACY_IN_METERS_PREF_NAME = "amzn-dtb-privacy-location-accuracy-in-meters";
    private static final String PRIVACY_LOCATION_MODE_PREF_NAME = "amzn-dtb-privacy-location-mode";
    private static final String SDK_WRAPPER_PING = "sdk-wrapper-ping";
    private static final String SIS_ENDPOINT_PREF_NAME = "amzn-dtb-ad-sis-endpoint";
    private static final String SIS_LAST_CHECKIN_PREF_NAME = "amzn-dtb-ad-sis-last-checkin";
    private static final String SIS_LAST_PING_PREF_NAME = "amzn-dtb-ad-sis-last-ping";
    private static final String SIS_LAST_PING_WEB_RESOURCES = "amzn-dtb-web-resource-ping";
    public static DtbSharedPreferences dtbSharedPreferencesInstance;
    private static SharedPreferences sharedPreferences;
    private static ApsInMemoryManager apsInMemoryManager = ApsInMemoryManager.INSTANCE;
    private static boolean isIgnore = false;
    private static boolean IS_SIS_REGISTERATION_SUCCESSFUL = false;

    public DtbSharedPreferences() {
        if (AdRegistration.getContext() != null) {
            sharedPreferences = AdRegistration.getContext().getSharedPreferences(PREF_FILE_NAME, 0);
        }
    }

    public static void clearStorage() {
        ApsLog.m102717d(LOG_TAG, "Removing the stored shared preferences");
        try {
            if (getSharedPreferences() != null) {
                getSharedPreferences().edit().clear().commit();
            }
            flushPreference(IDFA_PREF_NAME);
        } catch (Exception e) {
            ApsLog.m102716e("Error in clearing the storage:" + e.getMessage());
        }
    }

    private static boolean containsPreference(String str) {
        if (apsInMemoryManager.contains(str)) {
            return true;
        }
        if (!ApsPrivacyManager.INSTANCE.isSystemResourceAccessAllowed()) {
            return false;
        }
        return getSharedPreferences().contains(str);
    }

    public static DtbSharedPreferences createInstance() {
        DtbSharedPreferences dtbSharedPreferences = new DtbSharedPreferences();
        dtbSharedPreferencesInstance = dtbSharedPreferences;
        return dtbSharedPreferences;
    }

    private static void flushPreference(String str) {
        if (ApsPrivacyManager.INSTANCE.isSystemResourceAccessAllowed()) {
            SharedPreferences sharedPreferences2 = getSharedPreferences();
            if (sharedPreferences2.contains(str)) {
                SharedPreferences.Editor edit = sharedPreferences2.edit();
                edit.remove(str);
                edit.apply();
            }
        }
        apsInMemoryManager.removePref(str);
    }

    public static DtbSharedPreferences getInstance() {
        if (dtbSharedPreferencesInstance == null) {
            createInstance();
        }
        return dtbSharedPreferencesInstance;
    }

    private static <T> T getPref(String str, Class<T> cls) {
        if (isIgnore) {
            return null;
        }
        if (!apsInMemoryManager.contains(str)) {
            apsInMemoryManager.putPref(str, getPrefFromSys(str, cls));
        }
        return (T) apsInMemoryManager.getPrefWithDefault(str, cls);
    }

    private static <T> T getPrefFromSys(String str, Class<T> cls) {
        if (isIgnore || !ApsPrivacyManager.INSTANCE.isSystemResourceAccessAllowed()) {
            return null;
        }
        SharedPreferences sharedPreferences2 = getSharedPreferences();
        if (cls.isAssignableFrom(String.class)) {
            return (T) sharedPreferences2.getString(str, null);
        }
        if (cls.isAssignableFrom(Set.class)) {
            return (T) sharedPreferences2.getStringSet(str, null);
        }
        if (cls.isAssignableFrom(Boolean.class)) {
            return (T) Boolean.valueOf(sharedPreferences2.getBoolean(str, false));
        }
        if (cls.isAssignableFrom(Long.class)) {
            return (T) Long.valueOf(sharedPreferences2.getLong(str, 0L));
        }
        if (cls.isAssignableFrom(Integer.class)) {
            return (T) Integer.valueOf(sharedPreferences2.getInt(str, 0));
        }
        if (cls.isAssignableFrom(Float.class)) {
            return (T) Float.valueOf(sharedPreferences2.getFloat(str, 0.0f));
        }
        throw new IllegalArgumentException(cls.getName() + " is not supported");
    }

    private static SharedPreferences getSharedPreferences() {
        if (sharedPreferences == null) {
            sharedPreferences = AdRegistration.getContext().getSharedPreferences(PREF_FILE_NAME, 0);
        }
        return sharedPreferences;
    }

    private void saveHostName(String str, String str2) {
        if (!DtbCommonUtils.isNullOrEmpty(str)) {
            savePref(str2, str);
        } else {
            savePref(str2, DtbConstants.AAX_HOSTNAME);
        }
    }

    private static <T> void savePref(String str, T t) {
        if (isIgnore) {
            return;
        }
        apsInMemoryManager.putPref(str, t);
        savePrefInSys(str, t);
    }

    private static <T> void savePrefInSys(String str, T t) {
        SharedPreferences sharedPreferences2;
        if (!isIgnore && ApsPrivacyManager.INSTANCE.isSystemResourceAccessAllowed() && (sharedPreferences2 = getSharedPreferences()) != null) {
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            if (t instanceof Boolean) {
                edit.putBoolean(str, ((Boolean) t).booleanValue());
            } else if (t instanceof String) {
                edit.putString(str, (String) t);
            } else if (t instanceof Integer) {
                edit.putInt(str, ((Integer) t).intValue());
            } else if (t instanceof Float) {
                edit.putFloat(str, ((Float) t).floatValue());
            } else if (t instanceof Long) {
                edit.putLong(str, ((Long) t).longValue());
            } else if (t instanceof Set) {
                edit.putStringSet(str, (Set) t);
            } else {
                throw new IllegalArgumentException("Saving of " + t.getClass() + " is not supported.");
            }
            edit.apply();
        }
    }

    static void setIgnoreMode() {
        isIgnore = true;
    }

    public String getAaxHostname() {
        String str = (String) getPref(AAX_HOSTNAME_PREF_NAME, String.class);
        if (AdRegistration.isTestMode() && DtbDebugProperties.isInternalDebugMode) {
            if (str == null) {
                str = DtbConstants.AAX_HOSTNAME;
            }
            return DtbDebugProperties.getAaxHostName(str);
        } else if (DtbCommonUtils.isNullOrEmpty(str)) {
            return DtbConstants.AAX_HOSTNAME;
        } else {
            return str;
        }
    }

    public String getAaxVideoHostName() {
        return (String) getPref(AAX_VIDEO_HOSTNAME_PREF_NAME, String.class);
    }

    public String getAdId() {
        return (String) getPref(ADID_PREF_NAME, String.class);
    }

    public int getBidTimeout() {
        Integer num = (Integer) getPref(BID_TIMEOUT_PREF_NAME, Integer.class);
        if (num != null && num.intValue() != 0) {
            return num.intValue();
        }
        return 5000;
    }

    public String getCMPFlavor() {
        return (String) getPref(NON_IAB_CMP_FLAVOR, String.class);
    }

    public Long getConfigLastCheckIn() {
        long longValue = ((Long) getPref(CONFIG_LAST_CHECKIN_PREF_NAME, Long.class)).longValue();
        if (longValue <= 0) {
            longValue = getSisLastCheckIn().longValue();
        }
        return Long.valueOf(longValue);
    }

    public synchronized long getConfigTtlInMilliSeconds() {
        long longValue = ((Long) getPref(CONFIG_TTL_PREF_NAME, Long.class)).longValue();
        if (longValue < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            return 172800000L;
        }
        return longValue;
    }

    public String getConsentStatus() {
        return (String) getPref(NON_IAB_CONSENT_STATUS, String.class);
    }

    public String getIdfa() {
        return (String) getPref(IDFA_PREF_NAME, String.class);
    }

    public boolean getIsAdIdChanged() {
        return ((Boolean) getPref(IS_ADID_CHANGED_PREF_NAME, Boolean.class)).booleanValue();
    }

    public boolean getIsAdIdNew() {
        return ((Boolean) getPref(IS_ADID_NEW_PREF_NAME, Boolean.class)).booleanValue();
    }

    public boolean getIsSisRegisterationSuccessful() {
        return IS_SIS_REGISTERATION_SUCCESSFUL;
    }

    public String getNonIABCustomConsent() {
        return (String) getPref(NON_IAB_CUSTOM_CONSENT, String.class);
    }

    public synchronized Boolean getOptOut() {
        if (!containsPreference(OO_PREF_NAME)) {
            return null;
        }
        return (Boolean) getPref(OO_PREF_NAME, Boolean.class);
    }

    public JSONObject getPJTemplate() {
        try {
            return new JSONObject((String) getPref(PJ_TEMPLATE_PREF_NAME, String.class));
        } catch (Exception unused) {
            JSONObject jSONObject = new JSONObject();
            DtbLog.warn(LOG_TAG, "Get Pj template failed when fetching from Cache");
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized float getPrivacyLocationConfigAccuracyInMeters() {
        Float f = (Float) getPref(PRIVACY_LOCATION_ACCURACY_IN_METERS_PREF_NAME, Float.class);
        if (f == null) {
            return Float.MAX_VALUE;
        }
        return f.floatValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f A[Catch: all -> 0x0047, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:20:0x003b, B:23:0x003f, B:10:0x0021, B:13:0x002b, B:26:0x0043), top: B:32:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized com.amazon.device.ads.PrivacyLocationMode getPrivacyLocationConfigMode() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "amzn-dtb-privacy-location-mode"
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r0 = getPref(r0, r1)     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L47
            boolean r1 = com.amazon.device.ads.DtbCommonUtils.isNullOrEmpty(r0)     // Catch: java.lang.Throwable -> L47
            if (r1 != 0) goto L43
            int r1 = r0.hashCode()     // Catch: java.lang.Throwable -> L47
            r2 = -1679810537(0xffffffff9be02017, float:-3.707843E-22)
            r3 = 1
            if (r1 == r2) goto L2b
            r2 = 67893076(0x40bf754, float:1.6452939E-36)
            if (r1 == r2) goto L21
            goto L35
        L21:
            java.lang.String r1 = "Fixed"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L35
            r0 = 0
            goto L36
        L2b:
            java.lang.String r1 = "Compute"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L35
            r0 = r3
            goto L36
        L35:
            r0 = -1
        L36:
            if (r0 == 0) goto L3f
            if (r0 == r3) goto L3b
            goto L43
        L3b:
            com.amazon.device.ads.PrivacyLocationMode r0 = com.amazon.device.ads.PrivacyLocationMode.COMPUTE     // Catch: java.lang.Throwable -> L47
            monitor-exit(r4)
            return r0
        L3f:
            com.amazon.device.ads.PrivacyLocationMode r0 = com.amazon.device.ads.PrivacyLocationMode.FIXED     // Catch: java.lang.Throwable -> L47
            monitor-exit(r4)
            return r0
        L43:
            com.amazon.device.ads.PrivacyLocationMode r0 = com.amazon.device.ads.PrivacyLocationMode.RESTRICTED     // Catch: java.lang.Throwable -> L47
            monitor-exit(r4)
            return r0
        L47:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DtbSharedPreferences.getPrivacyLocationConfigMode():com.amazon.device.ads.PrivacyLocationMode");
    }

    public String getSisEndpoint() {
        String str = (String) getPref(SIS_ENDPOINT_PREF_NAME, String.class);
        if (DtbCommonUtils.isNullOrEmpty(str)) {
            return DtbConstants.SIS_END_POINT + "/api3";
        }
        return str;
    }

    public Long getSisLastCheckIn() {
        return (Long) getPref(SIS_LAST_CHECKIN_PREF_NAME, Long.class);
    }

    public long getSisLastPing() {
        return ((Long) getPref(SIS_LAST_PING_PREF_NAME, Long.class)).longValue();
    }

    public String getVendorList() {
        return (String) getPref(NON_IAB_VENDORLIST, String.class);
    }

    public String getVersionInUse() {
        return (String) getPref(DTB_VERSION_IN_USE, String.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Long getWebResoucesLastPing() {
        return (Long) getPref(SIS_LAST_PING_WEB_RESOURCES, Long.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Long getWrapperDetectionLastPing() {
        return (Long) getPref(SDK_WRAPPER_PING, Long.class);
    }

    public boolean isValidIdfaAvailable() {
        String idfa = getIdfa();
        if (idfa != null && !DtbCommonUtils.isNullOrEmpty(idfa.trim()) && !idfa.startsWith("0000")) {
            return true;
        }
        return false;
    }

    public void removeAdid() {
        flushPreference(ADID_PREF_NAME);
    }

    public void removeBidTimeout() {
        flushPreference(BID_TIMEOUT_PREF_NAME);
    }

    public void removeCMPFlavor() {
        flushPreference(NON_IAB_CMP_FLAVOR);
    }

    public void removeConsentStatus() {
        flushPreference(NON_IAB_CONSENT_STATUS);
    }

    public void removeNonIABCustomConsent() {
        flushPreference(NON_IAB_CUSTOM_CONSENT);
    }

    public void removePJTemplate() {
        flushPreference(PJ_TEMPLATE_PREF_NAME);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void removePrivacyLocationConfig() {
        flushPreference(PRIVACY_LOCATION_MODE_PREF_NAME);
        flushPreference(PRIVACY_LOCATION_ACCURACY_IN_METERS_PREF_NAME);
    }

    public void removeVendorList() {
        flushPreference(NON_IAB_VENDORLIST);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void resetWebResoucesLastPing() {
        flushPreference(SIS_LAST_PING_WEB_RESOURCES);
    }

    void resetWrapperDetectionLastPing() {
        flushPreference(SDK_WRAPPER_PING);
    }

    public void saveAaxHostname(String str) {
        saveHostName(str, AAX_HOSTNAME_PREF_NAME);
    }

    public void saveAaxVideoHostname(String str) {
        saveHostName(str, AAX_VIDEO_HOSTNAME_PREF_NAME);
    }

    public void saveAdId(String str) {
        if (str != null) {
            savePref(ADID_PREF_NAME, str);
        }
    }

    public void saveBidTimeout(Integer num) {
        savePref(BID_TIMEOUT_PREF_NAME, num);
    }

    public void saveCMPFlavor(String str) {
        savePref(NON_IAB_CMP_FLAVOR, str);
    }

    public void saveConfigLastCheckIn(long j) {
        savePref(CONFIG_LAST_CHECKIN_PREF_NAME, Long.valueOf(j));
    }

    public synchronized void saveConfigTtlInMilliSeconds(long j) {
        long j2 = j * 1000;
        if (j2 < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            savePref(CONFIG_TTL_PREF_NAME, 172800000L);
        } else {
            savePref(CONFIG_TTL_PREF_NAME, Long.valueOf(j2));
        }
    }

    public void saveConsentStatus(String str) {
        savePref(NON_IAB_CONSENT_STATUS, str);
    }

    public void saveIdfa(String str) {
        if (str != null) {
            savePref(IDFA_PREF_NAME, str);
        } else {
            savePref(IDFA_PREF_NAME, "");
        }
    }

    public void saveIsAdIdChanged(boolean z) {
        savePref(IS_ADID_CHANGED_PREF_NAME, Boolean.valueOf(z));
    }

    public void saveIsAdIdNew(boolean z) {
        savePref(IS_ADID_NEW_PREF_NAME, Boolean.valueOf(z));
    }

    public void saveNonIABCustomConsent(String str) {
        savePref(NON_IAB_CUSTOM_CONSENT, str);
    }

    public synchronized void saveOptOut(Boolean bool) {
        flushPreference(OO_PREF_NAME);
        if (bool != null) {
            savePref(OO_PREF_NAME, bool);
        }
    }

    public void savePJTemplate(JSONObject jSONObject) {
        if (jSONObject != null) {
            savePref(PJ_TEMPLATE_PREF_NAME, jSONObject.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void savePrivacyLocationConfig(JSONObject jSONObject) {
        try {
            savePref(PRIVACY_LOCATION_MODE_PREF_NAME, jSONObject.getString("mode"));
            savePref(PRIVACY_LOCATION_ACCURACY_IN_METERS_PREF_NAME, Float.valueOf((float) jSONObject.getDouble("accuracyInMeters")));
        } catch (JSONException unused) {
            DtbLog.error(LOG_TAG, "Failed to save privacy configurations in shared preferences");
        }
    }

    public boolean saveSisEndpoint(String str) {
        if (!DtbCommonUtils.isNullOrEmpty(str)) {
            String str2 = (String) getPref(SIS_ENDPOINT_PREF_NAME, String.class);
            String str3 = str + "/api3";
            if (str2 != null && str2.equals(str3)) {
                return false;
            }
            savePref(SIS_ENDPOINT_PREF_NAME, str3);
            return true;
        }
        savePref(SIS_ENDPOINT_PREF_NAME, DtbConstants.SIS_END_POINT + "/api3");
        return false;
    }

    public void saveSisLastCheckIn(long j) {
        savePref(SIS_LAST_CHECKIN_PREF_NAME, Long.valueOf(j));
    }

    public void saveSisLastPing(long j) {
        savePref(SIS_LAST_PING_PREF_NAME, Long.valueOf(j));
    }

    public void saveVendorList(String str) {
        savePref(NON_IAB_VENDORLIST, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void saveWebResoucesLastPing(long j) {
        savePref(SIS_LAST_PING_WEB_RESOURCES, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void saveWrapperDetectionLastPing(long j) {
        savePref(SDK_WRAPPER_PING, Long.valueOf(j));
    }

    public void setIsSisRegisterationSuccessful(boolean z) {
        IS_SIS_REGISTERATION_SUCCESSFUL = z;
    }

    public void setVersionInUse(String str) {
        savePref(DTB_VERSION_IN_USE, str);
    }
}
