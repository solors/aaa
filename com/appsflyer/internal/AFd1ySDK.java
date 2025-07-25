package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.appsflyer.internal.AFd1uSDK;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class AFd1ySDK implements AFd1uSDK {
    @NotNull
    private final AFi1rSDK AFInAppEventParameterName;
    @NotNull
    private final ScheduledExecutorService AFInAppEventType;
    @NotNull
    private final Executor AFKeystoreWrapper;
    @NotNull
    private final AFc1tSDK valueOf;
    @Nullable
    private AFd1wSDK values;

    public AFd1ySDK(@NotNull Executor executor, @NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFc1tSDK aFc1tSDK, @NotNull AFi1rSDK aFi1rSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFc1tSDK, "");
        Intrinsics.checkNotNullParameter(aFi1rSDK, "");
        this.AFKeystoreWrapper = executor;
        this.AFInAppEventType = scheduledExecutorService;
        this.valueOf = aFc1tSDK;
        this.AFInAppEventParameterName = aFi1rSDK;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void AFKeystoreWrapper(@NotNull Context context, @NotNull AFd1uSDK.AFa1vSDK aFa1vSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFa1vSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (this.values != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.values);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
        }
        this.values = null;
        AFd1wSDK aFd1wSDK = new AFd1wSDK(this.AFKeystoreWrapper, this.AFInAppEventType, this.valueOf, this.AFInAppEventParameterName, aFa1vSDK);
        this.values = aFd1wSDK;
        if (context instanceof Activity) {
            aFd1wSDK.onActivityResumed((Activity) context);
        }
        Application values = AFb1vSDK.values(context);
        if (values != null) {
            values.registerActivityLifecycleCallbacks(this.values);
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final boolean values() {
        if (this.values != null) {
            return true;
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void AFKeystoreWrapper() {
        AFd1uSDK.AFa1vSDK aFa1vSDK;
        AFd1wSDK aFd1wSDK = this.values;
        if (aFd1wSDK == null || (aFa1vSDK = aFd1wSDK.valueOf) == null) {
            return;
        }
        aFa1vSDK.AFKeystoreWrapper();
    }
}
