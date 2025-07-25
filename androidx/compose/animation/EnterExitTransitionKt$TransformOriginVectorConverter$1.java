package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.p015ui.graphics.TransformOrigin;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: EnterExitTransition.kt */
@Metadata
/* loaded from: classes.dex */
final class EnterExitTransitionKt$TransformOriginVectorConverter$1 extends Lambda implements Function1<TransformOrigin, AnimationVector2D> {
    public static final EnterExitTransitionKt$TransformOriginVectorConverter$1 INSTANCE = new EnterExitTransitionKt$TransformOriginVectorConverter$1();

    EnterExitTransitionKt$TransformOriginVectorConverter$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ AnimationVector2D invoke(TransformOrigin transformOrigin) {
        return m105963invoke__ExYCQ(transformOrigin.m107868unboximpl());
    }

    @NotNull
    /* renamed from: invoke-__ExYCQ  reason: not valid java name */
    public final AnimationVector2D m105963invoke__ExYCQ(long j) {
        return new AnimationVector2D(TransformOrigin.m107864getPivotFractionXimpl(j), TransformOrigin.m107865getPivotFractionYimpl(j));
    }
}
