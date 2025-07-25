package com.bytedance.sdk.component.p233Kg.p235bX;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.component.Kg.bX.eqN */
/* loaded from: classes3.dex */
public class ThreadFactoryC7234eqN implements ThreadFactory {

    /* renamed from: IL */
    protected final String f15608IL;

    /* renamed from: bX */
    private final AtomicInteger f15609bX = new AtomicInteger(1);

    /* renamed from: bg */
    protected final ThreadGroup f15610bg;

    public ThreadFactoryC7234eqN(String str) {
        this.f15610bg = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.f15608IL = m89530bg(str);
    }

    /* renamed from: bg */
    protected Thread m89529bg(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.f15610bg;
        Thread m89529bg = m89529bg(threadGroup, runnable, this.f15608IL + "_" + this.f15609bX.getAndIncrement());
        if (m89529bg.isDaemon()) {
            m89529bg.setDaemon(false);
        }
        return m89529bg;
    }

    /* renamed from: bg */
    public static String m89530bg(String str) {
        return "pag_".concat(String.valueOf(str));
    }
}
