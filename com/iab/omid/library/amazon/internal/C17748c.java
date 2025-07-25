package com.iab.omid.library.amazon.internal;

import com.iab.omid.library.amazon.adsession.C17738a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.amazon.internal.c */
/* loaded from: classes6.dex */
public class C17748c {

    /* renamed from: c */
    private static C17748c f44806c = new C17748c();

    /* renamed from: a */
    private final ArrayList<C17738a> f44807a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C17738a> f44808b = new ArrayList<>();

    private C17748c() {
    }

    /* renamed from: c */
    public static C17748c m65380c() {
        return f44806c;
    }

    /* renamed from: a */
    public Collection<C17738a> m65384a() {
        return Collections.unmodifiableCollection(this.f44808b);
    }

    /* renamed from: b */
    public Collection<C17738a> m65382b() {
        return Collections.unmodifiableCollection(this.f44807a);
    }

    /* renamed from: d */
    public boolean m65378d() {
        if (this.f44808b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m65383a(C17738a c17738a) {
        this.f44807a.add(c17738a);
    }

    /* renamed from: b */
    public void m65381b(C17738a c17738a) {
        boolean m65378d = m65378d();
        this.f44807a.remove(c17738a);
        this.f44808b.remove(c17738a);
        if (!m65378d || m65378d()) {
            return;
        }
        C17756i.m65331c().m65329e();
    }

    /* renamed from: c */
    public void m65379c(C17738a c17738a) {
        boolean m65378d = m65378d();
        this.f44808b.add(c17738a);
        if (m65378d) {
            return;
        }
        C17756i.m65331c().m65330d();
    }
}
