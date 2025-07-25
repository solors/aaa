package p704he;

import ge.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: he.r */
/* loaded from: classes8.dex */
public final class NopCollector implements FlowCollector<Object> {
    @NotNull

    /* renamed from: b */
    public static final NopCollector f91529b = new NopCollector();

    private NopCollector() {
    }

    @Override // ge.FlowCollector
    @Nullable
    public Object emit(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
        return Unit.f99208a;
    }
}
