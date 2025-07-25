package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T, V] */
/* compiled from: SuspendAnimation.kt */
@Metadata
/* loaded from: classes.dex */
final class SuspendAnimationKt$animate$3<T, V> extends Lambda implements Function1<AnimationScope<T, V>, Unit> {
    final /* synthetic */ Function2<T, T, Unit> $block;
    final /* synthetic */ VectorConverters<T, V> $typeConverter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendAnimationKt$animate$3(Function2<? super T, ? super T, Unit> function2, VectorConverters<T, V> vectorConverters) {
        super(1);
        this.$block = function2;
        this.$typeConverter = vectorConverters;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((AnimationScope) ((AnimationScope) obj));
        return Unit.f99208a;
    }

    public final void invoke(@NotNull AnimationScope<T, V> animate) {
        Intrinsics.checkNotNullParameter(animate, "$this$animate");
        this.$block.mo105910invoke(animate.getValue(), this.$typeConverter.getConvertFromVector().invoke(animate.getVelocityVector()));
    }
}
