package io.appmetrica.analytics.coreapi.internal.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class SdkInfo {

    /* renamed from: a */
    private final String f92369a;

    /* renamed from: b */
    private final String f92370b;

    /* renamed from: c */
    private final String f92371c;

    public SdkInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.f92369a = str;
        this.f92370b = str2;
        this.f92371c = str3;
    }

    public static /* synthetic */ SdkInfo copy$default(SdkInfo sdkInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sdkInfo.f92369a;
        }
        if ((i & 2) != 0) {
            str2 = sdkInfo.f92370b;
        }
        if ((i & 4) != 0) {
            str3 = sdkInfo.f92371c;
        }
        return sdkInfo.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.f92369a;
    }

    @NotNull
    public final String component2() {
        return this.f92370b;
    }

    @NotNull
    public final String component3() {
        return this.f92371c;
    }

    @NotNull
    public final SdkInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return new SdkInfo(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkInfo)) {
            return false;
        }
        SdkInfo sdkInfo = (SdkInfo) obj;
        if (Intrinsics.m17075f(this.f92369a, sdkInfo.f92369a) && Intrinsics.m17075f(this.f92370b, sdkInfo.f92370b) && Intrinsics.m17075f(this.f92371c, sdkInfo.f92371c)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getSdkBuildNumber() {
        return this.f92370b;
    }

    @NotNull
    public final String getSdkBuildType() {
        return this.f92371c;
    }

    @NotNull
    public final String getSdkVersionName() {
        return this.f92369a;
    }

    public int hashCode() {
        int hashCode = this.f92370b.hashCode();
        return this.f92371c.hashCode() + ((hashCode + (this.f92369a.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "SdkInfo(sdkVersionName=" + this.f92369a + ", sdkBuildNumber=" + this.f92370b + ", sdkBuildType=" + this.f92371c + ')';
    }
}
