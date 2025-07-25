package androidx.compose.material;

import androidx.compose.runtime.SnapshotState;
import de.Ranges;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: Slider.kt */
@Metadata
/* loaded from: classes.dex */
final class SliderKt$CorrectValueSideEffect$1$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ Function1<Float, Float> $scaleToOffset;
    final /* synthetic */ Ranges<Float> $trackRange;
    final /* synthetic */ float $value;
    final /* synthetic */ Ranges<Float> $valueRange;
    final /* synthetic */ SnapshotState<Float> $valueState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$CorrectValueSideEffect$1$1(Ranges<Float> ranges, Function1<? super Float, Float> function1, float f, SnapshotState<Float> snapshotState, Ranges<Float> ranges2) {
        super(0);
        this.$valueRange = ranges;
        this.$scaleToOffset = function1;
        this.$value = f;
        this.$valueState = snapshotState;
        this.$trackRange = ranges2;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        float floatValue = (this.$valueRange.getEndInclusive().floatValue() - this.$valueRange.getStart().floatValue()) / 1000;
        float floatValue2 = this.$scaleToOffset.invoke(Float.valueOf(this.$value)).floatValue();
        if (Math.abs(floatValue2 - this.$valueState.getValue().floatValue()) <= floatValue || !this.$trackRange.contains(this.$valueState.getValue())) {
            return;
        }
        this.$valueState.setValue(Float.valueOf(floatValue2));
    }
}
