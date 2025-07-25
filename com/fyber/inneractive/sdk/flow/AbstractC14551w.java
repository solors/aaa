package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.InterfaceC14327U;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.config.global.features.C14371r;
import com.fyber.inneractive.sdk.ignite.C14563h;
import com.fyber.inneractive.sdk.ignite.EnumC14565j;
import com.fyber.inneractive.sdk.ignite.EnumC14568m;
import com.fyber.inneractive.sdk.network.EnumC14730t;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.EnumC15447g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C15509W;
import com.fyber.inneractive.sdk.web.C15510X;
import com.fyber.inneractive.sdk.web.RunnableC15501N;

/* renamed from: com.fyber.inneractive.sdk.flow.w */
/* loaded from: classes4.dex */
public abstract class AbstractC14551w extends AbstractC14552x {

    /* renamed from: g */
    public C15509W f27570g;

    /* renamed from: h */
    public final C14540v f27571h;

    public AbstractC14551w(InterfaceC14327U interfaceC14327U, C14388r c14388r) {
        super(interfaceC14327U, c14388r);
        this.f27571h = new C14540v(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14552x
    /* renamed from: a */
    public final void mo77810a(String str) {
        EnumC14568m enumC14568m;
        AbstractC15386e abstractC15386e;
        EnumC14568m enumC14568m2 = EnumC14568m.NONE;
        AbstractC15386e abstractC15386e2 = this.f27573b;
        if (abstractC15386e2 != null) {
            EnumC14568m enumC14568m3 = abstractC15386e2.f30452H;
            enumC14568m3.getClass();
            enumC14568m = EnumC14568m.SINGLE_TAP;
            if (enumC14568m3 != enumC14568m) {
                EnumC14568m enumC14568m4 = this.f27573b.f30452H;
                enumC14568m4.getClass();
                if (enumC14568m4 == EnumC14568m.TRUE_SINGLE_TAP && !isVideoAd()) {
                    this.f27571h.m77818a(EnumC14730t.IGNITE_FLOW_MODE_NOT_COMPATIBLE, null, null, null);
                } else {
                    enumC14568m = this.f27573b.f30452H;
                }
            }
        } else {
            enumC14568m = enumC14568m2;
        }
        C14563h c14563h = IAConfigManager.f27060O.f27067E;
        if (c14563h.f27597f && (abstractC15386e = this.f27573b) != null && abstractC15386e.m76579a() && c14563h.m77796n()) {
            AbstractC15386e abstractC15386e3 = this.f27573b;
            String str2 = abstractC15386e3 != null ? abstractC15386e3.f30445A : null;
            C15510X c15510x = new C15510X();
            c15510x.f30718a = str2;
            c15510x.f30719b = enumC14568m;
            c15510x.f30720c = str;
            c15510x.f30721d = this.f27574c;
            c15510x.f30722e = abstractC15386e3 != null ? abstractC15386e3.f30451G : null;
            c15510x.f30723f = abstractC15386e3 != null ? abstractC15386e3.f30453I : null;
            c15510x.f30724g = this.f27571h;
            C15509W c15509w = new C15509W(c15510x);
            this.f27570g = c15509w;
            C14371r c14371r = (C14371r) this.f27574c.m77927a(C14371r.class);
            if (c14371r == null || str2 == null) {
                return;
            }
            String mo77933a = c14371r.mo77933a("detail_url", "https://cdn2.inner-active.mobi/app-detail-page-v0/[BUNDLE_ID].html");
            c15509w.m76407e(mo77933a == null ? "" : mo77933a.replace("[BUNDLE_ID]", str2));
            return;
        }
        AbstractC15386e abstractC15386e4 = this.f27573b;
        if (abstractC15386e4 != null) {
            abstractC15386e4.f30452H = enumC14568m2;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14552x
    /* renamed from: b */
    public final C15509W mo77808b() {
        return this.f27570g;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14552x
    /* renamed from: e */
    public final boolean mo77805e() {
        C15509W c15509w = this.f27570g;
        if (c15509w != null && c15509w.f30703l) {
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14552x
    /* renamed from: g */
    public final void mo77803g() {
        AbstractC15386e abstractC15386e;
        AbstractC15386e abstractC15386e2;
        C14563h c14563h = IAConfigManager.f27060O.f27067E;
        if (c14563h.f27597f && (abstractC15386e = this.f27573b) != null && abstractC15386e.m76579a() && c14563h.m77796n() && !mo77805e() && (abstractC15386e2 = this.f27573b) != null) {
            EnumC14568m enumC14568m = abstractC15386e2.f30452H;
            EnumC14568m enumC14568m2 = EnumC14568m.NONE;
            if (enumC14568m != enumC14568m2) {
                IAlog.m76529a("ignite webpage was not loaded yet, stopping the loading process", new Object[0]);
                AbstractC15386e abstractC15386e3 = this.f27573b;
                if (enumC14568m2 == null) {
                    abstractC15386e3.getClass();
                }
                abstractC15386e3.f30452H = enumC14568m2;
                C15509W c15509w = this.f27570g;
                if (c15509w != null) {
                    RunnableC15501N runnableC15501N = c15509w.f30707p;
                    if (runnableC15501N != null) {
                        AbstractC15465p.f30612b.removeCallbacks(runnableC15501N);
                        c15509w.f30707p = null;
                    }
                    if (!c15509w.f30716y) {
                        c15509w.f30692a.stopLoading();
                    }
                    this.f27571h.m77818a(EnumC14730t.IGNITE_FLOW_FAILED_TO_LOAD_WEBPAGE, this.f27570g.f30702k, EnumC14565j.WEBPAGE_NOT_LOADED_BEFORE_SHOW.m77794a(), this.f27573b.f30452H);
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14552x
    /* renamed from: a */
    public final boolean mo77809a(boolean z, EnumC15447g enumC15447g) {
        EnumC14568m enumC14568m;
        AbstractC15386e abstractC15386e = this.f27573b;
        if (abstractC15386e != null) {
            enumC14568m = abstractC15386e.f30452H;
        } else {
            enumC14568m = EnumC14568m.NONE;
        }
        return !z && enumC14568m != null && enumC14568m == EnumC14568m.TRUE_SINGLE_TAP && (enumC15447g == EnumC15447g.VIDEO_CTA || enumC15447g == EnumC15447g.DEFAULT_ENDCARD);
    }
}
