package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.pw */
/* loaded from: classes8.dex */
public final class C31156pw {
    @NotNull

    /* renamed from: a */
    private final String f84092a;
    @NotNull

    /* renamed from: b */
    private final C31240qw f84093b;

    public C31156pw(@NotNull String sdkVersion, @NotNull C31240qw sdkIntegrationStatusData) {
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(sdkIntegrationStatusData, "sdkIntegrationStatusData");
        this.f84092a = sdkVersion;
        this.f84093b = sdkIntegrationStatusData;
    }

    @NotNull
    /* renamed from: a */
    public final C31240qw m30572a() {
        return this.f84093b;
    }

    @NotNull
    /* renamed from: b */
    public final String m30571b() {
        return this.f84092a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31156pw)) {
            return false;
        }
        C31156pw c31156pw = (C31156pw) obj;
        if (Intrinsics.m17075f(this.f84092a, c31156pw.f84092a) && Intrinsics.m17075f(this.f84093b, c31156pw.f84093b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f84093b.hashCode() + (this.f84092a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f84092a;
        C31240qw c31240qw = this.f84093b;
        return "DebugPanelSdkIntegrationData(sdkVersion=" + str + ", sdkIntegrationStatusData=" + c31240qw + ")";
    }
}
