package com.bytedance.adsdk.p183IL.p189bg.p190IL;

import com.bytedance.adsdk.p183IL.ldr.C6868zx;
import com.bytedance.adsdk.p183IL.p192iR.C6837bX;
import com.bytedance.adsdk.p183IL.p192iR.C6838bg;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.bg.IL.PX */
/* loaded from: classes3.dex */
public class C6775PX extends AbstractC6790iR<C6837bX> {
    private final C6837bX eqN;

    public C6775PX(List<C6838bg<C6837bX>> list) {
        super(list);
        this.eqN = new C6837bX();
    }

    @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg
    /* renamed from: IL */
    public C6837bX mo90811bg(C6838bg<C6837bX> c6838bg, float f) {
        C6837bX c6837bX;
        C6837bX c6837bX2 = c6838bg.f14689bg;
        if (c6837bX2 != null && (c6837bX = c6838bg.f14681IL) != null) {
            C6837bX c6837bX3 = c6837bX2;
            C6837bX c6837bX4 = c6837bX;
            if (this.f14496bX == null) {
                this.eqN.m90719bg(C6868zx.m90600bg(c6837bX3.m90720bg(), c6837bX4.m90720bg(), f), C6868zx.m90600bg(c6837bX3.m90722IL(), c6837bX4.m90722IL(), f));
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
