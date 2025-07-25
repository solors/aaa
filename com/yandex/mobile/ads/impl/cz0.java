package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class cz0 implements InterfaceC30799lo {
    @NotNull

    /* renamed from: a */
    private final View f77807a;
    @NotNull

    /* renamed from: b */
    private final s32 f77808b;
    @NotNull

    /* renamed from: c */
    private final Handler f77809c;

    /* renamed from: d */
    private boolean f77810d;

    /* renamed from: com.yandex.mobile.ads.impl.cz0$a */
    /* loaded from: classes8.dex */
    private static final class RunnableC30135a implements Runnable {
        @NotNull

        /* renamed from: b */
        private final WeakReference<View> f77811b;

        public RunnableC30135a(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f77811b = new WeakReference<>(view);
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.f77811b.get();
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public cz0(@NotNull FrameLayout closeButton, @NotNull s32 useCustomCloseHandler, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(useCustomCloseHandler, "useCustomCloseHandler");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f77807a = closeButton;
        this.f77808b = useCustomCloseHandler;
        this.f77809c = handler;
        mo25974d().setVisibility(8);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30799lo
    /* renamed from: a */
    public final void mo25978a() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30799lo
    /* renamed from: c */
    public final void mo25975c() {
        if (!this.f77810d) {
            this.f77809c.postDelayed(new RunnableC30135a(this.f77807a), 200L);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30799lo
    @NotNull
    /* renamed from: d */
    public final View mo25974d() {
        return this.f77807a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30799lo
    /* renamed from: a */
    public final void mo25977a(boolean z) {
        this.f77810d = true;
        this.f77809c.removeCallbacksAndMessages(null);
        s32 s32Var = this.f77808b;
        View closeButton = this.f77807a;
        s32Var.getClass();
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        closeButton.setVisibility(z ? 8 : 0);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30799lo
    /* renamed from: b */
    public final void mo25976b() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30799lo
    public final void invalidate() {
    }
}
