package com.iab.omid.library.mobilefuse.internal;

import com.iab.omid.library.mobilefuse.adsession.C18356a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.mobilefuse.internal.c */
/* loaded from: classes6.dex */
public class C18366c {

    /* renamed from: c */
    private static C18366c f46087c = new C18366c();

    /* renamed from: a */
    private final ArrayList<C18356a> f46088a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C18356a> f46089b = new ArrayList<>();

    private C18366c() {
    }

    /* renamed from: c */
    public static C18366c m62999c() {
        return f46087c;
    }

    /* renamed from: a */
    public Collection<C18356a> m63003a() {
        return Collections.unmodifiableCollection(this.f46089b);
    }

    /* renamed from: b */
    public Collection<C18356a> m63001b() {
        return Collections.unmodifiableCollection(this.f46088a);
    }

    /* renamed from: d */
    public boolean m62997d() {
        if (this.f46089b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m63002a(C18356a c18356a) {
        this.f46088a.add(c18356a);
    }

    /* renamed from: b */
    public void m63000b(C18356a c18356a) {
        boolean m62997d = m62997d();
        this.f46088a.remove(c18356a);
        this.f46089b.remove(c18356a);
        if (!m62997d || m62997d()) {
            return;
        }
        C18374i.m62949c().m62947e();
    }

    /* renamed from: c */
    public void m62998c(C18356a c18356a) {
        boolean m62997d = m62997d();
        this.f46089b.add(c18356a);
        if (m62997d) {
            return;
        }
        C18374i.m62949c().m62948d();
    }
}
