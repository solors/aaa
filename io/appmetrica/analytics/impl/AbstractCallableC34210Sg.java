package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Sg */
/* loaded from: classes9.dex */
public abstract class AbstractCallableC34210Sg implements Callable {
    @NotNull

    /* renamed from: d */
    public static final C34186Rg f93497d = new C34186Rg();

    /* renamed from: a */
    public final C34629j0 f93498a;

    /* renamed from: b */
    public final InterfaceC34514ek f93499b;

    /* renamed from: c */
    public boolean f93500c;

    public AbstractCallableC34210Sg(C34629j0 c34629j0, InterfaceC34514ek interfaceC34514ek) {
        this.f93498a = c34629j0;
        this.f93499b = interfaceC34514ek;
    }

    /* renamed from: a */
    public abstract void mo21573a(IAppMetricaService iAppMetricaService);

    /* renamed from: a */
    public void mo21572a(@Nullable Throwable th) {
    }

    @NotNull
    /* renamed from: b */
    public final C34629j0 m22269b() {
        return this.f93498a;
    }

    /* renamed from: c */
    public boolean mo21602c() {
        C34629j0 c34629j0 = this.f93498a;
        synchronized (c34629j0) {
            if (c34629j0.f94650d == null) {
                c34629j0.f94651e = new CountDownLatch(1);
                Intent m22614a = AbstractC33900Fj.m22614a(c34629j0.f94647a);
                try {
                    c34629j0.f94653g.m22504b(c34629j0.f94647a);
                    c34629j0.f94647a.bindService(m22614a, c34629j0.f94655i, 1);
                } catch (Throwable unused) {
                }
            }
        }
        this.f93498a.m21531a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        mo21604a();
        return Unit.f99208a;
    }

    /* renamed from: d */
    public final boolean m22268d() {
        return this.f93500c;
    }

    /* renamed from: a */
    public final void m22270a(boolean z) {
        this.f93500c = z;
    }

    /* renamed from: a */
    public void mo21604a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.f93500c) {
                return;
            }
            this.f93500c = true;
            int i = 0;
            do {
                C34629j0 c34629j0 = this.f93498a;
                synchronized (c34629j0) {
                    iAppMetricaService = c34629j0.f94650d;
                }
                if (iAppMetricaService != null) {
                    try {
                        mo21573a(iAppMetricaService);
                        InterfaceC34514ek interfaceC34514ek = this.f93499b;
                        if (interfaceC34514ek == null || ((C33823Ch) interfaceC34514ek).m22735a()) {
                            this.f93498a.m21529c();
                            return;
                        }
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i++;
                if (!mo21602c() || C34148Q1.f93378e.get()) {
                    return;
                }
            } while (i < 3);
        } catch (Throwable th) {
            mo21572a(th);
        }
    }
}
