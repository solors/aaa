package androidx.compose.p015ui.geometry;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RoundRect.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.geometry.RoundRect */
/* loaded from: classes.dex */
public final class RoundRect {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final RoundRect Zero = RoundRectKt.m107345RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.Companion.m107276getZerokKHJgLs());
    @Nullable
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, j, j2, j3, j4);
    }

    /* renamed from: copy-MDFrsts$default  reason: not valid java name */
    public static /* synthetic */ RoundRect m107332copyMDFrsts$default(RoundRect roundRect, float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, int i, Object obj) {
        float f5;
        float f6;
        float f7;
        float f8;
        long j5;
        long j6;
        long j7;
        long j8;
        if ((i & 1) != 0) {
            f5 = roundRect.left;
        } else {
            f5 = f;
        }
        if ((i & 2) != 0) {
            f6 = roundRect.top;
        } else {
            f6 = f2;
        }
        if ((i & 4) != 0) {
            f7 = roundRect.right;
        } else {
            f7 = f3;
        }
        if ((i & 8) != 0) {
            f8 = roundRect.bottom;
        } else {
            f8 = f4;
        }
        if ((i & 16) != 0) {
            j5 = roundRect.topLeftCornerRadius;
        } else {
            j5 = j;
        }
        if ((i & 32) != 0) {
            j6 = roundRect.topRightCornerRadius;
        } else {
            j6 = j2;
        }
        if ((i & 64) != 0) {
            j7 = roundRect.bottomRightCornerRadius;
        } else {
            j7 = j3;
        }
        if ((i & 128) != 0) {
            j8 = roundRect.bottomLeftCornerRadius;
        } else {
            j8 = j4;
        }
        return roundRect.m107338copyMDFrsts(f5, f6, f7, f8, j5, j6, j7, j8);
    }

    @NotNull
    public static final RoundRect getZero() {
        return Companion.getZero();
    }

    private final float minRadius(float f, float f2, float f3, float f4) {
        boolean z;
        float f5 = f2 + f3;
        if (f5 > f4) {
            if (f5 == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return Math.min(f, f4 / f5);
            }
            return f;
        }
        return f;
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect == null) {
            float minRadius = minRadius(minRadius(minRadius(minRadius(1.0f, CornerRadius.m107267getYimpl(this.bottomLeftCornerRadius), CornerRadius.m107267getYimpl(this.topLeftCornerRadius), getHeight()), CornerRadius.m107266getXimpl(this.topLeftCornerRadius), CornerRadius.m107266getXimpl(this.topRightCornerRadius), getWidth()), CornerRadius.m107267getYimpl(this.topRightCornerRadius), CornerRadius.m107267getYimpl(this.bottomRightCornerRadius), getHeight()), CornerRadius.m107266getXimpl(this.bottomRightCornerRadius), CornerRadius.m107266getXimpl(this.bottomLeftCornerRadius), getWidth());
            RoundRect roundRect2 = new RoundRect(this.left * minRadius, this.top * minRadius, this.right * minRadius, this.bottom * minRadius, CornerRadiusKt.CornerRadius(CornerRadius.m107266getXimpl(this.topLeftCornerRadius) * minRadius, CornerRadius.m107267getYimpl(this.topLeftCornerRadius) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m107266getXimpl(this.topRightCornerRadius) * minRadius, CornerRadius.m107267getYimpl(this.topRightCornerRadius) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m107266getXimpl(this.bottomRightCornerRadius) * minRadius, CornerRadius.m107267getYimpl(this.bottomRightCornerRadius) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m107266getXimpl(this.bottomLeftCornerRadius) * minRadius, CornerRadius.m107267getYimpl(this.bottomLeftCornerRadius) * minRadius), null);
            this._scaledRadiiRect = roundRect2;
            return roundRect2;
        }
        return roundRect;
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.top;
    }

    public final float component3() {
        return this.right;
    }

    public final float component4() {
        return this.bottom;
    }

    /* renamed from: component5-kKHJgLs  reason: not valid java name */
    public final long m107333component5kKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: component6-kKHJgLs  reason: not valid java name */
    public final long m107334component6kKHJgLs() {
        return this.topRightCornerRadius;
    }

    /* renamed from: component7-kKHJgLs  reason: not valid java name */
    public final long m107335component7kKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    /* renamed from: component8-kKHJgLs  reason: not valid java name */
    public final long m107336component8kKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: contains-k-4lQ0M  reason: not valid java name */
    public final boolean m107337containsk4lQ0M(long j) {
        float m107291getXimpl;
        float m107292getYimpl;
        float m107266getXimpl;
        float m107267getYimpl;
        if (Offset.m107291getXimpl(j) < this.left || Offset.m107291getXimpl(j) >= this.right || Offset.m107292getYimpl(j) < this.top || Offset.m107292getYimpl(j) >= this.bottom) {
            return false;
        }
        RoundRect scaledRadiiRect = scaledRadiiRect();
        if (Offset.m107291getXimpl(j) < this.left + CornerRadius.m107266getXimpl(scaledRadiiRect.topLeftCornerRadius) && Offset.m107292getYimpl(j) < this.top + CornerRadius.m107267getYimpl(scaledRadiiRect.topLeftCornerRadius)) {
            m107291getXimpl = (Offset.m107291getXimpl(j) - this.left) - CornerRadius.m107266getXimpl(scaledRadiiRect.topLeftCornerRadius);
            m107292getYimpl = (Offset.m107292getYimpl(j) - this.top) - CornerRadius.m107267getYimpl(scaledRadiiRect.topLeftCornerRadius);
            m107266getXimpl = CornerRadius.m107266getXimpl(scaledRadiiRect.topLeftCornerRadius);
            m107267getYimpl = CornerRadius.m107267getYimpl(scaledRadiiRect.topLeftCornerRadius);
        } else if (Offset.m107291getXimpl(j) > this.right - CornerRadius.m107266getXimpl(scaledRadiiRect.topRightCornerRadius) && Offset.m107292getYimpl(j) < this.top + CornerRadius.m107267getYimpl(scaledRadiiRect.topRightCornerRadius)) {
            m107291getXimpl = (Offset.m107291getXimpl(j) - this.right) + CornerRadius.m107266getXimpl(scaledRadiiRect.topRightCornerRadius);
            m107292getYimpl = (Offset.m107292getYimpl(j) - this.top) - CornerRadius.m107267getYimpl(scaledRadiiRect.topRightCornerRadius);
            m107266getXimpl = CornerRadius.m107266getXimpl(scaledRadiiRect.topRightCornerRadius);
            m107267getYimpl = CornerRadius.m107267getYimpl(scaledRadiiRect.topRightCornerRadius);
        } else if (Offset.m107291getXimpl(j) > this.right - CornerRadius.m107266getXimpl(scaledRadiiRect.bottomRightCornerRadius) && Offset.m107292getYimpl(j) > this.bottom - CornerRadius.m107267getYimpl(scaledRadiiRect.bottomRightCornerRadius)) {
            m107291getXimpl = (Offset.m107291getXimpl(j) - this.right) + CornerRadius.m107266getXimpl(scaledRadiiRect.bottomRightCornerRadius);
            m107292getYimpl = (Offset.m107292getYimpl(j) - this.bottom) + CornerRadius.m107267getYimpl(scaledRadiiRect.bottomRightCornerRadius);
            m107266getXimpl = CornerRadius.m107266getXimpl(scaledRadiiRect.bottomRightCornerRadius);
            m107267getYimpl = CornerRadius.m107267getYimpl(scaledRadiiRect.bottomRightCornerRadius);
        } else if (Offset.m107291getXimpl(j) >= this.left + CornerRadius.m107266getXimpl(scaledRadiiRect.bottomLeftCornerRadius) || Offset.m107292getYimpl(j) <= this.bottom - CornerRadius.m107267getYimpl(scaledRadiiRect.bottomLeftCornerRadius)) {
            return true;
        } else {
            m107291getXimpl = (Offset.m107291getXimpl(j) - this.left) - CornerRadius.m107266getXimpl(scaledRadiiRect.bottomLeftCornerRadius);
            m107292getYimpl = (Offset.m107292getYimpl(j) - this.bottom) + CornerRadius.m107267getYimpl(scaledRadiiRect.bottomLeftCornerRadius);
            m107266getXimpl = CornerRadius.m107266getXimpl(scaledRadiiRect.bottomLeftCornerRadius);
            m107267getYimpl = CornerRadius.m107267getYimpl(scaledRadiiRect.bottomLeftCornerRadius);
        }
        float f = m107291getXimpl / m107266getXimpl;
        float f2 = m107292getYimpl / m107267getYimpl;
        if ((f * f) + (f2 * f2) > 1.0f) {
            return false;
        }
        return true;
    }

    @NotNull
    /* renamed from: copy-MDFrsts  reason: not valid java name */
    public final RoundRect m107338copyMDFrsts(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        return new RoundRect(f, f2, f3, f4, j, j2, j3, j4, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) obj;
        if (Intrinsics.m17075f(Float.valueOf(this.left), Float.valueOf(roundRect.left)) && Intrinsics.m17075f(Float.valueOf(this.top), Float.valueOf(roundRect.top)) && Intrinsics.m17075f(Float.valueOf(this.right), Float.valueOf(roundRect.right)) && Intrinsics.m17075f(Float.valueOf(this.bottom), Float.valueOf(roundRect.bottom)) && CornerRadius.m107265equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m107265equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m107265equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m107265equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius)) {
            return true;
        }
        return false;
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomLeftCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m107339getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: getBottomRightCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m107340getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopLeftCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m107341getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: getTopRightCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m107342getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom)) * 31) + CornerRadius.m107268hashCodeimpl(this.topLeftCornerRadius)) * 31) + CornerRadius.m107268hashCodeimpl(this.topRightCornerRadius)) * 31) + CornerRadius.m107268hashCodeimpl(this.bottomRightCornerRadius)) * 31) + CornerRadius.m107268hashCodeimpl(this.bottomLeftCornerRadius);
    }

    @NotNull
    public String toString() {
        boolean z;
        long j = this.topLeftCornerRadius;
        long j2 = this.topRightCornerRadius;
        long j3 = this.bottomRightCornerRadius;
        long j4 = this.bottomLeftCornerRadius;
        String str = GeometryUtils.toStringAsFixed(this.left, 1) + ", " + GeometryUtils.toStringAsFixed(this.top, 1) + ", " + GeometryUtils.toStringAsFixed(this.right, 1) + ", " + GeometryUtils.toStringAsFixed(this.bottom, 1);
        if (CornerRadius.m107265equalsimpl0(j, j2) && CornerRadius.m107265equalsimpl0(j2, j3) && CornerRadius.m107265equalsimpl0(j3, j4)) {
            if (CornerRadius.m107266getXimpl(j) == CornerRadius.m107267getYimpl(j)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "RoundRect(rect=" + str + ", radius=" + GeometryUtils.toStringAsFixed(CornerRadius.m107266getXimpl(j), 1) + ')';
            }
            return "RoundRect(rect=" + str + ", x=" + GeometryUtils.toStringAsFixed(CornerRadius.m107266getXimpl(j), 1) + ", y=" + GeometryUtils.toStringAsFixed(CornerRadius.m107267getYimpl(j), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", topLeft=" + ((Object) CornerRadius.m107272toStringimpl(j)) + ", topRight=" + ((Object) CornerRadius.m107272toStringimpl(j2)) + ", bottomRight=" + ((Object) CornerRadius.m107272toStringimpl(j3)) + ", bottomLeft=" + ((Object) CornerRadius.m107272toStringimpl(j4)) + ')';
    }

    private RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
        this.topLeftCornerRadius = j;
        this.topRightCornerRadius = j2;
        this.bottomRightCornerRadius = j3;
        this.bottomLeftCornerRadius = j4;
    }

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, (i & 16) != 0 ? CornerRadius.Companion.m107276getZerokKHJgLs() : j, (i & 32) != 0 ? CornerRadius.Companion.m107276getZerokKHJgLs() : j2, (i & 64) != 0 ? CornerRadius.Companion.m107276getZerokKHJgLs() : j3, (i & 128) != 0 ? CornerRadius.Companion.m107276getZerokKHJgLs() : j4, null);
    }

    /* compiled from: RoundRect.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.geometry.RoundRect$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RoundRect getZero() {
            return RoundRect.Zero;
        }

        public static /* synthetic */ void getZero$annotations() {
        }
    }
}
