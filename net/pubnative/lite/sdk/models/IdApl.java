package net.pubnative.lite.sdk.models;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class IdApl extends JsonModel {
    @BindField
    public String IDFA;
    @BindField
    public String IDFV;

    public IdApl() {
    }

    public IdApl(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
