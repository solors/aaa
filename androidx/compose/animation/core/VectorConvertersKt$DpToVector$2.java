package androidx.compose.animation.core;

import androidx.compose.p015ui.unit.C1059Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorConverters.kt */
@Metadata
/* loaded from: classes.dex */
final class VectorConvertersKt$DpToVector$2 extends Lambda implements Function1<AnimationVector1D, C1059Dp> {
    public static final VectorConvertersKt$DpToVector$2 INSTANCE = new VectorConvertersKt$DpToVector$2();

    VectorConvertersKt$DpToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ C1059Dp invoke(AnimationVector1D animationVector1D) {
        return C1059Dp.m109732boximpl(m106050invokeu2uoSUM(animationVector1D));
    }

    /* renamed from: invoke-u2uoSUM  reason: not valid java name */
    public final float m106050invokeu2uoSUM(@NotNull AnimationVector1D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C1059Dp.m109734constructorimpl(it.getValue());
    }
}
