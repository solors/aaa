package com.bytedance.sdk.component.p233Kg.p237bg;

import com.bytedance.sdk.component.p233Kg.p237bg.InterfaceC7245bX;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.bytedance.sdk.component.Kg.bg.eqN */
/* loaded from: classes3.dex */
public class C7250eqN<T extends InterfaceC7245bX> {

    /* renamed from: IL */
    private BlockingQueue<T> f15651IL = new LinkedBlockingQueue();

    /* renamed from: bg */
    private int f15652bg;

    private C7250eqN(int i) {
        this.f15652bg = i;
    }

    /* renamed from: bg */
    public static C7250eqN m89473bg(int i) {
        return new C7250eqN(i);
    }

    /* renamed from: bg */
    public T m89474bg() {
        return this.f15651IL.poll();
    }

    /* renamed from: bg */
    public boolean m89472bg(T t) {
        if (t == null) {
            return false;
        }
        t.mo89493bg();
        if (this.f15651IL.size() >= this.f15652bg) {
            return false;
        }
        return this.f15651IL.offer(t);
    }
}
