package com.iab.omid.library.taurusx.internal;

import com.iab.omid.library.taurusx.adsession.C18621a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.taurusx.internal.c */
/* loaded from: classes6.dex */
public class C18631c {

    /* renamed from: c */
    private static C18631c f46628c = new C18631c();

    /* renamed from: a */
    private final ArrayList<C18621a> f46629a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C18621a> f46630b = new ArrayList<>();

    private C18631c() {
    }

    /* renamed from: c */
    public static C18631c m61984c() {
        return f46628c;
    }

    /* renamed from: a */
    public Collection<C18621a> m61988a() {
        return Collections.unmodifiableCollection(this.f46630b);
    }

    /* renamed from: b */
    public Collection<C18621a> m61986b() {
        return Collections.unmodifiableCollection(this.f46629a);
    }

    /* renamed from: d */
    public boolean m61982d() {
        if (this.f46630b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m61987a(C18621a c18621a) {
        this.f46629a.add(c18621a);
    }

    /* renamed from: b */
    public void m61985b(C18621a c18621a) {
        boolean m61982d = m61982d();
        this.f46629a.remove(c18621a);
        this.f46630b.remove(c18621a);
        if (!m61982d || m61982d()) {
            return;
        }
        C18638h.m61941c().m61939e();
    }

    /* renamed from: c */
    public void m61983c(C18621a c18621a) {
        boolean m61982d = m61982d();
        this.f46630b.add(c18621a);
        if (m61982d) {
            return;
        }
        C18638h.m61941c().m61940d();
    }
}
