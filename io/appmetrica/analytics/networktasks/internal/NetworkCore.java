package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.networktasks.impl.C35123d;
import io.appmetrica.analytics.networktasks.impl.C35125f;
import io.appmetrica.analytics.networktasks.impl.C35126g;
import io.appmetrica.analytics.networktasks.impl.RunnableC35127h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes9.dex */
public class NetworkCore extends InterruptionSafeThread {

    /* renamed from: a */
    private final LinkedBlockingQueue f95881a;

    /* renamed from: b */
    private final Object f95882b;

    /* renamed from: c */
    private final Object f95883c;

    /* renamed from: d */
    private volatile C35123d f95884d;

    /* renamed from: e */
    private final C35126g f95885e;

    public NetworkCore() {
        this(new C35126g());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        NetworkTask networkTask = null;
        while (isRunning()) {
            try {
                synchronized (this.f95883c) {
                }
                this.f95884d = (C35123d) this.f95881a.take();
                networkTask = this.f95884d.f95852a;
                Executor executor = networkTask.getExecutor();
                this.f95885e.getClass();
                executor.execute(new RunnableC35127h(networkTask, this, new C35125f()));
                synchronized (this.f95883c) {
                    this.f95884d = null;
                    networkTask.onTaskFinished();
                    networkTask.onTaskRemoved();
                }
            } catch (InterruptedException unused) {
                synchronized (this.f95883c) {
                    this.f95884d = null;
                    if (networkTask != null) {
                        networkTask.onTaskFinished();
                        networkTask.onTaskRemoved();
                    }
                }
            } catch (Throwable th) {
                synchronized (this.f95883c) {
                    this.f95884d = null;
                    if (networkTask != null) {
                        networkTask.onTaskFinished();
                        networkTask.onTaskRemoved();
                    }
                    throw th;
                }
            }
        }
    }

    public void startTask(NetworkTask networkTask) {
        synchronized (this.f95882b) {
            C35123d c35123d = new C35123d(networkTask);
            if (isRunning() && !this.f95881a.contains(c35123d) && !c35123d.equals(this.f95884d) && networkTask.onTaskAdded()) {
                this.f95881a.offer(c35123d);
            }
        }
    }

    public void stopTasks() {
        synchronized (this.f95883c) {
            C35123d c35123d = this.f95884d;
            if (c35123d != null) {
                c35123d.f95852a.onTaskRemoved();
            }
            ArrayList arrayList = new ArrayList(this.f95881a.size());
            this.f95881a.drainTo(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C35123d) it.next()).f95852a.onTaskRemoved();
            }
        }
    }

    NetworkCore(C35126g c35126g) {
        this.f95881a = new LinkedBlockingQueue();
        this.f95882b = new Object();
        this.f95883c = new Object();
        this.f95885e = c35126g;
    }
}
