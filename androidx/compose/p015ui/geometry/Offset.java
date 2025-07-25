package androidx.compose.p015ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.C37606l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Offset.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.geometry.Offset */
/* loaded from: classes.dex */
public final class Offset {
    private final long packedValue;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Zero = OffsetKt.Offset(0.0f, 0.0f);
    private static final long Infinite = OffsetKt.Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final long Unspecified = OffsetKt.Offset(Float.NaN, Float.NaN);

    private /* synthetic */ Offset(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Offset m107280boximpl(long j) {
        return new Offset(j);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m107281component1impl(long j) {
        return m107291getXimpl(j);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m107282component2impl(long j) {
        return m107292getYimpl(j);
    }

    /* renamed from: copy-dBAh8RU  reason: not valid java name */
    public static final long m107284copydBAh8RU(long j, float f, float f2) {
        return OffsetKt.Offset(f, f2);
    }

    /* renamed from: copy-dBAh8RU$default  reason: not valid java name */
    public static /* synthetic */ long m107285copydBAh8RU$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m107291getXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m107292getYimpl(j);
        }
        return m107284copydBAh8RU(j, f, f2);
    }

    @Stable
    /* renamed from: div-tuRUvjQ  reason: not valid java name */
    public static final long m107286divtuRUvjQ(long j, float f) {
        return OffsetKt.Offset(m107291getXimpl(j) / f, m107292getYimpl(j) / f);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107287equalsimpl(long j, Object obj) {
        if (!(obj instanceof Offset) || j != ((Offset) obj).m107301unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107288equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: getDistance-impl  reason: not valid java name */
    public static final float m107289getDistanceimpl(long j) {
        return (float) Math.sqrt((m107291getXimpl(j) * m107291getXimpl(j)) + (m107292getYimpl(j) * m107292getYimpl(j)));
    }

    @Stable
    /* renamed from: getDistanceSquared-impl  reason: not valid java name */
    public static final float m107290getDistanceSquaredimpl(long j) {
        return (m107291getXimpl(j) * m107291getXimpl(j)) + (m107292getYimpl(j) * m107292getYimpl(j));
    }

    /* renamed from: getX-impl  reason: not valid java name */
    public static final float m107291getXimpl(long j) {
        boolean z;
        if (j != Unspecified) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C37606l c37606l = C37606l.f99324a;
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    /* renamed from: getY-impl  reason: not valid java name */
    public static final float m107292getYimpl(long j) {
        boolean z;
        if (j != Unspecified) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C37606l c37606l = C37606l.f99324a;
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107293hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @Stable
    /* renamed from: isValid-impl  reason: not valid java name */
    public static final boolean m107294isValidimpl(long j) {
        boolean z;
        if (!Float.isNaN(m107291getXimpl(j)) && !Float.isNaN(m107292getYimpl(j))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        throw new IllegalStateException("Offset argument contained a NaN value.".toString());
    }

    @Stable
    /* renamed from: minus-MK-Hz9U  reason: not valid java name */
    public static final long m107295minusMKHz9U(long j, long j2) {
        return OffsetKt.Offset(m107291getXimpl(j) - m107291getXimpl(j2), m107292getYimpl(j) - m107292getYimpl(j2));
    }

    @Stable
    /* renamed from: plus-MK-Hz9U  reason: not valid java name */
    public static final long m107296plusMKHz9U(long j, long j2) {
        return OffsetKt.Offset(m107291getXimpl(j) + m107291getXimpl(j2), m107292getYimpl(j) + m107292getYimpl(j2));
    }

    @Stable
    /* renamed from: rem-tuRUvjQ  reason: not valid java name */
    public static final long m107297remtuRUvjQ(long j, float f) {
        return OffsetKt.Offset(m107291getXimpl(j) % f, m107292getYimpl(j) % f);
    }

    @Stable
    /* renamed from: times-tuRUvjQ  reason: not valid java name */
    public static final long m107298timestuRUvjQ(long j, float f) {
        return OffsetKt.Offset(m107291getXimpl(j) * f, m107292getYimpl(j) * f);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107299toStringimpl(long j) {
        if (OffsetKt.m107310isSpecifiedk4lQ0M(j)) {
            return "Offset(" + GeometryUtils.toStringAsFixed(m107291getXimpl(j), 1) + ", " + GeometryUtils.toStringAsFixed(m107292getYimpl(j), 1) + ')';
        }
        return "Offset.Unspecified";
    }

    @Stable
    /* renamed from: unaryMinus-F1C5BW0  reason: not valid java name */
    public static final long m107300unaryMinusF1C5BW0(long j) {
        return OffsetKt.Offset(-m107291getXimpl(j), -m107292getYimpl(j));
    }

    public boolean equals(Object obj) {
        return m107287equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m107293hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m107299toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m107301unboximpl() {
        return this.packedValue;
    }

    /* compiled from: Offset.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.geometry.Offset$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getInfinite-F1C5BW0  reason: not valid java name */
        public final long m107305getInfiniteF1C5BW0() {
            return Offset.Infinite;
        }

        /* renamed from: getUnspecified-F1C5BW0  reason: not valid java name */
        public final long m107306getUnspecifiedF1C5BW0() {
            return Offset.Unspecified;
        }

        /* renamed from: getZero-F1C5BW0  reason: not valid java name */
        public final long m107307getZeroF1C5BW0() {
            return Offset.Zero;
        }

        @Stable
        /* renamed from: getInfinite-F1C5BW0$annotations  reason: not valid java name */
        public static /* synthetic */ void m107302getInfiniteF1C5BW0$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-F1C5BW0$annotations  reason: not valid java name */
        public static /* synthetic */ void m107303getUnspecifiedF1C5BW0$annotations() {
        }

        @Stable
        /* renamed from: getZero-F1C5BW0$annotations  reason: not valid java name */
        public static /* synthetic */ void m107304getZeroF1C5BW0$annotations() {
        }
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m107283constructorimpl(long j) {
        return j;
    }
}
