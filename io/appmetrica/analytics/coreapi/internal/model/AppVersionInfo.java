package io.appmetrica.analytics.coreapi.internal.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class AppVersionInfo {

    /* renamed from: a */
    private final String f92357a;

    /* renamed from: b */
    private final String f92358b;

    public AppVersionInfo(@NotNull String str, @NotNull String str2) {
        this.f92357a = str;
        this.f92358b = str2;
    }

    public static /* synthetic */ AppVersionInfo copy$default(AppVersionInfo appVersionInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appVersionInfo.f92357a;
        }
        if ((i & 2) != 0) {
            str2 = appVersionInfo.f92358b;
        }
        return appVersionInfo.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f92357a;
    }

    @NotNull
    public final String component2() {
        return this.f92358b;
    }

    @NotNull
    public final AppVersionInfo copy(@NotNull String str, @NotNull String str2) {
        return new AppVersionInfo(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppVersionInfo)) {
            return false;
        }
        AppVersionInfo appVersionInfo = (AppVersionInfo) obj;
        if (Intrinsics.m17075f(this.f92357a, appVersionInfo.f92357a) && Intrinsics.m17075f(this.f92358b, appVersionInfo.f92358b)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getAppBuildNumber() {
        return this.f92358b;
    }

    @NotNull
    public final String getAppVersionName() {
        return this.f92357a;
    }

    public int hashCode() {
        return this.f92358b.hashCode() + (this.f92357a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AppVersionInfo(appVersionName=" + this.f92357a + ", appBuildNumber=" + this.f92358b + ')';
    }
}
