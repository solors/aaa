package p1059ya;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: ya.p */
/* loaded from: classes8.dex */
public final class UiThreadHandler {
    @NotNull

    /* renamed from: a */
    public static final UiThreadHandler f118564a = new UiThreadHandler();
    @NotNull

    /* renamed from: b */
    private static final Handler f118565b = new Handler(Looper.getMainLooper());

    private UiThreadHandler() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m979a(Functions functions) {
        m974f(functions);
    }

    @NotNull
    /* renamed from: b */
    public static final Handler m978b() {
        return f118565b;
    }

    /* renamed from: c */
    public static final boolean m977c() {
        return Intrinsics.m17075f(Thread.currentThread(), m976d());
    }

    @NotNull
    /* renamed from: d */
    public static final Thread m976d() {
        Thread thread = Looper.getMainLooper().getThread();
        Intrinsics.checkNotNullExpressionValue(thread, "getMainLooper().thread");
        return thread;
    }

    /* renamed from: f */
    public static final void m974f(Functions tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* renamed from: e */
    public final boolean m975e(@NotNull final Functions<Unit> runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        return f118565b.post(new Runnable() { // from class: ya.o
            @Override // java.lang.Runnable
            public final void run() {
                UiThreadHandler.m979a(Functions.this);
            }
        });
    }
}
