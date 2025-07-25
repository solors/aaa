package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.Result;

@Metadata
/* renamed from: androidx.core.util.ContinuationRunnable */
/* loaded from: classes.dex */
final class Runnable extends AtomicBoolean implements java.lang.Runnable {
    @NotNull
    private final Continuation<Unit> continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Runnable(@NotNull Continuation<? super Unit> continuation) {
        super(false);
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.continuation = continuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            Continuation<Unit> continuation = this.continuation;
            Result.C38506a c38506a = Result.f101870c;
            continuation.resumeWith(Result.m14549b(Unit.f99208a));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @NotNull
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
