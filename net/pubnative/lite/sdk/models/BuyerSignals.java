package net.pubnative.lite.sdk.models;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class BuyerSignals extends JsonModel {
    @BindField
    public List<BuyerSignal> igbuyer;

    public BuyerSignals() {
    }

    public List<BuyerSignal> getBuyerSignals() {
        return this.igbuyer;
    }

    public BuyerSignals(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
