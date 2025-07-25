package p690h0;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.FloatRange;
import java.util.List;
import p001a0.CubicCurveData;
import p001a0.KeyPath;
import p035c0.ShapeData;
import p1032x.KeyPathElementContent;

/* renamed from: h0.i */
/* loaded from: classes2.dex */
public class MiscUtils {

    /* renamed from: a */
    private static PointF f91299a = new PointF();

    /* renamed from: a */
    public static PointF m23875a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    public static double m23874b(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    /* renamed from: c */
    public static float m23873c(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: d */
    public static int m23872d(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* renamed from: e */
    public static boolean m23871e(float f, float f2, float f3) {
        if (f >= f2 && f <= f3) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static int m23870f(int i, int i2) {
        boolean z;
        int i3 = i / i2;
        if ((i ^ i2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i % i2;
        if (!z && i4 != 0) {
            return i3 - 1;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m23869g(float f, float f2) {
        return m23868h((int) f, (int) f2);
    }

    /* renamed from: h */
    private static int m23868h(int i, int i2) {
        return i - (i2 * m23870f(i, i2));
    }

    /* renamed from: i */
    public static void m23867i(ShapeData shapeData, Path path) {
        path.reset();
        PointF m103719b = shapeData.m103719b();
        path.moveTo(m103719b.x, m103719b.y);
        f91299a.set(m103719b.x, m103719b.y);
        for (int i = 0; i < shapeData.m103720a().size(); i++) {
            CubicCurveData cubicCurveData = shapeData.m103720a().get(i);
            PointF m105905a = cubicCurveData.m105905a();
            PointF m105904b = cubicCurveData.m105904b();
            PointF m105903c = cubicCurveData.m105903c();
            if (m105905a.equals(f91299a) && m105904b.equals(m105903c)) {
                path.lineTo(m105903c.x, m105903c.y);
            } else {
                path.cubicTo(m105905a.x, m105905a.y, m105904b.x, m105904b.y, m105903c.x, m105903c.y);
            }
            f91299a.set(m105903c.x, m105903c.y);
        }
        if (shapeData.m103717d()) {
            path.close();
        }
    }

    /* renamed from: j */
    public static double m23866j(double d, double d2, @FloatRange(from = 0.0d, m105511to = 1.0d) double d3) {
        return d + (d3 * (d2 - d));
    }

    /* renamed from: k */
    public static float m23865k(float f, float f2, @FloatRange(from = 0.0d, m105511to = 1.0d) float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: l */
    public static int m23864l(int i, int i2, @FloatRange(from = 0.0d, m105511to = 1.0d) float f) {
        return (int) (i + (f * (i2 - i)));
    }

    /* renamed from: m */
    public static void m23863m(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2, KeyPathElementContent keyPathElementContent) {
        if (keyPath.m105891c(keyPathElementContent.getName(), i)) {
            list.add(keyPath2.m105893a(keyPathElementContent.getName()).m105885i(keyPathElementContent));
        }
    }
}
