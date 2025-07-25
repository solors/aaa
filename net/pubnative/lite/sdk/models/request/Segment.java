package net.pubnative.lite.sdk.models.request;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class Segment extends JsonModel {
    @BindField

    /* renamed from: id */
    private String f101978id;
    @BindField
    private String name;
    @BindField
    private String signal;
    @BindField
    private String value;

    public Segment() {
    }

    public String getId() {
        return this.f101978id;
    }

    public String getName() {
        return this.name;
    }

    public String getSignal() {
        return this.signal;
    }

    public String getValue() {
        return this.value;
    }

    public void setId(String str) {
        this.f101978id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSignal(String str) {
        this.signal = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public Segment(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
