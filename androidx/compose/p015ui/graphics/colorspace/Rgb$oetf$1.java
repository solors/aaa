package androidx.compose.p015ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Rgb.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1 */
/* loaded from: classes.dex */
public final class Rgb$oetf$1 extends Lambda implements Function1<Double, Double> {
    final /* synthetic */ Rgb this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb$oetf$1(Rgb rgb) {
        super(1);
        this.this$0 = rgb;
    }

    @NotNull
    public final Double invoke(double d) {
        float f;
        float f2;
        double m16910l;
        double doubleValue = this.this$0.getOetfOrig$ui_graphics_release().invoke(Double.valueOf(d)).doubleValue();
        f = this.this$0.min;
        double d2 = f;
        f2 = this.this$0.max;
        m16910l = _Ranges.m16910l(doubleValue, d2, f2);
        return Double.valueOf(m16910l);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Double invoke(Double d) {
        return invoke(d.doubleValue());
    }
}
