package p866rc;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: rc.l */
/* loaded from: classes9.dex */
public final class StackWalkingFailed {
    @NotNull

    /* renamed from: a */
    public static final StackWalkingFailed f103787a = new StackWalkingFailed();

    private StackWalkingFailed() {
    }

    /* renamed from: a */
    public final void m12538a() {
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.".toString());
    }
}
