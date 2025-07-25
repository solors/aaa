package com.bytedance.sdk.component.p233Kg;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.component.Kg.WR */
/* loaded from: classes3.dex */
public class ThreadFactoryC7228WR implements ThreadFactory {
    public static final String THREAD_GROUP_NAME_PRE = "csj_g_";
    public static final String THREAD_NAME_PRE = "csj_";

    /* renamed from: IL */
    protected final String f15594IL;

    /* renamed from: bX */
    protected int f15595bX;

    /* renamed from: bg */
    protected final ThreadGroup f15596bg;
    private final AtomicInteger eqN;

    public ThreadFactoryC7228WR(String str) {
        this(5, str);
    }

    /* renamed from: bg */
    protected Thread m89553bg(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.f15596bg;
        Thread m89553bg = m89553bg(threadGroup, runnable, this.f15594IL + this.eqN.getAndIncrement());
        if (m89553bg.isDaemon()) {
            m89553bg.setDaemon(false);
        }
        int i = this.f15595bX;
        if (i > 10 || i <= 0) {
            this.f15595bX = 5;
        }
        m89553bg.setPriority(this.f15595bX);
        return m89553bg;
    }

    public ThreadFactoryC7228WR(int i, String str) {
        this.eqN = new AtomicInteger(1);
        this.f15595bX = i;
        this.f15596bg = new ThreadGroup(THREAD_GROUP_NAME_PRE.concat(String.valueOf(str)));
        this.f15594IL = THREAD_NAME_PRE.concat(String.valueOf(str));
    }
}
