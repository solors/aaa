package com.pubmatic.sdk.nativead.request;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBNativeRequestTitleAsset extends POBBaseNativeRequestAsset {

    /* renamed from: c */
    private final int f70483c;

    public POBNativeRequestTitleAsset(int i, boolean z, int i2) {
        super(i, z);
        this.f70483c = i2;
    }

    public int getLength() {
        return this.f70483c;
    }

    @Override // com.pubmatic.sdk.nativead.request.POBBaseNativeRequestAsset
    @NonNull
    public JSONObject getRTBJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", getId());
            jSONObject.put("required", isRequired() ? 1 : 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(POBNativeConstants.NATIVE_LENGTH, this.f70483c);
            jSONObject.put("title", jSONObject2);
        } catch (JSONException e) {
            POBLog.error("POBNativeReqTitleAsset", String.format("JSON exception encountered while creating the JSONObject of %s class.", "POBNativeReqTitleAsset") + e.getMessage(), new Object[0]);
        }
        return jSONObject;
    }
}
