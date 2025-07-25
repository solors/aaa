package androidx.compose.p015ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: Oklab.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.colorspace.Oklab */
/* loaded from: classes.dex */
public final class Oklab extends ColorSpace {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final float[] InverseM1;
    @NotNull
    private static final float[] InverseM2;
    @NotNull

    /* renamed from: M1 */
    private static final float[] f413M1;
    @NotNull

    /* renamed from: M2 */
    private static final float[] f414M2;

    /* compiled from: Oklab.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.colorspace.Oklab$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        float[] transform$ui_graphics_release = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
        Illuminant illuminant = Illuminant.INSTANCE;
        float[] mul3x3 = ColorSpaceKt.mul3x3(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release, illuminant.getD50().toXyz$ui_graphics_release(), illuminant.getD65().toXyz$ui_graphics_release()));
        f413M1 = mul3x3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f414M2 = fArr;
        InverseM1 = ColorSpaceKt.inverse3x3(mul3x3);
        InverseM2 = ColorSpaceKt.inverse3x3(fArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oklab(@NotNull String name, int i) {
        super(name, ColorModel.Companion.m107891getLabxdoWZVw(), i, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        ColorSpaceKt.mul3x3Float3(f413M1, v);
        double d = 0.33333334f;
        v[0] = Math.signum(v[0]) * ((float) Math.pow(Math.abs(v[0]), d));
        v[1] = Math.signum(v[1]) * ((float) Math.pow(Math.abs(v[1]), d));
        v[2] = Math.signum(v[2]) * ((float) Math.pow(Math.abs(v[2]), d));
        ColorSpaceKt.mul3x3Float3(f414M2, v);
        return v;
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i) {
        if (i == 0) {
            return 1.0f;
        }
        return 0.5f;
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i) {
        if (i == 0) {
            return 0.0f;
        }
        return -0.5f;
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] v) {
        float m16909m;
        float m16909m2;
        float m16909m3;
        Intrinsics.checkNotNullParameter(v, "v");
        m16909m = _Ranges.m16909m(v[0], 0.0f, 1.0f);
        v[0] = m16909m;
        m16909m2 = _Ranges.m16909m(v[1], -0.5f, 0.5f);
        v[1] = m16909m2;
        m16909m3 = _Ranges.m16909m(v[2], -0.5f, 0.5f);
        v[2] = m16909m3;
        ColorSpaceKt.mul3x3Float3(InverseM2, v);
        float f = v[0];
        v[0] = f * f * f;
        float f2 = v[1];
        v[1] = f2 * f2 * f2;
        float f3 = v[2];
        v[2] = f3 * f3 * f3;
        ColorSpaceKt.mul3x3Float3(InverseM1, v);
        return v;
    }
}
