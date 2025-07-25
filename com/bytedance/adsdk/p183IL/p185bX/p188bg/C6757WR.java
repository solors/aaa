package com.bytedance.adsdk.p183IL.p185bX.p188bg;

import android.graphics.PointF;
import com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg;
import com.bytedance.adsdk.p183IL.p189bg.p190IL.C6793yDt;
import com.bytedance.adsdk.p183IL.p192iR.C6838bg;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.bX.bg.WR */
/* loaded from: classes3.dex */
public class C6757WR implements InterfaceC6755Ta<PointF, PointF> {

    /* renamed from: IL */
    private final C6752IL f14459IL;

    /* renamed from: bg */
    private final C6752IL f14460bg;

    public C6757WR(C6752IL c6752il, C6752IL c6752il2) {
        this.f14460bg = c6752il;
        this.f14459IL = c6752il2;
    }

    @Override // com.bytedance.adsdk.p183IL.p185bX.p188bg.InterfaceC6755Ta
    /* renamed from: IL */
    public boolean mo90887IL() {
        if (this.f14460bg.mo90887IL() && this.f14459IL.mo90887IL()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.adsdk.p183IL.p185bX.p188bg.InterfaceC6755Ta
    /* renamed from: bX */
    public List<C6838bg<PointF>> mo90886bX() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.bytedance.adsdk.p183IL.p185bX.p188bg.InterfaceC6755Ta
    /* renamed from: bg */
    public AbstractC6781bg<PointF, PointF> mo90885bg() {
        return new C6793yDt(this.f14460bg.mo90885bg(), this.f14459IL.mo90885bg());
    }
}
