package com.monetization.ads.mediation.banner;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.monetization.ads.mediation.banner.C25601d;
import com.yandex.mobile.ads.impl.fb2;
import com.yandex.mobile.ads.impl.um0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.monetization.ads.mediation.banner.e */
/* loaded from: classes7.dex */
public final class ViewTreeObserver$OnPreDrawListenerC25603e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ View f66471a;

    /* renamed from: b */
    final /* synthetic */ C25601d.InterfaceC25602a f66472b;

    /* renamed from: c */
    final /* synthetic */ C25601d f66473c;

    public ViewTreeObserver$OnPreDrawListenerC25603e(C25601d c25601d, View view, C25601d.InterfaceC25602a interfaceC25602a) {
        this.f66471a = view;
        this.f66472b = interfaceC25602a;
        this.f66473c = c25601d;
    }

    /* renamed from: a */
    public static final void m44277a(C25601d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        fb2.m34180a(C25601d.m44282a(this$0), false);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        Handler handler;
        um0.m28725d(new Object[0]);
        if (this.f66471a.isShown()) {
            this.f66471a.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f66472b.mo44278a();
            handler = this.f66473c.f66469b;
            final C25601d c25601d = this.f66473c;
            handler.postDelayed(new Runnable() { // from class: com.monetization.ads.mediation.banner.g
                @Override // java.lang.Runnable
                public final void run() {
                    ViewTreeObserver$OnPreDrawListenerC25603e.m44277a(c25601d);
                }
            }, 50L);
            return true;
        }
        return true;
    }
}
