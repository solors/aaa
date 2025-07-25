package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C37605k0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Scrollable.kt */
@Metadata
/* loaded from: classes.dex */
final class DefaultFlingBehavior$performFling$2 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
    final /* synthetic */ C37605k0 $lastValue;
    final /* synthetic */ ScrollScope $this_performFling;
    final /* synthetic */ C37605k0 $velocityLeft;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(C37605k0 c37605k0, ScrollScope scrollScope, C37605k0 c37605k02) {
        super(1);
        this.$lastValue = c37605k0;
        this.$this_performFling = scrollScope;
        this.$velocityLeft = c37605k02;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
        invoke2(animationScope);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animateDecay) {
        Intrinsics.checkNotNullParameter(animateDecay, "$this$animateDecay");
        float floatValue = animateDecay.getValue().floatValue() - this.$lastValue.f99323b;
        float scrollBy = this.$this_performFling.scrollBy(floatValue);
        this.$lastValue.f99323b = animateDecay.getValue().floatValue();
        this.$velocityLeft.f99323b = animateDecay.getVelocity().floatValue();
        if (Math.abs(floatValue - scrollBy) > 0.5f) {
            animateDecay.cancelAnimation();
        }
    }
}
