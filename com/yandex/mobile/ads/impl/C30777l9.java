package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.l9 */
/* loaded from: classes8.dex */
public final class C30777l9 {

    /* renamed from: a */
    private final boolean f81744a;
    @NotNull

    /* renamed from: b */
    private final String f81745b;
    @NotNull

    /* renamed from: c */
    private final String f81746c;

    public C30777l9(@NotNull String token, @NotNull String advertiserInfo, boolean z) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(advertiserInfo, "advertiserInfo");
        this.f81744a = z;
        this.f81745b = token;
        this.f81746c = advertiserInfo;
    }

    @NotNull
    /* renamed from: a */
    public final String m32304a() {
        return this.f81746c;
    }

    /* renamed from: b */
    public final boolean m32303b() {
        return this.f81744a;
    }

    @NotNull
    /* renamed from: c */
    public final String m32302c() {
        return this.f81745b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30777l9)) {
            return false;
        }
        C30777l9 c30777l9 = (C30777l9) obj;
        if (this.f81744a == c30777l9.f81744a && Intrinsics.m17075f(this.f81745b, c30777l9.f81745b) && Intrinsics.m17075f(this.f81746c, c30777l9.f81746c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f81746c.hashCode() + C31014o3.m31189a(this.f81745b, Boolean.hashCode(this.f81744a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        boolean z = this.f81744a;
        String str = this.f81745b;
        String str2 = this.f81746c;
        return "AdTuneInfo(shouldShow=" + z + ", token=" + str + ", advertiserInfo=" + str2 + ")";
    }
}
