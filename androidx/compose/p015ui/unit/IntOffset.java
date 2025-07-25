package androidx.compose.p015ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import be.MathJVM;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: IntOffset.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.unit.IntOffset */
/* loaded from: classes.dex */
public final class IntOffset {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Zero = IntOffsetKt.IntOffset(0, 0);
    private final long packedValue;

    /* compiled from: IntOffset.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.unit.IntOffset$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZero-nOcc-ac  reason: not valid java name */
        public final long m109862getZeronOccac() {
            return IntOffset.Zero;
        }
    }

    private /* synthetic */ IntOffset(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ IntOffset m109843boximpl(long j) {
        return new IntOffset(j);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final int m109844component1impl(long j) {
        return m109852getXimpl(j);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final int m109845component2impl(long j) {
        return m109853getYimpl(j);
    }

    /* renamed from: copy-iSbpLlY  reason: not valid java name */
    public static final long m109847copyiSbpLlY(long j, int i, int i2) {
        return IntOffsetKt.IntOffset(i, i2);
    }

    /* renamed from: copy-iSbpLlY$default  reason: not valid java name */
    public static /* synthetic */ long m109848copyiSbpLlY$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = m109852getXimpl(j);
        }
        if ((i3 & 2) != 0) {
            i2 = m109853getYimpl(j);
        }
        return m109847copyiSbpLlY(j, i, i2);
    }

    @Stable
    /* renamed from: div-Bjo55l4  reason: not valid java name */
    public static final long m109849divBjo55l4(long j, float f) {
        int m103791d;
        int m103791d2;
        m103791d = MathJVM.m103791d(m109852getXimpl(j) / f);
        m103791d2 = MathJVM.m103791d(m109853getYimpl(j) / f);
        return IntOffsetKt.IntOffset(m103791d, m103791d2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109850equalsimpl(long j, Object obj) {
        if (!(obj instanceof IntOffset) || j != ((IntOffset) obj).m109861unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109851equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getX-impl  reason: not valid java name */
    public static final int m109852getXimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: getY-impl  reason: not valid java name */
    public static final int m109853getYimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109854hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @Stable
    /* renamed from: minus-qkQi6aY  reason: not valid java name */
    public static final long m109855minusqkQi6aY(long j, long j2) {
        return IntOffsetKt.IntOffset(m109852getXimpl(j) - m109852getXimpl(j2), m109853getYimpl(j) - m109853getYimpl(j2));
    }

    @Stable
    /* renamed from: plus-qkQi6aY  reason: not valid java name */
    public static final long m109856plusqkQi6aY(long j, long j2) {
        return IntOffsetKt.IntOffset(m109852getXimpl(j) + m109852getXimpl(j2), m109853getYimpl(j) + m109853getYimpl(j2));
    }

    @Stable
    /* renamed from: rem-Bjo55l4  reason: not valid java name */
    public static final long m109857remBjo55l4(long j, int i) {
        return IntOffsetKt.IntOffset(m109852getXimpl(j) % i, m109853getYimpl(j) % i);
    }

    @Stable
    /* renamed from: times-Bjo55l4  reason: not valid java name */
    public static final long m109858timesBjo55l4(long j, float f) {
        int m103791d;
        int m103791d2;
        m103791d = MathJVM.m103791d(m109852getXimpl(j) * f);
        m103791d2 = MathJVM.m103791d(m109853getYimpl(j) * f);
        return IntOffsetKt.IntOffset(m103791d, m103791d2);
    }

    @Stable
    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109859toStringimpl(long j) {
        return '(' + m109852getXimpl(j) + ", " + m109853getYimpl(j) + ')';
    }

    @Stable
    /* renamed from: unaryMinus-nOcc-ac  reason: not valid java name */
    public static final long m109860unaryMinusnOccac(long j) {
        return IntOffsetKt.IntOffset(-m109852getXimpl(j), -m109853getYimpl(j));
    }

    public boolean equals(Object obj) {
        return m109850equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m109854hashCodeimpl(this.packedValue);
    }

    @Stable
    @NotNull
    public String toString() {
        return m109859toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m109861unboximpl() {
        return this.packedValue;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m109846constructorimpl(long j) {
        return j;
    }
}
