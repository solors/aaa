package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnimationVectors.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class AnimationVector2D extends AnimationVectors {
    public static final int $stable = 8;
    private final int size;

    /* renamed from: v1 */
    private float f358v1;

    /* renamed from: v2 */
    private float f359v2;

    public AnimationVector2D(float f, float f2) {
        super(null);
        this.f358v1 = f;
        this.f359v2 = f2;
        this.size = 2;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof AnimationVector2D)) {
            return false;
        }
        AnimationVector2D animationVector2D = (AnimationVector2D) obj;
        if (animationVector2D.f358v1 == this.f358v1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (animationVector2D.f359v2 == this.f359v2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.animation.core.AnimationVectors
    public float get$animation_core_release(int i) {
        if (i != 0) {
            if (i != 1) {
                return 0.0f;
            }
            return this.f359v2;
        }
        return this.f358v1;
    }

    @Override // androidx.compose.animation.core.AnimationVectors
    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getV1() {
        return this.f358v1;
    }

    public final float getV2() {
        return this.f359v2;
    }

    public int hashCode() {
        return (Float.hashCode(this.f358v1) * 31) + Float.hashCode(this.f359v2);
    }

    @Override // androidx.compose.animation.core.AnimationVectors
    public void reset$animation_core_release() {
        this.f358v1 = 0.0f;
        this.f359v2 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVectors
    public void set$animation_core_release(int i, float f) {
        if (i != 0) {
            if (i == 1) {
                this.f359v2 = f;
                return;
            }
            return;
        }
        this.f358v1 = f;
    }

    public final void setV1$animation_core_release(float f) {
        this.f358v1 = f;
    }

    public final void setV2$animation_core_release(float f) {
        this.f359v2 = f;
    }

    @NotNull
    public String toString() {
        return "AnimationVector2D: v1 = " + this.f358v1 + ", v2 = " + this.f359v2;
    }

    @Override // androidx.compose.animation.core.AnimationVectors
    @NotNull
    public AnimationVector2D newVector$animation_core_release() {
        return new AnimationVector2D(0.0f, 0.0f);
    }
}
