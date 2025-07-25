package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: Easing.kt */
@Immutable
@Metadata
/* loaded from: classes.dex */
public final class CubicBezierEasing implements Easing {

    /* renamed from: a */
    private final float f367a;

    /* renamed from: b */
    private final float f368b;

    /* renamed from: c */
    private final float f369c;

    /* renamed from: d */
    private final float f370d;

    public CubicBezierEasing(float f, float f2, float f3, float f4) {
        this.f367a = f;
        this.f368b = f2;
        this.f369c = f3;
        this.f370d = f4;
    }

    private final float evaluateCubic(float f, float f2, float f3) {
        float f4 = 3;
        float f5 = 1 - f3;
        return (f * f4 * f5 * f5 * f3) + (f4 * f2 * f5 * f3 * f3) + (f3 * f3 * f3);
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!(obj instanceof CubicBezierEasing)) {
            return false;
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) obj;
        if (this.f367a == cubicBezierEasing.f367a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.f368b == cubicBezierEasing.f368b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f369c == cubicBezierEasing.f369c) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (this.f370d == cubicBezierEasing.f370d) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f367a) * 31) + Float.hashCode(this.f368b)) * 31) + Float.hashCode(this.f369c)) * 31) + Float.hashCode(this.f370d);
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            float f3 = 1.0f;
            if (f < 1.0f) {
                while (true) {
                    float f4 = (f2 + f3) / 2;
                    float evaluateCubic = evaluateCubic(this.f367a, this.f369c, f4);
                    if (Math.abs(f - evaluateCubic) < 0.001f) {
                        return evaluateCubic(this.f368b, this.f370d, f4);
                    }
                    if (evaluateCubic < f) {
                        f2 = f4;
                    } else {
                        f3 = f4;
                    }
                }
            }
        }
        return f;
    }
}
