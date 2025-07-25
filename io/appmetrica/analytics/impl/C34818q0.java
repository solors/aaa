package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: io.appmetrica.analytics.impl.q0 */
/* loaded from: classes9.dex */
public final class C34818q0 implements InterfaceC34180Ra {

    /* renamed from: e */
    public static volatile C34818q0 f95195e = null;

    /* renamed from: f */
    public static volatile boolean f95196f = false;

    /* renamed from: g */
    public static volatile boolean f95197g;

    /* renamed from: a */
    public final Context f95198a;

    /* renamed from: b */
    public final C34683l0 f95199b;

    /* renamed from: c */
    public final FutureTask f95200c;

    /* renamed from: d */
    public final InterfaceC35062za f95201d;

    @AnyThread
    public C34818q0(@NonNull Context context) {
        this.f95198a = context;
        C34683l0 m21058b = C34848r4.m21050i().m21058b();
        this.f95199b = m21058b;
        this.f95201d = m21058b.m21464a(context, C34848r4.m21050i().m21054e());
        this.f95200c = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.hp
            {
                C34818q0.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C34818q0.this.m21107p();
            }
        });
    }

    @NonNull
    @AnyThread
    /* renamed from: a */
    public static C34818q0 m21134a(@NonNull Context context, boolean z) {
        C34818q0 c34818q0 = f95195e;
        if (c34818q0 == null) {
            synchronized (C34818q0.class) {
                c34818q0 = f95195e;
                if (c34818q0 == null) {
                    c34818q0 = new C34818q0(context);
                    c34818q0.m21123b(z);
                    C34848r4.m21050i().f95251c.m21639a().execute(new RunnableC34791p0(c34818q0));
                    f95195e = c34818q0;
                }
            }
        }
        return c34818q0;
    }

    @WorkerThread
    public static void clearAppEnvironment() {
        m21116g().clearAppEnvironment();
    }

    /* renamed from: g */
    public static InterfaceC34908tc m21116g() {
        if (m21109n()) {
            return f95195e.m21112k();
        }
        return C34848r4.m21050i().f95250b;
    }

    @AnyThread
    /* renamed from: l */
    public static synchronized boolean m21111l() {
        boolean z;
        synchronized (C34818q0.class) {
            z = f95196f;
        }
        return z;
    }

    @AnyThread
    /* renamed from: m */
    public static boolean m21110m() {
        return f95197g;
    }

    @AnyThread
    /* renamed from: n */
    public static synchronized boolean m21109n() {
        boolean z;
        synchronized (C34818q0.class) {
            C34818q0 c34818q0 = f95195e;
            if (c34818q0 != null && c34818q0.f95200c.isDone()) {
                if (c34818q0.m21112k().mo20832j() != null) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    @VisibleForTesting(otherwise = 5)
    /* renamed from: o */
    public static synchronized void m21108o() {
        synchronized (C34818q0.class) {
            f95195e = null;
            f95196f = false;
            f95197g = false;
        }
    }

    @WorkerThread
    public static void putAppEnvironmentValue(String str, String str2) {
        m21116g().putAppEnvironmentValue(str, str2);
    }

    @AnyThread
    /* renamed from: q */
    public static synchronized void m21106q() {
        synchronized (C34818q0.class) {
            f95196f = true;
        }
    }

    @AnyThread
    /* renamed from: r */
    public static void m21105r() {
        f95197g = true;
    }

    @Nullable
    @AnyThread
    /* renamed from: s */
    public static C34818q0 m21104s() {
        return f95195e;
    }

    @WorkerThread
    public static void setDataSendingEnabled(boolean z) {
        m21116g().setDataSendingEnabled(z);
    }

    @WorkerThread
    public static void setUserProfileID(@Nullable String str) {
        m21116g().setUserProfileID(str);
    }

    /* renamed from: b */
    public final void m21123b(boolean z) {
        Executor blockingExecutor;
        final C34848r4 m21050i = C34848r4.m21050i();
        if (z) {
            blockingExecutor = m21050i.f95251c.m21639a();
        } else {
            blockingExecutor = new BlockingExecutor();
        }
        blockingExecutor.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.gp
            @Override // java.lang.Runnable
            public final void run() {
                C34818q0.this.m21127a(m21050i);
            }
        });
        blockingExecutor.execute(this.f95200c);
    }

    @AnyThread
    /* renamed from: c */
    public final void m21121c(@Nullable AppMetricaConfig appMetricaConfig) {
        this.f95201d.mo20724a(appMetricaConfig, this);
    }

    @WorkerThread
    /* renamed from: d */
    public final void m21118d(@NonNull AppMetricaConfig appMetricaConfig) {
        m21112k().mo20845a(appMetricaConfig);
    }

    @Nullable
    @AnyThread
    /* renamed from: f */
    public final String m21117f() {
        return m21112k().mo20835f();
    }

    @Nullable
    @AnyThread
    /* renamed from: h */
    public final Map<String, String> m21115h() {
        return m21112k().mo20834h();
    }

    @NonNull
    @AnyThread
    /* renamed from: i */
    public final AdvIdentifiersResult m21114i() {
        return m21112k().mo20833i();
    }

    @Nullable
    @WorkerThread
    /* renamed from: j */
    public final C34373Zb m21113j() {
        return m21112k().mo20832j();
    }

    /* renamed from: k */
    public final InterfaceC33766Aa m21112k() {
        try {
            return (InterfaceC33766Aa) this.f95200c.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: p */
    public final InterfaceC33766Aa m21107p() {
        InterfaceC33766Aa interfaceC33766Aa;
        C34683l0 c34683l0 = this.f95199b;
        Context context = this.f95198a;
        InterfaceC35062za interfaceC35062za = this.f95201d;
        synchronized (c34683l0) {
            if (c34683l0.f94810d == null) {
                if (c34683l0.m21465a(context)) {
                    c34683l0.f94810d = new C34974w0();
                } else {
                    c34683l0.f94810d = new C34922u0(context, interfaceC35062za);
                }
            }
            interfaceC33766Aa = c34683l0.f94810d;
        }
        return interfaceC33766Aa;
    }

    @NonNull
    @WorkerThread
    /* renamed from: c */
    public final InterfaceC34133Pa m21120c(@NonNull ReporterConfig reporterConfig) {
        return m21112k().mo20838c(reporterConfig);
    }

    @NonNull
    @AnyThread
    /* renamed from: d */
    public final C34275V9 m21119d() {
        return m21112k().mo20837d();
    }

    @NonNull
    @AnyThread
    /* renamed from: c */
    public final C34900t4 m21122c() {
        return this.f95201d.mo20725a();
    }

    @WorkerThread
    /* renamed from: b */
    public final void m21124b() {
        m21112k().mo20836e();
    }

    @WorkerThread
    /* renamed from: a */
    public static void m21133a(@Nullable Location location) {
        m21116g().mo20846a(location);
    }

    @WorkerThread
    /* renamed from: a */
    public static void m21125a(boolean z) {
        m21116g().mo20839a(z);
    }

    @WorkerThread
    /* renamed from: a */
    public static void m21126a(String str, String str2) {
        m21116g().mo20840a(str, str2);
    }

    @WorkerThread
    /* renamed from: a */
    public final void m21131a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        m21112k().mo20843a(deferredDeeplinkParametersListener);
    }

    @WorkerThread
    /* renamed from: a */
    public final void m21132a(DeferredDeeplinkListener deferredDeeplinkListener) {
        m21112k().mo20844a(deferredDeeplinkListener);
    }

    @WorkerThread
    /* renamed from: a */
    public final void m21130a(@NonNull ReporterConfig reporterConfig) {
        m21112k().mo20842a(reporterConfig);
    }

    @WorkerThread
    /* renamed from: a */
    public final void m21129a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        m21112k().mo20841a(startupParamsCallback, list);
    }

    /* renamed from: a */
    public final void m21127a(C34848r4 c34848r4) {
        c34848r4.f95265q.m21997a(this.f95198a);
        new C34687l4(this.f95198a).m20870a(this.f95198a);
        C34848r4.m21050i().m21059a(this.f95198a).m22041a();
    }

    @VisibleForTesting(otherwise = 5)
    /* renamed from: a */
    public static synchronized void m21128a(@Nullable C34818q0 c34818q0) {
        synchronized (C34818q0.class) {
            f95195e = c34818q0;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34180Ra
    @NonNull
    /* renamed from: a */
    public final InterfaceC34157Qa mo20848a() {
        return m21112k().mo20848a();
    }
}
