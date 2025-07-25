package com.mbridge.msdk.reward.p501d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.BaseCampaignUnit;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p431c.FailureInfo;
import com.mbridge.msdk.foundation.p431c.MBFailureReason;
import com.mbridge.msdk.foundation.same.net.C21990d;
import com.mbridge.msdk.foundation.same.net.Listener;
import com.mbridge.msdk.foundation.same.net.p443a.CommonError;
import com.mbridge.msdk.foundation.same.net.p446d.C21991a;
import com.mbridge.msdk.foundation.same.net.p447e.CommonHttpConfig;
import com.mbridge.msdk.foundation.same.p441f.ThreadPoolUtils;
import com.mbridge.msdk.foundation.same.report.p452d.MetricsData;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.C22909h;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.reward.d.c */
/* loaded from: classes6.dex */
public abstract class RewardResponseHandler extends Listener<JSONObject> {

    /* renamed from: a */
    private static final String f59162a = "c";

    /* renamed from: b */
    private int f59163b;

    /* renamed from: c */
    private String f59164c;

    /* renamed from: d */
    private MetricsData f59165d;

    /* renamed from: a */
    public abstract void mo49994a(List<Frame> list);

    /* renamed from: a */
    public abstract void mo49993a(List<C22909h> list, CampaignUnit campaignUnit);

    /* renamed from: b */
    public abstract void mo49991b(int i, String str, MetricsData metricsData);

    @Override // com.mbridge.msdk.foundation.same.net.Listener, com.mbridge.msdk.foundation.same.net.IListener
    public void onError(CommonError commonError) {
        String str = f59162a;
        SameLogTool.m51824b(str, "errorCode = " + commonError.f56579a);
        MBFailureReason mBFailureReason = new MBFailureReason(commonError.f56579a, CommonHttpConfig.m52203a(commonError));
        mBFailureReason.m52827a("campaign_request_error", commonError);
        mBFailureReason.m52813f(commonError.f56580b);
        this.f59165d.m52099a(mBFailureReason);
        mo49991b(commonError.f56579a, CommonHttpConfig.m52203a(commonError), this.f59165d);
    }

    @Override // com.mbridge.msdk.foundation.same.net.Listener
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.Listener, com.mbridge.msdk.foundation.same.net.IListener
    public void onSuccess(C21990d<JSONObject> c21990d) {
        C21991a c21991a;
        CampaignUnit parseCampaignUnit;
        String str;
        super.onSuccess(c21990d);
        if (c21990d != null && (c21991a = c21990d.f56585b) != null) {
            int i = this.f59163b;
            if (i == 0) {
                final List<C22909h> list = c21991a.f56588b;
                final JSONObject jSONObject = c21990d.f56586c;
                final int optInt = jSONObject.optInt("status");
                if (1 == optInt) {
                    calcRequestTime(System.currentTimeMillis());
                    final String optString = jSONObject.optString("version");
                    ThreadPoolUtils.m52227b().execute(new Runnable() { // from class: com.mbridge.msdk.reward.d.c.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            final CampaignUnit parseCampaignUnit2;
                            if ("v5".equals(optString)) {
                                parseCampaignUnit2 = BaseCampaignUnit.parseV5CampaignUnit(jSONObject.optJSONObject("data"), RewardResponseHandler.this.f59164c);
                            } else {
                                parseCampaignUnit2 = BaseCampaignUnit.parseCampaignUnit(jSONObject.optJSONObject("data"), RewardResponseHandler.this.f59164c);
                            }
                            ThreadPoolUtils.m52226c().post(new Runnable() { // from class: com.mbridge.msdk.reward.d.c.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str2;
                                    CampaignUnit campaignUnit = parseCampaignUnit2;
                                    if (campaignUnit != null && campaignUnit.getAds() != null && parseCampaignUnit2.getAds().size() > 0) {
                                        parseCampaignUnit2.setMetricsData(RewardResponseHandler.this.f59165d);
                                        RunnableC227351 runnableC227351 = RunnableC227351.this;
                                        RewardResponseHandler.this.mo49993a(list, parseCampaignUnit2);
                                        RewardResponseHandler.this.saveRequestTime(parseCampaignUnit2.getAds().size());
                                        return;
                                    }
                                    CampaignUnit campaignUnit2 = parseCampaignUnit2;
                                    if (campaignUnit2 != null) {
                                        str2 = campaignUnit2.getMsg();
                                    } else {
                                        str2 = null;
                                    }
                                    if (TextUtils.isEmpty(str2)) {
                                        str2 = jSONObject.optString("msg");
                                    }
                                    RunnableC227351 runnableC2273512 = RunnableC227351.this;
                                    RewardResponseHandler rewardResponseHandler = RewardResponseHandler.this;
                                    rewardResponseHandler.mo49991b(optInt, str2, rewardResponseHandler.f59165d);
                                }
                            });
                        }
                    });
                    return;
                }
                m49992a(list, jSONObject, optInt, this.f59165d);
            } else if (i == 1) {
                List<C22909h> list2 = c21991a.f56588b;
                JSONObject jSONObject2 = c21990d.f56586c;
                int optInt2 = jSONObject2.optInt("status");
                if (1 == optInt2) {
                    calcRequestTime(System.currentTimeMillis());
                    if ("v5".equals(jSONObject2.optString("version"))) {
                        parseCampaignUnit = BaseCampaignUnit.parseV5CampaignUnit(jSONObject2.optJSONObject("data"), this.f59164c);
                    } else {
                        parseCampaignUnit = BaseCampaignUnit.parseCampaignUnit(jSONObject2.optJSONObject("data"), this.f59164c);
                    }
                    if (parseCampaignUnit != null && parseCampaignUnit.getListFrames() != null && parseCampaignUnit.getListFrames().size() > 0) {
                        List<Frame> listFrames = parseCampaignUnit.getListFrames();
                        mo49994a(listFrames);
                        saveRequestTime(listFrames.size());
                        return;
                    }
                    if (parseCampaignUnit != null) {
                        str = parseCampaignUnit.getMsg();
                    } else {
                        str = null;
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = jSONObject2.optString("msg");
                    }
                    mo49991b(optInt2, str, this.f59165d);
                    return;
                }
                m49992a(list2, jSONObject2, optInt2, this.f59165d);
            }
        }
    }

    /* renamed from: a */
    public final void m49995a(String str) {
        this.f59164c = str;
    }

    /* renamed from: a */
    public final void m49997a(MetricsData metricsData) {
        this.f59165d = metricsData;
    }

    /* renamed from: a */
    private void m49992a(List<C22909h> list, JSONObject jSONObject, int i, MetricsData metricsData) {
        MBFailureReason m52833b;
        String str = "";
        if (list != null && list.size() > 0) {
            for (C22909h c22909h : list) {
                if (c22909h != null) {
                    String m49512a = c22909h.m49512a();
                    if (!TextUtils.isEmpty(m49512a) && m49512a.equals("data_res_type")) {
                        str = c22909h.m49511b();
                    }
                }
            }
        }
        String str2 = "errorCode: 3507 errorMessage: data load failed, errorMsg is " + jSONObject.optString("msg");
        if (!TextUtils.isEmpty(str) && str.equals("1")) {
            MBFailureReason m52833b2 = FailureInfo.m52833b(880018, str2);
            if (metricsData != null) {
                metricsData.m52099a(m52833b2);
                metricsData.m52088b(true);
                if (TextUtils.isEmpty(str2)) {
                    str2 = m52833b2.m52823b();
                }
            }
            mo49991b(i, str2, metricsData);
            return;
        }
        if (i == -1) {
            m52833b = FailureInfo.m52833b(880017, str2);
        } else {
            m52833b = FailureInfo.m52833b(880003, str2);
        }
        if (metricsData != null) {
            metricsData.m52099a(m52833b);
            metricsData.m52088b(false);
            if (TextUtils.isEmpty(str2)) {
                str2 = m52833b.m52823b();
            }
        }
        mo49991b(i, str2, metricsData);
    }
}
