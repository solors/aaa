package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.C4087ar;
import com.applovin.impl.C4145br;
import com.applovin.impl.C4584ie;
import com.applovin.impl.mediation.ads.AbstractC4859a;
import com.applovin.impl.sdk.C5416j;
import com.applovin.impl.sdk.C5434n;

/* renamed from: com.applovin.impl.mediation.ads.b */
/* loaded from: classes2.dex */
public class C4861b implements C4145br.InterfaceC4146a {

    /* renamed from: a */
    private final C5416j f8087a;

    /* renamed from: b */
    private final C4584ie f8088b;

    /* renamed from: c */
    private final C4145br f8089c;

    /* renamed from: d */
    private final C4087ar f8090d;

    /* renamed from: e */
    private final AbstractC4859a.InterfaceC4860a f8091e;

    public C4861b(C4584ie c4584ie, ViewGroup viewGroup, AbstractC4859a.InterfaceC4860a interfaceC4860a, C5416j c5416j) {
        this.f8087a = c5416j;
        this.f8088b = c4584ie;
        this.f8091e = interfaceC4860a;
        this.f8090d = new C4087ar(viewGroup, c5416j);
        C4145br c4145br = new C4145br(viewGroup, c5416j, this);
        this.f8089c = c4145br;
        c4145br.m100309a(c4584ie);
        c5416j.m95186I();
        if (C5434n.m94914a()) {
            C5434n m95186I = c5416j.m95186I();
            m95186I.m94911a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    /* renamed from: a */
    public void m97333a() {
        this.f8089c.m100307b();
    }

    /* renamed from: b */
    public C4584ie m97331b() {
        return this.f8088b;
    }

    /* renamed from: c */
    public void m97330c() {
        this.f8087a.m95186I();
        if (C5434n.m94914a()) {
            this.f8087a.m95186I().m94911a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f8088b.m98437q0().compareAndSet(false, true)) {
            this.f8087a.m95186I();
            if (C5434n.m94914a()) {
                this.f8087a.m95186I().m94911a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f8088b.getNativeAd().isExpired()) {
                C5434n.m94898h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f8087a.m95096f().m95535a(this.f8088b);
            }
            this.f8087a.m95172P().processRawAdImpression(this.f8088b, this.f8091e);
        }
    }

    @Override // com.applovin.impl.C4145br.InterfaceC4146a
    public void onLogVisibilityImpression() {
        m97332a(this.f8090d.m100609a(this.f8088b));
    }

    /* renamed from: a */
    private void m97332a(long j) {
        if (this.f8088b.m98435s0().compareAndSet(false, true)) {
            this.f8087a.m95186I();
            if (C5434n.m94914a()) {
                this.f8087a.m95186I().m94911a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f8087a.m95172P().processViewabilityAdImpressionPostback(this.f8088b, j, this.f8091e);
        }
    }
}
