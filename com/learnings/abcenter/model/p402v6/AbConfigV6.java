package com.learnings.abcenter.model.p402v6;

import android.text.TextUtils;
import com.learnings.abcenter.util.CheckUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.learnings.abcenter.model.v6.AbConfigV6 */
/* loaded from: classes6.dex */
public class AbConfigV6 {
    private List<AbExp> expList;
    private Map<String, AbExp> expMap;
    private List<AbFlowDomainTree> flowDomainList;
    private List<AbFlowDomainLayer> layerList;
    private List<AbStrategy> strategyList;
    private long versionCode;

    private static List<AbExp> getAbExpListFromJson(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(AbExp.getFromJson(jSONArray.optJSONObject(i)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static List<AbFlowDomainLayer> getAbLayerListFromJson(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(AbFlowDomainLayer.getFromJson(jSONArray.optJSONObject(i)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static List<AbStrategy> getAbStrategyListFromJson(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(AbStrategy.getFromJson(jSONArray.optJSONObject(i)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static AbConfigV6 getFromJson(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return getFromJson(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public AbExp getExp(String str) {
        return getExpMap().get(str);
    }

    public List<AbExp> getExpList() {
        return this.expList;
    }

    public Map<String, AbExp> getExpMap() {
        if (this.expMap == null) {
            this.expMap = new HashMap();
            if (!CheckUtil.isListNullOrEmpty(this.expList)) {
                for (AbExp abExp : this.expList) {
                    if (abExp != null) {
                        String id2 = abExp.getId();
                        if (!TextUtils.isEmpty(id2)) {
                            this.expMap.put(id2, abExp);
                        }
                    }
                }
            }
        }
        return this.expMap;
    }

    public List<AbFlowDomainTree> getFlowDomainList() {
        return this.flowDomainList;
    }

    public List<AbFlowDomainLayer> getLayerList() {
        return this.layerList;
    }

    public List<AbStrategy> getStrategyList() {
        return this.strategyList;
    }

    public long getVersionCode() {
        return this.versionCode;
    }

    public void setExpList(List<AbExp> list) {
        this.expList = list;
    }

    public void setFlowDomainList(List<AbFlowDomainTree> list) {
        this.flowDomainList = list;
    }

    public void setLayerList(List<AbFlowDomainLayer> list) {
        this.layerList = list;
    }

    public void setStrategyList(List<AbStrategy> list) {
        this.strategyList = list;
    }

    public void setVersionCode(long j) {
        this.versionCode = j;
    }

    private static AbConfigV6 getFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            AbConfigV6 abConfigV6 = new AbConfigV6();
            abConfigV6.setVersionCode(jSONObject.optLong("version_code"));
            abConfigV6.setExpList(getAbExpListFromJson(jSONObject.optJSONArray("v6_exp")));
            abConfigV6.setStrategyList(getAbStrategyListFromJson(jSONObject.optJSONArray("v6_strategy")));
            abConfigV6.setLayerList(getAbLayerListFromJson(jSONObject.optJSONArray("v6_layer")));
            abConfigV6.setFlowDomainList(AbFlowDomainTree.getAbFlowDomainTreeListFromJson(jSONObject.optJSONArray("flow_domain")));
            return abConfigV6;
        } catch (Throwable unused) {
            return null;
        }
    }
}
