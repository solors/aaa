package p1059ya;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sa.C39638b;

@Metadata
/* renamed from: ya.n */
/* loaded from: classes8.dex */
public abstract class SingleThreadExecutor {
    @NotNull

    /* renamed from: a */
    private final Executor f118557a;
    @NotNull

    /* renamed from: b */
    private final String f118558b;
    @NotNull

    /* renamed from: c */
    private final Object f118559c;
    @Nullable

    /* renamed from: d */
    private C45078a f118560d;
    @Nullable

    /* renamed from: e */
    private List<Runnable> f118561e;

    /* compiled from: SingleThreadExecutor.kt */
    @Metadata
    /* renamed from: ya.n$a */
    /* loaded from: classes8.dex */
    private final class C45078a extends NamedRunnable {
        public C45078a() {
            super(SingleThreadExecutor.this.f118558b);
        }

        @Override // p1059ya.NamedRunnable
        /* renamed from: a */
        public void mo980a() {
            Object obj = SingleThreadExecutor.this.f118559c;
            SingleThreadExecutor singleThreadExecutor = SingleThreadExecutor.this;
            synchronized (obj) {
                if (Intrinsics.m17075f(singleThreadExecutor.f118560d, this) && singleThreadExecutor.f118561e != null) {
                    List<Runnable> list = singleThreadExecutor.f118561e;
                    singleThreadExecutor.f118561e = null;
                    Unit unit = Unit.f99208a;
                    boolean z = true;
                    while (z) {
                        if (list != null) {
                            try {
                                SingleThreadExecutor singleThreadExecutor2 = SingleThreadExecutor.this;
                                for (Runnable runnable : list) {
                                    try {
                                        runnable.run();
                                    } catch (RuntimeException e) {
                                        singleThreadExecutor2.mo982h(e);
                                    }
                                }
                            } catch (Throwable th) {
                                Object obj2 = SingleThreadExecutor.this.f118559c;
                                SingleThreadExecutor singleThreadExecutor3 = SingleThreadExecutor.this;
                                synchronized (obj2) {
                                    singleThreadExecutor3.f118560d = null;
                                    Unit unit2 = Unit.f99208a;
                                    throw th;
                                }
                            }
                        }
                        Object obj3 = SingleThreadExecutor.this.f118559c;
                        SingleThreadExecutor singleThreadExecutor4 = SingleThreadExecutor.this;
                        synchronized (obj3) {
                            if (singleThreadExecutor4.f118561e != null) {
                                list = singleThreadExecutor4.f118561e;
                                singleThreadExecutor4.f118561e = null;
                            } else {
                                singleThreadExecutor4.f118560d = null;
                                z = false;
                            }
                            Unit unit3 = Unit.f99208a;
                        }
                    }
                    return;
                }
                C39638b.m12001k("We shouldn't create excessive workers");
            }
        }
    }

    public SingleThreadExecutor(@NotNull Executor executor, @NotNull String threadNameSuffix) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(threadNameSuffix, "threadNameSuffix");
        this.f118557a = executor;
        this.f118558b = threadNameSuffix;
        this.f118559c = new Object();
    }

    /* renamed from: g */
    private final void m983g(Runnable runnable) {
        if (this.f118561e == null) {
            this.f118561e = new ArrayList(2);
        }
        List<Runnable> list = this.f118561e;
        if (list != null) {
            list.add(runnable);
        }
    }

    /* renamed from: h */
    protected abstract void mo982h(@NotNull RuntimeException runtimeException);

    /* renamed from: i */
    public final void m981i(@NotNull Runnable task) {
        C45078a c45078a;
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f118559c) {
            m983g(task);
            if (this.f118560d == null) {
                c45078a = new C45078a();
                this.f118560d = c45078a;
            } else {
                c45078a = null;
            }
            Unit unit = Unit.f99208a;
        }
        if (c45078a != null) {
            this.f118557a.execute(c45078a);
        }
    }
}
