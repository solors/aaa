package za;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.AnyThread;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: za.j */
/* loaded from: classes8.dex */
public final class ViewPoolProfiler {
    @NotNull

    /* renamed from: a */
    private final InterfaceC45239b f118932a;
    @NotNull

    /* renamed from: b */
    private final ProfilingSession f118933b;
    @NotNull

    /* renamed from: c */
    private final RunnableC45238a f118934c;
    @NotNull

    /* renamed from: d */
    private final Handler f118935d;

    /* compiled from: ViewPoolProfiler.kt */
    @Metadata
    /* renamed from: za.j$a */
    /* loaded from: classes8.dex */
    private final class RunnableC45238a implements Runnable {

        /* renamed from: b */
        private boolean f118936b;

        public RunnableC45238a() {
        }

        /* renamed from: a */
        public final void m552a(@NotNull Handler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            if (!this.f118936b) {
                handler.post(this);
                this.f118936b = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPoolProfiler.this.m556a();
            this.f118936b = false;
        }
    }

    /* compiled from: ViewPoolProfiler.kt */
    @Metadata
    /* renamed from: za.j$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC45239b {
        @NotNull

        /* renamed from: a */
        public static final C45241b f118938a = C45241b.f118940a;
        @NotNull

        /* renamed from: b */
        public static final InterfaceC45239b f118939b = new C45240a();

        /* compiled from: ViewPoolProfiler.kt */
        @Metadata
        /* renamed from: za.j$b$a */
        /* loaded from: classes8.dex */
        public static final class C45240a implements InterfaceC45239b {
            C45240a() {
            }

            @Override // za.ViewPoolProfiler.InterfaceC45239b
            public void reportEvent(@NotNull String message, @NotNull Map<String, ? extends Object> result) {
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(result, "result");
            }
        }

        /* compiled from: ViewPoolProfiler.kt */
        @Metadata
        /* renamed from: za.j$b$b */
        /* loaded from: classes8.dex */
        public static final class C45241b {

            /* renamed from: a */
            static final /* synthetic */ C45241b f118940a = new C45241b();

            private C45241b() {
            }
        }

        void reportEvent(@NotNull String str, @NotNull Map<String, ? extends Object> map);
    }

    public ViewPoolProfiler(@NotNull InterfaceC45239b reporter) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.f118932a = reporter;
        this.f118933b = new ProfilingSession();
        this.f118934c = new RunnableC45238a();
        this.f118935d = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public final void m556a() {
        synchronized (this.f118933b) {
            if (this.f118933b.m582c()) {
                this.f118932a.reportEvent("view pool profiling", this.f118933b.m583b());
            }
            this.f118933b.m584a();
            Unit unit = Unit.f99208a;
        }
    }

    @AnyThread
    /* renamed from: b */
    public final void m555b(@NotNull String viewName, long j) {
        Intrinsics.checkNotNullParameter(viewName, "viewName");
        synchronized (this.f118933b) {
            this.f118933b.m581d(viewName, j);
            this.f118934c.m552a(this.f118935d);
            Unit unit = Unit.f99208a;
        }
    }

    @AnyThread
    /* renamed from: c */
    public final void m554c(long j) {
        synchronized (this.f118933b) {
            this.f118933b.m580e(j);
            this.f118934c.m552a(this.f118935d);
            Unit unit = Unit.f99208a;
        }
    }

    @AnyThread
    /* renamed from: d */
    public final void m553d(long j) {
        this.f118933b.m579f(j);
        this.f118934c.m552a(this.f118935d);
    }
}
