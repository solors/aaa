package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* renamed from: io.appmetrica.analytics.impl.K8 */
/* loaded from: classes9.dex */
public final class C34011K8 {

    /* renamed from: a */
    public final String f93105a;

    /* renamed from: b */
    public String f93106b;

    /* renamed from: c */
    public final Long f93107c;

    /* renamed from: d */
    public final Long f93108d;

    /* renamed from: e */
    public final Long f93109e;

    /* renamed from: f */
    public final Long f93110f;

    /* renamed from: g */
    public final C34663k7 f93111g;

    /* renamed from: h */
    public final EnumC34324Xa f93112h;

    /* renamed from: i */
    public final Integer f93113i;

    /* renamed from: j */
    public final String f93114j;

    /* renamed from: k */
    public final Integer f93115k;

    /* renamed from: l */
    public final Integer f93116l;

    /* renamed from: m */
    public final String f93117m;

    /* renamed from: n */
    public final String f93118n;

    /* renamed from: o */
    public final EnumC33889F8 f93119o;

    /* renamed from: p */
    public final EnumC34423ba f93120p;

    /* renamed from: q */
    public final EnumC34692l9 f93121q;

    /* renamed from: r */
    public final Boolean f93122r;

    /* renamed from: s */
    public final Integer f93123s;

    /* renamed from: t */
    public final byte[] f93124t;

    public C34011K8(ContentValues contentValues) {
        C34555g7 model = new C34582h7(null, 1, null).toModel(contentValues);
        this.f93105a = model.m21677a().m21744j();
        this.f93106b = model.m21677a().m21738p();
        this.f93107c = model.m21675c();
        this.f93108d = model.m21676b();
        this.f93109e = model.m21677a().m21743k();
        this.f93110f = model.m21674d();
        this.f93111g = model.m21677a().m21745i();
        this.f93112h = model.m21673e();
        this.f93113i = model.m21677a().m21750d();
        this.f93114j = model.m21677a().m21748f();
        this.f93115k = model.m21677a().m21739o();
        this.f93116l = model.m21677a().m21751c();
        this.f93117m = model.m21677a().m21752b();
        this.f93118n = model.m21677a().m21741m();
        EnumC33889F8 m21749e = model.m21677a().m21749e();
        this.f93119o = m21749e == null ? EnumC33889F8.m22662a(null) : m21749e;
        EnumC34423ba m21746h = model.m21677a().m21746h();
        this.f93120p = m21746h == null ? EnumC34423ba.m21936a(null) : m21746h;
        this.f93121q = model.m21677a().m21740n();
        this.f93122r = model.m21677a().m21753a();
        this.f93123s = model.m21677a().m21742l();
        this.f93124t = model.m21677a().m21747g();
    }
}
