package com.smaato.sdk.core.util.appbackground;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.appbackground.AppBackgroundDetector;
import com.smaato.sdk.core.util.diinjection.Inject;

/* loaded from: classes7.dex */
public class AppBackgroundAwareScheduler implements AppBackgroundDetector.Listener {
    @Inject
    private static AppBackgroundDetector appBackgroundDetector;
    private boolean appInBackgroundAtLastCheck;
    private final Handler handler = Threads.newUiHandler();
    private long lastCheckTimeMs;
    private long remainingDelayTimeMs;
    @Nullable
    private Runnable scheduledHandlerTask;
    @NonNull
    private final Runnable scheduledTask;

    public AppBackgroundAwareScheduler(@NonNull Runnable runnable) {
        this.scheduledTask = runnable;
        AndroidsInjector.injectStatic(AppBackgroundAwareScheduler.class);
    }

    private void cancelPost() {
        Runnable runnable = this.scheduledHandlerTask;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
            this.scheduledHandlerTask = null;
        }
    }

    private void cancelTaskScheduling() {
        appBackgroundDetector.deleteListener(this);
        cancelPost();
    }

    public synchronized void checkpoint() {
        boolean isAppInBackground = appBackgroundDetector.isAppInBackground();
        long currentTimeMillis = System.currentTimeMillis();
        if (isAppInBackground) {
            cancelPost();
        }
        if (!this.appInBackgroundAtLastCheck) {
            long j = this.remainingDelayTimeMs - (currentTimeMillis - this.lastCheckTimeMs);
            this.remainingDelayTimeMs = j;
            if (j <= 0) {
                runScheduledTask();
                return;
            }
        }
        this.lastCheckTimeMs = currentTimeMillis;
        if (!isAppInBackground && this.scheduledHandlerTask == null) {
            postScheduledTaskWithRemainingDelay();
        }
    }

    private void postScheduledTaskWithRemainingDelay() {
        Runnable runnable = new Runnable() { // from class: com.smaato.sdk.core.util.appbackground.a
            {
                AppBackgroundAwareScheduler.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AppBackgroundAwareScheduler.this.checkpoint();
            }
        };
        this.scheduledHandlerTask = runnable;
        this.handler.postDelayed(runnable, this.remainingDelayTimeMs);
    }

    private void runScheduledTask() {
        cancelTaskScheduling();
        this.scheduledTask.run();
    }

    public synchronized void cancel() {
        cancelTaskScheduling();
    }

    @Override // com.smaato.sdk.core.util.appbackground.AppBackgroundDetector.Listener
    public void onAppEnteredInBackground() {
        checkpoint();
    }

    @Override // com.smaato.sdk.core.util.appbackground.AppBackgroundDetector.Listener
    public void onAppEnteredInForeground() {
        checkpoint();
    }

    public void schedule(long j) {
        this.lastCheckTimeMs = System.currentTimeMillis();
        this.remainingDelayTimeMs = j;
        this.appInBackgroundAtLastCheck = appBackgroundDetector.isAppInBackground();
        postScheduledTaskWithRemainingDelay();
        appBackgroundDetector.addListener(this, false);
    }
}
