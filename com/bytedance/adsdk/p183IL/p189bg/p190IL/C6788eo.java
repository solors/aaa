package com.bytedance.adsdk.p183IL.p189bg.p190IL;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.bytedance.adsdk.p183IL.p192iR.C6838bg;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.bg.IL.eo */
/* loaded from: classes3.dex */
public class C6788eo extends AbstractC6790iR<PointF> {
    private final PointF eqN;

    /* renamed from: iR */
    private C6779WR f14505iR;
    private final PathMeasure ldr;

    /* renamed from: zx */
    private final float[] f14506zx;

    public C6788eo(List<? extends C6838bg<PointF>> list) {
        super(list);
        this.eqN = new PointF();
        this.f14506zx = new float[2];
        this.ldr = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg
    /* renamed from: IL */
    public PointF mo90811bg(C6838bg<PointF> c6838bg, float f) {
        C6779WR c6779wr = (C6779WR) c6838bg;
        Path m90849IL = c6779wr.m90849IL();
        if (m90849IL == null) {
            return c6838bg.f14689bg;
        }
        if (this.f14496bX == null) {
            if (this.f14505iR != c6779wr) {
                this.ldr.setPath(m90849IL, false);
                this.f14505iR = c6779wr;
            }
            PathMeasure pathMeasure = this.ldr;
            pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f14506zx, null);
            PointF pointF = this.eqN;
            float[] fArr = this.f14506zx;
            pointF.set(fArr[0], fArr[1]);
            return this.eqN;
        }
        c6779wr.f14691iR.floatValue();
        eqN();
        m90845Kg();
        throw null;
    }
}
