package com.inmobi.media;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ac */
/* loaded from: classes6.dex */
public final class ThreadFactoryC19207ac implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f48072a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r) {
        Intrinsics.checkNotNullParameter(r, "r");
        return new Thread(r, "VastNetworkTask #" + this.f48072a.getAndIncrement());
    }
}
