package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.C21114v8;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public abstract class AbstractExecutionThreadService implements Service {

    /* renamed from: b */
    private static final Logger f41590b = Logger.getLogger(AbstractExecutionThreadService.class.getName());

    /* renamed from: a */
    private final Service f41591a = new AbstractService() { // from class: com.google.common.util.concurrent.AbstractExecutionThreadService.1
        @Override // com.google.common.util.concurrent.AbstractService
        /* renamed from: e */
        protected final void mo67505e() {
            MoreExecutors.m67540e(AbstractExecutionThreadService.this.m67797b(), new Supplier<String>() { // from class: com.google.common.util.concurrent.AbstractExecutionThreadService.1.1
                @Override // com.google.common.base.Supplier
                public String get() {
                    return AbstractExecutionThreadService.this.m67795d();
                }
            }).execute(new Runnable() { // from class: com.google.common.util.concurrent.AbstractExecutionThreadService.1.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AbstractExecutionThreadService.this.m67793f();
                        m67723m();
                        if (isRunning()) {
                            AbstractExecutionThreadService.this.m67796c();
                        }
                        AbstractExecutionThreadService.this.m67794e();
                        m67722n();
                    } catch (Throwable th) {
                        m67724l(th);
                    }
                }
            });
        }

        @Override // com.google.common.util.concurrent.AbstractService
        /* renamed from: f */
        protected void mo67504f() {
            AbstractExecutionThreadService.this.m67792g();
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractExecutionThreadService.this.toString();
        }
    };

    protected AbstractExecutionThreadService() {
    }

    /* renamed from: a */
    static /* synthetic */ Logger m67798a() {
        return f41590b;
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.f41591a.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.f41591a.awaitRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.f41591a.awaitTerminated();
    }

    /* renamed from: b */
    protected Executor m67797b() {
        return new Executor() { // from class: com.google.common.util.concurrent.AbstractExecutionThreadService.2
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                MoreExecutors.m67542c(AbstractExecutionThreadService.this.m67795d(), runnable).start();
            }
        };
    }

    /* renamed from: c */
    protected abstract void m67796c() throws Exception;

    /* renamed from: d */
    protected String m67795d() {
        return getClass().getSimpleName();
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.f41591a.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.f41591a.isRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
        this.f41591a.startAsync();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.f41591a.state();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() {
        this.f41591a.stopAsync();
        return this;
    }

    public String toString() {
        String m67795d = m67795d();
        String valueOf = String.valueOf(state());
        StringBuilder sb2 = new StringBuilder(String.valueOf(m67795d).length() + 3 + valueOf.length());
        sb2.append(m67795d);
        sb2.append(" [");
        sb2.append(valueOf);
        sb2.append(C21114v8.C21123i.f54139e);
        return sb2.toString();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f41591a.awaitRunning(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f41591a.awaitTerminated(j, timeUnit);
    }

    /* renamed from: e */
    protected void m67794e() throws Exception {
    }

    /* renamed from: f */
    protected void m67793f() throws Exception {
    }

    @Beta
    /* renamed from: g */
    protected void m67792g() {
    }
}
