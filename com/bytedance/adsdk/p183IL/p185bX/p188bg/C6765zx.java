package com.bytedance.adsdk.p183IL.p185bX.p188bg;

import android.graphics.PointF;
import com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg;
import com.bytedance.adsdk.p183IL.p189bg.p190IL.C6777VB;
import com.bytedance.adsdk.p183IL.p189bg.p190IL.C6788eo;
import com.bytedance.adsdk.p183IL.p192iR.C6838bg;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.bX.bg.zx */
/* loaded from: classes3.dex */
public class C6765zx implements InterfaceC6755Ta<PointF, PointF> {

    /* renamed from: bg */
    private final List<C6838bg<PointF>> f14462bg;

    public C6765zx(List<C6838bg<PointF>> list) {
        this.f14462bg = list;
    }

    @Override // com.bytedance.adsdk.p183IL.p185bX.p188bg.InterfaceC6755Ta
    /* renamed from: IL */
    public boolean mo90887IL() {
        if (this.f14462bg.size() != 1 || !this.f14462bg.get(0).m90712zx()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.adsdk.p183IL.p185bX.p188bg.InterfaceC6755Ta
    /* renamed from: bX */
    public List<C6838bg<PointF>> mo90886bX() {
        return this.f14462bg;
    }

    @Override // com.bytedance.adsdk.p183IL.p185bX.p188bg.InterfaceC6755Ta
    /* renamed from: bg */
    public AbstractC6781bg<PointF, PointF> mo90885bg() {
        if (this.f14462bg.get(0).m90712zx()) {
            return new C6777VB(this.f14462bg);
        }
        return new C6788eo(this.f14462bg);
    }
}
