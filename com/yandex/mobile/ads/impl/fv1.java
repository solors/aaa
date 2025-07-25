package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class fv1<V extends ViewGroup> implements InterfaceC30890mz<V>, InterfaceC30065c1 {
    @Nullable

    /* renamed from: a */
    private final C30296f6 f79329a;
    @NotNull

    /* renamed from: b */
    private final C29980b1 f79330b;
    @NotNull

    /* renamed from: c */
    private final r11 f79331c;
    @NotNull

    /* renamed from: d */
    private final vu1 f79332d;
    @Nullable

    /* renamed from: e */
    private C29976az f79333e;

    public fv1(@Nullable C30296f6 c30296f6, @NotNull C29980b1 adActivityEventController, @NotNull r11 nativeAdControlViewProvider, @NotNull vu1 skipAppearanceController) {
        Intrinsics.checkNotNullParameter(adActivityEventController, "adActivityEventController");
        Intrinsics.checkNotNullParameter(nativeAdControlViewProvider, "nativeAdControlViewProvider");
        Intrinsics.checkNotNullParameter(skipAppearanceController, "skipAppearanceController");
        this.f79329a = c30296f6;
        this.f79330b = adActivityEventController;
        this.f79331c = nativeAdControlViewProvider;
        this.f79332d = skipAppearanceController;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: a */
    public final void mo26077a(@NotNull V container) {
        C30366g6 m34214b;
        Intrinsics.checkNotNullParameter(container, "container");
        View mo29317b = this.f79331c.mo29317b(container);
        if (mo29317b != null) {
            this.f79330b.m35719a(this);
            vu1 vu1Var = this.f79332d;
            C30296f6 c30296f6 = this.f79329a;
            Long valueOf = (c30296f6 == null || (m34214b = c30296f6.m34214b()) == null) ? null : Long.valueOf(m34214b.m33918a());
            C29976az c29976az = new C29976az(mo29317b, vu1Var, valueOf != null ? valueOf.longValue() : 0L, rc1.m30076a());
            this.f79333e = c29976az;
            c29976az.m35728b();
            if (mo29317b.getTag() == null) {
                mo29317b.setTag("skip_button");
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30065c1
    /* renamed from: b */
    public final void mo26076b() {
        C29976az c29976az = this.f79333e;
        if (c29976az != null) {
            c29976az.m35727c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: c */
    public final void mo26075c() {
        this.f79330b.m35717b(this);
        C29976az c29976az = this.f79333e;
        if (c29976az != null) {
            c29976az.m35729a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30065c1
    /* renamed from: a */
    public final void mo26079a() {
        C29976az c29976az = this.f79333e;
        if (c29976az != null) {
            c29976az.m35726d();
        }
    }
}
