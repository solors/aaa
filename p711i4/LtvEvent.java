package p711i4;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.appsflyer.AFInAppEventParameterName;
import java.util.List;
import p633d4.GrtAdImpressionData;
import p681g4.BaseGrtModel;
import p681g4.LtvModel;
import p737j4.C37279b;
import p737j4.C37287d;

/* renamed from: i4.k */
/* loaded from: classes6.dex */
public class LtvEvent extends BaseGrtEvent<LtvModel> {

    /* renamed from: d */
    private final String f91906d;

    public LtvEvent(LtvModel ltvModel) {
        super(ltvModel);
        this.f91906d = "sp_key_ltv_threshold";
    }

    /* renamed from: n */
    private void m23151n() {
        m23171c().m23140b();
        String m23141a = m23171c().m23141a();
        double m23172b = m23172b();
        SharedPreferences.Editor editor = null;
        boolean z = false;
        C37287d.C37290c c37290c = null;
        for (LtvModel.C33195a c33195a : m23173a().m24356b()) {
            LtvModel.C33195a.C33196a c33196a = c33195a.m24354a().get(m23141a);
            if (c33196a == null) {
                c33196a = c33195a.m24354a().get("global");
            }
            if (c33196a != null && m23172b >= c33196a.m24348a()) {
                if (c37290c == null) {
                    c37290c = C37287d.m18566a().m18564c(C37279b.m18579k().m18578l(), "sp_key_ltv_threshold");
                }
                String m24352c = c33195a.m24352c();
                if ("0".equals(c37290c.m18559c(m24352c, "0"))) {
                    if (editor == null) {
                        editor = c37290c.m18561a();
                    }
                    editor.putString(m24352c, "1");
                    m23150o(c33195a, m23172b);
                    z = true;
                }
            }
        }
        if (z) {
            editor.apply();
        }
    }

    /* renamed from: o */
    private void m23150o(LtvModel.C33195a c33195a, double d) {
        BaseGrtModel.C33189a m24353b = c33195a.m24353b();
        List<String> m24433f = m24353b.m24433f("appsflyer");
        Bundle bundle = new Bundle();
        bundle.putDouble("value", d);
        bundle.putString("currency", "USD");
        if (m24433f.isEmpty()) {
            m23169i(c33195a.m24352c(), bundle, m24353b);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        bundle2.putDouble(AFInAppEventParameterName.REVENUE, d);
        bundle2.putString(AFInAppEventParameterName.CURRENCY, "USD");
        m23166l(c33195a.m24352c(), bundle2, m24433f, m24353b);
        List<String> m24434e = m24353b.m24434e("appsflyer");
        if (m24434e.isEmpty()) {
            return;
        }
        m23166l(c33195a.m24352c(), bundle, m24434e, m24353b);
    }

    @Override // p711i4.BaseGrtEvent
    /* renamed from: d */
    public void mo23144d(GrtAdImpressionData grtAdImpressionData) {
        super.mo23144d(grtAdImpressionData);
        m23151n();
    }
}
