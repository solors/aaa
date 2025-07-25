package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class AFi1uSDK {
    private final boolean AFInAppEventParameterName;
    @Nullable
    public final String AFInAppEventType;
    @NotNull
    public final String AFKeystoreWrapper;
    @Nullable
    public final String values;

    public AFi1uSDK(@NotNull String str, @Nullable String str2, @Nullable String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFKeystoreWrapper = str;
        this.values = str2;
        this.AFInAppEventType = str3;
        this.AFInAppEventParameterName = z;
    }

    public final boolean valueOf() {
        return this.AFInAppEventParameterName;
    }
}
