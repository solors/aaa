package p035c0;

import android.graphics.PointF;
import androidx.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;
import p001a0.CubicCurveData;
import p690h0.C33453f;
import p690h0.MiscUtils;

/* renamed from: c0.l */
/* loaded from: classes2.dex */
public class ShapeData {

    /* renamed from: a */
    private final List<CubicCurveData> f1784a;

    /* renamed from: b */
    private PointF f1785b;

    /* renamed from: c */
    private boolean f1786c;

    public ShapeData(PointF pointF, boolean z, List<CubicCurveData> list) {
        this.f1785b = pointF;
        this.f1786c = z;
        this.f1784a = new ArrayList(list);
    }

    /* renamed from: e */
    private void m103716e(float f, float f2) {
        if (this.f1785b == null) {
            this.f1785b = new PointF();
        }
        this.f1785b.set(f, f2);
    }

    /* renamed from: a */
    public List<CubicCurveData> m103720a() {
        return this.f1784a;
    }

    /* renamed from: b */
    public PointF m103719b() {
        return this.f1785b;
    }

    /* renamed from: c */
    public void m103718c(ShapeData shapeData, ShapeData shapeData2, @FloatRange(from = 0.0d, m105511to = 1.0d) float f) {
        boolean z;
        if (this.f1785b == null) {
            this.f1785b = new PointF();
        }
        if (!shapeData.m103717d() && !shapeData2.m103717d()) {
            z = false;
        } else {
            z = true;
        }
        this.f1786c = z;
        if (shapeData.m103720a().size() != shapeData2.m103720a().size()) {
            C33453f.m23901c("Curves must have the same number of control points. Shape 1: " + shapeData.m103720a().size() + "\tShape 2: " + shapeData2.m103720a().size());
        }
        int min = Math.min(shapeData.m103720a().size(), shapeData2.m103720a().size());
        if (this.f1784a.size() < min) {
            for (int size = this.f1784a.size(); size < min; size++) {
                this.f1784a.add(new CubicCurveData());
            }
        } else if (this.f1784a.size() > min) {
            for (int size2 = this.f1784a.size() - 1; size2 >= min; size2--) {
                List<CubicCurveData> list = this.f1784a;
                list.remove(list.size() - 1);
            }
        }
        PointF m103719b = shapeData.m103719b();
        PointF m103719b2 = shapeData2.m103719b();
        m103716e(MiscUtils.m23865k(m103719b.x, m103719b2.x, f), MiscUtils.m23865k(m103719b.y, m103719b2.y, f));
        for (int size3 = this.f1784a.size() - 1; size3 >= 0; size3--) {
            CubicCurveData cubicCurveData = shapeData.m103720a().get(size3);
            CubicCurveData cubicCurveData2 = shapeData2.m103720a().get(size3);
            PointF m105905a = cubicCurveData.m105905a();
            PointF m105904b = cubicCurveData.m105904b();
            PointF m105903c = cubicCurveData.m105903c();
            PointF m105905a2 = cubicCurveData2.m105905a();
            PointF m105904b2 = cubicCurveData2.m105904b();
            PointF m105903c2 = cubicCurveData2.m105903c();
            this.f1784a.get(size3).m105902d(MiscUtils.m23865k(m105905a.x, m105905a2.x, f), MiscUtils.m23865k(m105905a.y, m105905a2.y, f));
            this.f1784a.get(size3).m105901e(MiscUtils.m23865k(m105904b.x, m105904b2.x, f), MiscUtils.m23865k(m105904b.y, m105904b2.y, f));
            this.f1784a.get(size3).m105900f(MiscUtils.m23865k(m105903c.x, m105903c2.x, f), MiscUtils.m23865k(m105903c.y, m105903c2.y, f));
        }
    }

    /* renamed from: d */
    public boolean m103717d() {
        return this.f1786c;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f1784a.size() + "closed=" + this.f1786c + '}';
    }

    public ShapeData() {
        this.f1784a = new ArrayList();
    }
}
