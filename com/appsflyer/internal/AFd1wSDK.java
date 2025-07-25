package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1uSDK;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class AFd1wSDK implements Application.ActivityLifecycleCallbacks {
    @NotNull
    private final ScheduledExecutorService AFInAppEventParameterName;
    @NotNull
    private final Executor AFInAppEventType;
    @NotNull
    private final AFi1rSDK AFKeystoreWrapper;
    private boolean AFLogger;

    /* renamed from: e */
    private boolean f12987e;
    @NotNull
    final AFd1uSDK.AFa1vSDK valueOf;
    @NotNull
    private final AFc1tSDK values;

    public AFd1wSDK(@NotNull Executor executor, @NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFc1tSDK aFc1tSDK, @NotNull AFi1rSDK aFi1rSDK, @NotNull AFd1uSDK.AFa1vSDK aFa1vSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFc1tSDK, "");
        Intrinsics.checkNotNullParameter(aFi1rSDK, "");
        Intrinsics.checkNotNullParameter(aFa1vSDK, "");
        this.AFInAppEventType = executor;
        this.AFInAppEventParameterName = scheduledExecutorService;
        this.values = aFc1tSDK;
        this.AFKeystoreWrapper = aFi1rSDK;
        this.valueOf = aFa1vSDK;
    }

    public static final void AFInAppEventType(AFd1wSDK aFd1wSDK, AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        if (!aFd1wSDK.AFLogger) {
            try {
                aFd1wSDK.valueOf.values(aFh1pSDK);
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e, true);
            }
        }
        aFd1wSDK.f12987e = false;
        aFd1wSDK.AFLogger = true;
    }

    public static final void AFKeystoreWrapper(AFd1wSDK aFd1wSDK) {
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        aFd1wSDK.f12987e = true;
        try {
            ScheduledExecutorService scheduledExecutorService = aFd1wSDK.AFInAppEventParameterName;
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.p
                {
                    AFd1wSDK.this = aFd1wSDK;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AFd1wSDK.AFInAppEventType(AFd1wSDK.this);
                }
            };
            AFd1uSDK.AFa1zSDK aFa1zSDK = AFd1uSDK.AFa1zSDK;
            scheduledExecutorService.schedule(runnable, AFd1uSDK.AFa1zSDK.valueOf(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Uri uri;
        Intrinsics.checkNotNullParameter(activity, "");
        AFc1tSDK aFc1tSDK = this.values;
        Intent intent = activity.getIntent();
        if (intent != null && "android.intent.action.VIEW".equals(intent.getAction())) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        if (uri != null && intent != aFc1tSDK.AFInAppEventType) {
            aFc1tSDK.AFInAppEventType = intent;
        }
        this.AFKeystoreWrapper.AFInAppEventType(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AFInAppEventType.execute(new Runnable() { // from class: com.appsflyer.internal.n
            {
                AFd1wSDK.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AFd1wSDK.AFKeystoreWrapper(AFd1wSDK.this);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        final AFh1pSDK aFh1pSDK = new AFh1pSDK(activity, this.AFKeystoreWrapper);
        this.AFInAppEventType.execute(new Runnable() { // from class: com.appsflyer.internal.o
            {
                AFd1wSDK.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AFd1wSDK.AFInAppEventType(AFd1wSDK.this, aFh1pSDK);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    public static final void AFInAppEventType(AFd1wSDK aFd1wSDK) {
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        if (aFd1wSDK.AFLogger && aFd1wSDK.f12987e) {
            aFd1wSDK.AFLogger = false;
            try {
                aFd1wSDK.valueOf.AFKeystoreWrapper();
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener threw exception! ", e);
            }
        }
    }
}
