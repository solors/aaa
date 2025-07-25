package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.kk */
/* loaded from: classes8.dex */
public final class C30732kk {
    @NotNull

    /* renamed from: a */
    private final List<k62> f81438a;
    @NotNull

    /* renamed from: b */
    private final C31835xr f81439b;
    @NotNull

    /* renamed from: c */
    private final WeakReference<ViewGroup> f81440c;
    @NotNull

    /* renamed from: d */
    private final wi0 f81441d;
    @Nullable

    /* renamed from: e */
    private h50 f81442e;

    public C30732kk(@NotNull ViewGroup adViewGroup, @NotNull List<k62> friendlyOverlays, @NotNull C31835xr binder, @NotNull WeakReference<ViewGroup> adViewGroupReference, @NotNull wi0 binderPrivate, @Nullable h50 h50Var) {
        Intrinsics.checkNotNullParameter(adViewGroup, "adViewGroup");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        Intrinsics.checkNotNullParameter(binder, "binder");
        Intrinsics.checkNotNullParameter(adViewGroupReference, "adViewGroupReference");
        Intrinsics.checkNotNullParameter(binderPrivate, "binderPrivate");
        this.f81438a = friendlyOverlays;
        this.f81439b = binder;
        this.f81440c = adViewGroupReference;
        this.f81441d = binderPrivate;
        this.f81442e = h50Var;
    }

    /* renamed from: a */
    public final void m32533a() {
        ViewGroup viewGroup = this.f81440c.get();
        if (viewGroup != null) {
            if (this.f81442e == null) {
                Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                this.f81442e = new h50(context);
                viewGroup.addView(this.f81442e, new ViewGroup.LayoutParams(-1, -1));
            }
            h50 h50Var = this.f81442e;
            if (h50Var != null) {
                this.f81441d.m27893a(h50Var, this.f81438a);
            }
        }
    }

    /* renamed from: b */
    public final void m32531b() {
        h50 h50Var;
        ViewGroup viewGroup = this.f81440c.get();
        if (viewGroup != null && (h50Var = this.f81442e) != null) {
            viewGroup.removeView(h50Var);
        }
        this.f81442e = null;
        C31835xr c31835xr = this.f81439b;
        c31835xr.m27428a((hg2) null);
        c31835xr.m27423e();
        c31835xr.invalidateAdPlayer();
        c31835xr.m27430a();
    }

    /* renamed from: c */
    public final void m32530c() {
        this.f81441d.m27894a();
    }

    /* renamed from: d */
    public final void m32529d() {
        this.f81441d.m27892b();
    }

    /* renamed from: a */
    public final void m32532a(@Nullable a62 a62Var) {
        this.f81439b.m27427a(a62Var);
    }
}
