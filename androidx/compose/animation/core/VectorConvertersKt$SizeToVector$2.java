package androidx.compose.animation.core;

import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.geometry.SizeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorConverters.kt */
@Metadata
/* loaded from: classes.dex */
final class VectorConvertersKt$SizeToVector$2 extends Lambda implements Function1<AnimationVector2D, Size> {
    public static final VectorConvertersKt$SizeToVector$2 INSTANCE = new VectorConvertersKt$SizeToVector$2();

    VectorConvertersKt$SizeToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Size invoke(AnimationVector2D animationVector2D) {
        return Size.m107348boximpl(m106058invoke7Ah8Wj8(animationVector2D));
    }

    /* renamed from: invoke-7Ah8Wj8  reason: not valid java name */
    public final long m106058invoke7Ah8Wj8(@NotNull AnimationVector2D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SizeKt.Size(it.getV1(), it.getV2());
    }
}
