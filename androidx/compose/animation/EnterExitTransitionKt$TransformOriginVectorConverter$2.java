package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.p015ui.graphics.TransformOrigin;
import androidx.compose.p015ui.graphics.TransformOriginKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: EnterExitTransition.kt */
@Metadata
/* loaded from: classes.dex */
final class EnterExitTransitionKt$TransformOriginVectorConverter$2 extends Lambda implements Function1<AnimationVector2D, TransformOrigin> {
    public static final EnterExitTransitionKt$TransformOriginVectorConverter$2 INSTANCE = new EnterExitTransitionKt$TransformOriginVectorConverter$2();

    EnterExitTransitionKt$TransformOriginVectorConverter$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ TransformOrigin invoke(AnimationVector2D animationVector2D) {
        return TransformOrigin.m107856boximpl(m105964invokeLIALnN8(animationVector2D));
    }

    /* renamed from: invoke-LIALnN8  reason: not valid java name */
    public final long m105964invokeLIALnN8(@NotNull AnimationVector2D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return TransformOriginKt.TransformOrigin(it.getV1(), it.getV2());
    }
}
