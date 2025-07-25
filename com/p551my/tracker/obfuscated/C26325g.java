package com.p551my.tracker.obfuscated;

import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.ExecutorC1865b;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.my.tracker.obfuscated.g */
/* loaded from: classes7.dex */
public class C26325g {

    /* renamed from: a */
    public static final Handler f68588a;

    /* renamed from: b */
    public static final Executor f68589b;

    /* renamed from: c */
    public static final Executor f68590c;

    /* renamed from: d */
    private static final Executor f68591d;

    /* renamed from: e */
    private static final C26326a f68592e;

    /* renamed from: com.my.tracker.obfuscated.g$a */
    /* loaded from: classes7.dex */
    static final class C26326a {

        /* renamed from: a */
        private final ArrayDeque<RunnableC26327a> f68593a = new ArrayDeque<>();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.my.tracker.obfuscated.g$a$a */
        /* loaded from: classes7.dex */
        public static final class RunnableC26327a implements Runnable {

            /* renamed from: a */
            final C26326a f68594a;

            /* renamed from: b */
            volatile Runnable f68595b;

            RunnableC26327a(C26326a c26326a) {
                this.f68594a = c26326a;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Runnable runnable = this.f68595b;
                    if (runnable != null) {
                        runnable.run();
                    }
                    C26326a c26326a = this.f68594a;
                    if (c26326a == null) {
                    }
                } catch (Throwable th) {
                    try {
                        C26468z0.m41524b("RunnableThrowableDecorator: exception has been caught", th);
                    } finally {
                        C26326a c26326a2 = this.f68594a;
                        if (c26326a2 != null) {
                            c26326a2.m42070a(this);
                        }
                    }
                }
            }
        }

        C26326a() {
            for (int i = 0; i < 64; i++) {
                this.f68593a.add(new RunnableC26327a(this));
            }
        }

        /* renamed from: a */
        public Runnable m42069a(Runnable runnable) {
            RunnableC26327a pollFirst;
            synchronized (this) {
                pollFirst = this.f68593a.pollFirst();
            }
            if (pollFirst == null) {
                pollFirst = new RunnableC26327a(null);
            }
            pollFirst.f68595b = runnable;
            return pollFirst;
        }

        /* renamed from: a */
        void m42070a(RunnableC26327a runnableC26327a) {
            synchronized (this) {
                runnableC26327a.f68595b = null;
                this.f68593a.add(runnableC26327a);
            }
        }
    }

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        f68588a = handler;
        f68589b = Executors.newSingleThreadExecutor();
        f68590c = Executors.newSingleThreadExecutor();
        f68591d = new ExecutorC1865b(handler);
        f68592e = new C26326a();
    }

    /* renamed from: a */
    public static void m42073a(Runnable runnable) {
        f68589b.execute(f68592e.m42069a(runnable));
    }

    /* renamed from: b */
    public static void m42072b(Runnable runnable) {
        f68590c.execute(f68592e.m42069a(runnable));
    }

    /* renamed from: c */
    public static void m42071c(Runnable runnable) {
        Runnable m42069a = f68592e.m42069a(runnable);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            m42069a.run();
        } else {
            f68591d.execute(m42069a);
        }
    }
}
