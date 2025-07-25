package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.jx */
/* loaded from: classes8.dex */
public final class C30678jx implements InterfaceC31780x {
    @NotNull

    /* renamed from: a */
    private final String f81174a;
    @NotNull

    /* renamed from: b */
    private final String f81175b;
    @NotNull

    /* renamed from: c */
    private final List<yf1> f81176c;

    public C30678jx(@NotNull String actionType, @NotNull String fallbackUrl, @NotNull ArrayList preferredPackages) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(fallbackUrl, "fallbackUrl");
        Intrinsics.checkNotNullParameter(preferredPackages, "preferredPackages");
        this.f81174a = actionType;
        this.f81175b = fallbackUrl;
        this.f81176c = preferredPackages;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31780x
    @NotNull
    /* renamed from: a */
    public final String mo27604a() {
        return this.f81174a;
    }

    @NotNull
    /* renamed from: c */
    public final String m32715c() {
        return this.f81175b;
    }

    @NotNull
    /* renamed from: d */
    public final List<yf1> m32714d() {
        return this.f81176c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30678jx)) {
            return false;
        }
        C30678jx c30678jx = (C30678jx) obj;
        if (Intrinsics.m17075f(this.f81174a, c30678jx.f81174a) && Intrinsics.m17075f(this.f81175b, c30678jx.f81175b) && Intrinsics.m17075f(this.f81176c, c30678jx.f81176c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f81176c.hashCode() + C31014o3.m31189a(this.f81175b, this.f81174a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f81174a;
        String str2 = this.f81175b;
        List<yf1> list = this.f81176c;
        return "DeeplinkAction(actionType=" + str + ", fallbackUrl=" + str2 + ", preferredPackages=" + list + ")";
    }
}
