package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class q51 {
    @NotNull

    /* renamed from: a */
    private final C30578is f84236a;
    @NotNull

    /* renamed from: b */
    private final xm1 f84237b;

    public q51(@NotNull C30578is adAssets, @NotNull xm1 responseNativeType) {
        Intrinsics.checkNotNullParameter(adAssets, "adAssets");
        Intrinsics.checkNotNullParameter(responseNativeType, "responseNativeType");
        this.f84236a = adAssets;
        this.f84237b = responseNativeType;
    }

    /* renamed from: a */
    public static boolean m30469a(@NotNull C30745ks image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return Intrinsics.m17075f("large", image.m32448c()) || Intrinsics.m17075f("wide", image.m32448c());
    }

    /* renamed from: b */
    public final boolean m30468b() {
        if (this.f84236a.m33140g() != null && (xm1.f87745d == this.f84237b || !m30465e())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m30467c() {
        if (!m30466d() && this.f84236a.m33139h() != null && m30469a(this.f84236a.m33139h())) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m30466d() {
        if (this.f84236a.m33138i() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m30465e() {
        if (!m30466d() && this.f84236a.m33139h() != null && !m30469a(this.f84236a.m33139h()) && xm1.f87745d != this.f84237b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m30470a() {
        return (m30468b() || this.f84236a.m33142e() == null || !(m30466d() || this.f84236a.m33139h() == null || m30469a(this.f84236a.m33139h()))) ? false : true;
    }
}
