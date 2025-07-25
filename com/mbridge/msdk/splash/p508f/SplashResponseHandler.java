package com.mbridge.msdk.splash.p508f;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.BaseCampaignUnit;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C21990d;
import com.mbridge.msdk.foundation.same.net.Listener;
import com.mbridge.msdk.foundation.same.net.p443a.CommonError;
import com.mbridge.msdk.foundation.same.net.p446d.C21991a;
import com.mbridge.msdk.foundation.same.net.p447e.CommonHttpConfig;
import com.mbridge.msdk.foundation.same.p441f.ThreadPoolUtils;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.C22909h;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.splash.f.d */
/* loaded from: classes6.dex */
public abstract class SplashResponseHandler extends Listener<JSONObject> {

    /* renamed from: a */
    private static final String f59452a = "d";

    /* renamed from: b */
    private int f59453b;

    /* renamed from: c */
    private String f59454c;

    /* renamed from: a */
    public abstract void mo49731a(List<Frame> list);

    /* renamed from: a */
    public abstract void mo49730a(List<C22909h> list, CampaignUnit campaignUnit);

    /* renamed from: b */
    public abstract void mo49729b(int i, String str);

    @Override // com.mbridge.msdk.foundation.same.net.Listener, com.mbridge.msdk.foundation.same.net.IListener
    public void onError(CommonError commonError) {
        String str = f59452a;
        SameLogTool.m51824b(str, "errorCode = " + commonError.f56579a);
        mo49729b(commonError.f56579a, CommonHttpConfig.m52203a(commonError));
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
            int i = this.f59453b;
            if (i == 0) {
                final List<C22909h> list = c21991a.f56588b;
                final JSONObject jSONObject = c21990d.f56586c;
                final int optInt = jSONObject.optInt("status");
                if (1 == optInt) {
                    calcRequestTime(System.currentTimeMillis());
                    final String optString = jSONObject.optString("version");
                    ThreadPoolUtils.m52227b().execute(new Runnable() { // from class: com.mbridge.msdk.splash.f.d.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            final CampaignUnit parseCampaignUnit2;
                            if ("v5".equals(optString)) {
                                parseCampaignUnit2 = BaseCampaignUnit.parseV5CampaignUnit(jSONObject.optJSONObject("data"), SplashResponseHandler.this.f59454c);
                            } else {
                                parseCampaignUnit2 = BaseCampaignUnit.parseCampaignUnit(jSONObject.optJSONObject("data"), SplashResponseHandler.this.f59454c);
                            }
                            ThreadPoolUtils.m52226c().post(new Runnable() { // from class: com.mbridge.msdk.splash.f.d.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str2;
                                    CampaignUnit campaignUnit = parseCampaignUnit2;
                                    if (campaignUnit != null && campaignUnit.getAds() != null && parseCampaignUnit2.getAds().size() > 0) {
                                        RunnableC227871 runnableC227871 = RunnableC227871.this;
                                        SplashResponseHandler.this.mo49730a(list, parseCampaignUnit2);
                                        SplashResponseHandler.this.saveRequestTime(parseCampaignUnit2.getAds().size());
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
                                    RunnableC227871 runnableC2278712 = RunnableC227871.this;
                                    SplashResponseHandler.this.mo49729b(optInt, str2);
                                }
                            });
                        }
                    });
                    return;
                }
                mo49729b(optInt, jSONObject.optString("msg"));
            } else if (i == 1) {
                List<C22909h> list2 = c21991a.f56588b;
                JSONObject jSONObject2 = c21990d.f56586c;
                int optInt2 = jSONObject2.optInt("status");
                if (1 == optInt2) {
                    calcRequestTime(System.currentTimeMillis());
                    if ("v5".equals(jSONObject2.optString("version"))) {
                        parseCampaignUnit = BaseCampaignUnit.parseV5CampaignUnit(jSONObject2.optJSONObject("data"), this.f59454c);
                    } else {
                        parseCampaignUnit = BaseCampaignUnit.parseCampaignUnit(jSONObject2.optJSONObject("data"), this.f59454c);
                    }
                    if (parseCampaignUnit != null && parseCampaignUnit.getListFrames() != null && parseCampaignUnit.getListFrames().size() > 0) {
                        List<Frame> listFrames = parseCampaignUnit.getListFrames();
                        mo49731a(listFrames);
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
                    mo49729b(optInt2, str);
                    return;
                }
                mo49729b(optInt2, jSONObject2.optString("msg"));
            }
        }
    }

    /* renamed from: a */
    public final void m49732a(String str) {
        this.f59454c = str;
    }
}
