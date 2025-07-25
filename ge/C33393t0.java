package ge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Emitters.kt */
@Metadata
/* renamed from: ge.t0 */
/* loaded from: classes8.dex */
public final class C33393t0 implements FlowCollector<Object> {
    @NotNull

    /* renamed from: b */
    public final Throwable f91132b;

    public C33393t0(@NotNull Throwable th) {
        this.f91132b = th;
    }

    @Override // ge.FlowCollector
    @Nullable
    public Object emit(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
        throw this.f91132b;
    }
}
