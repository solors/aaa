package p711i4;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.appsflyer.AFInAppEventParameterName;
import java.util.List;
import p633d4.GrtAdImpressionData;
import p681g4.BaseGrtModel;
import p681g4.UacLtvDaysModel;
import p737j4.C37279b;
import p737j4.C37287d;

/* renamed from: i4.m */
/* loaded from: classes6.dex */
public class UacLtvDaysEvent extends BaseGrtEvent<UacLtvDaysModel> {

    /* renamed from: d */
    private final String f91908d;

    /* renamed from: e */
    private final String f91909e;

    public UacLtvDaysEvent(UacLtvDaysModel uacLtvDaysModel) {
        super(uacLtvDaysModel);
        this.f91908d = "adsdk_ltv_daily_";
        this.f91909e = "sp_key_uac_ltv_days_threshold_";
    }

    /* renamed from: n */
    private void m23148n() {
        C37287d.C37290c c37290c;
        int m23140b = m23171c().m23140b();
        String m23141a = m23171c().m23141a();
        double m23172b = m23172b();
        SharedPreferences.Editor editor = null;
        boolean z = false;
        C37287d.C37290c c37290c2 = null;
        for (UacLtvDaysModel.C33197a c33197a : m23173a().m24340b()) {
            List<UacLtvDaysModel.C33197a.C33198a> list = c33197a.m24338a().get(m23141a);
            if (list == null) {
                list = c33197a.m24338a().get("global");
            }
            if (list != null) {
                for (UacLtvDaysModel.C33197a.C33198a c33198a : list) {
                    if (c33198a.m24330a() == m23140b && m23172b >= c33198a.m24329b()) {
                        if (c37290c2 == null) {
                            c37290c2 = C37287d.m18566a().m18564c(C37279b.m18579k().m18578l(), "adsdk_ltv_daily_" + m23140b);
                        }
                        C37287d.C37290c c37290c3 = c37290c2;
                        String m24335d = c33197a.m24335d();
                        if ("0".equals(c37290c3.m18559c(m24335d, "0"))) {
                            if (editor == null) {
                                editor = c37290c3.m18561a();
                            }
                            SharedPreferences.Editor editor2 = editor;
                            editor2.putString(m24335d, "1");
                            m23146p(m23172b, m24335d);
                            c37290c = c37290c3;
                            m23145q(c33197a, m23172b, m23172b - m23147o(m24335d), m23140b, c33198a.m24329b());
                            z = true;
                            editor = editor2;
                        } else {
                            c37290c = c37290c3;
                        }
                        c37290c2 = c37290c;
                    }
                }
            }
        }
        if (z) {
            editor.apply();
        }
    }

    /* renamed from: o */
    private double m23147o(String str) {
        try {
            C37287d.C37290c m18565b = C37287d.m18566a().m18565b(C37279b.m18579k().m18578l());
            return Double.parseDouble(m18565b.m18559c("sp_key_uac_ltv_days_threshold_" + str, "0"));
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0d;
        }
    }

    /* renamed from: p */
    private void m23146p(double d, String str) {
        C37287d.C37290c m18565b = C37287d.m18566a().m18565b(C37279b.m18579k().m18578l());
        m18565b.m18557e("sp_key_uac_ltv_days_threshold_" + str, String.valueOf(d));
    }

    /* renamed from: q */
    private void m23145q(UacLtvDaysModel.C33197a c33197a, double d, double d2, int i, double d3) {
        BaseGrtModel.C33189a m24337b = c33197a.m24337b();
        List<String> m24433f = m24337b.m24433f("appsflyer");
        Bundle bundle = new Bundle();
        bundle.putDouble("ad_ltv", d);
        bundle.putDouble("value", d2);
        bundle.putString("currency", "USD");
        bundle.putInt("living_days", i);
        bundle.putDouble("living_days_threshold", d3);
        if (m24433f.isEmpty()) {
            m23169i(c33197a.m24336c(), bundle, m24337b);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        bundle2.putDouble(AFInAppEventParameterName.REVENUE, d2);
        bundle2.putString(AFInAppEventParameterName.CURRENCY, "USD");
        m23166l(c33197a.m24336c(), bundle2, m24433f, m24337b);
        List<String> m24434e = m24337b.m24434e("appsflyer");
        if (m24434e.isEmpty()) {
            return;
        }
        m23166l(c33197a.m24336c(), bundle, m24434e, m24337b);
    }

    @Override // p711i4.BaseGrtEvent
    /* renamed from: d */
    public void mo23144d(GrtAdImpressionData grtAdImpressionData) {
        super.mo23144d(grtAdImpressionData);
        m23148n();
    }

    @Override // p711i4.BaseGrtEvent
    /* renamed from: f */
    public void mo23149f() {
        super.mo23149f();
        m23148n();
    }
}
