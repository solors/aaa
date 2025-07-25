package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.input.pointer.PointerInputChange;
import androidx.compose.p015ui.input.pointer.util.VelocityTracker;
import androidx.compose.p015ui.input.pointer.util.VelocityTrackerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C37605k0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Draggable.kt */
@Metadata
/* loaded from: classes.dex */
final class DraggableKt$awaitDownAndSlop$postPointerSlop$1 extends Lambda implements Function2<PointerInputChange, Float, Unit> {
    final /* synthetic */ C37605k0 $initialDelta;
    final /* synthetic */ VelocityTracker $velocityTracker;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableKt$awaitDownAndSlop$postPointerSlop$1(VelocityTracker velocityTracker, C37605k0 c37605k0) {
        super(2);
        this.$velocityTracker = velocityTracker;
        this.$initialDelta = c37605k0;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(PointerInputChange pointerInputChange, Float f) {
        invoke(pointerInputChange, f.floatValue());
        return Unit.f99208a;
    }

    public final void invoke(@NotNull PointerInputChange event, float f) {
        Intrinsics.checkNotNullParameter(event, "event");
        VelocityTrackerKt.addPointerInputChange(this.$velocityTracker, event);
        event.consume();
        this.$initialDelta.f99323b = f;
    }
}
