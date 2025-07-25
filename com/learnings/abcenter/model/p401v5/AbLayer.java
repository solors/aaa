package com.learnings.abcenter.model.p401v5;

import com.learnings.abcenter.util.AbCenterUtil;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.learnings.abcenter.model.v5.AbLayer */
/* loaded from: classes6.dex */
public class AbLayer {
    private List<String> buckets;

    /* renamed from: id */
    private String f54846id;

    public static AbLayer getFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            AbLayer abLayer = new AbLayer();
            abLayer.setId(AbCenterUtil.optString(jSONObject, "id"));
            abLayer.setBuckets(AbCenterUtil.jsonArrayToStringList(jSONObject.optJSONArray("buckets")));
            return abLayer;
        } catch (Throwable unused) {
            return null;
        }
    }

    public List<String> getBuckets() {
        return this.buckets;
    }

    public String getId() {
        return this.f54846id;
    }

    public void setBuckets(List<String> list) {
        this.buckets = list;
    }

    public void setId(String str) {
        this.f54846id = str;
    }
}
