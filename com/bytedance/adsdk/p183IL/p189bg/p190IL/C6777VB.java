package com.bytedance.adsdk.p183IL.p189bg.p190IL;

import android.graphics.PointF;
import com.bytedance.adsdk.p183IL.p192iR.C6838bg;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.bg.IL.VB */
/* loaded from: classes3.dex */
public class C6777VB extends AbstractC6790iR<PointF> {
    private final PointF eqN;

    public C6777VB(List<C6838bg<PointF>> list) {
        super(list);
        this.eqN = new PointF();
    }

    @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg
    /* renamed from: IL */
    public PointF mo90811bg(C6838bg<PointF> c6838bg, float f) {
        return mo90840bg(c6838bg, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg
    /* renamed from: IL */
    public PointF mo90840bg(C6838bg<PointF> c6838bg, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2 = c6838bg.f14689bg;
        if (pointF2 != null && (pointF = c6838bg.f14681IL) != null) {
            PointF pointF3 = pointF2;
            PointF pointF4 = pointF;
            if (this.f14496bX == null) {
                PointF pointF5 = this.eqN;
                float f4 = pointF3.x;
                float f5 = pointF3.y;
                pointF5.set(f4 + (f2 * (pointF4.x - f4)), f5 + (f3 * (pointF4.y - f5)));
                return this.eqN;
            }
            c6838bg.f14691iR.floatValue();
            eqN();
            m90845Kg();
            throw null;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
