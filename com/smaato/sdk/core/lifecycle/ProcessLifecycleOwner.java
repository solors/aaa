package com.smaato.sdk.core.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.lifecycle.ProcessLifecycleOwner;
import com.smaato.sdk.core.util.ActivityLifecycleCallbacksAdapter;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.Consumer;

/* loaded from: classes7.dex */
public final class ProcessLifecycleOwner {
    private static final ProcessLifecycleOwner instance = new ProcessLifecycleOwner();
    @Nullable
    private Handler handler;
    @Nullable
    private Listener listener;
    private boolean shouldTriggerFirstActivityStarted;
    @NonNull
    private final Runnable delayedPauseRunnable = new Runnable() { // from class: com.smaato.sdk.core.lifecycle.v
        @Override // java.lang.Runnable
        public final void run() {
            ProcessLifecycleOwner.m39518a(ProcessLifecycleOwner.this);
        }
    };
    private int startedCounter = 0;
    private int resumedCounter = 0;
    private boolean pauseSent = true;
    private boolean stopSent = true;

    /* loaded from: classes7.dex */
    public interface Listener {
        void onFirstActivityStarted();

        void onLastActivityStopped();
    }

    /* renamed from: com.smaato.sdk.core.lifecycle.ProcessLifecycleOwner$a */
    /* loaded from: classes7.dex */
    public class C27126a extends ActivityLifecycleCallbacksAdapter {
        C27126a() {
            ProcessLifecycleOwner.this = r1;
        }

        @Override // com.smaato.sdk.core.util.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            ProcessLifecycleOwner.this.activityPaused();
        }

        @Override // com.smaato.sdk.core.util.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
            ProcessLifecycleOwner.this.activityResumed();
        }

        @Override // com.smaato.sdk.core.util.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
            ProcessLifecycleOwner.this.activityStarted();
        }

        @Override // com.smaato.sdk.core.util.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            ProcessLifecycleOwner.this.activityStopped();
        }
    }

    private ProcessLifecycleOwner() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m39518a(ProcessLifecycleOwner processLifecycleOwner) {
        processLifecycleOwner.lambda$new$0();
    }

    public void activityPaused() {
        int i = this.resumedCounter - 1;
        this.resumedCounter = i;
        if (i == 0) {
            Objects.onNotNull(this.handler, new Consumer() { // from class: com.smaato.sdk.core.lifecycle.w
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ProcessLifecycleOwner.m39516c(ProcessLifecycleOwner.this, (Handler) obj);
                }
            });
        }
    }

    public void activityResumed() {
        int i = this.resumedCounter + 1;
        this.resumedCounter = i;
        if (i == 1) {
            if (this.pauseSent) {
                this.pauseSent = false;
            } else {
                Objects.onNotNull(this.handler, new Consumer() { // from class: com.smaato.sdk.core.lifecycle.u
                    @Override // com.smaato.sdk.core.util.p574fi.Consumer
                    public final void accept(Object obj) {
                        ProcessLifecycleOwner.m39517b(ProcessLifecycleOwner.this, (Handler) obj);
                    }
                });
            }
        }
    }

    public void activityStarted() {
        int i = this.startedCounter + 1;
        this.startedCounter = i;
        if (i == 1 && this.stopSent) {
            Objects.onNotNull(this.listener, new Consumer() { // from class: com.smaato.sdk.core.lifecycle.t
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((ProcessLifecycleOwner.Listener) obj).onFirstActivityStarted();
                }
            });
            this.shouldTriggerFirstActivityStarted = true;
            this.stopSent = false;
        }
    }

    public void activityStopped() {
        this.startedCounter--;
        dispatchStopIfNeeded();
    }

    private void attach(@NonNull Context context, @NonNull Handler handler) {
        this.handler = handler;
        if (!(context.getApplicationContext() instanceof Application)) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C27126a());
    }

    /* renamed from: b */
    public static /* synthetic */ void m39517b(ProcessLifecycleOwner processLifecycleOwner, Handler handler) {
        processLifecycleOwner.lambda$activityResumed$1(handler);
    }

    /* renamed from: c */
    public static /* synthetic */ void m39516c(ProcessLifecycleOwner processLifecycleOwner, Handler handler) {
        processLifecycleOwner.lambda$activityPaused$2(handler);
    }

    private void dispatchPauseIfNeeded() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
        }
    }

    private void dispatchStopIfNeeded() {
        if (this.startedCounter == 0 && this.pauseSent) {
            Objects.onNotNull(this.listener, new Consumer() { // from class: com.smaato.sdk.core.lifecycle.s
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((ProcessLifecycleOwner.Listener) obj).onLastActivityStopped();
                }
            });
            this.stopSent = true;
        }
    }

    @NonNull
    public static ProcessLifecycleOwner get() {
        return instance;
    }

    public static void init(@NonNull Context context, @NonNull Handler handler) {
        instance.attach(context, handler);
    }

    public /* synthetic */ void lambda$activityPaused$2(Handler handler) {
        handler.postDelayed(this.delayedPauseRunnable, 700L);
    }

    public /* synthetic */ void lambda$activityResumed$1(Handler handler) {
        handler.removeCallbacks(this.delayedPauseRunnable);
    }

    public /* synthetic */ void lambda$new$0() {
        dispatchPauseIfNeeded();
        dispatchStopIfNeeded();
    }

    public void setListener(@NonNull Listener listener) {
        this.listener = listener;
        if (this.shouldTriggerFirstActivityStarted) {
            listener.onFirstActivityStarted();
        }
    }
}
