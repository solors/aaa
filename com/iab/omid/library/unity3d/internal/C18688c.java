package com.iab.omid.library.unity3d.internal;

import com.iab.omid.library.unity3d.adsession.C18678a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.unity3d.internal.c */
/* loaded from: classes6.dex */
public class C18688c {

    /* renamed from: c */
    private static C18688c f46756c = new C18688c();

    /* renamed from: a */
    private final ArrayList<C18678a> f46757a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C18678a> f46758b = new ArrayList<>();

    private C18688c() {
    }

    /* renamed from: c */
    public static C18688c m61749c() {
        return f46756c;
    }

    /* renamed from: a */
    public Collection<C18678a> m61753a() {
        return Collections.unmodifiableCollection(this.f46758b);
    }

    /* renamed from: b */
    public Collection<C18678a> m61751b() {
        return Collections.unmodifiableCollection(this.f46757a);
    }

    /* renamed from: d */
    public boolean m61747d() {
        if (this.f46758b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m61752a(C18678a c18678a) {
        this.f46757a.add(c18678a);
    }

    /* renamed from: b */
    public void m61750b(C18678a c18678a) {
        boolean m61747d = m61747d();
        this.f46757a.remove(c18678a);
        this.f46758b.remove(c18678a);
        if (!m61747d || m61747d()) {
            return;
        }
        C18695h.m61707c().m61705e();
    }

    /* renamed from: c */
    public void m61748c(C18678a c18678a) {
        boolean m61747d = m61747d();
        this.f46758b.add(c18678a);
        if (m61747d) {
            return;
        }
        C18695h.m61707c().m61706d();
    }
}
