package com.meevii.adsdk.core.config.model;

import com.learnings.abcenter.util.AbCenterUtil;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Strategy {
    private String domainId;
    private String placementId;
    private Plan plan;
    private String planId;
    private List<String> strategyIdList;

    public static Strategy getFromJson(JSONObject jSONObject) {
        try {
            Strategy strategy = new Strategy();
            strategy.setPlan(Plan.getFromJson(jSONObject.optJSONObject("plan")));
            strategy.setDomainId(AbCenterUtil.optString(jSONObject, "domainId"));
            strategy.setPlacementId(AbCenterUtil.optString(jSONObject, "placementId"));
            strategy.setPlanId(AbCenterUtil.optString(jSONObject, "planId"));
            strategy.setStrategyIdList(AbCenterUtil.jsonArrayToStringList(jSONObject.optJSONArray("strategyIdList")));
            return strategy;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getDomainId() {
        return this.domainId;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public Plan getPlan() {
        return this.plan;
    }

    public String getPlanId() {
        return this.planId;
    }

    public List<String> getStrategyIdList() {
        return this.strategyIdList;
    }

    public void setDomainId(String str) {
        this.domainId = str;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public void setPlanId(String str) {
        this.planId = str;
    }

    public void setStrategyIdList(List<String> list) {
        this.strategyIdList = list;
    }
}
