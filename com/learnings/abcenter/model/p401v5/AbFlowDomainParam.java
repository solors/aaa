package com.learnings.abcenter.model.p401v5;

import com.learnings.abcenter.util.AbCenterUtil;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.learnings.abcenter.model.v5.AbFlowDomainParam */
/* loaded from: classes6.dex */
public class AbFlowDomainParam {
    private List<String> buckets;
    private String domain_tag;

    /* renamed from: id */
    private String f54845id;
    private List<String> keep_hit;

    public static AbFlowDomainParam getFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            AbFlowDomainParam abFlowDomainParam = new AbFlowDomainParam();
            abFlowDomainParam.setId(AbCenterUtil.optString(jSONObject, "id"));
            abFlowDomainParam.setDomainTag(AbCenterUtil.optString(jSONObject, "domain_tag"));
            abFlowDomainParam.setBuckets(AbCenterUtil.jsonArrayToStringList(jSONObject.optJSONArray("buckets")));
            abFlowDomainParam.setKeepHit(AbCenterUtil.jsonArrayToStringList(jSONObject.optJSONArray("keep_hit")));
            return abFlowDomainParam;
        } catch (Throwable unused) {
            return null;
        }
    }

    public List<String> getBuckets() {
        return this.buckets;
    }

    public String getDomainTag() {
        return this.domain_tag;
    }

    public String getId() {
        return this.f54845id;
    }

    public List<String> getKeepHit() {
        return this.keep_hit;
    }

    public void setBuckets(List<String> list) {
        this.buckets = list;
    }

    public void setDomainTag(String str) {
        this.domain_tag = str;
    }

    public void setId(String str) {
        this.f54845id = str;
    }

    public void setKeepHit(List<String> list) {
        this.keep_hit = list;
    }
}
