package p711i4;

import android.os.Bundle;
import com.appsflyer.AFInAppEventParameterName;
import java.util.List;
import p633d4.GrtPurchaseData;
import p681g4.BaseGrtModel;
import p681g4.IapRevenueModel;

/* renamed from: i4.j */
/* loaded from: classes6.dex */
public class IapRevenueEvent extends BaseGrtEvent<IapRevenueModel> {
    public IapRevenueEvent(IapRevenueModel iapRevenueModel) {
        super(iapRevenueModel);
    }

    @Override // p711i4.BaseGrtEvent
    /* renamed from: g */
    public void mo23152g(GrtPurchaseData grtPurchaseData) {
        super.mo23152g(grtPurchaseData);
        IapRevenueModel m23173a = m23173a();
        String m24360c = m23173a.m24360c();
        double m25730c = grtPurchaseData.m25730c() * 0.7d;
        String m25732a = grtPurchaseData.m25732a();
        Bundle bundle = new Bundle();
        bundle.putDouble("value", m25730c);
        bundle.putString("currency", m25732a);
        BaseGrtModel.C33189a m24361b = m23173a.m24361b();
        List<String> m24433f = m24361b.m24433f("appsflyer");
        if (m24433f.isEmpty()) {
            m23169i(m24360c, bundle, m24361b);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        bundle2.putDouble(AFInAppEventParameterName.REVENUE, m25730c);
        bundle2.putString(AFInAppEventParameterName.CURRENCY, m25732a);
        m23166l(m24360c, bundle2, m24433f, m24361b);
        List<String> m24434e = m24361b.m24434e("appsflyer");
        if (m24434e.isEmpty()) {
            return;
        }
        m23166l(m24360c, bundle, m24434e, m24361b);
    }
}
