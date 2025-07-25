package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.res.Configuration;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.y0 */
/* loaded from: classes8.dex */
public final class C31863y0 {
    @NotNull

    /* renamed from: a */
    private final Activity f87972a;
    @NotNull

    /* renamed from: b */
    private final RelativeLayout f87973b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC30595j1 f87974c;
    @NotNull

    /* renamed from: d */
    private final C29980b1 f87975d;
    @NotNull

    /* renamed from: e */
    private final ac2 f87976e;

    public C31863y0(@NotNull Activity activity, @NotNull RelativeLayout rootLayout, @NotNull InterfaceC30595j1 adActivityPresentController, @NotNull C29980b1 adActivityEventController, @NotNull ac2 tagCreator) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(rootLayout, "rootLayout");
        Intrinsics.checkNotNullParameter(adActivityPresentController, "adActivityPresentController");
        Intrinsics.checkNotNullParameter(adActivityEventController, "adActivityEventController");
        Intrinsics.checkNotNullParameter(tagCreator, "tagCreator");
        this.f87972a = activity;
        this.f87973b = rootLayout;
        this.f87974c = adActivityPresentController;
        this.f87975d = adActivityEventController;
        this.f87976e = tagCreator;
    }

    /* renamed from: a */
    public final void m27130a(@NotNull Configuration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f87975d.m35720a(config);
    }

    /* renamed from: b */
    public final void m27129b() {
        this.f87974c.mo28910g();
        this.f87974c.mo28915c();
        RelativeLayout relativeLayout = this.f87973b;
        this.f87976e.getClass();
        relativeLayout.setTag(ac2.m35919a("root_layout"));
        this.f87972a.setContentView(this.f87973b);
    }

    /* renamed from: c */
    public final boolean m27128c() {
        if (this.f87974c.mo28911e()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m27127d() {
        this.f87974c.mo28917b();
        this.f87975d.m35722a();
    }

    /* renamed from: e */
    public final void m27126e() {
        this.f87974c.mo28921a();
        this.f87975d.m35718b();
    }

    /* renamed from: a */
    public final void m27131a() {
        this.f87974c.onAdClosed();
        this.f87974c.mo28913d();
        this.f87973b.removeAllViews();
    }
}
