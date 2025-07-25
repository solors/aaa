package com.taurusx.tax.p606j.p607a0;

import android.content.Context;
import android.os.Build;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p606j.p607a0.p608d.C28470a;
import com.taurusx.tax.p606j.p607a0.p609e.C28475a;
import com.taurusx.tax.p606j.p607a0.p610f.C28480a;
import com.taurusx.tax.p606j.p607a0.p611g.C28483a;
import com.taurusx.tax.p606j.p607a0.p612h.C28484a;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.j.a0.b */
/* loaded from: classes7.dex */
public class C28468b {

    /* renamed from: a */
    public static C28469c f73902a;

    /* renamed from: a */
    public static C28469c m38074a(Context context) {
        C28467a c28467a;
        if (f73902a == null) {
            String upperCase = Build.MANUFACTURER.toUpperCase();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            String m23824a = stringFogImpl.m23824a(new byte[]{7, 54, 6, 37, 6, 36, 11}, new byte[]{115, 87});
            LogUtil.m37905d(m23824a, stringFogImpl.m23824a(new byte[]{24, -101, 11, -34, 48, -65, 54, -70, 95, -119, 22, -118, 23, -34, 18, -97, 17, -117, 25, -97, 28, -118, 10, -116, 26, -116, 95, -60, 95}, new byte[]{Byte.MAX_VALUE, -2}) + upperCase);
            C28469c c28469c = null;
            if (stringFogImpl.m23824a(new byte[]{52, -62, 61, -64, 57, -34}, new byte[]{124, -105}).equals(upperCase)) {
                c28467a = new C28470a(context);
            } else if (stringFogImpl.m23824a(new byte[]{-42, -117, -49, -115, -61, -117}, new byte[]{-114, -62}).equals(upperCase)) {
                c28467a = new C28484a(context);
            } else if (stringFogImpl.m23824a(new byte[]{-113, -69, -112, -92}, new byte[]{-64, -21}).equals(upperCase)) {
                c28467a = new C28475a(context);
            } else if (stringFogImpl.m23824a(new byte[]{-7, -124, -7, -126}, new byte[]{-81, -51}).equals(upperCase)) {
                c28467a = new C28483a(context);
            } else if (stringFogImpl.m23824a(new byte[]{-25, 41, -7, 59, -31, 38, -13}, new byte[]{-76, 104}).equals(upperCase)) {
                c28467a = new C28480a(context);
            } else {
                String m23824a2 = stringFogImpl.m23824a(new byte[]{-64, -39, -63, -54, -63, -53, -52}, new byte[]{-76, -72});
                LogUtil.m37905d(m23824a2, stringFogImpl.m23824a(new byte[]{-53, 42, -40, 111, -29, 14, -27, 11, -116, 56, -59, 59, -60, 111, -51, 111, -62, 32, -40, 111, -33, 58, -36, 63, -61, 61, -40, 42, -56, 111, -63, 46, -62, 58, -54, 46, -49, 59, -39, 61, -55, 61, -116, 117, -116}, new byte[]{-84, 79}) + upperCase);
                c28467a = null;
            }
            if (c28467a != null && (c28469c = c28467a.mo38066a()) != null) {
                String m23824a3 = stringFogImpl.m23824a(new byte[]{23, 12, 22, 31, 22, 30, 27}, new byte[]{99, 109});
                LogUtil.m37905d(m23824a3, stringFogImpl.m23824a(new byte[]{124, -71, 111, -4, 84, -99, 82, -104, 59, -82, 126, -81, 110, -80, 111, -4, 33, -4}, new byte[]{27, -36}) + c28469c.f73903a + stringFogImpl.m23824a(new byte[]{48, 3, 121, 2, 121, 27, 42, 79}, new byte[]{16, 111}) + c28469c.f73904b);
            }
            f73902a = c28469c;
        }
        return f73902a;
    }
}
