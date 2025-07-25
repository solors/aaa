package com.bytedance.adsdk.p183IL.p189bg.p190IL;

import com.bytedance.adsdk.p183IL.p185bX.p186IL.C6722eqN;
import com.bytedance.adsdk.p183IL.p192iR.C6838bg;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.bg.IL.zx */
/* loaded from: classes3.dex */
public class C6794zx extends AbstractC6790iR<C6722eqN> {
    private final C6722eqN eqN;

    public C6794zx(List<C6838bg<C6722eqN>> list) {
        super(list);
        C6722eqN c6722eqN = list.get(0).f14689bg;
        int m91029bX = c6722eqN != null ? c6722eqN.m91029bX() : 0;
        this.eqN = new C6722eqN(new float[m91029bX], new int[m91029bX]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg
    /* renamed from: IL */
    public C6722eqN mo90811bg(C6838bg<C6722eqN> c6838bg, float f) {
        this.eqN.m91026bg(c6838bg.f14689bg, c6838bg.f14681IL, f);
        return this.eqN;
    }
}
