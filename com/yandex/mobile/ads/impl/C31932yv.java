package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.yv */
/* loaded from: classes8.dex */
public final class C31932yv {
    @NotNull

    /* renamed from: a */
    private final List<C30810lv> f88558a;
    @NotNull

    /* renamed from: b */
    private final C30978nv f88559b;
    @NotNull

    /* renamed from: c */
    private final C31156pw f88560c;
    @NotNull

    /* renamed from: d */
    private final C31771wu f88561d;
    @NotNull

    /* renamed from: e */
    private final C30674jv f88562e;
    @NotNull

    /* renamed from: f */
    private final C31237qv f88563f;
    @NotNull

    /* renamed from: g */
    private final C31845xv f88564g;

    public C31932yv(@NotNull List<C30810lv> alertsData, @NotNull C30978nv appData, @NotNull C31156pw sdkIntegrationData, @NotNull C31771wu adNetworkSettingsData, @NotNull C30674jv adaptersData, @NotNull C31237qv consentsData, @NotNull C31845xv debugErrorIndicatorData) {
        Intrinsics.checkNotNullParameter(alertsData, "alertsData");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(sdkIntegrationData, "sdkIntegrationData");
        Intrinsics.checkNotNullParameter(adNetworkSettingsData, "adNetworkSettingsData");
        Intrinsics.checkNotNullParameter(adaptersData, "adaptersData");
        Intrinsics.checkNotNullParameter(consentsData, "consentsData");
        Intrinsics.checkNotNullParameter(debugErrorIndicatorData, "debugErrorIndicatorData");
        this.f88558a = alertsData;
        this.f88559b = appData;
        this.f88560c = sdkIntegrationData;
        this.f88561d = adNetworkSettingsData;
        this.f88562e = adaptersData;
        this.f88563f = consentsData;
        this.f88564g = debugErrorIndicatorData;
    }

    @NotNull
    /* renamed from: a */
    public final C31771wu m26570a() {
        return this.f88561d;
    }

    @NotNull
    /* renamed from: b */
    public final C30674jv m26569b() {
        return this.f88562e;
    }

    @NotNull
    /* renamed from: c */
    public final C30978nv m26568c() {
        return this.f88559b;
    }

    @NotNull
    /* renamed from: d */
    public final C31237qv m26567d() {
        return this.f88563f;
    }

    @NotNull
    /* renamed from: e */
    public final C31845xv m26566e() {
        return this.f88564g;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31932yv)) {
            return false;
        }
        C31932yv c31932yv = (C31932yv) obj;
        if (Intrinsics.m17075f(this.f88558a, c31932yv.f88558a) && Intrinsics.m17075f(this.f88559b, c31932yv.f88559b) && Intrinsics.m17075f(this.f88560c, c31932yv.f88560c) && Intrinsics.m17075f(this.f88561d, c31932yv.f88561d) && Intrinsics.m17075f(this.f88562e, c31932yv.f88562e) && Intrinsics.m17075f(this.f88563f, c31932yv.f88563f) && Intrinsics.m17075f(this.f88564g, c31932yv.f88564g)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final C31156pw m26565f() {
        return this.f88560c;
    }

    public final int hashCode() {
        int hashCode = this.f88559b.hashCode();
        int hashCode2 = this.f88560c.hashCode();
        int hashCode3 = this.f88561d.hashCode();
        int hashCode4 = this.f88562e.hashCode();
        int hashCode5 = this.f88563f.hashCode();
        return this.f88564g.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f88558a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        List<C30810lv> list = this.f88558a;
        C30978nv c30978nv = this.f88559b;
        C31156pw c31156pw = this.f88560c;
        C31771wu c31771wu = this.f88561d;
        C30674jv c30674jv = this.f88562e;
        C31237qv c31237qv = this.f88563f;
        C31845xv c31845xv = this.f88564g;
        return "DebugPanelFeedData(alertsData=" + list + ", appData=" + c30978nv + ", sdkIntegrationData=" + c31156pw + ", adNetworkSettingsData=" + c31771wu + ", adaptersData=" + c30674jv + ", consentsData=" + c31237qv + ", debugErrorIndicatorData=" + c31845xv + ")";
    }
}
