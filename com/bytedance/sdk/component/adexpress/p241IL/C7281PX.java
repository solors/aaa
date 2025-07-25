package com.bytedance.sdk.component.adexpress.p241IL;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7288eo;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.adexpress.IL.PX */
/* loaded from: classes3.dex */
public class C7281PX implements InterfaceC7288eo.InterfaceC7289bg {
    @NonNull

    /* renamed from: IL */
    private List<InterfaceC7288eo> f15730IL;

    /* renamed from: bX */
    private InterfaceC7285WR f15731bX;

    /* renamed from: bg */
    InterfaceC7280Lq f15732bg;
    private AtomicBoolean eqN = new AtomicBoolean(false);

    public C7281PX(List<InterfaceC7288eo> list, InterfaceC7285WR interfaceC7285WR) {
        this.f15730IL = list;
        this.f15731bX = interfaceC7285WR;
    }

    @Override // com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7288eo.InterfaceC7289bg
    /* renamed from: IL */
    public boolean mo89288IL(InterfaceC7288eo interfaceC7288eo) {
        int indexOf = this.f15730IL.indexOf(interfaceC7288eo);
        return indexOf < this.f15730IL.size() - 1 && indexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7288eo.InterfaceC7289bg
    /* renamed from: bX */
    public boolean mo89287bX() {
        return this.eqN.get();
    }

    @Override // com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7288eo.InterfaceC7289bg
    /* renamed from: bg */
    public void mo89286bg() {
        this.f15731bX.eqN();
        Iterator<InterfaceC7288eo> it = this.f15730IL.iterator();
        while (it.hasNext() && !it.next().mo84922bg(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7288eo.InterfaceC7289bg
    /* renamed from: IL */
    public InterfaceC7280Lq mo89289IL() {
        return this.f15732bg;
    }

    @Override // com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7288eo.InterfaceC7289bg
    /* renamed from: bg */
    public void mo89284bg(InterfaceC7288eo interfaceC7288eo) {
        int indexOf = this.f15730IL.indexOf(interfaceC7288eo);
        if (indexOf < 0) {
            return;
        }
        do {
            indexOf++;
            if (indexOf >= this.f15730IL.size()) {
                return;
            }
        } while (!this.f15730IL.get(indexOf).mo84922bg(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7288eo.InterfaceC7289bg
    /* renamed from: bg */
    public void mo89285bg(InterfaceC7280Lq interfaceC7280Lq) {
        this.f15732bg = interfaceC7280Lq;
    }

    @Override // com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7288eo.InterfaceC7289bg
    /* renamed from: bg */
    public void mo89283bg(boolean z) {
        this.eqN.getAndSet(z);
    }
}
