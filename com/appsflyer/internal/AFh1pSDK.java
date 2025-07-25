package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class AFh1pSDK {
    @Nullable
    public final Intent AFInAppEventType;
    @NotNull
    public final String AFKeystoreWrapper;
    @Nullable
    public final String valueOf;

    public AFh1pSDK(@NotNull Activity activity, @NotNull AFi1rSDK aFi1rSDK) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(aFi1rSDK, "");
        this.AFInAppEventType = activity.getIntent();
        this.AFKeystoreWrapper = aFi1rSDK.valueOf(activity);
        this.valueOf = aFi1rSDK.AFKeystoreWrapper(activity);
    }
}
