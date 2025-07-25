package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorConverters.kt */
@Metadata
/* loaded from: classes.dex */
final class VectorConvertersKt$FloatToVector$1 extends Lambda implements Function1<Float, AnimationVector1D> {
    public static final VectorConvertersKt$FloatToVector$1 INSTANCE = new VectorConvertersKt$FloatToVector$1();

    VectorConvertersKt$FloatToVector$1() {
        super(1);
    }

    @NotNull
    public final AnimationVector1D invoke(float f) {
        return new AnimationVector1D(f);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ AnimationVector1D invoke(Float f) {
        return invoke(f.floatValue());
    }
}
