package androidx.compose.p015ui.input.pointer.util;

import androidx.compose.p015ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VelocityTracker.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.util.VelocityEstimate */
/* loaded from: classes.dex */
final class VelocityEstimate {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final VelocityEstimate None;
    private final float confidence;
    private final long durationMillis;
    private final long offset;
    private final long pixelsPerSecond;

    /* compiled from: VelocityTracker.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.input.pointer.util.VelocityEstimate$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VelocityEstimate getNone() {
            return VelocityEstimate.None;
        }
    }

    static {
        Offset.Companion companion = Offset.Companion;
        None = new VelocityEstimate(companion.m107307getZeroF1C5BW0(), 1.0f, 0L, companion.m107307getZeroF1C5BW0(), null);
    }

    public /* synthetic */ VelocityEstimate(long j, float f, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f, j2, j3);
    }

    /* renamed from: copy-PZAlG8E$default  reason: not valid java name */
    public static /* synthetic */ VelocityEstimate m108988copyPZAlG8E$default(VelocityEstimate velocityEstimate, long j, float f, long j2, long j3, int i, Object obj) {
        long j4;
        float f2;
        long j5;
        long j6;
        if ((i & 1) != 0) {
            j4 = velocityEstimate.pixelsPerSecond;
        } else {
            j4 = j;
        }
        if ((i & 2) != 0) {
            f2 = velocityEstimate.confidence;
        } else {
            f2 = f;
        }
        if ((i & 4) != 0) {
            j5 = velocityEstimate.durationMillis;
        } else {
            j5 = j2;
        }
        if ((i & 8) != 0) {
            j6 = velocityEstimate.offset;
        } else {
            j6 = j3;
        }
        return velocityEstimate.m108991copyPZAlG8E(j4, f2, j5, j6);
    }

    /* renamed from: component1-F1C5BW0  reason: not valid java name */
    public final long m108989component1F1C5BW0() {
        return this.pixelsPerSecond;
    }

    public final float component2() {
        return this.confidence;
    }

    public final long component3() {
        return this.durationMillis;
    }

    /* renamed from: component4-F1C5BW0  reason: not valid java name */
    public final long m108990component4F1C5BW0() {
        return this.offset;
    }

    @NotNull
    /* renamed from: copy-PZAlG8E  reason: not valid java name */
    public final VelocityEstimate m108991copyPZAlG8E(long j, float f, long j2, long j3) {
        return new VelocityEstimate(j, f, j2, j3, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VelocityEstimate)) {
            return false;
        }
        VelocityEstimate velocityEstimate = (VelocityEstimate) obj;
        if (Offset.m107288equalsimpl0(this.pixelsPerSecond, velocityEstimate.pixelsPerSecond) && Intrinsics.m17075f(Float.valueOf(this.confidence), Float.valueOf(velocityEstimate.confidence)) && this.durationMillis == velocityEstimate.durationMillis && Offset.m107288equalsimpl0(this.offset, velocityEstimate.offset)) {
            return true;
        }
        return false;
    }

    public final float getConfidence() {
        return this.confidence;
    }

    public final long getDurationMillis() {
        return this.durationMillis;
    }

    /* renamed from: getOffset-F1C5BW0  reason: not valid java name */
    public final long m108992getOffsetF1C5BW0() {
        return this.offset;
    }

    /* renamed from: getPixelsPerSecond-F1C5BW0  reason: not valid java name */
    public final long m108993getPixelsPerSecondF1C5BW0() {
        return this.pixelsPerSecond;
    }

    public int hashCode() {
        return (((((Offset.m107293hashCodeimpl(this.pixelsPerSecond) * 31) + Float.hashCode(this.confidence)) * 31) + Long.hashCode(this.durationMillis)) * 31) + Offset.m107293hashCodeimpl(this.offset);
    }

    @NotNull
    public String toString() {
        return "VelocityEstimate(pixelsPerSecond=" + ((Object) Offset.m107299toStringimpl(this.pixelsPerSecond)) + ", confidence=" + this.confidence + ", durationMillis=" + this.durationMillis + ", offset=" + ((Object) Offset.m107299toStringimpl(this.offset)) + ')';
    }

    private VelocityEstimate(long j, float f, long j2, long j3) {
        this.pixelsPerSecond = j;
        this.confidence = f;
        this.durationMillis = j2;
        this.offset = j3;
    }
}
