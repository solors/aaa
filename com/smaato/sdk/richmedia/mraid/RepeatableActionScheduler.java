package com.smaato.sdk.richmedia.mraid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.appbgdetection.AppBackgroundAwareHandler;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.richmedia.mraid.RepeatableActionScheduler;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class RepeatableActionScheduler {
    @NonNull
    private final Runnable actionDecorator = new RunnableC27511a();
    @NonNull
    private final AtomicReference<Runnable> actionRef = new AtomicReference<>();
    @NonNull
    private final AppBackgroundAwareHandler appBackgroundAwareHandler;
    private final long delayMillis;
    @NonNull
    private final Logger logger;

    /* renamed from: com.smaato.sdk.richmedia.mraid.RepeatableActionScheduler$a */
    /* loaded from: classes7.dex */
    public class RunnableC27511a implements Runnable {
        RunnableC27511a() {
            RepeatableActionScheduler.this = r1;
        }

        /* renamed from: b */
        public /* synthetic */ void m39112b(Runnable runnable) {
            runnable.run();
            RepeatableActionScheduler.this.schedule();
        }

        @Override // java.lang.Runnable
        public void run() {
            Objects.onNotNull((Runnable) RepeatableActionScheduler.this.actionRef.get(), new Consumer() { // from class: com.smaato.sdk.richmedia.mraid.a
                {
                    RepeatableActionScheduler.RunnableC27511a.this = this;
                }

                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    RepeatableActionScheduler.RunnableC27511a.this.m39112b((Runnable) obj);
                }
            });
        }
    }

    public RepeatableActionScheduler(@NonNull Logger logger, @NonNull AppBackgroundAwareHandler appBackgroundAwareHandler, long j) {
        this.logger = (Logger) Objects.requireNonNull(logger);
        this.appBackgroundAwareHandler = (AppBackgroundAwareHandler) Objects.requireNonNull(appBackgroundAwareHandler);
        if (j > 0) {
            this.delayMillis = j;
            return;
        }
        throw new IllegalArgumentException("delay must be positive for " + RepeatableActionScheduler.class.getSimpleName() + "::new");
    }

    private boolean isScheduled() {
        if (this.actionRef.get() != null) {
            return true;
        }
        return false;
    }

    public void schedule() {
        this.appBackgroundAwareHandler.postDelayed("Repeatable action timer", this.actionDecorator, this.delayMillis, null);
    }

    public void start(@Nullable Runnable runnable) {
        if (isScheduled()) {
            return;
        }
        if (runnable == null) {
            this.logger.info(LogDomain.MRAID, "No action to schedule", new Object[0]);
            return;
        }
        this.actionRef.set(runnable);
        schedule();
    }

    public void stop() {
        this.appBackgroundAwareHandler.stop();
        this.actionRef.set(null);
    }
}
