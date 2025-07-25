package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C37605k0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: DragGestureDetector.kt */
@Metadata
/* loaded from: classes.dex */
final class DragGestureDetectorKt$detectVerticalDragGestures$5$1$drag$1 extends Lambda implements Function2<PointerInputChange, Float, Unit> {
    final /* synthetic */ C37605k0 $overSlop;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectVerticalDragGestures$5$1$drag$1(C37605k0 c37605k0) {
        super(2);
        this.$overSlop = c37605k0;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(PointerInputChange pointerInputChange, Float f) {
        invoke(pointerInputChange, f.floatValue());
        return Unit.f99208a;
    }

    public final void invoke(@NotNull PointerInputChange change, float f) {
        Intrinsics.checkNotNullParameter(change, "change");
        change.consume();
        this.$overSlop.f99323b = f;
    }
}
