package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@WorkerThread
/* loaded from: classes2.dex */
public final class AFd1cSDK implements AFd1eSDK {
    @NotNull
    private final AFd1hSDK valueOf;

    public AFd1cSDK(@NotNull AFd1hSDK aFd1hSDK) {
        Intrinsics.checkNotNullParameter(aFd1hSDK, "");
        this.valueOf = aFd1hSDK;
    }

    @Override // com.appsflyer.internal.AFd1eSDK
    public final void AFInAppEventType(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFd1dSDK(bArr, map, 2000).values()) {
            this.valueOf.AFKeystoreWrapper();
        }
    }
}
