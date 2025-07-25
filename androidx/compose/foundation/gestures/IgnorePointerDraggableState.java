package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.C42688d;

/* compiled from: Draggable.kt */
@Metadata
/* loaded from: classes.dex */
final class IgnorePointerDraggableState implements PointerAwareDraggableState, PointerAwareDragScope {
    @Nullable
    private DragScope latestConsumptionScope;
    @NotNull
    private final DraggableState origin;

    public IgnorePointerDraggableState(@NotNull DraggableState origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.origin = origin;
    }

    @Override // androidx.compose.foundation.gestures.PointerAwareDraggableState
    public void dispatchRawDelta(float f) {
        this.origin.dispatchRawDelta(f);
    }

    @Override // androidx.compose.foundation.gestures.PointerAwareDraggableState
    @Nullable
    public Object drag(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super PointerAwareDragScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object drag = this.origin.drag(mutatePriority, new IgnorePointerDraggableState$drag$2(this, function2, null), continuation);
        m6959e = C42688d.m6959e();
        if (drag == m6959e) {
            return drag;
        }
        return Unit.f99208a;
    }

    @Override // androidx.compose.foundation.gestures.PointerAwareDragScope
    /* renamed from: dragBy-Uv8p0NA  reason: not valid java name */
    public void mo106182dragByUv8p0NA(float f, long j) {
        DragScope dragScope = this.latestConsumptionScope;
        if (dragScope != null) {
            dragScope.dragBy(f);
        }
    }

    @Nullable
    public final DragScope getLatestConsumptionScope() {
        return this.latestConsumptionScope;
    }

    @NotNull
    public final DraggableState getOrigin() {
        return this.origin;
    }

    public final void setLatestConsumptionScope(@Nullable DragScope dragScope) {
        this.latestConsumptionScope = dragScope;
    }
}
