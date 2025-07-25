package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ServiceLifecycleDispatcher.kt */
@Metadata
/* loaded from: classes.dex */
public class ServiceLifecycleDispatcher {
    @NotNull
    private final Handler handler;
    @Nullable
    private DispatchRunnable lastDispatchRunnable;
    @NotNull
    private final LifecycleRegistry registry;

    /* compiled from: ServiceLifecycleDispatcher.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class DispatchRunnable implements Runnable {
        @NotNull
        private final Lifecycle.Event event;
        @NotNull
        private final LifecycleRegistry registry;
        private boolean wasExecuted;

        public DispatchRunnable(@NotNull LifecycleRegistry registry, @NotNull Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            Intrinsics.checkNotNullParameter(event, "event");
            this.registry = registry;
            this.event = event;
        }

        @NotNull
        public final Lifecycle.Event getEvent() {
            return this.event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.wasExecuted) {
                this.registry.handleLifecycleEvent(this.event);
                this.wasExecuted = true;
            }
        }
    }

    public ServiceLifecycleDispatcher(@NotNull LifecycleOwner provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.registry = new LifecycleRegistry(provider);
        this.handler = new Handler();
    }

    private final void postDispatchRunnable(Lifecycle.Event event) {
        DispatchRunnable dispatchRunnable = this.lastDispatchRunnable;
        if (dispatchRunnable != null) {
            dispatchRunnable.run();
        }
        DispatchRunnable dispatchRunnable2 = new DispatchRunnable(this.registry, event);
        this.lastDispatchRunnable = dispatchRunnable2;
        Handler handler = this.handler;
        Intrinsics.m17074g(dispatchRunnable2);
        handler.postAtFrontOfQueue(dispatchRunnable2);
    }

    @NotNull
    public Lifecycle getLifecycle() {
        return this.registry;
    }

    public void onServicePreSuperOnBind() {
        postDispatchRunnable(Lifecycle.Event.ON_START);
    }

    public void onServicePreSuperOnCreate() {
        postDispatchRunnable(Lifecycle.Event.ON_CREATE);
    }

    public void onServicePreSuperOnDestroy() {
        postDispatchRunnable(Lifecycle.Event.ON_STOP);
        postDispatchRunnable(Lifecycle.Event.ON_DESTROY);
    }

    public void onServicePreSuperOnStart() {
        postDispatchRunnable(Lifecycle.Event.ON_START);
    }
}
