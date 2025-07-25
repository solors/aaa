package androidx.compose.p015ui.unit;

import androidx.compose.p015ui.util.MathHelpers;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: Dp.kt */
@Metadata
/* renamed from: androidx.compose.ui.unit.DpKt */
/* loaded from: classes.dex */
public final class DpKt {
    @Stable
    /* renamed from: DpOffset-YgX7TsA */
    public static final long m109755DpOffsetYgX7TsA(float f, float f2) {
        return DpOffset.m109790constructorimpl((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    @Stable
    /* renamed from: DpSize-YgX7TsA */
    public static final long m109756DpSizeYgX7TsA(float f, float f2) {
        return DpSize.m109823constructorimpl((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    @Stable
    /* renamed from: coerceAtLeast-YgX7TsA */
    public static final float m109757coerceAtLeastYgX7TsA(float f, float f2) {
        float m16918d;
        m16918d = _Ranges.m16918d(f, f2);
        return C1059Dp.m109734constructorimpl(m16918d);
    }

    @Stable
    /* renamed from: coerceAtMost-YgX7TsA */
    public static final float m109758coerceAtMostYgX7TsA(float f, float f2) {
        float m16913i;
        m16913i = _Ranges.m16913i(f, f2);
        return C1059Dp.m109734constructorimpl(m16913i);
    }

    @Stable
    /* renamed from: coerceIn-2z7ARbQ */
    public static final float m109759coerceIn2z7ARbQ(float f, float f2, float f3) {
        float m16909m;
        m16909m = _Ranges.m16909m(f, f2, f3);
        return C1059Dp.m109734constructorimpl(m16909m);
    }

    /* renamed from: getCenter-EaSLcWc */
    public static final long m109760getCenterEaSLcWc(long j) {
        return m109755DpOffsetYgX7TsA(C1059Dp.m109734constructorimpl(DpSize.m109832getWidthD9Ej5fM(j) / 2.0f), C1059Dp.m109734constructorimpl(DpSize.m109830getHeightD9Ej5fM(j) / 2.0f));
    }

    public static final float getDp(int i) {
        return C1059Dp.m109734constructorimpl(i);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(double d) {
    }

    public static final float getHeight(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return C1059Dp.m109734constructorimpl(dpRect.m109816getBottomD9Ej5fM() - dpRect.m109819getTopD9Ej5fM());
    }

    public static final long getSize(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return m109756DpSizeYgX7TsA(C1059Dp.m109734constructorimpl(dpRect.m109818getRightD9Ej5fM() - dpRect.m109817getLeftD9Ej5fM()), C1059Dp.m109734constructorimpl(dpRect.m109816getBottomD9Ej5fM() - dpRect.m109819getTopD9Ej5fM()));
    }

    public static final float getWidth(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return C1059Dp.m109734constructorimpl(dpRect.m109818getRightD9Ej5fM() - dpRect.m109817getLeftD9Ej5fM());
    }

    /* renamed from: isFinite-0680j_4 */
    public static final boolean m109762isFinite0680j_4(float f) {
        boolean z;
        if (f == Float.POSITIVE_INFINITY) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    /* renamed from: isSpecified-0680j_4 */
    public static final boolean m109764isSpecified0680j_4(float f) {
        return !Float.isNaN(f);
    }

    /* renamed from: isSpecified-EaSLcWc */
    public static final boolean m109766isSpecifiedEaSLcWc(long j) {
        if (j != DpSize.Companion.m109841getUnspecifiedMYxV2XQ()) {
            return true;
        }
        return false;
    }

    /* renamed from: isSpecified-jo-Fl9I */
    public static final boolean m109768isSpecifiedjoFl9I(long j) {
        if (j != DpOffset.Companion.m109804getUnspecifiedRKDOV3M()) {
            return true;
        }
        return false;
    }

    /* renamed from: isUnspecified-0680j_4 */
    public static final boolean m109770isUnspecified0680j_4(float f) {
        return Float.isNaN(f);
    }

    /* renamed from: isUnspecified-EaSLcWc */
    public static final boolean m109772isUnspecifiedEaSLcWc(long j) {
        if (j == DpSize.Companion.m109841getUnspecifiedMYxV2XQ()) {
            return true;
        }
        return false;
    }

    /* renamed from: isUnspecified-jo-Fl9I */
    public static final boolean m109774isUnspecifiedjoFl9I(long j) {
        if (j == DpOffset.Companion.m109804getUnspecifiedRKDOV3M()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: lerp-IDex15A */
    public static final long m109776lerpIDex15A(long j, long j2, float f) {
        return m109756DpSizeYgX7TsA(m109777lerpMdfbLM(DpSize.m109832getWidthD9Ej5fM(j), DpSize.m109832getWidthD9Ej5fM(j2), f), m109777lerpMdfbLM(DpSize.m109830getHeightD9Ej5fM(j), DpSize.m109830getHeightD9Ej5fM(j2), f));
    }

    @Stable
    /* renamed from: lerp-Md-fbLM */
    public static final float m109777lerpMdfbLM(float f, float f2, float f3) {
        return C1059Dp.m109734constructorimpl(MathHelpers.lerp(f, f2, f3));
    }

    @Stable
    /* renamed from: lerp-xhh869w */
    public static final long m109778lerpxhh869w(long j, long j2, float f) {
        return m109755DpOffsetYgX7TsA(m109777lerpMdfbLM(DpOffset.m109795getXD9Ej5fM(j), DpOffset.m109795getXD9Ej5fM(j2), f), m109777lerpMdfbLM(DpOffset.m109797getYD9Ej5fM(j), DpOffset.m109797getYD9Ej5fM(j2), f));
    }

    @Stable
    /* renamed from: max-YgX7TsA */
    public static final float m109779maxYgX7TsA(float f, float f2) {
        return C1059Dp.m109734constructorimpl(Math.max(f, f2));
    }

    @Stable
    /* renamed from: min-YgX7TsA */
    public static final float m109780minYgX7TsA(float f, float f2) {
        return C1059Dp.m109734constructorimpl(Math.min(f, f2));
    }

    /* renamed from: takeOrElse-D5KLDUw */
    public static final float m109781takeOrElseD5KLDUw(float f, @NotNull Functions<C1059Dp> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!(!Float.isNaN(f))) {
            return block.invoke().m109748unboximpl();
        }
        return f;
    }

    /* renamed from: takeOrElse-gVKV90s */
    public static final long m109782takeOrElsegVKV90s(long j, @NotNull Functions<DpOffset> block) {
        boolean z;
        Intrinsics.checkNotNullParameter(block, "block");
        if (j != DpOffset.Companion.m109804getUnspecifiedRKDOV3M()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return block.invoke().m109803unboximpl();
        }
        return j;
    }

    /* renamed from: takeOrElse-itqla9I */
    public static final long m109783takeOrElseitqla9I(long j, @NotNull Functions<DpSize> block) {
        boolean z;
        Intrinsics.checkNotNullParameter(block, "block");
        if (j != DpSize.Companion.m109841getUnspecifiedMYxV2XQ()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return block.invoke().m109840unboximpl();
        }
        return j;
    }

    @Stable
    /* renamed from: times-3ABfNKs */
    public static final float m109785times3ABfNKs(float f, float f2) {
        return C1059Dp.m109734constructorimpl(f * f2);
    }

    @Stable
    /* renamed from: times-6HolHcs */
    public static final long m109788times6HolHcs(int i, long j) {
        return DpSize.m109838timesGh9hcWk(j, i);
    }

    public static final float getDp(double d) {
        return C1059Dp.m109734constructorimpl((float) d);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(float f) {
    }

    @Stable
    /* renamed from: times-3ABfNKs */
    public static final float m109784times3ABfNKs(double d, float f) {
        return C1059Dp.m109734constructorimpl(((float) d) * f);
    }

    @Stable
    /* renamed from: times-6HolHcs */
    public static final long m109787times6HolHcs(float f, long j) {
        return DpSize.m109837timesGh9hcWk(j, f);
    }

    public static final float getDp(float f) {
        return C1059Dp.m109734constructorimpl(f);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(int i) {
    }

    @Stable
    /* renamed from: times-3ABfNKs */
    public static final float m109786times3ABfNKs(int i, float f) {
        return C1059Dp.m109734constructorimpl(i * f);
    }

    @Stable
    /* renamed from: getCenter-EaSLcWc$annotations */
    public static /* synthetic */ void m109761getCenterEaSLcWc$annotations(long j) {
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    @Stable
    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    @Stable
    /* renamed from: isFinite-0680j_4$annotations */
    public static /* synthetic */ void m109763isFinite0680j_4$annotations(float f) {
    }

    @Stable
    /* renamed from: isSpecified-0680j_4$annotations */
    public static /* synthetic */ void m109765isSpecified0680j_4$annotations(float f) {
    }

    @Stable
    /* renamed from: isSpecified-EaSLcWc$annotations */
    public static /* synthetic */ void m109767isSpecifiedEaSLcWc$annotations(long j) {
    }

    @Stable
    /* renamed from: isSpecified-jo-Fl9I$annotations */
    public static /* synthetic */ void m109769isSpecifiedjoFl9I$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified-0680j_4$annotations */
    public static /* synthetic */ void m109771isUnspecified0680j_4$annotations(float f) {
    }

    @Stable
    /* renamed from: isUnspecified-EaSLcWc$annotations */
    public static /* synthetic */ void m109773isUnspecifiedEaSLcWc$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified-jo-Fl9I$annotations */
    public static /* synthetic */ void m109775isUnspecifiedjoFl9I$annotations(long j) {
    }
}
