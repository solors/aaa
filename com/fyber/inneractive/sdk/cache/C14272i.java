package com.fyber.inneractive.sdk.cache;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.C14687V;
import com.fyber.inneractive.sdk.util.AbstractC15459m;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.cache.i */
/* loaded from: classes4.dex */
public final class C14272i {

    /* renamed from: a */
    public long f26972a;

    /* renamed from: b */
    public String f26973b;

    /* renamed from: c */
    public String f26974c;

    /* renamed from: d */
    public String f26975d;

    /* renamed from: a */
    public final void m78016a() {
        if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - this.f26972a) >= 60) {
            IAConfigManager iAConfigManager = IAConfigManager.f27060O;
            if (iAConfigManager.f27097u.f27275b.m77916a(false, "use_js_inline")) {
                Application application = AbstractC15459m.f30607a;
                if (application == null) {
                    IAlog.m76524f("fetchJS() failed context null", new Object[0]);
                    return;
                }
                this.f26972a = System.currentTimeMillis();
                iAConfigManager.f27095s.m77724b(new C14687V(new C14269f(this), application, new C14268e("https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js", "dt-mraid-video-controller.js")));
                iAConfigManager.f27095s.m77724b(new C14687V(new C14270g(this), application, new C14268e("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css", "centering_v1.css")));
                iAConfigManager.f27095s.m77724b(new C14687V(new C14271h(this), application, new C14268e("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js", "centering_v1.js")));
            }
        }
    }
}
