package com.iab.omid.library.ironsrc.internal;

import com.iab.omid.library.ironsrc.adsession.C18228a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.ironsrc.internal.c */
/* loaded from: classes6.dex */
public class C18238c {

    /* renamed from: c */
    private static C18238c f45828c = new C18238c();

    /* renamed from: a */
    private final ArrayList<C18228a> f45829a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C18228a> f45830b = new ArrayList<>();

    private C18238c() {
    }

    /* renamed from: c */
    public static C18238c m63484c() {
        return f45828c;
    }

    /* renamed from: a */
    public Collection<C18228a> m63488a() {
        return Collections.unmodifiableCollection(this.f45830b);
    }

    /* renamed from: b */
    public Collection<C18228a> m63486b() {
        return Collections.unmodifiableCollection(this.f45829a);
    }

    /* renamed from: d */
    public boolean m63482d() {
        if (this.f45830b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m63487a(C18228a c18228a) {
        this.f45829a.add(c18228a);
    }

    /* renamed from: b */
    public void m63485b(C18228a c18228a) {
        boolean m63482d = m63482d();
        this.f45829a.remove(c18228a);
        this.f45830b.remove(c18228a);
        if (!m63482d || m63482d()) {
            return;
        }
        C18245h.m63441c().m63439e();
    }

    /* renamed from: c */
    public void m63483c(C18228a c18228a) {
        boolean m63482d = m63482d();
        this.f45830b.add(c18228a);
        if (m63482d) {
            return;
        }
        C18245h.m63441c().m63440d();
    }
}
