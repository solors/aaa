package com.smaato.sdk.core.appbgdetection;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.appbgdetection.AppBackgroundAwareHandler;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.appbackground.AppBackgroundDetector;

/* loaded from: classes7.dex */
public class AppBackgroundAwareHandler {
    @Nullable
    private PausableAction action;
    @NonNull
    private final AppBackgroundDetector appBackgroundDetector;
    @NonNull
    private final AppBackgroundDetector.Listener appBackgroundDetectorListener = new C27010a();
    @NonNull
    private final Handler handler;
    @NonNull
    private Logger logger;

    /* renamed from: com.smaato.sdk.core.appbgdetection.AppBackgroundAwareHandler$a */
    /* loaded from: classes7.dex */
    public class C27010a implements AppBackgroundDetector.Listener {
        C27010a() {
            AppBackgroundAwareHandler.this = r1;
        }

        /* renamed from: c */
        public /* synthetic */ void m39727c() {
            AppBackgroundAwareHandler.this.pauseAction();
        }

        /* renamed from: d */
        public /* synthetic */ void m39726d() {
            AppBackgroundAwareHandler.this.unpauseAction();
        }

        @Override // com.smaato.sdk.core.util.appbackground.AppBackgroundDetector.Listener
        public void onAppEnteredInBackground() {
            Threads.ensureInvokedOnHandlerThread(AppBackgroundAwareHandler.this.handler, new Runnable() { // from class: com.smaato.sdk.core.appbgdetection.e
                {
                    AppBackgroundAwareHandler.C27010a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AppBackgroundAwareHandler.C27010a.this.m39727c();
                }
            });
        }

        @Override // com.smaato.sdk.core.util.appbackground.AppBackgroundDetector.Listener
        public void onAppEnteredInForeground() {
            Threads.ensureInvokedOnHandlerThread(AppBackgroundAwareHandler.this.handler, new Runnable() { // from class: com.smaato.sdk.core.appbgdetection.d
                {
                    AppBackgroundAwareHandler.C27010a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AppBackgroundAwareHandler.C27010a.this.m39726d();
                }
            });
        }
    }

    public AppBackgroundAwareHandler(@NonNull Logger logger, @NonNull Handler handler, @NonNull AppBackgroundDetector appBackgroundDetector) {
        this.logger = (Logger) Objects.requireNonNull(logger);
        this.handler = (Handler) Objects.requireNonNull(handler);
        this.appBackgroundDetector = (AppBackgroundDetector) Objects.requireNonNull(appBackgroundDetector);
    }

    public /* synthetic */ void lambda$startAction$1(Runnable runnable) {
        this.action = null;
        this.appBackgroundDetector.deleteListener(this.appBackgroundDetectorListener);
        runnable.run();
    }

    public void pauseAction() {
        Threads.ensureHandlerThread(this.handler);
        PausableAction pausableAction = this.action;
        if (pausableAction != null && !pausableAction.isPaused()) {
            this.action.pause();
            this.logger.info(LogDomain.CORE, "paused %s", this.action.name);
        }
    }

    /* renamed from: startAction */
    public void lambda$postDelayed$0(@NonNull String str, @NonNull final Runnable runnable, long j, @Nullable PauseUnpauseListener pauseUnpauseListener) {
        Threads.ensureHandlerThread(this.handler);
        PausableAction pausableAction = this.action;
        if (pausableAction != null) {
            this.handler.removeCallbacks(pausableAction);
            this.appBackgroundDetector.deleteListener(this.appBackgroundDetectorListener);
            this.action = null;
        }
        PausableAction pausableAction2 = new PausableAction(str, this.handler, new Runnable() { // from class: com.smaato.sdk.core.appbgdetection.c
            {
                AppBackgroundAwareHandler.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AppBackgroundAwareHandler.this.lambda$startAction$1(runnable);
            }
        }, j, pauseUnpauseListener);
        this.action = pausableAction2;
        this.handler.postDelayed(pausableAction2, j);
        this.appBackgroundDetector.addListener(this.appBackgroundDetectorListener, true);
    }

    public void stopAction() {
        Threads.ensureHandlerThread(this.handler);
        if (this.action != null) {
            this.appBackgroundDetector.deleteListener(this.appBackgroundDetectorListener);
            this.handler.removeCallbacks(this.action);
            this.action = null;
        }
    }

    public void unpauseAction() {
        Threads.ensureHandlerThread(this.handler);
        PausableAction pausableAction = this.action;
        if (pausableAction != null && pausableAction.isPaused()) {
            this.action.unpause();
            this.logger.info(LogDomain.CORE, "resumed %s", this.action.name);
        }
    }

    public void postDelayed(@NonNull final String str, @NonNull final Runnable runnable, final long j, @Nullable final PauseUnpauseListener pauseUnpauseListener) {
        Objects.requireNonNull(str);
        if (j > 0) {
            Objects.requireNonNull(runnable);
            Threads.ensureInvokedOnHandlerThread(this.handler, new Runnable() { // from class: com.smaato.sdk.core.appbgdetection.b
                {
                    AppBackgroundAwareHandler.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AppBackgroundAwareHandler.this.lambda$postDelayed$0(str, runnable, j, pauseUnpauseListener);
                }
            });
            return;
        }
        throw new IllegalArgumentException("delay must be positive for " + getClass().getSimpleName() + "::postDelayed");
    }

    public void stop() {
        Threads.ensureInvokedOnHandlerThread(this.handler, new Runnable() { // from class: com.smaato.sdk.core.appbgdetection.a
            {
                AppBackgroundAwareHandler.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AppBackgroundAwareHandler.this.stopAction();
            }
        });
    }
}
