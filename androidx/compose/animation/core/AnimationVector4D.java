package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnimationVectors.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class AnimationVector4D extends AnimationVectors {
    public static final int $stable = 8;
    private final int size;

    /* renamed from: v1 */
    private float f363v1;

    /* renamed from: v2 */
    private float f364v2;

    /* renamed from: v3 */
    private float f365v3;

    /* renamed from: v4 */
    private float f366v4;

    public AnimationVector4D(float f, float f2, float f3, float f4) {
        super(null);
        this.f363v1 = f;
        this.f364v2 = f2;
        this.f365v3 = f3;
        this.f366v4 = f4;
        this.size = 4;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!(obj instanceof AnimationVector4D)) {
            return false;
        }
        AnimationVector4D animationVector4D = (AnimationVector4D) obj;
        if (animationVector4D.f363v1 == this.f363v1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (animationVector4D.f364v2 == this.f364v2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (animationVector4D.f365v3 == this.f365v3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (animationVector4D.f366v4 == this.f366v4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.animation.core.AnimationVectors
    public float get$animation_core_release(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return 0.0f;
                    }
                    return this.f366v4;
                }
                return this.f365v3;
            }
            return this.f364v2;
        }
        return this.f363v1;
    }

    @Override // androidx.compose.animation.core.AnimationVectors
    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getV1() {
        return this.f363v1;
    }

    public final float getV2() {
        return this.f364v2;
    }

    public final float getV3() {
        return this.f365v3;
    }

    public final float getV4() {
        return this.f366v4;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f363v1) * 31) + Float.hashCode(this.f364v2)) * 31) + Float.hashCode(this.f365v3)) * 31) + Float.hashCode(this.f366v4);
    }

    @Override // androidx.compose.animation.core.AnimationVectors
    public void reset$animation_core_release() {
        this.f363v1 = 0.0f;
        this.f364v2 = 0.0f;
        this.f365v3 = 0.0f;
        this.f366v4 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVectors
    public void set$animation_core_release(int i, float f) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.f366v4 = f;
                        return;
                    }
                    return;
                }
                this.f365v3 = f;
                return;
            }
            this.f364v2 = f;
            return;
        }
        this.f363v1 = f;
    }

    public final void setV1$animation_core_release(float f) {
        this.f363v1 = f;
    }

    public final void setV2$animation_core_release(float f) {
        this.f364v2 = f;
    }

    public final void setV3$animation_core_release(float f) {
        this.f365v3 = f;
    }

    public final void setV4$animation_core_release(float f) {
        this.f366v4 = f;
    }

    @NotNull
    public String toString() {
        return "AnimationVector4D: v1 = " + this.f363v1 + ", v2 = " + this.f364v2 + ", v3 = " + this.f365v3 + ", v4 = " + this.f366v4;
    }

    @Override // androidx.compose.animation.core.AnimationVectors
    @NotNull
    public AnimationVector4D newVector$animation_core_release() {
        return new AnimationVector4D(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
