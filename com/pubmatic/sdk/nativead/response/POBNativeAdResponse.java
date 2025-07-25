package com.pubmatic.sdk.nativead.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventTrackingMethod;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class POBNativeAdResponse {
    @Nullable

    /* renamed from: a */
    private final String f70494a;
    @NonNull

    /* renamed from: b */
    private final Map<Integer, POBNativeAdResponseAsset> f70495b;
    @Nullable

    /* renamed from: c */
    private final POBNativeAdLinkResponse f70496c;
    @Nullable

    /* renamed from: d */
    private final List<String> f70497d;
    @Nullable

    /* renamed from: e */
    private final String f70498e;
    @Nullable

    /* renamed from: f */
    private final List<POBNativeAdResponseEventTracker> f70499f;
    @Nullable

    /* renamed from: g */
    private final String f70500g;

    public POBNativeAdResponse(@Nullable String str, @NonNull List<POBNativeAdResponseAsset> list, @Nullable POBNativeAdLinkResponse pOBNativeAdLinkResponse, @Nullable List<String> list2, @Nullable String str2, @Nullable List<POBNativeAdResponseEventTracker> list3, @Nullable String str3) {
        this.f70494a = str;
        this.f70495b = m40425a(list);
        this.f70496c = pOBNativeAdLinkResponse;
        this.f70497d = list2;
        this.f70498e = str2;
        this.f70499f = list3;
        this.f70500g = str3;
    }

    @NonNull
    /* renamed from: a */
    private Map<Integer, POBNativeAdResponseAsset> m40425a(@NonNull List<POBNativeAdResponseAsset> list) {
        HashMap hashMap = new HashMap();
        for (POBNativeAdResponseAsset pOBNativeAdResponseAsset : list) {
            hashMap.put(Integer.valueOf(pOBNativeAdResponseAsset.getAssetId()), pOBNativeAdResponseAsset);
        }
        return hashMap;
    }

    @Nullable
    public POBNativeAdResponseAsset getAsset(int i) {
        return this.f70495b.get(Integer.valueOf(i));
    }

    @NonNull
    public Map<Integer, POBNativeAdResponseAsset> getAssets() {
        return this.f70495b;
    }

    @Nullable
    public List<POBNativeAdResponseEventTracker> getEventTrackers() {
        return this.f70499f;
    }

    @Nullable
    public List<String> getImpressionTrackers() {
        return this.f70497d;
    }

    @Nullable
    public String getJsTracker() {
        return this.f70498e;
    }

    @Nullable
    public POBNativeAdLinkResponse getLink() {
        return this.f70496c;
    }

    @Nullable
    public String getPrivacyUrl() {
        return this.f70500g;
    }

    @Nullable
    public String getVersion() {
        return this.f70494a;
    }

    @NonNull
    public String toString() {
        return "Version: " + this.f70494a + "\nAssets: " + this.f70495b + "\nLink: " + this.f70496c + "\nImpression Trackers: " + this.f70497d + "\nJS Tracker: " + this.f70498e + "\nEvent Trackers: " + this.f70499f + "\nPrivacy: " + this.f70500g;
    }

    @Nullable
    public List<POBNativeAdResponseEventTracker> getEventTrackers(@NonNull POBNativeEventType pOBNativeEventType, @NonNull POBNativeEventTrackingMethod pOBNativeEventTrackingMethod) {
        if (this.f70499f != null) {
            ArrayList arrayList = new ArrayList();
            for (POBNativeAdResponseEventTracker pOBNativeAdResponseEventTracker : this.f70499f) {
                if (pOBNativeAdResponseEventTracker != null && pOBNativeAdResponseEventTracker.getType() == pOBNativeEventType && pOBNativeAdResponseEventTracker.getTrackingMethod() == pOBNativeEventTrackingMethod) {
                    arrayList.add(pOBNativeAdResponseEventTracker);
                }
            }
            return arrayList;
        }
        return null;
    }
}
