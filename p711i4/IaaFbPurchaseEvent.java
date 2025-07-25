package p711i4;

import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFInAppEventParameterName;
import com.facebook.appevents.AppEventsConstants;
import java.util.List;
import p633d4.GrtAdImpressionData;
import p681g4.BaseGrtModel;
import p681g4.IaaFbPurchaseModel;
import p737j4.C37279b;
import p737j4.C37287d;
import p753k4.LogUtil;

/* renamed from: i4.e */
/* loaded from: classes6.dex */
public class IaaFbPurchaseEvent extends BaseGrtEvent<IaaFbPurchaseModel> {

    /* renamed from: d */
    private final String f91894d;

    /* renamed from: e */
    private final String f91895e;

    /* renamed from: f */
    private final String f91896f;

    /* renamed from: g */
    private IaaFbPurchaseModel.C33193a f91897g;

    public IaaFbPurchaseEvent(IaaFbPurchaseModel iaaFbPurchaseModel) {
        super(iaaFbPurchaseModel);
        this.f91894d = "GRT_IaaFbPurchaseEvent";
        this.f91895e = "sp_key_vo_iaa_threshold";
        this.f91896f = "sp_key_vo_iaa_threshold_ltv";
    }

    /* renamed from: n */
    private IaaFbPurchaseModel.C33193a m23159n() {
        UserArea m23171c = m23171c();
        IaaFbPurchaseModel.C33193a c33193a = null;
        for (IaaFbPurchaseModel.C33193a c33193a2 : m23173a().m24405b()) {
            String m24399a = c33193a2.m24399a();
            if (m23171c.m23134h(m24399a)) {
                return c33193a2;
            }
            if (m23171c.m23135g(m24399a)) {
                c33193a = c33193a2;
            }
        }
        return c33193a;
    }

    /* renamed from: o */
    private void m23158o(IaaFbPurchaseModel iaaFbPurchaseModel, double d) {
        Bundle bundle = new Bundle();
        bundle.putDouble("value", d);
        bundle.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, "USD");
        BaseGrtModel.C33189a m24404c = iaaFbPurchaseModel.m24404c();
        List<String> m24433f = m24404c.m24433f("appsflyer");
        if (m24433f.isEmpty()) {
            m23168j(iaaFbPurchaseModel.m24403d(), bundle, Double.valueOf(d), iaaFbPurchaseModel.m24404c());
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        bundle2.putDouble(AFInAppEventParameterName.REVENUE, d);
        bundle2.putString(AFInAppEventParameterName.CURRENCY, "USD");
        m23166l(iaaFbPurchaseModel.m24403d(), bundle2, m24433f, m24404c);
        List<String> m24434e = m24404c.m24434e("appsflyer");
        if (m24434e.isEmpty()) {
            return;
        }
        m23167k(iaaFbPurchaseModel.m24403d(), bundle, Double.valueOf(d), m24434e, m24404c);
    }

    @Override // p711i4.BaseGrtEvent
    /* renamed from: d */
    public void mo23144d(GrtAdImpressionData grtAdImpressionData) {
        double d;
        super.mo23144d(grtAdImpressionData);
        if (this.f91897g == null) {
            return;
        }
        C37287d.C37290c m18565b = C37287d.m18566a().m18565b(C37279b.m18579k().m18578l());
        try {
            d = Double.parseDouble(m18565b.m18559c("sp_key_vo_iaa_threshold_ltv", "0"));
        } catch (Throwable th) {
            th.printStackTrace();
            d = 0.0d;
        }
        double m23172b = m23172b();
        double d2 = m23172b - d;
        IaaFbPurchaseModel m23173a = m23173a();
        if (d2 >= this.f91897g.m24398b()) {
            m18565b.m18557e("sp_key_vo_iaa_threshold_ltv", String.valueOf(m23172b));
            m23158o(m23173a, d2);
        }
    }

    @Override // p711i4.BaseGrtEvent
    /* renamed from: f */
    public void mo23149f() {
        super.mo23149f();
        IaaFbPurchaseModel.C33193a m23159n = m23159n();
        this.f91897g = m23159n;
        if (m23159n == null) {
            LogUtil.m18216b("GRT_IaaFbPurchaseEvent", "no CountryThreshold, not init CountryThreshold");
            return;
        }
        String str = this.f91897g.m24399a() + "=" + this.f91897g.m24398b();
        if (LogUtil.m18217a()) {
            LogUtil.m18216b("GRT_IaaFbPurchaseEvent", "CountryThreshold：" + str);
        }
        C37287d.C37290c m18565b = C37287d.m18566a().m18565b(C37279b.m18579k().m18578l());
        if (!TextUtils.equals(m18565b.m18559c("sp_key_vo_iaa_threshold", ""), str)) {
            LogUtil.m18216b("GRT_IaaFbPurchaseEvent", "CountryThreshold change, reInit");
            m18565b.m18557e("sp_key_vo_iaa_threshold", str);
            m18565b.m18557e("sp_key_vo_iaa_threshold_ltv", String.valueOf(m23172b()));
        }
    }
}
