package com.bytedance.sdk.component.p228IL.p229bg.p231bg.p232bg;

import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7215eqN;
import com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7177IL;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.component.IL.bg.bg.bg.zx */
/* loaded from: classes3.dex */
public class C7212zx extends AbstractC7215eqN {

    /* renamed from: bg */
    private ExecutorService f15550bg;

    /* renamed from: IL */
    private List<InterfaceC7177IL> f15548IL = new CopyOnWriteArrayList();

    /* renamed from: bX */
    private List<InterfaceC7177IL> f15549bX = new CopyOnWriteArrayList();
    private AtomicInteger eqN = new AtomicInteger(64);

    public C7212zx() {
        if (this.f15550bg == null) {
            this.f15550bg = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.IL.bg.bg.bg.zx.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7215eqN
    /* renamed from: IL */
    public ExecutorService mo89604IL() {
        return this.f15550bg;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7215eqN
    /* renamed from: bX */
    public List<InterfaceC7177IL> mo89603bX() {
        return this.f15548IL;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7215eqN
    /* renamed from: bg */
    public void mo89601bg(int i) {
        this.eqN.set(i);
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7215eqN
    public List<InterfaceC7177IL> eqN() {
        return this.f15549bX;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7215eqN
    /* renamed from: bg */
    public int mo89602bg() {
        return this.eqN.get();
    }
}
