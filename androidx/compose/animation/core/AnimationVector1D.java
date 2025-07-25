package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnimationVectors.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class AnimationVector1D extends AnimationVectors {
    public static final int $stable = 8;
    private final int size;
    private float value;

    public AnimationVector1D(float f) {
        super(null);
        this.value = f;
        this.size = 1;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        if (!(obj instanceof AnimationVector1D)) {
            return false;
        }
        if (((AnimationVector1D) obj).value == this.value) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.animation.core.AnimationVectors
    public float get$animation_core_release(int i) {
        if (i == 0) {
            return this.value;
        }
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVectors
    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    @Override // androidx.compose.animation.core.AnimationVectors
    public void reset$animation_core_release() {
        this.value = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVectors
    public void set$animation_core_release(int i, float f) {
        if (i == 0) {
            this.value = f;
        }
    }

    public final void setValue$animation_core_release(float f) {
        this.value = f;
    }

    @NotNull
    public String toString() {
        return "AnimationVector1D: value = " + this.value;
    }

    @Override // androidx.compose.animation.core.AnimationVectors
    @NotNull
    public AnimationVector1D newVector$animation_core_release() {
        return new AnimationVector1D(0.0f);
    }
}
