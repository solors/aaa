package com.mobilefuse.sdk.device;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: UserAgentInfo.kt */
@Metadata
/* loaded from: classes7.dex */
public final class UserAgentInfoKt {
    @NotNull
    private static final UserAgentInfo userAgentInfo = new UserAgentInfo(DeviceCache.INSTANCE.getMfSharedPrefs());

    @NotNull
    public static final UserAgentInfo getUserAgentInfo() {
        return userAgentInfo;
    }
}
