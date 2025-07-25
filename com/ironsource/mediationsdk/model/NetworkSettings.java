package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.C20086i9;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class NetworkSettings {

    /* renamed from: r */
    private static final String f51695r = "customNetwork";

    /* renamed from: s */
    private static final String f51696s = "customNetworkPackage";

    /* renamed from: t */
    private static final String f51697t = "customNetworkAdapterName";

    /* renamed from: a */
    private String f51698a;

    /* renamed from: b */
    private String f51699b;

    /* renamed from: c */
    private JSONObject f51700c;

    /* renamed from: d */
    private JSONObject f51701d;

    /* renamed from: e */
    private JSONObject f51702e;

    /* renamed from: f */
    private JSONObject f51703f;

    /* renamed from: g */
    private JSONObject f51704g;

    /* renamed from: h */
    private String f51705h;

    /* renamed from: i */
    private String f51706i;

    /* renamed from: j */
    private boolean f51707j;

    /* renamed from: k */
    private String f51708k;

    /* renamed from: l */
    private int f51709l;

    /* renamed from: m */
    private int f51710m;

    /* renamed from: n */
    private int f51711n;

    /* renamed from: o */
    private int f51712o;

    /* renamed from: p */
    private String f51713p;

    /* renamed from: q */
    private String f51714q;

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f51698a = networkSettings.getProviderName();
        this.f51708k = networkSettings.getProviderName();
        this.f51699b = networkSettings.getProviderTypeForReflection();
        this.f51701d = networkSettings.getRewardedVideoSettings();
        this.f51702e = networkSettings.getInterstitialSettings();
        this.f51703f = networkSettings.getBannerSettings();
        this.f51704g = networkSettings.getNativeAdSettings();
        this.f51700c = networkSettings.getApplicationSettings();
        this.f51709l = networkSettings.getRewardedVideoPriority();
        this.f51710m = networkSettings.getInterstitialPriority();
        this.f51711n = networkSettings.getBannerPriority();
        this.f51712o = networkSettings.getNativeAdPriority();
        this.f51713p = networkSettings.getProviderDefaultInstance();
        this.f51714q = networkSettings.getProviderNetworkKey();
    }

    public String getAdSourceNameForEvents() {
        return this.f51706i;
    }

    public JSONObject getApplicationSettings() {
        return this.f51700c;
    }

    public int getBannerPriority() {
        return this.f51711n;
    }

    public JSONObject getBannerSettings() {
        return this.f51703f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f51700c;
        if (jSONObject != null) {
            return jSONObject.optString("customNetwork");
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.AD_UNIT ad_unit) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if ((ad_unit == null && (jSONObject2 = this.f51700c) != null) || ((ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) && (jSONObject2 = this.f51701d) != null) || ((ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL) && (jSONObject2 = this.f51702e) != null) || (ad_unit.equals(IronSource.AD_UNIT.BANNER) && (jSONObject2 = this.f51703f) != null)))) {
            return jSONObject2.optString(f51697t);
        }
        if (ad_unit.equals(IronSource.AD_UNIT.NATIVE_AD) && (jSONObject = this.f51704g) != null) {
            return jSONObject.optString(f51697t);
        }
        return null;
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f51700c;
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.optString(f51696s, "");
    }

    public int getInstanceType(IronSource.AD_UNIT ad_unit) {
        JSONObject nativeAdSettings;
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            nativeAdSettings = getRewardedVideoSettings();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            nativeAdSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            nativeAdSettings = getBannerSettings();
        } else if (ad_unit == IronSource.AD_UNIT.NATIVE_AD) {
            nativeAdSettings = getNativeAdSettings();
        } else {
            return 1;
        }
        return nativeAdSettings.optInt("instanceType");
    }

    public int getInterstitialPriority() {
        return this.f51710m;
    }

    public JSONObject getInterstitialSettings() {
        return this.f51702e;
    }

    public int getMaxAdsPerSession(IronSource.AD_UNIT ad_unit) {
        JSONObject nativeAdSettings;
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            nativeAdSettings = getRewardedVideoSettings();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            nativeAdSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            nativeAdSettings = getBannerSettings();
        } else if (ad_unit != IronSource.AD_UNIT.NATIVE_AD) {
            return 99;
        } else {
            nativeAdSettings = getNativeAdSettings();
        }
        return nativeAdSettings.optInt("maxAdsPerSession", 99);
    }

    public int getNativeAdPriority() {
        return this.f51712o;
    }

    public JSONObject getNativeAdSettings() {
        return this.f51704g;
    }

    public String getProviderDefaultInstance() {
        return this.f51713p;
    }

    public String getProviderInstanceName() {
        return this.f51708k;
    }

    public String getProviderName() {
        return this.f51698a;
    }

    public String getProviderNetworkKey() {
        return this.f51714q;
    }

    public String getProviderTypeForReflection() {
        return this.f51699b;
    }

    public int getRewardedVideoPriority() {
        return this.f51709l;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f51701d;
    }

    public String getSubProviderId() {
        return this.f51705h;
    }

    public boolean isBidder(IronSource.AD_UNIT ad_unit) {
        if (isCustomNetwork() || getInstanceType(ad_unit) != 2) {
            return false;
        }
        return true;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase("IronSource");
    }

    public boolean isMultipleInstances() {
        return this.f51707j;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f51706i = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f51700c = jSONObject;
    }

    public void setBannerPriority(int i) {
        this.f51711n = i;
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f51703f.put(str, obj);
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void setInterstitialPriority(int i) {
        this.f51710m = i;
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.f51702e.put(str, obj);
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void setIsMultipleInstances(boolean z) {
        this.f51707j = z;
    }

    public void setNativeAdPriority(int i) {
        this.f51712o = i;
    }

    public void setNativeAdSettings(String str, Object obj) {
        try {
            this.f51704g.put(str, obj);
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void setProviderNetworkKey(String str) {
        this.f51714q = str;
    }

    public void setRewardedVideoPriority(int i) {
        this.f51709l = i;
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.f51701d.put(str, obj);
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void setSubProviderId(String str) {
        this.f51705h = str;
    }

    public boolean shouldEarlyInit() {
        JSONObject jSONObject = this.f51700c;
        if (jSONObject != null) {
            return jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        }
        return false;
    }

    public NetworkSettings(String str) {
        this.f51698a = str;
        this.f51708k = str;
        this.f51699b = str;
        this.f51713p = str;
        this.f51714q = str;
        this.f51701d = new JSONObject();
        this.f51702e = new JSONObject();
        this.f51703f = new JSONObject();
        this.f51704g = new JSONObject();
        this.f51700c = new JSONObject();
        this.f51709l = -1;
        this.f51710m = -1;
        this.f51711n = -1;
        this.f51712o = -1;
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f51703f = jSONObject;
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f51702e = jSONObject;
    }

    public void setNativeAdSettings(JSONObject jSONObject) {
        this.f51704g = jSONObject;
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f51701d = jSONObject;
    }

    public NetworkSettings(String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        this.f51698a = str;
        this.f51708k = str;
        this.f51699b = str2;
        this.f51713p = str3;
        this.f51714q = str4;
        this.f51701d = jSONObject2;
        this.f51702e = jSONObject3;
        this.f51703f = jSONObject4;
        this.f51704g = jSONObject5;
        this.f51700c = jSONObject;
        this.f51709l = -1;
        this.f51710m = -1;
        this.f51711n = -1;
        this.f51712o = -1;
    }
}
