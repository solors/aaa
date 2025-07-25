package com.fyber.inneractive.sdk.network;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.network.H */
/* loaded from: classes4.dex */
public final class ThreadFactoryC14674H implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f27799a = new AtomicInteger(100);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, String.format(Locale.ENGLISH, "FyberMarketplace-Network-%02d", Integer.valueOf(this.f27799a.getAndIncrement())));
    }
}
