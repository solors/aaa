package com.amazon.p047a.p048a.p066n.p069b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.amazon.p047a.p048a.p066n.Task;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.amazon.a.a.n.b.b */
/* loaded from: classes2.dex */
public class SimpleTaskPipeline implements TaskPipeline {

    /* renamed from: a */
    private static final KiwiLogger f2640a = new KiwiLogger("SimpleTaskPipeline");

    /* renamed from: b */
    private final Handler f2641b;

    /* renamed from: c */
    private final Set<Runnable> f2642c;

    /* renamed from: d */
    private final String f2643d;

    private SimpleTaskPipeline(HandlerThread handlerThread) {
        this.f2642c = Collections.synchronizedSet(new HashSet());
        this.f2643d = handlerThread.getName();
        handlerThread.start();
        this.f2641b = new Handler(handlerThread.getLooper());
    }

    /* renamed from: c */
    private Runnable m102904c(final Task task) {
        Runnable runnable = new Runnable() { // from class: com.amazon.a.a.n.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                KiwiLogger kiwiLogger;
                StringBuilder sb2;
                SimpleTaskPipeline.this.f2642c.remove(this);
                try {
                    if (KiwiLogger.f2770a) {
                        KiwiLogger kiwiLogger2 = SimpleTaskPipeline.f2640a;
                        kiwiLogger2.m102829a(SimpleTaskPipeline.this.f2643d + ": Executing Task: " + task + ", current time: " + new Date() + ", uptime: " + SystemClock.uptimeMillis());
                    }
                    task.mo102336a();
                } catch (Throwable th) {
                    try {
                        if (KiwiLogger.f2771b) {
                            KiwiLogger kiwiLogger3 = SimpleTaskPipeline.f2640a;
                            kiwiLogger3.m102825b("Task Failed with unhandled exception: " + th, th);
                        }
                        if (KiwiLogger.f2770a) {
                            kiwiLogger = SimpleTaskPipeline.f2640a;
                            sb2 = new StringBuilder();
                        } else {
                            return;
                        }
                    } catch (Throwable th2) {
                        if (KiwiLogger.f2770a) {
                            KiwiLogger kiwiLogger4 = SimpleTaskPipeline.f2640a;
                            kiwiLogger4.m102829a(SimpleTaskPipeline.this.f2643d + ": Task finished executing: " + task);
                        }
                        throw th2;
                    }
                }
                if (KiwiLogger.f2770a) {
                    kiwiLogger = SimpleTaskPipeline.f2640a;
                    sb2 = new StringBuilder();
                    sb2.append(SimpleTaskPipeline.this.f2643d);
                    sb2.append(": Task finished executing: ");
                    sb2.append(task);
                    kiwiLogger.m102829a(sb2.toString());
                }
            }

            public String toString() {
                return task.toString();
            }
        };
        this.f2642c.add(runnable);
        return runnable;
    }

    /* renamed from: a */
    public static SimpleTaskPipeline m102909a(String str) {
        return new SimpleTaskPipeline(new HandlerThread("KIWI_" + str));
    }

    /* renamed from: b */
    public static SimpleTaskPipeline m102905b(String str) {
        return new SimpleTaskPipeline(str);
    }

    @Override // com.amazon.p047a.p048a.p066n.p069b.TaskPipeline
    /* renamed from: a */
    public void mo102902a(Task task) {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2640a;
            kiwiLogger.m102829a("Scheduling task: " + task);
        }
        this.f2641b.post(m102904c(task));
    }

    @Override // com.amazon.p047a.p048a.p066n.p069b.TaskPipeline
    /* renamed from: b */
    public void mo102899b(Task task) {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2640a;
            kiwiLogger.m102829a(this.f2643d + ": Scheduling task immediately: " + task);
        }
        this.f2641b.postAtFrontOfQueue(m102904c(task));
    }

    private SimpleTaskPipeline(String str) {
        this.f2642c = Collections.synchronizedSet(new HashSet());
        this.f2643d = str;
        this.f2641b = new Handler();
    }

    @Override // com.amazon.p047a.p048a.p066n.p069b.TaskPipeline
    /* renamed from: a */
    public void mo102900a(Task task, Date date) {
        long m102908a = m102908a(date);
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2640a;
            kiwiLogger.m102829a(this.f2643d + ": Scheduling task: " + task + ", at time: " + date + ", System uptimeMillis: " + System.currentTimeMillis() + ", uptimeMillis: " + m102908a);
        }
        this.f2641b.postAtTime(m102904c(task), m102908a);
    }

    /* renamed from: a */
    private long m102908a(Date date) {
        return SystemClock.uptimeMillis() + (date.getTime() - System.currentTimeMillis());
    }

    @Override // com.amazon.p047a.p048a.p066n.p069b.TaskPipeline
    /* renamed from: a */
    public void mo102901a(Task task, long j) {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2640a;
            kiwiLogger.m102829a(this.f2643d + ": Scheduling task: " + task + ", with delay: " + j);
        }
        this.f2641b.postDelayed(m102904c(task), j);
    }

    @Override // com.amazon.p047a.p048a.p066n.p069b.TaskPipeline
    /* renamed from: a */
    public void mo102903a() {
        for (Runnable runnable : this.f2642c) {
            if (KiwiLogger.f2770a) {
                KiwiLogger kiwiLogger = f2640a;
                kiwiLogger.m102829a(this.f2643d + ": Removing callback: " + runnable);
            }
            this.f2641b.removeCallbacks(runnable);
        }
        this.f2642c.clear();
        if (this.f2641b.getLooper() == Looper.getMainLooper() || !this.f2641b.getLooper().getThread().isAlive()) {
            return;
        }
        KiwiLogger kiwiLogger2 = f2640a;
        kiwiLogger2.m102829a("Interrupting looper thread!");
        this.f2641b.getLooper().getThread().interrupt();
        kiwiLogger2.m102829a("Quitting looper: " + this.f2641b.getLooper().getThread() + ", " + this.f2641b.getLooper().getThread().isAlive());
        this.f2641b.getLooper().quit();
    }
}
