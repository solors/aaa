package com.fyber.inneractive.sdk.player.p376ui;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.C14326T;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.config.global.features.C14357d;
import com.fyber.inneractive.sdk.flow.C14525g;
import com.fyber.inneractive.sdk.flow.endcard.AbstractC14501b;
import com.fyber.inneractive.sdk.model.vast.C14608a;
import com.fyber.inneractive.sdk.model.vast.EnumC14616i;
import com.fyber.inneractive.sdk.util.C15446f0;
import com.fyber.inneractive.sdk.util.C15448g0;
import com.fyber.inneractive.sdk.util.C15478v0;
import com.fyber.inneractive.sdk.util.HandlerC15474t0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.player.ui.l */
/* loaded from: classes4.dex */
public abstract class AbstractC15194l extends AbstractC15210t {

    /* renamed from: K */
    public static final C15446f0 f30058K;

    /* renamed from: A */
    public final InterfaceC15183a f30059A;

    /* renamed from: B */
    public final LayoutInflater f30060B;

    /* renamed from: C */
    public final C14525g f30061C;

    /* renamed from: D */
    public boolean f30062D;

    /* renamed from: E */
    public C15478v0 f30063E;

    /* renamed from: F */
    public RunnableC15193k f30064F;

    /* renamed from: G */
    public int f30065G;

    /* renamed from: H */
    public int f30066H;

    /* renamed from: I */
    public View f30067I;

    /* renamed from: J */
    public boolean f30068J;

    static {
        C15446f0 c15446f0 = new C15446f0();
        c15446f0.f30597c = true;
        f30058K = c15446f0;
    }

    public AbstractC15194l(Context context, C14525g c14525g, InterfaceC15183a interfaceC15183a, C14388r c14388r, String str) {
        super(context, c14388r, str);
        this.f30062D = false;
        this.f30068J = true;
        this.f30061C = c14525g;
        this.f30060B = LayoutInflater.from(context);
        this.f30059A = interfaceC15183a;
    }

    /* renamed from: a */
    public abstract void mo77078a(int i);

    @Override // com.fyber.inneractive.sdk.player.p376ui.AbstractC15210t
    /* renamed from: a */
    public final void mo77069a(AbstractC14501b abstractC14501b, C15184b c15184b) {
        Integer num;
        this.f30067I = c15184b.f30019e;
        ViewGroup viewGroup = this.f30130r;
        if (viewGroup != null) {
            abstractC14501b.mo77850a(viewGroup, c15184b);
            m77067a(c15184b);
            EnumC14616i enumC14616i = c15184b.f30020f;
            EnumC14616i enumC14616i2 = EnumC14616i.Static;
            if (enumC14616i2 == enumC14616i) {
                m77070a(getEndCardView(), 4);
            }
            if ((enumC14616i2 == enumC14616i || enumC14616i == EnumC14616i.FMP_End_Card) && (num = c15184b.f30018d) != null) {
                int i = enumC14616i != enumC14616i2 ? 8 : 4;
                int intValue = num.intValue();
                if (this.f30062D || this.f30063E != null) {
                    return;
                }
                IAlog.m76529a("Start Autoclick timer - %d seconds", num);
                C15478v0 c15478v0 = new C15478v0(TimeUnit.SECONDS, intValue);
                this.f30063E = c15478v0;
                c15478v0.f30627e = new C15192j(this, i);
                HandlerC15474t0 handlerC15474t0 = new HandlerC15474t0(c15478v0);
                c15478v0.f30625c = handlerC15474t0;
                c15478v0.f30626d = false;
                handlerC15474t0.sendEmptyMessage(1932593528);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p376ui.AbstractC15210t
    /* renamed from: e */
    public final void mo77058e() {
        m77085p();
        this.f30062D = true;
    }

    @Override // com.fyber.inneractive.sdk.player.p376ui.AbstractC15210t
    public View getEndCardView() {
        return this.f30067I;
    }

    public String getLocalizedCtaButtonText() {
        C14357d c14357d;
        C14388r c14388r = this.f30134v;
        if (c14388r != null) {
            c14357d = (C14357d) c14388r.m77927a(C14357d.class);
        } else {
            c14357d = null;
        }
        if (c14357d == null) {
            return null;
        }
        c14357d.m77955d(IAConfigManager.f27060O.f27091o);
        C14608a c14608a = c14357d.f27197e;
        if (c14608a == null || !c14608a.f27687d) {
            return null;
        }
        return c14608a.f27684a;
    }

    @Override // com.fyber.inneractive.sdk.player.p376ui.AbstractC15210t
    public int getMaxTickFactor() {
        return 1000;
    }

    public int getSingleTickTime() {
        return 1000 / getTickFraction();
    }

    public int getTickFraction() {
        return 5;
    }

    @Override // com.fyber.inneractive.sdk.player.p376ui.AbstractC15210t
    /* renamed from: j */
    public final void mo77050j() {
        if (this.f30063E != null) {
            IAlog.m76529a("Autoclick paused", new Object[0]);
            C15478v0 c15478v0 = this.f30063E;
            c15478v0.f30626d = true;
            HandlerC15474t0 handlerC15474t0 = c15478v0.f30625c;
            if (handlerC15474t0 != null) {
                handlerC15474t0.removeMessages(1932593528);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p376ui.AbstractC15210t
    /* renamed from: k */
    public final void mo77049k() {
        if (this.f30063E != null) {
            IAlog.m76529a("Autoclick resumed", new Object[0]);
            C15478v0 c15478v0 = this.f30063E;
            c15478v0.f30626d = false;
            c15478v0.m76450a(SystemClock.uptimeMillis());
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p376ui.AbstractC15210t
    /* renamed from: o */
    public final void mo77045o() {
        this.f30132t = this.f30059A.mo77089a(this.f30046d, this.f30126n, this.f30127o, this.f30131s, this.f30044b, this.f30124l);
    }

    /* renamed from: p */
    public final void m77085p() {
        if (this.f30063E != null) {
            IAlog.m76529a("Autoclick is removed ", new Object[0]);
            this.f30063E.f30627e = null;
            this.f30063E = null;
        }
    }

    public void setEndCardView(View view) {
        this.f30067I = view;
    }

    @Override // com.fyber.inneractive.sdk.player.p376ui.AbstractC15187e
    /* renamed from: a */
    public final void mo77086a(C15448g0 c15448g0, int i, int i2) {
        this.f30059A.mo77088a(this.f30046d, this.f30126n, this.f30127o, this.f30128p, c15448g0, i, i2, this.f30044b, ((C14326T) this.f30045c).f27125f.f27132f.intValue());
    }

    @Override // com.fyber.inneractive.sdk.player.p376ui.AbstractC15187e, android.view.View
    public final void onWindowFocusChanged(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.p376ui.AbstractC15210t
    /* renamed from: a */
    public void mo77071a(int i, int i2) {
        Runnable runnable = this.f30064F;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f30064F = null;
        }
        this.f30066H = getMaxTickFactor() + i2;
        int maxTickFactor = (getMaxTickFactor() / getTickFractions()) + i2;
        int i3 = this.f30066H;
        if (i3 <= 0 || i3 > i) {
            return;
        }
        int i4 = this.f30065G;
        if (maxTickFactor < i4 && i4 > 0) {
            mo77078a(i3);
            return;
        }
        this.f30065G = maxTickFactor;
        mo77078a(maxTickFactor);
        RunnableC15193k runnableC15193k = new RunnableC15193k(this);
        this.f30064F = runnableC15193k;
        postDelayed(runnableC15193k, this.f30123k);
    }
}
