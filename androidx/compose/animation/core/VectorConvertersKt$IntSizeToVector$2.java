package androidx.compose.animation.core;

import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.p015ui.unit.IntSizeKt;
import be.MathJVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorConverters.kt */
@Metadata
/* loaded from: classes.dex */
final class VectorConvertersKt$IntSizeToVector$2 extends Lambda implements Function1<AnimationVector2D, IntSize> {
    public static final VectorConvertersKt$IntSizeToVector$2 INSTANCE = new VectorConvertersKt$IntSizeToVector$2();

    VectorConvertersKt$IntSizeToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntSize invoke(AnimationVector2D animationVector2D) {
        return IntSize.m109886boximpl(m106054invokeYEO4UFw(animationVector2D));
    }

    /* renamed from: invoke-YEO4UFw  reason: not valid java name */
    public final long m106054invokeYEO4UFw(@NotNull AnimationVector2D it) {
        int m103791d;
        int m103791d2;
        Intrinsics.checkNotNullParameter(it, "it");
        m103791d = MathJVM.m103791d(it.getV1());
        m103791d2 = MathJVM.m103791d(it.getV2());
        return IntSizeKt.IntSize(m103791d, m103791d2);
    }
}
