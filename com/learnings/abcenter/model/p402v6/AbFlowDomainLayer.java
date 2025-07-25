package com.learnings.abcenter.model.p402v6;

import com.learnings.abcenter.util.AbCenterUtil;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.learnings.abcenter.model.v6.AbFlowDomainLayer */
/* loaded from: classes6.dex */
public class AbFlowDomainLayer {
    private String flowDomainId;

    /* renamed from: id */
    private String f54848id;
    private List<String> layerBucketList;

    public static AbFlowDomainLayer getFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            AbFlowDomainLayer abFlowDomainLayer = new AbFlowDomainLayer();
            abFlowDomainLayer.setId(AbCenterUtil.optString(jSONObject, "id"));
            abFlowDomainLayer.setFlowDomainId(AbCenterUtil.optString(jSONObject, "flow_domain_id"));
            abFlowDomainLayer.setLayerBucketList(AbCenterUtil.jsonArrayToStringList(jSONObject.optJSONArray("layer_buckets")));
            return abFlowDomainLayer;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getFlowDomainId() {
        return this.flowDomainId;
    }

    public String getId() {
        return this.f54848id;
    }

    public List<String> getLayerBucketList() {
        return this.layerBucketList;
    }

    public void setFlowDomainId(String str) {
        this.flowDomainId = str;
    }

    public void setId(String str) {
        this.f54848id = str;
    }

    public void setLayerBucketList(List<String> list) {
        this.layerBucketList = list;
    }
}
