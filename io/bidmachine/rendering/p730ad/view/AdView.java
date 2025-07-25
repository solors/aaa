package io.bidmachine.rendering.p730ad.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.explorestack.iab.utils.C10512g;
import io.bidmachine.rendering.internal.AbstractC37026e;
import io.bidmachine.rendering.internal.AbstractC37037k;
import io.bidmachine.rendering.internal.C37025d;
import io.bidmachine.rendering.internal.C37057t;
import io.bidmachine.rendering.internal.InterfaceC37000c;
import io.bidmachine.rendering.internal.InterfaceC37036j;
import io.bidmachine.rendering.internal.InterfaceC37055s;
import io.bidmachine.rendering.internal.controller.C37002b;
import io.bidmachine.rendering.internal.controller.InterfaceC37001a;
import io.bidmachine.rendering.internal.controller.InterfaceC37007c;
import io.bidmachine.rendering.internal.controller.InterfaceC37008d;
import io.bidmachine.rendering.internal.view.C37068d;
import io.bidmachine.rendering.internal.view.C37072e;
import io.bidmachine.rendering.internal.view.C37074f;
import io.bidmachine.rendering.model.AdParams;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.Orientation;
import io.bidmachine.rendering.utils.Tag;
import io.bidmachine.rendering.utils.UiUtils;
import java.lang.ref.WeakReference;

/* renamed from: io.bidmachine.rendering.ad.view.AdView */
/* loaded from: classes9.dex */
public class AdView extends FrameLayout {

    /* renamed from: a */
    private final Tag f97580a;

    /* renamed from: b */
    private final InterfaceC37000c f97581b;

    /* renamed from: c */
    private final InterfaceC37001a f97582c;

    /* renamed from: d */
    private final C37072e f97583d;

    /* renamed from: e */
    private final C37072e f97584e;

    /* renamed from: f */
    private final C37068d f97585f;

    /* renamed from: g */
    private final InterfaceC37055s f97586g;

    /* renamed from: h */
    private AdViewListener f97587h;

    /* renamed from: i */
    private boolean f97588i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.rendering.ad.view.AdView$b */
    /* loaded from: classes9.dex */
    public static class C36933b implements InterfaceC37007c {

        /* renamed from: a */
        private final WeakReference f97589a;

        private C36933b(AdView adView) {
            this.f97589a = new WeakReference(adView);
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37007c
        /* renamed from: a */
        public void mo19289a(InterfaceC37001a interfaceC37001a) {
            AdView adView = (AdView) this.f97589a.get();
            if (adView != null) {
                adView.m19484n();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37007c
        /* renamed from: b */
        public void mo19284b() {
            AdView adView = (AdView) this.f97589a.get();
            if (adView != null) {
                adView.m19527a();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37007c
        /* renamed from: c */
        public void mo19280c(InterfaceC37001a interfaceC37001a) {
            AdView adView = (AdView) this.f97589a.get();
            if (adView != null) {
                adView.m19478q();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37007c
        /* renamed from: d */
        public void mo19279d() {
            AdView adView = (AdView) this.f97589a.get();
            if (adView != null) {
                adView.m19488l();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37007c
        /* renamed from: e */
        public void mo19278e() {
            AdView adView = (AdView) this.f97589a.get();
            if (adView != null) {
                adView.m19474s();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37007c
        /* renamed from: f */
        public void mo19277f() {
            AdView adView = (AdView) this.f97589a.get();
            if (adView != null) {
                adView.m19505d(new Error("Ad loading timeout after display"));
                adView.m19527a();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37007c
        /* renamed from: a */
        public void mo19288a(InterfaceC37001a interfaceC37001a, Error error) {
            AdView adView = (AdView) this.f97589a.get();
            if (adView != null) {
                adView.m19502e(error);
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37007c
        /* renamed from: b */
        public void mo19283b(InterfaceC37001a interfaceC37001a) {
            AdView adView = (AdView) this.f97589a.get();
            if (adView != null) {
                adView.m19476r();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37007c
        /* renamed from: c */
        public void mo19281c() {
            AdView adView = (AdView) this.f97589a.get();
            if (adView != null) {
                adView.m19519b();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37007c
        /* renamed from: a */
        public void mo19287a(InterfaceC37008d interfaceC37008d) {
            AdView adView = (AdView) this.f97589a.get();
            if (adView != null) {
                adView.m19522a(interfaceC37008d);
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37007c
        /* renamed from: b */
        public void mo19282b(C37074f c37074f) {
            AdView adView = (AdView) this.f97589a.get();
            if (adView != null) {
                adView.m19521a(c37074f);
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37007c
        /* renamed from: a */
        public void mo19286a(InterfaceC37008d interfaceC37008d, Error error) {
            AdView adView = (AdView) this.f97589a.get();
            if (adView != null) {
                adView.m19499f(error);
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37007c
        /* renamed from: a */
        public void mo19285a(C37074f c37074f) {
            AdView adView = (AdView) this.f97589a.get();
            if (adView != null) {
                adView.m19506d(c37074f);
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37007c
        /* renamed from: a */
        public void mo19290a() {
            AdView adView = (AdView) this.f97589a.get();
            if (adView != null) {
                adView.m19465x();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.rendering.ad.view.AdView$c */
    /* loaded from: classes9.dex */
    public static class C36934c implements InterfaceC37055s.InterfaceC37056a {

        /* renamed from: a */
        private final WeakReference f97590a;

        private C36934c(AdView adView) {
            this.f97590a = new WeakReference(adView);
        }

        @Override // io.bidmachine.rendering.internal.InterfaceC37055s.InterfaceC37056a
        /* renamed from: a */
        public void mo19139a() {
            AdView adView = (AdView) this.f97590a.get();
            if (adView != null) {
                adView.m19472t();
            }
        }

        @Override // io.bidmachine.rendering.internal.InterfaceC37055s.InterfaceC37056a
        /* renamed from: b */
        public void mo19138b() {
            AdView adView = (AdView) this.f97590a.get();
            if (adView != null) {
                adView.m19470u();
            }
        }
    }

    public AdView(@NonNull Context context, @NonNull AdParams adParams) {
        super(context);
        this.f97580a = new Tag("AdView");
        this.f97581b = new C37025d();
        this.f97582c = new C37002b(context, adParams, new C36933b());
        C37072e c37072e = new C37072e(context);
        this.f97583d = c37072e;
        addView(c37072e, new ViewGroup.LayoutParams(-1, -1));
        C37072e c37072e2 = new C37072e(context);
        this.f97584e = c37072e2;
        addView(c37072e2, new ViewGroup.LayoutParams(-1, -1));
        C37068d c37068d = new C37068d(context);
        this.f97585f = c37068d;
        addView(c37068d, new ViewGroup.LayoutParams(-1, -1));
        c37068d.m19097a();
        this.f97586g = new C37057t(this, adParams.getVisibilityParams(), new C36934c());
        this.f97588i = false;
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
    }

    /* renamed from: w */
    private void m19466w() {
        if (this.f97588i && UiUtils.isViewVisible(this)) {
            this.f97581b.mo19219k();
            this.f97586g.start();
            if (this.f97586g.mo19133b()) {
                m19472t();
            }
        }
    }

    /* renamed from: x */
    public void m19465x() {
        this.f97585f.m19089c();
    }

    public void destroy() {
        AbstractC37037k.m19162b(this.f97580a, "destroy", new Object[0]);
        this.f97586g.mo19137a();
        this.f97587h = null;
        this.f97581b.mo19231a();
        this.f97582c.mo19320a();
        UiUtils.onUiThread(new InterfaceC37036j() { // from class: io.bidmachine.rendering.ad.view.i
            {
                AdView.this = this;
            }

            @Override // io.bidmachine.rendering.internal.InterfaceC37036j, io.bidmachine.rendering.utils.SafeRunnable
            public final void onRun() {
                AdView.this.m19513c();
            }
        });
    }

    @Nullable
    public Orientation getRequiredOrientation() {
        return this.f97582c.mo19313b();
    }

    public boolean isLoaded() {
        return this.f97581b.mo19229b();
    }

    public void load() {
        if (!this.f97581b.mo19227c()) {
            return;
        }
        this.f97582c.mo19310c();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC37037k.m19162b(this.f97580a, "onAttachedToWindow", new Object[0]);
        this.f97588i = true;
        m19466w();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC37037k.m19162b(this.f97580a, "onDetachedFromWindow", new Object[0]);
        this.f97588i = false;
        m19468v();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        AbstractC37037k.m19162b(this.f97580a, "onVisibilityChanged - %s", UiUtils.toString(i));
        if (UiUtils.isViewVisible(i)) {
            m19466w();
        } else {
            m19468v();
        }
    }

    public void setAdViewListener(@Nullable AdViewListener adViewListener) {
        this.f97587h = adViewListener;
    }

    @Override // android.view.View
    @NonNull
    public String toString() {
        return this.f97580a.toString();
    }

    /* renamed from: d */
    public /* synthetic */ void m19508d() {
        AdViewListener adViewListener = this.f97587h;
        if (adViewListener != null) {
            adViewListener.onAdAppeared(this);
        }
    }

    /* renamed from: e */
    public /* synthetic */ void m19504e() {
        AdViewListener adViewListener = this.f97587h;
        if (adViewListener != null) {
            adViewListener.onAdClicked(this);
        }
    }

    /* renamed from: f */
    public /* synthetic */ void m19501f() {
        AdViewListener adViewListener = this.f97587h;
        if (adViewListener != null) {
            adViewListener.onAdDisappeared(this);
        }
    }

    /* renamed from: g */
    public /* synthetic */ void m19498g() {
        AdViewListener adViewListener = this.f97587h;
        if (adViewListener != null) {
            adViewListener.onAdExpired(this);
        }
    }

    /* renamed from: h */
    public /* synthetic */ void m19496h() {
        AdViewListener adViewListener = this.f97587h;
        if (adViewListener != null) {
            adViewListener.onAdFinished(this);
        }
    }

    /* renamed from: i */
    public /* synthetic */ void m19494i() {
        AdViewListener adViewListener = this.f97587h;
        if (adViewListener != null) {
            adViewListener.onAdLoaded(this);
        }
    }

    /* renamed from: j */
    public /* synthetic */ void m19492j() {
        AdViewListener adViewListener = this.f97587h;
        if (adViewListener != null) {
            adViewListener.onAdShown(this);
        }
    }

    /* renamed from: k */
    private void m19490k() {
        if (this.f97581b.mo19228b(true)) {
            AbstractC37037k.m19162b(this.f97580a, "notifyAdAppeared", new Object[0]);
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.f
                {
                    AdView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AdView.this.m19508d();
                }
            });
        }
    }

    /* renamed from: l */
    public void m19488l() {
        this.f97581b.mo19225e();
        AbstractC37037k.m19162b(this.f97580a, "notifyAdClicked", new Object[0]);
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.c
            {
                AdView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AdView.this.m19504e();
            }
        });
    }

    /* renamed from: m */
    private void m19486m() {
        if (this.f97581b.mo19228b(false)) {
            AbstractC37037k.m19162b(this.f97580a, "notifyAdDisappeared", new Object[0]);
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.a
                {
                    AdView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AdView.this.m19501f();
                }
            });
        }
    }

    /* renamed from: n */
    public void m19484n() {
        if (this.f97581b.mo19220j()) {
            AbstractC37037k.m19162b(this.f97580a, "notifyAdExpired", new Object[0]);
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.j
                {
                    AdView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AdView.this.m19498g();
                }
            });
        }
    }

    /* renamed from: o */
    private void m19482o() {
        if (this.f97581b.mo19221i()) {
            AbstractC37037k.m19162b(this.f97580a, "notifyAdFinished", new Object[0]);
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.b
                {
                    AdView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AdView.this.m19496h();
                }
            });
        }
    }

    /* renamed from: p */
    private void m19480p() {
        if (this.f97581b.mo19230a(true)) {
            AbstractC37037k.m19162b(this.f97580a, "notifyAdLoaded", new Object[0]);
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.e
                {
                    AdView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AdView.this.m19494i();
                }
            });
        }
    }

    /* renamed from: q */
    public void m19478q() {
        if (this.f97581b.mo19222h()) {
            AbstractC37037k.m19162b(this.f97580a, "notifyAdShown", new Object[0]);
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.h
                {
                    AdView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AdView.this.m19492j();
                }
            });
        }
    }

    /* renamed from: r */
    public void m19476r() {
        m19480p();
    }

    /* renamed from: s */
    public void m19474s() {
        AbstractC37037k.m19162b(this.f97580a, "onPreparingForShowStarted", new Object[0]);
    }

    /* renamed from: t */
    public void m19472t() {
        AbstractC37037k.m19162b(this.f97580a, "onViewOnScreen", new Object[0]);
        this.f97582c.mo19307e();
        this.f97582c.onShown();
        m19490k();
    }

    /* renamed from: u */
    public void m19470u() {
        AbstractC37037k.m19162b(this.f97580a, "onViewOutOfScreen", new Object[0]);
        m19468v();
    }

    /* renamed from: v */
    private void m19468v() {
        this.f97586g.stop();
        this.f97582c.mo19308d();
        m19486m();
    }

    /* renamed from: c */
    public /* synthetic */ void m19513c() {
        this.f97583d.removeAllViews();
        this.f97584e.removeAllViews();
        this.f97585f.removeAllViews();
    }

    /* renamed from: d */
    public void m19505d(final Error error) {
        if (this.f97581b.mo19224f()) {
            AbstractC37037k.m19167a(this.f97580a, "notifyAdFailToShow - %s", error);
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.l
                {
                    AdView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AdView.this.m19514b(error);
                }
            });
        }
    }

    /* renamed from: e */
    public void m19502e(Error error) {
        m19509c(error);
    }

    /* renamed from: f */
    public void m19499f(Error error) {
        AbstractC37037k.m19167a(this.f97580a, "onPreparingForShowFail - %s", error);
        m19505d(new Error("No phase loaded"));
    }

    /* renamed from: b */
    public void m19519b() {
        this.f97585f.m19097a();
    }

    /* renamed from: c */
    public /* synthetic */ void m19510c(C37074f c37074f) {
        if (c37074f.getParent() == this) {
            return;
        }
        C10512g.m79321L(c37074f);
        addView(c37074f, new ViewGroup.LayoutParams(-1, -1));
        c37074f.bringToFront();
        c37074f.m19057i();
    }

    /* renamed from: d */
    public void m19506d(final C37074f c37074f) {
        AbstractC37037k.m19162b(this.f97580a, "showPlaceholder (%s)", c37074f);
        UiUtils.onUiThread(new InterfaceC37036j() { // from class: io.bidmachine.rendering.ad.view.k
            @Override // io.bidmachine.rendering.internal.InterfaceC37036j, io.bidmachine.rendering.utils.SafeRunnable
            public final void onRun() {
                AdView.this.m19510c(c37074f);
            }
        });
    }

    /* renamed from: a */
    public void m19527a() {
        m19482o();
    }

    /* renamed from: b */
    public /* synthetic */ void m19515b(C37074f c37074f) {
        removeView(c37074f);
    }

    /* renamed from: c */
    private void m19509c(final Error error) {
        if (this.f97581b.mo19230a(false)) {
            AbstractC37037k.m19167a(this.f97580a, "notifyAdFailToLoad - %s", error);
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.g
                {
                    AdView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AdView.this.m19520a(error);
                }
            });
        }
    }

    /* renamed from: a */
    public void m19521a(final C37074f c37074f) {
        AbstractC37037k.m19162b(this.f97580a, "hidePlaceholder (%s)", c37074f);
        UiUtils.onUiThread(new InterfaceC37036j() { // from class: io.bidmachine.rendering.ad.view.d
            @Override // io.bidmachine.rendering.internal.InterfaceC37036j, io.bidmachine.rendering.utils.SafeRunnable
            public final void onRun() {
                AdView.this.m19515b(c37074f);
            }
        });
    }

    /* renamed from: b */
    public /* synthetic */ void m19514b(Error error) {
        AdViewListener adViewListener = this.f97587h;
        if (adViewListener != null) {
            adViewListener.onAdFailToShow(this, error);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m19520a(Error error) {
        AdViewListener adViewListener = this.f97587h;
        if (adViewListener != null) {
            adViewListener.onAdFailToLoad(this, error);
        }
    }

    /* renamed from: a */
    public void m19522a(InterfaceC37008d interfaceC37008d) {
        AbstractC37037k.m19162b(this.f97580a, "onPreparingForShowComplete", new Object[0]);
        m19519b();
        setBackgroundColor(interfaceC37008d.mo19245f().getBackgroundColor());
        AbstractC37026e.m19217a(this, this.f97583d, interfaceC37008d.mo19243g());
        AbstractC37026e.m19217a(this, this.f97584e, interfaceC37008d.mo19242h());
        m19466w();
    }
}
