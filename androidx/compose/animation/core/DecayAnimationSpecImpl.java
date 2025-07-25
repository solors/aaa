package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DecayAnimationSpec.kt */
@Metadata
/* loaded from: classes.dex */
public final class DecayAnimationSpecImpl<T> implements DecayAnimationSpec<T> {
    @NotNull
    private final FloatDecayAnimationSpec floatDecaySpec;

    public DecayAnimationSpecImpl(@NotNull FloatDecayAnimationSpec floatDecaySpec) {
        Intrinsics.checkNotNullParameter(floatDecaySpec, "floatDecaySpec");
        this.floatDecaySpec = floatDecaySpec;
    }

    @Override // androidx.compose.animation.core.DecayAnimationSpec
    @NotNull
    public <V extends AnimationVectors> VectorizedDecayAnimationSpec<V> vectorize(@NotNull VectorConverters<T, V> typeConverter) {
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        return new VectorizedFloatDecaySpec(this.floatDecaySpec);
    }
}
