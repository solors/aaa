package com.fyber.inneractive.sdk.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.util.n */
/* loaded from: classes4.dex */
public final class ThreadFactoryC15461n implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f30608a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "IAConcurrencyUtil#" + this.f30608a.getAndIncrement());
    }
}
