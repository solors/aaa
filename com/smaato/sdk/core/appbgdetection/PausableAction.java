package com.smaato.sdk.core.appbgdetection;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;

/* loaded from: classes7.dex */
public class PausableAction implements Runnable {
    @NonNull
    private final Handler handler;
    @NonNull
    public final String name;
    @Nullable
    private final PauseUnpauseListener pauseUnpauseListener;
    private long pausedAt = 0;
    private long remainingDelay;
    @NonNull
    private final Runnable runnable;
    private long startedAt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PausableAction(@NonNull String str, @NonNull Handler handler, @NonNull Runnable runnable, long j, @Nullable PauseUnpauseListener pauseUnpauseListener) {
        this.name = (String) Objects.requireNonNull(str);
        this.handler = (Handler) Objects.requireNonNull(handler);
        this.runnable = (Runnable) Objects.requireNonNull(runnable);
        if (j > 0) {
            this.remainingDelay = j;
            this.pauseUnpauseListener = pauseUnpauseListener;
            this.startedAt = SystemClock.uptimeMillis();
            return;
        }
        throw new IllegalArgumentException("delay must be positive for " + getClass().getSimpleName() + "::new");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isPaused() {
        Threads.ensureHandlerThread(this.handler);
        if (this.pausedAt > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void pause() {
        Threads.ensureHandlerThread(this.handler);
        if (!isPaused()) {
            this.handler.removeCallbacks(this);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.pausedAt = uptimeMillis;
            this.remainingDelay -= uptimeMillis - this.startedAt;
            PauseUnpauseListener pauseUnpauseListener = this.pauseUnpauseListener;
            if (pauseUnpauseListener != null) {
                pauseUnpauseListener.onActionPaused();
                return;
            }
            return;
        }
        throw new RuntimeException("unexpected pause call - action has been already paused");
    }

    @Override // java.lang.Runnable
    public void run() {
        Threads.ensureHandlerThread(this.handler);
        this.runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void unpause() {
        Threads.ensureHandlerThread(this.handler);
        if (isPaused()) {
            this.pausedAt = 0L;
            this.startedAt = SystemClock.uptimeMillis();
            PauseUnpauseListener pauseUnpauseListener = this.pauseUnpauseListener;
            if (pauseUnpauseListener != null) {
                pauseUnpauseListener.onBeforeActionUnpaused();
            }
            this.handler.postDelayed(this, this.remainingDelay);
            return;
        }
        throw new RuntimeException("unexpected unpause call - action has not been paused");
    }
}
