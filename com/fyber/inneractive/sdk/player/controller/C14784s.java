package com.fyber.inneractive.sdk.player.controller;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.C14326T;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.display.AbstractC14419a;
import com.fyber.inneractive.sdk.display.C14420b;
import com.fyber.inneractive.sdk.display.C14421c;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.model.vast.EnumC14630w;
import com.fyber.inneractive.sdk.p374dv.AbstractC14422a;
import com.fyber.inneractive.sdk.player.AbstractC15152f;
import com.fyber.inneractive.sdk.player.C15176n;
import com.fyber.inneractive.sdk.player.enums.EnumC14795b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.p376ui.AbstractC15210t;
import com.fyber.inneractive.sdk.player.p376ui.C15191i;
import com.fyber.inneractive.sdk.renderers.C15373n;
import com.fyber.inneractive.sdk.renderers.C15374o;
import com.fyber.inneractive.sdk.util.C15446f0;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.controller.s */
/* loaded from: classes4.dex */
public final class C14784s extends AbstractC14791z {

    /* renamed from: A */
    public float f28046A;

    /* renamed from: B */
    public boolean f28047B;

    /* renamed from: C */
    public boolean f28048C;

    /* renamed from: D */
    public boolean f28049D;

    /* renamed from: y */
    public RunnableC14783r f28050y;

    /* renamed from: z */
    public final float f28051z;

    public C14784s(AbstractC15152f abstractC15152f, C15191i c15191i, C14326T c14326t, C14388r c14388r, boolean z, String str) {
        super(abstractC15152f, c15191i, c14326t, c14388r, z, str);
        this.f28046A = 0.0f;
        this.f28047B = false;
        this.f28048C = false;
        this.f28049D = false;
        this.f28051z = ((C14326T) this.f28060b).f27126g.f27139b.intValue() / 100.0f;
        m77611B();
    }

    /* renamed from: A */
    public final void m77612A() {
        if (this.f28050y != null) {
            IAlog.m76529a("%sCancelling play runnable", IAlog.m76531a(this));
            this.f28062d.removeCallbacks(this.f28050y);
            this.f28050y = null;
        }
    }

    /* renamed from: B */
    public final void m77611B() {
        AbstractC14782q abstractC14782q;
        AbstractC15152f abstractC15152f = this.f28059a;
        if (abstractC15152f != null && (abstractC14782q = abstractC15152f.f29933a) != null && !abstractC14782q.f28043n) {
            if (((C14326T) this.f28060b).f27125f.f27130d.booleanValue()) {
                this.f28059a.f29933a.mo77624b(false);
            } else if (!m77583m()) {
                this.f28059a.f29933a.mo77620d(false);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC14791z, com.fyber.inneractive.sdk.player.p376ui.InterfaceC15196n
    /* renamed from: a */
    public final void mo77083a(boolean z) {
        if (z) {
            m77610a(this.f28046A);
        }
        super.mo77083a(z);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC14791z, com.fyber.inneractive.sdk.player.controller.InterfaceC14767b
    /* renamed from: b */
    public final boolean mo77598b() {
        return true;
    }

    /* renamed from: c */
    public final void m77609c(int i) {
        AbstractC14782q abstractC14782q;
        AbstractC15152f abstractC15152f = this.f28059a;
        if (abstractC15152f != null && (abstractC14782q = abstractC15152f.f29933a) != null && abstractC14782q.f28034e != EnumC14795b.Playing && this.f28050y == null) {
            IAlog.m76529a("%splayVideo %s", IAlog.m76531a(this), this.f28062d);
            if (i == 0) {
                mo77589g(false);
                return;
            }
            RunnableC14783r runnableC14783r = new RunnableC14783r(this);
            this.f28050y = runnableC14783r;
            this.f28062d.postDelayed(runnableC14783r, i);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC14791z, com.fyber.inneractive.sdk.player.controller.InterfaceC14767b
    public final void destroy() {
        m77612A();
        this.f28065g = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC14791z
    /* renamed from: e */
    public final void mo77594e() {
        super.mo77594e();
        AbstractC15152f abstractC15152f = this.f28059a;
        if (abstractC15152f != null && abstractC15152f.f29933a != null) {
            IAlog.m76529a("%sconnectToTextureView playing state = %s", IAlog.m76531a(this), this.f28059a.f29933a.f28034e);
            if (this.f28059a.f29933a.mo77616h()) {
                this.f28062d.mo77057e(true ^ this.f28059a.f29939g);
                m77611B();
            }
        }
        m77610a(this.f28046A);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC14791z
    /* renamed from: f */
    public final void mo77592f() {
        m77612A();
        super.mo77592f();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC14791z
    /* renamed from: g */
    public final void mo77589g(boolean z) {
        AbstractC15152f abstractC15152f = this.f28059a;
        if (abstractC15152f != null && abstractC15152f.f29933a != null) {
            m77611B();
            super.mo77589g(false);
        }
    }

    /* renamed from: h */
    public final void m77608h(boolean z) {
        AbstractC15152f abstractC15152f;
        AbstractC14782q abstractC14782q;
        this.f28048C = z;
        if (!z || (abstractC15152f = this.f28059a) == null || (abstractC14782q = abstractC15152f.f29933a) == null || abstractC14782q.f28039j != null || !this.f28062d.f30047e || abstractC14782q.f28034e == EnumC14795b.Completed) {
            return;
        }
        mo77594e();
        m77610a(this.f28046A);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC14791z
    /* renamed from: l */
    public final int mo77584l() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC14791z
    /* renamed from: n */
    public final void mo77582n() {
        IAlog.m76529a("%s onBufferingTimeout reached. Skipping to end card", IAlog.m76531a(this));
        if (this.f28062d.f30047e) {
            this.f28076r = true;
            m77591f(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC14791z
    /* renamed from: o */
    public final void mo77581o() {
        m77607y();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC14791z
    /* renamed from: p */
    public final void mo77580p() {
        super.mo77580p();
        m77612A();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC14791z
    /* renamed from: q */
    public final void mo77579q() {
        AbstractC15152f abstractC15152f = this.f28059a;
        if (abstractC15152f != null && abstractC15152f.f29933a != null) {
            mo77594e();
            mo77589g(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC14791z
    /* renamed from: r */
    public final void mo77578r() {
        m77606z();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC14791z
    /* renamed from: s */
    public final void mo77577s() {
        super.mo77577s();
        if (((C14326T) this.f28060b).f27125f.f27135i != TapAction.FULLSCREEN) {
            this.f28062d.mo77046n();
        }
        m77573w();
        this.f28047B = true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC14791z
    /* renamed from: u */
    public final void mo77575u() {
        m77612A();
        super.mo77575u();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC14791z
    /* renamed from: v */
    public final boolean mo77574v() {
        return false;
    }

    /* renamed from: y */
    public final void m77607y() {
        AbstractC14419a c14421c;
        if (this.f28065g != null && !this.f28049D) {
            m77612A();
            super.mo77592f();
            C15373n c15373n = (C15373n) ((InterfaceC14760A) this.f28065g);
            C15374o c15374o = c15373n.f30386a;
            InneractiveUnitController.EventsListener eventsListener = c15374o.f27386c;
            if (eventsListener != null) {
                ((InneractiveAdViewEventsListener) eventsListener).onAdExpanded(c15374o.f27384a);
            }
            ViewGroup viewGroup = c15373n.f30386a.f30392p;
            if (viewGroup != null && viewGroup.getContext() != null) {
                C15374o c15374o2 = c15373n.f30386a;
                if (c15374o2.f27385b instanceof AbstractC14422a) {
                    c14421c = new C14420b();
                } else {
                    c14421c = new C14421c();
                }
                if (c14421c instanceof C14421c) {
                    C14421c c14421c2 = (C14421c) c14421c;
                    Context context = c15374o2.f30392p.getContext();
                    InneractiveAdSpot inneractiveAdSpot = c15373n.f30386a.f27384a;
                    Intent intent = new Intent(context, InneractiveFullscreenAdActivity.class);
                    intent.putExtra("spotId", inneractiveAdSpot.getLocalUniqueId());
                    if (!(context instanceof Activity)) {
                        intent.setFlags(268435456);
                    }
                    try {
                        IAlog.m76529a("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.m76531a(context), inneractiveAdSpot.getLocalUniqueId());
                        context.startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                        IAlog.m76527c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.m76531a(context));
                    }
                }
            }
            IAlog.m76529a("%sopening fullscreen", IAlog.m76531a(this));
            this.f28049D = true;
            AbstractC15152f abstractC15152f = this.f28059a;
            if (abstractC15152f != null) {
                C15176n c15176n = (C15176n) abstractC15152f;
                c15176n.mo77102a(c15176n.f29995p, VideoClickOrigin.InvalidOrigin, EnumC14630w.EVENT_FULLSCREEN, EnumC14630w.EVENT_EXPAND);
            }
        }
    }

    /* renamed from: z */
    public final void m77606z() {
        AbstractC15152f abstractC15152f;
        AbstractC14782q abstractC14782q;
        AbstractC15210t abstractC15210t;
        if (this.f28046A >= this.f28051z && (abstractC15152f = this.f28059a) != null && (abstractC14782q = abstractC15152f.f29933a) != null && abstractC14782q.f28034e != EnumC14795b.Completed && (abstractC15210t = this.f28062d) != null && !abstractC15210t.m77052h() && this.f28059a.f29933a.f28039j != null) {
            if (((C14326T) this.f28060b).f27125f.f27127a.booleanValue() || this.f28047B) {
                m77609c(IAConfigManager.f27060O.f27085i.f27104a);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC14791z, com.fyber.inneractive.sdk.player.controller.InterfaceC14767b
    /* renamed from: b */
    public final void mo77596b(boolean z) {
        AbstractC14782q abstractC14782q;
        AbstractC15152f abstractC15152f = this.f28059a;
        if (abstractC15152f != null && (abstractC14782q = abstractC15152f.f29933a) != null && abstractC14782q.f28034e != EnumC14795b.Completed) {
            if (((C14326T) this.f28060b).f27125f.f27135i != TapAction.FULLSCREEN) {
                this.f28062d.mo77046n();
            }
            m77573w();
        }
        super.mo77596b(z);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC14791z
    /* renamed from: a */
    public final void mo77601a(C15446f0 c15446f0) {
        AbstractC14782q abstractC14782q;
        TapAction tapAction = ((C14326T) this.f28060b).f27125f.f27135i;
        AbstractC15152f abstractC15152f = this.f28059a;
        if (abstractC15152f == null || abstractC15152f.f29933a == null || this.f28046A >= this.f28051z) {
            if (tapAction == TapAction.CTR) {
                m77599a(false, VideoClickOrigin.CTA, c15446f0);
            } else if (tapAction == TapAction.FULLSCREEN) {
                m77607y();
            } else if (tapAction != TapAction.DO_NOTHING) {
                IAlog.m76529a("%sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.m76531a(this), tapAction);
            } else if (abstractC15152f == null || (abstractC14782q = abstractC15152f.f29933a) == null) {
            } else {
                EnumC14795b enumC14795b = abstractC14782q.f28034e;
                if (enumC14795b != EnumC14795b.Completed && enumC14795b != EnumC14795b.Prepared) {
                    abstractC14782q.mo77614j();
                } else {
                    abstractC14782q.mo77632a(1, true);
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC14791z
    /* renamed from: h */
    public final int mo77588h() {
        return IAConfigManager.f27060O.f27097u.f27275b.m77919a("VideoAdBufferingTimeout", 5, 1) * 1000;
    }

    /* renamed from: a */
    public final void m77610a(float f) {
        AbstractC14782q abstractC14782q;
        this.f28046A = f;
        if (IAlog.f30554a >= 3) {
            IAlog.m76527c("%sonVisibilityChanged called with: %s vfpl = %s vfpa = %s", IAlog.m76531a(this), Float.valueOf(f), Float.valueOf(this.f28051z), Float.valueOf(1.0f - this.f28051z));
        }
        AbstractC15152f abstractC15152f = this.f28059a;
        if (abstractC15152f == null || (abstractC14782q = abstractC15152f.f29933a) == null) {
            return;
        }
        if (abstractC14782q.f28034e == EnumC14795b.Playing) {
            if (f <= this.f28051z) {
                IAlog.m76525e("%sonVisibilityChanged pausing player", IAlog.m76531a(this));
                if (this.f28059a.f29933a.f28039j != null) {
                    this.f28047B = false;
                    m77612A();
                    super.mo77575u();
                    m77593e(false);
                    return;
                }
                return;
            }
            return;
        }
        m77606z();
    }
}
