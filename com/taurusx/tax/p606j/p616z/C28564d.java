package com.taurusx.tax.p606j.p616z;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p606j.C28518e;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.j.z.d */
/* loaded from: classes7.dex */
public class C28564d {

    /* renamed from: a */
    public static AtomicBoolean f74053a = new AtomicBoolean(false);

    /* renamed from: b */
    public static C28561a f74054b = null;

    /* renamed from: a */
    public static String m37922a(Context context) {
        C28561a m37921b = m37921b(context);
        if (m37921b == null || TextUtils.isEmpty(m37921b.f74048a)) {
            return "";
        }
        StringFogImpl stringFogImpl = C28162a.f73047a;
        LogUtil.m37905d(stringFogImpl.m23824a(new byte[]{-119, 70, -120, 85, -120, 84, -123}, new byte[]{-3, 39}), stringFogImpl.m23824a(new byte[]{42, -20, 34, -118, 4, -49, 23, -118, 36, -21, 42, -18, 67, -52, 17, -59, 14, -118, 0, -53, 0, -62, 6}, new byte[]{99, -86}));
        return m37921b.f74048a;
    }

    /* renamed from: b */
    public static C28561a m37921b(Context context) {
        C28561a c28561a = null;
        if (context == null) {
            return null;
        }
        if (f74054b == null && !f74053a.getAndSet(true)) {
            try {
                c28561a = C28518e.m38043a(context);
            } catch (Error | Exception e) {
                e.printStackTrace();
            }
            f74053a.set(false);
        }
        if (c28561a != null && !TextUtils.isEmpty(c28561a.f74048a)) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            String m23824a = stringFogImpl.m23824a(new byte[]{125, 88, 124, 75, 124, 74, 113}, new byte[]{9, 57});
            LogUtil.m37905d(m23824a, stringFogImpl.m23824a(new byte[]{5, -23, 13, -113, 43, -54, 56, -113, 43, -50, 37, -53, 108, -35, 41, -36, 57, -61, 56, -107, 108}, new byte[]{76, -81}) + c28561a.f74048a + stringFogImpl.m23824a(new byte[]{-111, 111, -40, 110, -40, 119, -117, 35}, new byte[]{-79, 3}) + c28561a.f74049b);
            f74054b = c28561a;
        }
        return f74054b;
    }

    /* renamed from: c */
    public static boolean m37920c(Context context) {
        C28561a m37921b = m37921b(context);
        if (m37921b != null) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            LogUtil.m37905d(stringFogImpl.m23824a(new byte[]{-34, -47, -33, -62, -33, -61, -46}, new byte[]{-86, -80}), stringFogImpl.m23824a(new byte[]{21, -121, 29, -31, 59, -92, 40, -31, 27, UnsignedBytes.MAX_POWER_OF_TWO, 21, -123, 124, -83, 53, -84, 53, -75, 124, -89, 46, -82, 49, -31, 63, -96, 63, -87, 57}, new byte[]{92, -63}));
            return m37921b.f74049b;
        }
        return false;
    }

    /* renamed from: a */
    public static String m37923a() {
        try {
            return Locale.ENGLISH.getCountry();
        } catch (Exception unused) {
            return "";
        }
    }
}
