package net.pubnative.lite.sdk.models.request;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class Source extends JsonModel {
    @BindField

    /* renamed from: fd */
    private Integer f101980fd;
    @BindField
    private String pchain;
    @BindField
    private String tid;

    public Source() {
    }

    public Integer getFinalDecision() {
        return this.f101980fd;
    }

    public String getPaymentIdChain() {
        return this.pchain;
    }

    public String getTransactionId() {
        return this.tid;
    }

    public Source(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
