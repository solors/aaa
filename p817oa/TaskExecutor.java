package p817oa;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: oa.e */
/* loaded from: classes8.dex */
public final class TaskExecutor implements InterfaceC39137u {
    @NotNull

    /* renamed from: a */
    private final Handler f102750a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public static /* synthetic */ void m13907b(Functions functions) {
        m13906c(functions);
    }

    /* renamed from: c */
    public static final void m13906c(Functions tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @Override // p817oa.InterfaceC39137u
    /* renamed from: a */
    public void mo13849a(@NotNull final Functions<Unit> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (Intrinsics.m17075f(Looper.myLooper(), Looper.getMainLooper())) {
            task.invoke();
        } else {
            this.f102750a.post(new Runnable() { // from class: oa.d
                @Override // java.lang.Runnable
                public final void run() {
                    TaskExecutor.m13907b(Functions.this);
                }
            });
        }
    }
}
