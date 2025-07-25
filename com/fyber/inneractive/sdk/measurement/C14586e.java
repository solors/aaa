package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import com.fyber.inneractive.sdk.cache.C14268e;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.measurement.tracker.C14598g;
import com.fyber.inneractive.sdk.network.C14687V;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.Partner;

/* renamed from: com.fyber.inneractive.sdk.measurement.e */
/* loaded from: classes4.dex */
public final class C14586e {

    /* renamed from: b */
    public String f27619b;

    /* renamed from: c */
    public String f27620c;

    /* renamed from: d */
    public String f27621d;

    /* renamed from: e */
    public Partner f27622e;

    /* renamed from: a */
    public boolean f27618a = false;

    /* renamed from: f */
    public final C14598g f27623f = new C14598g();

    /* renamed from: g */
    public final C14582a f27624g = new C14582a(this);

    /* renamed from: h */
    public final C14583b f27625h = new C14583b(this);

    /* renamed from: i */
    public final C14584c f27626i = new C14584c(this);

    /* renamed from: a */
    public static void m77785a(C14586e c14586e, Context context) {
        c14586e.getClass();
        String version = Omid.getVersion();
        C14687V c14687v = new C14687V(c14586e.f27624g, context, new C14268e("https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/" + version + ".js", "omid-latest.js"));
        IAConfigManager iAConfigManager = IAConfigManager.f27060O;
        iAConfigManager.f27095s.m77724b(c14687v);
        String version2 = Omid.getVersion();
        iAConfigManager.f27095s.m77724b(new C14687V(c14586e.f27625h, context, new C14268e("https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/omid-session-client-" + version2 + ".js", "omid-session-client-latest.js")));
        iAConfigManager.f27095s.m77724b(new C14687V(c14586e.f27626i, context, new C14268e("https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/dt-omsdk-mraid-video-tracker.js", "dt-omsdk-mraid-video-tracker.js")));
    }
}
