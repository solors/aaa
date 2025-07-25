package androidx.compose.p015ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Rect.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.geometry.Rect */
/* loaded from: classes.dex */
public final class Rect {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Rect Zero = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    public Rect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public static /* synthetic */ Rect copy$default(Rect rect, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = rect.left;
        }
        if ((i & 2) != 0) {
            f2 = rect.top;
        }
        if ((i & 4) != 0) {
            f3 = rect.right;
        }
        if ((i & 8) != 0) {
            f4 = rect.bottom;
        }
        return rect.copy(f, f2, f3, f4);
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

    /* renamed from: contains-k-4lQ0M  reason: not valid java name */
    public final boolean m107317containsk4lQ0M(long j) {
        if (Offset.m107291getXimpl(j) >= this.left && Offset.m107291getXimpl(j) < this.right && Offset.m107292getYimpl(j) >= this.top && Offset.m107292getYimpl(j) < this.bottom) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Rect copy(float f, float f2, float f3, float f4) {
        return new Rect(f, f2, f3, f4);
    }

    @Stable
    @NotNull
    public final Rect deflate(float f) {
        return inflate(-f);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        if (Intrinsics.m17075f(Float.valueOf(this.left), Float.valueOf(rect.left)) && Intrinsics.m17075f(Float.valueOf(this.top), Float.valueOf(rect.top)) && Intrinsics.m17075f(Float.valueOf(this.right), Float.valueOf(rect.right)) && Intrinsics.m17075f(Float.valueOf(this.bottom), Float.valueOf(rect.bottom))) {
            return true;
        }
        return false;
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomCenter-F1C5BW0  reason: not valid java name */
    public final long m107318getBottomCenterF1C5BW0() {
        return OffsetKt.Offset(this.left + (getWidth() / 2.0f), this.bottom);
    }

    /* renamed from: getBottomLeft-F1C5BW0  reason: not valid java name */
    public final long m107319getBottomLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.bottom);
    }

    /* renamed from: getBottomRight-F1C5BW0  reason: not valid java name */
    public final long m107320getBottomRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.bottom);
    }

    /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
    public final long m107321getCenterF1C5BW0() {
        return OffsetKt.Offset(this.left + (getWidth() / 2.0f), this.top + (getHeight() / 2.0f));
    }

    /* renamed from: getCenterLeft-F1C5BW0  reason: not valid java name */
    public final long m107322getCenterLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.top + (getHeight() / 2.0f));
    }

    /* renamed from: getCenterRight-F1C5BW0  reason: not valid java name */
    public final long m107323getCenterRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.top + (getHeight() / 2.0f));
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final float getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final float getRight() {
        return this.right;
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public final long m107324getSizeNHjbRc() {
        return SizeKt.Size(getWidth(), getHeight());
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopCenter-F1C5BW0  reason: not valid java name */
    public final long m107325getTopCenterF1C5BW0() {
        return OffsetKt.Offset(this.left + (getWidth() / 2.0f), this.top);
    }

    /* renamed from: getTopLeft-F1C5BW0  reason: not valid java name */
    public final long m107326getTopLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.top);
    }

    /* renamed from: getTopRight-F1C5BW0  reason: not valid java name */
    public final long m107327getTopRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.top);
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
    }

    @Stable
    @NotNull
    public final Rect inflate(float f) {
        return new Rect(this.left - f, this.top - f, this.right + f, this.bottom + f);
    }

    @Stable
    @NotNull
    public final Rect intersect(@NotNull Rect other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new Rect(Math.max(this.left, other.left), Math.max(this.top, other.top), Math.min(this.right, other.right), Math.min(this.bottom, other.bottom));
    }

    public final boolean isEmpty() {
        if (this.left < this.right && this.top < this.bottom) {
            return false;
        }
        return true;
    }

    public final boolean isFinite() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f = this.left;
        if (!Float.isInfinite(f) && !Float.isNaN(f)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float f2 = this.top;
            if (!Float.isInfinite(f2) && !Float.isNaN(f2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                float f3 = this.right;
                if (!Float.isInfinite(f3) && !Float.isNaN(f3)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    float f4 = this.bottom;
                    if (!Float.isInfinite(f4) && !Float.isNaN(f4)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean isInfinite() {
        if (this.left < Float.POSITIVE_INFINITY && this.top < Float.POSITIVE_INFINITY && this.right < Float.POSITIVE_INFINITY && this.bottom < Float.POSITIVE_INFINITY) {
            return false;
        }
        return true;
    }

    public final boolean overlaps(@NotNull Rect other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (this.right <= other.left || other.right <= this.left || this.bottom <= other.top || other.bottom <= this.top) {
            return false;
        }
        return true;
    }

    @NotNull
    public String toString() {
        return "Rect.fromLTRB(" + GeometryUtils.toStringAsFixed(this.left, 1) + ", " + GeometryUtils.toStringAsFixed(this.top, 1) + ", " + GeometryUtils.toStringAsFixed(this.right, 1) + ", " + GeometryUtils.toStringAsFixed(this.bottom, 1) + ')';
    }

    @Stable
    @NotNull
    public final Rect translate(float f, float f2) {
        return new Rect(this.left + f, this.top + f2, this.right + f, this.bottom + f2);
    }

    @Stable
    @NotNull
    /* renamed from: translate-k-4lQ0M  reason: not valid java name */
    public final Rect m107328translatek4lQ0M(long j) {
        return new Rect(this.left + Offset.m107291getXimpl(j), this.top + Offset.m107292getYimpl(j), this.right + Offset.m107291getXimpl(j), this.bottom + Offset.m107292getYimpl(j));
    }

    /* compiled from: Rect.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.geometry.Rect$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Rect getZero() {
            return Rect.Zero;
        }

        @Stable
        public static /* synthetic */ void getZero$annotations() {
        }
    }

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getRight$annotations() {
    }

    @Stable
    /* renamed from: getSize-NH-jbRc$annotations  reason: not valid java name */
    public static /* synthetic */ void m107316getSizeNHjbRc$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    @Stable
    public static /* synthetic */ void isEmpty$annotations() {
    }

    @Stable
    public static /* synthetic */ void isFinite$annotations() {
    }

    @Stable
    public static /* synthetic */ void isInfinite$annotations() {
    }
}
