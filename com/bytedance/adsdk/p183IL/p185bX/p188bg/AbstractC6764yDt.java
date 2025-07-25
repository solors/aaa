package com.bytedance.adsdk.p183IL.p185bX.p188bg;

import com.bytedance.adsdk.p183IL.p192iR.C6838bg;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.bX.bg.yDt */
/* loaded from: classes3.dex */
abstract class AbstractC6764yDt<V, O> implements InterfaceC6755Ta<V, O> {

    /* renamed from: bg */
    final List<C6838bg<V>> f14461bg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC6764yDt(List<C6838bg<V>> list) {
        this.f14461bg = list;
    }

    @Override // com.bytedance.adsdk.p183IL.p185bX.p188bg.InterfaceC6755Ta
    /* renamed from: IL */
    public boolean mo90887IL() {
        if (this.f14461bg.isEmpty() || (this.f14461bg.size() == 1 && this.f14461bg.get(0).m90712zx())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.adsdk.p183IL.p185bX.p188bg.InterfaceC6755Ta
    /* renamed from: bX */
    public List<C6838bg<V>> mo90886bX() {
        return this.f14461bg;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f14461bg.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f14461bg.toArray()));
        }
        return sb2.toString();
    }
}
