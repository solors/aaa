package com.fyber.inneractive.sdk.measurement.tracker;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.flow.AbstractC14552x;
import com.fyber.inneractive.sdk.network.AbstractC14743z;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.web.C15536m;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.Partner;
import com.iab.omid.library.fyber.publisher.AdSessionStatePublisher;

/* renamed from: com.fyber.inneractive.sdk.measurement.tracker.f */
/* loaded from: classes4.dex */
public abstract class AbstractC14597f {

    /* renamed from: a */
    public AdSession f27646a;

    /* renamed from: b */
    public AdEvents f27647b;

    /* renamed from: c */
    public final AbstractC14552x f27648c;

    /* renamed from: e */
    public final Partner f27650e;

    /* renamed from: f */
    public WebView f27651f;

    /* renamed from: d */
    public boolean f27649d = false;

    /* renamed from: g */
    public final C14594c f27652g = new C14594c(this);

    public AbstractC14597f(Partner partner, C15536m c15536m, AbstractC14552x abstractC14552x) {
        this.f27650e = partner;
        this.f27651f = c15536m;
        this.f27648c = abstractC14552x;
    }

    /* renamed from: a */
    public abstract void mo77779a();

    /* renamed from: a */
    public final void m77777a(Throwable th) {
        String str = "OpenMeasurementTracker - " + th.getMessage();
        String simpleName = th.getClass().getSimpleName();
        AbstractC14552x abstractC14552x = this.f27648c;
        AbstractC14743z.m77654a(simpleName, str, abstractC14552x != null ? abstractC14552x.f27572a : null, abstractC14552x != null ? abstractC14552x.mo77807c() : null);
    }

    /* renamed from: b */
    public abstract AdSessionConfiguration mo77775b();

    /* renamed from: c */
    public abstract void mo77774c();

    /* renamed from: a */
    public final void m77776a(boolean z) {
        AdSession adSession = this.f27646a;
        if (adSession != null) {
            try {
                adSession.finish();
            } catch (Throwable th) {
                m77777a(th);
            }
            AbstractC15465p.f30612b.postDelayed(new RunnableC14595d(this), z ? 0 : 1000);
            this.f27646a = null;
            this.f27647b = null;
        }
    }

    /* renamed from: a */
    public void mo77778a(C15536m c15536m) {
        WebView webView;
        try {
            AdSession createAdSession = AdSession.createAdSession(mo77775b(), AdSessionContext.createHtmlAdSessionContext(this.f27650e, c15536m, "", ""));
            this.f27646a = createAdSession;
            AdSessionStatePublisher adSessionStatePublisher = createAdSession.getAdSessionStatePublisher();
            if (adSessionStatePublisher != null && (webView = adSessionStatePublisher.getWebView()) != null && webView != c15536m) {
                webView.setWebViewClient(this.f27652g);
            }
            this.f27646a.registerAdView(c15536m);
            this.f27646a.start();
        } catch (Throwable th) {
            m77777a(th);
        }
    }
}
