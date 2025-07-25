package com.iab.omid.library.pubmatic.internal;

import com.iab.omid.library.pubmatic.adsession.C18426a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.pubmatic.internal.c */
/* loaded from: classes6.dex */
public class C18436c {

    /* renamed from: c */
    private static C18436c f46222c = new C18436c();

    /* renamed from: a */
    private final ArrayList<C18426a> f46223a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C18426a> f46224b = new ArrayList<>();

    private C18436c() {
    }

    /* renamed from: c */
    public static C18436c m62746c() {
        return f46222c;
    }

    /* renamed from: a */
    public Collection<C18426a> m62750a() {
        return Collections.unmodifiableCollection(this.f46224b);
    }

    /* renamed from: b */
    public Collection<C18426a> m62748b() {
        return Collections.unmodifiableCollection(this.f46223a);
    }

    /* renamed from: d */
    public boolean m62744d() {
        if (this.f46224b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m62749a(C18426a c18426a) {
        this.f46223a.add(c18426a);
    }

    /* renamed from: b */
    public void m62747b(C18426a c18426a) {
        boolean m62744d = m62744d();
        this.f46223a.remove(c18426a);
        this.f46224b.remove(c18426a);
        if (!m62744d || m62744d()) {
            return;
        }
        C18444i.m62696c().m62694e();
    }

    /* renamed from: c */
    public void m62745c(C18426a c18426a) {
        boolean m62744d = m62744d();
        this.f46224b.add(c18426a);
        if (m62744d) {
            return;
        }
        C18444i.m62696c().m62695d();
    }
}
