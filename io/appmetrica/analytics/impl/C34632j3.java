package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.j3 */
/* loaded from: classes9.dex */
public final class C34632j3 implements InterfaceC34785ol {

    /* renamed from: a */
    public BillingMonitor f94661a;

    /* renamed from: b */
    public final Context f94662b;

    /* renamed from: c */
    public final Executor f94663c;

    /* renamed from: d */
    public final Executor f94664d;

    /* renamed from: e */
    public final BillingType f94665e;

    /* renamed from: f */
    public final BillingInfoStorage f94666f;

    /* renamed from: g */
    public final BillingInfoSender f94667g;

    /* renamed from: h */
    public final ApplicationStateProvider f94668h;

    /* renamed from: i */
    public final C34578h3 f94669i;

    public C34632j3(@NonNull Context context, @NonNull Executor executor, @NonNull Executor executor2, @NonNull BillingType billingType, @NonNull BillingInfoStorage billingInfoStorage, @NonNull BillingInfoSender billingInfoSender) {
        this(context, executor, executor2, billingType, billingInfoStorage, billingInfoSender, C34693la.m21444h().m21449c(), new C34578h3());
    }

    /* renamed from: a */
    public final void m21528a(@NonNull C34650jl c34650jl, @Nullable Boolean bool) {
        BillingMonitor c34225t7;
        if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
            synchronized (this) {
                C34578h3 c34578h3 = this.f94669i;
                Context context = this.f94662b;
                Executor executor = this.f94663c;
                Executor executor2 = this.f94664d;
                BillingType billingType = this.f94665e;
                BillingInfoStorage billingInfoStorage = this.f94666f;
                BillingInfoSender billingInfoSender = this.f94667g;
                c34578h3.getClass();
                if (AbstractC34551g3.f94424a[billingType.ordinal()] == 1) {
                    c34225t7 = new BillingLibraryMonitor(context, executor, executor2, billingInfoStorage, billingInfoSender, null, null, 96, null);
                } else {
                    c34225t7 = new C34225T7();
                }
                this.f94661a = c34225t7;
            }
            c34225t7.onBillingConfigChanged(c34650jl.f94744x);
            if (this.f94668h.registerStickyObserver(new C34605i3(this)) == ApplicationState.VISIBLE) {
                try {
                    BillingMonitor billingMonitor = this.f94661a;
                    if (billingMonitor != null) {
                        billingMonitor.onSessionResumed();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public C34632j3(@NonNull Context context, @NonNull Executor executor, @NonNull Executor executor2, @NonNull BillingType billingType, @NonNull BillingInfoStorage billingInfoStorage, @NonNull BillingInfoSender billingInfoSender, @NonNull ApplicationStateProvider applicationStateProvider, @NonNull C34578h3 c34578h3) {
        this.f94662b = context;
        this.f94663c = executor;
        this.f94664d = executor2;
        this.f94665e = billingType;
        this.f94666f = billingInfoStorage;
        this.f94667g = billingInfoSender;
        this.f94668h = applicationStateProvider;
        this.f94669i = c34578h3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34785ol
    /* renamed from: a */
    public final synchronized void mo20741a(@NonNull C34650jl c34650jl) {
        BillingMonitor billingMonitor;
        synchronized (this) {
            billingMonitor = this.f94661a;
        }
        if (billingMonitor != null) {
            billingMonitor.onBillingConfigChanged(c34650jl.f94744x);
        }
    }
}
