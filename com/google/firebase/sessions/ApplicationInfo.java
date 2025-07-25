package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ApplicationInfo.kt */
@Metadata
/* loaded from: classes4.dex */
public final class ApplicationInfo {
    @NotNull

    /* renamed from: a */
    private final String f43642a;
    @NotNull

    /* renamed from: b */
    private final String f43643b;
    @NotNull

    /* renamed from: c */
    private final String f43644c;
    @NotNull

    /* renamed from: d */
    private final String f43645d;
    @NotNull

    /* renamed from: e */
    private final LogEnvironment f43646e;
    @NotNull

    /* renamed from: f */
    private final AndroidApplicationInfo f43647f;

    public ApplicationInfo(@NotNull String appId, @NotNull String deviceModel, @NotNull String sessionSdkVersion, @NotNull String osVersion, @NotNull LogEnvironment logEnvironment, @NotNull AndroidApplicationInfo androidAppInfo) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(sessionSdkVersion, "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        this.f43642a = appId;
        this.f43643b = deviceModel;
        this.f43644c = sessionSdkVersion;
        this.f43645d = osVersion;
        this.f43646e = logEnvironment;
        this.f43647f = androidAppInfo;
    }

    public static /* synthetic */ ApplicationInfo copy$default(ApplicationInfo applicationInfo, String str, String str2, String str3, String str4, LogEnvironment logEnvironment, AndroidApplicationInfo androidApplicationInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applicationInfo.f43642a;
        }
        if ((i & 2) != 0) {
            str2 = applicationInfo.f43643b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = applicationInfo.f43644c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = applicationInfo.f43645d;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            logEnvironment = applicationInfo.f43646e;
        }
        LogEnvironment logEnvironment2 = logEnvironment;
        if ((i & 32) != 0) {
            androidApplicationInfo = applicationInfo.f43647f;
        }
        return applicationInfo.copy(str, str5, str6, str7, logEnvironment2, androidApplicationInfo);
    }

    @NotNull
    public final String component1() {
        return this.f43642a;
    }

    @NotNull
    public final String component2() {
        return this.f43643b;
    }

    @NotNull
    public final String component3() {
        return this.f43644c;
    }

    @NotNull
    public final String component4() {
        return this.f43645d;
    }

    @NotNull
    public final LogEnvironment component5() {
        return this.f43646e;
    }

    @NotNull
    public final AndroidApplicationInfo component6() {
        return this.f43647f;
    }

    @NotNull
    public final ApplicationInfo copy(@NotNull String appId, @NotNull String deviceModel, @NotNull String sessionSdkVersion, @NotNull String osVersion, @NotNull LogEnvironment logEnvironment, @NotNull AndroidApplicationInfo androidAppInfo) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(sessionSdkVersion, "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        return new ApplicationInfo(appId, deviceModel, sessionSdkVersion, osVersion, logEnvironment, androidAppInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationInfo)) {
            return false;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) obj;
        if (Intrinsics.m17075f(this.f43642a, applicationInfo.f43642a) && Intrinsics.m17075f(this.f43643b, applicationInfo.f43643b) && Intrinsics.m17075f(this.f43644c, applicationInfo.f43644c) && Intrinsics.m17075f(this.f43645d, applicationInfo.f43645d) && this.f43646e == applicationInfo.f43646e && Intrinsics.m17075f(this.f43647f, applicationInfo.f43647f)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final AndroidApplicationInfo getAndroidAppInfo() {
        return this.f43647f;
    }

    @NotNull
    public final String getAppId() {
        return this.f43642a;
    }

    @NotNull
    public final String getDeviceModel() {
        return this.f43643b;
    }

    @NotNull
    public final LogEnvironment getLogEnvironment() {
        return this.f43646e;
    }

    @NotNull
    public final String getOsVersion() {
        return this.f43645d;
    }

    @NotNull
    public final String getSessionSdkVersion() {
        return this.f43644c;
    }

    public int hashCode() {
        return (((((((((this.f43642a.hashCode() * 31) + this.f43643b.hashCode()) * 31) + this.f43644c.hashCode()) * 31) + this.f43645d.hashCode()) * 31) + this.f43646e.hashCode()) * 31) + this.f43647f.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplicationInfo(appId=" + this.f43642a + ", deviceModel=" + this.f43643b + ", sessionSdkVersion=" + this.f43644c + ", osVersion=" + this.f43645d + ", logEnvironment=" + this.f43646e + ", androidAppInfo=" + this.f43647f + ')';
    }
}
