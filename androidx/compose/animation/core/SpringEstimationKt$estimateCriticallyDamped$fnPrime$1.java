package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpringEstimation.kt */
@Metadata
/* loaded from: classes.dex */
final class SpringEstimationKt$estimateCriticallyDamped$fnPrime$1 extends Lambda implements Function1<Double, Double> {
    final /* synthetic */ double $c1;
    final /* synthetic */ double $c2;

    /* renamed from: $r */
    final /* synthetic */ double f372$r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpringEstimationKt$estimateCriticallyDamped$fnPrime$1(double d, double d2, double d3) {
        super(1);
        this.$c2 = d;
        this.f372$r = d2;
        this.$c1 = d3;
    }

    @NotNull
    public final Double invoke(double d) {
        double d2 = this.$c2;
        double d3 = this.f372$r;
        return Double.valueOf(((d2 * ((d3 * d) + 1)) + (this.$c1 * d3)) * Math.exp(d3 * d));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Double invoke(Double d) {
        return invoke(d.doubleValue());
    }
}
