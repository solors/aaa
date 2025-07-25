package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;
import sd.C42688d;

@Metadata
/* renamed from: kotlin.coroutines.jvm.internal.a */
/* loaded from: classes7.dex */
public abstract class ContinuationImpl implements Continuation<Object>, CoroutineStackFrame, Serializable {
    @Nullable
    private final Continuation<Object> completion;

    public ContinuationImpl(@Nullable Continuation<Object> continuation) {
        this.completion = continuation;
    }

    @NotNull
    public Continuation<Unit> create(@NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<Object> continuation = this.completion;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Nullable
    public final Continuation<Object> getCompletion() {
        return this.completion;
    }

    @Nullable
    public StackTraceElement getStackTraceElement() {
        return C37590g.m17087d(this);
    }

    @Nullable
    protected abstract Object invokeSuspend(@NotNull Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@NotNull Object obj) {
        Object invokeSuspend;
        Object m6959e;
        Continuation continuation = this;
        while (true) {
            C37591h.m17085b(continuation);
            ContinuationImpl continuationImpl = (ContinuationImpl) continuation;
            Continuation continuation2 = continuationImpl.completion;
            Intrinsics.m17074g(continuation2);
            try {
                invokeSuspend = continuationImpl.invokeSuspend(obj);
                m6959e = C42688d.m6959e();
            } catch (Throwable th) {
                Result.C38506a c38506a = Result.f101870c;
                obj = Result.m14549b(C38508r.m14540a(th));
            }
            if (invokeSuspend == m6959e) {
                return;
            }
            obj = Result.m14549b(invokeSuspend);
            continuationImpl.releaseIntercepted();
            if (continuation2 instanceof ContinuationImpl) {
                continuation = continuation2;
            } else {
                continuation2.resumeWith(obj);
                return;
            }
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    @NotNull
    public Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    protected void releaseIntercepted() {
    }
}
