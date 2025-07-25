package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class AFi1vSDK {
    @Nullable
    public AFi1xSDK AFInAppEventType;
    @NotNull
    public final Context valueOf;

    public AFi1vSDK(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = context;
    }
}
