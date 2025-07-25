package p035c0;

import p690h0.GammaEvaluator;
import p690h0.MiscUtils;

/* renamed from: c0.c */
/* loaded from: classes2.dex */
public class GradientColor {

    /* renamed from: a */
    private final float[] f1714a;

    /* renamed from: b */
    private final int[] f1715b;

    public GradientColor(float[] fArr, int[] iArr) {
        this.f1714a = fArr;
        this.f1715b = iArr;
    }

    /* renamed from: a */
    public int[] m103774a() {
        return this.f1715b;
    }

    /* renamed from: b */
    public float[] m103773b() {
        return this.f1714a;
    }

    /* renamed from: c */
    public int m103772c() {
        return this.f1715b.length;
    }

    /* renamed from: d */
    public void m103771d(GradientColor gradientColor, GradientColor gradientColor2, float f) {
        if (gradientColor.f1715b.length == gradientColor2.f1715b.length) {
            for (int i = 0; i < gradientColor.f1715b.length; i++) {
                this.f1714a[i] = MiscUtils.m23865k(gradientColor.f1714a[i], gradientColor2.f1714a[i], f);
                this.f1715b[i] = GammaEvaluator.m23909c(f, gradientColor.f1715b[i], gradientColor2.f1715b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + gradientColor.f1715b.length + " vs " + gradientColor2.f1715b.length + ")");
    }
}
