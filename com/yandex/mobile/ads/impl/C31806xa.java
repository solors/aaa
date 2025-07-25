package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.xa */
/* loaded from: classes8.dex */
public final class C31806xa implements InterfaceC30466hj {
    @NotNull

    /* renamed from: a */
    private final String f87607a;
    @NotNull

    /* renamed from: b */
    private final String f87608b;
    @NotNull

    /* renamed from: c */
    private final String f87609c;
    @NotNull

    /* renamed from: d */
    private final List<String> f87610d;

    public C31806xa(@NotNull String actionType, @NotNull String adtuneUrl, @NotNull String optOutUrl, @NotNull ArrayList trackingUrls) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(adtuneUrl, "adtuneUrl");
        Intrinsics.checkNotNullParameter(optOutUrl, "optOutUrl");
        Intrinsics.checkNotNullParameter(trackingUrls, "trackingUrls");
        this.f87607a = actionType;
        this.f87608b = adtuneUrl;
        this.f87609c = optOutUrl;
        this.f87610d = trackingUrls;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31780x
    @NotNull
    /* renamed from: a */
    public final String mo27604a() {
        return this.f87607a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30466hj
    @NotNull
    /* renamed from: b */
    public final List<String> mo27603b() {
        return this.f87610d;
    }

    @NotNull
    /* renamed from: c */
    public final String m27602c() {
        return this.f87608b;
    }

    @NotNull
    /* renamed from: d */
    public final String m27601d() {
        return this.f87609c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31806xa)) {
            return false;
        }
        C31806xa c31806xa = (C31806xa) obj;
        if (Intrinsics.m17075f(this.f87607a, c31806xa.f87607a) && Intrinsics.m17075f(this.f87608b, c31806xa.f87608b) && Intrinsics.m17075f(this.f87609c, c31806xa.f87609c) && Intrinsics.m17075f(this.f87610d, c31806xa.f87610d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f87610d.hashCode() + C31014o3.m31189a(this.f87609c, C31014o3.m31189a(this.f87608b, this.f87607a.hashCode() * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f87607a;
        String str2 = this.f87608b;
        String str3 = this.f87609c;
        List<String> list = this.f87610d;
        return "AdtuneAction(actionType=" + str + ", adtuneUrl=" + str2 + ", optOutUrl=" + str3 + ", trackingUrls=" + list + ")";
    }
}
