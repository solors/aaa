package androidx.compose.p015ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.C37606l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: CornerRadius.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.geometry.CornerRadius */
/* loaded from: classes.dex */
public final class CornerRadius {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Zero = CornerRadiusKt.CornerRadius$default(0.0f, 0.0f, 2, null);
    private final long packedValue;

    private /* synthetic */ CornerRadius(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ CornerRadius m107257boximpl(long j) {
        return new CornerRadius(j);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m107258component1impl(long j) {
        return m107266getXimpl(j);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m107259component2impl(long j) {
        return m107267getYimpl(j);
    }

    /* renamed from: copy-OHQCggk  reason: not valid java name */
    public static final long m107261copyOHQCggk(long j, float f, float f2) {
        return CornerRadiusKt.CornerRadius(f, f2);
    }

    /* renamed from: copy-OHQCggk$default  reason: not valid java name */
    public static /* synthetic */ long m107262copyOHQCggk$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m107266getXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m107267getYimpl(j);
        }
        return m107261copyOHQCggk(j, f, f2);
    }

    @Stable
    /* renamed from: div-Bz7bX_o  reason: not valid java name */
    public static final long m107263divBz7bX_o(long j, float f) {
        return CornerRadiusKt.CornerRadius(m107266getXimpl(j) / f, m107267getYimpl(j) / f);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107264equalsimpl(long j, Object obj) {
        if (!(obj instanceof CornerRadius) || j != ((CornerRadius) obj).m107274unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107265equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getX-impl  reason: not valid java name */
    public static final float m107266getXimpl(long j) {
        C37606l c37606l = C37606l.f99324a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getY-impl  reason: not valid java name */
    public static final float m107267getYimpl(long j) {
        C37606l c37606l = C37606l.f99324a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107268hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @Stable
    /* renamed from: minus-vF7b-mM  reason: not valid java name */
    public static final long m107269minusvF7bmM(long j, long j2) {
        return CornerRadiusKt.CornerRadius(m107266getXimpl(j) - m107266getXimpl(j2), m107267getYimpl(j) - m107267getYimpl(j2));
    }

    @Stable
    /* renamed from: plus-vF7b-mM  reason: not valid java name */
    public static final long m107270plusvF7bmM(long j, long j2) {
        return CornerRadiusKt.CornerRadius(m107266getXimpl(j) + m107266getXimpl(j2), m107267getYimpl(j) + m107267getYimpl(j2));
    }

    @Stable
    /* renamed from: times-Bz7bX_o  reason: not valid java name */
    public static final long m107271timesBz7bX_o(long j, float f) {
        return CornerRadiusKt.CornerRadius(m107266getXimpl(j) * f, m107267getYimpl(j) * f);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107272toStringimpl(long j) {
        boolean z;
        if (m107266getXimpl(j) == m107267getYimpl(j)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "CornerRadius.circular(" + GeometryUtils.toStringAsFixed(m107266getXimpl(j), 1) + ')';
        }
        return "CornerRadius.elliptical(" + GeometryUtils.toStringAsFixed(m107266getXimpl(j), 1) + ", " + GeometryUtils.toStringAsFixed(m107267getYimpl(j), 1) + ')';
    }

    @Stable
    /* renamed from: unaryMinus-kKHJgLs  reason: not valid java name */
    public static final long m107273unaryMinuskKHJgLs(long j) {
        return CornerRadiusKt.CornerRadius(-m107266getXimpl(j), -m107267getYimpl(j));
    }

    public boolean equals(Object obj) {
        return m107264equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m107268hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m107272toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m107274unboximpl() {
        return this.packedValue;
    }

    /* compiled from: CornerRadius.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.geometry.CornerRadius$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZero-kKHJgLs  reason: not valid java name */
        public final long m107276getZerokKHJgLs() {
            return CornerRadius.Zero;
        }

        @Stable
        /* renamed from: getZero-kKHJgLs$annotations  reason: not valid java name */
        public static /* synthetic */ void m107275getZerokKHJgLs$annotations() {
        }
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
    public static long m107260constructorimpl(long j) {
        return j;
    }
}
