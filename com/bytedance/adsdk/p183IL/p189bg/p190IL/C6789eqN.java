package com.bytedance.adsdk.p183IL.p189bg.p190IL;

import com.bytedance.adsdk.p183IL.ldr.C6868zx;
import com.bytedance.adsdk.p183IL.p192iR.C6838bg;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.bg.IL.eqN */
/* loaded from: classes3.dex */
public class C6789eqN extends AbstractC6790iR<Float> {
    public C6789eqN(List<C6838bg<Float>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg
    /* renamed from: IL */
    public Float mo90811bg(C6838bg<Float> c6838bg, float f) {
        return Float.valueOf(m90828bX(c6838bg, f));
    }

    /* renamed from: WR */
    public float m90829WR() {
        return m90828bX(m90843bX(), m90838zx());
    }

    /* renamed from: bX */
    float m90828bX(C6838bg<Float> c6838bg, float f) {
        if (c6838bg.f14689bg != null && c6838bg.f14681IL != null) {
            if (this.f14496bX == null) {
                return C6868zx.m90600bg(c6838bg.ldr(), c6838bg.m90713iR(), f);
            }
            c6838bg.f14691iR.floatValue();
            eqN();
            m90845Kg();
            throw null;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
