package androidx.compose.p015ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorSpaces.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.colorspace.ColorSpaces$ExtendedSrgb$2 */
/* loaded from: classes.dex */
final class ColorSpaces$ExtendedSrgb$2 extends Lambda implements Function1<Double, Double> {
    public static final ColorSpaces$ExtendedSrgb$2 INSTANCE = new ColorSpaces$ExtendedSrgb$2();

    ColorSpaces$ExtendedSrgb$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Double invoke(Double d) {
        return invoke(d.doubleValue());
    }

    @NotNull
    public final Double invoke(double d) {
        return Double.valueOf(ColorSpaceKt.absResponse(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d));
    }
}
