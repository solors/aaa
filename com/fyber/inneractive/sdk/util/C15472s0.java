package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.fyber.inneractive.sdk.util.s0 */
/* loaded from: classes4.dex */
public final class C15472s0 {

    /* renamed from: a */
    public volatile String f30617a = null;

    /* renamed from: b */
    public Context f30618b = null;

    /* renamed from: c */
    public final AtomicBoolean f30619c = new AtomicBoolean(false);

    /* renamed from: d */
    public final RunnableC15464o0 f30620d = new RunnableC15464o0(this);

    /* renamed from: a */
    public final String m76457a() {
        if (TextUtils.isEmpty(this.f30617a)) {
            RunnableC15464o0 runnableC15464o0 = this.f30620d;
            if (runnableC15464o0 != null) {
                Handler handler = AbstractC15465p.f30612b;
                handler.removeCallbacks(runnableC15464o0);
                handler.postDelayed(this.f30620d, 50L);
            }
            return System.getProperty("http.agent");
        }
        return this.f30617a;
    }

    /* renamed from: b */
    public final void m76456b() {
        WebView webView;
        String str = null;
        try {
            webView = new WebView(this.f30618b);
            try {
                str = webView.getSettings().getUserAgentString();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            webView = null;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f30617a = str;
            if (!TextUtils.isEmpty(this.f30617a)) {
                IAlog.m76529a("UserAgentProvider | populated user agent form updateUserAgentIfPossible", new Object[0]);
                this.f30619c.compareAndSet(false, true);
            }
            AbstractC15465p.f30611a.execute(new RunnableC15466p0(this, str));
        }
        if (webView != null) {
            webView.destroy();
        }
    }

    /* renamed from: c */
    public final void m76455c() {
        if (this.f30618b != null && TextUtils.isEmpty(this.f30617a)) {
            this.f30617a = this.f30618b.getSharedPreferences("fyber.ua", 0).getString("ua", null);
            if (!TextUtils.isEmpty(this.f30617a)) {
                IAlog.m76529a("UserAgentProvider | populated user agent from shared prefs", new Object[0]);
                this.f30619c.compareAndSet(false, true);
            }
            m76452f();
        }
    }

    /* renamed from: d */
    public final void m76454d() {
        String str;
        Context context = this.f30618b;
        if (context != null) {
            try {
                str = WebSettings.getDefaultUserAgent(context);
            } catch (Throwable unused) {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f30617a = str;
                if (!TextUtils.isEmpty(this.f30617a)) {
                    IAlog.m76529a("UserAgentProvider | populated user agent form updateUserAgentIfPossible", new Object[0]);
                    this.f30619c.compareAndSet(false, true);
                }
                AbstractC15465p.f30611a.execute(new RunnableC15466p0(this, str));
            }
        }
    }

    /* renamed from: e */
    public final void m76453e() {
        m76455c();
        if (!this.f30619c.get()) {
            m76454d();
        }
    }

    /* renamed from: f */
    public final void m76452f() {
        AbstractC15465p.f30611a.execute(new RunnableC15468q0(this));
    }
}
