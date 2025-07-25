package p032b9;

import android.view.animation.Interpolator;
import kotlin.Metadata;
import kotlin.collections._Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: b9.e */
/* loaded from: classes8.dex */
public abstract class LookupTableInterpolator implements Interpolator {
    @NotNull

    /* renamed from: a */
    private final float[] f1613a;

    /* renamed from: b */
    private final float f1614b;

    public LookupTableInterpolator(@NotNull float[] values) {
        int m17328X;
        Intrinsics.checkNotNullParameter(values, "values");
        this.f1613a = values;
        m17328X = _Arrays.m17328X(values);
        this.f1614b = 1.0f / m17328X;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        int m17328X;
        int m16912j;
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f < 1.0f) {
            m17328X = _Arrays.m17328X(this.f1613a);
            m16912j = _Ranges.m16912j((int) (m17328X * f), this.f1613a.length - 2);
            float f2 = this.f1614b;
            float f3 = (f - (m16912j * f2)) / f2;
            float[] fArr = this.f1613a;
            float f4 = fArr[m16912j];
            return f4 + (f3 * (fArr[m16912j + 1] - f4));
        }
        return 1.0f;
    }
}
