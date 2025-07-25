package com.learnings.abcenter.model.p401v5;

import android.text.TextUtils;
import com.learnings.abcenter.util.AbCenterUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.learnings.abcenter.model.v5.AbConfigV5 */
/* loaded from: classes6.dex */
public class AbConfigV5 {
    private List<AbFlowDomainParam> flow_domain_params;
    private List<AbLayer> layers;
    private List<AbExperiment> params;
    private long version_code;

    private static List<AbExperiment> getAbExperimentListFromJson(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(AbExperiment.getFromJson(jSONArray.optJSONObject(i)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static List<AbFlowDomainParam> getAbFlowDomainParasFromJson(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(AbFlowDomainParam.getFromJson(jSONArray.optJSONObject(i)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static List<AbLayer> getAbLayerLayersListFromJson(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(AbLayer.getFromJson(jSONArray.optJSONObject(i)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static AbConfigV5 getFromJson(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return getFromJson(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public List<AbExperiment> getExperimentList() {
        return this.params;
    }

    public List<AbFlowDomainParam> getFlowDomainParams() {
        return this.flow_domain_params;
    }

    public List<AbLayer> getLayers() {
        return this.layers;
    }

    public long getVersionCode() {
        return this.version_code;
    }

    public void setFlowDomainParams(List<AbFlowDomainParam> list) {
        this.flow_domain_params = list;
    }

    public void setLayers(List<AbLayer> list) {
        this.layers = list;
    }

    public void setParams(List<AbExperiment> list) {
        this.params = list;
    }

    public void setVersionCode(long j) {
        this.version_code = j;
    }

    public String toJson() {
        return AbCenterUtil.getGson().toJson(this);
    }

    public static AbConfigV5 getFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            AbConfigV5 abConfigV5 = new AbConfigV5();
            abConfigV5.setLayers(getAbLayerLayersListFromJson(jSONObject.optJSONArray("layers")));
            abConfigV5.setParams(getAbExperimentListFromJson(jSONObject.optJSONArray("params")));
            abConfigV5.setVersionCode(jSONObject.optLong("version_code"));
            abConfigV5.setFlowDomainParams(getAbFlowDomainParasFromJson(jSONObject.optJSONArray("flow_domain_params")));
            return abConfigV5;
        } catch (Throwable unused) {
            return null;
        }
    }
}
