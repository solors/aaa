package com.google.firebase.sessions;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ApplicationInfo.kt */
@Metadata
/* loaded from: classes4.dex */
public final class AndroidApplicationInfo {
    @NotNull

    /* renamed from: a */
    private final String f43636a;
    @NotNull

    /* renamed from: b */
    private final String f43637b;
    @NotNull

    /* renamed from: c */
    private final String f43638c;
    @NotNull

    /* renamed from: d */
    private final String f43639d;
    @NotNull

    /* renamed from: e */
    private final ProcessDetails f43640e;
    @NotNull

    /* renamed from: f */
    private final List<ProcessDetails> f43641f;

    public AndroidApplicationInfo(@NotNull String packageName, @NotNull String versionName, @NotNull String appBuildVersion, @NotNull String deviceManufacturer, @NotNull ProcessDetails currentProcessDetails, @NotNull List<ProcessDetails> appProcessDetails) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        this.f43636a = packageName;
        this.f43637b = versionName;
        this.f43638c = appBuildVersion;
        this.f43639d = deviceManufacturer;
        this.f43640e = currentProcessDetails;
        this.f43641f = appProcessDetails;
    }

    public static /* synthetic */ AndroidApplicationInfo copy$default(AndroidApplicationInfo androidApplicationInfo, String str, String str2, String str3, String str4, ProcessDetails processDetails, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = androidApplicationInfo.f43636a;
        }
        if ((i & 2) != 0) {
            str2 = androidApplicationInfo.f43637b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = androidApplicationInfo.f43638c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = androidApplicationInfo.f43639d;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            processDetails = androidApplicationInfo.f43640e;
        }
        ProcessDetails processDetails2 = processDetails;
        List<ProcessDetails> list2 = list;
        if ((i & 32) != 0) {
            list2 = androidApplicationInfo.f43641f;
        }
        return androidApplicationInfo.copy(str, str5, str6, str7, processDetails2, list2);
    }

    @NotNull
    public final String component1() {
        return this.f43636a;
    }

    @NotNull
    public final String component2() {
        return this.f43637b;
    }

    @NotNull
    public final String component3() {
        return this.f43638c;
    }

    @NotNull
    public final String component4() {
        return this.f43639d;
    }

    @NotNull
    public final ProcessDetails component5() {
        return this.f43640e;
    }

    @NotNull
    public final List<ProcessDetails> component6() {
        return this.f43641f;
    }

    @NotNull
    public final AndroidApplicationInfo copy(@NotNull String packageName, @NotNull String versionName, @NotNull String appBuildVersion, @NotNull String deviceManufacturer, @NotNull ProcessDetails currentProcessDetails, @NotNull List<ProcessDetails> appProcessDetails) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        return new AndroidApplicationInfo(packageName, versionName, appBuildVersion, deviceManufacturer, currentProcessDetails, appProcessDetails);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidApplicationInfo)) {
            return false;
        }
        AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) obj;
        if (Intrinsics.m17075f(this.f43636a, androidApplicationInfo.f43636a) && Intrinsics.m17075f(this.f43637b, androidApplicationInfo.f43637b) && Intrinsics.m17075f(this.f43638c, androidApplicationInfo.f43638c) && Intrinsics.m17075f(this.f43639d, androidApplicationInfo.f43639d) && Intrinsics.m17075f(this.f43640e, androidApplicationInfo.f43640e) && Intrinsics.m17075f(this.f43641f, androidApplicationInfo.f43641f)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getAppBuildVersion() {
        return this.f43638c;
    }

    @NotNull
    public final List<ProcessDetails> getAppProcessDetails() {
        return this.f43641f;
    }

    @NotNull
    public final ProcessDetails getCurrentProcessDetails() {
        return this.f43640e;
    }

    @NotNull
    public final String getDeviceManufacturer() {
        return this.f43639d;
    }

    @NotNull
    public final String getPackageName() {
        return this.f43636a;
    }

    @NotNull
    public final String getVersionName() {
        return this.f43637b;
    }

    public int hashCode() {
        return (((((((((this.f43636a.hashCode() * 31) + this.f43637b.hashCode()) * 31) + this.f43638c.hashCode()) * 31) + this.f43639d.hashCode()) * 31) + this.f43640e.hashCode()) * 31) + this.f43641f.hashCode();
    }

    @NotNull
    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f43636a + ", versionName=" + this.f43637b + ", appBuildVersion=" + this.f43638c + ", deviceManufacturer=" + this.f43639d + ", currentProcessDetails=" + this.f43640e + ", appProcessDetails=" + this.f43641f + ')';
    }
}
