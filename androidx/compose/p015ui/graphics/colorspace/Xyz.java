package androidx.compose.p015ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: Xyz.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.colorspace.Xyz */
/* loaded from: classes.dex */
public final class Xyz extends ColorSpace {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xyz(@NotNull String name, int i) {
        super(name, ColorModel.Companion.m107893getXyzxdoWZVw(), i, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    private final float clamp(float f) {
        float m16909m;
        m16909m = _Ranges.m16909m(f, -2.0f, 2.0f);
        return m16909m;
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v[0] = clamp(v[0]);
        v[1] = clamp(v[1]);
        v[2] = clamp(v[2]);
        return v;
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i) {
        return 2.0f;
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i) {
        return -2.0f;
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override // androidx.compose.p015ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v[0] = clamp(v[0]);
        v[1] = clamp(v[1]);
        v[2] = clamp(v[2]);
        return v;
    }
}
