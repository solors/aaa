package androidx.compose.p015ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Rgb.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$Companion$DoubleIdentity$1 */
/* loaded from: classes.dex */
final class Rgb$Companion$DoubleIdentity$1 extends Lambda implements Function1<Double, Double> {
    public static final Rgb$Companion$DoubleIdentity$1 INSTANCE = new Rgb$Companion$DoubleIdentity$1();

    Rgb$Companion$DoubleIdentity$1() {
        super(1);
    }

    @NotNull
    public final Double invoke(double d) {
        return Double.valueOf(d);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Double invoke(Double d) {
        return invoke(d.doubleValue());
    }
}
