package net.pubnative.lite.sdk.models;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class BuyerSignal extends JsonModel {
    @BindField
    public String buyer_experiment_group_id;
    @BindField
    public List<String> buyerdata;
    @BindField
    public String origin;

    public BuyerSignal() {
    }

    public List<String> getBuyerData() {
        return this.buyerdata;
    }

    public String getBuyerDataJson() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.buyerdata;
        if (list != null && !list.isEmpty()) {
            for (String str : this.buyerdata) {
                jSONArray.put(str);
            }
        }
        return jSONArray.toString();
    }

    public String getBuyerExperimentGroupId() {
        return this.buyer_experiment_group_id;
    }

    public String getOrigin() {
        return this.origin;
    }

    public BuyerSignal(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
