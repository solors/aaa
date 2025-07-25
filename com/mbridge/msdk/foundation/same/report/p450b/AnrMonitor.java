package com.mbridge.msdk.foundation.same.report.p450b;

import android.annotation.TargetApi;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;

/* renamed from: com.mbridge.msdk.foundation.same.report.b.b */
/* loaded from: classes6.dex */
public class AnrMonitor extends Thread {

    /* renamed from: a */
    private static volatile AnrMonitor f56702a;

    /* renamed from: b */
    private final Handler f56703b;

    /* renamed from: c */
    private volatile RunnableC22005a f56704c;

    /* renamed from: d */
    private ANRListener f56705d;

    /* renamed from: e */
    private int f56706e;

    /* compiled from: AnrMonitor.java */
    /* renamed from: com.mbridge.msdk.foundation.same.report.b.b$a */
    /* loaded from: classes6.dex */
    private class RunnableC22005a implements Runnable {

        /* renamed from: b */
        private long f56708b;

        /* renamed from: c */
        private boolean f56709c;

        /* renamed from: d */
        private long f56710d;

        private RunnableC22005a() {
            this.f56708b = SystemClock.uptimeMillis();
        }

        /* renamed from: b */
        final void m52140b() {
            this.f56709c = false;
            this.f56710d = SystemClock.uptimeMillis();
            AnrMonitor.this.f56703b.postAtFrontOfQueue(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AnrMonitor.this) {
                this.f56709c = true;
                this.f56708b = SystemClock.uptimeMillis();
            }
        }

        /* renamed from: a */
        final boolean m52142a() {
            return !this.f56709c || this.f56708b - this.f56710d >= ((long) AnrMonitor.this.f56706e);
        }
    }

    private AnrMonitor() {
        super("AnrMonitor-Thread");
        this.f56703b = new Handler(Looper.getMainLooper());
        this.f56706e = 5000;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    @TargetApi(16)
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            if (!isInterrupted() && (this.f56704c == null || this.f56704c.f56709c)) {
                synchronized (this) {
                    if (this.f56704c == null) {
                        this.f56704c = new RunnableC22005a();
                    }
                    this.f56704c.m52140b();
                    long j = this.f56706e;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    while (j > 0) {
                        try {
                            wait(j);
                        } catch (InterruptedException e) {
                            Log.w("AnrMonitor", e.toString());
                        }
                        j = this.f56706e - (SystemClock.uptimeMillis() - uptimeMillis);
                    }
                    if (!this.f56704c.m52142a()) {
                        ANRListener aNRListener = this.f56705d;
                        if (aNRListener != null) {
                            aNRListener.mo52129a();
                        }
                    } else if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && this.f56705d != null) {
                        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                        this.f56705d.mo52128a(AnrMonitorManager.m52135a(stackTrace), stackTrace);
                    }
                }
            } else {
                try {
                    Thread.sleep(this.f56706e);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static AnrMonitor m52146a() {
        if (f56702a == null) {
            synchronized (AnrMonitor.class) {
                if (f56702a == null) {
                    f56702a = new AnrMonitor();
                }
            }
        }
        return f56702a;
    }

    /* renamed from: a */
    public final AnrMonitor m52145a(int i, ANRListener aNRListener) {
        this.f56706e = i;
        this.f56705d = aNRListener;
        return this;
    }
}
