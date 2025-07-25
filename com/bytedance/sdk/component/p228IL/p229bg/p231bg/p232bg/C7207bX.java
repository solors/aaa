package com.bytedance.sdk.component.p228IL.p229bg.p231bg.p232bg;

import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7191Ta;
import com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7187Kg;
import java.io.IOException;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.IL.bg.bg.bg.bX */
/* loaded from: classes3.dex */
public class C7207bX implements InterfaceC7187Kg.InterfaceC7188bg {

    /* renamed from: IL */
    AbstractC7191Ta f15534IL;

    /* renamed from: bX */
    int f15535bX = 0;

    /* renamed from: bg */
    List<InterfaceC7187Kg> f15536bg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7207bX(List<InterfaceC7187Kg> list, AbstractC7191Ta abstractC7191Ta) {
        this.f15536bg = list;
        this.f15534IL = abstractC7191Ta;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7187Kg.InterfaceC7188bg
    /* renamed from: bg */
    public AbstractC7191Ta mo89620bg() {
        return this.f15534IL;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7187Kg.InterfaceC7188bg
    /* renamed from: bg */
    public AbstractC7189Lq mo89619bg(AbstractC7191Ta abstractC7191Ta) throws IOException {
        this.f15534IL = abstractC7191Ta;
        int i = this.f15535bX + 1;
        this.f15535bX = i;
        if (i >= this.f15536bg.size()) {
            return null;
        }
        return this.f15536bg.get(this.f15535bX).mo88346bg(this);
    }
}
