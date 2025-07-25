package net.pubnative.lite.sdk.models;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class IdDevice extends JsonModel {
    @BindField
    public IdBattery battery;
    @BindField
    public String brand;
    @BindField

    /* renamed from: id */
    public String f101926id;
    @BindField
    public String manufacture;
    @BindField
    public String model;
    @BindField

    /* renamed from: os */
    public IdOs f101927os;

    public IdDevice() {
    }

    public IdDevice(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
