package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorConverters.kt */
@Metadata
/* loaded from: classes.dex */
final class VectorConvertersKt$IntToVector$2 extends Lambda implements Function1<AnimationVector1D, Integer> {
    public static final VectorConvertersKt$IntToVector$2 INSTANCE = new VectorConvertersKt$IntToVector$2();

    VectorConvertersKt$IntToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Integer invoke(@NotNull AnimationVector1D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf((int) it.getValue());
    }
}
