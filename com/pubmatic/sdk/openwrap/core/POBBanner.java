package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBBanner {
    @Nullable

    /* renamed from: a */
    private POBAdSize[] f70573a;
    @Nullable

    /* renamed from: b */
    private POBRequest.AdPosition f70574b;

    public POBBanner(@Nullable POBAdSize... pOBAdSizeArr) {
        this.f70573a = pOBAdSizeArr;
        this.f70574b = POBRequest.AdPosition.UNKNOWN;
    }

    @NonNull
    public JSONObject getRTBJson(@NonNull Set<Integer> set, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        POBRequest.AdPosition adPosition = this.f70574b;
        if (adPosition != null) {
            jSONObject.put("pos", adPosition.getValue());
        }
        POBAdSize[] pOBAdSizeArr = this.f70573a;
        if (pOBAdSizeArr != null) {
            jSONObject.put("format", getSizeArray(pOBAdSizeArr));
        }
        if (!set.isEmpty()) {
            jSONObject.put("api", new JSONArray((Collection) set));
        }
        if (z) {
            jSONObject.put("vcm", 1);
            if (POBRequest.AdPosition.FULL_SCREEN.equals(this.f70574b)) {
                jSONObject.put("api", new JSONArray((Collection) getSupportedAPIs(true)));
            }
        }
        return jSONObject;
    }

    public JSONArray getSizeArray(@NonNull POBAdSize... pOBAdSizeArr) {
        JSONArray jSONArray = new JSONArray();
        for (POBAdSize pOBAdSize : pOBAdSizeArr) {
            if (pOBAdSize != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(POBNativeConstants.NATIVE_IMAGE_WIDTH, pOBAdSize.getAdWidth());
                    jSONObject.put("h", pOBAdSize.getAdHeight());
                    jSONArray.put(jSONObject);
                } catch (JSONException unused) {
                    POBLog.error("POBBanner", "Error on formatting width/height in ad request.", new Object[0]);
                }
            }
        }
        return jSONArray;
    }

    @NonNull
    public Set<Integer> getSupportedAPIs(boolean z) {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(POBRequest.API.MRAID2.getValue()));
        hashSet.add(Integer.valueOf(POBRequest.API.MRAID3.getValue()));
        if (!z && POBInstanceProvider.getSdkConfig().getMeasurementProvider("com.pubmatic.sdk.omsdk.POBHTMLMeasurement") != null) {
            hashSet.add(Integer.valueOf(POBRequest.API.OMSDK.getValue()));
        }
        return hashSet;
    }

    public void setAdPosition(@Nullable POBRequest.AdPosition adPosition) {
        this.f70574b = adPosition;
    }

    public void setAdSizes(@Nullable POBAdSize... pOBAdSizeArr) {
        this.f70573a = pOBAdSizeArr;
    }

    public POBBanner() {
    }
}
