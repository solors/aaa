package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpringEstimation.kt */
@Metadata
/* loaded from: classes.dex */
final class SpringEstimationKt$estimateOverDamped$fnPrime$1 extends Lambda implements Function1<Double, Double> {
    final /* synthetic */ double $c1;
    final /* synthetic */ double $c2;
    final /* synthetic */ double $r1;
    final /* synthetic */ double $r2;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpringEstimationKt$estimateOverDamped$fnPrime$1(double d, double d2, double d3, double d4) {
        super(1);
        this.$c1 = d;
        this.$r1 = d2;
        this.$c2 = d3;
        this.$r2 = d4;
    }

    @NotNull
    public final Double invoke(double d) {
        double d2 = this.$c1;
        double d3 = this.$r1;
        double exp = d2 * d3 * Math.exp(d3 * d);
        double d4 = this.$c2;
        double d5 = this.$r2;
        return Double.valueOf(exp + (d4 * d5 * Math.exp(d5 * d)));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Double invoke(Double d) {
        return invoke(d.doubleValue());
    }
}
