package com.taurusx.tax.p606j.p613b0;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p606j.C28530n;
import java.util.concurrent.Executor;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.j.b0.a */
/* loaded from: classes7.dex */
public class C28490a {

    /* renamed from: a */
    public static Executor f73920a = AsyncTask.THREAD_POOL_EXECUTOR;

    /* renamed from: b */
    public static Handler f73921b = new Handler(Looper.getMainLooper());

    /* renamed from: com.taurusx.tax.j.b0.a$a */
    /* loaded from: classes7.dex */
    public class RunnableC28491a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AsyncTask f73922a;

        /* renamed from: b */
        public final /* synthetic */ Object[] f73923b;

        public RunnableC28491a(AsyncTask asyncTask, Object[] objArr) {
            this.f73922a = asyncTask;
            this.f73923b = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f73922a.executeOnExecutor(C28490a.f73920a, this.f73923b);
        }
    }

    /* renamed from: a */
    public static <P> void m38065a(AsyncTask<P, ?, ?> asyncTask, P... pArr) {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        C28530n.m37996a(asyncTask, stringFogImpl.m23824a(new byte[]{-14, -110, -58, -98, -53, -103, -121, -120, -56, -36, -62, -124, -62, -97, -46, -120, -62, -36, -55, -119, -53, -112, -121, -67, -44, -123, -55, -97, -13, -99, -44, -105, -119}, new byte[]{-89, -4}));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            asyncTask.executeOnExecutor(f73920a, pArr);
            return;
        }
        LogUtil.m37900v(stringFogImpl.m23824a(new byte[]{-64, 90, -63, 73, -63, 72, -52}, new byte[]{-76, 59}), stringFogImpl.m23824a(new byte[]{-57, 89, -28, 66, -2, 88, -16, 22, -42, 69, -18, 88, -12, 98, -10, 69, -4, 22, -29, 89, -73, 91, -10, 95, -7, 22, -29, 94, -27, 83, -10, 82, -73, 80, -8, 68, -73, 83, -17, 83, -12, 67, -29, 95, -8, 88, -71}, new byte[]{-105, 54}));
        f73921b.post(new RunnableC28491a(asyncTask, pArr));
    }
}
