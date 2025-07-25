package net.pubnative.lite.sdk.models;

import com.learnings.abcenter.util.AbCenterConstant;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class AdData extends JsonModel implements Serializable {
    @BindField
    public Map<String, Object> data;
    @BindField
    public String type;

    public AdData() {
    }

    public Boolean getBooleanField(String str) {
        return (Boolean) getDataField(str);
    }

    protected Object getDataField(String str) {
        Map<String, Object> map = this.data;
        if (map != null && map.containsKey(str)) {
            return this.data.get(str);
        }
        return null;
    }

    public Double getDoubleField(String str) {
        if (getDataField(str) instanceof Number) {
            return Double.valueOf(((Number) getDataField(str)).doubleValue());
        }
        return null;
    }

    public int getHeight() {
        return getIntField("h").intValue();
    }

    public String getHtml() {
        return getStringField("html");
    }

    public Integer getIntField(String str) {
        return (Integer) getDataField(str);
    }

    public String getJS() {
        return getStringField("js");
    }

    public JSONObject getJSONObjectField(String str) {
        return (JSONObject) getDataField(str);
    }

    public Double getNumber() {
        return getDoubleField(AbCenterConstant.VALUE_TYPE_NUMBER);
    }

    public String getStringField(String str) {
        try {
            return (String) getDataField(str);
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public String getText() {
        return getStringField("text");
    }

    public String getURL() {
        return getStringField("url");
    }

    public int getWidth() {
        return getIntField(POBNativeConstants.NATIVE_IMAGE_WIDTH).intValue();
    }

    public Boolean hasField(String str) {
        return Boolean.valueOf(this.data.containsKey(str));
    }

    public AdData(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }

    public AdData(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        this.data = hashMap;
        hashMap.put(str, str3);
        this.type = str2;
    }
}
