package com.pubmatic.sdk.nativead.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.viewability.POBVerificationScriptResource;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventTrackingMethod;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBNativeAdResponseEventTracker implements POBVerificationScriptResource {
    @NonNull

    /* renamed from: a */
    private final String f70504a;
    @NonNull

    /* renamed from: b */
    private final POBNativeEventType f70505b;
    @NonNull

    /* renamed from: c */
    private final POBNativeEventTrackingMethod f70506c;
    @Nullable

    /* renamed from: d */
    private JSONObject f70507d;
    @NonNull

    /* renamed from: e */
    private final List<String> f70508e;

    public POBNativeAdResponseEventTracker(@NonNull String str, @NonNull POBNativeEventType pOBNativeEventType, @NonNull POBNativeEventTrackingMethod pOBNativeEventTrackingMethod) {
        this.f70504a = str;
        this.f70505b = pOBNativeEventType;
        this.f70506c = pOBNativeEventTrackingMethod;
        ArrayList arrayList = new ArrayList();
        this.f70508e = arrayList;
        arrayList.add(str);
    }

    @Nullable
    public JSONObject getExt() {
        return this.f70507d;
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVerificationScriptResource
    @Nullable
    public List<String> getJavaScriptResource() {
        return this.f70508e;
    }

    @NonNull
    public POBNativeEventTrackingMethod getTrackingMethod() {
        return this.f70506c;
    }

    @NonNull
    public POBNativeEventType getType() {
        return this.f70505b;
    }

    @NonNull
    public String getUrl() {
        return this.f70504a;
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVerificationScriptResource
    @Nullable
    public String getVendorKey() {
        JSONObject jSONObject = this.f70507d;
        if (jSONObject != null) {
            return jSONObject.optString(POBNativeConstants.NATIVE_VENDOR_KEY);
        }
        return null;
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVerificationScriptResource
    @Nullable
    public String getVerificationParameter() {
        JSONObject jSONObject = this.f70507d;
        if (jSONObject != null) {
            return jSONObject.optString(POBNativeConstants.NATIVE_VERIFICATION_PARAMETERS);
        }
        return null;
    }

    public void setExt(@Nullable JSONObject jSONObject) {
        this.f70507d = jSONObject;
    }

    @NonNull
    public String toString() {
        return "{\n Event Type: " + this.f70505b + "\nEvent Tracking Method: " + this.f70506c + "\nUrl: " + this.f70504a + " \n}";
    }
}
