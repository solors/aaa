package com.iab.omid.library.bytedance2.internal;

import com.iab.omid.library.bytedance2.adsession.C17981a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.bytedance2.internal.c */
/* loaded from: classes6.dex */
public class C17991c {

    /* renamed from: c */
    private static C17991c f45320c = new C17991c();

    /* renamed from: a */
    private final ArrayList<C17981a> f45321a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C17981a> f45322b = new ArrayList<>();

    private C17991c() {
    }

    /* renamed from: c */
    public static C17991c m64431c() {
        return f45320c;
    }

    /* renamed from: a */
    public Collection<C17981a> m64435a() {
        return Collections.unmodifiableCollection(this.f45322b);
    }

    /* renamed from: b */
    public Collection<C17981a> m64433b() {
        return Collections.unmodifiableCollection(this.f45321a);
    }

    /* renamed from: d */
    public boolean m64429d() {
        if (this.f45322b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m64434a(C17981a c17981a) {
        this.f45321a.add(c17981a);
    }

    /* renamed from: b */
    public void m64432b(C17981a c17981a) {
        boolean m64429d = m64429d();
        this.f45321a.remove(c17981a);
        this.f45322b.remove(c17981a);
        if (!m64429d || m64429d()) {
            return;
        }
        C17999i.m64382c().m64380e();
    }

    /* renamed from: c */
    public void m64430c(C17981a c17981a) {
        boolean m64429d = m64429d();
        this.f45322b.add(c17981a);
        if (m64429d) {
            return;
        }
        C17999i.m64382c().m64381d();
    }
}
