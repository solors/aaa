package io.bidmachine.rendering.p730ad.fullscreen;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.utils.C10512g;
import io.bidmachine.rendering.internal.C37025d;
import io.bidmachine.rendering.internal.InterfaceC37000c;
import io.bidmachine.rendering.model.AdParams;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.p730ad.view.AdView;
import io.bidmachine.rendering.p730ad.view.AdViewListener;
import io.bidmachine.rendering.utils.UiUtils;
import java.lang.ref.WeakReference;

/* renamed from: io.bidmachine.rendering.ad.fullscreen.FullScreenAd */
/* loaded from: classes9.dex */
public class FullScreenAd {

    /* renamed from: a */
    private final InterfaceC37000c f97563a = new C37025d();

    /* renamed from: b */
    private final AdView f97564b;

    /* renamed from: c */
    private FullScreenAdListener f97565c;

    /* renamed from: d */
    private WeakReference f97566d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.rendering.ad.fullscreen.FullScreenAd$b */
    /* loaded from: classes9.dex */
    public class C36921b implements AdViewListener {
        private C36921b() {
            FullScreenAd.this = r1;
        }

        @Override // io.bidmachine.rendering.p730ad.view.AdViewListener, io.bidmachine.rendering.p730ad.AdListener
        /* renamed from: a */
        public void onAdAppeared(AdView adView) {
            FullScreenAd.this.m19548k();
        }

        @Override // io.bidmachine.rendering.p730ad.view.AdViewListener, io.bidmachine.rendering.p730ad.AdListener
        /* renamed from: b */
        public void onAdClicked(AdView adView) {
            FullScreenAd.this.m19546l();
        }

        @Override // io.bidmachine.rendering.p730ad.view.AdViewListener, io.bidmachine.rendering.p730ad.AdListener
        /* renamed from: c */
        public void onAdDisappeared(AdView adView) {
            FullScreenAd.this.m19544m();
        }

        @Override // io.bidmachine.rendering.p730ad.view.AdViewListener, io.bidmachine.rendering.p730ad.AdListener
        /* renamed from: d */
        public void onAdExpired(AdView adView) {
            FullScreenAd.this.m19542n();
        }

        @Override // io.bidmachine.rendering.p730ad.view.AdViewListener, io.bidmachine.rendering.p730ad.AdListener
        /* renamed from: e */
        public void onAdFinished(AdView adView) {
            FullScreenAd.this.m19537r();
        }

        @Override // io.bidmachine.rendering.p730ad.view.AdViewListener, io.bidmachine.rendering.p730ad.AdListener
        /* renamed from: f */
        public void onAdLoaded(AdView adView) {
            FullScreenAd.this.m19539p();
        }

        @Override // io.bidmachine.rendering.p730ad.view.AdViewListener, io.bidmachine.rendering.p730ad.AdListener
        /* renamed from: g */
        public void onAdShown(AdView adView) {
            FullScreenAd.this.m19538q();
        }

        @Override // io.bidmachine.rendering.p730ad.view.AdViewListener, io.bidmachine.rendering.p730ad.AdListener
        /* renamed from: a */
        public void onAdFailToLoad(AdView adView, Error error) {
            FullScreenAd.this.m19564c(error);
        }

        @Override // io.bidmachine.rendering.p730ad.view.AdViewListener, io.bidmachine.rendering.p730ad.AdListener
        /* renamed from: b */
        public void onAdFailToShow(AdView adView, Error error) {
            FullScreenAd.this.m19561d(error);
        }
    }

    public FullScreenAd(@NonNull Context context, @NonNull AdParams adParams) {
        this.f97564b = new AdView(context.getApplicationContext(), adParams);
    }

    /* renamed from: o */
    private void m19540o() {
        if (!this.f97563a.mo19221i()) {
            return;
        }
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.fullscreen.i
            {
                FullScreenAd.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FullScreenAd.this.m19554h();
            }
        });
    }

    /* renamed from: p */
    public void m19539p() {
        if (!this.f97563a.mo19230a(true)) {
            return;
        }
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.fullscreen.e
            {
                FullScreenAd.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FullScreenAd.this.m19552i();
            }
        });
    }

    /* renamed from: q */
    public void m19538q() {
        if (!this.f97563a.mo19222h()) {
            return;
        }
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.fullscreen.h
            {
                FullScreenAd.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FullScreenAd.this.m19550j();
            }
        });
    }

    public void destroy() {
        this.f97563a.mo19231a();
        this.f97564b.destroy();
        m19576a();
    }

    public boolean isFinished() {
        return this.f97563a.mo19223g();
    }

    public boolean isLoaded() {
        return this.f97563a.mo19229b();
    }

    public void load() {
        if (!this.f97563a.mo19227c()) {
            return;
        }
        this.f97564b.setAdViewListener(new C36921b());
        this.f97564b.load();
    }

    /* renamed from: r */
    public void m19537r() {
        m19576a();
        m19544m();
        m19540o();
    }

    public void setFullScreenAdListener(@Nullable FullScreenAdListener fullScreenAdListener) {
        this.f97565c = fullScreenAdListener;
    }

    public void show(@NonNull Context context) {
        if (!isLoaded()) {
            m19561d(new Error("FullScreenAd not loaded"));
        } else {
            FullScreenActivity.show(context, this);
        }
    }

    /* renamed from: d */
    public /* synthetic */ void m19563d() {
        FullScreenAdListener fullScreenAdListener = this.f97565c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdAppeared(this);
        }
    }

    /* renamed from: e */
    public /* synthetic */ void m19560e() {
        FullScreenAdListener fullScreenAdListener = this.f97565c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdClicked(this);
        }
    }

    /* renamed from: f */
    public /* synthetic */ void m19558f() {
        FullScreenAdListener fullScreenAdListener = this.f97565c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdDisappeared(this);
        }
    }

    /* renamed from: g */
    public /* synthetic */ void m19556g() {
        FullScreenAdListener fullScreenAdListener = this.f97565c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdExpired(this);
        }
    }

    /* renamed from: h */
    public /* synthetic */ void m19554h() {
        FullScreenAdListener fullScreenAdListener = this.f97565c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdFinished(this);
        }
    }

    /* renamed from: i */
    public /* synthetic */ void m19552i() {
        FullScreenAdListener fullScreenAdListener = this.f97565c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdLoaded(this);
        }
    }

    /* renamed from: j */
    public /* synthetic */ void m19550j() {
        FullScreenAdListener fullScreenAdListener = this.f97565c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdShown(this);
        }
    }

    /* renamed from: k */
    public void m19548k() {
        if (this.f97563a.mo19228b(true)) {
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.fullscreen.j
                {
                    FullScreenAd.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FullScreenAd.this.m19563d();
                }
            });
        }
    }

    /* renamed from: l */
    public void m19546l() {
        this.f97563a.mo19225e();
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.fullscreen.d
            {
                FullScreenAd.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FullScreenAd.this.m19560e();
            }
        });
    }

    /* renamed from: m */
    public void m19544m() {
        if (this.f97563a.mo19228b(false)) {
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.fullscreen.g
                {
                    FullScreenAd.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FullScreenAd.this.m19558f();
                }
            });
        }
    }

    /* renamed from: n */
    public void m19542n() {
        if (this.f97563a.mo19220j()) {
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.fullscreen.f
                {
                    FullScreenAd.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FullScreenAd.this.m19556g();
                }
            });
        }
    }

    /* renamed from: c */
    Activity m19566c() {
        WeakReference weakReference = this.f97566d;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* renamed from: c */
    public void m19564c(final Error error) {
        if (this.f97563a.mo19230a(false)) {
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.fullscreen.b
                {
                    FullScreenAd.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FullScreenAd.this.m19572a(error);
                }
            });
        }
    }

    /* renamed from: a */
    void m19575a(Activity activity) {
        this.f97566d = new WeakReference(activity);
    }

    /* renamed from: b */
    void m19571b() {
        WeakReference weakReference = this.f97566d;
        if (weakReference != null) {
            weakReference.clear();
            this.f97566d = null;
        }
    }

    /* renamed from: d */
    public void m19561d(final Error error) {
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.fullscreen.c
            {
                FullScreenAd.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FullScreenAd.this.m19567b(error);
            }
        });
    }

    /* renamed from: a */
    private void m19576a() {
        Activity m19566c = m19566c();
        if (m19566c != null) {
            try {
                C10512g.m79301p(m19566c);
            } catch (Throwable unused) {
            }
        }
        m19571b();
    }

    /* renamed from: b */
    public /* synthetic */ void m19567b(Error error) {
        FullScreenAdListener fullScreenAdListener = this.f97565c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdFailToShow(this, error);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m19572a(Error error) {
        FullScreenAdListener fullScreenAdListener = this.f97565c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdFailToLoad(this, error);
        }
    }

    /* renamed from: b */
    public void m19570b(Activity activity) {
        m19575a(activity);
        UiUtils.setupActivityOrientation(activity, this.f97564b.getRequiredOrientation());
        C10512g.m79311f(activity);
        C10512g.m79321L(this.f97564b);
        UiUtils.applyInsets(activity, this.f97564b, false);
        activity.setContentView(this.f97564b, new ViewGroup.LayoutParams(-1, -1));
    }
}
