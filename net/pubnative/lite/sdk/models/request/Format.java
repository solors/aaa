package net.pubnative.lite.sdk.models.request;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class Format extends JsonModel {
    @BindField

    /* renamed from: h */
    private Integer f101971h;
    @BindField
    private Integer hratio;
    @BindField

    /* renamed from: w */
    private Integer f101972w;
    @BindField
    private Integer wmin;
    @BindField
    private Integer wratio;

    public Format() {
    }

    public Integer getHeight() {
        return this.f101971h;
    }

    public Integer getHeightRatio() {
        return this.hratio;
    }

    public Integer getWidth() {
        return this.f101972w;
    }

    public Integer getWidthMin() {
        return this.wmin;
    }

    public Integer getWidthRatio() {
        return this.wratio;
    }

    public void setHeight(Integer num) {
        this.f101971h = num;
    }

    public void setHeightRatio(Integer num) {
        this.hratio = num;
    }

    public void setWidth(Integer num) {
        this.f101972w = num;
    }

    public void setWidthMin(Integer num) {
        this.wmin = num;
    }

    public void setWidthRatio(Integer num) {
        this.wratio = num;
    }

    public Format(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
