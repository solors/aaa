package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SuspendAnimation.kt */
@Metadata
/* loaded from: classes.dex */
public final class SuspendAnimationKt$animateDecay$4 extends Lambda implements Function1 {
    public static final SuspendAnimationKt$animateDecay$4 INSTANCE = new SuspendAnimationKt$animateDecay$4();

    SuspendAnimationKt$animateDecay$4() {
        super(1);
    }

    public final void invoke(@NotNull AnimationScope animationScope) {
        Intrinsics.checkNotNullParameter(animationScope, "$this$null");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnimationScope) obj);
        return Unit.f99208a;
    }
}
