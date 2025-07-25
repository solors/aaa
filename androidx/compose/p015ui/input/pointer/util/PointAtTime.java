package androidx.compose.p015ui.input.pointer.util;

import androidx.compose.p015ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VelocityTracker.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.util.PointAtTime */
/* loaded from: classes.dex */
final class PointAtTime {
    private final long point;
    private final long time;

    public /* synthetic */ PointAtTime(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: copy-3MmeM6k$default  reason: not valid java name */
    public static /* synthetic */ PointAtTime m108984copy3MmeM6k$default(PointAtTime pointAtTime, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = pointAtTime.point;
        }
        if ((i & 2) != 0) {
            j2 = pointAtTime.time;
        }
        return pointAtTime.m108986copy3MmeM6k(j, j2);
    }

    /* renamed from: component1-F1C5BW0  reason: not valid java name */
    public final long m108985component1F1C5BW0() {
        return this.point;
    }

    public final long component2() {
        return this.time;
    }

    @NotNull
    /* renamed from: copy-3MmeM6k  reason: not valid java name */
    public final PointAtTime m108986copy3MmeM6k(long j, long j2) {
        return new PointAtTime(j, j2, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointAtTime)) {
            return false;
        }
        PointAtTime pointAtTime = (PointAtTime) obj;
        if (Offset.m107288equalsimpl0(this.point, pointAtTime.point) && this.time == pointAtTime.time) {
            return true;
        }
        return false;
    }

    /* renamed from: getPoint-F1C5BW0  reason: not valid java name */
    public final long m108987getPointF1C5BW0() {
        return this.point;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (Offset.m107293hashCodeimpl(this.point) * 31) + Long.hashCode(this.time);
    }

    @NotNull
    public String toString() {
        return "PointAtTime(point=" + ((Object) Offset.m107299toStringimpl(this.point)) + ", time=" + this.time + ')';
    }

    private PointAtTime(long j, long j2) {
        this.point = j;
        this.time = j2;
    }
}
