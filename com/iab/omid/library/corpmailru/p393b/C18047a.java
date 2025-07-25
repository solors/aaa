package com.iab.omid.library.corpmailru.p393b;

import com.iab.omid.library.corpmailru.adsession.C18045a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.corpmailru.b.a */
/* loaded from: classes6.dex */
public class C18047a {

    /* renamed from: a */
    private static C18047a f45435a = new C18047a();

    /* renamed from: b */
    private final ArrayList<C18045a> f45436b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C18045a> f45437c = new ArrayList<>();

    private C18047a() {
    }

    /* renamed from: a */
    public static C18047a m64206a() {
        return f45435a;
    }

    /* renamed from: b */
    public Collection<C18045a> m64204b() {
        return Collections.unmodifiableCollection(this.f45436b);
    }

    /* renamed from: c */
    public Collection<C18045a> m64202c() {
        return Collections.unmodifiableCollection(this.f45437c);
    }

    /* renamed from: d */
    public boolean m64200d() {
        if (this.f45437c.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m64205a(C18045a c18045a) {
        this.f45436b.add(c18045a);
    }

    /* renamed from: b */
    public void m64203b(C18045a c18045a) {
        boolean m64200d = m64200d();
        this.f45437c.add(c18045a);
        if (m64200d) {
            return;
        }
        C18054f.m64167a().m64163b();
    }

    /* renamed from: c */
    public void m64201c(C18045a c18045a) {
        boolean m64200d = m64200d();
        this.f45436b.remove(c18045a);
        this.f45437c.remove(c18045a);
        if (!m64200d || m64200d()) {
            return;
        }
        C18054f.m64167a().m64162c();
    }
}
