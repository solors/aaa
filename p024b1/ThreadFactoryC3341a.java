package p024b1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: b1.a */
/* loaded from: classes3.dex */
public final class ThreadFactoryC3341a implements ThreadFactory {

    /* renamed from: b */
    public final AtomicInteger f1548b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ConcurrencyUtil#" + this.f1548b.getAndIncrement());
    }
}
