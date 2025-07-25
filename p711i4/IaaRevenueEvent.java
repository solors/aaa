package p711i4;

import android.os.Bundle;
import com.appsflyer.AFInAppEventParameterName;
import java.util.List;
import p633d4.GrtAdImpressionData;
import p681g4.BaseGrtModel;
import p681g4.IaaRevenueModel;
import p753k4.LogUtil;

/* renamed from: i4.g */
/* loaded from: classes6.dex */
public class IaaRevenueEvent extends BaseGrtEvent<IaaRevenueModel> {

    /* renamed from: d */
    private final String f91902d;

    /* renamed from: e */
    private double f91903e;

    public IaaRevenueEvent(IaaRevenueModel iaaRevenueModel) {
        super(iaaRevenueModel);
        this.f91902d = "GRT_IaaRevenueEvent";
    }

    /* renamed from: n */
    private void m23154n(double d) {
        IaaRevenueModel m23173a = m23173a();
        String m24379c = m23173a.m24379c();
        Bundle bundle = new Bundle();
        bundle.putDouble("value", d);
        bundle.putString("currency", "USD");
        BaseGrtModel.C33189a m24380b = m23173a.m24380b();
        List<String> m24433f = m24380b.m24433f("appsflyer");
        if (m24433f.isEmpty()) {
            m23169i(m24379c, bundle, m24380b);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        bundle2.putDouble(AFInAppEventParameterName.REVENUE, d);
        bundle2.putString(AFInAppEventParameterName.CURRENCY, "USD");
        m23166l(m24379c, bundle2, m24433f, m24380b);
        List<String> m24434e = m24380b.m24434e("appsflyer");
        if (m24434e.isEmpty()) {
            return;
        }
        m23166l(m24379c, bundle, m24434e, m24380b);
    }

    @Override // p711i4.BaseGrtEvent
    /* renamed from: d */
    public void mo23144d(GrtAdImpressionData grtAdImpressionData) {
        super.mo23144d(grtAdImpressionData);
        double m25740f = grtAdImpressionData.m25740f();
        if (grtAdImpressionData.m25739g()) {
            this.f91903e += m25740f;
            if (LogUtil.m18217a()) {
                LogUtil.m18216b("GRT_IaaRevenueEvent", "show banner, total adValue：" + this.f91903e);
                return;
            }
            return;
        }
        m23154n(m25740f + this.f91903e);
        this.f91903e = 0.0d;
    }

    @Override // p711i4.BaseGrtEvent
    /* renamed from: e */
    public void mo23155e() {
        super.mo23155e();
        if (LogUtil.m18217a()) {
            LogUtil.m18216b("GRT_IaaRevenueEvent", "onEngagement, banner total adValue：" + this.f91903e);
        }
        double d = this.f91903e;
        if (d > 0.0d) {
            m23154n(d);
            this.f91903e = 0.0d;
        }
    }
}
