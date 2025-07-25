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
/* renamed from: androidx.compose.ui.unit.DpOffset */
/* loaded from: classes.dex */
public final class DpOffset {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified;
    private static final long Zero;
    private final long packedValue;

    /* compiled from: Dp.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.unit.DpOffset$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUnspecified-RKDOV3M  reason: not valid java name */
        public final long m109804getUnspecifiedRKDOV3M() {
            return DpOffset.Unspecified;
        }

        /* renamed from: getZero-RKDOV3M  reason: not valid java name */
        public final long m109805getZeroRKDOV3M() {
            return DpOffset.Zero;
        }
    }

    static {
        float f = 0;
        Zero = DpKt.m109755DpOffsetYgX7TsA(C1059Dp.m109734constructorimpl(f), C1059Dp.m109734constructorimpl(f));
        C1059Dp.Companion companion = C1059Dp.Companion;
        Unspecified = DpKt.m109755DpOffsetYgX7TsA(companion.m109754getUnspecifiedD9Ej5fM(), companion.m109754getUnspecifiedD9Ej5fM());
    }

    private /* synthetic */ DpOffset(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ DpOffset m109789boximpl(long j) {
        return new DpOffset(j);
    }

    /* renamed from: copy-tPigGR8  reason: not valid java name */
    public static final long m109791copytPigGR8(long j, float f, float f2) {
        return DpKt.m109755DpOffsetYgX7TsA(f, f2);
    }

    /* renamed from: copy-tPigGR8$default  reason: not valid java name */
    public static /* synthetic */ long m109792copytPigGR8$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m109795getXD9Ej5fM(j);
        }
        if ((i & 2) != 0) {
            f2 = m109797getYD9Ej5fM(j);
        }
        return m109791copytPigGR8(j, f, f2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109793equalsimpl(long j, Object obj) {
        if (!(obj instanceof DpOffset) || j != ((DpOffset) obj).m109803unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109794equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getX-D9Ej5fM  reason: not valid java name */
    public static final float m109795getXD9Ej5fM(long j) {
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
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    /* renamed from: getY-D9Ej5fM  reason: not valid java name */
    public static final float m109797getYD9Ej5fM(long j) {
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
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109799hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @Stable
    /* renamed from: minus-CB-Mgk4  reason: not valid java name */
    public static final long m109800minusCBMgk4(long j, long j2) {
        return DpKt.m109755DpOffsetYgX7TsA(C1059Dp.m109734constructorimpl(m109795getXD9Ej5fM(j) - m109795getXD9Ej5fM(j2)), C1059Dp.m109734constructorimpl(m109797getYD9Ej5fM(j) - m109797getYD9Ej5fM(j2)));
    }

    @Stable
    /* renamed from: plus-CB-Mgk4  reason: not valid java name */
    public static final long m109801plusCBMgk4(long j, long j2) {
        return DpKt.m109755DpOffsetYgX7TsA(C1059Dp.m109734constructorimpl(m109795getXD9Ej5fM(j) + m109795getXD9Ej5fM(j2)), C1059Dp.m109734constructorimpl(m109797getYD9Ej5fM(j) + m109797getYD9Ej5fM(j2)));
    }

    @Stable
    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109802toStringimpl(long j) {
        boolean z;
        if (j != Companion.m109804getUnspecifiedRKDOV3M()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return '(' + ((Object) C1059Dp.m109745toStringimpl(m109795getXD9Ej5fM(j))) + ", " + ((Object) C1059Dp.m109745toStringimpl(m109797getYD9Ej5fM(j))) + ')';
        }
        return "DpOffset.Unspecified";
    }

    public boolean equals(Object obj) {
        return m109793equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m109799hashCodeimpl(this.packedValue);
    }

    @Stable
    @NotNull
    public String toString() {
        return m109802toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m109803unboximpl() {
        return this.packedValue;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    /* renamed from: getX-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m109796getXD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getY-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m109798getYD9Ej5fM$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m109790constructorimpl(long j) {
        return j;
    }
}
