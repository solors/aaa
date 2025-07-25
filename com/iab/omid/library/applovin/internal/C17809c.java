package com.iab.omid.library.applovin.internal;

import com.iab.omid.library.applovin.adsession.C17799a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.applovin.internal.c */
/* loaded from: classes6.dex */
public class C17809c {

    /* renamed from: c */
    private static C17809c f44935c = new C17809c();

    /* renamed from: a */
    private final ArrayList<C17799a> f44936a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C17799a> f44937b = new ArrayList<>();

    private C17809c() {
    }

    /* renamed from: c */
    public static C17809c m65139c() {
        return f44935c;
    }

    /* renamed from: a */
    public Collection<C17799a> m65143a() {
        return Collections.unmodifiableCollection(this.f44937b);
    }

    /* renamed from: b */
    public Collection<C17799a> m65141b() {
        return Collections.unmodifiableCollection(this.f44936a);
    }

    /* renamed from: d */
    public boolean m65137d() {
        if (this.f44937b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m65142a(C17799a c17799a) {
        this.f44936a.add(c17799a);
    }

    /* renamed from: b */
    public void m65140b(C17799a c17799a) {
        boolean m65137d = m65137d();
        this.f44936a.remove(c17799a);
        this.f44937b.remove(c17799a);
        if (!m65137d || m65137d()) {
            return;
        }
        C17817i.m65090c().m65088e();
    }

    /* renamed from: c */
    public void m65138c(C17799a c17799a) {
        boolean m65137d = m65137d();
        this.f44937b.add(c17799a);
        if (m65137d) {
            return;
        }
        C17817i.m65090c().m65089d();
    }
}
