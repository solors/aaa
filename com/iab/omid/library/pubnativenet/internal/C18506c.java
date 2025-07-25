package com.iab.omid.library.pubnativenet.internal;

import com.iab.omid.library.pubnativenet.adsession.C18496a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.pubnativenet.internal.c */
/* loaded from: classes6.dex */
public class C18506c {

    /* renamed from: c */
    private static C18506c f46357c = new C18506c();

    /* renamed from: a */
    private final ArrayList<C18496a> f46358a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C18496a> f46359b = new ArrayList<>();

    private C18506c() {
    }

    /* renamed from: c */
    public static C18506c m62493c() {
        return f46357c;
    }

    /* renamed from: a */
    public Collection<C18496a> m62497a() {
        return Collections.unmodifiableCollection(this.f46359b);
    }

    /* renamed from: b */
    public Collection<C18496a> m62495b() {
        return Collections.unmodifiableCollection(this.f46358a);
    }

    /* renamed from: d */
    public boolean m62491d() {
        if (this.f46359b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m62496a(C18496a c18496a) {
        this.f46358a.add(c18496a);
    }

    /* renamed from: b */
    public void m62494b(C18496a c18496a) {
        boolean m62491d = m62491d();
        this.f46358a.remove(c18496a);
        this.f46359b.remove(c18496a);
        if (!m62491d || m62491d()) {
            return;
        }
        C18514i.m62443c().m62441e();
    }

    /* renamed from: c */
    public void m62492c(C18496a c18496a) {
        boolean m62491d = m62491d();
        this.f46359b.add(c18496a);
        if (m62491d) {
            return;
        }
        C18514i.m62443c().m62442d();
    }
}
