package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.oc1;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class mh1 implements InterfaceC30799lo {
    @NotNull

    /* renamed from: a */
    private final View f82200a;
    @NotNull

    /* renamed from: b */
    private final ProgressBar f82201b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC30573io f82202c;
    @NotNull

    /* renamed from: d */
    private final C31383so f82203d;
    @NotNull

    /* renamed from: e */
    private final InterfaceC31487tu f82204e;
    @NotNull

    /* renamed from: f */
    private final th1 f82205f;

    /* renamed from: g */
    private final long f82206g;
    @NotNull

    /* renamed from: h */
    private final oc1 f82207h;
    @NotNull

    /* renamed from: i */
    private final qc1 f82208i;
    @NotNull

    /* renamed from: j */
    private final k02 f82209j;

    /* renamed from: com.yandex.mobile.ads.impl.mh1$a */
    /* loaded from: classes8.dex */
    private static final class C30857a implements k02 {
        @NotNull

        /* renamed from: a */
        private final C31383so f82210a;

        /* renamed from: b */
        private final long f82211b;
        @NotNull

        /* renamed from: c */
        private final WeakReference<ProgressBar> f82212c;

        public C30857a(@NotNull ProgressBar progressView, @NotNull C31383so closeProgressAppearanceController, long j) {
            Intrinsics.checkNotNullParameter(progressView, "progressView");
            Intrinsics.checkNotNullParameter(closeProgressAppearanceController, "closeProgressAppearanceController");
            this.f82210a = closeProgressAppearanceController;
            this.f82211b = j;
            this.f82212c = new WeakReference<>(progressView);
        }

        @Override // com.yandex.mobile.ads.impl.k02
        /* renamed from: a */
        public final void mo28719a(long j, long j2) {
            ProgressBar progressBar = this.f82212c.get();
            if (progressBar != null) {
                C31383so c31383so = this.f82210a;
                long j3 = this.f82211b;
                c31383so.m29577a(progressBar, j3, j3 - j);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mh1$b */
    /* loaded from: classes8.dex */
    private static final class C30858b implements qc1 {
        @NotNull

        /* renamed from: a */
        private final InterfaceC30573io f82213a;
        @NotNull

        /* renamed from: b */
        private final InterfaceC31487tu f82214b;
        @NotNull

        /* renamed from: c */
        private final WeakReference<View> f82215c;

        public C30858b(@NotNull View closeView, @NotNull y20 closeAppearanceController, @NotNull InterfaceC31487tu debugEventsReporter) {
            Intrinsics.checkNotNullParameter(closeView, "closeView");
            Intrinsics.checkNotNullParameter(closeAppearanceController, "closeAppearanceController");
            Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
            this.f82213a = closeAppearanceController;
            this.f82214b = debugEventsReporter;
            this.f82215c = new WeakReference<>(closeView);
        }

        @Override // com.yandex.mobile.ads.impl.qc1
        /* renamed from: a */
        public final void mo25973a() {
            View view = this.f82215c.get();
            if (view != null) {
                this.f82213a.mo27112b(view);
                this.f82214b.mo28635a(EnumC31398su.f85387e);
            }
        }
    }

    public mh1(@NotNull View closeButton, @NotNull ProgressBar closeProgressView, @NotNull y20 closeAppearanceController, @NotNull C31383so closeProgressAppearanceController, @NotNull InterfaceC31487tu debugEventsReporter, @NotNull th1 progressIncrementer, long j) {
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(closeProgressView, "closeProgressView");
        Intrinsics.checkNotNullParameter(closeAppearanceController, "closeAppearanceController");
        Intrinsics.checkNotNullParameter(closeProgressAppearanceController, "closeProgressAppearanceController");
        Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
        Intrinsics.checkNotNullParameter(progressIncrementer, "progressIncrementer");
        this.f82200a = closeButton;
        this.f82201b = closeProgressView;
        this.f82202c = closeAppearanceController;
        this.f82203d = closeProgressAppearanceController;
        this.f82204e = debugEventsReporter;
        this.f82205f = progressIncrementer;
        this.f82206g = j;
        int i = oc1.f83452a;
        this.f82207h = oc1.C31031a.m31055a(true);
        this.f82208i = new C30858b(mo25974d(), closeAppearanceController, debugEventsReporter);
        this.f82209j = new C30857a(closeProgressView, closeProgressAppearanceController, j);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30799lo
    /* renamed from: a */
    public final void mo25977a(boolean z) {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30799lo
    /* renamed from: b */
    public final void mo25976b() {
        this.f82207h.pause();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30799lo
    /* renamed from: c */
    public final void mo25975c() {
        C31383so c31383so = this.f82203d;
        ProgressBar progressBar = this.f82201b;
        c31383so.getClass();
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        progressBar.setMax((int) this.f82206g);
        progressBar.setVisibility(0);
        progressBar.setProgress((int) this.f82205f.m29163a());
        long max = Math.max(0L, this.f82206g - this.f82205f.m29163a());
        if (max != 0) {
            this.f82202c.mo27113a(this.f82200a);
            this.f82207h.mo30763a(this.f82209j);
            this.f82207h.mo30764a(max, this.f82208i);
            this.f82204e.mo28635a(EnumC31398su.f85386d);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30799lo
    @NotNull
    /* renamed from: d */
    public final View mo25974d() {
        return this.f82200a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30799lo
    public final void invalidate() {
        this.f82207h.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30799lo
    /* renamed from: a */
    public final void mo25978a() {
        this.f82207h.resume();
    }
}
