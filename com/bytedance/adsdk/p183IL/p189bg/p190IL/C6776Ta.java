package com.bytedance.adsdk.p183IL.p189bg.p190IL;

import android.graphics.Path;
import com.bytedance.adsdk.p183IL.ldr.C6868zx;
import com.bytedance.adsdk.p183IL.p185bX.p186IL.C6730yDt;
import com.bytedance.adsdk.p183IL.p189bg.p191bg.InterfaceC6796Fy;
import com.bytedance.adsdk.p183IL.p192iR.C6838bg;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.bg.IL.Ta */
/* loaded from: classes3.dex */
public class C6776Ta extends AbstractC6781bg<C6730yDt, Path> {
    private final C6730yDt eqN;
    private List<InterfaceC6796Fy> ldr;

    /* renamed from: zx */
    private final Path f14486zx;

    public C6776Ta(List<C6838bg<C6730yDt>> list) {
        super(list);
        this.eqN = new C6730yDt();
        this.f14486zx = new Path();
    }

    @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg
    /* renamed from: IL */
    public Path mo90811bg(C6838bg<C6730yDt> c6838bg, float f) {
        this.eqN.m90996bg(c6838bg.f14689bg, c6838bg.f14681IL, f);
        C6730yDt c6730yDt = this.eqN;
        List<InterfaceC6796Fy> list = this.ldr;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c6730yDt = this.ldr.get(size).mo90798bg(c6730yDt);
            }
        }
        C6868zx.m90595bg(c6730yDt, this.f14486zx);
        return this.f14486zx;
    }

    /* renamed from: bg */
    public void m90852bg(List<InterfaceC6796Fy> list) {
        this.ldr = list;
    }
}
