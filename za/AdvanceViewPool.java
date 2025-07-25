package za;

import android.view.View;
import androidx.annotation.AnyThread;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p012ab.PerformanceDependentSessionProfiler;
import p1059ya.C45080q;
import sa.C39638b;

@Metadata
/* renamed from: za.a */
/* loaded from: classes8.dex */
public final class AdvanceViewPool implements ViewPool {
    @NotNull

    /* renamed from: e */
    public static final C45229b f118892e = new C45229b(null);
    @Nullable

    /* renamed from: a */
    private final ViewPoolProfiler f118893a;
    @NotNull

    /* renamed from: b */
    private final PerformanceDependentSessionProfiler f118894b;
    @NotNull

    /* renamed from: c */
    private final ViewCreator f118895c;
    @NotNull

    /* renamed from: d */
    private final Map<String, C45227a<? extends View>> f118896d;

    /* compiled from: AdvanceViewPool.kt */
    @Metadata
    /* renamed from: za.a$a */
    /* loaded from: classes8.dex */
    public static final class C45227a<T extends View> implements ViewFactory<T> {
        @NotNull

        /* renamed from: k */
        public static final C45228a f118897k = new C45228a(null);
        @NotNull

        /* renamed from: a */
        private final String f118898a;
        @Nullable

        /* renamed from: b */
        private final ViewPoolProfiler f118899b;
        @NotNull

        /* renamed from: c */
        private final PerformanceDependentSessionProfiler f118900c;
        @NotNull

        /* renamed from: d */
        private final ViewFactory<T> f118901d;
        @NotNull

        /* renamed from: e */
        private final ViewCreator f118902e;
        @NotNull

        /* renamed from: f */
        private final BlockingQueue<T> f118903f;
        @NotNull

        /* renamed from: g */
        private AtomicInteger f118904g;
        @NotNull

        /* renamed from: h */
        private final AtomicBoolean f118905h;

        /* renamed from: i */
        private final boolean f118906i;

        /* renamed from: j */
        private volatile int f118907j;

        /* compiled from: AdvanceViewPool.kt */
        @Metadata
        /* renamed from: za.a$a$a */
        /* loaded from: classes8.dex */
        public static final class C45228a {
            private C45228a() {
            }

            public /* synthetic */ C45228a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C45227a(@NotNull String viewName, @Nullable ViewPoolProfiler viewPoolProfiler, @NotNull PerformanceDependentSessionProfiler sessionProfiler, @NotNull ViewFactory<T> viewFactory, @NotNull ViewCreator viewCreator, int i) {
            LinkedBlockingQueue linkedBlockingQueue;
            Intrinsics.checkNotNullParameter(viewName, "viewName");
            Intrinsics.checkNotNullParameter(sessionProfiler, "sessionProfiler");
            Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
            Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
            this.f118898a = viewName;
            this.f118899b = viewPoolProfiler;
            this.f118900c = sessionProfiler;
            this.f118901d = viewFactory;
            this.f118902e = viewCreator;
            this.f118903f = new LinkedBlockingQueue();
            this.f118904g = new AtomicInteger(i);
            this.f118905h = new AtomicBoolean(false);
            this.f118906i = !linkedBlockingQueue.isEmpty();
            this.f118907j = i;
            for (int i2 = 0; i2 < i; i2++) {
                this.f118902e.m567b(this, 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @AnyThread
        /* renamed from: h */
        public final T m597h() {
            try {
                this.f118902e.m568a(this);
                T poll = this.f118903f.poll(16L, TimeUnit.MILLISECONDS);
                if (poll != null) {
                    this.f118904g.decrementAndGet();
                } else {
                    poll = this.f118901d.mo560a();
                }
                return poll;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return this.f118901d.mo560a();
            }
        }

        /* renamed from: k */
        private final void m594k() {
            if (this.f118907j <= this.f118904g.get()) {
                return;
            }
            C45229b c45229b = AdvanceViewPool.f118892e;
            long nanoTime = System.nanoTime();
            this.f118902e.m567b(this, this.f118903f.size());
            this.f118904g.incrementAndGet();
            long nanoTime2 = System.nanoTime() - nanoTime;
            ViewPoolProfiler viewPoolProfiler = this.f118899b;
            if (viewPoolProfiler != null) {
                viewPoolProfiler.m553d(nanoTime2);
            }
        }

        @Override // za.ViewFactory
        @NotNull
        /* renamed from: a */
        public T mo560a() {
            return m598g();
        }

        @WorkerThread
        /* renamed from: f */
        public final void m599f() {
            if (!this.f118905h.get()) {
                try {
                    this.f118903f.offer(this.f118901d.mo560a());
                } catch (Exception unused) {
                }
            }
        }

        @AnyThread
        @NotNull
        /* renamed from: g */
        public final T m598g() {
            C45229b c45229b = AdvanceViewPool.f118892e;
            long nanoTime = System.nanoTime();
            Object poll = this.f118903f.poll();
            long nanoTime2 = System.nanoTime() - nanoTime;
            if (poll == null) {
                long nanoTime3 = System.nanoTime();
                poll = m597h();
                long nanoTime4 = System.nanoTime() - nanoTime3;
                ViewPoolProfiler viewPoolProfiler = this.f118899b;
                if (viewPoolProfiler != null) {
                    viewPoolProfiler.m555b(this.f118898a, nanoTime4);
                }
                PerformanceDependentSessionProfiler performanceDependentSessionProfiler = this.f118900c;
                this.f118903f.size();
                PerformanceDependentSessionProfiler.m105806a(performanceDependentSessionProfiler);
            } else {
                this.f118904g.decrementAndGet();
                ViewPoolProfiler viewPoolProfiler2 = this.f118899b;
                if (viewPoolProfiler2 != null) {
                    viewPoolProfiler2.m554c(nanoTime2);
                }
                PerformanceDependentSessionProfiler performanceDependentSessionProfiler2 = this.f118900c;
                this.f118903f.size();
                PerformanceDependentSessionProfiler.m105806a(performanceDependentSessionProfiler2);
            }
            m594k();
            Intrinsics.m17074g(poll);
            return (T) poll;
        }

        /* renamed from: i */
        public final boolean m596i() {
            return this.f118906i;
        }

        @NotNull
        /* renamed from: j */
        public final String m595j() {
            return this.f118898a;
        }

        /* renamed from: l */
        public final void m593l(int i) {
            this.f118907j = i;
        }
    }

    /* compiled from: AdvanceViewPool.kt */
    @Metadata
    /* renamed from: za.a$b */
    /* loaded from: classes8.dex */
    public static final class C45229b {
        private C45229b() {
        }

        public /* synthetic */ C45229b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AdvanceViewPool(@Nullable ViewPoolProfiler viewPoolProfiler, @NotNull PerformanceDependentSessionProfiler sessionProfiler, @NotNull ViewCreator viewCreator) {
        Intrinsics.checkNotNullParameter(sessionProfiler, "sessionProfiler");
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        this.f118893a = viewPoolProfiler;
        this.f118894b = sessionProfiler;
        this.f118895c = viewCreator;
        this.f118896d = new ArrayMap();
    }

    @Override // za.ViewPool
    @AnyThread
    @NotNull
    /* renamed from: a */
    public <T extends View> T mo559a(@NotNull String tag) {
        C45227a c45227a;
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.f118896d) {
            c45227a = (C45227a) C45080q.m973a(this.f118896d, tag, "Factory is not registered");
        }
        T t = (T) c45227a.mo560a();
        Intrinsics.m17073h(t, "null cannot be cast to non-null type T of com.yandex.div.internal.viewpool.AdvanceViewPool.obtain");
        return t;
    }

    @Override // za.ViewPool
    @AnyThread
    /* renamed from: b */
    public void mo558b(@NotNull String tag, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.f118896d) {
            Object m973a = C45080q.m973a(this.f118896d, tag, "Factory is not registered");
            ((C45227a) m973a).m593l(i);
            C45227a c45227a = (C45227a) m973a;
        }
    }

    @Override // za.ViewPool
    @AnyThread
    /* renamed from: c */
    public <T extends View> void mo557c(@NotNull String tag, @NotNull ViewFactory<T> factory, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(factory, "factory");
        synchronized (this.f118896d) {
            if (this.f118896d.containsKey(tag)) {
                C39638b.m12001k("Factory is already registered");
                return;
            }
            this.f118896d.put(tag, new C45227a<>(tag, this.f118893a, this.f118894b, factory, this.f118895c, i));
            Unit unit = Unit.f99208a;
        }
    }
}
