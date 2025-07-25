package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.graphics.colorspace.ColorModel;
import androidx.compose.p015ui.graphics.colorspace.ColorSpace;
import androidx.compose.p015ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.p015ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p015ui.graphics.colorspace.Rgb;
import androidx.compose.p015ui.util.MathHelpers;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.ULong;

/* compiled from: Color.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.ColorKt */
/* loaded from: classes.dex */
public final class ColorKt {
    /* JADX WARN: Removed duplicated region for block: B:108:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x005c  */
    @androidx.compose.runtime.Stable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long Color(float r9, float r10, float r11, float r12, @org.jetbrains.annotations.NotNull androidx.compose.p015ui.graphics.colorspace.ColorSpace r13) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.ColorKt.Color(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long Color$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f, f2, f3, f4, colorSpace);
    }

    /* renamed from: access$getComponents-8_81llA */
    public static final /* synthetic */ float[] m107572access$getComponents8_81llA(long j) {
        return m107574getComponents8_81llA(j);
    }

    private static final float compositeComponent(float f, float f2, float f3, float f4, float f5) {
        boolean z;
        if (f5 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0.0f;
        }
        return ((f * f3) + ((f2 * f4) * (1.0f - f3))) / f5;
    }

    @Stable
    /* renamed from: compositeOver--OWjLjI */
    public static final long m107573compositeOverOWjLjI(long j, long j2) {
        boolean z;
        float f;
        boolean z2;
        float f2;
        long m107524convertvNxB06k = Color.m107524convertvNxB06k(j, Color.m107531getColorSpaceimpl(j2));
        float m107529getAlphaimpl = Color.m107529getAlphaimpl(j2);
        float m107529getAlphaimpl2 = Color.m107529getAlphaimpl(m107524convertvNxB06k);
        float f3 = 1.0f - m107529getAlphaimpl2;
        float f4 = (m107529getAlphaimpl * f3) + m107529getAlphaimpl2;
        float m107533getRedimpl = Color.m107533getRedimpl(m107524convertvNxB06k);
        float m107533getRedimpl2 = Color.m107533getRedimpl(j2);
        float f5 = 0.0f;
        int i = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
        boolean z3 = true;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = 0.0f;
        } else {
            f = ((m107533getRedimpl * m107529getAlphaimpl2) + ((m107533getRedimpl2 * m107529getAlphaimpl) * f3)) / f4;
        }
        float m107532getGreenimpl = Color.m107532getGreenimpl(m107524convertvNxB06k);
        float m107532getGreenimpl2 = Color.m107532getGreenimpl(j2);
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f2 = 0.0f;
        } else {
            f2 = ((m107532getGreenimpl * m107529getAlphaimpl2) + ((m107532getGreenimpl2 * m107529getAlphaimpl) * f3)) / f4;
        }
        float m107530getBlueimpl = Color.m107530getBlueimpl(m107524convertvNxB06k);
        float m107530getBlueimpl2 = Color.m107530getBlueimpl(j2);
        if (i != 0) {
            z3 = false;
        }
        if (!z3) {
            f5 = ((m107530getBlueimpl * m107529getAlphaimpl2) + ((m107530getBlueimpl2 * m107529getAlphaimpl) * f3)) / f4;
        }
        return Color(f, f2, f5, f4, Color.m107531getColorSpaceimpl(j2));
    }

    /* renamed from: getComponents-8_81llA */
    public static final float[] m107574getComponents8_81llA(long j) {
        return new float[]{Color.m107533getRedimpl(j), Color.m107532getGreenimpl(j), Color.m107530getBlueimpl(j), Color.m107529getAlphaimpl(j)};
    }

    /* renamed from: isSpecified-8_81llA */
    public static final boolean m107575isSpecified8_81llA(long j) {
        if (j != Color.Companion.m107563getUnspecified0d7_KjU()) {
            return true;
        }
        return false;
    }

    /* renamed from: isUnspecified-8_81llA */
    public static final boolean m107577isUnspecified8_81llA(long j) {
        if (j == Color.Companion.m107563getUnspecified0d7_KjU()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: lerp-jxsXWHM */
    public static final long m107579lerpjxsXWHM(long j, long j2, float f) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long m107524convertvNxB06k = Color.m107524convertvNxB06k(j, oklab);
        long m107524convertvNxB06k2 = Color.m107524convertvNxB06k(j2, oklab);
        float m107529getAlphaimpl = Color.m107529getAlphaimpl(m107524convertvNxB06k);
        float m107533getRedimpl = Color.m107533getRedimpl(m107524convertvNxB06k);
        float m107532getGreenimpl = Color.m107532getGreenimpl(m107524convertvNxB06k);
        float m107530getBlueimpl = Color.m107530getBlueimpl(m107524convertvNxB06k);
        float m107529getAlphaimpl2 = Color.m107529getAlphaimpl(m107524convertvNxB06k2);
        float m107533getRedimpl2 = Color.m107533getRedimpl(m107524convertvNxB06k2);
        float m107532getGreenimpl2 = Color.m107532getGreenimpl(m107524convertvNxB06k2);
        float m107530getBlueimpl2 = Color.m107530getBlueimpl(m107524convertvNxB06k2);
        return Color.m107524convertvNxB06k(Color(MathHelpers.lerp(m107533getRedimpl, m107533getRedimpl2, f), MathHelpers.lerp(m107532getGreenimpl, m107532getGreenimpl2, f), MathHelpers.lerp(m107530getBlueimpl, m107530getBlueimpl2, f), MathHelpers.lerp(m107529getAlphaimpl, m107529getAlphaimpl2, f), oklab), Color.m107531getColorSpaceimpl(j2));
    }

    @Stable
    /* renamed from: luminance-8_81llA */
    public static final float m107580luminance8_81llA(long j) {
        ColorSpace m107531getColorSpaceimpl = Color.m107531getColorSpaceimpl(j);
        if (ColorModel.m107885equalsimpl0(m107531getColorSpaceimpl.m107894getModelxdoWZVw(), ColorModel.Companion.m107892getRgbxdoWZVw())) {
            Function1<Double, Double> eotf = ((Rgb) m107531getColorSpaceimpl).getEotf();
            return saturate((float) ((eotf.invoke(Double.valueOf(Color.m107533getRedimpl(j))).doubleValue() * 0.2126d) + (eotf.invoke(Double.valueOf(Color.m107532getGreenimpl(j))).doubleValue() * 0.7152d) + (eotf.invoke(Double.valueOf(Color.m107530getBlueimpl(j))).doubleValue() * 0.0722d)));
        }
        throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m107888toStringimpl(m107531getColorSpaceimpl.m107894getModelxdoWZVw()))).toString());
    }

    private static final float saturate(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            f2 = 1.0f;
            if (f < 1.0f) {
                return f;
            }
        }
        return f2;
    }

    /* renamed from: takeOrElse-DxMtmZc */
    public static final long m107581takeOrElseDxMtmZc(long j, @NotNull Functions<Color> block) {
        boolean z;
        Intrinsics.checkNotNullParameter(block, "block");
        if (j != Color.Companion.m107563getUnspecified0d7_KjU()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return block.invoke().m107537unboximpl();
        }
        return j;
    }

    @Stable
    /* renamed from: toArgb-8_81llA */
    public static final int m107582toArgb8_81llA(long j) {
        ColorSpace m107531getColorSpaceimpl = Color.m107531getColorSpaceimpl(j);
        if (m107531getColorSpaceimpl.isSrgb()) {
            return (int) ULong.m14617c(j >>> 32);
        }
        float[] m107574getComponents8_81llA = m107574getComponents8_81llA(j);
        ColorSpaceKt.m107896connectYBCOT_4$default(m107531getColorSpaceimpl, null, 0, 3, null).transform(m107574getComponents8_81llA);
        return ((int) ((m107574getComponents8_81llA[2] * 255.0f) + 0.5f)) | (((int) ((m107574getComponents8_81llA[3] * 255.0f) + 0.5f)) << 24) | (((int) ((m107574getComponents8_81llA[0] * 255.0f) + 0.5f)) << 16) | (((int) ((m107574getComponents8_81llA[1] * 255.0f) + 0.5f)) << 8);
    }

    public static /* synthetic */ long Color$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return Color(i, i2, i3, i4);
    }

    @Stable
    public static final long Color(int i) {
        return Color.m107523constructorimpl(ULong.m14617c(ULong.m14617c(i) << 32));
    }

    @Stable
    public static final long Color(long j) {
        return Color.m107523constructorimpl(ULong.m14617c(ULong.m14617c(ULong.m14617c(j) & 4294967295L) << 32));
    }

    @Stable
    /* renamed from: isSpecified-8_81llA$annotations */
    public static /* synthetic */ void m107576isSpecified8_81llA$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified-8_81llA$annotations */
    public static /* synthetic */ void m107578isUnspecified8_81llA$annotations(long j) {
    }

    @Stable
    public static final long Color(int i, int i2, int i3, int i4) {
        return Color(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }
}
