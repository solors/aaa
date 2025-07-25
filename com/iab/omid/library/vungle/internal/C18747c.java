package com.iab.omid.library.vungle.internal;

import com.iab.omid.library.vungle.adsession.C18737a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.vungle.internal.c */
/* loaded from: classes6.dex */
public class C18747c {

    /* renamed from: c */
    private static C18747c f46883c = new C18747c();

    /* renamed from: a */
    private final ArrayList<C18737a> f46884a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C18737a> f46885b = new ArrayList<>();

    private C18747c() {
    }

    /* renamed from: c */
    public static C18747c m61518c() {
        return f46883c;
    }

    /* renamed from: a */
    public Collection<C18737a> m61522a() {
        return Collections.unmodifiableCollection(this.f46885b);
    }

    /* renamed from: b */
    public Collection<C18737a> m61520b() {
        return Collections.unmodifiableCollection(this.f46884a);
    }

    /* renamed from: d */
    public boolean m61516d() {
        if (this.f46885b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m61521a(C18737a c18737a) {
        this.f46884a.add(c18737a);
    }

    /* renamed from: b */
    public void m61519b(C18737a c18737a) {
        boolean m61516d = m61516d();
        this.f46884a.remove(c18737a);
        this.f46885b.remove(c18737a);
        if (!m61516d || m61516d()) {
            return;
        }
        C18755i.m61468c().m61466e();
    }

    /* renamed from: c */
    public void m61517c(C18737a c18737a) {
        boolean m61516d = m61516d();
        this.f46885b.add(c18737a);
        if (m61516d) {
            return;
        }
        C18755i.m61468c().m61467d();
    }
}
