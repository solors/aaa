package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.re */
/* loaded from: classes8.dex */
public final class C31278re {
    @Nullable

    /* renamed from: a */
    private final String f84729a;
    @Nullable

    /* renamed from: b */
    private final String f84730b;
    @Nullable

    /* renamed from: c */
    private final String f84731c;

    public C31278re(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f84729a = str;
        this.f84730b = str2;
        this.f84731c = str3;
    }

    @Nullable
    /* renamed from: a */
    public final String m30066a() {
        return this.f84730b;
    }

    @Nullable
    /* renamed from: b */
    public final String m30065b() {
        return this.f84731c;
    }

    @Nullable
    /* renamed from: c */
    public final String m30064c() {
        return this.f84729a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31278re)) {
            return false;
        }
        C31278re c31278re = (C31278re) obj;
        if (Intrinsics.m17075f(this.f84729a, c31278re.f84729a) && Intrinsics.m17075f(this.f84730b, c31278re.f84730b) && Intrinsics.m17075f(this.f84731c, c31278re.f84731c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.f84729a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.f84730b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.f84731c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    @NotNull
    public final String toString() {
        String str = this.f84729a;
        String str2 = this.f84730b;
        String str3 = this.f84731c;
        return "AppMetricaStartupParams(uuid=" + str + ", deviceId=" + str2 + ", getAdUrl=" + str3 + ")";
    }
}
