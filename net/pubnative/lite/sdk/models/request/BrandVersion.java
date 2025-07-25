package net.pubnative.lite.sdk.models.request;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class BrandVersion extends JsonModel {
    @BindField
    private String brand;
    @BindField
    private List<String> version;

    public BrandVersion() {
    }

    public String getBrand() {
        return this.brand;
    }

    public List<String> getVersion() {
        return this.version;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setVersion(List<String> list) {
        this.version = list;
    }

    public BrandVersion(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
