package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ListenerCallQueue;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.ironsource.C21114v8;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public abstract class AbstractService implements Service {

    /* renamed from: h */
    private static final ListenerCallQueue.Event<Service.Listener> f41666h = new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.1
        public String toString() {
            return "starting()";
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public void call(Service.Listener listener) {
            listener.starting();
        }
    };

    /* renamed from: i */
    private static final ListenerCallQueue.Event<Service.Listener> f41667i = new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.2
        public String toString() {
            return "running()";
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public void call(Service.Listener listener) {
            listener.running();
        }
    };

    /* renamed from: j */
    private static final ListenerCallQueue.Event<Service.Listener> f41668j;

    /* renamed from: k */
    private static final ListenerCallQueue.Event<Service.Listener> f41669k;

    /* renamed from: l */
    private static final ListenerCallQueue.Event<Service.Listener> f41670l;

    /* renamed from: m */
    private static final ListenerCallQueue.Event<Service.Listener> f41671m;

    /* renamed from: n */
    private static final ListenerCallQueue.Event<Service.Listener> f41672n;

    /* renamed from: o */
    private static final ListenerCallQueue.Event<Service.Listener> f41673o;

    /* renamed from: a */
    private final Monitor f41674a = new Monitor();

    /* renamed from: b */
    private final Monitor.Guard f41675b = new IsStartableGuard();

    /* renamed from: c */
    private final Monitor.Guard f41676c = new IsStoppableGuard();

    /* renamed from: d */
    private final Monitor.Guard f41677d = new HasReachedRunningGuard();

    /* renamed from: e */
    private final Monitor.Guard f41678e = new IsStoppedGuard();

    /* renamed from: f */
    private final ListenerCallQueue<Service.Listener> f41679f = new ListenerCallQueue<>();

    /* renamed from: g */
    private volatile StateSnapshot f41680g = new StateSnapshot(Service.State.NEW);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.util.concurrent.AbstractService$6 */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C170996 {

        /* renamed from: a */
        static final /* synthetic */ int[] f41685a;

        static {
            int[] iArr = new int[Service.State.values().length];
            f41685a = iArr;
            try {
                iArr[Service.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41685a[Service.State.STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41685a[Service.State.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41685a[Service.State.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41685a[Service.State.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41685a[Service.State.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes4.dex */
    private final class HasReachedRunningGuard extends Monitor.Guard {
        HasReachedRunningGuard() {
            super(AbstractService.this.f41674a);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            if (AbstractService.this.state().compareTo(Service.State.RUNNING) >= 0) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes4.dex */
    private final class IsStartableGuard extends Monitor.Guard {
        IsStartableGuard() {
            super(AbstractService.this.f41674a);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            if (AbstractService.this.state() == Service.State.NEW) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes4.dex */
    private final class IsStoppableGuard extends Monitor.Guard {
        IsStoppableGuard() {
            super(AbstractService.this.f41674a);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            if (AbstractService.this.state().compareTo(Service.State.RUNNING) <= 0) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes4.dex */
    private final class IsStoppedGuard extends Monitor.Guard {
        IsStoppedGuard() {
            super(AbstractService.this.f41674a);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            if (AbstractService.this.state().compareTo(Service.State.TERMINATED) >= 0) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class StateSnapshot {

        /* renamed from: a */
        final Service.State f41690a;

        /* renamed from: b */
        final boolean f41691b;

        /* renamed from: c */
        final Throwable f41692c;

        StateSnapshot(Service.State state) {
            this(state, false, null);
        }

        /* renamed from: a */
        Service.State m67719a() {
            if (this.f41691b && this.f41690a == Service.State.STARTING) {
                return Service.State.STOPPING;
            }
            return this.f41690a;
        }

        /* renamed from: b */
        Throwable m67718b() {
            boolean z;
            Service.State state = this.f41690a;
            if (state == Service.State.FAILED) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "failureCause() is only valid if the service has failed, service is %s", state);
            Throwable th = this.f41692c;
            Objects.requireNonNull(th);
            return th;
        }

        StateSnapshot(Service.State state, boolean z, Throwable th) {
            Preconditions.checkArgument(!z || state == Service.State.STARTING, "shutdownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", state);
            Preconditions.checkArgument((th != null) == (state == Service.State.FAILED), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", state, th);
            this.f41690a = state;
            this.f41691b = z;
            this.f41692c = th;
        }
    }

    static {
        Service.State state = Service.State.STARTING;
        f41668j = m67721o(state);
        Service.State state2 = Service.State.RUNNING;
        f41669k = m67721o(state2);
        f41670l = m67720p(Service.State.NEW);
        f41671m = m67720p(state);
        f41672n = m67720p(state2);
        f41673o = m67720p(Service.State.STOPPING);
    }

    @GuardedBy("monitor")
    /* renamed from: b */
    private void m67732b(Service.State state) {
        Service.State state2 = state();
        if (state2 != state) {
            if (state2 == Service.State.FAILED) {
                String valueOf = String.valueOf(this);
                String valueOf2 = String.valueOf(state);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 56 + valueOf2.length());
                sb2.append("Expected the service ");
                sb2.append(valueOf);
                sb2.append(" to be ");
                sb2.append(valueOf2);
                sb2.append(", but the service has FAILED");
                throw new IllegalStateException(sb2.toString(), failureCause());
            }
            String valueOf3 = String.valueOf(this);
            String valueOf4 = String.valueOf(state);
            String valueOf5 = String.valueOf(state2);
            StringBuilder sb3 = new StringBuilder(valueOf3.length() + 38 + valueOf4.length() + valueOf5.length());
            sb3.append("Expected the service ");
            sb3.append(valueOf3);
            sb3.append(" to be ");
            sb3.append(valueOf4);
            sb3.append(", but was ");
            sb3.append(valueOf5);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* renamed from: c */
    private void m67731c() {
        if (!this.f41674a.isOccupiedByCurrentThread()) {
            this.f41679f.dispatch();
        }
    }

    /* renamed from: g */
    private void m67729g(final Service.State state, final Throwable th) {
        this.f41679f.enqueue(new ListenerCallQueue.Event<Service.Listener>(this) { // from class: com.google.common.util.concurrent.AbstractService.5
            public String toString() {
                String valueOf = String.valueOf(state);
                String valueOf2 = String.valueOf(th);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 27 + valueOf2.length());
                sb2.append("failed({from = ");
                sb2.append(valueOf);
                sb2.append(", cause = ");
                sb2.append(valueOf2);
                sb2.append("})");
                return sb2.toString();
            }

            @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
            public void call(Service.Listener listener) {
                listener.failed(state, th);
            }
        });
    }

    /* renamed from: h */
    private void m67728h() {
        this.f41679f.enqueue(f41667i);
    }

    /* renamed from: i */
    private void m67727i() {
        this.f41679f.enqueue(f41666h);
    }

    /* renamed from: j */
    private void m67726j(Service.State state) {
        if (state == Service.State.STARTING) {
            this.f41679f.enqueue(f41668j);
        } else if (state == Service.State.RUNNING) {
            this.f41679f.enqueue(f41669k);
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: k */
    private void m67725k(Service.State state) {
        switch (C170996.f41685a[state.ordinal()]) {
            case 1:
                this.f41679f.enqueue(f41670l);
                return;
            case 2:
                this.f41679f.enqueue(f41671m);
                return;
            case 3:
                this.f41679f.enqueue(f41672n);
                return;
            case 4:
                this.f41679f.enqueue(f41673o);
                return;
            case 5:
            case 6:
                throw new AssertionError();
            default:
                return;
        }
    }

    /* renamed from: o */
    private static ListenerCallQueue.Event<Service.Listener> m67721o(final Service.State state) {
        return new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.4
            public String toString() {
                String valueOf = String.valueOf(Service.State.this);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 19);
                sb2.append("stopping({from = ");
                sb2.append(valueOf);
                sb2.append("})");
                return sb2.toString();
            }

            @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
            public void call(Service.Listener listener) {
                listener.stopping(Service.State.this);
            }
        };
    }

    /* renamed from: p */
    private static ListenerCallQueue.Event<Service.Listener> m67720p(final Service.State state) {
        return new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.3
            public String toString() {
                String valueOf = String.valueOf(Service.State.this);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 21);
                sb2.append("terminated({from = ");
                sb2.append(valueOf);
                sb2.append("})");
                return sb2.toString();
            }

            @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
            public void call(Service.Listener listener) {
                listener.terminated(Service.State.this);
            }
        };
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.f41679f.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.f41674a.enterWhenUninterruptibly(this.f41677d);
        try {
            m67732b(Service.State.RUNNING);
        } finally {
            this.f41674a.leave();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.f41674a.enterWhenUninterruptibly(this.f41678e);
        try {
            m67732b(Service.State.TERMINATED);
        } finally {
            this.f41674a.leave();
        }
    }

    @ForOverride
    /* renamed from: e */
    protected abstract void mo67505e();

    @ForOverride
    /* renamed from: f */
    protected abstract void mo67504f();

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.f41680g.m67718b();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        if (state() == Service.State.RUNNING) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final void m67724l(Throwable th) {
        Preconditions.checkNotNull(th);
        this.f41674a.enter();
        try {
            Service.State state = state();
            int i = C170996.f41685a[state.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    if (i != 5) {
                    }
                } else {
                    this.f41680g = new StateSnapshot(Service.State.FAILED, false, th);
                    m67729g(state, th);
                }
                return;
            }
            String valueOf = String.valueOf(state);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
            sb2.append("Failed while in state:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString(), th);
        } finally {
            this.f41674a.leave();
            m67731c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final void m67723m() {
        this.f41674a.enter();
        try {
            if (this.f41680g.f41690a == Service.State.STARTING) {
                if (this.f41680g.f41691b) {
                    this.f41680g = new StateSnapshot(Service.State.STOPPING);
                    mo67504f();
                } else {
                    this.f41680g = new StateSnapshot(Service.State.RUNNING);
                    m67728h();
                }
                return;
            }
            String valueOf = String.valueOf(this.f41680g.f41690a);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 43);
            sb2.append("Cannot notifyStarted() when the service is ");
            sb2.append(valueOf);
            IllegalStateException illegalStateException = new IllegalStateException(sb2.toString());
            m67724l(illegalStateException);
            throw illegalStateException;
        } finally {
            this.f41674a.leave();
            m67731c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final void m67722n() {
        this.f41674a.enter();
        try {
            Service.State state = state();
            switch (C170996.f41685a[state.ordinal()]) {
                case 1:
                case 5:
                case 6:
                    String valueOf = String.valueOf(state);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 43);
                    sb2.append("Cannot notifyStopped() when the service is ");
                    sb2.append(valueOf);
                    throw new IllegalStateException(sb2.toString());
                case 2:
                case 3:
                case 4:
                    this.f41680g = new StateSnapshot(Service.State.TERMINATED);
                    m67725k(state);
                    break;
            }
        } finally {
            this.f41674a.leave();
            m67731c();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
        if (this.f41674a.enterIf(this.f41675b)) {
            try {
                this.f41680g = new StateSnapshot(Service.State.STARTING);
                m67727i();
                mo67505e();
            } finally {
                try {
                    return this;
                } finally {
                }
            }
            return this;
        }
        String valueOf = String.valueOf(this);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 33);
        sb2.append("Service ");
        sb2.append(valueOf);
        sb2.append(" has already been started");
        throw new IllegalStateException(sb2.toString());
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.f41680g.m67719a();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() {
        if (this.f41674a.enterIf(this.f41676c)) {
            try {
                Service.State state = state();
                switch (C170996.f41685a[state.ordinal()]) {
                    case 1:
                        this.f41680g = new StateSnapshot(Service.State.TERMINATED);
                        m67725k(Service.State.NEW);
                        break;
                    case 2:
                        Service.State state2 = Service.State.STARTING;
                        this.f41680g = new StateSnapshot(state2, true, null);
                        m67726j(state2);
                        m67730d();
                        break;
                    case 3:
                        this.f41680g = new StateSnapshot(Service.State.STOPPING);
                        m67726j(Service.State.RUNNING);
                        mo67504f();
                        break;
                    case 4:
                    case 5:
                    case 6:
                        String valueOf = String.valueOf(state);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 45);
                        sb2.append("isStoppable is incorrectly implemented, saw: ");
                        sb2.append(valueOf);
                        throw new AssertionError(sb2.toString());
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        return this;
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        String valueOf = String.valueOf(state());
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 3 + valueOf.length());
        sb2.append(simpleName);
        sb2.append(" [");
        sb2.append(valueOf);
        sb2.append(C21114v8.C21123i.f54139e);
        return sb2.toString();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException {
        if (this.f41674a.enterWhenUninterruptibly(this.f41677d, j, timeUnit)) {
            try {
                m67732b(Service.State.RUNNING);
                return;
            } finally {
                this.f41674a.leave();
            }
        }
        String valueOf = String.valueOf(this);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 50);
        sb2.append("Timed out waiting for ");
        sb2.append(valueOf);
        sb2.append(" to reach the RUNNING state.");
        throw new TimeoutException(sb2.toString());
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException {
        if (this.f41674a.enterWhenUninterruptibly(this.f41678e, j, timeUnit)) {
            try {
                m67732b(Service.State.TERMINATED);
                return;
            } finally {
                this.f41674a.leave();
            }
        }
        String valueOf = String.valueOf(this);
        String valueOf2 = String.valueOf(state());
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 65 + valueOf2.length());
        sb2.append("Timed out waiting for ");
        sb2.append(valueOf);
        sb2.append(" to reach a terminal state. Current state: ");
        sb2.append(valueOf2);
        throw new TimeoutException(sb2.toString());
    }

    @Beta
    @ForOverride
    /* renamed from: d */
    protected void m67730d() {
    }
}
