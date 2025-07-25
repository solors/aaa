package androidx.compose.material;

import androidx.compose.runtime.State;
import de.Ranges;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C37636h;

/* compiled from: Slider.kt */
@Metadata
/* loaded from: classes.dex */
final class SliderKt$RangeSlider$2$endThumbSemantics$1$1 extends Lambda implements Function1<Float, Unit> {
    final /* synthetic */ float $coercedStart;
    final /* synthetic */ State<Function1<Ranges<Float>, Unit>> $onValueChangeState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2$endThumbSemantics$1$1(State<? extends Function1<? super Ranges<Float>, Unit>> state, float f) {
        super(1);
        this.$onValueChangeState = state;
        this.$coercedStart = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(f.floatValue());
        return Unit.f99208a;
    }

    public final void invoke(float f) {
        Ranges<Float> m16920b;
        m16920b = C37636h.m16920b(this.$coercedStart, f);
        this.$onValueChangeState.getValue().invoke(m16920b);
    }
}
