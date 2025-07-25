package com.pubmatic.sdk.nativead;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.nativead.request.POBBaseNativeRequestAsset;
import com.pubmatic.sdk.nativead.request.POBNativeRequestEventTracker;
import com.pubmatic.sdk.openwrap.core.POBNative;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeContextSubType;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeContextType;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativePlacementType;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBNativeBuilder implements POBNative {
    @NonNull

    /* renamed from: a */
    private final List<POBBaseNativeRequestAsset> f70446a;
    @NonNull

    /* renamed from: b */
    private final List<POBNativeRequestEventTracker> f70447b;
    @NonNull

    /* renamed from: c */
    private final Set<Integer> f70448c;
    @Nullable

    /* renamed from: d */
    private POBNativeAdLoaderConfig f70449d;

    public POBNativeBuilder(@NonNull List<POBBaseNativeRequestAsset> list, @NonNull List<POBNativeRequestEventTracker> list2, @NonNull Set<Integer> set) {
        this.f70446a = list;
        this.f70447b = list2;
        this.f70448c = set;
    }

    @NonNull
    /* renamed from: a */
    private String m40447a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(POBNativeConstants.NATIVE_VERSION, "1.2");
        POBNativeAdLoaderConfig pOBNativeAdLoaderConfig = this.f70449d;
        if (pOBNativeAdLoaderConfig != null) {
            POBNativeContextType contextType = pOBNativeAdLoaderConfig.getContextType();
            if (contextType != null) {
                jSONObject.put(POBNativeConstants.NATIVE_CONTEXT, contextType.getValue());
            }
            POBNativeContextSubType contextSubType = this.f70449d.getContextSubType();
            if (contextSubType != null) {
                jSONObject.put(POBNativeConstants.NATIVE_CONTEXT_SUBTYPE, contextSubType.getValue());
            }
            POBNativePlacementType placementType = this.f70449d.getPlacementType();
            if (placementType != null) {
                jSONObject.put(POBNativeConstants.NATIVE_PLACEMENT_TYPE, placementType.getValue());
            }
        }
        JSONArray jSONArray = new JSONArray();
        for (POBBaseNativeRequestAsset pOBBaseNativeRequestAsset : this.f70446a) {
            jSONArray.put(pOBBaseNativeRequestAsset.getRTBJSON());
        }
        jSONObject.put(POBNativeConstants.NATIVE_ASSETS, jSONArray);
        if (!this.f70447b.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            for (POBNativeRequestEventTracker pOBNativeRequestEventTracker : this.f70447b) {
                jSONArray2.put(pOBNativeRequestEventTracker.getRTBJSON());
            }
            jSONObject.put(POBNativeConstants.NATIVE_EVENT_TRACKERS, jSONArray2);
        }
        jSONObject.put("privacy", 1);
        return jSONObject.toString();
    }

    @NonNull
    public List<POBBaseNativeRequestAsset> getAssets() {
        return this.f70446a;
    }

    @Nullable
    public POBNativeAdLoaderConfig getConfig() {
        return this.f70449d;
    }

    @NonNull
    public List<POBNativeRequestEventTracker> getEventTrackers() {
        return this.f70447b;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBNative
    @NonNull
    public JSONObject getRTBJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("request", m40447a());
            jSONObject.put(POBNativeConstants.NATIVE_VERSION, "1.2");
            jSONObject.put("api", new JSONArray((Collection) this.f70448c));
        } catch (JSONException e) {
            POBLog.error("POBNativeBuilder", String.format("JSON exception encountered while creating the JSONObject of %s class.", "POBNativeBuilder") + e.getMessage(), new Object[0]);
        }
        return jSONObject;
    }

    @NonNull
    public Set<Integer> getSupportedAPIs() {
        return this.f70448c;
    }

    public void setConfig(@NonNull POBNativeAdLoaderConfig pOBNativeAdLoaderConfig) {
        this.f70449d = pOBNativeAdLoaderConfig;
    }
}
