package net.pubnative.lite.sdk.models;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class RemoteConfigAppInfo extends JsonModel {
    @BindField
    public String app_store_id;
    @BindField
    public List<String> iab_categories;
    @BindField

    /* renamed from: pf */
    public Double f101936pf;
    @BindField

    /* renamed from: pm */
    public Double f101937pm;

    public RemoteConfigAppInfo() {
    }

    public RemoteConfigAppInfo(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
