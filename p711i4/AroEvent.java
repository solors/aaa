package p711i4;

import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFInAppEventParameterName;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p633d4.GrtAdImpressionData;
import p681g4.AroModel;
import p681g4.BaseGrtModel;
import p737j4.C37279b;
import p737j4.C37287d;
import p753k4.LogUtil;

/* renamed from: i4.b */
/* loaded from: classes6.dex */
public class AroEvent extends BaseGrtEvent<AroModel> {

    /* renamed from: d */
    private final String f91881d;

    /* renamed from: e */
    private final String f91882e;

    /* renamed from: f */
    private final String f91883f;

    /* renamed from: g */
    private AroModel.C33188a f91884g;

    public AroEvent(AroModel aroModel) {
        super(aroModel);
        this.f91881d = "GRT_AroEvent";
        this.f91882e = "sp_key_aro_threshold";
        this.f91883f = "sp_key_aro_threshold_ltv";
    }

    /* renamed from: n */
    private AroModel.C33188a m23175n() {
        UserArea m23171c = m23171c();
        AroModel.C33188a c33188a = null;
        for (AroModel.C33188a c33188a2 : m23173a().m24453b()) {
            String m24444b = c33188a2.m24444b();
            if (m23171c.m23134h(m24444b)) {
                return c33188a2;
            }
            if (m23171c.m23135g(m24444b)) {
                c33188a = c33188a2;
            }
        }
        return c33188a;
    }

    /* renamed from: o */
    private void m23174o(GrtAdImpressionData grtAdImpressionData, double d) {
        Bundle bundle = new Bundle();
        bundle.putDouble("value", d);
        bundle.putString("currency", "USD");
        bundle.putString(FirebaseAnalytics.Param.AD_PLATFORM, grtAdImpressionData.m25744b());
        bundle.putString(FirebaseAnalytics.Param.AD_SOURCE, grtAdImpressionData.m25743c());
        bundle.putString("ad_format", grtAdImpressionData.m25745a());
        bundle.putString(FirebaseAnalytics.Param.AD_UNIT_NAME, grtAdImpressionData.m25742d());
        AroModel m23173a = m23173a();
        BaseGrtModel.C33189a m24452c = m23173a().m24452c();
        List<String> m24433f = m24452c.m24433f("appsflyer");
        if (m24433f.isEmpty()) {
            m23169i(m23173a().m24451d(), bundle, m24452c);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        bundle2.putDouble(AFInAppEventParameterName.REVENUE, d);
        bundle2.putString(AFInAppEventParameterName.CURRENCY, "USD");
        m23166l(m23173a.m24451d(), bundle2, m24433f, m24452c);
        List<String> m24434e = m24452c.m24434e("appsflyer");
        if (m24434e.isEmpty()) {
            return;
        }
        m23166l(m23173a.m24451d(), bundle, m24434e, m24452c);
    }

    @Override // p711i4.BaseGrtEvent
    /* renamed from: d */
    public void mo23144d(GrtAdImpressionData grtAdImpressionData) {
        double d;
        super.mo23144d(grtAdImpressionData);
        if (m23173a().m24450e(grtAdImpressionData.m25745a())) {
            LogUtil.m18216b("GRT_AroEvent", "isInValidAdType：" + grtAdImpressionData.m25745a() + " ,just return");
        } else if (this.f91884g == null) {
            LogUtil.m18216b("GRT_AroEvent", "no CountryThreshold, just return");
        } else {
            double m23172b = m23172b();
            LogUtil.m18216b("GRT_AroEvent", "CountryThreshold min: " + this.f91884g.m24445a() + " ,threshold: " + this.f91884g.m24443c() + " ,current ltv: " + m23172b);
            if (m23172b < this.f91884g.m24445a()) {
                LogUtil.m18216b("GRT_AroEvent", "than current ltv is smaller CountryThreshold min , just return");
            } else if (this.f91884g.m24442d()) {
                m23174o(grtAdImpressionData, grtAdImpressionData.m25740f());
            } else {
                C37287d.C37290c m18565b = C37287d.m18566a().m18565b(C37279b.m18579k().m18578l());
                try {
                    d = Double.parseDouble(m18565b.m18559c("sp_key_aro_threshold_ltv", "0"));
                } catch (Throwable th) {
                    th.printStackTrace();
                    d = 0.0d;
                }
                LogUtil.m18216b("GRT_AroEvent", "CountryThreshold lastReportLTV: " + d);
                double d2 = m23172b - d;
                if (d2 >= this.f91884g.m24443c()) {
                    m18565b.m18557e("sp_key_aro_threshold_ltv", String.valueOf(m23172b));
                    m23174o(grtAdImpressionData, d2);
                }
            }
        }
    }

    @Override // p711i4.BaseGrtEvent
    /* renamed from: f */
    public void mo23149f() {
        super.mo23149f();
        AroModel.C33188a m23175n = m23175n();
        this.f91884g = m23175n;
        if (m23175n == null) {
            LogUtil.m18216b("GRT_AroEvent", "no CountryThreshold, not init CountryThreshold");
        } else if (m23175n.m24442d()) {
            LogUtil.m18216b("GRT_AroEvent", "CountryThreshold Threshold not limited, not init CountryThreshold");
        } else {
            String str = this.f91884g.m24444b() + "=" + this.f91884g.m24443c();
            if (LogUtil.m18217a()) {
                LogUtil.m18216b("GRT_AroEvent", "CountryThreshold：" + str);
            }
            C37287d.C37290c m18565b = C37287d.m18566a().m18565b(C37279b.m18579k().m18578l());
            if (!TextUtils.equals(m18565b.m18559c("sp_key_aro_threshold", ""), str)) {
                LogUtil.m18216b("GRT_AroEvent", "CountryThreshold change, reInit");
                m18565b.m18557e("sp_key_aro_threshold", str);
                m18565b.m18557e("sp_key_aro_threshold_ltv", String.valueOf(m23172b()));
            }
        }
    }
}
