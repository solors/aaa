package com.smaato.sdk.video.utils;

import android.os.Handler;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;

/* loaded from: classes7.dex */
public class RepeatableAction implements Runnable {
    @NonNull
    private final Handler handler;
    @NonNull
    private final Listener listener;
    private boolean scheduled;
    private final long throttleMillis;

    @FunctionalInterface
    /* loaded from: classes7.dex */
    public interface Listener {
        void doAction();
    }

    private RepeatableAction(@NonNull Handler handler, long j, @NonNull Listener listener) {
        this.handler = (Handler) Objects.requireNonNull(handler);
        this.throttleMillis = j;
        this.listener = (Listener) Objects.requireNonNull(listener);
    }

    @Override // java.lang.Runnable
    public void run() {
        Threads.ensureHandlerThread(this.handler);
        this.scheduled = false;
        start();
        this.listener.doAction();
    }

    public void start() {
        Threads.ensureHandlerThread(this.handler);
        if (this.scheduled) {
            return;
        }
        this.handler.postDelayed(this, this.throttleMillis);
        this.scheduled = true;
    }

    public void stop() {
        Threads.ensureHandlerThread(this.handler);
        if (!this.scheduled) {
            return;
        }
        this.handler.removeCallbacks(this);
        this.scheduled = false;
    }

    public RepeatableAction(@NonNull Handler handler, @NonNull Listener listener) {
        this(handler, 50L, listener);
    }
}
