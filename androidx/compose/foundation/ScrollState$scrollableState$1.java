package androidx.compose.foundation;

import be.MathJVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scroll.kt */
@Metadata
/* loaded from: classes.dex */
public final class ScrollState$scrollableState$1 extends Lambda implements Function1<Float, Float> {
    final /* synthetic */ ScrollState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollState$scrollableState$1(ScrollState scrollState) {
        super(1);
        this.this$0 = scrollState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Float invoke(Float f) {
        return invoke(f.floatValue());
    }

    @NotNull
    public final Float invoke(float f) {
        float f2;
        float m16909m;
        int m103791d;
        f2 = this.this$0.accumulator;
        float value = this.this$0.getValue() + f + f2;
        m16909m = _Ranges.m16909m(value, 0.0f, this.this$0.getMaxValue());
        boolean z = !(value == m16909m);
        float value2 = m16909m - this.this$0.getValue();
        m103791d = MathJVM.m103791d(value2);
        ScrollState scrollState = this.this$0;
        scrollState.setValue(scrollState.getValue() + m103791d);
        this.this$0.accumulator = value2 - m103791d;
        if (z) {
            f = value2;
        }
        return Float.valueOf(f);
    }
}
