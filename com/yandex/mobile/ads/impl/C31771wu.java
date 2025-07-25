package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.wu */
/* loaded from: classes8.dex */
public final class C31771wu {
    @Nullable

    /* renamed from: a */
    private final String f87419a;
    @Nullable

    /* renamed from: b */
    private final String f87420b;
    @Nullable

    /* renamed from: c */
    private final String f87421c;

    public C31771wu(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f87419a = str;
        this.f87420b = str2;
        this.f87421c = str3;
    }

    @Nullable
    /* renamed from: a */
    public final String m27744a() {
        return this.f87421c;
    }

    @Nullable
    /* renamed from: b */
    public final String m27743b() {
        return this.f87420b;
    }

    @Nullable
    /* renamed from: c */
    public final String m27742c() {
        return this.f87419a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31771wu)) {
            return false;
        }
        C31771wu c31771wu = (C31771wu) obj;
        if (Intrinsics.m17075f(this.f87419a, c31771wu.f87419a) && Intrinsics.m17075f(this.f87420b, c31771wu.f87420b) && Intrinsics.m17075f(this.f87421c, c31771wu.f87421c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.f87419a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.f87420b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.f87421c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    @NotNull
    public final String toString() {
        String str = this.f87419a;
        String str2 = this.f87420b;
        String str3 = this.f87421c;
        return "DebugPanelAdNetworkSettingsData(pageId=" + str + ", appReviewStatus=" + str2 + ", appAdsTxt=" + str3 + ")";
    }
}
