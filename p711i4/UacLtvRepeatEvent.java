package p711i4;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.appsflyer.AFInAppEventParameterName;
import java.util.List;
import p633d4.GrtAdImpressionData;
import p681g4.BaseGrtModel;
import p681g4.UacLtvRepeatModel;
import p737j4.C37279b;
import p737j4.C37287d;

/* renamed from: i4.n */
/* loaded from: classes6.dex */
public class UacLtvRepeatEvent extends BaseGrtEvent<UacLtvRepeatModel> {

    /* renamed from: d */
    private final String f91910d;

    public UacLtvRepeatEvent(UacLtvRepeatModel uacLtvRepeatModel) {
        super(uacLtvRepeatModel);
        this.f91910d = "adsdk_ltv_repeat";
    }

    /* renamed from: n */
    private double m23143n(C37287d.C37290c c37290c, double d) {
        try {
            return Double.parseDouble(c37290c.m18559c(String.valueOf(d), "0"));
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0d;
        }
    }

    /* renamed from: o */
    private void m23142o(UacLtvRepeatModel.C33199a c33199a, Bundle bundle, double d) {
        BaseGrtModel.C33189a m24323a = c33199a.m24323a();
        List<String> m24433f = m24323a.m24433f("appsflyer");
        if (m24433f.isEmpty()) {
            m23169i(c33199a.m24322b(), bundle, c33199a.m24323a());
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        bundle2.putDouble(AFInAppEventParameterName.REVENUE, d);
        bundle2.putString(AFInAppEventParameterName.CURRENCY, "USD");
        m23166l(c33199a.m24322b(), bundle2, m24433f, c33199a.m24323a());
        List<String> m24434e = m24323a.m24434e("appsflyer");
        if (m24434e.isEmpty()) {
            return;
        }
        m23166l(c33199a.m24322b(), bundle, m24434e, m24323a);
    }

    @Override // p711i4.BaseGrtEvent
    /* renamed from: d */
    public void mo23144d(GrtAdImpressionData grtAdImpressionData) {
        super.mo23144d(grtAdImpressionData);
        double m23172b = m23172b();
        C37287d.C37290c m18564c = C37287d.m18566a().m18564c(C37279b.m18579k().m18578l(), "adsdk_ltv_repeat");
        SharedPreferences.Editor m18561a = m18564c.m18561a();
        boolean z = false;
        for (UacLtvRepeatModel.C33199a c33199a : m23173a().m24325b()) {
            double m23143n = m23172b - m23143n(m18564c, c33199a.m24321c());
            if (m23143n >= c33199a.m24321c()) {
                m18561a.putString(String.valueOf(c33199a.m24321c()), String.valueOf(m23172b));
                Bundle bundle = new Bundle();
                bundle.putDouble("value", m23143n);
                bundle.putString("currency", "USD");
                m23142o(c33199a, bundle, m23143n);
                z = true;
            }
        }
        if (z) {
            m18561a.apply();
        }
    }
}
