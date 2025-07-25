package com.bytedance.adsdk.p183IL.p189bg.p190IL;

import com.bytedance.adsdk.p183IL.ldr.C6868zx;
import com.bytedance.adsdk.p183IL.p192iR.C6838bg;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.bg.IL.ldr */
/* loaded from: classes3.dex */
public class C6791ldr extends AbstractC6790iR<Integer> {
    public C6791ldr(List<C6838bg<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg
    /* renamed from: IL */
    public Integer mo90811bg(C6838bg<Integer> c6838bg, float f) {
        return Integer.valueOf(m90825bX(c6838bg, f));
    }

    /* renamed from: WR */
    public int m90826WR() {
        return m90825bX(m90843bX(), m90838zx());
    }

    /* renamed from: bX */
    int m90825bX(C6838bg<Integer> c6838bg, float f) {
        if (c6838bg.f14689bg != null && c6838bg.f14681IL != null) {
            if (this.f14496bX == null) {
                return C6868zx.m90598bg(c6838bg.m90718Kg(), c6838bg.m90717WR(), f);
            }
            c6838bg.f14691iR.floatValue();
            eqN();
            m90845Kg();
            throw null;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
