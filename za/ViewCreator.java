package za;

import android.os.Process;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.InterfaceC37618e;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1059ya.C45080q;
import p817oa.CpuUsageHistogramReporter;
import p864ra.Cancelable;
import za.AdvanceViewPool;

@Metadata
/* renamed from: za.g */
/* loaded from: classes8.dex */
public final class ViewCreator {
    @NotNull

    /* renamed from: b */
    private static final C45235a f118923b = new C45235a(null);
    @NotNull

    /* renamed from: a */
    private final C45237c f118924a;

    /* compiled from: ViewCreator.kt */
    @Metadata
    /* renamed from: za.g$a */
    /* loaded from: classes8.dex */
    private static final class C45235a {
        private C45235a() {
        }

        public /* synthetic */ C45235a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewCreator.kt */
    @Metadata
    /* renamed from: za.g$b */
    /* loaded from: classes8.dex */
    public static final class RunnableC45236b implements Runnable, Comparable<RunnableC45236b> {

        /* renamed from: f */
        static final /* synthetic */ KProperty<Object>[] f118925f = {Reflection.m17036h(new PropertyReference1Impl(RunnableC45236b.class, "channelRef", "getChannelRef()Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;", 0))};

        /* renamed from: b */
        private final int f118926b;
        @NotNull

        /* renamed from: c */
        private final String f118927c;
        @NotNull

        /* renamed from: d */
        private final InterfaceC37618e f118928d;

        public RunnableC45236b(@NotNull AdvanceViewPool.C45227a<?> channel, int i) {
            Intrinsics.checkNotNullParameter(channel, "channel");
            this.f118926b = i;
            this.f118927c = channel.m595j();
            this.f118928d = C45080q.m971c(channel);
        }

        /* renamed from: c */
        private final AdvanceViewPool.C45227a<?> m565c() {
            return (AdvanceViewPool.C45227a) this.f118928d.getValue(this, f118925f[0]);
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(@NotNull RunnableC45236b other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i = this.f118926b - other.f118926b;
            if (i != 0) {
                return i;
            }
            return !Intrinsics.m17075f(this.f118927c, other.f118927c) ? 1 : 0;
        }

        @NotNull
        /* renamed from: d */
        public final String m564d() {
            return this.f118927c;
        }

        public boolean equals(@Nullable Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.m17075f(RunnableC45236b.class, cls)) {
                return false;
            }
            Intrinsics.m17073h(obj, "null cannot be cast to non-null type com.yandex.div.internal.viewpool.ViewCreator.CreateViewTask");
            RunnableC45236b runnableC45236b = (RunnableC45236b) obj;
            if (Intrinsics.m17075f(this.f118927c, runnableC45236b.f118927c) && this.f118926b == runnableC45236b.f118926b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((6913 + this.f118926b) * 31) + this.f118927c.hashCode();
        }

        @Override // java.lang.Runnable
        public void run() {
            AdvanceViewPool.C45227a<?> m565c = m565c();
            if (m565c != null) {
                m565c.m599f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewCreator.kt */
    @Metadata
    /* renamed from: za.g$c */
    /* loaded from: classes8.dex */
    public static final class C45237c extends Thread {
        @NotNull

        /* renamed from: b */
        private final CpuUsageHistogramReporter f118929b;
        @NotNull

        /* renamed from: c */
        private final BatchBlockingQueue<RunnableC45236b> f118930c;
        @Nullable

        /* renamed from: d */
        private volatile String f118931d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45237c(@NotNull String name, @NotNull CpuUsageHistogramReporter cpuUsageHistogramReporter) {
            super(name);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(cpuUsageHistogramReporter, "cpuUsageHistogramReporter");
            this.f118929b = cpuUsageHistogramReporter;
            this.f118930c = new BatchBlockingQueue<>(new PriorityQueue(32));
            setPriority(5);
        }

        /* renamed from: a */
        private final void m563a() throws InterruptedException {
            RunnableC45236b poll = this.f118930c.poll();
            if (poll == null) {
                try {
                    setPriority(3);
                    poll = this.f118930c.take();
                    setPriority(5);
                    Intrinsics.checkNotNullExpressionValue(poll, "run {\n                //…          }\n            }");
                } catch (Throwable th) {
                    setPriority(5);
                    throw th;
                }
            }
            this.f118931d = poll.m564d();
            poll.run();
            this.f118931d = null;
        }

        @Nullable
        /* renamed from: b */
        public final String m562b() {
            return this.f118931d;
        }

        @NotNull
        /* renamed from: c */
        public final BatchBlockingQueue<RunnableC45236b> m561c() {
            return this.f118930c;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Cancelable mo13910a = this.f118929b.mo13910a("Div.ViewPool.CPU", Process.myTid());
            while (true) {
                try {
                    try {
                        m563a();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        mo13910a.cancel();
                        return;
                    }
                } catch (Throwable th) {
                    mo13910a.cancel();
                    throw th;
                }
            }
        }
    }

    public ViewCreator(@NotNull CpuUsageHistogramReporter cpuUsageHistogramReporter) {
        Intrinsics.checkNotNullParameter(cpuUsageHistogramReporter, "cpuUsageHistogramReporter");
        C45237c c45237c = new C45237c("ViewPoolThread", cpuUsageHistogramReporter);
        this.f118924a = c45237c;
        c45237c.start();
    }

    /* renamed from: a */
    public final void m568a(@NotNull AdvanceViewPool.C45227a<?> channel) {
        Queue queue;
        Intrinsics.checkNotNullParameter(channel, "channel");
        if (!Intrinsics.m17075f(channel.m595j(), this.f118924a.m562b()) && !channel.m596i()) {
            BatchBlockingQueue<RunnableC45236b> m561c = this.f118924a.m561c();
            ((BatchBlockingQueue) m561c).f118909c.lock();
            try {
                if (!Intrinsics.m17075f(channel.m595j(), this.f118924a.m562b()) && !channel.m596i()) {
                    BatchBlockingQueue<RunnableC45236b> m561c2 = this.f118924a.m561c();
                    ((BatchBlockingQueue) m561c2).f118909c.lock();
                    queue = ((BatchBlockingQueue) m561c2).f118908b;
                    Iterator it = queue.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (Intrinsics.m17075f(((RunnableC45236b) it.next()).m564d(), channel.m595j())) {
                            it.remove();
                            break;
                        }
                    }
                    ((BatchBlockingQueue) m561c2).f118909c.unlock();
                    this.f118924a.m561c().offer(new RunnableC45236b(channel, -1));
                    Unit unit = Unit.f99208a;
                }
            } finally {
                ((BatchBlockingQueue) m561c).f118909c.unlock();
            }
        }
    }

    /* renamed from: b */
    public final void m567b(@NotNull AdvanceViewPool.C45227a<?> channel, int i) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f118924a.m561c().offer(new RunnableC45236b(channel, i));
    }
}
