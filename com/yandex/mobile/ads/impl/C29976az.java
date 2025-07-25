package com.yandex.mobile.ads.impl;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.az */
/* loaded from: classes8.dex */
public final class C29976az {

    /* renamed from: e */
    static final /* synthetic */ KProperty<Object>[] f76969e = {C30452ha.m33588a(C29976az.class, "weakSkipButton", "getWeakSkipButton()Landroid/view/View;", 0)};
    @NotNull

    /* renamed from: a */
    private final vu1 f76970a;

    /* renamed from: b */
    private final long f76971b;
    @NotNull

    /* renamed from: c */
    private final oc1 f76972c;
    @NotNull

    /* renamed from: d */
    private final xj1 f76973d;

    /* renamed from: com.yandex.mobile.ads.impl.az$a */
    /* loaded from: classes8.dex */
    private static final class C29977a implements qc1 {
        @NotNull

        /* renamed from: a */
        private final vu1 f76974a;
        @NotNull

        /* renamed from: b */
        private final WeakReference<View> f76975b;

        public C29977a(@NotNull View view, @NotNull vu1 skipAppearanceController) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(skipAppearanceController, "skipAppearanceController");
            this.f76974a = skipAppearanceController;
            this.f76975b = new WeakReference<>(view);
        }

        @Override // com.yandex.mobile.ads.impl.qc1
        /* renamed from: a */
        public final void mo25973a() {
            View view = this.f76975b.get();
            if (view != null) {
                this.f76974a.mo25957b(view);
            }
        }
    }

    public C29976az(@NotNull View skipButton, @NotNull vu1 skipAppearanceController, long j, @NotNull oc1 pausableTimer) {
        Intrinsics.checkNotNullParameter(skipButton, "skipButton");
        Intrinsics.checkNotNullParameter(skipAppearanceController, "skipAppearanceController");
        Intrinsics.checkNotNullParameter(pausableTimer, "pausableTimer");
        this.f76970a = skipAppearanceController;
        this.f76971b = j;
        this.f76972c = pausableTimer;
        this.f76973d = yj1.m26872a(skipButton);
        skipAppearanceController.mo25958a(skipButton);
    }

    /* renamed from: a */
    public final void m35729a() {
        this.f76972c.invalidate();
    }

    /* renamed from: b */
    public final void m35728b() {
        View view = (View) this.f76973d.getValue(this, f76969e[0]);
        if (view != null) {
            C29977a c29977a = new C29977a(view, this.f76970a);
            long j = this.f76971b;
            if (j == 0) {
                this.f76970a.mo25957b(view);
            } else {
                this.f76972c.mo30764a(j, c29977a);
            }
        }
    }

    /* renamed from: c */
    public final void m35727c() {
        this.f76972c.pause();
    }

    /* renamed from: d */
    public final void m35726d() {
        this.f76972c.resume();
    }
}
