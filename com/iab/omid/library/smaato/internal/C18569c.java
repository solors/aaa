package com.iab.omid.library.smaato.internal;

import com.iab.omid.library.smaato.adsession.C18559a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.smaato.internal.c */
/* loaded from: classes6.dex */
public class C18569c {

    /* renamed from: c */
    private static C18569c f46492c = new C18569c();

    /* renamed from: a */
    private final ArrayList<C18559a> f46493a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C18559a> f46494b = new ArrayList<>();

    private C18569c() {
    }

    /* renamed from: c */
    public static C18569c m62240c() {
        return f46492c;
    }

    /* renamed from: a */
    public Collection<C18559a> m62244a() {
        return Collections.unmodifiableCollection(this.f46494b);
    }

    /* renamed from: b */
    public Collection<C18559a> m62242b() {
        return Collections.unmodifiableCollection(this.f46493a);
    }

    /* renamed from: d */
    public boolean m62238d() {
        if (this.f46494b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m62243a(C18559a c18559a) {
        this.f46493a.add(c18559a);
    }

    /* renamed from: b */
    public void m62241b(C18559a c18559a) {
        boolean m62238d = m62238d();
        this.f46493a.remove(c18559a);
        this.f46494b.remove(c18559a);
        if (!m62238d || m62238d()) {
            return;
        }
        C18577i.m62190c().m62188e();
    }

    /* renamed from: c */
    public void m62239c(C18559a c18559a) {
        boolean m62238d = m62238d();
        this.f46494b.add(c18559a);
        if (m62238d) {
            return;
        }
        C18577i.m62190c().m62189d();
    }
}
