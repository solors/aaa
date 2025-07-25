package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: SuspendAnimation.kt */
@Metadata
/* loaded from: classes.dex */
final class SuspendAnimationKt$animateDecay$2 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
    final /* synthetic */ Function2<Float, Float, Unit> $block;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendAnimationKt$animateDecay$2(Function2<? super Float, ? super Float, Unit> function2) {
        super(1);
        this.$block = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
        invoke2(animationScope);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animate) {
        Intrinsics.checkNotNullParameter(animate, "$this$animate");
        this.$block.mo105910invoke(animate.getValue(), Float.valueOf(animate.getVelocityVector().getValue()));
    }
}
