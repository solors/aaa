package androidx.compose.p015ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.C37606l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Size.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.geometry.Size */
/* loaded from: classes.dex */
public final class Size {
    private final long packedValue;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Zero = SizeKt.Size(0.0f, 0.0f);
    private static final long Unspecified = SizeKt.Size(Float.NaN, Float.NaN);

    private /* synthetic */ Size(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Size m107348boximpl(long j) {
        return new Size(j);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m107349component1impl(long j) {
        return m107360getWidthimpl(j);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m107350component2impl(long j) {
        return m107357getHeightimpl(j);
    }

    /* renamed from: copy-xjbvk4A  reason: not valid java name */
    public static final long m107352copyxjbvk4A(long j, float f, float f2) {
        return SizeKt.Size(f, f2);
    }

    /* renamed from: copy-xjbvk4A$default  reason: not valid java name */
    public static /* synthetic */ long m107353copyxjbvk4A$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m107360getWidthimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m107357getHeightimpl(j);
        }
        return m107352copyxjbvk4A(j, f, f2);
    }

    @Stable
    /* renamed from: div-7Ah8Wj8  reason: not valid java name */
    public static final long m107354div7Ah8Wj8(long j, float f) {
        return SizeKt.Size(m107360getWidthimpl(j) / f, m107357getHeightimpl(j) / f);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107355equalsimpl(long j, Object obj) {
        if (!(obj instanceof Size) || j != ((Size) obj).m107365unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107356equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getHeight-impl  reason: not valid java name */
    public static final float m107357getHeightimpl(long j) {
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
        throw new IllegalStateException("Size is unspecified".toString());
    }

    /* renamed from: getMaxDimension-impl  reason: not valid java name */
    public static final float m107358getMaxDimensionimpl(long j) {
        return Math.max(Math.abs(m107360getWidthimpl(j)), Math.abs(m107357getHeightimpl(j)));
    }

    /* renamed from: getMinDimension-impl  reason: not valid java name */
    public static final float m107359getMinDimensionimpl(long j) {
        return Math.min(Math.abs(m107360getWidthimpl(j)), Math.abs(m107357getHeightimpl(j)));
    }

    /* renamed from: getWidth-impl  reason: not valid java name */
    public static final float m107360getWidthimpl(long j) {
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
        throw new IllegalStateException("Size is unspecified".toString());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107361hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @Stable
    /* renamed from: isEmpty-impl  reason: not valid java name */
    public static final boolean m107362isEmptyimpl(long j) {
        if (m107360getWidthimpl(j) > 0.0f && m107357getHeightimpl(j) > 0.0f) {
            return false;
        }
        return true;
    }

    @Stable
    /* renamed from: times-7Ah8Wj8  reason: not valid java name */
    public static final long m107363times7Ah8Wj8(long j, float f) {
        return SizeKt.Size(m107360getWidthimpl(j) * f, m107357getHeightimpl(j) * f);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107364toStringimpl(long j) {
        boolean z;
        if (j != Companion.m107368getUnspecifiedNHjbRc()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "Size(" + GeometryUtils.toStringAsFixed(m107360getWidthimpl(j), 1) + ", " + GeometryUtils.toStringAsFixed(m107357getHeightimpl(j), 1) + ')';
        }
        return "Size.Unspecified";
    }

    public boolean equals(Object obj) {
        return m107355equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m107361hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m107364toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m107365unboximpl() {
        return this.packedValue;
    }

    /* compiled from: Size.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.geometry.Size$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUnspecified-NH-jbRc  reason: not valid java name */
        public final long m107368getUnspecifiedNHjbRc() {
            return Size.Unspecified;
        }

        /* renamed from: getZero-NH-jbRc  reason: not valid java name */
        public final long m107369getZeroNHjbRc() {
            return Size.Zero;
        }

        @Stable
        /* renamed from: getUnspecified-NH-jbRc$annotations  reason: not valid java name */
        public static /* synthetic */ void m107366getUnspecifiedNHjbRc$annotations() {
        }

        @Stable
        /* renamed from: getZero-NH-jbRc$annotations  reason: not valid java name */
        public static /* synthetic */ void m107367getZeroNHjbRc$annotations() {
        }
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    @Stable
    public static /* synthetic */ void getMinDimension$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m107351constructorimpl(long j) {
        return j;
    }
}
