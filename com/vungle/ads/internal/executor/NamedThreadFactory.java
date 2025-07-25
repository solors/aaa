package com.vungle.ads.internal.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.vungle.ads.internal.executor.c */
/* loaded from: classes7.dex */
public final class NamedThreadFactory implements ThreadFactory {
    @NotNull
    private final AtomicInteger atomicInteger;
    @NotNull
    private final String name;
    private final ThreadFactory threadFactory;

    public NamedThreadFactory(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.threadFactory = Executors.defaultThreadFactory();
        this.atomicInteger = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@NotNull Runnable r) {
        Intrinsics.checkNotNullParameter(r, "r");
        Thread t = this.threadFactory.newThread(r);
        t.setName(this.name + "-th-" + this.atomicInteger.incrementAndGet());
        Intrinsics.checkNotNullExpressionValue(t, "t");
        return t;
    }
}
