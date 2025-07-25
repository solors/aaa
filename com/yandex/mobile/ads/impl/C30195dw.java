package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.dw */
/* loaded from: classes8.dex */
public final class C30195dw {
    @NotNull

    /* renamed from: a */
    private final C30978nv f78254a;
    @NotNull

    /* renamed from: b */
    private final C31069ow f78255b;
    @NotNull

    /* renamed from: c */
    private final List<nw0> f78256c;
    @NotNull

    /* renamed from: d */
    private final C31237qv f78257d;
    @NotNull

    /* renamed from: e */
    private final C31845xv f78258e;
    @Nullable

    /* renamed from: f */
    private final C30276ew f78259f;

    public C30195dw(@NotNull C30978nv appData, @NotNull C31069ow sdkData, @NotNull ArrayList mediationNetworksData, @NotNull C31237qv consentsData, @NotNull C31845xv debugErrorIndicatorData, @Nullable C30276ew c30276ew) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(sdkData, "sdkData");
        Intrinsics.checkNotNullParameter(mediationNetworksData, "mediationNetworksData");
        Intrinsics.checkNotNullParameter(consentsData, "consentsData");
        Intrinsics.checkNotNullParameter(debugErrorIndicatorData, "debugErrorIndicatorData");
        this.f78254a = appData;
        this.f78255b = sdkData;
        this.f78256c = mediationNetworksData;
        this.f78257d = consentsData;
        this.f78258e = debugErrorIndicatorData;
        this.f78259f = c30276ew;
    }

    @NotNull
    /* renamed from: a */
    public final C30978nv m34846a() {
        return this.f78254a;
    }

    @NotNull
    /* renamed from: b */
    public final C31237qv m34845b() {
        return this.f78257d;
    }

    @NotNull
    /* renamed from: c */
    public final C31845xv m34844c() {
        return this.f78258e;
    }

    @Nullable
    /* renamed from: d */
    public final C30276ew m34843d() {
        return this.f78259f;
    }

    @NotNull
    /* renamed from: e */
    public final List<nw0> m34842e() {
        return this.f78256c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30195dw)) {
            return false;
        }
        C30195dw c30195dw = (C30195dw) obj;
        if (Intrinsics.m17075f(this.f78254a, c30195dw.f78254a) && Intrinsics.m17075f(this.f78255b, c30195dw.f78255b) && Intrinsics.m17075f(this.f78256c, c30195dw.f78256c) && Intrinsics.m17075f(this.f78257d, c30195dw.f78257d) && Intrinsics.m17075f(this.f78258e, c30195dw.f78258e) && Intrinsics.m17075f(this.f78259f, c30195dw.f78259f)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final C31069ow m34841f() {
        return this.f78255b;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f78255b.hashCode();
        int m30807a = C31097p9.m30807a(this.f78256c, (hashCode2 + (this.f78254a.hashCode() * 31)) * 31, 31);
        int hashCode3 = (this.f78258e.hashCode() + ((this.f78257d.hashCode() + m30807a) * 31)) * 31;
        C30276ew c30276ew = this.f78259f;
        if (c30276ew == null) {
            hashCode = 0;
        } else {
            hashCode = c30276ew.hashCode();
        }
        return hashCode3 + hashCode;
    }

    @NotNull
    public final String toString() {
        C30978nv c30978nv = this.f78254a;
        C31069ow c31069ow = this.f78255b;
        List<nw0> list = this.f78256c;
        C31237qv c31237qv = this.f78257d;
        C31845xv c31845xv = this.f78258e;
        C30276ew c30276ew = this.f78259f;
        return "DebugPanelLocalData(appData=" + c30978nv + ", sdkData=" + c31069ow + ", mediationNetworksData=" + list + ", consentsData=" + c31237qv + ", debugErrorIndicatorData=" + c31845xv + ", logsData=" + c30276ew + ")";
    }
}
