package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.impl.C9747bd;
import java.util.Date;

/* renamed from: com.chartboost.sdk.impl.dc */
/* loaded from: classes3.dex */
public class C9818dc implements C9747bd.InterfaceC9748a {

    /* renamed from: f */
    public static C9818dc f21922f = new C9818dc(new C9747bd());

    /* renamed from: a */
    public C10011kd f21923a = new C10011kd();

    /* renamed from: b */
    public Date f21924b;

    /* renamed from: c */
    public boolean f21925c;

    /* renamed from: d */
    public C9747bd f21926d;

    /* renamed from: e */
    public boolean f21927e;

    public C9818dc(C9747bd c9747bd) {
        this.f21926d = c9747bd;
    }

    /* renamed from: a */
    public static C9818dc m81774a() {
        return f21922f;
    }

    /* renamed from: b */
    public Date m81772b() {
        Date date = this.f21924b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: c */
    public final void m81771c() {
        if (this.f21925c && this.f21924b != null) {
            for (C9746bc c9746bc : C10300vc.m80229c().m80233a()) {
                c9746bc.m81974k().m80575a(m81772b());
            }
        }
    }

    /* renamed from: d */
    public void m81770d() {
        Date m81201a = this.f21923a.m81201a();
        Date date = this.f21924b;
        if (date == null || m81201a.after(date)) {
            this.f21924b = m81201a;
            m81771c();
        }
    }

    /* renamed from: a */
    public void m81773a(Context context) {
        if (this.f21925c) {
            return;
        }
        this.f21926d.m81966a(context);
        this.f21926d.m81965a(this);
        this.f21926d.m81961e();
        this.f21927e = this.f21926d.m81962c();
        this.f21925c = true;
    }

    @Override // com.chartboost.sdk.impl.C9747bd.InterfaceC9748a
    /* renamed from: a */
    public void mo80644a(boolean z) {
        if (!this.f21927e && z) {
            m81770d();
        }
        this.f21927e = z;
    }
}
