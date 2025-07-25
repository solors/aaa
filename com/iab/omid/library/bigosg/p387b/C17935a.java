package com.iab.omid.library.bigosg.p387b;

import com.iab.omid.library.bigosg.adsession.C17933a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.bigosg.b.a */
/* loaded from: classes6.dex */
public class C17935a {

    /* renamed from: a */
    private static C17935a f45190a = new C17935a();

    /* renamed from: b */
    private final ArrayList<C17933a> f45191b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C17933a> f45192c = new ArrayList<>();

    private C17935a() {
    }

    /* renamed from: a */
    public static C17935a m64659a() {
        return f45190a;
    }

    /* renamed from: b */
    public Collection<C17933a> m64657b() {
        return Collections.unmodifiableCollection(this.f45191b);
    }

    /* renamed from: c */
    public Collection<C17933a> m64655c() {
        return Collections.unmodifiableCollection(this.f45192c);
    }

    /* renamed from: d */
    public boolean m64653d() {
        if (this.f45192c.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m64658a(C17933a c17933a) {
        this.f45191b.add(c17933a);
    }

    /* renamed from: b */
    public void m64656b(C17933a c17933a) {
        boolean m64653d = m64653d();
        this.f45192c.add(c17933a);
        if (m64653d) {
            return;
        }
        C17943f.m64617a().m64613b();
    }

    /* renamed from: c */
    public void m64654c(C17933a c17933a) {
        boolean m64653d = m64653d();
        this.f45191b.remove(c17933a);
        this.f45192c.remove(c17933a);
        if (!m64653d || m64653d()) {
            return;
        }
        C17943f.m64617a().m64612c();
    }
}
