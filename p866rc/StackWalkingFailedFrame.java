package p866rc;

import kotlin.Metadata;
import kotlin.coroutines.C37586g;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: rc.m */
/* loaded from: classes9.dex */
public final class StackWalkingFailedFrame implements CoroutineStackFrame, Continuation<?> {
    @NotNull

    /* renamed from: b */
    public static final StackWalkingFailedFrame f103788b = new StackWalkingFailedFrame();

    private StackWalkingFailedFrame() {
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return C37586g.f99289b;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        StackWalkingFailed.f103787a.m12538a();
    }
}
