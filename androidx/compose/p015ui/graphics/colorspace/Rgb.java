package androidx.compose.p015ui.graphics.colorspace;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Rgb.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.colorspace.Rgb */
/* loaded from: classes.dex */
public final class Rgb extends ColorSpace {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Function1<Double, Double> DoubleIdentity = Rgb$Companion$DoubleIdentity$1.INSTANCE;
    @NotNull
    private final Function1<Double, Double> eotf;
    @NotNull
    private final Function1<Double, Double> eotfOrig;
    @NotNull
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;
    @NotNull
    private final Function1<Double, Double> oetf;
    @NotNull
    private final Function1<Double, Double> oetfOrig;
    @NotNull
    private final float[] primaries;
    @Nullable
    private final TransferParameters transferParameters;
    @NotNull
    private final float[] transform;
    @NotNull
    private final WhitePoint whitePoint;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Rgb.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$1 */
    /* loaded from: classes.dex */
    public static final class C08491 extends Lambda implements Function1<Double, Double> {
        final /* synthetic */ TransferParameters $function;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08491(TransferParameters transferParameters) {
            super(1);
            this.$function = transferParameters;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Double invoke(Double d) {
            return invoke(d.doubleValue());
        }

        @NotNull
        public final Double invoke(double d) {
            return Double.valueOf(ColorSpaceKt.rcpResponse(d, this.$function.getA(), this.$function.getB(), this.$function.getC(), this.$function.getD(), this.$function.getGamma()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Rgb.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$2 */
    /* loaded from: classes.dex */
    public static final class C08502 extends Lambda implements Function1<Double, Double> {
        final /* synthetic */ TransferParameters $function;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08502(TransferParameters transferParameters) {
            super(1);
            this.$function = transferParameters;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Double invoke(Double d) {
            return invoke(d.doubleValue());
        }

        @NotNull
        public final Double invoke(double d) {
            return Double.valueOf(ColorSpaceKt.rcpResponse(d, this.$function.getA(), this.$function.getB(), this.$function.getC(), this.$function.getD(), this.$function.getE(), this.$function.getF(), this.$function.getGamma()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Rgb.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$3 */
    /* loaded from: classes.dex */
    public static final class C08513 extends Lambda implements Function1<Double, Double> {
        final /* synthetic */ TransferParameters $function;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08513(TransferParameters transferParameters) {
            super(1);
            this.$function = transferParameters;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Double invoke(Double d) {
            return invoke(d.doubleValue());
        }

        @NotNull
        public final Double invoke(double d) {
            return Double.valueOf(ColorSpaceKt.response(d, this.$function.getA(), this.$function.getB(), this.$function.getC(), this.$function.getD(), this.$function.getGamma()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Rgb.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$4 */
    /* loaded from: classes.dex */
    public static final class C08524 extends Lambda implements Function1<Double, Double> {
        final /* synthetic */ TransferParameters $function;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08524(TransferParameters transferParameters) {
            super(1);
            this.$function = transferParameters;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Double invoke(Double d) {
            return invoke(d.doubleValue());
        }

        @NotNull
        public final Double invoke(double d) {
            return Double.valueOf(ColorSpaceKt.response(d, this.$function.getA(), this.$function.getB(), this.$function.getC(), this.$function.getD(), this.$function.getE(), this.$function.getF(), this.$function.getGamma()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Rgb.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$5 */
    /* loaded from: classes.dex */
    public static final class C08535 extends Lambda implements Function1<Double, Double> {
        final /* synthetic */ double $gamma;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08535(double d) {
            super(1);
            this.$gamma = d;
        }

        @NotNull
        public final Double invoke(double d) {
            if (d < 0.0d) {
                d = 0.0d;
            }
            return Double.valueOf(Math.pow(d, 1.0d / this.$gamma));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Double invoke(Double d) {
            return invoke(d.doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Rgb.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$6 */
    /* loaded from: classes.dex */
    public static final class C08546 extends Lambda implements Function1<Double, Double> {
        final /* synthetic */ double $gamma;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08546(double d) {
            super(1);
            this.$gamma = d;
        }

        @NotNull
        public final Double invoke(double d) {
            if (d < 0.0d) {
                d = 0.0d;
            }
            return Double.valueOf(Math.pow(d, this.$gamma));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Double invoke(Double d) {
            return invoke(d.doubleValue());
        }
    }

    /* compiled from: Rgb.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float area(float[] fArr) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            if (f7 < 0.0f) {
                return -f7;
            }
            return f7;
        }

        private final boolean compare(double d, Function1<? super Double, Double> function1, Function1<? super Double, Double> function12) {
            if (Math.abs(function1.invoke(Double.valueOf(d)).doubleValue() - function12.invoke(Double.valueOf(d)).doubleValue()) <= 0.001d) {
                return true;
            }
            return false;
        }

        public final WhitePoint computeWhitePoint(float[] fArr) {
            float[] mul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 1.0f, 1.0f});
            float f = mul3x3Float3[0];
            float f2 = mul3x3Float3[1];
            float f3 = f + f2 + mul3x3Float3[2];
            return new WhitePoint(f / f3, f2 / f3);
        }

        public final float[] computeXYZMatrix(float[] fArr, WhitePoint whitePoint) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float x = whitePoint.getX();
            float y = whitePoint.getY();
            float f7 = 1;
            float f8 = (f7 - f) / f2;
            float f9 = f / f2;
            float f10 = (f3 / f4) - f9;
            float f11 = (x / y) - f9;
            float f12 = ((f7 - f3) / f4) - f8;
            float f13 = (f5 / f6) - f9;
            float f14 = (((((f7 - x) / y) - f8) * f10) - (f11 * f12)) / (((((f7 - f5) / f6) - f8) * f10) - (f12 * f13));
            float f15 = (f11 - (f13 * f14)) / f10;
            float f16 = (1.0f - f15) - f14;
            float f17 = f16 / f2;
            float f18 = f15 / f4;
            float f19 = f14 / f6;
            return new float[]{f17 * f, f16, f17 * ((1.0f - f) - f2), f18 * f3, f15, f18 * ((1.0f - f3) - f4), f19 * f5, f14, f19 * ((1.0f - f5) - f6)};
        }

        private final boolean contains(float[] fArr, float[] fArr2) {
            float f = fArr[0] - fArr2[0];
            float f2 = fArr[1] - fArr2[1];
            float[] fArr3 = {f, f2, fArr[2] - fArr2[2], fArr[3] - fArr2[3], fArr[4] - fArr2[4], fArr[5] - fArr2[5]};
            if (cross(f, f2, fArr2[0] - fArr2[4], fArr2[1] - fArr2[5]) < 0.0f || cross(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) < 0.0f || cross(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) < 0.0f || cross(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) < 0.0f || cross(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) < 0.0f || cross(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) < 0.0f) {
                return false;
            }
            return true;
        }

        private final float cross(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public final boolean isSrgb(float[] fArr, WhitePoint whitePoint, Function1<? super Double, Double> function1, Function1<? super Double, Double> function12, float f, float f2, int i) {
            boolean z;
            boolean z2;
            if (i == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (!ColorSpaceKt.compare(fArr, colorSpaces.getSrgbPrimaries$ui_graphics_release()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65())) {
                return false;
            }
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (f2 == 1.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            Rgb srgb = colorSpaces.getSrgb();
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!compare(d, function1, srgb.getOetfOrig$ui_graphics_release()) || !compare(d, function12, srgb.getEotfOrig$ui_graphics_release())) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isWideGamut(float[] fArr, float f, float f2) {
            float area = area(fArr);
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if ((area / area(colorSpaces.getNtsc1953Primaries$ui_graphics_release()) > 0.9f && contains(fArr, colorSpaces.getSrgbPrimaries$ui_graphics_release())) || (f < 0.0f && f2 > 1.0f)) {
                return true;
            }
            return false;
        }

        public final float[] xyPrimaries(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length != 9) {
                _ArraysJvm.m17391n(fArr, fArr2, 0, 0, 6, 6, null);
            } else {
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = f + f2 + fArr[2];
                fArr2[0] = f / f3;
                fArr2[1] = f2 / f3;
                float f4 = fArr[3];
                float f5 = fArr[4];
                float f6 = f4 + f5 + fArr[5];
                fArr2[2] = f4 / f6;
                fArr2[3] = f5 / f6;
                float f7 = fArr[6];
                float f8 = fArr[7];
                float f9 = f7 + f8 + fArr[8];
                fArr2[4] = f7 / f9;
                fArr2[5] = f8 / f9;
            }
            return fArr2;
        }

        @NotNull
        public final float[] computePrimaries$ui_graphics_release(@NotNull float[] toXYZ) {
            Intrinsics.checkNotNullParameter(toXYZ, "toXYZ");
            float[] mul3x3Float3 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 0.0f, 0.0f});
            float[] mul3x3Float32 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 1.0f, 0.0f});
            float[] mul3x3Float33 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 0.0f, 1.0f});
            float f = mul3x3Float3[0];
            float f2 = mul3x3Float3[1];
            float f3 = f + f2 + mul3x3Float3[2];
            float f4 = mul3x3Float32[0] + mul3x3Float32[1] + mul3x3Float32[2];
            float f5 = mul3x3Float33[0] + mul3x3Float33[1] + mul3x3Float33[2];
            return new float[]{f / f3, f2 / f3, mul3x3Float32[0] / f4, mul3x3Float32[1] / f4, mul3x3Float33[0] / f5, mul3x3Float33[1] / f5};
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @Nullable float[] fArr, @NotNull Function1<? super Double, Double> oetf, @NotNull Function1<? super Double, Double> eotf, float f, float f2, @Nullable TransferParameters transferParameters, int i) {
        super(name, ColorModel.Companion.m107892getRgbxdoWZVw(), i, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(oetf, "oetf");
        Intrinsics.checkNotNullParameter(eotf, "eotf");
        this.whitePoint = whitePoint;
        this.min = f;
        this.max = f2;
        this.transferParameters = transferParameters;
        this.oetfOrig = oetf;
        this.oetf = new Rgb$oetf$1(this);
        this.eotfOrig = eotf;
        this.eotf = new Rgb$eotf$1(this);
        if (primaries.length != 6 && primaries.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f < f2) {
            Companion companion = Companion;
            float[] xyPrimaries = companion.xyPrimaries(primaries);
            this.primaries = xyPrimaries;
            if (fArr == null) {
                this.transform = companion.computeXYZMatrix(xyPrimaries, whitePoint);
            } else if (fArr.length == 9) {
                this.transform = fArr;
            } else {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr.length);
            }
            this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
            this.isWideGamut = companion.isWideGamut(xyPrimaries, f, f2);
            this.isSrgb = companion.isSrgb(xyPrimaries, whitePoint, oetf, eotf, f, f2, i);
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.m17075f(Reflection.m17042b(Rgb.class), Reflection.m17042b(obj.getClass())) || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !Intrinsics.m17075f(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return Intrinsics.m17075f(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (!Intrinsics.m17075f(this.oetfOrig, rgb.oetfOrig)) {
            return false;
        }
        return Intrinsics.m17075f(this.eotfOrig, rgb.eotfOrig);
    }

    @NotNull
    public final float[] fromLinear(float f, float f2, float f3) {
        return fromLinear(new float[]{f, f2, f3});
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, v);
        v[0] = (float) this.oetf.invoke(Double.valueOf(v[0])).doubleValue();
        v[1] = (float) this.oetf.invoke(Double.valueOf(v[1])).doubleValue();
        v[2] = (float) this.oetf.invoke(Double.valueOf(v[2])).doubleValue();
        return v;
    }

    @NotNull
    public final Function1<Double, Double> getEotf() {
        return this.eotf;
    }

    @NotNull
    public final Function1<Double, Double> getEotfOrig$ui_graphics_release() {
        return this.eotfOrig;
    }

    @NotNull
    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    public final float[] getInverseTransform$ui_graphics_release() {
        return this.inverseTransform;
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i) {
        return this.max;
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i) {
        return this.min;
    }

    @NotNull
    public final Function1<Double, Double> getOetf() {
        return this.oetf;
    }

    @NotNull
    public final Function1<Double, Double> getOetfOrig$ui_graphics_release() {
        return this.oetfOrig;
    }

    @NotNull
    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    public final float[] getPrimaries$ui_graphics_release() {
        return this.primaries;
    }

    @Nullable
    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    @NotNull
    public final float[] getTransform() {
        float[] fArr = this.transform;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    public final float[] getTransform$ui_graphics_release() {
        return this.transform;
    }

    @NotNull
    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        boolean z;
        int i;
        int i2;
        int hashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f = this.min;
        boolean z2 = true;
        int i3 = 0;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        float f2 = this.max;
        if (f2 != 0.0f) {
            z2 = false;
        }
        if (!z2) {
            i2 = Float.floatToIntBits(f2);
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            i3 = transferParameters.hashCode();
        }
        int i6 = i5 + i3;
        if (this.transferParameters == null) {
            return (((i6 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode();
        }
        return i6;
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    public boolean isSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return this.isWideGamut;
    }

    @NotNull
    public final float[] toLinear(float f, float f2, float f3) {
        return toLinear(new float[]{f, f2, f3});
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v[0] = (float) this.eotf.invoke(Double.valueOf(v[0])).doubleValue();
        v[1] = (float) this.eotf.invoke(Double.valueOf(v[1])).doubleValue();
        v[2] = (float) this.eotf.invoke(Double.valueOf(v[2])).doubleValue();
        return ColorSpaceKt.mul3x3Float3(this.transform, v);
    }

    @NotNull
    public final float[] fromLinear(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v[0] = (float) this.oetf.invoke(Double.valueOf(v[0])).doubleValue();
        v[1] = (float) this.oetf.invoke(Double.valueOf(v[1])).doubleValue();
        v[2] = (float) this.oetf.invoke(Double.valueOf(v[2])).doubleValue();
        return v;
    }

    @NotNull
    public final float[] getInverseTransform(@NotNull float[] inverseTransform) {
        float[] m17391n;
        Intrinsics.checkNotNullParameter(inverseTransform, "inverseTransform");
        m17391n = _ArraysJvm.m17391n(this.inverseTransform, inverseTransform, 0, 0, 0, 14, null);
        return m17391n;
    }

    @NotNull
    public final float[] getPrimaries(@NotNull float[] primaries) {
        float[] m17391n;
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        m17391n = _ArraysJvm.m17391n(this.primaries, primaries, 0, 0, 0, 14, null);
        return m17391n;
    }

    @NotNull
    public final float[] getTransform(@NotNull float[] transform) {
        float[] m17391n;
        Intrinsics.checkNotNullParameter(transform, "transform");
        m17391n = _ArraysJvm.m17391n(this.transform, transform, 0, 0, 0, 14, null);
        return m17391n;
    }

    @NotNull
    public final float[] toLinear(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v[0] = (float) this.eotf.invoke(Double.valueOf(v[0])).doubleValue();
        v[1] = (float) this.eotf.invoke(Double.valueOf(v[1])).doubleValue();
        v[2] = (float) this.eotf.invoke(Double.valueOf(v[2])).doubleValue();
        return v;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Rgb(@org.jetbrains.annotations.NotNull java.lang.String r14, @org.jetbrains.annotations.NotNull float[] r15, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Double, java.lang.Double> r16, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Double, java.lang.Double> r17) {
        /*
            r13 = this;
            r0 = r15
            java.lang.String r1 = "name"
            r3 = r14
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            java.lang.String r1 = "toXYZ"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            java.lang.String r1 = "oetf"
            r7 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            java.lang.String r1 = "eotf"
            r8 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r1 = androidx.compose.p015ui.graphics.colorspace.Rgb.Companion
            float[] r4 = r1.computePrimaries$ui_graphics_release(r15)
            androidx.compose.ui.graphics.colorspace.WhitePoint r5 = androidx.compose.p015ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r1, r15)
            r6 = 0
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r12 = -1
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @NotNull Function1<? super Double, Double> oetf, @NotNull Function1<? super Double, Double> eotf, float f, float f2) {
        this(name, primaries, whitePoint, null, oetf, eotf, f, f2, null, -1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(oetf, "oetf");
        Intrinsics.checkNotNullParameter(eotf, "eotf");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Rgb(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull float[] r9, @org.jetbrains.annotations.NotNull androidx.compose.p015ui.graphics.colorspace.TransferParameters r10) {
        /*
            r7 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "toXYZ"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "function"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = androidx.compose.p015ui.graphics.colorspace.Rgb.Companion
            float[] r3 = r0.computePrimaries$ui_graphics_release(r9)
            androidx.compose.ui.graphics.colorspace.WhitePoint r4 = androidx.compose.p015ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r0, r9)
            r6 = -1
            r1 = r7
            r2 = r8
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.TransferParameters):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @NotNull TransferParameters function) {
        this(name, primaries, whitePoint, function, -1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(function, "function");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Rgb(@org.jetbrains.annotations.NotNull java.lang.String r14, @org.jetbrains.annotations.NotNull float[] r15, @org.jetbrains.annotations.NotNull androidx.compose.p015ui.graphics.colorspace.WhitePoint r16, @org.jetbrains.annotations.NotNull androidx.compose.p015ui.graphics.colorspace.TransferParameters r17, int r18) {
        /*
            r13 = this;
            r9 = r17
            java.lang.String r0 = "name"
            r1 = r14
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "primaries"
            r2 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "whitePoint"
            r3 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "function"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r4 = 0
            double r5 = r17.getE()
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r0 != 0) goto L29
            r0 = r5
            goto L2a
        L29:
            r0 = r6
        L2a:
            if (r0 == 0) goto L3f
            double r10 = r17.getF()
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L36
            r0 = r5
            goto L37
        L36:
            r0 = r6
        L37:
            if (r0 == 0) goto L3f
            androidx.compose.ui.graphics.colorspace.Rgb$1 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$1
            r0.<init>(r9)
            goto L44
        L3f:
            androidx.compose.ui.graphics.colorspace.Rgb$2 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$2
            r0.<init>(r9)
        L44:
            r10 = r0
            double r11 = r17.getE()
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 != 0) goto L4f
            r0 = r5
            goto L50
        L4f:
            r0 = r6
        L50:
            if (r0 == 0) goto L64
            double r11 = r17.getF()
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 != 0) goto L5b
            goto L5c
        L5b:
            r5 = r6
        L5c:
            if (r5 == 0) goto L64
            androidx.compose.ui.graphics.colorspace.Rgb$3 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$3
            r0.<init>(r9)
            goto L69
        L64:
            androidx.compose.ui.graphics.colorspace.Rgb$4 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$4
            r0.<init>(r9)
        L69:
            r6 = r0
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r10
            r9 = r17
            r10 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, androidx.compose.ui.graphics.colorspace.TransferParameters, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Rgb(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull float[] r12, double r13) {
        /*
            r10 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "toXYZ"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = androidx.compose.p015ui.graphics.colorspace.Rgb.Companion
            float[] r3 = r0.computePrimaries$ui_graphics_release(r12)
            androidx.compose.ui.graphics.colorspace.WhitePoint r4 = androidx.compose.p015ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r0, r12)
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = -1
            r1 = r10
            r2 = r11
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], double):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, double d) {
        this(name, primaries, whitePoint, d, 0.0f, 1.0f, -1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Rgb(@org.jetbrains.annotations.NotNull java.lang.String r24, @org.jetbrains.annotations.NotNull float[] r25, @org.jetbrains.annotations.NotNull androidx.compose.p015ui.graphics.colorspace.WhitePoint r26, double r27, float r29, float r30, int r31) {
        /*
            r23 = this;
            r1 = r27
            java.lang.String r0 = "name"
            r15 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "primaries"
            r13 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "whitePoint"
            r14 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r17 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L23
            r5 = r3
            goto L24
        L23:
            r5 = r4
        L24:
            if (r5 == 0) goto L29
            kotlin.jvm.functions.Function1<java.lang.Double, java.lang.Double> r5 = androidx.compose.p015ui.graphics.colorspace.Rgb.DoubleIdentity
            goto L2e
        L29:
            androidx.compose.ui.graphics.colorspace.Rgb$5 r5 = new androidx.compose.ui.graphics.colorspace.Rgb$5
            r5.<init>(r1)
        L2e:
            r18 = r5
            if (r0 != 0) goto L33
            goto L34
        L33:
            r3 = r4
        L34:
            if (r3 == 0) goto L39
            kotlin.jvm.functions.Function1<java.lang.Double, java.lang.Double> r0 = androidx.compose.p015ui.graphics.colorspace.Rgb.DoubleIdentity
            goto L3e
        L39:
            androidx.compose.ui.graphics.colorspace.Rgb$6 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$6
            r0.<init>(r1)
        L3e:
            r19 = r0
            androidx.compose.ui.graphics.colorspace.TransferParameters r20 = new androidx.compose.ui.graphics.colorspace.TransferParameters
            r0 = r20
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r21 = 0
            r13 = r21
            r16 = 96
            r15 = r16
            r16 = 0
            r1 = r27
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r29
            r9 = r30
            r10 = r20
            r11 = r31
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, double, float, float, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull Rgb colorSpace, @NotNull float[] transform, @NotNull WhitePoint whitePoint) {
        this(colorSpace.getName(), colorSpace.primaries, whitePoint, transform, colorSpace.oetfOrig, colorSpace.eotfOrig, colorSpace.min, colorSpace.max, colorSpace.transferParameters, -1);
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
    }
}
