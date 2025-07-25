package com.pubmatic.sdk.nativead.request;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeImageAssetType;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBNativeRequestImageAsset extends POBBaseNativeRequestAsset {
    @NonNull

    /* renamed from: c */
    private final POBNativeImageAssetType f70479c;

    /* renamed from: d */
    private final int f70480d;

    /* renamed from: e */
    private final int f70481e;
    @NonNull

    /* renamed from: f */
    private List<String> f70482f;

    public POBNativeRequestImageAsset(int i, boolean z, @NonNull POBNativeImageAssetType pOBNativeImageAssetType, int i2, int i3) {
        super(i, z);
        this.f70479c = pOBNativeImageAssetType;
        this.f70480d = i2;
        this.f70481e = i3;
        this.f70482f = POBNativeConstants.MIMES;
    }

    @NonNull
    public List<String> getMimes() {
        return this.f70482f;
    }

    public int getMinimumHeight() {
        return this.f70481e;
    }

    public int getMinimumWidth() {
        return this.f70480d;
    }

    @Override // com.pubmatic.sdk.nativead.request.POBBaseNativeRequestAsset
    @NonNull
    public JSONObject getRTBJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", getId());
            jSONObject.put("required", isRequired() ? 1 : 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", this.f70479c.getImageAssetTypeValue());
            jSONObject2.put(POBNativeConstants.NATIVE_IMAGE_MIN_WIDTH, this.f70480d);
            jSONObject2.put(POBNativeConstants.NATIVE_IMAGE_MIN_HEIGHT, this.f70481e);
            if (!this.f70482f.isEmpty()) {
                jSONObject2.put(POBNativeConstants.NATIVE_MIMES, new JSONArray((Collection) this.f70482f));
            }
            jSONObject.put(POBNativeConstants.NATIVE_IMAGE, jSONObject2);
        } catch (JSONException e) {
            POBLog.error("POBNativeReqIMGAsset", String.format("JSON exception encountered while creating the JSONObject of %s class.", "POBNativeReqIMGAsset") + e.getMessage(), new Object[0]);
        }
        return jSONObject;
    }

    @NonNull
    public POBNativeImageAssetType getType() {
        return this.f70479c;
    }

    public void setMimes(@NonNull List<String> list) {
        this.f70482f = list;
    }
}
