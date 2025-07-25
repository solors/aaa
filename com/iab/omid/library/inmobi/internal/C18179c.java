package com.iab.omid.library.inmobi.internal;

import com.iab.omid.library.inmobi.adsession.C18169a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.inmobi.internal.c */
/* loaded from: classes6.dex */
public class C18179c {

    /* renamed from: c */
    private static C18179c f45698c = new C18179c();

    /* renamed from: a */
    private final ArrayList<C18169a> f45699a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C18169a> f45700b = new ArrayList<>();

    private C18179c() {
    }

    /* renamed from: c */
    public static C18179c m63728c() {
        return f45698c;
    }

    /* renamed from: a */
    public Collection<C18169a> m63732a() {
        return Collections.unmodifiableCollection(this.f45700b);
    }

    /* renamed from: b */
    public Collection<C18169a> m63730b() {
        return Collections.unmodifiableCollection(this.f45699a);
    }

    /* renamed from: d */
    public boolean m63726d() {
        if (this.f45700b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m63731a(C18169a c18169a) {
        this.f45699a.add(c18169a);
    }

    /* renamed from: b */
    public void m63729b(C18169a c18169a) {
        boolean m63726d = m63726d();
        this.f45699a.remove(c18169a);
        this.f45700b.remove(c18169a);
        if (!m63726d || m63726d()) {
            return;
        }
        C18187i.m63679c().m63677e();
    }

    /* renamed from: c */
    public void m63727c(C18169a c18169a) {
        boolean m63726d = m63726d();
        this.f45700b.add(c18169a);
        if (m63726d) {
            return;
        }
        C18187i.m63679c().m63678d();
    }
}
