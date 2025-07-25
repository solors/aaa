package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.C21114v8;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public abstract class AbstractIdleService implements Service {

    /* renamed from: a */
    private final Supplier<String> f41629a = new ThreadNameSupplier();

    /* renamed from: b */
    private final Service f41630b = new DelegateService();

    /* loaded from: classes4.dex */
    private final class DelegateService extends AbstractService {
        private DelegateService() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        /* renamed from: e */
        protected final void mo67505e() {
            MoreExecutors.m67540e(AbstractIdleService.this.m67757b(), AbstractIdleService.this.f41629a).execute(new Runnable() { // from class: com.google.common.util.concurrent.AbstractIdleService.DelegateService.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AbstractIdleService.this.m67754e();
                        DelegateService.this.m67723m();
                    } catch (Throwable th) {
                        DelegateService.this.m67724l(th);
                    }
                }
            });
        }

        @Override // com.google.common.util.concurrent.AbstractService
        /* renamed from: f */
        protected final void mo67504f() {
            MoreExecutors.m67540e(AbstractIdleService.this.m67757b(), AbstractIdleService.this.f41629a).execute(new Runnable() { // from class: com.google.common.util.concurrent.AbstractIdleService.DelegateService.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AbstractIdleService.this.m67755d();
                        DelegateService.this.m67722n();
                    } catch (Throwable th) {
                        DelegateService.this.m67724l(th);
                    }
                }
            });
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractIdleService.this.toString();
        }
    }

    /* loaded from: classes4.dex */
    private final class ThreadNameSupplier implements Supplier<String> {
        private ThreadNameSupplier() {
        }

        @Override // com.google.common.base.Supplier
        public String get() {
            String m67756c = AbstractIdleService.this.m67756c();
            String valueOf = String.valueOf(AbstractIdleService.this.state());
            StringBuilder sb2 = new StringBuilder(String.valueOf(m67756c).length() + 1 + valueOf.length());
            sb2.append(m67756c);
            sb2.append(" ");
            sb2.append(valueOf);
            return sb2.toString();
        }
    }

    protected AbstractIdleService() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.f41630b.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.f41630b.awaitRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.f41630b.awaitTerminated();
    }

    /* renamed from: b */
    protected Executor m67757b() {
        return new Executor() { // from class: com.google.common.util.concurrent.AbstractIdleService.1
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                MoreExecutors.m67542c((String) AbstractIdleService.this.f41629a.get(), runnable).start();
            }
        };
    }

    /* renamed from: c */
    protected String m67756c() {
        return getClass().getSimpleName();
    }

    /* renamed from: d */
    protected abstract void m67755d() throws Exception;

    /* renamed from: e */
    protected abstract void m67754e() throws Exception;

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.f41630b.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.f41630b.isRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
        this.f41630b.startAsync();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.f41630b.state();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() {
        this.f41630b.stopAsync();
        return this;
    }

    public String toString() {
        String m67756c = m67756c();
        String valueOf = String.valueOf(state());
        StringBuilder sb2 = new StringBuilder(String.valueOf(m67756c).length() + 3 + valueOf.length());
        sb2.append(m67756c);
        sb2.append(" [");
        sb2.append(valueOf);
        sb2.append(C21114v8.C21123i.f54139e);
        return sb2.toString();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f41630b.awaitRunning(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f41630b.awaitTerminated(j, timeUnit);
    }
}
