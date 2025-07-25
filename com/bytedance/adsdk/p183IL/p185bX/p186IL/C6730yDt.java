package com.bytedance.adsdk.p183IL.p185bX.p186IL;

import android.graphics.PointF;
import com.bytedance.adsdk.p183IL.ldr.C6868zx;
import com.bytedance.adsdk.p183IL.p185bX.C6751bg;
import com.bytedance.component.sdk.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.bX.IL.yDt */
/* loaded from: classes3.dex */
public class C6730yDt {

    /* renamed from: IL */
    private PointF f14336IL;

    /* renamed from: bX */
    private boolean f14337bX;

    /* renamed from: bg */
    private final List<C6751bg> f14338bg;

    public C6730yDt(PointF pointF, boolean z, List<C6751bg> list) {
        this.f14336IL = pointF;
        this.f14337bX = z;
        this.f14338bg = new ArrayList(list);
    }

    /* renamed from: IL */
    public boolean m91000IL() {
        return this.f14337bX;
    }

    /* renamed from: bX */
    public List<C6751bg> m90999bX() {
        return this.f14338bg;
    }

    /* renamed from: bg */
    public void m90997bg(float f, float f2) {
        if (this.f14336IL == null) {
            this.f14336IL = new PointF();
        }
        this.f14336IL.set(f, f2);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f14338bg.size() + "closed=" + this.f14337bX + '}';
    }

    /* renamed from: bg */
    public PointF m90998bg() {
        return this.f14336IL;
    }

    public C6730yDt() {
        this.f14338bg = new ArrayList();
    }

    /* renamed from: bg */
    public void m90995bg(boolean z) {
        this.f14337bX = z;
    }

    /* renamed from: bg */
    public void m90996bg(C6730yDt c6730yDt, C6730yDt c6730yDt2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (this.f14336IL == null) {
            this.f14336IL = new PointF();
        }
        this.f14337bX = c6730yDt.m91000IL() || c6730yDt2.m91000IL();
        if (c6730yDt.m90999bX().size() != c6730yDt2.m90999bX().size()) {
            c6730yDt.m90999bX().size();
            c6730yDt2.m90999bX().size();
        }
        int min = Math.min(c6730yDt.m90999bX().size(), c6730yDt2.m90999bX().size());
        if (this.f14338bg.size() < min) {
            for (int size = this.f14338bg.size(); size < min; size++) {
                this.f14338bg.add(new C6751bg());
            }
        } else if (this.f14338bg.size() > min) {
            for (int size2 = this.f14338bg.size() - 1; size2 >= min; size2--) {
                List<C6751bg> list = this.f14338bg;
                list.remove(list.size() - 1);
            }
        }
        PointF m90998bg = c6730yDt.m90998bg();
        PointF m90998bg2 = c6730yDt2.m90998bg();
        m90997bg(C6868zx.m90600bg(m90998bg.x, m90998bg2.x, f), C6868zx.m90600bg(m90998bg.y, m90998bg2.y, f));
        for (int size3 = this.f14338bg.size() - 1; size3 >= 0; size3--) {
            C6751bg c6751bg = c6730yDt.m90999bX().get(size3);
            C6751bg c6751bg2 = c6730yDt2.m90999bX().get(size3);
            PointF m90901bg = c6751bg.m90901bg();
            PointF m90905IL = c6751bg.m90905IL();
            PointF m90903bX = c6751bg.m90903bX();
            PointF m90901bg2 = c6751bg2.m90901bg();
            PointF m90905IL2 = c6751bg2.m90905IL();
            PointF m90903bX2 = c6751bg2.m90903bX();
            this.f14338bg.get(size3).m90900bg(C6868zx.m90600bg(m90901bg.x, m90901bg2.x, f), C6868zx.m90600bg(m90901bg.y, m90901bg2.y, f));
            this.f14338bg.get(size3).m90904IL(C6868zx.m90600bg(m90905IL.x, m90905IL2.x, f), C6868zx.m90600bg(m90905IL.y, m90905IL2.y, f));
            this.f14338bg.get(size3).m90902bX(C6868zx.m90600bg(m90903bX.x, m90903bX2.x, f), C6868zx.m90600bg(m90903bX.y, m90903bX2.y, f));
        }
    }
}
