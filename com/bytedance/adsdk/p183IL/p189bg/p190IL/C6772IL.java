package com.bytedance.adsdk.p183IL.p189bg.p190IL;

import com.bytedance.adsdk.p183IL.ldr.C6859IL;
import com.bytedance.adsdk.p183IL.ldr.C6868zx;
import com.bytedance.adsdk.p183IL.p192iR.C6838bg;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.bg.IL.IL */
/* loaded from: classes3.dex */
public class C6772IL extends AbstractC6790iR<Integer> {
    public C6772IL(List<C6838bg<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg
    /* renamed from: IL */
    public Integer mo90811bg(C6838bg<Integer> c6838bg, float f) {
        return Integer.valueOf(m90859bX(c6838bg, f));
    }

    /* renamed from: WR */
    public int m90860WR() {
        return m90859bX(m90843bX(), m90838zx());
    }

    /* renamed from: bX */
    public int m90859bX(C6838bg<Integer> c6838bg, float f) {
        if (c6838bg.f14689bg != null && c6838bg.f14681IL != null) {
            if (this.f14496bX == null) {
                return C6859IL.m90650bg(C6868zx.m90604IL(f, 0.0f, 1.0f), c6838bg.f14689bg.intValue(), c6838bg.f14681IL.intValue());
            }
            c6838bg.f14691iR.floatValue();
            eqN();
            m90845Kg();
            throw null;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
