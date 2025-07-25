package androidx.compose.p015ui.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.C37606l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: ScaleFactor.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.layout.ScaleFactor */
/* loaded from: classes.dex */
public final class ScaleFactor {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = ScaleFactorKt.ScaleFactor(Float.NaN, Float.NaN);
    private final long packedValue;

    private /* synthetic */ ScaleFactor(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ScaleFactor m109072boximpl(long j) {
        return new ScaleFactor(j);
    }

    @Stable
    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m109073component1impl(long j) {
        return m109081getScaleXimpl(j);
    }

    @Stable
    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m109074component2impl(long j) {
        return m109082getScaleYimpl(j);
    }

    /* renamed from: copy-8GGzs04  reason: not valid java name */
    public static final long m109076copy8GGzs04(long j, float f, float f2) {
        return ScaleFactorKt.ScaleFactor(f, f2);
    }

    /* renamed from: copy-8GGzs04$default  reason: not valid java name */
    public static /* synthetic */ long m109077copy8GGzs04$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m109081getScaleXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m109082getScaleYimpl(j);
        }
        return m109076copy8GGzs04(j, f, f2);
    }

    @Stable
    /* renamed from: div-44nBxM0  reason: not valid java name */
    public static final long m109078div44nBxM0(long j, float f) {
        return ScaleFactorKt.ScaleFactor(m109081getScaleXimpl(j) / f, m109082getScaleYimpl(j) / f);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109079equalsimpl(long j, Object obj) {
        if (!(obj instanceof ScaleFactor) || j != ((ScaleFactor) obj).m109086unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109080equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getScaleX-impl  reason: not valid java name */
    public static final float m109081getScaleXimpl(long j) {
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
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    /* renamed from: getScaleY-impl  reason: not valid java name */
    public static final float m109082getScaleYimpl(long j) {
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
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109083hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @Stable
    /* renamed from: times-44nBxM0  reason: not valid java name */
    public static final long m109084times44nBxM0(long j, float f) {
        return ScaleFactorKt.ScaleFactor(m109081getScaleXimpl(j) * f, m109082getScaleYimpl(j) * f);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109085toStringimpl(long j) {
        float roundToTenths;
        float roundToTenths2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ScaleFactor(");
        roundToTenths = ScaleFactorKt.roundToTenths(m109081getScaleXimpl(j));
        sb2.append(roundToTenths);
        sb2.append(", ");
        roundToTenths2 = ScaleFactorKt.roundToTenths(m109082getScaleYimpl(j));
        sb2.append(roundToTenths2);
        sb2.append(')');
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        return m109079equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m109083hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m109085toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m109086unboximpl() {
        return this.packedValue;
    }

    /* compiled from: ScaleFactor.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.layout.ScaleFactor$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUnspecified-_hLwfpc  reason: not valid java name */
        public final long m109088getUnspecified_hLwfpc() {
            return ScaleFactor.Unspecified;
        }

        @Stable
        /* renamed from: getUnspecified-_hLwfpc$annotations  reason: not valid java name */
        public static /* synthetic */ void m109087getUnspecified_hLwfpc$annotations() {
        }
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getScaleX$annotations() {
    }

    @Stable
    public static /* synthetic */ void getScaleY$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m109075constructorimpl(long j) {
        return j;
    }
}
