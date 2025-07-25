package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnimationVectors.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class AnimationVector3D extends AnimationVectors {
    public static final int $stable = 8;
    private final int size;

    /* renamed from: v1 */
    private float f360v1;

    /* renamed from: v2 */
    private float f361v2;

    /* renamed from: v3 */
    private float f362v3;

    public AnimationVector3D(float f, float f2, float f3) {
        super(null);
        this.f360v1 = f;
        this.f361v2 = f2;
        this.f362v3 = f3;
        this.size = 3;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!(obj instanceof AnimationVector3D)) {
            return false;
        }
        AnimationVector3D animationVector3D = (AnimationVector3D) obj;
        if (animationVector3D.f360v1 == this.f360v1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (animationVector3D.f361v2 == this.f361v2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (animationVector3D.f362v3 == this.f362v3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.animation.core.AnimationVectors
    public float get$animation_core_release(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return 0.0f;
                }
                return this.f362v3;
            }
            return this.f361v2;
        }
        return this.f360v1;
    }

    @Override // androidx.compose.animation.core.AnimationVectors
    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getV1() {
        return this.f360v1;
    }

    public final float getV2() {
        return this.f361v2;
    }

    public final float getV3() {
        return this.f362v3;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f360v1) * 31) + Float.hashCode(this.f361v2)) * 31) + Float.hashCode(this.f362v3);
    }

    @Override // androidx.compose.animation.core.AnimationVectors
    public void reset$animation_core_release() {
        this.f360v1 = 0.0f;
        this.f361v2 = 0.0f;
        this.f362v3 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVectors
    public void set$animation_core_release(int i, float f) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.f362v3 = f;
                    return;
                }
                return;
            }
            this.f361v2 = f;
            return;
        }
        this.f360v1 = f;
    }

    public final void setV1$animation_core_release(float f) {
        this.f360v1 = f;
    }

    public final void setV2$animation_core_release(float f) {
        this.f361v2 = f;
    }

    public final void setV3$animation_core_release(float f) {
        this.f362v3 = f;
    }

    @NotNull
    public String toString() {
        return "AnimationVector3D: v1 = " + this.f360v1 + ", v2 = " + this.f361v2 + ", v3 = " + this.f362v3;
    }

    @Override // androidx.compose.animation.core.AnimationVectors
    @NotNull
    public AnimationVector3D newVector$animation_core_release() {
        return new AnimationVector3D(0.0f, 0.0f, 0.0f);
    }
}
