package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.appmetrica.analytics.impl.dd */
/* loaded from: classes9.dex */
public final class ThreadFactoryC34480dd implements ThreadFactory {

    /* renamed from: a */
    public static final AtomicInteger f94200a = new AtomicInteger(0);

    /* renamed from: a */
    public static int m21823a() {
        return f94200a.incrementAndGet();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new InterruptionSafeThread(runnable, ((String) null) + "-" + f94200a.incrementAndGet());
    }
}
