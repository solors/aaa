package com.meevii.adsdk.core.config.model;

import com.ironsource.C20161jo;
import com.learnings.abcenter.util.AbCenterUtil;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Plan {
    private int autoLoadSeconds;
    private int bannerRefreshSeconds;
    private List<OptionAdUnit> optionAdUnits;
    private String placementId;
    private String placementName;
    private String placementType;
    private int sampleSize;

    public static Plan getFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            Plan plan = new Plan();
            plan.setAutoLoadSeconds(jSONObject.optInt("autoLoadSeconds"));
            plan.setBannerRefreshSeconds(jSONObject.optInt("bannerRefreshSeconds"));
            plan.setPlacementId(AbCenterUtil.optString(jSONObject, "placementId"));
            plan.setPlacementType(AbCenterUtil.optString(jSONObject, MRAIDCommunicatorUtil.KEY_PLACEMENTTYPE));
            plan.setPlacementName(AbCenterUtil.optString(jSONObject, C20161jo.f50744d));
            plan.setSampleSize(jSONObject.optInt("sampleSize"));
            plan.setOptionAdUnits(getOptionAdUnitListFromJson(jSONObject.optJSONArray("optionAdUnits")));
            return plan;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static List<OptionAdUnit> getOptionAdUnitListFromJson(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(OptionAdUnit.getFromJson(jSONArray.optJSONObject(i)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getAutoLoadSeconds() {
        return this.autoLoadSeconds;
    }

    public int getBannerRefreshSeconds() {
        return this.bannerRefreshSeconds;
    }

    public List<OptionAdUnit> getOptionAdUnits() {
        return this.optionAdUnits;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public String getPlacementName() {
        return this.placementName;
    }

    public String getPlacementType() {
        return this.placementType;
    }

    public int getSampleSize() {
        return this.sampleSize;
    }

    public void setAutoLoadSeconds(int i) {
        this.autoLoadSeconds = i;
    }

    public void setBannerRefreshSeconds(int i) {
        this.bannerRefreshSeconds = i;
    }

    public void setOptionAdUnits(List<OptionAdUnit> list) {
        this.optionAdUnits = list;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public void setPlacementName(String str) {
        this.placementName = str;
    }

    public void setPlacementType(String str) {
        this.placementType = str;
    }

    public void setSampleSize(int i) {
        this.sampleSize = i;
    }
}
