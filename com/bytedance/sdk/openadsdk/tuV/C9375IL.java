package com.bytedance.sdk.openadsdk.tuV;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.openadsdk.tuV.IL */
/* loaded from: classes3.dex */
public class C9375IL {

    /* renamed from: IL */
    private C9380Kg f20902IL;
    private int eqN;

    /* renamed from: zx */
    private InterfaceC9377bg f20905zx;

    /* renamed from: bg */
    private ScheduledExecutorService f20904bg = null;

    /* renamed from: bX */
    private long f20903bX = 0;

    /* renamed from: com.bytedance.sdk.openadsdk.tuV.IL$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC9377bg {
    }

    public C9375IL(C9380Kg c9380Kg, int i) {
        this.f20902IL = c9380Kg;
        this.eqN = i;
    }

    /* renamed from: IL */
    public boolean m82908IL() {
        ScheduledExecutorService scheduledExecutorService = this.f20904bg;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }

    /* renamed from: bg */
    public void m82903bg(long j) {
        this.f20903bX = j;
    }

    /* renamed from: bg */
    public void m82904bg(int i) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.f20904bg = newScheduledThreadPool;
        newScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.IL.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = C9375IL.this.f20903bX;
                if (System.currentTimeMillis() - C9375IL.this.f20903bX > C9375IL.this.eqN) {
                    C9375IL.this.f20904bg.shutdown();
                    if (C9375IL.this.f20902IL != null) {
                        C9375IL.this.f20902IL.m82887IL(0, "Automatic detection of stuck");
                    }
                    if (C9375IL.this.f20905zx != null) {
                        InterfaceC9377bg unused2 = C9375IL.this.f20905zx;
                    }
                }
            }
        }, 0L, i, TimeUnit.MILLISECONDS);
    }

    /* renamed from: bg */
    public void m82905bg() {
        ScheduledExecutorService scheduledExecutorService = this.f20904bg;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
