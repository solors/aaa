package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a61 {
    @NotNull

    /* renamed from: a */
    private final C30578is f76723a;
    @NotNull

    /* renamed from: b */
    private final xm1 f76724b;

    public a61(@NotNull C30578is adAssets, @NotNull xm1 responseNativeType) {
        Intrinsics.checkNotNullParameter(adAssets, "adAssets");
        Intrinsics.checkNotNullParameter(responseNativeType, "responseNativeType");
        this.f76723a = adAssets;
        this.f76724b = responseNativeType;
    }

    /* renamed from: b */
    private final boolean m35956b() {
        if (this.f76723a.m33144c() != null && (xm1.f87744c == this.f76724b || (!m35954d()))) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final boolean m35954d() {
        if (this.f76723a.m33136k() == null && this.f76723a.m33135l() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean m35957a() {
        if (this.f76723a.m33133n() == null && this.f76723a.m33145b() == null && this.f76723a.m33143d() == null && this.f76723a.m33140g() == null && this.f76723a.m33142e() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m35955c() {
        if (this.f76723a.m33139h() != null && (Intrinsics.m17075f("large", this.f76723a.m33139h().m32448c()) || Intrinsics.m17075f("wide", this.f76723a.m33139h().m32448c()))) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m35953e() {
        if (this.f76723a.m33146a() == null && this.f76723a.m33134m() == null && !m35957a()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean m35952f() {
        if (this.f76723a.m33144c() != null || m35954d()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m35951g() {
        return m35956b();
    }

    /* renamed from: h */
    public final boolean m35950h() {
        if (this.f76723a.m33144c() != null && (m35956b() || m35955c())) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m35949i() {
        if (this.f76723a.m33132o() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m35948j() {
        if (m35956b()) {
            return true;
        }
        if (m35955c() && (!m35954d())) {
            return true;
        }
        return false;
    }
}
