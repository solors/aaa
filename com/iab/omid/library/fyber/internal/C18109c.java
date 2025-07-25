package com.iab.omid.library.fyber.internal;

import com.iab.omid.library.fyber.adsession.C18099a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.fyber.internal.c */
/* loaded from: classes6.dex */
public class C18109c {

    /* renamed from: c */
    private static C18109c f45563c = new C18109c();

    /* renamed from: a */
    private final ArrayList<C18099a> f45564a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C18099a> f45565b = new ArrayList<>();

    private C18109c() {
    }

    /* renamed from: c */
    public static C18109c m63981c() {
        return f45563c;
    }

    /* renamed from: a */
    public Collection<C18099a> m63985a() {
        return Collections.unmodifiableCollection(this.f45565b);
    }

    /* renamed from: b */
    public Collection<C18099a> m63983b() {
        return Collections.unmodifiableCollection(this.f45564a);
    }

    /* renamed from: d */
    public boolean m63979d() {
        if (this.f45565b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m63984a(C18099a c18099a) {
        this.f45564a.add(c18099a);
    }

    /* renamed from: b */
    public void m63982b(C18099a c18099a) {
        boolean m63979d = m63979d();
        this.f45564a.remove(c18099a);
        this.f45565b.remove(c18099a);
        if (!m63979d || m63979d()) {
            return;
        }
        C18117i.m63931c().m63929e();
    }

    /* renamed from: c */
    public void m63980c(C18099a c18099a) {
        boolean m63979d = m63979d();
        this.f45565b.add(c18099a);
        if (m63979d) {
            return;
        }
        C18117i.m63931c().m63930d();
    }
}
