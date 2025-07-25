package com.fyber.inneractive.sdk.flow;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.interfaces.InterfaceC14579e;
import com.fyber.inneractive.sdk.interfaces.InterfaceC14580f;
import com.fyber.inneractive.sdk.network.C14740w;
import com.fyber.inneractive.sdk.network.EnumC14738u;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.C15435a;
import com.fyber.inneractive.sdk.util.C15478v0;
import com.fyber.inneractive.sdk.util.HandlerC15474t0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.N */
/* loaded from: classes4.dex */
public abstract class AbstractC14487N extends AbstractC14474A implements InterfaceC14580f {

    /* renamed from: k */
    public InterfaceC14579e f27418k;

    /* renamed from: l */
    public Runnable f27419l;

    /* renamed from: m */
    public C15478v0 f27420m;

    /* renamed from: n */
    public Runnable f27421n;

    /* renamed from: o */
    public C15478v0 f27422o;

    /* renamed from: r */
    public long f27425r;

    /* renamed from: v */
    public CountDownTimerC14484K f27429v;

    /* renamed from: p */
    public boolean f27423p = false;

    /* renamed from: q */
    public boolean f27424q = false;

    /* renamed from: s */
    public boolean f27426s = false;

    /* renamed from: t */
    public boolean f27427t = false;

    /* renamed from: u */
    public final C15435a f27428u = new C15435a();

    /* renamed from: G */
    public abstract boolean mo76623G();

    /* renamed from: H */
    public final void m77870H() {
        boolean z;
        if (this.f27419l == null) {
            long mo76620K = mo76620K();
            this.f27425r = mo76620K;
            this.f27419l = new RunnableC14483J(this, mo76620K);
            IAlog.m76529a("%senabling close with delay %d", IAlog.m76531a(this), Long.valueOf(this.f27425r));
            AbstractC14552x abstractC14552x = this.f27385b;
            if (abstractC14552x != null) {
                z = mo76604b(abstractC14552x);
            } else {
                z = false;
            }
            if (z && !mo76623G()) {
                if (z) {
                    InterfaceC14579e interfaceC14579e = this.f27418k;
                    if (interfaceC14579e != null) {
                        interfaceC14579e.showCloseCountdown();
                    }
                    CountDownTimerC14484K countDownTimerC14484K = new CountDownTimerC14484K(this, this.f27425r + 100);
                    this.f27429v = countDownTimerC14484K;
                    countDownTimerC14484K.start();
                }
            } else if (!this.f27424q) {
                this.f27424q = true;
                C15478v0 c15478v0 = new C15478v0(TimeUnit.MILLISECONDS, this.f27425r);
                this.f27420m = c15478v0;
                c15478v0.f30627e = new C14485L(this);
                HandlerC15474t0 handlerC15474t0 = new HandlerC15474t0(c15478v0);
                c15478v0.f30625c = handlerC15474t0;
                c15478v0.f30626d = false;
                handlerC15474t0.sendEmptyMessage(1932593528);
            }
        }
    }

    /* renamed from: I */
    public abstract int mo76622I();

    /* renamed from: J */
    public abstract int mo76621J();

    /* renamed from: K */
    public abstract long mo76620K();

    /* renamed from: L */
    public abstract boolean mo76619L();

    /* renamed from: a */
    public abstract long mo76614a(long j);

    /* renamed from: a */
    public void mo76610a(InterfaceC14579e interfaceC14579e, Activity activity) {
        if (this.f27384a != null) {
            if (interfaceC14579e != null) {
                this.f27418k = interfaceC14579e;
                return;
            } else {
                IAlog.m76524f("%srenderAd called with a null activity!", IAlog.m76531a(this));
                throw new InneractiveUnitController.AdDisplayError("Activity is null");
            }
        }
        IAlog.m76524f("%sYou must set the spot to render before calling renderAd", IAlog.m76531a(this));
        throw new InneractiveUnitController.AdDisplayError("No spot ad to render");
    }

    /* renamed from: b */
    public abstract boolean mo76604b(AbstractC14552x abstractC14552x);

    /* renamed from: c */
    public final void m77869c(boolean z) {
        C14740w c14740w;
        if (this.f27385b == null) {
            EnumC14738u enumC14738u = EnumC14738u.MRAID_CUSTOM_CLOSE_DETECTED;
            c14740w = new C14740w((AbstractC15386e) null);
            c14740w.f27931c = enumC14738u;
            c14740w.f27929a = null;
            c14740w.f27932d = null;
        } else {
            EnumC14738u enumC14738u2 = EnumC14738u.MRAID_CUSTOM_CLOSE_DETECTED;
            AbstractC14552x abstractC14552x = this.f27385b;
            InneractiveAdRequest inneractiveAdRequest = abstractC14552x.f27572a;
            AbstractC15386e mo77807c = abstractC14552x.mo77807c();
            JSONArray m77925b = this.f27385b.f27574c.m77925b();
            c14740w = new C14740w(mo77807c);
            c14740w.f27931c = enumC14738u2;
            c14740w.f27929a = inneractiveAdRequest;
            c14740w.f27932d = m77925b;
        }
        JSONObject jSONObject = new JSONObject();
        Boolean valueOf = Boolean.valueOf(z);
        try {
            jSONObject.put("fyber_close_enabled", valueOf);
        } catch (Exception unused) {
            IAlog.m76524f("Got exception adding param to json object: %s, %s", "fyber_close_enabled", valueOf);
        }
        c14740w.f27934f.put(jSONObject);
        c14740w.m77658a((String) null);
    }

    /* renamed from: d */
    public final void m77868d(boolean z) {
        C14740w c14740w;
        this.f27423p = true;
        if (z) {
            if (this.f27385b == null) {
                EnumC14738u enumC14738u = EnumC14738u.FAIL_SAFE_ACTIVATED;
                c14740w = new C14740w((AbstractC15386e) null);
                c14740w.f27931c = enumC14738u;
                c14740w.f27929a = null;
                c14740w.f27932d = null;
            } else {
                EnumC14738u enumC14738u2 = EnumC14738u.FAIL_SAFE_ACTIVATED;
                AbstractC14552x abstractC14552x = this.f27385b;
                InneractiveAdRequest inneractiveAdRequest = abstractC14552x.f27572a;
                AbstractC15386e mo77807c = abstractC14552x.mo77807c();
                JSONArray m77925b = this.f27385b.f27574c.m77925b();
                c14740w = new C14740w(mo77807c);
                c14740w.f27931c = enumC14738u2;
                c14740w.f27929a = inneractiveAdRequest;
                c14740w.f27932d = m77925b;
            }
            JSONObject jSONObject = new JSONObject();
            Boolean valueOf = Boolean.valueOf(mo76619L());
            try {
                jSONObject.put("is_endcard", valueOf);
            } catch (Exception unused) {
                IAlog.m76524f("Got exception adding param to json object: %s, %s", "is_endcard", valueOf);
            }
            c14740w.f27934f.put(jSONObject);
            c14740w.m77658a((String) null);
        }
        InterfaceC14579e interfaceC14579e = this.f27418k;
        if (interfaceC14579e != null) {
            interfaceC14579e.showCloseButton(z, mo76621J(), mo76622I());
            if (!z) {
                C15435a c15435a = this.f27428u;
                c15435a.f30583d = 0L;
                c15435a.f30584e = 0L;
                c15435a.f30585f = 0L;
                c15435a.f30581b = false;
                c15435a.m76510a(false);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14474A, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        Runnable runnable = this.f27419l;
        if (runnable != null) {
            AbstractC15465p.f30612b.removeCallbacks(runnable);
            this.f27419l = null;
        }
        Runnable runnable2 = this.f27421n;
        if (runnable2 != null) {
            AbstractC15465p.f30612b.removeCallbacks(runnable2);
            this.f27421n = null;
        }
        InterfaceC14579e interfaceC14579e = this.f27418k;
        if (interfaceC14579e != null) {
            interfaceC14579e.destroy();
        }
        this.f27418k = null;
        CountDownTimerC14484K countDownTimerC14484K = this.f27429v;
        if (countDownTimerC14484K != null) {
            countDownTimerC14484K.cancel();
            this.f27429v = null;
        }
        C15478v0 c15478v0 = this.f27422o;
        if (c15478v0 != null) {
            c15478v0.f30627e = null;
            this.f27422o = null;
        }
        C15478v0 c15478v02 = this.f27420m;
        if (c15478v02 != null) {
            c15478v02.f30627e = null;
            this.f27420m = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14474A, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void initialize(InneractiveAdSpot inneractiveAdSpot) {
        super.initialize(inneractiveAdSpot);
        this.f27428u.f30580a = inneractiveAdSpot;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14580f
    /* renamed from: m */
    public void mo76594m() {
        C15478v0 c15478v0 = this.f27420m;
        if (c15478v0 != null) {
            c15478v0.f30626d = false;
            c15478v0.m76450a(SystemClock.uptimeMillis());
        }
        C15478v0 c15478v02 = this.f27422o;
        if (c15478v02 != null) {
            c15478v02.f30626d = false;
            c15478v02.m76450a(SystemClock.uptimeMillis());
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14580f
    /* renamed from: r */
    public void mo76593r() {
        C15478v0 c15478v0 = this.f27420m;
        if (c15478v0 != null) {
            c15478v0.f30626d = true;
            HandlerC15474t0 handlerC15474t0 = c15478v0.f30625c;
            if (handlerC15474t0 != null) {
                handlerC15474t0.removeMessages(1932593528);
            }
        }
        C15478v0 c15478v02 = this.f27422o;
        if (c15478v02 != null) {
            c15478v02.f30626d = true;
            HandlerC15474t0 handlerC15474t02 = c15478v02.f30625c;
            if (handlerC15474t02 != null) {
                handlerC15474t02.removeMessages(1932593528);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14474A
    /* renamed from: x */
    public final View mo76633x() {
        InterfaceC14579e interfaceC14579e = this.f27418k;
        if (interfaceC14579e != null) {
            return interfaceC14579e.getLayout();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14474A
    /* renamed from: y */
    public final int mo76646y() {
        InterfaceC14579e interfaceC14579e = this.f27418k;
        if (interfaceC14579e != null && interfaceC14579e.getLayout() != null) {
            return this.f27418k.getLayout().getHeight();
        }
        return 1;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14474A
    /* renamed from: z */
    public final int mo76645z() {
        InterfaceC14579e interfaceC14579e = this.f27418k;
        if (interfaceC14579e != null && interfaceC14579e.getLayout() != null) {
            return this.f27418k.getLayout().getWidth();
        }
        return 1;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14580f
    /* renamed from: b */
    public void mo76603b(boolean z) {
    }
}
