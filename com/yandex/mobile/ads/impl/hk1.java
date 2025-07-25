package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class hk1 {
    @NotNull

    /* renamed from: a */
    private final C30604j7 f80091a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC30469b f80092b;
    @NotNull

    /* renamed from: c */
    private final Handler f80093c;

    /* renamed from: d */
    private boolean f80094d;

    /* renamed from: com.yandex.mobile.ads.impl.hk1$a */
    /* loaded from: classes8.dex */
    private final class RunnableC30468a implements Runnable {
        @NotNull

        /* renamed from: b */
        private final C30604j7 f80095b;

        /* renamed from: c */
        final /* synthetic */ hk1 f80096c;

        public RunnableC30468a(hk1 hk1Var, @NotNull C30604j7 adRenderingValidator) {
            Intrinsics.checkNotNullParameter(adRenderingValidator, "adRenderingValidator");
            this.f80096c = hk1Var;
            this.f80095b = adRenderingValidator;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.f80096c.f80094d) {
                if (this.f80095b.m33035a()) {
                    this.f80096c.f80094d = true;
                    this.f80096c.f80092b.mo32510a();
                    return;
                }
                this.f80096c.f80093c.postDelayed(new RunnableC30468a(this.f80096c, this.f80095b), 300L);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hk1$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC30469b {
        /* renamed from: a */
        void mo32510a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hk1(@NotNull C30604j7 adRenderValidator, @NotNull InterfaceC30469b adRenderedListener) {
        this(adRenderValidator, adRenderedListener, new Handler(Looper.getMainLooper()));
        Intrinsics.checkNotNullParameter(adRenderValidator, "adRenderValidator");
        Intrinsics.checkNotNullParameter(adRenderedListener, "adRenderedListener");
    }

    /* renamed from: a */
    public final void m33539a() {
        this.f80093c.post(new RunnableC30468a(this, this.f80091a));
    }

    /* renamed from: b */
    public final void m33537b() {
        this.f80093c.removeCallbacksAndMessages(null);
    }

    public hk1(@NotNull C30604j7 adRenderValidator, @NotNull InterfaceC30469b adRenderedListener, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(adRenderValidator, "adRenderValidator");
        Intrinsics.checkNotNullParameter(adRenderedListener, "adRenderedListener");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f80091a = adRenderValidator;
        this.f80092b = adRenderedListener;
        this.f80093c = handler;
    }
}
