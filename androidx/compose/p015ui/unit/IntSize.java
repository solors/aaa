package androidx.compose.p015ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: IntSize.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.unit.IntSize */
/* loaded from: classes.dex */
public final class IntSize {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m109889constructorimpl(0);
    private final long packedValue;

    /* compiled from: IntSize.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.unit.IntSize$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZero-YbymL2g  reason: not valid java name */
        public final long m109899getZeroYbymL2g() {
            return IntSize.Zero;
        }
    }

    private /* synthetic */ IntSize(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ IntSize m109886boximpl(long j) {
        return new IntSize(j);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final int m109887component1impl(long j) {
        return m109894getWidthimpl(j);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final int m109888component2impl(long j) {
        return m109893getHeightimpl(j);
    }

    @Stable
    /* renamed from: div-YEO4UFw  reason: not valid java name */
    public static final long m109890divYEO4UFw(long j, int i) {
        return IntSizeKt.IntSize(m109894getWidthimpl(j) / i, m109893getHeightimpl(j) / i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109891equalsimpl(long j, Object obj) {
        if (!(obj instanceof IntSize) || j != ((IntSize) obj).m109898unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109892equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getHeight-impl  reason: not valid java name */
    public static final int m109893getHeightimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: getWidth-impl  reason: not valid java name */
    public static final int m109894getWidthimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109895hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @Stable
    /* renamed from: times-YEO4UFw  reason: not valid java name */
    public static final long m109896timesYEO4UFw(long j, int i) {
        return IntSizeKt.IntSize(m109894getWidthimpl(j) * i, m109893getHeightimpl(j) * i);
    }

    @Stable
    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109897toStringimpl(long j) {
        return m109894getWidthimpl(j) + " x " + m109893getHeightimpl(j);
    }

    public boolean equals(Object obj) {
        return m109891equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m109895hashCodeimpl(this.packedValue);
    }

    @Stable
    @NotNull
    public String toString() {
        return m109897toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m109898unboximpl() {
        return this.packedValue;
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m109889constructorimpl(long j) {
        return j;
    }
}
