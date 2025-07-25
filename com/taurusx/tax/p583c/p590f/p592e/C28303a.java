package com.taurusx.tax.p583c.p590f.p592e;

import android.content.Context;
import android.text.TextUtils;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p606j.C28518e;
import com.taurusx.tax.p606j.p616z.C28561a;
import java.util.concurrent.atomic.AtomicBoolean;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.c.f.e.a */
/* loaded from: classes7.dex */
public class C28303a {

    /* renamed from: a */
    public static AtomicBoolean f73524a = new AtomicBoolean(false);

    /* renamed from: b */
    public static C28561a f73525b = null;

    /* renamed from: a */
    public static C28561a m38260a(Context context) {
        C28561a c28561a = null;
        if (context == null) {
            return null;
        }
        if (f73525b == null && !f73524a.getAndSet(true)) {
            try {
                c28561a = C28518e.m38043a(context);
            } catch (Error | Exception e) {
                e.printStackTrace();
            }
            f73524a.set(false);
        }
        if (c28561a != null && !TextUtils.isEmpty(c28561a.f74048a)) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            String m23824a = stringFogImpl.m23824a(new byte[]{16, 52, 17, 39, 17, 38, 28}, new byte[]{100, 85});
            LogUtil.m37905d(m23824a, stringFogImpl.m23824a(new byte[]{71, -37, 120, -46, 115, -105, 102, -46, 117, -105, 102, -42, 104, -45, 33, -59, 100, -60, 116, -37, 117, -115, 33}, new byte[]{1, -73}) + c28561a.f74048a + stringFogImpl.m23824a(new byte[]{-103, -109, -48, -110, -48, -117, -125, -33}, new byte[]{-71, -1}) + c28561a.f74049b);
            f73525b = c28561a;
        }
        return f73525b;
    }
}
