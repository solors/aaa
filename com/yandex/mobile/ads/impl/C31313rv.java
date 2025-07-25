package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.rv */
/* loaded from: classes8.dex */
public final class C31313rv {
    @NotNull

    /* renamed from: a */
    private final C30978nv f84898a;
    @NotNull

    /* renamed from: b */
    private final C31069ow f84899b;
    @NotNull

    /* renamed from: c */
    private final C31771wu f84900c;
    @NotNull

    /* renamed from: d */
    private final C30674jv f84901d;
    @NotNull

    /* renamed from: e */
    private final C31237qv f84902e;
    @NotNull

    /* renamed from: f */
    private final C31845xv f84903f;
    @NotNull

    /* renamed from: g */
    private final List<C31842xu> f84904g;
    @NotNull

    /* renamed from: h */
    private final List<C30810lv> f84905h;

    public C31313rv(@NotNull C30978nv appData, @NotNull C31069ow sdkData, @NotNull C31771wu networkSettingsData, @NotNull C30674jv adaptersData, @NotNull C31237qv consentsData, @NotNull C31845xv debugErrorIndicatorData, @NotNull List<C31842xu> adUnits, @NotNull List<C30810lv> alerts) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(sdkData, "sdkData");
        Intrinsics.checkNotNullParameter(networkSettingsData, "networkSettingsData");
        Intrinsics.checkNotNullParameter(adaptersData, "adaptersData");
        Intrinsics.checkNotNullParameter(consentsData, "consentsData");
        Intrinsics.checkNotNullParameter(debugErrorIndicatorData, "debugErrorIndicatorData");
        Intrinsics.checkNotNullParameter(adUnits, "adUnits");
        Intrinsics.checkNotNullParameter(alerts, "alerts");
        this.f84898a = appData;
        this.f84899b = sdkData;
        this.f84900c = networkSettingsData;
        this.f84901d = adaptersData;
        this.f84902e = consentsData;
        this.f84903f = debugErrorIndicatorData;
        this.f84904g = adUnits;
        this.f84905h = alerts;
    }

    @NotNull
    /* renamed from: a */
    public final List<C31842xu> m29933a() {
        return this.f84904g;
    }

    @NotNull
    /* renamed from: b */
    public final C30674jv m29932b() {
        return this.f84901d;
    }

    @NotNull
    /* renamed from: c */
    public final List<C30810lv> m29931c() {
        return this.f84905h;
    }

    @NotNull
    /* renamed from: d */
    public final C30978nv m29930d() {
        return this.f84898a;
    }

    @NotNull
    /* renamed from: e */
    public final C31237qv m29929e() {
        return this.f84902e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31313rv)) {
            return false;
        }
        C31313rv c31313rv = (C31313rv) obj;
        if (Intrinsics.m17075f(this.f84898a, c31313rv.f84898a) && Intrinsics.m17075f(this.f84899b, c31313rv.f84899b) && Intrinsics.m17075f(this.f84900c, c31313rv.f84900c) && Intrinsics.m17075f(this.f84901d, c31313rv.f84901d) && Intrinsics.m17075f(this.f84902e, c31313rv.f84902e) && Intrinsics.m17075f(this.f84903f, c31313rv.f84903f) && Intrinsics.m17075f(this.f84904g, c31313rv.f84904g) && Intrinsics.m17075f(this.f84905h, c31313rv.f84905h)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final C31845xv m29928f() {
        return this.f84903f;
    }

    @NotNull
    /* renamed from: g */
    public final C31771wu m29927g() {
        return this.f84900c;
    }

    @NotNull
    /* renamed from: h */
    public final C31069ow m29926h() {
        return this.f84899b;
    }

    public final int hashCode() {
        int hashCode = this.f84899b.hashCode();
        int hashCode2 = this.f84900c.hashCode();
        int hashCode3 = this.f84901d.hashCode();
        int hashCode4 = this.f84902e.hashCode();
        int hashCode5 = this.f84903f.hashCode();
        return this.f84905h.hashCode() + C31097p9.m30807a(this.f84904g, (hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f84898a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31);
    }

    @NotNull
    public final String toString() {
        C30978nv c30978nv = this.f84898a;
        C31069ow c31069ow = this.f84899b;
        C31771wu c31771wu = this.f84900c;
        C30674jv c30674jv = this.f84901d;
        C31237qv c31237qv = this.f84902e;
        C31845xv c31845xv = this.f84903f;
        List<C31842xu> list = this.f84904g;
        List<C30810lv> list2 = this.f84905h;
        return "DebugPanelData(appData=" + c30978nv + ", sdkData=" + c31069ow + ", networkSettingsData=" + c31771wu + ", adaptersData=" + c30674jv + ", consentsData=" + c31237qv + ", debugErrorIndicatorData=" + c31845xv + ", adUnits=" + list + ", alerts=" + list2 + ")";
    }
}
