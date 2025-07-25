package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Rect;
import android.os.Handler;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.config.global.features.C14359f;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.AbstractC14552x;
import com.fyber.inneractive.sdk.measurement.tracker.AbstractC14597f;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.util.AbstractC15419J;
import com.fyber.inneractive.sdk.util.AbstractC15452i0;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.AbstractC15469r;
import com.fyber.inneractive.sdk.util.AbstractC15471s;
import com.fyber.inneractive.sdk.util.C15446f0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.InterfaceC15420K;
import com.fyber.inneractive.sdk.util.RunnableC15441d;
import com.fyber.inneractive.sdk.util.RunnableC15443e;

/* renamed from: com.fyber.inneractive.sdk.web.i */
/* loaded from: classes4.dex */
public abstract class AbstractC15529i implements InterfaceC15531j, InterfaceC15420K, InterfaceC15535l, InterfaceC15511Y {

    /* renamed from: b */
    public C15536m f30768b;

    /* renamed from: c */
    public C15497J f30769c;

    /* renamed from: d */
    public C15498K f30770d;

    /* renamed from: f */
    public InterfaceC15525g f30772f;

    /* renamed from: g */
    public InterfaceC15534k0 f30773g;

    /* renamed from: j */
    public boolean f30776j;

    /* renamed from: k */
    public final boolean f30777k;

    /* renamed from: l */
    public InterfaceC15523f f30778l;

    /* renamed from: m */
    public final RunnableC15519d f30779m;

    /* renamed from: n */
    public final RunnableC15517c f30780n;

    /* renamed from: o */
    public C15521e f30781o;

    /* renamed from: p */
    public String f30782p;

    /* renamed from: q */
    public String f30783q;

    /* renamed from: r */
    public InneractiveAdRequest f30784r;

    /* renamed from: s */
    public AbstractC14552x f30785s;

    /* renamed from: t */
    public AbstractC15386e f30786t;

    /* renamed from: a */
    public boolean f30767a = false;

    /* renamed from: h */
    public float f30774h = 0.0f;

    /* renamed from: i */
    public final Rect f30775i = new Rect();

    /* renamed from: e */
    public final boolean f30771e = false;

    public AbstractC15529i(boolean z, C14388r c14388r) {
        this.f30777k = z;
        this.f30768b = m76394a(c14388r);
        AbstractC15532j0 abstractC15532j0 = (AbstractC15532j0) this;
        this.f30780n = new RunnableC15517c(abstractC15532j0);
        this.f30779m = new RunnableC15519d(abstractC15532j0);
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC15531j
    /* renamed from: a */
    public void mo76384a(WebView webView) {
    }

    /* renamed from: a */
    public abstract boolean mo76392a(String str, C15446f0 c15446f0);

    /* renamed from: b */
    public void mo76391b(boolean z) {
        IAlog.m76529a("%s destroy is fatal: %b", IAlog.m76531a(this), Boolean.valueOf(z));
        C15521e c15521e = this.f30781o;
        if (c15521e != null && !c15521e.f30746a.isTerminated() && !c15521e.f30746a.isShutdown()) {
            C15521e c15521e2 = this.f30781o;
            c15521e2.f30751f = true;
            c15521e2.f30746a.shutdownNow();
            Handler handler = c15521e2.f30747b;
            if (handler != null) {
                RunnableC15441d runnableC15441d = c15521e2.f30749d;
                if (runnableC15441d != null) {
                    handler.removeCallbacks(runnableC15441d);
                }
                RunnableC15443e runnableC15443e = c15521e2.f30748c;
                if (runnableC15443e != null) {
                    c15521e2.f30747b.removeCallbacks(runnableC15443e);
                }
                c15521e2.f30747b = null;
            }
            this.f30781o = null;
        }
        C15536m c15536m = this.f30768b;
        if (c15536m != null) {
            AbstractC15419J.f30557a.m76520a(c15536m);
            AbstractC15471s.m76465a(this.f30768b);
            this.f30768b.setWebChromeClient(null);
            if (mo76389f() == null) {
                this.f30768b.destroy();
            } else {
                mo76389f().m77776a(z);
            }
        }
        C15498K c15498k = this.f30770d;
        if (c15498k != null) {
            c15498k.f30674e = null;
        }
        RunnableC15517c runnableC15517c = this.f30780n;
        if (runnableC15517c != null) {
            AbstractC15465p.f30612b.removeCallbacks(runnableC15517c);
        }
        RunnableC15519d runnableC15519d = this.f30779m;
        if (runnableC15519d != null) {
            AbstractC15465p.f30612b.removeCallbacks(runnableC15519d);
        }
        this.f30773g = null;
        if (!z) {
            this.f30772f = null;
        }
        this.f30768b = null;
        this.f30769c = null;
        this.f30770d = null;
        this.f30785s = null;
        this.f30784r = null;
    }

    /* renamed from: e */
    public void mo76390e() {
        mo76391b(false);
    }

    /* renamed from: f */
    public abstract AbstractC14597f mo76389f();

    /* renamed from: g */
    public C15446f0 mo76388g() {
        C15536m c15536m = this.f30768b;
        if (c15536m != null) {
            return c15536m.getLastClickedLocation();
        }
        return new C15446f0();
    }

    /* renamed from: h */
    public void mo76387h() {
        ApplicationInfo applicationInfo;
        WebSettings settings = this.f30768b.getSettings();
        boolean z = true;
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (!IAConfigManager.f27060O.f27093q && AbstractC15469r.m76470a()) {
            settings.setMixedContentMode(2);
        }
        if (this.f30771e) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        C15536m c15536m = this.f30768b;
        c15536m.setHorizontalScrollBarEnabled(false);
        c15536m.setHorizontalScrollbarOverlay(false);
        c15536m.setVerticalScrollBarEnabled(false);
        c15536m.setVerticalScrollbarOverlay(false);
        c15536m.getSettings().setSupportZoom(false);
        this.f30768b.getClass();
        this.f30768b.setFocusable(true);
        this.f30768b.setBackgroundColor(0);
        C15497J c15497j = new C15497J();
        this.f30769c = c15497j;
        this.f30768b.setWebChromeClient(c15497j);
        try {
            Context context = this.f30768b.getContext();
            if (context != null) {
                applicationInfo = context.getApplicationInfo();
            } else {
                applicationInfo = null;
            }
            if (applicationInfo == null || (applicationInfo.flags & 2) == 0) {
                z = false;
            }
            WebView.setWebContentsDebuggingEnabled(z);
        } catch (Exception unused) {
            IAlog.m76529a("Could not set web contents debugging flag", new Object[0]);
        }
        this.f30768b.setListener(this);
    }

    /* renamed from: i */
    public final void m76386i() {
        IAlog.m76529a("IAWebViewController resetClick()", new Object[0]);
        RunnableC15517c runnableC15517c = this.f30780n;
        if (runnableC15517c != null) {
            AbstractC15465p.f30612b.removeCallbacks(runnableC15517c);
        }
        RunnableC15519d runnableC15519d = this.f30779m;
        if (runnableC15519d != null) {
            AbstractC15465p.f30612b.removeCallbacks(runnableC15519d);
        }
        this.f30776j = false;
    }

    public void setAdContent(AbstractC14552x abstractC14552x) {
        this.f30785s = abstractC14552x;
    }

    public void setAdRequest(InneractiveAdRequest inneractiveAdRequest) {
        this.f30784r = inneractiveAdRequest;
    }

    public void setAdResponse(AbstractC15386e abstractC15386e) {
        this.f30786t = abstractC15386e;
    }

    public void setListener(InterfaceC15534k0 interfaceC15534k0) {
        this.f30773g = interfaceC15534k0;
    }

    /* renamed from: a */
    public final void m76395a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        C15536m c15536m = this.f30768b;
        if (c15536m != null) {
            if (layoutParams != null) {
                viewGroup.addView(c15536m, layoutParams);
            } else {
                viewGroup.addView(c15536m);
            }
            AbstractC15419J.f30557a.m76522a(viewGroup.getContext(), this.f30768b, this);
            this.f30768b.setTapListener(this);
        }
    }

    /* renamed from: a */
    public final C15536m m76394a(C14388r c14388r) {
        boolean z;
        int i;
        int i2;
        int i3;
        C15536m c15536m = new C15536m();
        if (c14388r != null) {
            C14359f c14359f = (C14359f) c14388r.m77927a(C14359f.class);
            Boolean mo77930c = c14359f.mo77930c("agg_res");
            boolean booleanValue = mo77930c != null ? mo77930c.booleanValue() : false;
            Integer mo77934a = c14359f.mo77934a("agg_res_ct");
            int max = Math.max(mo77934a != null ? mo77934a.intValue() : 500, 50);
            Integer mo77934a2 = c14359f.mo77934a("agg_res_rt");
            int max2 = Math.max(mo77934a2 != null ? mo77934a2.intValue() : 500, 50);
            Integer mo77934a3 = c14359f.mo77934a("agg_res_retries");
            z = booleanValue;
            i2 = max2;
            i3 = Math.max(mo77934a3 != null ? mo77934a3.intValue() : 2, 1);
            i = max;
        } else {
            z = false;
            i = 500;
            i2 = 500;
            i3 = 2;
        }
        C15498K c15498k = new C15498K(this, z, i, i2, i3);
        this.f30770d = c15498k;
        c15536m.setWebViewClient(c15498k);
        return c15536m;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC15531j
    /* renamed from: d */
    public void mo76382d() {
    }

    @Override // com.fyber.inneractive.sdk.util.InterfaceC15420K
    /* renamed from: a */
    public final void mo76396a(float f, Rect rect) {
        if (f == this.f30774h && rect.equals(this.f30775i)) {
            return;
        }
        this.f30774h = f;
        this.f30775i.set(rect);
        C15536m c15536m = this.f30768b;
        if (c15536m != null) {
            c15536m.m76366a();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC15531j
    /* renamed from: a */
    public boolean mo76383a(WebView webView, String str) {
        IAlog.m76529a("%shandleUrl called with: %s", IAlog.m76531a(this), str);
        if (this.f30768b == null) {
            IAlog.m76529a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        } else if (AbstractC15452i0.m76501a(str)) {
            this.f30768b.loadUrl("chrome://crash");
            return true;
        } else if (str == null || !str.startsWith("data:")) {
            C15446f0 mo76388g = mo76388g();
            if (mo76392a(str, mo76388g)) {
                return true;
            }
            m76393a(new C15527h(this, str, mo76388g));
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public void mo76369a(boolean z) {
        IAlog.m76529a("%sonWebViewVisibilityChanged called with: %s", IAlog.m76531a(this), Boolean.valueOf(z));
        InterfaceC15534k0 interfaceC15534k0 = this.f30773g;
        if (interfaceC15534k0 != null) {
            interfaceC15534k0.mo76370a(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC15531j
    /* renamed from: a */
    public void mo76385a() {
        InterfaceC15534k0 interfaceC15534k0 = this.f30773g;
        if (interfaceC15534k0 != null) {
            interfaceC15534k0.mo76373a();
        }
        mo76391b(true);
    }

    /* renamed from: a */
    public final void m76393a(InterfaceC15523f interfaceC15523f) {
        IAlog.m76525e("IAWebViewController Web view click detected", new Object[0]);
        if (this.f30776j) {
            IAlog.m76525e("IAWebViewController Native click detected before web view request. Processing click", new Object[0]);
            interfaceC15523f.mo76397d();
            m76386i();
        } else if (this.f30777k) {
            IAlog.m76525e("IAWebViewController Native click was not detected yet. Caching click request and waiting", new Object[0]);
            RunnableC15519d runnableC15519d = this.f30779m;
            if (runnableC15519d != null) {
                AbstractC15465p.f30612b.removeCallbacks(runnableC15519d);
            }
            this.f30778l = interfaceC15523f;
            if (this.f30779m != null) {
                AbstractC15465p.f30612b.postDelayed(this.f30779m, IAConfigManager.f27060O.f27097u.f27275b.m77919a("click_timeout", 1000, 1000));
            }
        } else {
            RunnableC15519d runnableC15519d2 = this.f30779m;
            if (runnableC15519d2 != null) {
                AbstractC15465p.f30612b.removeCallbacks(runnableC15519d2);
            }
            this.f30778l = null;
            interfaceC15523f.mo76397d();
        }
    }
}
