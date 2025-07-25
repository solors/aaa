package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.C37586g;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContinuationImpl.kt */
@Metadata
/* renamed from: kotlin.coroutines.jvm.internal.j */
/* loaded from: classes7.dex */
public abstract class AbstractC37594j extends ContinuationImpl {
    public AbstractC37594j(@Nullable Continuation<Object> continuation) {
        super(continuation);
        boolean z;
        if (continuation != null) {
            if (continuation.getContext() == C37586g.f99289b) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return C37586g.f99289b;
    }
}
