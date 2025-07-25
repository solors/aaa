package com.bytedance.sdk.component.p275zx.p283bg;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.component.zx.bg.bg */
/* loaded from: classes3.dex */
public class ThreadFactoryC7830bg implements ThreadFactory {

    /* renamed from: IL */
    private final AtomicInteger f17103IL = new AtomicInteger(1);

    /* renamed from: bg */
    private final ThreadGroup f17104bg;

    public ThreadFactoryC7830bg(String str) {
        this.f17104bg = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.f17104bg;
        Thread thread = new Thread(threadGroup, runnable, "tt_img_" + this.f17103IL.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
