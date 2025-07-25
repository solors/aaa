package com.mbridge.msdk.foundation.same.net;

import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.LoadTime;
import com.mbridge.msdk.foundation.same.net.p443a.CommonError;
import com.mbridge.msdk.foundation.same.net.p447e.RequestControlUtil;
import com.mbridge.msdk.foundation.same.report.p449a.CampaignRequestTimeUtil;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.p411c.SettingManager;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.net.c */
/* loaded from: classes6.dex */
public class Listener<T> implements IListener<T> {
    private long startTime;
    public int adType = 0;
    public String placementId = "";
    public String unitId = "";
    private CampaignRequestTimeUtil mRequestTime = null;

    public void calcRequestTime(long j) {
        CampaignRequestTimeUtil campaignRequestTimeUtil = new CampaignRequestTimeUtil(new LoadTime());
        this.mRequestTime = campaignRequestTimeUtil;
        campaignRequestTimeUtil.m52149b(this.unitId);
        this.mRequestTime.m52150b(1);
        CampaignRequestTimeUtil campaignRequestTimeUtil2 = this.mRequestTime;
        campaignRequestTimeUtil2.m52151a((j - this.startTime) + "");
    }

    public void onPreExecute() {
        this.startTime = System.currentTimeMillis();
    }

    @Override // com.mbridge.msdk.foundation.same.net.IListener
    public void onSuccess(C21990d<T> c21990d) {
        try {
            String str = MBSDKContext.m52746m().m52779k() + "_" + this.placementId + "_" + this.unitId + "_" + this.adType;
            SettingManager.m53286a();
            SameLogTool.m51824b("Listener", c21990d.f56586c + " " + str);
            T t = c21990d.f56586c;
            if (t instanceof JSONObject) {
                RequestControlUtil.m52198a().m52195a(str, ((JSONObject) t).optInt("status"), ((JSONObject) c21990d.f56586c).toString(), System.currentTimeMillis());
            }
            if (c21990d.f56586c instanceof String) {
                RequestControlUtil.m52198a().m52195a(str, new JSONObject((String) c21990d.f56586c).optInt("status"), (String) c21990d.f56586c, System.currentTimeMillis());
            }
        } catch (Exception e) {
            SameLogTool.m51824b("Listener", e.getMessage());
        }
    }

    public void saveHbState(int i) {
        CampaignRequestTimeUtil campaignRequestTimeUtil = this.mRequestTime;
        if (campaignRequestTimeUtil != null) {
            campaignRequestTimeUtil.m52148c(i);
        }
    }

    public void saveRequestTime(int i) {
        CampaignRequestTimeUtil campaignRequestTimeUtil = this.mRequestTime;
        if (campaignRequestTimeUtil != null) {
            campaignRequestTimeUtil.m52152a(i);
            this.mRequestTime.m52153a();
        }
    }

    public void setAdType(int i) {
        this.adType = i;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public void onCancel() {
    }

    public void onFinish() {
    }

    public void onNetworking() {
    }

    public void onRetry() {
    }

    @Override // com.mbridge.msdk.foundation.same.net.IListener
    public void onError(CommonError commonError) {
    }

    public void onProgressChange(long j, long j2) {
    }
}
