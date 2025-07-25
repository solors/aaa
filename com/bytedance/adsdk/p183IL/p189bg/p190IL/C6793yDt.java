package com.bytedance.adsdk.p183IL.p189bg.p190IL;

import android.graphics.PointF;
import com.bytedance.adsdk.p183IL.p192iR.C6836IL;
import com.bytedance.adsdk.p183IL.p192iR.C6838bg;
import java.util.Collections;

/* renamed from: com.bytedance.adsdk.IL.bg.IL.yDt */
/* loaded from: classes3.dex */
public class C6793yDt extends AbstractC6781bg<PointF, PointF> {

    /* renamed from: Kg */
    private final AbstractC6781bg<Float, Float> f14518Kg;

    /* renamed from: WR */
    private final AbstractC6781bg<Float, Float> f14519WR;
    protected C6836IL<Float> eqN;

    /* renamed from: iR */
    private final PointF f14520iR;
    private final PointF ldr;

    /* renamed from: zx */
    protected C6836IL<Float> f14521zx;

    public C6793yDt(AbstractC6781bg<Float, Float> abstractC6781bg, AbstractC6781bg<Float, Float> abstractC6781bg2) {
        super(Collections.emptyList());
        this.ldr = new PointF();
        this.f14520iR = new PointF();
        this.f14518Kg = abstractC6781bg;
        this.f14519WR = abstractC6781bg2;
        mo90814bg(m90845Kg());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg
    /* renamed from: IL */
    public PointF mo90811bg(C6838bg<PointF> c6838bg, float f) {
        C6838bg<Float> m90843bX;
        C6838bg<Float> m90843bX2;
        if (this.eqN != null && (m90843bX2 = this.f14518Kg.m90843bX()) != null) {
            this.f14518Kg.m90838zx();
            Float f2 = m90843bX2.f14691iR;
            if (f2 != null) {
                f2.floatValue();
            }
            throw null;
        } else if (this.f14521zx != null && (m90843bX = this.f14519WR.m90843bX()) != null) {
            this.f14519WR.m90838zx();
            Float f3 = m90843bX.f14691iR;
            if (f3 != null) {
                f3.floatValue();
            }
            throw null;
        } else {
            this.f14520iR.set(this.ldr.x, 0.0f);
            PointF pointF = this.f14520iR;
            pointF.set(pointF.x, this.ldr.y);
            return this.f14520iR;
        }
    }

    @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg
    /* renamed from: WR */
    public PointF mo90813iR() {
        return mo90811bg(null, 0.0f);
    }

    @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg
    /* renamed from: bg */
    public void mo90814bg(float f) {
        this.f14518Kg.mo90814bg(f);
        this.f14519WR.mo90814bg(f);
        this.ldr.set(this.f14518Kg.mo90813iR().floatValue(), this.f14519WR.mo90813iR().floatValue());
        for (int i = 0; i < this.f14497bg.size(); i++) {
            this.f14497bg.get(i).mo90776bg();
        }
    }
}
