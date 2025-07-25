package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.d6 */
/* loaded from: classes6.dex */
public abstract class AbstractC19243d6 {

    /* renamed from: a */
    public static final ScheduledExecutorService f48160a;

    /* renamed from: b */
    public static final ExecutorService f48161b;

    /* renamed from: c */
    public static final Semaphore f48162c;

    /* renamed from: d */
    public static final AtomicBoolean f48163d;

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(5, new ThreadFactoryC18962I4("Log", true));
        Intrinsics.checkNotNullExpressionValue(newScheduledThreadPool, "newScheduledThreadPool(...)");
        f48160a = newScheduledThreadPool;
        f48161b = Executors.newSingleThreadExecutor(new ThreadFactoryC18962I4("LogSingle", true));
        f48162c = new Semaphore(1);
        f48163d = new AtomicBoolean(false);
    }
}
