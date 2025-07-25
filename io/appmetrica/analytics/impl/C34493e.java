package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.appmetrica.analytics.impl.e */
/* loaded from: classes9.dex */
public final class C34493e {

    /* renamed from: g */
    public static final long f94220g = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: h */
    public static final String f94221h = "WatchDog-" + ThreadFactoryC34480dd.f94200a.incrementAndGet();

    /* renamed from: a */
    public final CopyOnWriteArrayList f94222a;

    /* renamed from: b */
    public final AtomicInteger f94223b;

    /* renamed from: c */
    public final Handler f94224c;

    /* renamed from: d */
    public C34466d f94225d;

    /* renamed from: e */
    public final AtomicBoolean f94226e;

    /* renamed from: f */
    public final Runnable f94227f;

    public C34493e(C35037yb c35037yb) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f94222a = copyOnWriteArrayList;
        this.f94223b = new AtomicInteger();
        this.f94224c = new Handler(Looper.getMainLooper());
        this.f94226e = new AtomicBoolean();
        this.f94227f = new Runnable() { // from class: io.appmetrica.analytics.impl.wo
            @Override // java.lang.Runnable
            public final void run() {
                C34493e.this.m21814a();
            }
        };
        copyOnWriteArrayList.add(c35037yb);
    }

    /* renamed from: a */
    public final /* synthetic */ void m21814a() {
        this.f94226e.set(true);
    }

    /* renamed from: b */
    public final synchronized void m21812b() {
        C34466d c34466d = this.f94225d;
        if (c34466d != null) {
            c34466d.f94132a.set(false);
            this.f94225d = null;
            PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
        }
    }

    /* renamed from: a */
    public final synchronized void m21813a(int i) {
        AtomicInteger atomicInteger = this.f94223b;
        Integer valueOf = Integer.valueOf(i);
        int i2 = 5;
        if (valueOf != null && valueOf.intValue() >= 5) {
            i2 = valueOf.intValue();
        }
        atomicInteger.set(i2);
        if (this.f94225d == null) {
            C34466d c34466d = new C34466d(this);
            this.f94225d = c34466d;
            try {
                c34466d.setName(f94221h);
            } catch (SecurityException unused) {
            }
            this.f94225d.start();
            PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", Integer.valueOf(i));
        }
    }
}
