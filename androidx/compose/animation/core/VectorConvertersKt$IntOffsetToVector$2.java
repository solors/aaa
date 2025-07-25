package androidx.compose.animation.core;

import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.p015ui.unit.IntOffsetKt;
import be.MathJVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorConverters.kt */
@Metadata
/* loaded from: classes.dex */
final class VectorConvertersKt$IntOffsetToVector$2 extends Lambda implements Function1<AnimationVector2D, IntOffset> {
    public static final VectorConvertersKt$IntOffsetToVector$2 INSTANCE = new VectorConvertersKt$IntOffsetToVector$2();

    VectorConvertersKt$IntOffsetToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntOffset invoke(AnimationVector2D animationVector2D) {
        return IntOffset.m109843boximpl(m106052invokeBjo55l4(animationVector2D));
    }

    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
    public final long m106052invokeBjo55l4(@NotNull AnimationVector2D it) {
        int m103791d;
        int m103791d2;
        Intrinsics.checkNotNullParameter(it, "it");
        m103791d = MathJVM.m103791d(it.getV1());
        m103791d2 = MathJVM.m103791d(it.getV2());
        return IntOffsetKt.IntOffset(m103791d, m103791d2);
    }
}
