package com.chartboost.sdk.impl;

import android.view.View;
import android.view.ViewGroup;
import com.chartboost.sdk.impl.AbstractC10232u;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.y1 */
/* loaded from: classes3.dex */
public final class C10373y1 implements InterfaceC10401z5, InterfaceC9887h6, InterfaceC9672a6, InterfaceC10165r6 {

    /* renamed from: a */
    public final C9847f6 f23589a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10401z5 f23590b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC9887h6 f23591c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC9672a6 f23592d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC10165r6 f23593e;

    /* renamed from: f */
    public EnumC10047m6 f23594f;

    public C10373y1(C9847f6 impressionDependency, InterfaceC10401z5 impressionClick, InterfaceC9887h6 impressionDismiss, InterfaceC9672a6 impressionComplete, InterfaceC10165r6 impressionView) {
        Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
        Intrinsics.checkNotNullParameter(impressionClick, "impressionClick");
        Intrinsics.checkNotNullParameter(impressionDismiss, "impressionDismiss");
        Intrinsics.checkNotNullParameter(impressionComplete, "impressionComplete");
        Intrinsics.checkNotNullParameter(impressionView, "impressionView");
        this.f23589a = impressionDependency;
        this.f23590b = impressionClick;
        this.f23591c = impressionDismiss;
        this.f23592d = impressionComplete;
        this.f23593e = impressionView;
        this.f23594f = EnumC10047m6.f22603c;
    }

    /* renamed from: A */
    public final AbstractC10358xb m79986A() {
        return this.f23589a.m81690r().m80907u();
    }

    /* renamed from: B */
    public final void m79985B() {
        if (this.f23589a.m81696l().m81744a() <= 1) {
            mo79968a();
            C9829e6 m81696l = this.f23589a.m81696l();
            m81696l.m81743a(m81696l.m81744a() + 1);
        }
    }

    /* renamed from: C */
    public final void m79984C() {
        if (mo79938k() && Intrinsics.m17075f(this.f23589a.m81707a(), AbstractC10232u.C10235c.f23215g)) {
            m79985B();
        }
    }

    /* renamed from: D */
    public final void m79983D() {
        if (this.f23589a.m81696l().m81742b() <= 1) {
            m79974M();
            C9829e6 m81696l = this.f23589a.m81696l();
            m81696l.m81741b(m81696l.m81742b() + 1);
        }
    }

    /* renamed from: E */
    public final boolean m79982E() {
        View view;
        if (this.f23589a.m81690r().m80907u() != null) {
            AbstractC10358xb m80907u = this.f23589a.m81690r().m80907u();
            if (m80907u != null) {
                view = m80907u.getRootView();
            } else {
                view = null;
            }
            if (view != null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    public final void m79981F() {
        try {
            if (this.f23589a.m81690r() instanceof C10171rb) {
                ((C10171rb) this.f23589a.m81690r()).m80672I();
            } else {
                this.f23589a.m81690r().m80906v();
                this.f23589a.m81690r().m80937a(EnumC9852fb.f22024l);
            }
        } catch (Exception e) {
            C9763c7.m81920b("Invalid mute video command", e);
        }
    }

    /* renamed from: G */
    public final void m79980G() {
        mo79804b(this.f23589a.m81694n(), Float.valueOf(this.f23589a.m81690r().m80908t()), Float.valueOf(this.f23589a.m81690r().m80909s()));
        mo79806b();
    }

    /* renamed from: H */
    public final void m79979H() {
        if (this.f23589a.m81696l().m81740c() <= 1) {
            m79983D();
            C9829e6 m81696l = this.f23589a.m81696l();
            m81696l.m81739c(m81696l.m81740c() + 1);
        }
    }

    /* renamed from: I */
    public final void m79978I() {
        if (this.f23594f == EnumC10047m6.f22605e && !mo79938k()) {
            mo79935n();
            mo79948c(true);
        }
    }

    /* renamed from: J */
    public final void m79977J() {
        try {
            AbstractC10090o2 m81690r = this.f23589a.m81690r();
            Intrinsics.m17073h(m81690r, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((C10171rb) m81690r).m80669L();
        } catch (Exception e) {
            C9763c7.m81920b("Invalid pause video command", e);
        }
    }

    /* renamed from: K */
    public final void m79976K() {
        try {
            AbstractC10090o2 m81690r = this.f23589a.m81690r();
            Intrinsics.m17073h(m81690r, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((C10171rb) m81690r).m80668M();
        } catch (Exception e) {
            C9763c7.m81920b("Invalid play video command", e);
        }
    }

    /* renamed from: L */
    public final void m79975L() {
        this.f23594f = EnumC10047m6.f22603c;
        CBError.EnumC10416b m80948A = this.f23589a.m81690r().m80948A();
        if (m80948A == null) {
            mo79939j();
        } else {
            m79951b(m80948A);
        }
    }

    /* renamed from: M */
    public final void m79974M() {
        mo79957a(this.f23589a.m81694n(), Float.valueOf(this.f23589a.m81690r().m80908t()), Float.valueOf(this.f23589a.m81690r().m80909s()));
    }

    /* renamed from: N */
    public final boolean m79973N() {
        return this.f23589a.m81707a().m80471c();
    }

    /* renamed from: O */
    public final void m79972O() {
        if (this.f23589a.m81696l().m81738d() <= 1) {
            m79985B();
            m79983D();
            C9829e6 m81696l = this.f23589a.m81696l();
            m81696l.m81737d(m81696l.m81738d() + 1);
        }
    }

    /* renamed from: P */
    public final void m79971P() {
        try {
            if (this.f23589a.m81690r() instanceof C10171rb) {
                ((C10171rb) this.f23589a.m81690r()).m80666O();
            } else {
                this.f23589a.m81690r().m80945D();
                this.f23589a.m81690r().m80937a(EnumC9852fb.f22024l);
            }
        } catch (Exception e) {
            C9763c7.m81920b("Invalid unmute video command", e);
        }
    }

    /* renamed from: Q */
    public final void m79970Q() {
        this.f23589a.m81690r().mo80324w();
    }

    /* renamed from: R */
    public final void m79969R() {
        this.f23589a.m81690r().mo80656f();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10401z5
    /* renamed from: a */
    public void mo79807a(String str, CBError.EnumC10415a error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f23590b.mo79807a(str, error);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10401z5
    /* renamed from: b */
    public void mo79806b() {
        this.f23590b.mo79806b();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10401z5
    /* renamed from: c */
    public void mo79803c(C10043m2 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        this.f23590b.mo79803c(cbUrl);
    }

    /* renamed from: d */
    public final void m79947d() {
        mo79962a(this.f23594f);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC9887h6
    /* renamed from: e */
    public void mo79945e() {
        this.f23591c.mo79945e();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10165r6
    /* renamed from: f */
    public void mo79944f() {
        this.f23593e.mo79944f();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10165r6
    /* renamed from: g */
    public void mo79942g() {
        this.f23593e.mo79942g();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10165r6
    /* renamed from: h */
    public boolean mo79941h() {
        return this.f23593e.mo79941h();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10165r6
    /* renamed from: i */
    public boolean mo79940i() {
        return this.f23593e.mo79940i();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10165r6
    /* renamed from: j */
    public void mo79939j() {
        this.f23593e.mo79939j();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10165r6
    /* renamed from: k */
    public boolean mo79938k() {
        return this.f23593e.mo79938k();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10165r6
    /* renamed from: l */
    public void mo79937l() {
        this.f23593e.mo79937l();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10165r6
    /* renamed from: m */
    public boolean mo79936m() {
        return this.f23593e.mo79936m();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10165r6
    /* renamed from: n */
    public void mo79935n() {
        this.f23593e.mo79935n();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10165r6
    /* renamed from: o */
    public ViewGroup mo79934o() {
        return this.f23593e.mo79934o();
    }

    /* renamed from: p */
    public final void m79933p() {
        try {
            AbstractC10090o2 m81690r = this.f23589a.m81690r();
            Intrinsics.m17073h(m81690r, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((C10171rb) m81690r).m80676E();
        } catch (Exception e) {
            C9763c7.m81920b("Invalid close video command", e);
        }
    }

    /* renamed from: q */
    public final String m79932q() {
        return this.f23589a.m81706b().m80343m();
    }

    /* renamed from: r */
    public final String m79931r() {
        return this.f23589a.m81706b().m80336t();
    }

    /* renamed from: s */
    public EnumC10047m6 m79930s() {
        return this.f23594f;
    }

    /* renamed from: t */
    public final String m79929t() {
        return this.f23589a.m81694n();
    }

    /* renamed from: u */
    public final String m79928u() {
        return this.f23589a.m81690r().m80919i();
    }

    /* renamed from: v */
    public final String m79927v() {
        return this.f23589a.m81690r().m80917k();
    }

    /* renamed from: w */
    public final String m79926w() {
        return this.f23589a.m81690r().m80915m();
    }

    /* renamed from: x */
    public final String m79925x() {
        return this.f23589a.m81690r().m80913o();
    }

    /* renamed from: y */
    public final String m79924y() {
        return this.f23589a.m81690r().m80912p();
    }

    /* renamed from: z */
    public final int m79923z() {
        if (this.f23589a.m81690r() instanceof C10171rb) {
            return ((C10171rb) this.f23589a.m81690r()).m80674G();
        }
        return -1;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10165r6
    /* renamed from: a */
    public void mo79961a(EnumC10047m6 state, CBImpressionActivity activity) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f23593e.mo79961a(state, activity);
    }

    /* renamed from: b */
    public final void m79951b(CBError.EnumC10416b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (mo79938k()) {
            this.f23589a.m81705c().mo81346p();
        } else {
            mo79960a(error);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10165r6
    /* renamed from: c */
    public void mo79949c() {
        this.f23593e.mo79949c();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10165r6
    /* renamed from: d */
    public void mo79946d(boolean z) {
        this.f23593e.mo79946d(z);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10401z5
    /* renamed from: e */
    public void mo79802e(boolean z) {
        this.f23590b.mo79802e(z);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC9887h6
    /* renamed from: f */
    public void mo79943f(boolean z) {
        this.f23591c.mo79943f(z);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10165r6
    /* renamed from: a */
    public void mo79965a(ViewGroup viewGroup) {
        this.f23593e.mo79965a(viewGroup);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10165r6
    /* renamed from: c */
    public void mo79948c(boolean z) {
        this.f23593e.mo79948c(z);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC9672a6
    /* renamed from: a */
    public void mo79968a() {
        this.f23592d.mo79968a();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10401z5
    /* renamed from: a */
    public boolean mo79808a(Boolean bool, EnumC10047m6 impressionState) {
        Intrinsics.checkNotNullParameter(impressionState, "impressionState");
        return this.f23590b.mo79808a(bool, impressionState);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC9887h6
    /* renamed from: a */
    public void mo79962a(EnumC10047m6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f23591c.mo79962a(state);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10401z5
    /* renamed from: b */
    public void mo79805b(C10043m2 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        this.f23590b.mo79805b(cbUrl);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10165r6
    /* renamed from: a */
    public void mo79960a(CBError.EnumC10416b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f23593e.mo79960a(error);
    }

    /* renamed from: b */
    public void m79952b(EnumC10047m6 newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.f23594f = newState;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10401z5
    /* renamed from: a */
    public void mo79809a(C10043m2 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        this.f23590b.mo79809a(cbUrl);
    }

    /* renamed from: a */
    public final void m79956a(List verificationScriptResourceList, Integer num) {
        Intrinsics.checkNotNullParameter(verificationScriptResourceList, "verificationScriptResourceList");
        this.f23589a.m81690r().m80930a(verificationScriptResourceList, num);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10165r6
    /* renamed from: b */
    public void mo79950b(boolean z) {
        this.f23593e.mo79950b(z);
    }

    /* renamed from: b */
    public final void m79953b(float f) {
        this.f23589a.m81690r().m80928b(f);
    }

    /* renamed from: a */
    public final void m79966a(float f, float f2) {
        this.f23589a.m81690r().m80943a(f, f2);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10401z5
    /* renamed from: b */
    public void mo79804b(String location, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f23590b.mo79804b(location, f, f2);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC9672a6
    /* renamed from: a */
    public void mo79957a(String location, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f23592d.mo79957a(location, f, f2);
    }

    /* renamed from: a */
    public final void m79958a(String event) {
        List<String> list;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.length() <= 0 || (list = (List) this.f23589a.m81706b().m80344l().get(event)) == null) {
            return;
        }
        for (String str : list) {
            this.f23589a.m81690r().m80923d(str);
        }
    }

    /* renamed from: a */
    public final void m79964a(EnumC9852fb vastVideoEvent) {
        Intrinsics.checkNotNullParameter(vastVideoEvent, "vastVideoEvent");
        this.f23589a.m81690r().m80937a(vastVideoEvent);
    }

    /* renamed from: a */
    public final void m79954a(boolean z, String forceOrientation) {
        Intrinsics.checkNotNullParameter(forceOrientation, "forceOrientation");
        this.f23589a.m81690r().m80929a(z, forceOrientation);
    }

    /* renamed from: a */
    public final void m79967a(float f) {
        this.f23589a.m81690r().m80944a(f);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10165r6
    /* renamed from: a */
    public void mo79955a(boolean z) {
        this.f23593e.mo79955a(z);
    }

    /* renamed from: a */
    public final void m79959a(Boolean bool) {
        mo79808a(bool, this.f23594f);
    }

    /* renamed from: a */
    public final void m79963a(EnumC9959i8 playerState) {
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        this.f23589a.m81690r().m80936a(playerState);
    }
}
