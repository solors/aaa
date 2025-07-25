package p704he;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChannelFlow.kt */
@Metadata
/* renamed from: he.x */
/* loaded from: classes8.dex */
final class C33537x<T> implements Continuation<T>, CoroutineStackFrame {
    @NotNull

    /* renamed from: b */
    private final Continuation<T> f91543b;
    @NotNull

    /* renamed from: c */
    private final CoroutineContext f91544c;

    /* JADX WARN: Multi-variable type inference failed */
    public C33537x(@NotNull Continuation<? super T> continuation, @NotNull CoroutineContext coroutineContext) {
        this.f91543b = continuation;
        this.f91544c = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f91543b;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.f91544c;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        this.f91543b.resumeWith(obj);
    }
}
