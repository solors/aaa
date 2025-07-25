package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpringEstimation.kt */
@Metadata
/* loaded from: classes.dex */
final class SpringEstimationKt$estimateCriticallyDamped$fn$1 extends Lambda implements Function1<Double, Double> {
    final /* synthetic */ double $c1;
    final /* synthetic */ double $c2;

    /* renamed from: $r */
    final /* synthetic */ double f371$r;
    final /* synthetic */ double $signedDelta;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpringEstimationKt$estimateCriticallyDamped$fn$1(double d, double d2, double d3, double d4) {
        super(1);
        this.$c1 = d;
        this.$c2 = d2;
        this.f371$r = d3;
        this.$signedDelta = d4;
    }

    @NotNull
    public final Double invoke(double d) {
        return Double.valueOf(((this.$c1 + (this.$c2 * d)) * Math.exp(this.f371$r * d)) + this.$signedDelta);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Double invoke(Double d) {
        return invoke(d.doubleValue());
    }
}
