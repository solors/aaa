package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class CustomThreadFactory implements ThreadFactory {

    /* renamed from: g */
    private static final ThreadFactory f42158g = Executors.defaultThreadFactory();

    /* renamed from: b */
    private final AtomicLong f42159b = new AtomicLong();

    /* renamed from: c */
    private final String f42160c;

    /* renamed from: d */
    private final int f42161d;

    /* renamed from: f */
    private final StrictMode.ThreadPolicy f42162f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CustomThreadFactory(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f42160c = str;
        this.f42161d = i;
        this.f42162f = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m67311b(Runnable runnable) {
        Process.setThreadPriority(this.f42161d);
        StrictMode.ThreadPolicy threadPolicy = this.f42162f;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f42158g.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                CustomThreadFactory.this.m67311b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f42160c, Long.valueOf(this.f42159b.getAndIncrement())));
        return newThread;
    }
}
