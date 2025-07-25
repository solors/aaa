package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ke */
/* loaded from: classes8.dex */
public final class C30723ke {
    @Nullable

    /* renamed from: a */
    private final String f81404a;
    @Nullable

    /* renamed from: b */
    private final String f81405b;
    @Nullable

    /* renamed from: c */
    private final String f81406c;

    public C30723ke(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f81404a = str;
        this.f81405b = str2;
        this.f81406c = str3;
    }

    @Nullable
    /* renamed from: a */
    public final String m32573a() {
        return this.f81404a;
    }

    @Nullable
    /* renamed from: b */
    public final String m32572b() {
        return this.f81405b;
    }

    @Nullable
    /* renamed from: c */
    public final String m32571c() {
        return this.f81406c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30723ke)) {
            return false;
        }
        C30723ke c30723ke = (C30723ke) obj;
        if (Intrinsics.m17075f(this.f81404a, c30723ke.f81404a) && Intrinsics.m17075f(this.f81405b, c30723ke.f81405b) && Intrinsics.m17075f(this.f81406c, c30723ke.f81406c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.f81404a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.f81405b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.f81406c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    @NotNull
    public final String toString() {
        String str = this.f81404a;
        String str2 = this.f81405b;
        String str3 = this.f81406c;
        return "AppMetricaIdentifiers(adGetUrl=" + str + ", deviceId=" + str2 + ", uuid=" + str3 + ")";
    }
}
