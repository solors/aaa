package net.pubnative.lite.sdk.models;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class IdAudience extends JsonModel {
    @BindField

    /* renamed from: id */
    public String f101924id;
    @BindField

    /* renamed from: ts */
    public String f101925ts;
    @BindField
    public String type;

    public IdAudience() {
    }

    public IdAudience(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
