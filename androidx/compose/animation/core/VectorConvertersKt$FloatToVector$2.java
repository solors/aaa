package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorConverters.kt */
@Metadata
/* loaded from: classes.dex */
final class VectorConvertersKt$FloatToVector$2 extends Lambda implements Function1<AnimationVector1D, Float> {
    public static final VectorConvertersKt$FloatToVector$2 INSTANCE = new VectorConvertersKt$FloatToVector$2();

    VectorConvertersKt$FloatToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Float invoke(@NotNull AnimationVector1D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Float.valueOf(it.getValue());
    }
}
