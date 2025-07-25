package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OnBackPressedDispatcher.kt */
@Metadata
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    private boolean backInvokedCallbackRegistered;
    @Nullable
    private Functions<Unit> enabledChangedCallback;
    @Nullable
    private final Runnable fallbackOnBackPressed;
    @Nullable
    private OnBackInvokedDispatcher invokedDispatcher;
    @Nullable
    private OnBackInvokedCallback onBackInvokedCallback;
    @NotNull
    private final ArrayDeque<OnBackPressedCallback> onBackPressedCallbacks;

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata
    /* renamed from: androidx.activity.OnBackPressedDispatcher$1 */
    /* loaded from: classes.dex */
    public static final class C01181 extends Lambda implements Functions<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01181() {
            super(0);
            OnBackPressedDispatcher.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f99208a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            OnBackPressedDispatcher.this.updateBackInvokedCallbackState$activity_release();
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata
    /* renamed from: androidx.activity.OnBackPressedDispatcher$2 */
    /* loaded from: classes.dex */
    public static final class C01192 extends Lambda implements Functions<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01192() {
            super(0);
            OnBackPressedDispatcher.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f99208a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            OnBackPressedDispatcher.this.onBackPressed();
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @RequiresApi(33)
    @Metadata
    /* loaded from: classes.dex */
    public static final class Api33Impl {
        @NotNull
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        public static final void createOnBackInvokedCallback$lambda$0(Functions onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        @DoNotInline
        @NotNull
        public final OnBackInvokedCallback createOnBackInvokedCallback(@NotNull final Functions<Unit> onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.k
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.Api33Impl.createOnBackInvokedCallback$lambda$0(onBackInvoked);
                }
            };
        }

        @DoNotInline
        public final void registerOnBackInvokedCallback(@NotNull Object dispatcher, int i, @NotNull Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) callback);
        }

        @DoNotInline
        public final void unregisterOnBackInvokedCallback(@NotNull Object dispatcher, @NotNull Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata
    /* loaded from: classes.dex */
    public final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {
        @Nullable
        private Cancellable currentCancellable;
        @NotNull
        private final Lifecycle lifecycle;
        @NotNull
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public LifecycleOnBackPressedCancellable(@NotNull OnBackPressedDispatcher onBackPressedDispatcher, @NotNull Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.lifecycle.removeObserver(this);
            this.onBackPressedCallback.removeCancellable(this);
            Cancellable cancellable = this.currentCancellable;
            if (cancellable != null) {
                cancellable.cancel();
            }
            this.currentCancellable = null;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == Lifecycle.Event.ON_START) {
                this.currentCancellable = this.this$0.addCancellableCallback$activity_release(this.onBackPressedCallback);
            } else if (event == Lifecycle.Event.ON_STOP) {
                Cancellable cancellable = this.currentCancellable;
                if (cancellable != null) {
                    cancellable.cancel();
                }
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata
    /* loaded from: classes.dex */
    public final class OnBackPressedCancellable implements Cancellable {
        @NotNull
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public OnBackPressedCancellable(@NotNull OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.onBackPressedCallback = onBackPressedCallback;
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.this$0.onBackPressedCallbacks.remove(this.onBackPressedCallback);
            this.onBackPressedCallback.removeCancellable(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
                this.this$0.updateBackInvokedCallbackState$activity_release();
            }
        }
    }

    public OnBackPressedDispatcher() {
        this(null, 1, null);
    }

    @MainThread
    public final void addCallback(@NotNull OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        addCancellableCallback$activity_release(onBackPressedCallback);
    }

    @MainThread
    @NotNull
    public final Cancellable addCancellableCallback$activity_release(@NotNull OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.onBackPressedCallbacks.add(onBackPressedCallback);
        OnBackPressedCancellable onBackPressedCancellable = new OnBackPressedCancellable(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(onBackPressedCancellable);
        if (Build.VERSION.SDK_INT >= 33) {
            updateBackInvokedCallbackState$activity_release();
            onBackPressedCallback.setEnabledChangedCallback$activity_release(this.enabledChangedCallback);
        }
        return onBackPressedCancellable;
    }

    @MainThread
    public final boolean hasEnabledCallbacks() {
        ArrayDeque<OnBackPressedCallback> arrayDeque = this.onBackPressedCallbacks;
        if ((arrayDeque instanceof Collection) && arrayDeque.isEmpty()) {
            return false;
        }
        for (OnBackPressedCallback onBackPressedCallback : arrayDeque) {
            if (onBackPressedCallback.isEnabled()) {
                return true;
            }
        }
        return false;
    }

    @MainThread
    public final void onBackPressed() {
        OnBackPressedCallback onBackPressedCallback;
        ArrayDeque<OnBackPressedCallback> arrayDeque = this.onBackPressedCallbacks;
        ListIterator<OnBackPressedCallback> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                onBackPressedCallback = listIterator.previous();
                if (onBackPressedCallback.isEnabled()) {
                    break;
                }
            } else {
                onBackPressedCallback = null;
                break;
            }
        }
        OnBackPressedCallback onBackPressedCallback2 = onBackPressedCallback;
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    @RequiresApi(33)
    public final void setOnBackInvokedDispatcher(@NotNull OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.invokedDispatcher = invoker;
        updateBackInvokedCallbackState$activity_release();
    }

    @RequiresApi(33)
    public final void updateBackInvokedCallbackState$activity_release() {
        boolean hasEnabledCallbacks = hasEnabledCallbacks();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.invokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (hasEnabledCallbacks && !this.backInvokedCallbackRegistered) {
                Api33Impl.INSTANCE.registerOnBackInvokedCallback(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.backInvokedCallbackRegistered = true;
            } else if (!hasEnabledCallbacks && this.backInvokedCallbackRegistered) {
                Api33Impl.INSTANCE.unregisterOnBackInvokedCallback(onBackInvokedDispatcher, onBackInvokedCallback);
                this.backInvokedCallbackRegistered = false;
            }
        }
    }

    public OnBackPressedDispatcher(@Nullable Runnable runnable) {
        this.fallbackOnBackPressed = runnable;
        this.onBackPressedCallbacks = new ArrayDeque<>();
        if (Build.VERSION.SDK_INT >= 33) {
            this.enabledChangedCallback = new C01181();
            this.onBackInvokedCallback = Api33Impl.INSTANCE.createOnBackInvokedCallback(new C01192());
        }
    }

    @MainThread
    public final void addCallback(@NotNull LifecycleOwner owner, @NotNull OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        if (Build.VERSION.SDK_INT >= 33) {
            updateBackInvokedCallbackState$activity_release();
            onBackPressedCallback.setEnabledChangedCallback$activity_release(this.enabledChangedCallback);
        }
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : runnable);
    }
}
