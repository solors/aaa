package com.mbridge.msdk.foundation.same.report.p449a;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.p047a.p048a.p059h.Metric;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.controller.authoritycontroller.SDKAuthorityController;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.LoadTime;
import com.mbridge.msdk.foundation.same.report.EventLibraryCommon;
import com.mbridge.msdk.foundation.same.report.p452d.C22011d;
import com.mbridge.msdk.foundation.tools.SameDiTool;
import com.mbridge.msdk.tracker.C22885e;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.report.a.a */
/* loaded from: classes6.dex */
public class BaseCampaignRequestTimeUtil {

    /* renamed from: a */
    protected Context f56699a;

    /* renamed from: b */
    protected LoadTime f56700b;

    public BaseCampaignRequestTimeUtil(LoadTime loadTime) {
        this.f56700b = loadTime;
        Context m52792c = MBSDKContext.m52746m().m52792c();
        this.f56699a = m52792c;
        if (this.f56700b != null && m52792c != null) {
            int m51876m = SameDiTool.m51876m(m52792c);
            this.f56700b.m52443d(m51876m);
            this.f56700b.m52445c(SameDiTool.m51901a(this.f56699a, m51876m));
        }
    }

    /* renamed from: a */
    public final void m52153a() {
        if (this.f56700b != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Metric.f2405b, this.f56700b.m52450b());
                jSONObject.put(CampaignEx.JSON_KEY_HB, this.f56700b.m52439h());
                jSONObject.put("fb", this.f56700b.m52442e());
                jSONObject.put("num", this.f56700b.m52447c());
                jSONObject.put(CampaignEx.JSON_KEY_AD_SOURCE_ID, this.f56700b.m52453a());
                jSONObject.put("timeout", this.f56700b.m52438i());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f56700b.m52444d());
                if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", this.f56700b.m52440g());
                    jSONObject.put("network_str", this.f56700b.m52441f());
                }
                C22885e c22885e = new C22885e("2000006");
                c22885e.m49598b(0);
                c22885e.m49605a(0);
                c22885e.m49601a(jSONObject);
                c22885e.m49603a(EventLibraryCommon.m52108c());
                C22011d.m52050a().m52030c().m49540a(c22885e);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final void m52150b(int i) {
        LoadTime loadTime = this.f56700b;
        if (loadTime != null) {
            loadTime.m52452a(i);
        }
    }

    /* renamed from: c */
    public final void m52148c(int i) {
        LoadTime loadTime = this.f56700b;
        if (loadTime != null) {
            loadTime.m52446c(i);
        }
    }

    /* renamed from: b */
    public final void m52149b(String str) {
        LoadTime loadTime = this.f56700b;
        if (loadTime != null) {
            loadTime.m52448b(str);
        }
    }

    /* renamed from: a */
    public final void m52152a(int i) {
        LoadTime loadTime = this.f56700b;
        if (loadTime != null) {
            loadTime.m52449b(i);
        }
    }

    /* renamed from: a */
    public final void m52151a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f56700b.m52451a(str);
    }
}
