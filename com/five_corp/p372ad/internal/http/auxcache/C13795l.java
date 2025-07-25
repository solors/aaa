package com.five_corp.p372ad.internal.http.auxcache;

import com.five_corp.p372ad.internal.p373ad.C13691u;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.five_corp.ad.internal.http.auxcache.l */
/* loaded from: classes4.dex */
public final class C13795l {

    /* renamed from: a */
    public final long f25707a;

    /* renamed from: b */
    public final ArrayDeque f25708b = new ArrayDeque();

    /* renamed from: c */
    public HashSet f25709c = new HashSet();

    public C13795l(long j) {
        this.f25707a = j;
    }

    /* renamed from: b */
    public static C13795l m78366b() {
        return new C13795l(30000L);
    }

    /* renamed from: c */
    public static C13795l m78365c() {
        return new C13795l(3000L);
    }

    /* renamed from: d */
    public static C13795l m78364d() {
        return new C13795l(500L);
    }

    /* renamed from: a */
    public final long m78367a() {
        long j;
        int i = 10;
        if (this.f25709c.isEmpty()) {
            j = this.f25707a;
        } else {
            Iterator it = this.f25709c.iterator();
            while (it.hasNext()) {
                i = Math.min(i, ((C13794k) it.next()).f25705i);
            }
            j = this.f25707a;
        }
        return j << i;
    }

    /* renamed from: e */
    public final void m78363e() {
        Iterator it = this.f25709c.iterator();
        while (it.hasNext()) {
            C13794k c13794k = (C13794k) it.next();
            c13794k.f25705i++;
            Iterator it2 = c13794k.f25702f.iterator();
            while (it2.hasNext()) {
                c13794k.f25701e.addLast((C13691u) it2.next());
            }
            c13794k.f25702f = new ArrayList();
            this.f25708b.addLast(c13794k);
        }
        this.f25709c = new HashSet();
    }
}
