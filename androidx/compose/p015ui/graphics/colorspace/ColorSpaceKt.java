package androidx.compose.p015ui.graphics.colorspace;

import androidx.compose.p015ui.graphics.colorspace.ColorModel;
import androidx.compose.p015ui.graphics.colorspace.Connector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ColorSpace.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.colorspace.ColorSpaceKt */
/* loaded from: classes.dex */
public final class ColorSpaceKt {
    public static final double absRcpResponse(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7;
        if (d < 0.0d) {
            d7 = -d;
        } else {
            d7 = d;
        }
        return Math.copySign(rcpResponse(d7, d2, d3, d4, d5, d6), d);
    }

    public static final double absResponse(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7;
        if (d < 0.0d) {
            d7 = -d;
        } else {
            d7 = d;
        }
        return Math.copySign(response(d7, d2, d3, d4, d5, d6), d);
    }

    @NotNull
    public static final ColorSpace adapt(@NotNull ColorSpace colorSpace, @NotNull WhitePoint whitePoint) {
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        return adapt$default(colorSpace, whitePoint, null, 2, null);
    }

    public static /* synthetic */ ColorSpace adapt$default(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation, int i, Object obj) {
        if ((i & 2) != 0) {
            adaptation = Adaptation.Companion.getBradford();
        }
        return adapt(colorSpace, whitePoint, adaptation);
    }

    @NotNull
    public static final float[] chromaticAdaptation(@NotNull float[] matrix, @NotNull float[] srcWhitePoint, @NotNull float[] dstWhitePoint) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(srcWhitePoint, "srcWhitePoint");
        Intrinsics.checkNotNullParameter(dstWhitePoint, "dstWhitePoint");
        float[] mul3x3Float3 = mul3x3Float3(matrix, srcWhitePoint);
        float[] mul3x3Float32 = mul3x3Float3(matrix, dstWhitePoint);
        return mul3x3(inverse3x3(matrix), mul3x3Diag(new float[]{mul3x3Float32[0] / mul3x3Float3[0], mul3x3Float32[1] / mul3x3Float3[1], mul3x3Float32[2] / mul3x3Float3[2]}, matrix));
    }

    public static final boolean compare(@NotNull TransferParameters a, @Nullable TransferParameters transferParameters) {
        Intrinsics.checkNotNullParameter(a, "a");
        return transferParameters != null && Math.abs(a.getA() - transferParameters.getA()) < 0.001d && Math.abs(a.getB() - transferParameters.getB()) < 0.001d && Math.abs(a.getC() - transferParameters.getC()) < 0.001d && Math.abs(a.getD() - transferParameters.getD()) < 0.002d && Math.abs(a.getE() - transferParameters.getE()) < 0.001d && Math.abs(a.getF() - transferParameters.getF()) < 0.001d && Math.abs(a.getGamma() - transferParameters.getGamma()) < 0.001d;
    }

    @NotNull
    /* renamed from: connect-YBCOT_4 */
    public static final Connector m107895connectYBCOT_4(@NotNull ColorSpace connect, @NotNull ColorSpace destination, int i) {
        Intrinsics.checkNotNullParameter(connect, "$this$connect");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (connect == destination) {
            return Connector.Companion.identity$ui_graphics_release(connect);
        }
        long m107894getModelxdoWZVw = connect.m107894getModelxdoWZVw();
        ColorModel.Companion companion = ColorModel.Companion;
        if (ColorModel.m107885equalsimpl0(m107894getModelxdoWZVw, companion.m107892getRgbxdoWZVw()) && ColorModel.m107885equalsimpl0(destination.m107894getModelxdoWZVw(), companion.m107892getRgbxdoWZVw())) {
            return new Connector.RgbConnector((Rgb) connect, (Rgb) destination, i, null);
        }
        return new Connector(connect, destination, i, null);
    }

    /* renamed from: connect-YBCOT_4$default */
    public static /* synthetic */ Connector m107896connectYBCOT_4$default(ColorSpace colorSpace, ColorSpace colorSpace2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            colorSpace2 = ColorSpaces.INSTANCE.getSrgb();
        }
        if ((i2 & 2) != 0) {
            i = RenderIntent.Companion.m107909getPerceptualuksYyKA();
        }
        return m107895connectYBCOT_4(colorSpace, colorSpace2, i);
    }

    @NotNull
    public static final float[] inverse3x3(@NotNull float[] m) {
        Intrinsics.checkNotNullParameter(m, "m");
        float f = m[0];
        float f2 = m[3];
        float f3 = m[6];
        float f4 = m[1];
        float f5 = m[4];
        float f6 = m[7];
        float f7 = m[2];
        float f8 = m[5];
        float f9 = m[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        float[] fArr = new float[m.length];
        fArr[0] = f10 / f13;
        fArr[1] = f11 / f13;
        fArr[2] = f12 / f13;
        fArr[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr;
    }

    @NotNull
    public static final float[] mul3x3(@NotNull float[] lhs, @NotNull float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f = lhs[3];
        float f2 = rhs[1];
        float f3 = lhs[6];
        float f4 = rhs[2];
        float f5 = lhs[1];
        float f6 = rhs[0];
        float f7 = lhs[4];
        float f8 = lhs[7];
        float f9 = lhs[5];
        float f10 = lhs[8];
        float f11 = lhs[0];
        float f12 = rhs[4];
        float f13 = (rhs[3] * f11) + (f * f12);
        float f14 = rhs[5];
        float f15 = lhs[1];
        float f16 = rhs[3];
        float f17 = lhs[2];
        float f18 = f11 * rhs[6];
        float f19 = lhs[3];
        float f20 = rhs[7];
        float f21 = f18 + (f19 * f20);
        float f22 = rhs[8];
        float f23 = rhs[6];
        return new float[]{(lhs[0] * rhs[0]) + (f * f2) + (f3 * f4), (f5 * f6) + (f2 * f7) + (f8 * f4), (lhs[2] * f6) + (rhs[1] * f9) + (f4 * f10), f13 + (f3 * f14), (f15 * f16) + (f7 * f12) + (f8 * f14), (f16 * f17) + (f9 * rhs[4]) + (f14 * f10), f21 + (f3 * f22), (f15 * f23) + (lhs[4] * f20) + (f8 * f22), (f17 * f23) + (lhs[5] * rhs[7]) + (f10 * f22)};
    }

    @NotNull
    public static final float[] mul3x3Diag(@NotNull float[] lhs, @NotNull float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f = lhs[0];
        float f2 = lhs[1];
        float f3 = lhs[2];
        return new float[]{lhs[0] * rhs[0], lhs[1] * rhs[1], lhs[2] * rhs[2], rhs[3] * f, rhs[4] * f2, rhs[5] * f3, f * rhs[6], f2 * rhs[7], f3 * rhs[8]};
    }

    @NotNull
    public static final float[] mul3x3Float3(@NotNull float[] lhs, @NotNull float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f = rhs[0];
        float f2 = rhs[1];
        float f3 = rhs[2];
        rhs[0] = (lhs[0] * f) + (lhs[3] * f2) + (lhs[6] * f3);
        rhs[1] = (lhs[1] * f) + (lhs[4] * f2) + (lhs[7] * f3);
        rhs[2] = (lhs[2] * f) + (lhs[5] * f2) + (lhs[8] * f3);
        return rhs;
    }

    public static final double rcpResponse(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    public static final double response(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d6) : d * d4;
    }

    @NotNull
    public static final ColorSpace adapt(@NotNull ColorSpace colorSpace, @NotNull WhitePoint whitePoint, @NotNull Adaptation adaptation) {
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(adaptation, "adaptation");
        if (ColorModel.m107885equalsimpl0(colorSpace.m107894getModelxdoWZVw(), ColorModel.Companion.m107892getRgbxdoWZVw())) {
            Rgb rgb = (Rgb) colorSpace;
            if (compare(rgb.getWhitePoint(), whitePoint)) {
                return colorSpace;
            }
            return new Rgb(rgb, mul3x3(chromaticAdaptation(adaptation.getTransform$ui_graphics_release(), rgb.getWhitePoint().toXyz$ui_graphics_release(), whitePoint.toXyz$ui_graphics_release()), rgb.getTransform$ui_graphics_release()), whitePoint);
        }
        return colorSpace;
    }

    public static final double rcpResponse(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 * d4 ? (Math.pow(d - d6, 1.0d / d8) - d3) / d2 : (d - d7) / d4;
    }

    public static final double response(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d8) + d6 : (d4 * d) + d7;
    }

    public static final boolean compare(@NotNull WhitePoint a, @NotNull WhitePoint b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        if (a == b) {
            return true;
        }
        return Math.abs(a.getX() - b.getX()) < 0.001f && Math.abs(a.getY() - b.getY()) < 0.001f;
    }

    public static final boolean compare(@NotNull float[] a, @NotNull float[] b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        if (a == b) {
            return true;
        }
        int length = a.length;
        for (int i = 0; i < length; i++) {
            if (Float.compare(a[i], b[i]) != 0 && Math.abs(a[i] - b[i]) > 0.001f) {
                return false;
            }
        }
        return true;
    }
}
