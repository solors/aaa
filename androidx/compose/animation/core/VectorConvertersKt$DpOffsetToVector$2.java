package androidx.compose.animation.core;

import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.p015ui.unit.DpKt;
import androidx.compose.p015ui.unit.DpOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorConverters.kt */
@Metadata
/* loaded from: classes.dex */
final class VectorConvertersKt$DpOffsetToVector$2 extends Lambda implements Function1<AnimationVector2D, DpOffset> {
    public static final VectorConvertersKt$DpOffsetToVector$2 INSTANCE = new VectorConvertersKt$DpOffsetToVector$2();

    VectorConvertersKt$DpOffsetToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ DpOffset invoke(AnimationVector2D animationVector2D) {
        return DpOffset.m109789boximpl(m106048invokegVRvYmI(animationVector2D));
    }

    /* renamed from: invoke-gVRvYmI  reason: not valid java name */
    public final long m106048invokegVRvYmI(@NotNull AnimationVector2D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return DpKt.m109755DpOffsetYgX7TsA(C1059Dp.m109734constructorimpl(it.getV1()), C1059Dp.m109734constructorimpl(it.getV2()));
    }
}
