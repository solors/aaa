package com.bytedance.sdk.component.p228IL.p229bg.p231bg.p232bg;

import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7215eqN;
import com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7177IL;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.sdk.component.IL.bg.bg.bg.bg */
/* loaded from: classes3.dex */
public class C7208bg extends AbstractC7215eqN {

    /* renamed from: bg */
    public static volatile InterfaceC7206WR f15537bg;

    /* renamed from: IL */
    private List<InterfaceC7177IL> f15538IL = new CopyOnWriteArrayList();

    /* renamed from: bX */
    private List<InterfaceC7177IL> f15539bX = new CopyOnWriteArrayList();
    private ExecutorService eqN;

    public C7208bg(ExecutorService executorService) {
        this.eqN = executorService;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7215eqN
    /* renamed from: IL */
    public ExecutorService mo89604IL() {
        ExecutorService executorService;
        if (f15537bg != null) {
            executorService = f15537bg.mo82316bg();
        } else {
            executorService = null;
        }
        if (executorService != null) {
            return executorService;
        }
        return this.eqN;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7215eqN
    /* renamed from: bX */
    public List<InterfaceC7177IL> mo89603bX() {
        return this.f15538IL;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7215eqN
    /* renamed from: bg */
    public int mo89602bg() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7215eqN
    public List<InterfaceC7177IL> eqN() {
        return this.f15539bX;
    }

    /* renamed from: zx */
    public boolean m89617zx() {
        if (f15537bg != null && f15537bg.mo82316bg() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7215eqN
    /* renamed from: bg */
    public void mo89601bg(int i) {
    }

    /* renamed from: bg */
    public static void m89618bg(InterfaceC7206WR interfaceC7206WR) {
        f15537bg = interfaceC7206WR;
    }
}
