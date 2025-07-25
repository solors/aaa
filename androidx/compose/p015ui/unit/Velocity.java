package androidx.compose.p015ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.C37606l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Velocity.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.unit.Velocity */
/* loaded from: classes.dex */
public final class Velocity {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Zero = VelocityKt.Velocity(0.0f, 0.0f);
    private final long packedValue;

    private /* synthetic */ Velocity(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Velocity m109950boximpl(long j) {
        return new Velocity(j);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m109951component1impl(long j) {
        return m109959getXimpl(j);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m109952component2impl(long j) {
        return m109960getYimpl(j);
    }

    /* renamed from: copy-OhffZ5M  reason: not valid java name */
    public static final long m109954copyOhffZ5M(long j, float f, float f2) {
        return VelocityKt.Velocity(f, f2);
    }

    /* renamed from: copy-OhffZ5M$default  reason: not valid java name */
    public static /* synthetic */ long m109955copyOhffZ5M$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m109959getXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m109960getYimpl(j);
        }
        return m109954copyOhffZ5M(j, f, f2);
    }

    @Stable
    /* renamed from: div-adjELrA  reason: not valid java name */
    public static final long m109956divadjELrA(long j, float f) {
        return VelocityKt.Velocity(m109959getXimpl(j) / f, m109960getYimpl(j) / f);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109957equalsimpl(long j, Object obj) {
        if (!(obj instanceof Velocity) || j != ((Velocity) obj).m109968unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109958equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getX-impl  reason: not valid java name */
    public static final float m109959getXimpl(long j) {
        C37606l c37606l = C37606l.f99324a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getY-impl  reason: not valid java name */
    public static final float m109960getYimpl(long j) {
        C37606l c37606l = C37606l.f99324a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109961hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @Stable
    /* renamed from: minus-AH228Gc  reason: not valid java name */
    public static final long m109962minusAH228Gc(long j, long j2) {
        return VelocityKt.Velocity(m109959getXimpl(j) - m109959getXimpl(j2), m109960getYimpl(j) - m109960getYimpl(j2));
    }

    @Stable
    /* renamed from: plus-AH228Gc  reason: not valid java name */
    public static final long m109963plusAH228Gc(long j, long j2) {
        return VelocityKt.Velocity(m109959getXimpl(j) + m109959getXimpl(j2), m109960getYimpl(j) + m109960getYimpl(j2));
    }

    @Stable
    /* renamed from: rem-adjELrA  reason: not valid java name */
    public static final long m109964remadjELrA(long j, float f) {
        return VelocityKt.Velocity(m109959getXimpl(j) % f, m109960getYimpl(j) % f);
    }

    @Stable
    /* renamed from: times-adjELrA  reason: not valid java name */
    public static final long m109965timesadjELrA(long j, float f) {
        return VelocityKt.Velocity(m109959getXimpl(j) * f, m109960getYimpl(j) * f);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109966toStringimpl(long j) {
        return '(' + m109959getXimpl(j) + ", " + m109960getYimpl(j) + ") px/sec";
    }

    @Stable
    /* renamed from: unaryMinus-9UxMQ8M  reason: not valid java name */
    public static final long m109967unaryMinus9UxMQ8M(long j) {
        return VelocityKt.Velocity(-m109959getXimpl(j), -m109960getYimpl(j));
    }

    public boolean equals(Object obj) {
        return m109957equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m109961hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m109966toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m109968unboximpl() {
        return this.packedValue;
    }

    /* compiled from: Velocity.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.unit.Velocity$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZero-9UxMQ8M  reason: not valid java name */
        public final long m109970getZero9UxMQ8M() {
            return Velocity.Zero;
        }

        @Stable
        /* renamed from: getZero-9UxMQ8M$annotations  reason: not valid java name */
        public static /* synthetic */ void m109969getZero9UxMQ8M$annotations() {
        }
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m109953constructorimpl(long j) {
        return j;
    }
}
