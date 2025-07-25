package com.google.firebase.concurrent;

import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes4.dex */
final class PausableExecutorImpl implements PausableExecutor {

    /* renamed from: b */
    private volatile boolean f42176b;

    /* renamed from: c */
    private final Executor f42177c;
    @VisibleForTesting

    /* renamed from: d */
    final LinkedBlockingQueue<Runnable> f42178d = new LinkedBlockingQueue<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public PausableExecutorImpl(boolean z, Executor executor) {
        this.f42176b = z;
        this.f42177c = executor;
    }

    /* renamed from: a */
    private void m67254a() {
        if (this.f42176b) {
            return;
        }
        Runnable poll = this.f42178d.poll();
        while (poll != null) {
            this.f42177c.execute(poll);
            if (!this.f42176b) {
                poll = this.f42178d.poll();
            } else {
                poll = null;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f42178d.offer(runnable);
        m67254a();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public boolean isPaused() {
        return this.f42176b;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void pause() {
        this.f42176b = true;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void resume() {
        this.f42176b = false;
        m67254a();
    }
}
