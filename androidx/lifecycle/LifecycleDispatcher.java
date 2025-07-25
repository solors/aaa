package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LifecycleDispatcher.kt */
@Metadata
/* loaded from: classes.dex */
public final class LifecycleDispatcher {
    @NotNull
    public static final LifecycleDispatcher INSTANCE = new LifecycleDispatcher();
    @NotNull
    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher.kt */
    @Metadata
    @VisibleForTesting
    /* loaded from: classes.dex */
    public static final class DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks {
        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ReportFragment.Companion.injectIfNeededIn(activity);
        }
    }

    private LifecycleDispatcher() {
    }

    public static final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (initialized.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.m17073h(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new DispatcherActivityCallback());
    }
}
