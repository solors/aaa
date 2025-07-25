package com.taurusx.tax.p583c.p588d;

import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p583c.p588d.C28285b;
import com.taurusx.tax.p606j.p613b0.C28503c;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.c.d.d */
/* loaded from: classes7.dex */
public class C28289d {

    /* renamed from: com.taurusx.tax.c.d.d$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC28290a {
    }

    static {
        C28162a.f73047a.m23824a(new byte[]{70, 56, 99, 37, 94, 46, 125, 62, 105, 56, 120, 3, 105, 39, 124, 46, 126}, new byte[]{12, 75});
    }

    /* renamed from: a */
    public static void m38316a(String str, Map<String, String> map, byte[] bArr, int i, InterfaceC28290a interfaceC28290a) {
        C28285b.InterfaceC28286a.EnumC28287a enumC28287a = C28285b.InterfaceC28286a.EnumC28287a.POST;
        C28285b c28285b = new C28285b();
        c28285b.f73468b = new C28288c(enumC28287a, str, bArr, map, i, interfaceC28290a);
        if (C28503c.f73931f == null) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            String m23824a = stringFogImpl.m23824a(new byte[]{-59, 56, -60, 43, -60, 42, -55}, new byte[]{-79, 89});
            StringBuilder sb2 = new StringBuilder();
            sb2.append(stringFogImpl.m23824a(new byte[]{7, 12, 1, 31, 16, 27, 68, 42, 12, 12, 1, 31, 0, 46, 11, 17, 8, 59, 28, 27, 7, 11, 16, 17, 22, 94, 2, 17, 22, 94, 2, 18, 29, 27, 22, 94}, new byte[]{100, 126}));
            int i2 = C28503c.f73927b;
            sb2.append(i2);
            sb2.append(stringFogImpl.m23824a(new byte[]{34}, new byte[]{24, 113}));
            int i3 = C28503c.f73928c;
            sb2.append(i3);
            LogUtil.m37905d(m23824a, sb2.toString());
            C28503c.f73931f = new ThreadPoolExecutor(i2, i3, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        C28503c.f73931f.execute(new RunnableC28284a(c28285b));
    }
}
