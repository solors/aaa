package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: InfiniteTransition.kt */
@Metadata
/* loaded from: classes.dex */
final class InfiniteTransitionKt$animateValue$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ InfiniteRepeatableSpec<T> $animationSpec;
    final /* synthetic */ T $initialValue;
    final /* synthetic */ T $targetValue;
    final /* synthetic */ InfiniteTransition.TransitionAnimationState<T, V> $transitionAnimation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransitionKt$animateValue$1(T t, InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState, T t2, InfiniteRepeatableSpec<T> infiniteRepeatableSpec) {
        super(0);
        this.$initialValue = t;
        this.$transitionAnimation = transitionAnimationState;
        this.$targetValue = t2;
        this.$animationSpec = infiniteRepeatableSpec;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (Intrinsics.m17075f(this.$initialValue, this.$transitionAnimation.getInitialValue()) && Intrinsics.m17075f(this.$targetValue, this.$transitionAnimation.getTargetValue())) {
            return;
        }
        this.$transitionAnimation.updateValues(this.$initialValue, this.$targetValue, this.$animationSpec);
    }
}
