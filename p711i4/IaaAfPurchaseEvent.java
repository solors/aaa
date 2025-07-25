package p711i4;

import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFInAppEventParameterName;
import p633d4.GrtAdImpressionData;
import p681g4.IaaAfPurchaseModel;
import p737j4.C37279b;
import p737j4.C37287d;
import p753k4.LogUtil;

/* renamed from: i4.d */
/* loaded from: classes6.dex */
public class IaaAfPurchaseEvent extends BaseGrtEvent<IaaAfPurchaseModel> {

    /* renamed from: d */
    private final String f91890d;

    /* renamed from: e */
    private final String f91891e;

    /* renamed from: f */
    private final String f91892f;

    /* renamed from: g */
    private IaaAfPurchaseModel.C33192a f91893g;

    public IaaAfPurchaseEvent(IaaAfPurchaseModel iaaAfPurchaseModel) {
        super(iaaAfPurchaseModel);
        this.f91890d = "GRT_IaaAfPurchaseEvent";
        this.f91891e = "sp_key_af_iaa_threshold";
        this.f91892f = "sp_key_af_iaa_threshold_ltv";
    }

    /* renamed from: n */
    private IaaAfPurchaseModel.C33192a m23160n() {
        UserArea m23171c = m23171c();
        IaaAfPurchaseModel.C33192a c33192a = null;
        for (IaaAfPurchaseModel.C33192a c33192a2 : m23173a().m24416b()) {
            String m24410a = c33192a2.m24410a();
            if (m23171c.m23134h(m24410a)) {
                return c33192a2;
            }
            if (m23171c.m23135g(m24410a)) {
                c33192a = c33192a2;
            }
        }
        return c33192a;
    }

    @Override // p711i4.BaseGrtEvent
    /* renamed from: d */
    public void mo23144d(GrtAdImpressionData grtAdImpressionData) {
        double d;
        super.mo23144d(grtAdImpressionData);
        if (this.f91893g == null) {
            return;
        }
        C37287d.C37290c m18565b = C37287d.m18566a().m18565b(C37279b.m18579k().m18578l());
        try {
            d = Double.parseDouble(m18565b.m18559c("sp_key_af_iaa_threshold_ltv", "0"));
        } catch (Throwable th) {
            th.printStackTrace();
            d = 0.0d;
        }
        double m23172b = m23172b();
        double d2 = m23172b - d;
        IaaAfPurchaseModel m23173a = m23173a();
        if (d2 >= this.f91893g.m24409b()) {
            m18565b.m18557e("sp_key_af_iaa_threshold_ltv", String.valueOf(m23172b));
            Bundle bundle = new Bundle();
            bundle.putDouble(AFInAppEventParameterName.REVENUE, d2);
            bundle.putString(AFInAppEventParameterName.CURRENCY, "USD");
            m23168j(m23173a.m24414d(), bundle, Double.valueOf(d2), m23173a.m24415c());
        }
    }

    @Override // p711i4.BaseGrtEvent
    /* renamed from: f */
    public void mo23149f() {
        super.mo23149f();
        IaaAfPurchaseModel.C33192a m23160n = m23160n();
        this.f91893g = m23160n;
        if (m23160n == null) {
            LogUtil.m18216b("GRT_IaaAfPurchaseEvent", "no CountryThreshold");
            return;
        }
        String str = this.f91893g.m24410a() + "=" + this.f91893g.m24409b();
        if (LogUtil.m18217a()) {
            LogUtil.m18216b("GRT_IaaAfPurchaseEvent", "CountryThreshold：" + str);
        }
        C37287d.C37290c m18565b = C37287d.m18566a().m18565b(C37279b.m18579k().m18578l());
        if (!TextUtils.equals(m18565b.m18559c("sp_key_af_iaa_threshold", ""), str)) {
            LogUtil.m18216b("GRT_IaaAfPurchaseEvent", "CountryThreshold change, reInit");
            m18565b.m18557e("sp_key_af_iaa_threshold", str);
            m18565b.m18557e("sp_key_af_iaa_threshold_ltv", String.valueOf(m23172b()));
        }
    }
}
