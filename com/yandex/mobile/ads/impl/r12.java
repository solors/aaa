package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class r12 {
    @NotNull

    /* renamed from: a */
    private final C30594j0 f84601a;
    @NotNull

    /* renamed from: b */
    private final d41 f84602b;
    @NotNull

    /* renamed from: c */
    private final t12 f84603c;
    @Nullable

    /* renamed from: d */
    private s12 f84604d;
    @Nullable

    /* renamed from: e */
    private c41 f84605e;

    /* renamed from: com.yandex.mobile.ads.impl.r12$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC31252a {
        /* renamed from: a */
        void mo30170a();

        /* renamed from: b */
        void mo30169b();
    }

    public /* synthetic */ r12() {
        this(new C30594j0(), new d41(), new t12());
    }

    /* renamed from: a */
    public final void m30171a(@NotNull View nativeAdView, @NotNull p51 trackingListener) {
        C30527i0 c30527i0;
        Object obj;
        C30527i0 c30527i02;
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
        Context context = nativeAdView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        s12 s12Var = this.f84604d;
        if (s12Var != null) {
            s12Var.m29881b(context);
        }
        Context activityContext = null;
        this.f84604d = null;
        c41 c41Var = this.f84605e;
        if (c41Var != null) {
            c41Var.m35361b();
        }
        this.f84605e = null;
        C30594j0 c30594j0 = this.f84601a;
        Context context2 = nativeAdView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        c30594j0.getClass();
        Intrinsics.checkNotNullParameter(context2, "context");
        int i = 0;
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                break;
            }
            int i2 = i + 1;
            if (i >= 10) {
                break;
            } else if (context2 instanceof Activity) {
                activityContext = context2;
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
                i = i2;
            }
        }
        if (activityContext != null) {
            this.f84603c.getClass();
            Intrinsics.checkNotNullParameter(activityContext, "activityContext");
            Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
            c30527i0 = C30527i0.f80271g;
            if (c30527i0 == null) {
                obj = C30527i0.f80270f;
                synchronized (obj) {
                    c30527i02 = C30527i0.f80271g;
                    if (c30527i02 == null) {
                        c30527i02 = new C30527i0();
                        C30527i0.f80271g = c30527i02;
                    }
                }
                c30527i0 = c30527i02;
            }
            s12 s12Var2 = new s12(activityContext, trackingListener, c30527i0);
            this.f84604d = s12Var2;
            s12Var2.m29883a(activityContext);
        }
        this.f84602b.getClass();
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
        c41 c41Var2 = new c41(nativeAdView, trackingListener, new y31());
        this.f84605e = c41Var2;
        c41Var2.m35362a();
    }

    public r12(@NotNull C30594j0 activityContextProvider, @NotNull d41 windowAttachListenerFactory, @NotNull t12 activityLifecycleListenerFactory) {
        Intrinsics.checkNotNullParameter(activityContextProvider, "activityContextProvider");
        Intrinsics.checkNotNullParameter(windowAttachListenerFactory, "windowAttachListenerFactory");
        Intrinsics.checkNotNullParameter(activityLifecycleListenerFactory, "activityLifecycleListenerFactory");
        this.f84601a = activityContextProvider;
        this.f84602b = windowAttachListenerFactory;
        this.f84603c = activityLifecycleListenerFactory;
    }

    /* renamed from: a */
    public final void m30172a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        s12 s12Var = this.f84604d;
        if (s12Var != null) {
            s12Var.m29881b(context);
        }
        this.f84604d = null;
        c41 c41Var = this.f84605e;
        if (c41Var != null) {
            c41Var.m35361b();
        }
        this.f84605e = null;
    }
}
