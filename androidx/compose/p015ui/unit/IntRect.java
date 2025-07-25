package androidx.compose.p015ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IntRect.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.unit.IntRect */
/* loaded from: classes.dex */
public final class IntRect {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final IntRect Zero = new IntRect(0, 0, 0, 0);
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public IntRect(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    public static /* synthetic */ IntRect copy$default(IntRect intRect, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = intRect.left;
        }
        if ((i5 & 2) != 0) {
            i2 = intRect.top;
        }
        if ((i5 & 4) != 0) {
            i3 = intRect.right;
        }
        if ((i5 & 8) != 0) {
            i4 = intRect.bottom;
        }
        return intRect.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.left;
    }

    public final int component2() {
        return this.top;
    }

    public final int component3() {
        return this.right;
    }

    public final int component4() {
        return this.bottom;
    }

    /* renamed from: contains--gyyYBs  reason: not valid java name */
    public final boolean m109871containsgyyYBs(long j) {
        if (IntOffset.m109852getXimpl(j) >= this.left && IntOffset.m109852getXimpl(j) < this.right && IntOffset.m109853getYimpl(j) >= this.top && IntOffset.m109853getYimpl(j) < this.bottom) {
            return true;
        }
        return false;
    }

    @NotNull
    public final IntRect copy(int i, int i2, int i3, int i4) {
        return new IntRect(i, i2, i3, i4);
    }

    @Stable
    @NotNull
    public final IntRect deflate(int i) {
        return inflate(-i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntRect)) {
            return false;
        }
        IntRect intRect = (IntRect) obj;
        if (this.left == intRect.left && this.top == intRect.top && this.right == intRect.right && this.bottom == intRect.bottom) {
            return true;
        }
        return false;
    }

    public final int getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomCenter-nOcc-ac  reason: not valid java name */
    public final long m109872getBottomCenternOccac() {
        return IntOffsetKt.IntOffset(this.left + (getWidth() / 2), this.bottom);
    }

    /* renamed from: getBottomLeft-nOcc-ac  reason: not valid java name */
    public final long m109873getBottomLeftnOccac() {
        return IntOffsetKt.IntOffset(this.left, this.bottom);
    }

    /* renamed from: getBottomRight-nOcc-ac  reason: not valid java name */
    public final long m109874getBottomRightnOccac() {
        return IntOffsetKt.IntOffset(this.right, this.bottom);
    }

    /* renamed from: getCenter-nOcc-ac  reason: not valid java name */
    public final long m109875getCenternOccac() {
        return IntOffsetKt.IntOffset(this.left + (getWidth() / 2), this.top + (getHeight() / 2));
    }

    /* renamed from: getCenterLeft-nOcc-ac  reason: not valid java name */
    public final long m109876getCenterLeftnOccac() {
        return IntOffsetKt.IntOffset(this.left, this.top + (getHeight() / 2));
    }

    /* renamed from: getCenterRight-nOcc-ac  reason: not valid java name */
    public final long m109877getCenterRightnOccac() {
        return IntOffsetKt.IntOffset(this.right, this.top + (getHeight() / 2));
    }

    public final int getHeight() {
        return this.bottom - this.top;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getRight() {
        return this.right;
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    public final long m109878getSizeYbymL2g() {
        return IntSizeKt.IntSize(getWidth(), getHeight());
    }

    public final int getTop() {
        return this.top;
    }

    /* renamed from: getTopCenter-nOcc-ac  reason: not valid java name */
    public final long m109879getTopCenternOccac() {
        return IntOffsetKt.IntOffset(this.left + (getWidth() / 2), this.top);
    }

    /* renamed from: getTopLeft-nOcc-ac  reason: not valid java name */
    public final long m109880getTopLeftnOccac() {
        return IntOffsetKt.IntOffset(this.left, this.top);
    }

    /* renamed from: getTopRight-nOcc-ac  reason: not valid java name */
    public final long m109881getTopRightnOccac() {
        return IntOffsetKt.IntOffset(this.right, this.top);
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.left) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom);
    }

    @Stable
    @NotNull
    public final IntRect inflate(int i) {
        return new IntRect(this.left - i, this.top - i, this.right + i, this.bottom + i);
    }

    @Stable
    @NotNull
    public final IntRect intersect(@NotNull IntRect other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new IntRect(Math.max(this.left, other.left), Math.max(this.top, other.top), Math.min(this.right, other.right), Math.min(this.bottom, other.bottom));
    }

    public final boolean isEmpty() {
        if (this.left < this.right && this.top < this.bottom) {
            return false;
        }
        return true;
    }

    public final boolean overlaps(@NotNull IntRect other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (this.right <= other.left || other.right <= this.left || this.bottom <= other.top || other.bottom <= this.top) {
            return false;
        }
        return true;
    }

    @NotNull
    public String toString() {
        return "IntRect.fromLTRB(" + this.left + ", " + this.top + ", " + this.right + ", " + this.bottom + ')';
    }

    @Stable
    @NotNull
    public final IntRect translate(int i, int i2) {
        return new IntRect(this.left + i, this.top + i2, this.right + i, this.bottom + i2);
    }

    @Stable
    @NotNull
    /* renamed from: translate--gyyYBs  reason: not valid java name */
    public final IntRect m109882translategyyYBs(long j) {
        return new IntRect(this.left + IntOffset.m109852getXimpl(j), this.top + IntOffset.m109853getYimpl(j), this.right + IntOffset.m109852getXimpl(j), this.bottom + IntOffset.m109853getYimpl(j));
    }

    /* compiled from: IntRect.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.unit.IntRect$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IntRect getZero() {
            return IntRect.Zero;
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
    /* renamed from: getSize-YbymL2g$annotations  reason: not valid java name */
    public static /* synthetic */ void m109870getSizeYbymL2g$annotations() {
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
}
