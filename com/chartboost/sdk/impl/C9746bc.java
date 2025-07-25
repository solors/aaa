package com.chartboost.sdk.impl;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.bc */
/* loaded from: classes3.dex */
public class C9746bc extends AbstractC10106p {

    /* renamed from: a */
    public final C10157r f21735a;

    /* renamed from: b */
    public final C10138q f21736b;

    /* renamed from: c */
    public final C10056md f21737c;

    /* renamed from: d */
    public C9989jc f21738d;

    /* renamed from: e */
    public AbstractC10207t f21739e;

    /* renamed from: f */
    public boolean f21740f;

    /* renamed from: g */
    public boolean f21741g;

    /* renamed from: h */
    public final String f21742h;

    /* renamed from: i */
    public boolean f21743i;

    /* renamed from: j */
    public boolean f21744j;

    public C9746bc(C10138q c10138q, C10157r c10157r) {
        this(c10138q, c10157r, UUID.randomUUID().toString());
    }

    /* renamed from: a */
    public void m81986a(List list) {
        if (m81978g()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view = (View) ((C9989jc) it.next()).get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            throw null;
        }
    }

    /* renamed from: b */
    public final void m81984b(View view) {
        Collection<C9746bc> m80231b = C10300vc.m80229c().m80231b();
        if (m80231b == null || m80231b.isEmpty()) {
            return;
        }
        for (C9746bc c9746bc : m80231b) {
            if (c9746bc != this && c9746bc.m81980e() == view) {
                c9746bc.f21738d.clear();
            }
        }
    }

    /* renamed from: c */
    public final void m81983c() {
        if (this.f21743i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: d */
    public final void m81981d() {
        if (!this.f21744j) {
            return;
        }
        throw new IllegalStateException("Loaded event can only be sent once");
    }

    /* renamed from: e */
    public View m81980e() {
        return (View) this.f21738d.get();
    }

    /* renamed from: f */
    public List m81979f() {
        return this.f21737c.m81055a();
    }

    /* renamed from: g */
    public boolean m81978g() {
        return false;
    }

    /* renamed from: h */
    public boolean m81977h() {
        if (this.f21740f && !this.f21741g) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m81976i() {
        return this.f21741g;
    }

    /* renamed from: j */
    public String m81975j() {
        return this.f21742h;
    }

    /* renamed from: k */
    public AbstractC10207t m81974k() {
        return this.f21739e;
    }

    /* renamed from: l */
    public boolean m81973l() {
        return this.f21736b.m80779a();
    }

    /* renamed from: m */
    public boolean m81972m() {
        return this.f21736b.m80777b();
    }

    /* renamed from: n */
    public boolean m81971n() {
        return this.f21740f;
    }

    /* renamed from: o */
    public void m81970o() {
        m81983c();
        m81974k().m80565g();
        this.f21743i = true;
    }

    /* renamed from: p */
    public void m81969p() {
        m81981d();
        m81974k().m80563i();
        this.f21744j = true;
    }

    /* renamed from: q */
    public void m81968q() {
        if (this.f21741g) {
            return;
        }
        this.f21737c.m81051b();
    }

    public C9746bc(C10138q c10138q, C10157r c10157r, String str) {
        this.f21737c = new C10056md();
        this.f21740f = false;
        this.f21741g = false;
        this.f21736b = c10138q;
        this.f21735a = c10157r;
        this.f21742h = str;
        m81982c(null);
        this.f21739e = (c10157r.m80707a() == EnumC10178s.HTML || c10157r.m80707a() == EnumC10178s.JAVASCRIPT) ? new C9853fc(str, c10157r.m80698h()) : new C10028lc(str, c10157r.m80702d(), c10157r.m80701e());
        this.f21739e.mo80562j();
        C10300vc.m80229c().m80232a(this);
        this.f21739e.m80579a(c10138q);
    }

    /* renamed from: a */
    public void m81985a(JSONObject jSONObject) {
        m81981d();
        m81974k().m80574a(jSONObject);
        this.f21744j = true;
    }

    @Override // com.chartboost.sdk.impl.AbstractC10106p
    /* renamed from: b */
    public void mo80871b() {
        if (this.f21740f) {
            return;
        }
        this.f21740f = true;
        C10300vc.m80229c().m80228c(this);
        this.f21739e.m80585a(C10177rd.m80642c().m80643b());
        this.f21739e.m80575a(C9818dc.m81774a().m81772b());
        this.f21739e.mo80583a(this, this.f21735a);
    }

    /* renamed from: c */
    public final void m81982c(View view) {
        this.f21738d = new C9989jc(view);
    }

    @Override // com.chartboost.sdk.impl.AbstractC10106p
    /* renamed from: a */
    public void mo80873a(View view, EnumC9955i5 enumC9955i5, String str) {
        if (this.f21741g) {
            return;
        }
        this.f21737c.m81053a(view, enumC9955i5, str);
    }

    @Override // com.chartboost.sdk.impl.AbstractC10106p
    /* renamed from: a */
    public void mo80875a() {
        if (this.f21741g) {
            return;
        }
        this.f21738d.clear();
        m81968q();
        this.f21741g = true;
        m81974k().m80566f();
        C10300vc.m80229c().m80230b(this);
        m81974k().mo80572b();
        this.f21739e = null;
    }

    @Override // com.chartboost.sdk.impl.AbstractC10106p
    /* renamed from: a */
    public void mo80874a(View view) {
        if (this.f21741g || m81980e() == view) {
            return;
        }
        m81982c(view);
        m81974k().m80586a();
        m81984b(view);
    }
}
