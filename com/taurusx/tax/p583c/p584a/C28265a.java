package com.taurusx.tax.p583c.p584a;

import android.util.Log;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.p583c.p584a.p585d.C28274d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.taurusx.tax.c.a.a */
/* loaded from: classes7.dex */
public class C28265a {

    /* renamed from: c */
    public AtomicInteger f73432c;

    /* renamed from: a */
    public final String f73430a = C28162a.m38504a(new byte[]{-80, 57, -112, 33, -127, 12, -108, 44, -99, 42}, new byte[]{-11, 79});

    /* renamed from: b */
    public ExecutorService f73431b = new ThreadPoolExecutor(4, 8, 30, TimeUnit.SECONDS, new LinkedBlockingDeque(200), new RejectedExecutionHandlerC28266a());

    /* renamed from: d */
    public C28274d f73433d = new C28274d();

    /* renamed from: com.taurusx.tax.c.a.a$a */
    /* loaded from: classes7.dex */
    public class RejectedExecutionHandlerC28266a implements RejectedExecutionHandler {
        public RejectedExecutionHandlerC28266a() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            C28265a c28265a = C28265a.this;
            Log.e(c28265a.f73430a, C28162a.f73047a.m23824a(new byte[]{-8, 47, -40, 38, -34, 110, -2, 56, -34, 32, -49, 116, -101, 60, -34, 36, -34, 45, -49, 43, -33, 111}, new byte[]{-69, 78}));
        }
    }

    /* renamed from: com.taurusx.tax.c.a.a$b */
    /* loaded from: classes7.dex */
    public static class C28267b {

        /* renamed from: a */
        public String f73435a;

        /* renamed from: b */
        public long f73436b;

        /* renamed from: c */
        public String f73437c;
    }

    /* renamed from: com.taurusx.tax.c.a.a$c */
    /* loaded from: classes7.dex */
    public static class C28268c {

        /* renamed from: a */
        public int f73438a;

        /* renamed from: b */
        public String f73439b;
    }
}
