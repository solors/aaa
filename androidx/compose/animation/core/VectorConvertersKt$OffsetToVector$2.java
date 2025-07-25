package androidx.compose.animation.core;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.OffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorConverters.kt */
@Metadata
/* loaded from: classes.dex */
final class VectorConvertersKt$OffsetToVector$2 extends Lambda implements Function1<AnimationVector2D, Offset> {
    public static final VectorConvertersKt$OffsetToVector$2 INSTANCE = new VectorConvertersKt$OffsetToVector$2();

    VectorConvertersKt$OffsetToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Offset invoke(AnimationVector2D animationVector2D) {
        return Offset.m107280boximpl(m106056invoketuRUvjQ(animationVector2D));
    }

    /* renamed from: invoke-tuRUvjQ  reason: not valid java name */
    public final long m106056invoketuRUvjQ(@NotNull AnimationVector2D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return OffsetKt.Offset(it.getV1(), it.getV2());
    }
}
