package androidx.compose.p015ui.unit;

import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.C37606l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Dp.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.unit.DpSize */
/* loaded from: classes.dex */
public final class DpSize {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified;
    private static final long Zero;
    private final long packedValue;

    /* compiled from: Dp.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.unit.DpSize$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUnspecified-MYxV2XQ  reason: not valid java name */
        public final long m109841getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }

        /* renamed from: getZero-MYxV2XQ  reason: not valid java name */
        public final long m109842getZeroMYxV2XQ() {
            return DpSize.Zero;
        }
    }

    static {
        float f = 0;
        Zero = DpKt.m109756DpSizeYgX7TsA(C1059Dp.m109734constructorimpl(f), C1059Dp.m109734constructorimpl(f));
        C1059Dp.Companion companion = C1059Dp.Companion;
        Unspecified = DpKt.m109756DpSizeYgX7TsA(companion.m109754getUnspecifiedD9Ej5fM(), companion.m109754getUnspecifiedD9Ej5fM());
    }

    private /* synthetic */ DpSize(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ DpSize m109820boximpl(long j) {
        return new DpSize(j);
    }

    @Stable
    /* renamed from: component1-D9Ej5fM  reason: not valid java name */
    public static final float m109821component1D9Ej5fM(long j) {
        return m109832getWidthD9Ej5fM(j);
    }

    @Stable
    /* renamed from: component2-D9Ej5fM  reason: not valid java name */
    public static final float m109822component2D9Ej5fM(long j) {
        return m109830getHeightD9Ej5fM(j);
    }

    /* renamed from: copy-DwJknco  reason: not valid java name */
    public static final long m109824copyDwJknco(long j, float f, float f2) {
        return DpKt.m109756DpSizeYgX7TsA(f, f2);
    }

    /* renamed from: copy-DwJknco$default  reason: not valid java name */
    public static /* synthetic */ long m109825copyDwJknco$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m109832getWidthD9Ej5fM(j);
        }
        if ((i & 2) != 0) {
            f2 = m109830getHeightD9Ej5fM(j);
        }
        return m109824copyDwJknco(j, f, f2);
    }

    @Stable
    /* renamed from: div-Gh9hcWk  reason: not valid java name */
    public static final long m109827divGh9hcWk(long j, int i) {
        float f = i;
        return DpKt.m109756DpSizeYgX7TsA(C1059Dp.m109734constructorimpl(m109832getWidthD9Ej5fM(j) / f), C1059Dp.m109734constructorimpl(m109830getHeightD9Ej5fM(j) / f));
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109828equalsimpl(long j, Object obj) {
        if (!(obj instanceof DpSize) || j != ((DpSize) obj).m109840unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109829equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getHeight-D9Ej5fM  reason: not valid java name */
    public static final float m109830getHeightD9Ej5fM(long j) {
        boolean z;
        if (j != Unspecified) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C37606l c37606l = C37606l.f99324a;
            return C1059Dp.m109734constructorimpl(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    /* renamed from: getWidth-D9Ej5fM  reason: not valid java name */
    public static final float m109832getWidthD9Ej5fM(long j) {
        boolean z;
        if (j != Unspecified) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C37606l c37606l = C37606l.f99324a;
            return C1059Dp.m109734constructorimpl(Float.intBitsToFloat((int) (j >> 32)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109834hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @Stable
    /* renamed from: minus-e_xh8Ic  reason: not valid java name */
    public static final long m109835minuse_xh8Ic(long j, long j2) {
        return DpKt.m109756DpSizeYgX7TsA(C1059Dp.m109734constructorimpl(m109832getWidthD9Ej5fM(j) - m109832getWidthD9Ej5fM(j2)), C1059Dp.m109734constructorimpl(m109830getHeightD9Ej5fM(j) - m109830getHeightD9Ej5fM(j2)));
    }

    @Stable
    /* renamed from: plus-e_xh8Ic  reason: not valid java name */
    public static final long m109836pluse_xh8Ic(long j, long j2) {
        return DpKt.m109756DpSizeYgX7TsA(C1059Dp.m109734constructorimpl(m109832getWidthD9Ej5fM(j) + m109832getWidthD9Ej5fM(j2)), C1059Dp.m109734constructorimpl(m109830getHeightD9Ej5fM(j) + m109830getHeightD9Ej5fM(j2)));
    }

    @Stable
    /* renamed from: times-Gh9hcWk  reason: not valid java name */
    public static final long m109838timesGh9hcWk(long j, int i) {
        float f = i;
        return DpKt.m109756DpSizeYgX7TsA(C1059Dp.m109734constructorimpl(m109832getWidthD9Ej5fM(j) * f), C1059Dp.m109734constructorimpl(m109830getHeightD9Ej5fM(j) * f));
    }

    @Stable
    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109839toStringimpl(long j) {
        boolean z;
        if (j != Companion.m109841getUnspecifiedMYxV2XQ()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return ((Object) C1059Dp.m109745toStringimpl(m109832getWidthD9Ej5fM(j))) + " x " + ((Object) C1059Dp.m109745toStringimpl(m109830getHeightD9Ej5fM(j)));
        }
        return "DpSize.Unspecified";
    }

    public boolean equals(Object obj) {
        return m109828equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m109834hashCodeimpl(this.packedValue);
    }

    @Stable
    @NotNull
    public String toString() {
        return m109839toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m109840unboximpl() {
        return this.packedValue;
    }

    @Stable
    /* renamed from: div-Gh9hcWk  reason: not valid java name */
    public static final long m109826divGh9hcWk(long j, float f) {
        return DpKt.m109756DpSizeYgX7TsA(C1059Dp.m109734constructorimpl(m109832getWidthD9Ej5fM(j) / f), C1059Dp.m109734constructorimpl(m109830getHeightD9Ej5fM(j) / f));
    }

    @Stable
    /* renamed from: times-Gh9hcWk  reason: not valid java name */
    public static final long m109837timesGh9hcWk(long j, float f) {
        return DpKt.m109756DpSizeYgX7TsA(C1059Dp.m109734constructorimpl(m109832getWidthD9Ej5fM(j) * f), C1059Dp.m109734constructorimpl(m109830getHeightD9Ej5fM(j) * f));
    }

    @Stable
    /* renamed from: getHeight-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m109831getHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    /* renamed from: getWidth-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m109833getWidthD9Ej5fM$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m109823constructorimpl(long j) {
        return j;
    }
}
