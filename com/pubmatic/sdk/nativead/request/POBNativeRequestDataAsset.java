package com.pubmatic.sdk.nativead.request;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeDataAssetType;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBNativeRequestDataAsset extends POBBaseNativeRequestAsset {
    @NonNull

    /* renamed from: c */
    private final POBNativeDataAssetType f70475c;

    /* renamed from: d */
    private int f70476d;

    public POBNativeRequestDataAsset(int i, boolean z, @NonNull POBNativeDataAssetType pOBNativeDataAssetType) {
        super(i, z);
        this.f70475c = pOBNativeDataAssetType;
    }

    public int getLength() {
        return this.f70476d;
    }

    @Override // com.pubmatic.sdk.nativead.request.POBBaseNativeRequestAsset
    @NonNull
    public JSONObject getRTBJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", getId());
            jSONObject.put("required", isRequired() ? 1 : 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", this.f70475c.getDataAssetTypeValue());
            jSONObject2.put(POBNativeConstants.NATIVE_LENGTH, this.f70476d);
            jSONObject.put("data", jSONObject2);
        } catch (JSONException e) {
            POBLog.error("POBNativeReqDataAsset", String.format("JSON exception encountered while creating the JSONObject of %s class.", "POBNativeReqDataAsset") + e.getMessage(), new Object[0]);
        }
        return jSONObject;
    }

    @NonNull
    public POBNativeDataAssetType getType() {
        return this.f70475c;
    }

    public void setLength(int i) {
        this.f70476d = i;
    }
}
