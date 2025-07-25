package net.pubnative.lite.sdk.models;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class IdAppVendor extends JsonModel {
    @BindField
    public IdApl APL;
    @BindField

    /* renamed from: LR */
    public IdLr f101923LR;
    @BindField
    public IdTtd TTD;

    public IdAppVendor() {
    }

    public IdAppVendor(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
