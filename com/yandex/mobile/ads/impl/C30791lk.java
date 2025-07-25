package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.lk */
/* loaded from: classes8.dex */
public final class C30791lk {
    @NotNull

    /* renamed from: a */
    private final List<k62> f81840a;
    @NotNull

    /* renamed from: b */
    private final C31835xr f81841b;
    @NotNull

    /* renamed from: c */
    private final WeakReference<ViewGroup> f81842c;
    @NotNull

    /* renamed from: d */
    private final wi0 f81843d;
    @Nullable

    /* renamed from: e */
    private h50 f81844e;

    public C30791lk(@NotNull ViewGroup adViewGroup, @NotNull List<k62> friendlyOverlays, @NotNull C31835xr binder, @NotNull WeakReference<ViewGroup> adViewGroupReference, @NotNull wi0 binderPrivate, @Nullable h50 h50Var) {
        Intrinsics.checkNotNullParameter(adViewGroup, "adViewGroup");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        Intrinsics.checkNotNullParameter(binder, "binder");
        Intrinsics.checkNotNullParameter(adViewGroupReference, "adViewGroupReference");
        Intrinsics.checkNotNullParameter(binderPrivate, "binderPrivate");
        this.f81840a = friendlyOverlays;
        this.f81841b = binder;
        this.f81842c = adViewGroupReference;
        this.f81843d = binderPrivate;
        this.f81844e = h50Var;
    }

    /* renamed from: a */
    public final void m32243a() {
        ViewGroup viewGroup = this.f81842c.get();
        if (viewGroup != null) {
            if (this.f81844e == null) {
                Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                h50 h50Var = new h50(context);
                h50Var.setTag("instream_ad_view");
                this.f81844e = h50Var;
                viewGroup.addView(this.f81844e, new ViewGroup.LayoutParams(-1, -1));
            }
            h50 h50Var2 = this.f81844e;
            if (h50Var2 != null) {
                this.f81843d.m27893a(h50Var2, this.f81840a);
            }
        }
    }

    /* renamed from: b */
    public final void m32241b() {
        h50 h50Var;
        ViewGroup viewGroup = this.f81842c.get();
        if (viewGroup != null && (h50Var = this.f81844e) != null) {
            viewGroup.removeView(h50Var);
        }
        this.f81844e = null;
        C31835xr c31835xr = this.f81841b;
        c31835xr.m27428a((hg2) null);
        c31835xr.m27423e();
        c31835xr.invalidateAdPlayer();
        c31835xr.m27430a();
    }

    /* renamed from: c */
    public final void m32240c() {
        this.f81843d.m27894a();
    }

    /* renamed from: d */
    public final void m32239d() {
        this.f81843d.m27892b();
    }

    /* renamed from: a */
    public final void m32242a(@Nullable a62 a62Var) {
        this.f81841b.m27427a(a62Var);
    }
}
