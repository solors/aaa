package androidx.compose.p015ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WhitePoint.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.colorspace.WhitePoint */
/* loaded from: classes.dex */
public final class WhitePoint {

    /* renamed from: x */
    private final float f421x;

    /* renamed from: y */
    private final float f422y;

    public WhitePoint(float f, float f2) {
        this.f421x = f;
        this.f422y = f2;
    }

    public static /* synthetic */ WhitePoint copy$default(WhitePoint whitePoint, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = whitePoint.f421x;
        }
        if ((i & 2) != 0) {
            f2 = whitePoint.f422y;
        }
        return whitePoint.copy(f, f2);
    }

    public final float component1() {
        return this.f421x;
    }

    public final float component2() {
        return this.f422y;
    }

    @NotNull
    public final WhitePoint copy(float f, float f2) {
        return new WhitePoint(f, f2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhitePoint)) {
            return false;
        }
        WhitePoint whitePoint = (WhitePoint) obj;
        if (Intrinsics.m17075f(Float.valueOf(this.f421x), Float.valueOf(whitePoint.f421x)) && Intrinsics.m17075f(Float.valueOf(this.f422y), Float.valueOf(whitePoint.f422y))) {
            return true;
        }
        return false;
    }

    public final float getX() {
        return this.f421x;
    }

    public final float getY() {
        return this.f422y;
    }

    public int hashCode() {
        return (Float.hashCode(this.f421x) * 31) + Float.hashCode(this.f422y);
    }

    @NotNull
    public String toString() {
        return "WhitePoint(x=" + this.f421x + ", y=" + this.f422y + ')';
    }

    @NotNull
    public final float[] toXyz$ui_graphics_release() {
        float f = this.f421x;
        float f2 = this.f422y;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public WhitePoint(float f, float f2, float f3) {
        this(f, f2, f3, f + f2 + f3);
    }

    private WhitePoint(float f, float f2, float f3, float f4) {
        this(f / f4, f2 / f4);
    }
}
