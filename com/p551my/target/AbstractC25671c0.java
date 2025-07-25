package com.p551my.target;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.target.c0 */
/* loaded from: classes7.dex */
public abstract class AbstractC25671c0 {

    /* renamed from: a */
    public static final Executor f66670a = Executors.newFixedThreadPool(6);

    /* renamed from: b */
    public static final Executor f66671b = Executors.newSingleThreadExecutor();

    /* renamed from: c */
    public static final Executor f66672c = Executors.newFixedThreadPool(6);

    /* renamed from: d */
    public static final Executor f66673d = Executors.newSingleThreadExecutor();

    /* renamed from: e */
    public static final List f66674e = new ArrayList();

    /* renamed from: f */
    public static final Handler f66675f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    public static final Executor f66676g = new ExecutorC25672a();

    /* renamed from: h */
    public static final AtomicBoolean f66677h = new AtomicBoolean();

    /* renamed from: com.my.target.c0$a */
    /* loaded from: classes7.dex */
    public class ExecutorC25672a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            AbstractC25671c0.f66675f.post(runnable);
        }
    }

    /* renamed from: a */
    public static boolean m44128a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: b */
    public static void m44124b(Runnable runnable) {
        f66671b.execute(runnable);
    }

    /* renamed from: c */
    public static void m44123c(Runnable runnable) {
        f66670a.execute(runnable);
    }

    /* renamed from: d */
    public static void m44122d(Runnable runnable) {
        f66673d.execute(runnable);
    }

    /* renamed from: e */
    public static void m44121e(Runnable runnable) {
        f66676g.execute(runnable);
    }

    /* renamed from: a */
    public static void m44127a(Runnable runnable) {
        AtomicBoolean atomicBoolean = f66677h;
        if (!atomicBoolean.get()) {
            List list = f66674e;
            synchronized (list) {
                if (!atomicBoolean.get()) {
                    list.add(runnable);
                    AbstractC25846ja.m43677b("AsyncCommand", "Can't use onAdLoadExecutor - sdk initialize not finished");
                    return;
                }
            }
        }
        f66672c.execute(runnable);
    }

    /* renamed from: b */
    public static void m44125b() {
        List<Runnable> list = f66674e;
        synchronized (list) {
            for (Runnable runnable : list) {
                f66672c.execute(runnable);
            }
            f66674e.clear();
            f66677h.set(true);
        }
    }

    /* renamed from: a */
    public static void m44126a(Runnable runnable, int i) {
        f66675f.postDelayed(runnable, i);
    }
}
