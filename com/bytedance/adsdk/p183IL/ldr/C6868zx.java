package com.bytedance.adsdk.p183IL.ldr;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.p183IL.p185bX.C6751bg;
import com.bytedance.adsdk.p183IL.p185bX.p186IL.C6730yDt;
import com.bytedance.component.sdk.annotation.FloatRange;

/* renamed from: com.bytedance.adsdk.IL.ldr.zx */
/* loaded from: classes3.dex */
public class C6868zx {

    /* renamed from: bg */
    private static final PointF f14759bg = new PointF();

    /* renamed from: IL */
    private static int m90603IL(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    /* renamed from: bX */
    public static boolean m90602bX(float f, float f2, float f3) {
        if (f >= f2 && f <= f3) {
            return true;
        }
        return false;
    }

    /* renamed from: bg */
    public static float m90600bg(float f, float f2, @FloatRange(from = 0.0d, to = 1.0d) float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: bg */
    public static int m90598bg(int i, int i2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        return (int) (i + (f * (i2 - i)));
    }

    /* renamed from: IL */
    public static float m90604IL(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: bg */
    public static PointF m90596bg(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: bg */
    public static void m90595bg(C6730yDt c6730yDt, Path path) {
        path.reset();
        PointF m90998bg = c6730yDt.m90998bg();
        path.moveTo(m90998bg.x, m90998bg.y);
        f14759bg.set(m90998bg.x, m90998bg.y);
        for (int i = 0; i < c6730yDt.m90999bX().size(); i++) {
            C6751bg c6751bg = c6730yDt.m90999bX().get(i);
            PointF m90901bg = c6751bg.m90901bg();
            PointF m90905IL = c6751bg.m90905IL();
            PointF m90903bX = c6751bg.m90903bX();
            PointF pointF = f14759bg;
            if (m90901bg.equals(pointF) && m90905IL.equals(m90903bX)) {
                path.lineTo(m90903bX.x, m90903bX.y);
            } else {
                path.cubicTo(m90901bg.x, m90901bg.y, m90905IL.x, m90905IL.y, m90903bX.x, m90903bX.y);
            }
            pointF.set(m90903bX.x, m90903bX.y);
        }
        if (c6730yDt.m91000IL()) {
            path.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static int m90601bg(float f, float f2) {
        return m90599bg((int) f, (int) f2);
    }

    /* renamed from: bg */
    private static int m90599bg(int i, int i2) {
        return i - (i2 * m90603IL(i, i2));
    }

    /* renamed from: bg */
    public static int m90597bg(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }
}
