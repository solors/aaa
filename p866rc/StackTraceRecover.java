package p866rc;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: rc.k */
/* loaded from: classes9.dex */
public final class StackTraceRecover {
    @NotNull
    /* renamed from: a */
    public static final Throwable m12539a(@NotNull Throwable exception, @NotNull Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        try {
            return StackTraceRecoverJvm.m12540a(exception, exception.getCause());
        } catch (Throwable unused) {
            return exception;
        }
    }
}
