package androidx.compose.p015ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: Lab.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.colorspace.Lab */
/* loaded from: classes.dex */
public final class Lab extends ColorSpace {

    /* renamed from: A */
    private static final float f409A = 0.008856452f;

    /* renamed from: B */
    private static final float f410B = 7.787037f;

    /* renamed from: C */
    private static final float f411C = 0.13793103f;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: D */
    private static final float f412D = 0.20689656f;

    /* compiled from: Lab.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.colorspace.Lab$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lab(@NotNull String name, int i) {
        super(name, ColorModel.Companion.m107891getLabxdoWZVw(), i, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] v) {
        float f;
        float f2;
        float f3;
        float m16909m;
        float m16909m2;
        float m16909m3;
        Intrinsics.checkNotNullParameter(v, "v");
        float f4 = v[0];
        Illuminant illuminant = Illuminant.INSTANCE;
        float f5 = f4 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f6 = v[1] / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f7 = v[2] / illuminant.getD50Xyz$ui_graphics_release()[2];
        if (f5 > f409A) {
            f = (float) Math.pow(f5, 0.33333334f);
        } else {
            f = (f5 * f410B) + f411C;
        }
        if (f6 > f409A) {
            f2 = (float) Math.pow(f6, 0.33333334f);
        } else {
            f2 = (f6 * f410B) + f411C;
        }
        if (f7 > f409A) {
            f3 = (float) Math.pow(f7, 0.33333334f);
        } else {
            f3 = (f7 * f410B) + f411C;
        }
        m16909m = _Ranges.m16909m((116.0f * f2) - 16.0f, 0.0f, 100.0f);
        v[0] = m16909m;
        m16909m2 = _Ranges.m16909m((f - f2) * 500.0f, -128.0f, 128.0f);
        v[1] = m16909m2;
        m16909m3 = _Ranges.m16909m((f2 - f3) * 200.0f, -128.0f, 128.0f);
        v[2] = m16909m3;
        return v;
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i) {
        if (i == 0) {
            return 100.0f;
        }
        return 128.0f;
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i) {
        if (i == 0) {
            return 0.0f;
        }
        return -128.0f;
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
        float f;
        float f2;
        float f3;
        Intrinsics.checkNotNullParameter(v, "v");
        m16909m = _Ranges.m16909m(v[0], 0.0f, 100.0f);
        v[0] = m16909m;
        m16909m2 = _Ranges.m16909m(v[1], -128.0f, 128.0f);
        v[1] = m16909m2;
        m16909m3 = _Ranges.m16909m(v[2], -128.0f, 128.0f);
        v[2] = m16909m3;
        float f4 = (v[0] + 16.0f) / 116.0f;
        float f5 = (v[1] * 0.002f) + f4;
        float f6 = f4 - (m16909m3 * 0.005f);
        if (f5 > f412D) {
            f = f5 * f5 * f5;
        } else {
            f = (f5 - f411C) * 0.12841855f;
        }
        if (f4 > f412D) {
            f2 = f4 * f4 * f4;
        } else {
            f2 = (f4 - f411C) * 0.12841855f;
        }
        if (f6 > f412D) {
            f3 = f6 * f6 * f6;
        } else {
            f3 = (f6 - f411C) * 0.12841855f;
        }
        Illuminant illuminant = Illuminant.INSTANCE;
        v[0] = f * illuminant.getD50Xyz$ui_graphics_release()[0];
        v[1] = f2 * illuminant.getD50Xyz$ui_graphics_release()[1];
        v[2] = f3 * illuminant.getD50Xyz$ui_graphics_release()[2];
        return v;
    }
}
