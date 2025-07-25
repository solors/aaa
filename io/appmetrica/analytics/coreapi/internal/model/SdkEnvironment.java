package io.appmetrica.analytics.coreapi.internal.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class SdkEnvironment {

    /* renamed from: a */
    private final AppVersionInfo f92363a;

    /* renamed from: b */
    private final String f92364b;

    /* renamed from: c */
    private final ScreenInfo f92365c;

    /* renamed from: d */
    private final SdkInfo f92366d;

    /* renamed from: e */
    private final String f92367e;

    /* renamed from: f */
    private final List f92368f;

    public SdkEnvironment(@NotNull AppVersionInfo appVersionInfo, @NotNull String str, @NotNull ScreenInfo screenInfo, @NotNull SdkInfo sdkInfo, @NotNull String str2, @NotNull List<String> list) {
        this.f92363a = appVersionInfo;
        this.f92364b = str;
        this.f92365c = screenInfo;
        this.f92366d = sdkInfo;
        this.f92367e = str2;
        this.f92368f = list;
    }

    public static /* synthetic */ SdkEnvironment copy$default(SdkEnvironment sdkEnvironment, AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            appVersionInfo = sdkEnvironment.f92363a;
        }
        if ((i & 2) != 0) {
            str = sdkEnvironment.f92364b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            screenInfo = sdkEnvironment.f92365c;
        }
        ScreenInfo screenInfo2 = screenInfo;
        if ((i & 8) != 0) {
            sdkInfo = sdkEnvironment.f92366d;
        }
        SdkInfo sdkInfo2 = sdkInfo;
        if ((i & 16) != 0) {
            str2 = sdkEnvironment.f92367e;
        }
        String str4 = str2;
        List list2 = list;
        if ((i & 32) != 0) {
            list2 = sdkEnvironment.f92368f;
        }
        return sdkEnvironment.copy(appVersionInfo, str3, screenInfo2, sdkInfo2, str4, list2);
    }

    @NotNull
    public final AppVersionInfo component1() {
        return this.f92363a;
    }

    @NotNull
    public final String component2() {
        return this.f92364b;
    }

    @NotNull
    public final ScreenInfo component3() {
        return this.f92365c;
    }

    @NotNull
    public final SdkInfo component4() {
        return this.f92366d;
    }

    @NotNull
    public final String component5() {
        return this.f92367e;
    }

    @NotNull
    public final List<String> component6() {
        return this.f92368f;
    }

    @NotNull
    public final SdkEnvironment copy(@NotNull AppVersionInfo appVersionInfo, @NotNull String str, @NotNull ScreenInfo screenInfo, @NotNull SdkInfo sdkInfo, @NotNull String str2, @NotNull List<String> list) {
        return new SdkEnvironment(appVersionInfo, str, screenInfo, sdkInfo, str2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkEnvironment)) {
            return false;
        }
        SdkEnvironment sdkEnvironment = (SdkEnvironment) obj;
        if (Intrinsics.m17075f(this.f92363a, sdkEnvironment.f92363a) && Intrinsics.m17075f(this.f92364b, sdkEnvironment.f92364b) && Intrinsics.m17075f(this.f92365c, sdkEnvironment.f92365c) && Intrinsics.m17075f(this.f92366d, sdkEnvironment.f92366d) && Intrinsics.m17075f(this.f92367e, sdkEnvironment.f92367e) && Intrinsics.m17075f(this.f92368f, sdkEnvironment.f92368f)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getAppFramework() {
        return this.f92364b;
    }

    @NotNull
    public final AppVersionInfo getAppVersionInfo() {
        return this.f92363a;
    }

    @NotNull
    public final String getDeviceType() {
        return this.f92367e;
    }

    @NotNull
    public final List<String> getLocales() {
        return this.f92368f;
    }

    @NotNull
    public final ScreenInfo getScreenInfo() {
        return this.f92365c;
    }

    @NotNull
    public final SdkInfo getSdkInfo() {
        return this.f92366d;
    }

    public int hashCode() {
        int hashCode = this.f92364b.hashCode();
        int hashCode2 = this.f92365c.hashCode();
        int hashCode3 = this.f92366d.hashCode();
        int hashCode4 = this.f92367e.hashCode();
        return this.f92368f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f92363a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "SdkEnvironment(appVersionInfo=" + this.f92363a + ", appFramework=" + this.f92364b + ", screenInfo=" + this.f92365c + ", sdkInfo=" + this.f92366d + ", deviceType=" + this.f92367e + ", locales=" + this.f92368f + ')';
    }
}
