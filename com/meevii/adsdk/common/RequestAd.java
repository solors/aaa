package com.meevii.adsdk.common;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class RequestAd {
    private Map<String, Object> extras = new HashMap();
    Object mAd;
    String mAdRequestId;
    AdType mAdType;
    String mUnitId;

    public RequestAd(String str, String str2, AdType adType) {
        this.mAdType = adType;
        this.mUnitId = str;
        this.mAdRequestId = str2;
    }

    public String getAdRequestId() {
        return this.mAdRequestId;
    }

    public AdType getAdType() {
        return this.mAdType;
    }

    public Object getExtra(String str) {
        return this.extras.get(str);
    }

    public Map<String, Object> getExtras() {
        return this.extras;
    }

    public Object getLoadingAd() {
        return this.mAd;
    }

    public String getUnitId() {
        return this.mUnitId;
    }

    public void putExtra(String str, Object obj) {
        this.extras.put(str, obj);
    }

    public void withLoadingAd(Object obj) {
        this.mAd = obj;
    }
}
