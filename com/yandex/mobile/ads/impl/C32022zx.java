package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.oc1;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.zx */
/* loaded from: classes8.dex */
public final class C32022zx implements InterfaceC30799lo {
    @NotNull

    /* renamed from: a */
    private final View f89136a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC30573io f89137b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC31487tu f89138c;

    /* renamed from: d */
    private final long f89139d;
    @NotNull

    /* renamed from: e */
    private final C31597uo f89140e;
    @NotNull

    /* renamed from: f */
    private final oc1 f89141f;

    /* renamed from: com.yandex.mobile.ads.impl.zx$a */
    /* loaded from: classes8.dex */
    private static final class C32023a implements qc1 {
        @NotNull

        /* renamed from: a */
        private final InterfaceC30573io f89142a;
        @NotNull

        /* renamed from: b */
        private final InterfaceC31487tu f89143b;
        @NotNull

        /* renamed from: c */
        private final WeakReference<View> f89144c;

        public C32023a(@NotNull View view, @NotNull InterfaceC30573io closeAppearanceController, @NotNull InterfaceC31487tu debugEventsReporter) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(closeAppearanceController, "closeAppearanceController");
            Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
            this.f89142a = closeAppearanceController;
            this.f89143b = debugEventsReporter;
            this.f89144c = new WeakReference<>(view);
        }

        @Override // com.yandex.mobile.ads.impl.qc1
        /* renamed from: a */
        public final void mo25973a() {
            View view = this.f89144c.get();
            if (view != null) {
                this.f89142a.mo27112b(view);
                this.f89143b.mo28635a(EnumC31398su.f85387e);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C32022zx(View view, InterfaceC30573io interfaceC30573io, InterfaceC31487tu interfaceC31487tu, long j, C31597uo c31597uo) {
        this(view, interfaceC30573io, interfaceC31487tu, j, c31597uo, oc1.C31031a.m31055a(true));
        int i = oc1.f83452a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30799lo
    /* renamed from: a */
    public final void mo25977a(boolean z) {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30799lo
    /* renamed from: b */
    public final void mo25976b() {
        this.f89141f.pause();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30799lo
    /* renamed from: c */
    public final void mo25975c() {
        C32023a c32023a = new C32023a(this.f89136a, this.f89137b, this.f89138c);
        long max = (long) Math.max(0.0d, this.f89139d - this.f89140e.m28720a());
        if (max == 0) {
            this.f89137b.mo27112b(this.f89136a);
            return;
        }
        this.f89141f.mo30763a(this.f89140e);
        this.f89141f.mo30764a(max, c32023a);
        this.f89138c.mo28635a(EnumC31398su.f85386d);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30799lo
    @NotNull
    /* renamed from: d */
    public final View mo25974d() {
        return this.f89136a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30799lo
    public final void invalidate() {
        this.f89141f.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30799lo
    /* renamed from: a */
    public final void mo25978a() {
        this.f89141f.resume();
    }

    public C32022zx(@NotNull View closeButton, @NotNull InterfaceC30573io closeAppearanceController, @NotNull InterfaceC31487tu debugEventsReporter, long j, @NotNull C31597uo closeTimerProgressIncrementer, @NotNull oc1 pausableTimer) {
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(closeAppearanceController, "closeAppearanceController");
        Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
        Intrinsics.checkNotNullParameter(closeTimerProgressIncrementer, "closeTimerProgressIncrementer");
        Intrinsics.checkNotNullParameter(pausableTimer, "pausableTimer");
        this.f89136a = closeButton;
        this.f89137b = closeAppearanceController;
        this.f89138c = debugEventsReporter;
        this.f89139d = j;
        this.f89140e = closeTimerProgressIncrementer;
        this.f89141f = pausableTimer;
        closeAppearanceController.mo27113a(mo25974d());
    }
}
