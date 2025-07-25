package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.C14169R;
import com.fyber.inneractive.sdk.config.C14320M;
import com.fyber.inneractive.sdk.config.C14326T;
import com.fyber.inneractive.sdk.config.InterfaceC14327U;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.flow.AbstractC14474A;
import com.fyber.inneractive.sdk.flow.AbstractC14552x;
import com.fyber.inneractive.sdk.flow.C14488O;
import com.fyber.inneractive.sdk.flow.C14525g;
import com.fyber.inneractive.sdk.interfaces.InterfaceC14578d;
import com.fyber.inneractive.sdk.measurement.tracker.AbstractC14597f;
import com.fyber.inneractive.sdk.measurement.tracker.EnumC14596e;
import com.fyber.inneractive.sdk.mraid.EnumC14639F;
import com.fyber.inneractive.sdk.p377ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.p377ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.response.C15387f;
import com.fyber.inneractive.sdk.util.AbstractC15453j;
import com.fyber.inneractive.sdk.util.AbstractC15459m;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.AbstractC15481x;
import com.fyber.inneractive.sdk.util.C15448g0;
import com.fyber.inneractive.sdk.util.C15483z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.InterfaceC15482y;
import com.fyber.inneractive.sdk.web.C15536m;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.ironsource.C20517nb;

/* renamed from: com.fyber.inneractive.sdk.renderers.k */
/* loaded from: classes4.dex */
public final class C15370k extends AbstractC14474A implements InterfaceC14578d, InterfaceC15482y {

    /* renamed from: l */
    public InneractiveAdViewUnitController f30370l;

    /* renamed from: m */
    public IAmraidWebViewController f30371m;

    /* renamed from: n */
    public C15366g f30372n;

    /* renamed from: p */
    public ViewGroup f30374p;

    /* renamed from: q */
    public C15368i f30375q;

    /* renamed from: s */
    public RunnableC15367h f30377s;

    /* renamed from: y */
    public C15363d f30383y;

    /* renamed from: k */
    public long f30369k = 0;

    /* renamed from: o */
    public boolean f30373o = false;

    /* renamed from: r */
    public long f30376r = 0;

    /* renamed from: t */
    public int f30378t = 0;

    /* renamed from: u */
    public long f30379u = 0;

    /* renamed from: v */
    public boolean f30380v = false;

    /* renamed from: w */
    public boolean f30381w = true;

    /* renamed from: x */
    public boolean f30382x = false;

    /* renamed from: G */
    public final void m76654G() {
        if (this.f30377s != null) {
            IAlog.m76529a("%scancelling refreen runnable", IAlog.m76531a(this));
            AbstractC15465p.f30612b.removeCallbacks(this.f30377s);
            this.f30377s = null;
        }
    }

    /* renamed from: H */
    public final void m76653H() {
        C15363d c15363d = this.f30383y;
        if (c15363d != null) {
            c15363d.f30361g = false;
            AbstractC15465p.f30612b.removeCallbacks(c15363d.f30364j);
        }
        if (this.f30371m != null) {
            m76654G();
            AbstractC14552x abstractC14552x = this.f27385b;
            if (abstractC14552x != null) {
                ((C14488O) abstractC14552x).mo77811a();
            }
            this.f30371m = null;
            this.f27385b = null;
            ViewGroup viewGroup = this.f30374p;
            if (viewGroup != null) {
                viewGroup.removeView(this.f30375q);
            }
            C15368i c15368i = this.f30375q;
            if (c15368i != null) {
                c15368i.removeAllViews();
                this.f30375q = null;
            }
        }
        this.f30380v = false;
    }

    /* renamed from: I */
    public final int m76652I() {
        C14320M c14320m;
        int intValue;
        int i = this.f30378t;
        if (i == -1) {
            IAlog.m76529a("%sreturning disable value for banner refresh", IAlog.m76531a(this));
            return 0;
        }
        if (i > 0) {
            IAlog.m76529a("%sreturning overriden refresh interval = %d", IAlog.m76531a(this), Integer.valueOf(this.f30378t));
            intValue = this.f30378t;
        } else {
            InterfaceC14327U interfaceC14327U = this.f27384a.getAdContent().f27575d;
            if (interfaceC14327U != null && (c14320m = ((C14326T) interfaceC14327U).f27122c) != null) {
                Integer num = c14320m.f27110a;
                IAlog.m76529a("%sreturning refreshConfig = %d", IAlog.m76531a(this), num);
                if (num != null) {
                    intValue = num.intValue();
                }
            }
            IAlog.m76529a("%sgetRefreshInterval: returning 0. Refresh is disabled", IAlog.m76531a(this));
            return 0;
        }
        return intValue * 1000;
    }

    /* renamed from: J */
    public final void m76651J() {
        InneractiveAdViewUnitController inneractiveAdViewUnitController;
        IAmraidWebViewController iAmraidWebViewController = this.f30371m;
        if (iAmraidWebViewController != null && iAmraidWebViewController.f30768b != null) {
            IAlog.m76529a("%srefreshing ad", IAlog.m76531a(this));
            if ((!this.f30371m.m76418p() || this.f30371m.f30643N == EnumC14639F.RESIZED) && (inneractiveAdViewUnitController = this.f30370l) != null) {
                this.f30376r = 0L;
                inneractiveAdViewUnitController.refreshAd();
            }
        }
    }

    /* renamed from: K */
    public final void m76650K() {
        C15536m c15536m;
        IAmraidWebViewController iAmraidWebViewController = this.f30371m;
        if (iAmraidWebViewController != null && (c15536m = iAmraidWebViewController.f30768b) != null && c15536m.getIsVisible() && this.f30376r != 0 && !this.f30371m.m76418p() && this.f30371m.f30643N != EnumC14639F.RESIZED) {
            if (!this.f30381w) {
                if (this.f30369k < System.currentTimeMillis() - this.f30376r) {
                    this.f30379u = 1L;
                } else {
                    this.f30379u = this.f30369k - (System.currentTimeMillis() - this.f30376r);
                }
            }
            IAlog.m76529a("%sresuming refresh runnable mRefreshTimeStamp %d", IAlog.m76531a(this), Long.valueOf(this.f30379u));
            m76648a(false, this.f30379u);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14578d
    /* renamed from: a */
    public final boolean mo76641a(AbstractC14552x abstractC14552x) {
        return abstractC14552x instanceof C14488O;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14578d
    /* renamed from: b */
    public final boolean mo76640b(View view) {
        return view.equals(this.f30374p);
    }

    /* renamed from: c */
    public final void m76647c(boolean z) {
        if (this.f30377s != null) {
            this.f30381w = z;
            m76654G();
            this.f30379u = this.f30369k - (System.currentTimeMillis() - this.f30376r);
            IAlog.m76529a("%sPause refresh time : time remaning:%d ,refreshInterval: %d", IAlog.m76531a(this), Long.valueOf(this.f30379u), Long.valueOf(this.f30369k));
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14474A, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final boolean canRefreshAd() {
        IAmraidWebViewController iAmraidWebViewController = this.f30371m;
        if (iAmraidWebViewController != null) {
            if (iAmraidWebViewController.m76418p() || this.f30371m.f30643N == EnumC14639F.RESIZED) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14578d
    /* renamed from: d */
    public final int mo76639d() {
        return this.f30371m.f30659d0;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14474A, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        m76654G();
        m76653H();
        this.f30372n = null;
        AbstractC15481x.f30630a.f30631a.remove(this);
        RunnableC15367h runnableC15367h = this.f30377s;
        if (runnableC15367h != null) {
            AbstractC15465p.f30612b.removeCallbacks(runnableC15367h);
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14474A
    /* renamed from: e */
    public final void mo76628e(View view) {
        AbstractC14597f abstractC14597f;
        IAmraidWebViewController iAmraidWebViewController = this.f30371m;
        if (iAmraidWebViewController != null && (abstractC14597f = iAmraidWebViewController.f30796I) != null) {
            try {
                AdSession adSession = abstractC14597f.f27646a;
                if (adSession != null && view != null) {
                    adSession.removeFriendlyObstruction(view);
                }
            } catch (Throwable th) {
                abstractC14597f.m77777a(th);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14578d
    /* renamed from: n */
    public final int mo76637n() {
        return this.f30371m.f30660e0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14578d
    /* renamed from: p */
    public final void mo76636p() {
        C15536m c15536m;
        IAlog.m76529a("%sgot onAdRefreshFailed", IAlog.m76531a(this));
        IAmraidWebViewController iAmraidWebViewController = this.f30371m;
        if (iAmraidWebViewController != null && (c15536m = iAmraidWebViewController.f30768b) != null) {
            if (c15536m.getIsVisible() && !AbstractC15481x.f30630a.f30632b && !this.f30371m.m76418p() && this.f30371m.f30643N != EnumC14639F.RESIZED) {
                IAlog.m76529a("%sview is visible and screen is unlocked: refreshing ad and webView is not expanded", IAlog.m76531a(this));
                long m76652I = m76652I();
                this.f30369k = m76652I;
                if (m76652I != 0) {
                    m76648a(false, 10000L);
                    return;
                }
                return;
            }
            IAlog.m76529a("%sview is not visible or screen is locked or webView is Expanded or web is Resised. Waiting for visibility change", IAlog.m76531a(this));
            this.f30379u = 1L;
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14578d
    /* renamed from: s */
    public final void mo76634s() {
        C15363d c15363d = this.f30383y;
        if (c15363d != null) {
            c15363d.f30361g = false;
            AbstractC15465p.f30612b.removeCallbacks(c15363d.f30364j);
        }
        C15368i c15368i = this.f30375q;
        if (c15368i != null) {
            c15368i.removeAllViews();
            this.f30375q = null;
        }
        ViewGroup viewGroup = this.f30374p;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f30374p = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14474A
    /* renamed from: x */
    public final View mo76633x() {
        IAmraidWebViewController iAmraidWebViewController = this.f30371m;
        if (iAmraidWebViewController != null) {
            return iAmraidWebViewController.f30768b;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14474A
    /* renamed from: y */
    public final int mo76646y() {
        IAmraidWebViewController iAmraidWebViewController = this.f30371m;
        if (iAmraidWebViewController != null) {
            if (iAmraidWebViewController.f30768b != null && iAmraidWebViewController.m76418p()) {
                return AbstractC15459m.m76482b(this.f30371m.f30768b.getHeight());
            }
            return AbstractC15459m.m76482b(this.f30371m.f30660e0);
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14474A
    /* renamed from: z */
    public final int mo76645z() {
        IAmraidWebViewController iAmraidWebViewController = this.f30371m;
        if (iAmraidWebViewController != null) {
            if (iAmraidWebViewController.f30768b != null && iAmraidWebViewController.m76418p()) {
                return AbstractC15459m.m76482b(this.f30371m.f30768b.getWidth());
            }
            return AbstractC15459m.m76482b(this.f30371m.f30659d0);
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14578d
    /* renamed from: a */
    public final void mo76642a(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        C15368i c15368i;
        C14320M c14320m;
        UnitDisplayType unitDisplayType;
        InneractiveAdSpot inneractiveAdSpot = this.f27384a;
        if (inneractiveAdSpot == null) {
            IAlog.m76524f("%sYou must set the spot to render before calling renderAd", IAlog.m76531a(this));
            return;
        }
        this.f30373o = false;
        this.f27388e = false;
        if (viewGroup != null) {
            this.f30374p = viewGroup;
            this.f30370l = (InneractiveAdViewUnitController) inneractiveAdSpot.getSelectedUnitController();
        } else if (!this.f30382x) {
            m76653H();
            if (this.f27384a.getAdContent() instanceof C14488O) {
                this.f27385b = (C14488O) this.f27384a.getAdContent();
            } else {
                IAlog.m76524f("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.f27384a.getAdContent());
                return;
            }
        }
        AbstractC14552x abstractC14552x = this.f27385b;
        IAmraidWebViewController iAmraidWebViewController = abstractC14552x != null ? ((C14488O) abstractC14552x).f27430i : null;
        this.f30371m = iAmraidWebViewController;
        if (iAmraidWebViewController != null) {
            if (this.f30372n == null) {
                this.f30372n = new C15366g(this);
            }
            iAmraidWebViewController.setListener(this.f30372n);
            C14488O c14488o = (C14488O) this.f27385b;
            InneractiveAdRequest inneractiveAdRequest = c14488o.f27572a;
            InterfaceC14327U interfaceC14327U = c14488o.f27575d;
            if (interfaceC14327U != null && (c14320m = ((C14326T) interfaceC14327U).f27122c) != null && (unitDisplayType = c14320m.f27111b) != null && unitDisplayType.isFullscreenUnit()) {
                C15368i c15368i2 = new C15368i(this.f30374p.getContext(), 1.5f);
                this.f30375q = c15368i2;
                this.f30371m.m76395a(c15368i2, new ViewGroup.LayoutParams(-1, -1));
                this.f30374p.addView(this.f30375q, new ViewGroup.LayoutParams(-2, -2));
            } else {
                this.f30375q = new C15368i(this.f30374p.getContext(), 0.0f);
                C14488O c14488o2 = (C14488O) this.f27385b;
                C15387f c15387f = (C15387f) c14488o2.f27573b;
                C15448g0 m76649a = m76649a(c15387f.f30461e, c15387f.f30462f, c14488o2.f27575d);
                this.f30371m.setAdDefaultSize(m76649a.f30598a, m76649a.f30599b);
                IAmraidWebViewController iAmraidWebViewController2 = this.f30371m;
                C15536m c15536m = iAmraidWebViewController2.f30768b;
                if (c15536m == null && AbstractC15459m.f30607a != null) {
                    if (!this.f30382x) {
                        this.f30382x = true;
                        iAmraidWebViewController2.f30768b = iAmraidWebViewController2.m76394a(((C14488O) this.f27385b).f27574c);
                        try {
                            iAmraidWebViewController2.mo76387h();
                            iAmraidWebViewController2.f30768b.loadDataWithBaseURL(iAmraidWebViewController2.f30782p, iAmraidWebViewController2.f30783q, "text/html", C20517nb.f52167N, null);
                        } catch (Throwable unused) {
                            FrameLayout frameLayout = new FrameLayout(this.f30374p.getContext());
                            frameLayout.setBackgroundResource(C14169R.C14170color.ia_blank_background);
                            this.f30374p.removeAllViews();
                            this.f30374p.addView(frameLayout, new FrameLayout.LayoutParams(m76649a.f30598a, m76649a.f30599b, 17));
                        }
                    } else {
                        FrameLayout frameLayout2 = new FrameLayout(this.f30374p.getContext());
                        frameLayout2.setBackgroundResource(C14169R.C14170color.ia_blank_background);
                        this.f30374p.removeAllViews();
                        this.f30374p.addView(frameLayout2, new FrameLayout.LayoutParams(m76649a.f30598a, m76649a.f30599b, 17));
                    }
                } else {
                    ViewParent parent = c15536m != null ? c15536m.getParent() : null;
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(c15536m);
                    }
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(m76649a.f30598a, m76649a.f30599b);
                    layoutParams.addRule(new int[]{13}[0]);
                    this.f30371m.m76395a(this.f30375q, layoutParams);
                    this.f30374p.addView(this.f30375q);
                    C15368i c15368i3 = this.f30375q;
                    ViewGroup.LayoutParams layoutParams2 = c15368i3.getLayoutParams();
                    layoutParams2.width = -2;
                    layoutParams2.height = -2;
                    c15368i3.setLayoutParams(layoutParams2);
                    InneractiveAdSpot inneractiveAdSpot2 = this.f27384a;
                    if (inneractiveAdSpot2 != null && inneractiveAdSpot2.getAdContent() != null && (viewGroup2 = this.f30374p) != null) {
                        Context context = viewGroup2.getContext();
                        C14525g c14525g = new C14525g(context, false, this.f27384a.getAdContent().f27572a, this.f27384a.getAdContent().mo77807c(), this.f27384a.getAdContent().f27574c);
                        ViewGroup viewGroup4 = (ViewGroup) LayoutInflater.from(context).inflate(C14169R.C14173layout.ia_layout_fyber_ad_identifier_relative, this.f30374p, false);
                        IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
                        IFyberAdIdentifier iFyberAdIdentifier = c14525g.f27514d;
                        iFyberAdIdentifier.f30537k = corner;
                        iFyberAdIdentifier.mo76541a(viewGroup4);
                        viewGroup4.setVisibility(0);
                        IAmraidWebViewController iAmraidWebViewController3 = this.f30371m;
                        if (iAmraidWebViewController3 == null) {
                            viewGroup3 = null;
                        } else {
                            viewGroup3 = iAmraidWebViewController3.f30768b;
                            if (viewGroup3 != null && viewGroup3.getParent() != null) {
                                viewGroup3 = (ViewGroup) viewGroup3.getParent();
                            }
                        }
                        if (viewGroup3 != null && mo76633x() != null) {
                            ViewGroup.LayoutParams layoutParams3 = mo76633x().getLayoutParams();
                            IAmraidWebViewController iAmraidWebViewController4 = this.f30371m;
                            viewGroup3.addView(viewGroup4, layoutParams3);
                            iAmraidWebViewController4.m76428a(viewGroup4, EnumC14596e.IdentifierView);
                        }
                    }
                }
            }
            AbstractC14552x abstractC14552x2 = this.f27385b;
            C15387f c15387f2 = abstractC14552x2 != null ? (C15387f) ((C14488O) abstractC14552x2).f27573b : null;
            if (c15387f2 != null && (c15368i = this.f30375q) != null) {
                C15363d c15363d = new C15363d(c15387f2, c15368i, new C15365f(this));
                this.f30383y = c15363d;
                c15363d.f30362h = false;
                c15363d.f30358d = 1;
                c15363d.f30359e = 0.0f;
                int i = c15387f2.f30478v;
                if (i >= 1) {
                    c15363d.f30358d = Math.min(i, 100);
                }
                float f = c15387f2.f30479w;
                if (f >= -1.0f) {
                    c15363d.f30359e = f;
                }
                if (c15363d.f30359e >= 0.0f) {
                    IAlog.m76529a("IAVisibilityTracker: startTrackingVisibility", new Object[0]);
                    c15363d.f30357c = 0.0f;
                    c15363d.f30360f = System.currentTimeMillis();
                    c15363d.f30361g = true;
                    c15363d.m76655a();
                }
            }
        } else {
            IAlog.m76524f("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", abstractC14552x);
        }
        C15483z c15483z = AbstractC15481x.f30630a;
        if (c15483z.f30631a.contains(this)) {
            return;
        }
        c15483z.f30631a.add(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14474A
    /* renamed from: d */
    public final void mo76629d(View view) {
        IAmraidWebViewController iAmraidWebViewController = this.f30371m;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.m76428a(view, EnumC14596e.ProgressOverlay);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14578d
    /* renamed from: l */
    public final void mo76638l() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14578d
    /* renamed from: q */
    public final void mo76635q() {
    }

    /* renamed from: a */
    public final void m76648a(boolean z, long j) {
        IAmraidWebViewController iAmraidWebViewController;
        C15536m c15536m;
        if (!TextUtils.isEmpty(this.f27384a.getMediationNameString()) || j == 0 || (this.f27384a.getSelectedUnitController() instanceof InneractiveFullscreenUnitController) || this.f30378t == -1 || (iAmraidWebViewController = this.f30371m) == null || (c15536m = iAmraidWebViewController.f30768b) == null) {
            return;
        }
        if (!c15536m.getIsVisible()) {
            IAlog.m76529a("%sstartRefreshTimer called but ad is not visible", IAlog.m76531a(this));
            return;
        }
        this.f30376r = System.currentTimeMillis();
        this.f30369k = z ? this.f30369k : j;
        IAlog.m76529a("%sstartRefreshTimer in %d msec, mRefreshInterval = %d", IAlog.m76531a(this), Long.valueOf(j), Long.valueOf(this.f30369k));
        if (j > 1) {
            RunnableC15367h runnableC15367h = this.f30377s;
            if (runnableC15367h != null) {
                AbstractC15465p.f30612b.removeCallbacks(runnableC15367h);
            }
            m76654G();
            RunnableC15367h runnableC15367h2 = new RunnableC15367h(this);
            this.f30377s = runnableC15367h2;
            AbstractC15465p.f30612b.postDelayed(runnableC15367h2, j);
            return;
        }
        m76651J();
    }

    /* renamed from: a */
    public static C15448g0 m76649a(int i, int i2, InterfaceC14327U interfaceC14327U) {
        int m76492a;
        int m76492a2;
        C14320M c14320m;
        IAlog.m76529a("View layout params: response width and height: %d, %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i > 0 && i2 > 0) {
            m76492a = AbstractC15459m.m76492a(i);
            m76492a2 = AbstractC15459m.m76492a(i2);
        } else {
            UnitDisplayType unitDisplayType = UnitDisplayType.BANNER;
            if (interfaceC14327U != null && (c14320m = ((C14326T) interfaceC14327U).f27122c) != null) {
                unitDisplayType = c14320m.f27111b;
            }
            if (unitDisplayType.equals(UnitDisplayType.MRECT)) {
                m76492a = AbstractC15459m.m76492a(EnumC15369j.RECTANGLE_WIDTH.value);
                m76492a2 = AbstractC15459m.m76492a(EnumC15369j.RECTANGLE_HEIGHT.value);
            } else if (AbstractC15453j.m76496n()) {
                m76492a = AbstractC15459m.m76492a(EnumC15369j.BANNER_TABLET_WIDTH.value);
                m76492a2 = AbstractC15459m.m76492a(EnumC15369j.BANNER_TABLET_HEIGHT.value);
            } else {
                m76492a = AbstractC15459m.m76492a(EnumC15369j.BANNER_WIDTH.value);
                m76492a2 = AbstractC15459m.m76492a(EnumC15369j.BANNER_HEIGHT.value);
            }
        }
        IAlog.m76525e("View layout params: final scaled width and height: %d, %d", Integer.valueOf(m76492a), Integer.valueOf(m76492a2));
        return new C15448g0(m76492a, m76492a2);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14578d
    /* renamed from: a */
    public final void mo76643a(int i) {
        this.f30378t = i;
    }
}
