package com.iab.omid.library.mmadbridge.internal;

import com.iab.omid.library.mmadbridge.adsession.C18286a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.mmadbridge.internal.c */
/* loaded from: classes6.dex */
public class C18296c {

    /* renamed from: c */
    private static C18296c f45952c = new C18296c();

    /* renamed from: a */
    private final ArrayList<C18286a> f45953a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C18286a> f45954b = new ArrayList<>();

    private C18296c() {
    }

    /* renamed from: c */
    public static C18296c m63252c() {
        return f45952c;
    }

    /* renamed from: a */
    public Collection<C18286a> m63256a() {
        return Collections.unmodifiableCollection(this.f45954b);
    }

    /* renamed from: b */
    public Collection<C18286a> m63254b() {
        return Collections.unmodifiableCollection(this.f45953a);
    }

    /* renamed from: d */
    public boolean m63250d() {
        if (this.f45954b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m63255a(C18286a c18286a) {
        this.f45953a.add(c18286a);
    }

    /* renamed from: b */
    public void m63253b(C18286a c18286a) {
        boolean m63250d = m63250d();
        this.f45953a.remove(c18286a);
        this.f45954b.remove(c18286a);
        if (!m63250d || m63250d()) {
            return;
        }
        C18304i.m63202c().m63200e();
    }

    /* renamed from: c */
    public void m63251c(C18286a c18286a) {
        boolean m63250d = m63250d();
        this.f45954b.add(c18286a);
        if (m63250d) {
            return;
        }
        C18304i.m63202c().m63201d();
    }
}
