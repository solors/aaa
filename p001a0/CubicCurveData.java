package p001a0;

import android.graphics.PointF;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: a0.a */
/* loaded from: classes2.dex */
public class CubicCurveData {

    /* renamed from: a */
    private final PointF f1a;

    /* renamed from: b */
    private final PointF f2b;

    /* renamed from: c */
    private final PointF f3c;

    public CubicCurveData() {
        this.f1a = new PointF();
        this.f2b = new PointF();
        this.f3c = new PointF();
    }

    /* renamed from: a */
    public PointF m105905a() {
        return this.f1a;
    }

    /* renamed from: b */
    public PointF m105904b() {
        return this.f2b;
    }

    /* renamed from: c */
    public PointF m105903c() {
        return this.f3c;
    }

    /* renamed from: d */
    public void m105902d(float f, float f2) {
        this.f1a.set(f, f2);
    }

    /* renamed from: e */
    public void m105901e(float f, float f2) {
        this.f2b.set(f, f2);
    }

    /* renamed from: f */
    public void m105900f(float f, float f2) {
        this.f3c.set(f, f2);
    }

    public CubicCurveData(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f1a = pointF;
        this.f2b = pointF2;
        this.f3c = pointF3;
    }
}
