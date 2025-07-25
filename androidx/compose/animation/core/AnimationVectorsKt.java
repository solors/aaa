package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnimationVectors.kt */
@Metadata
/* loaded from: classes.dex */
public final class AnimationVectorsKt {
    @NotNull
    public static final AnimationVector1D AnimationVector(float f) {
        return new AnimationVector1D(f);
    }

    @NotNull
    public static final <T extends AnimationVectors> T copy(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        T t2 = (T) newInstance(t);
        int size$animation_core_release = t2.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            t2.set$animation_core_release(i, t.get$animation_core_release(i));
        }
        return t2;
    }

    public static final <T extends AnimationVectors> void copyFrom(@NotNull T t, @NotNull T source) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int size$animation_core_release = t.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            t.set$animation_core_release(i, source.get$animation_core_release(i));
        }
    }

    @NotNull
    public static final <T extends AnimationVectors> T newInstance(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        return (T) t.newVector$animation_core_release();
    }

    @NotNull
    public static final AnimationVector2D AnimationVector(float f, float f2) {
        return new AnimationVector2D(f, f2);
    }

    @NotNull
    public static final AnimationVector3D AnimationVector(float f, float f2, float f3) {
        return new AnimationVector3D(f, f2, f3);
    }

    @NotNull
    public static final AnimationVector4D AnimationVector(float f, float f2, float f3, float f4) {
        return new AnimationVector4D(f, f2, f3, f4);
    }
}
