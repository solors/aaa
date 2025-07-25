package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.f6 */
/* loaded from: classes8.dex */
public final class C30296f6 {

    /* renamed from: a */
    private final long f78990a;
    @Nullable

    /* renamed from: b */
    private final C30366g6 f78991b;
    @Nullable

    /* renamed from: c */
    private final EnumC30444h6 f78992c;

    public C30296f6(long j, @Nullable C30366g6 c30366g6, @Nullable EnumC30444h6 enumC30444h6) {
        this.f78990a = j;
        this.f78991b = c30366g6;
        this.f78992c = enumC30444h6;
    }

    /* renamed from: a */
    public final long m34215a() {
        return this.f78990a;
    }

    @Nullable
    /* renamed from: b */
    public final C30366g6 m34214b() {
        return this.f78991b;
    }

    @Nullable
    /* renamed from: c */
    public final EnumC30444h6 m34213c() {
        return this.f78992c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30296f6)) {
            return false;
        }
        C30296f6 c30296f6 = (C30296f6) obj;
        if (this.f78990a == c30296f6.f78990a && Intrinsics.m17075f(this.f78991b, c30296f6.f78991b) && this.f78992c == c30296f6.f78992c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.f78990a) * 31;
        C30366g6 c30366g6 = this.f78991b;
        int i = 0;
        if (c30366g6 == null) {
            hashCode = 0;
        } else {
            hashCode = c30366g6.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        EnumC30444h6 enumC30444h6 = this.f78992c;
        if (enumC30444h6 != null) {
            i = enumC30444h6.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        long j = this.f78990a;
        C30366g6 c30366g6 = this.f78991b;
        EnumC30444h6 enumC30444h6 = this.f78992c;
        return "AdPodItem(duration=" + j + ", skip=" + c30366g6 + ", transitionPolicy=" + enumC30444h6 + ")";
    }
}
