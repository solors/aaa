package com.iab.omid.library.appodeal.internal;

import com.iab.omid.library.appodeal.adsession.C17867a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.appodeal.internal.c */
/* loaded from: classes6.dex */
public class C17877c {

    /* renamed from: c */
    private static C17877c f45064c = new C17877c();

    /* renamed from: a */
    private final ArrayList<C17867a> f45065a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C17867a> f45066b = new ArrayList<>();

    private C17877c() {
    }

    /* renamed from: c */
    public static C17877c m64898c() {
        return f45064c;
    }

    /* renamed from: a */
    public Collection<C17867a> m64902a() {
        return Collections.unmodifiableCollection(this.f45066b);
    }

    /* renamed from: b */
    public Collection<C17867a> m64900b() {
        return Collections.unmodifiableCollection(this.f45065a);
    }

    /* renamed from: d */
    public boolean m64896d() {
        if (this.f45066b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m64901a(C17867a c17867a) {
        this.f45065a.add(c17867a);
    }

    /* renamed from: b */
    public void m64899b(C17867a c17867a) {
        boolean m64896d = m64896d();
        this.f45065a.remove(c17867a);
        this.f45066b.remove(c17867a);
        if (!m64896d || m64896d()) {
            return;
        }
        C17885i.m64848c().m64846e();
    }

    /* renamed from: c */
    public void m64897c(C17867a c17867a) {
        boolean m64896d = m64896d();
        this.f45066b.add(c17867a);
        if (m64896d) {
            return;
        }
        C17885i.m64848c().m64847d();
    }
}
