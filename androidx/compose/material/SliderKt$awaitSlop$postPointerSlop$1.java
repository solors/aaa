package androidx.compose.material;

import androidx.compose.p015ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C37605k0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Slider.kt */
@Metadata
/* loaded from: classes.dex */
final class SliderKt$awaitSlop$postPointerSlop$1 extends Lambda implements Function2<PointerInputChange, Float, Unit> {
    final /* synthetic */ C37605k0 $initialDelta;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$awaitSlop$postPointerSlop$1(C37605k0 c37605k0) {
        super(2);
        this.$initialDelta = c37605k0;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(PointerInputChange pointerInputChange, Float f) {
        invoke(pointerInputChange, f.floatValue());
        return Unit.f99208a;
    }

    public final void invoke(@NotNull PointerInputChange pointerInput, float f) {
        Intrinsics.checkNotNullParameter(pointerInput, "pointerInput");
        pointerInput.consume();
        this.$initialDelta.f99323b = f;
    }
}
