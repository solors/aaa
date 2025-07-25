package com.yandex.mobile.ads.common;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class AdInfo {
    @NotNull

    /* renamed from: a */
    private final String f76518a;
    @Nullable

    /* renamed from: b */
    private final AdSize f76519b;
    @Nullable

    /* renamed from: c */
    private final String f76520c;

    public AdInfo(@NotNull String adUnitId, @Nullable AdSize adSize, @Nullable String str) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f76518a = adUnitId;
        this.f76519b = adSize;
        this.f76520c = str;
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.m17075f(AdInfo.class, cls)) {
            return false;
        }
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.common.AdInfo");
        AdInfo adInfo = (AdInfo) obj;
        if (Intrinsics.m17075f(this.f76518a, adInfo.f76518a) && Intrinsics.m17075f(this.f76519b, adInfo.f76519b) && Intrinsics.m17075f(this.f76520c, adInfo.f76520c)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final AdSize getAdSize() {
        return this.f76519b;
    }

    @NotNull
    public final String getAdUnitId() {
        return this.f76518a;
    }

    @Nullable
    public final String getData() {
        return this.f76520c;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f76518a.hashCode() * 31;
        AdSize adSize = this.f76519b;
        int i2 = 0;
        if (adSize != null) {
            i = adSize.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str = this.f76520c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }

    @NotNull
    public String toString() {
        String str;
        String str2 = this.f76518a;
        AdSize adSize = this.f76519b;
        if (adSize != null) {
            str = adSize.toString();
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        String str4 = this.f76520c;
        if (str4 != null) {
            str3 = str4;
        }
        return "AdSize (adUnitId: " + str2 + ", adSize: " + str + ", data: " + str3 + ")";
    }

    public /* synthetic */ AdInfo(String str, AdSize adSize, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, adSize, (i & 4) != 0 ? null : str2);
    }
}
