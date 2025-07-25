package p711i4;

import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFInAppEventParameterName;
import com.facebook.appevents.AppEventsConstants;
import java.util.List;
import p633d4.GrtAdImpressionData;
import p681g4.BaseGrtModel;
import p681g4.IaaFbRoasModel;
import p737j4.C37279b;
import p737j4.C37287d;
import p753k4.LogUtil;

/* renamed from: i4.f */
/* loaded from: classes6.dex */
public class IaaFbRoasEvent extends BaseGrtEvent<IaaFbRoasModel> {

    /* renamed from: d */
    private final String f91898d;

    /* renamed from: e */
    private final String f91899e;

    /* renamed from: f */
    private final String f91900f;

    /* renamed from: g */
    private IaaFbRoasModel.C33194a f91901g;

    public IaaFbRoasEvent(IaaFbRoasModel iaaFbRoasModel) {
        super(iaaFbRoasModel);
        this.f91898d = "GRT_IaaFbRoasEvent";
        this.f91899e = "sp_key_iaa_fb_roas_threshold";
        this.f91900f = "sp_key_iaa_fb_roas_threshold_ltv";
    }

    /* renamed from: n */
    private IaaFbRoasModel.C33194a m23157n() {
        UserArea m23171c = m23171c();
        IaaFbRoasModel.C33194a c33194a = null;
        for (IaaFbRoasModel.C33194a c33194a2 : m23173a().m24394b()) {
            String m24387b = c33194a2.m24387b();
            if (m23171c.m23134h(m24387b)) {
                return c33194a2;
            }
            if (m23171c.m23135g(m24387b)) {
                c33194a = c33194a2;
            }
        }
        return c33194a;
    }

    /* renamed from: o */
    private void m23156o(IaaFbRoasModel iaaFbRoasModel, Bundle bundle, double d) {
        BaseGrtModel.C33189a m24393c = iaaFbRoasModel.m24393c();
        List<String> m24433f = m24393c.m24433f("appsflyer");
        if (m24433f.isEmpty()) {
            m23168j(iaaFbRoasModel.m24392d(), bundle, Double.valueOf(d), iaaFbRoasModel.m24393c());
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        bundle2.putDouble(AFInAppEventParameterName.REVENUE, d);
        bundle2.putString(AFInAppEventParameterName.CURRENCY, "USD");
        m23166l(iaaFbRoasModel.m24392d(), bundle2, m24433f, iaaFbRoasModel.m24393c());
        List<String> m24434e = m24393c.m24434e("appsflyer");
        if (m24434e.isEmpty()) {
            return;
        }
        m23167k(iaaFbRoasModel.m24392d(), bundle, Double.valueOf(d), m24434e, iaaFbRoasModel.m24393c());
    }

    @Override // p711i4.BaseGrtEvent
    /* renamed from: d */
    public void mo23144d(GrtAdImpressionData grtAdImpressionData) {
        double d;
        super.mo23144d(grtAdImpressionData);
        if (this.f91901g == null) {
            LogUtil.m18216b("GRT_IaaFbRoasEvent", "no CountryThreshold, just return");
            return;
        }
        double m23172b = m23172b();
        LogUtil.m18216b("GRT_IaaFbRoasEvent", "CountryThreshold min: " + this.f91901g.m24388a() + " ,threshold: " + this.f91901g.m24386c() + " ,current ltv: " + m23172b);
        if (m23172b < this.f91901g.m24388a()) {
            LogUtil.m18216b("GRT_IaaFbRoasEvent", "than current ltv is smaller CountryThreshold min , just return");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, "USD");
        IaaFbRoasModel m23173a = m23173a();
        if (this.f91901g.m24385d()) {
            m23156o(m23173a, bundle, grtAdImpressionData.m25740f());
            return;
        }
        C37287d.C37290c m18565b = C37287d.m18566a().m18565b(C37279b.m18579k().m18578l());
        try {
            d = Double.parseDouble(m18565b.m18559c("sp_key_iaa_fb_roas_threshold_ltv", "0"));
        } catch (Throwable th) {
            th.printStackTrace();
            d = 0.0d;
        }
        LogUtil.m18216b("GRT_IaaFbRoasEvent", "CountryThreshold lastReportLTV: " + d);
        double d2 = m23172b - d;
        if (d2 >= this.f91901g.m24386c()) {
            m18565b.m18557e("sp_key_iaa_fb_roas_threshold_ltv", String.valueOf(m23172b));
            m23156o(m23173a, bundle, d2);
        }
    }

    @Override // p711i4.BaseGrtEvent
    /* renamed from: f */
    public void mo23149f() {
        super.mo23149f();
        IaaFbRoasModel.C33194a m23157n = m23157n();
        this.f91901g = m23157n;
        if (m23157n == null) {
            LogUtil.m18216b("GRT_IaaFbRoasEvent", "no CountryThreshold, not init CountryThreshold");
        } else if (m23157n.m24385d()) {
            LogUtil.m18216b("GRT_IaaFbRoasEvent", "CountryThreshold Threshold not limited, not init CountryThreshold");
        } else {
            String str = this.f91901g.m24387b() + "=" + this.f91901g.m24386c();
            if (LogUtil.m18217a()) {
                LogUtil.m18216b("GRT_IaaFbRoasEvent", "CountryThreshold：" + str);
            }
            C37287d.C37290c m18565b = C37287d.m18566a().m18565b(C37279b.m18579k().m18578l());
            if (!TextUtils.equals(m18565b.m18559c("sp_key_iaa_fb_roas_threshold", ""), str)) {
                LogUtil.m18216b("GRT_IaaFbRoasEvent", "CountryThreshold change, reInit");
                m18565b.m18557e("sp_key_iaa_fb_roas_threshold", str);
                m18565b.m18557e("sp_key_iaa_fb_roas_threshold_ltv", String.valueOf(m23172b()));
            }
        }
    }
}
