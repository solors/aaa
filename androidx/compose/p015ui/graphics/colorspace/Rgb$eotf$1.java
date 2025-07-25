package androidx.compose.p015ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Rgb.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1 */
/* loaded from: classes.dex */
public final class Rgb$eotf$1 extends Lambda implements Function1<Double, Double> {
    final /* synthetic */ Rgb this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb$eotf$1(Rgb rgb) {
        super(1);
        this.this$0 = rgb;
    }

    @NotNull
    public final Double invoke(double d) {
        float f;
        float f2;
        double m16910l;
        Function1<Double, Double> eotfOrig$ui_graphics_release = this.this$0.getEotfOrig$ui_graphics_release();
        f = this.this$0.min;
        double d2 = f;
        f2 = this.this$0.max;
        m16910l = _Ranges.m16910l(d, d2, f2);
        return eotfOrig$ui_graphics_release.invoke(Double.valueOf(m16910l));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Double invoke(Double d) {
        return invoke(d.doubleValue());
    }
}
