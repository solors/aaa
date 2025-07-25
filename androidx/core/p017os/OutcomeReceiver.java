package androidx.core.p017os;

import androidx.annotation.RequiresApi;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38508r;
import p804nd.Result;

@RequiresApi(31)
@Metadata
/* renamed from: androidx.core.os.ContinuationOutcomeReceiver */
/* loaded from: classes.dex */
final class OutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements android.os.OutcomeReceiver<R, E> {
    @NotNull
    private final Continuation<R> continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OutcomeReceiver(@NotNull Continuation<? super R> continuation) {
        super(false);
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.continuation = continuation;
    }

    @Override // android.os.OutcomeReceiver
    public void onError(@NotNull E error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (compareAndSet(false, true)) {
            Continuation<R> continuation = this.continuation;
            Result.C38506a c38506a = Result.f101870c;
            continuation.resumeWith(Result.m14549b(C38508r.m14540a(error)));
        }
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(R r) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(Result.m14549b(r));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @NotNull
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
