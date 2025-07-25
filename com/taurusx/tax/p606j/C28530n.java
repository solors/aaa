package com.taurusx.tax.p606j;

import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import java.util.IllegalFormatException;

/* renamed from: com.taurusx.tax.j.n */
/* loaded from: classes7.dex */
public final class C28530n {

    /* renamed from: com.taurusx.tax.j.n$a */
    /* loaded from: classes7.dex */
    public static final class C28531a {
        /* renamed from: a */
        public static boolean m37994a(Object obj) {
            return C28530n.m37995a(obj, false, C28162a.f73047a.m23824a(new byte[]{-64, -7, -27, -2, -20, -17, -81, -8, -18, -11, -81, -11, -32, -17, -81, -7, -22, -69, -31, -18, -29, -9, -95}, new byte[]{-113, -101}), "");
        }
    }

    /* renamed from: a */
    public static void m37997a(Object obj) {
        m37995a(obj, true, C28162a.f73047a.m23824a(new byte[]{92, 50, 121, 53, 112, 36, 51, 51, 114, 62, 51, 62, 124, 36, 51, 50, 118, 112, 125, 37, Byte.MAX_VALUE, 60, 61}, new byte[]{19, 80}), "");
    }

    /* renamed from: a */
    public static void m37996a(Object obj, String str) {
        m37995a(obj, true, str, "");
    }

    /* renamed from: a */
    public static boolean m37995a(Object obj, boolean z, String str, Object... objArr) {
        if (obj != null) {
            return true;
        }
        String valueOf = String.valueOf(str);
        try {
            valueOf = String.format(valueOf, objArr);
        } catch (IllegalFormatException e) {
            String m23824a = C28162a.f73047a.m23824a(new byte[]{63, 17, 62, 2, 62, 3, 51}, new byte[]{75, 112});
            LogUtil.m37905d(m23824a, C28162a.f73047a.m23824a(new byte[]{123, 53, 110, 36, 100, 41, 111, 46, Byte.MAX_VALUE, 46, 100, 41, 120, 103, 99, 38, 111, 103, 106, 103, 109, 40, 121, 42, 106, 51, 43, 34, 115, 36, 110, 55, Byte.MAX_VALUE, 46, 100, 41, 49, 103}, new byte[]{11, 71}) + e.getMessage());
        }
        if (!z) {
            LogUtil.m37905d(C28162a.f73047a.m23824a(new byte[]{-13, -65, -14, -84, -14, -83, -1}, new byte[]{-121, -34}), valueOf);
            return false;
        }
        throw new NullPointerException(valueOf);
    }
}
