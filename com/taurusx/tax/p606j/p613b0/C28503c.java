package com.taurusx.tax.p606j.p613b0;

import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.j.b0.c */
/* loaded from: classes7.dex */
public class C28503c {

    /* renamed from: a */
    public static final int f73926a;

    /* renamed from: b */
    public static final int f73927b;

    /* renamed from: c */
    public static final int f73928c;

    /* renamed from: d */
    public static ExecutorService f73929d;

    /* renamed from: e */
    public static ExecutorService f73930e;

    /* renamed from: f */
    public static ExecutorService f73931f;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f73926a = availableProcessors;
        f73927b = availableProcessors + 1;
        f73928c = (availableProcessors * 3) + 1;
        f73929d = null;
        f73930e = null;
        f73931f = null;
    }

    /* renamed from: a */
    public static ExecutorService m38063a() {
        if (f73929d == null) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            String m23824a = stringFogImpl.m23824a(new byte[]{34, 19, 35, 0, 35, 1, 46}, new byte[]{86, 114});
            StringBuilder sb2 = new StringBuilder();
            sb2.append(stringFogImpl.m23824a(new byte[]{-100, 91, -102, 72, -117, 76, -33, 125, -105, 91, -102, 72, -101, 121, -112, 70, -109, 108, -121, 76, -100, 92, -117, 70, -115, 9, -103, 70, -115, 9, -98, 77, -33, 91, -102, 88, -118, 76, -116, 93, -33}, new byte[]{-1, 41}));
            int i = f73927b;
            sb2.append(i);
            sb2.append(stringFogImpl.m23824a(new byte[]{126}, new byte[]{68, -124}));
            int i2 = f73928c;
            sb2.append(i2);
            LogUtil.m37905d(m23824a, sb2.toString());
            f73929d = new ThreadPoolExecutor(i, i2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        return f73929d;
    }

    /* renamed from: b */
    public static ExecutorService m38062b() {
        if (f73930e == null) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            String m23824a = stringFogImpl.m23824a(new byte[]{-31, -101, -32, -120, -32, -119, -19}, new byte[]{-107, -6});
            StringBuilder sb2 = new StringBuilder();
            sb2.append(stringFogImpl.m23824a(new byte[]{19, 49, 21, 34, 4, 38, 80, 23, 24, 49, 21, 34, 20, 19, 31, 44, 28, 6, 8, 38, 19, 54, 4, 44, 2, 99, 22, 44, 2, 99, 21, 53, 21, 45, 4, 99, 4, 49, 17, 32, 27, 38, 2, 99}, new byte[]{112, 67}));
            int i = f73927b;
            sb2.append(i);
            sb2.append(stringFogImpl.m23824a(new byte[]{-4}, new byte[]{-58, 109}));
            int i2 = f73928c;
            sb2.append(i2);
            LogUtil.m37905d(m23824a, sb2.toString());
            f73930e = new ThreadPoolExecutor(i, i2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        return f73930e;
    }
}
