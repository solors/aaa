package com.five_corp.p372ad.internal.http.movcache;

import android.os.Handler;
import android.os.HandlerThread;
import com.five_corp.p372ad.CreativeType;
import com.five_corp.p372ad.internal.cache.C13741n;
import com.five_corp.p372ad.internal.cache.C13750w;
import com.five_corp.p372ad.internal.cache.InterfaceC13751x;
import com.five_corp.p372ad.internal.context.C13760i;
import com.five_corp.p372ad.internal.http.AbstractC13796b;
import com.five_corp.p372ad.internal.http.C13783a;
import com.five_corp.p372ad.internal.http.client.C13798a;
import com.five_corp.p372ad.internal.http.connection.AbstractC13803c;
import com.five_corp.p372ad.internal.http.connection.C13802b;
import com.five_corp.p372ad.internal.p373ad.C13627a;
import com.five_corp.p372ad.internal.p373ad.C13691u;
import com.five_corp.p372ad.internal.storage.C14080e;
import com.five_corp.p372ad.internal.util.C14118f;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.five_corp.ad.internal.http.movcache.h */
/* loaded from: classes4.dex */
public final class C13812h implements InterfaceC13751x {

    /* renamed from: b */
    public Handler f25738b;

    /* renamed from: c */
    public final C14080e f25739c;

    /* renamed from: d */
    public final AbstractC13803c f25740d;

    /* renamed from: i */
    public Object f25745i = null;

    /* renamed from: a */
    public final HandlerThread f25737a = new HandlerThread("MovieResourceCacheDownloadManager");

    /* renamed from: e */
    public final int f25741e = 2;

    /* renamed from: g */
    public ArrayList f25743g = new ArrayList();

    /* renamed from: h */
    public final ArrayList f25744h = new ArrayList();

    /* renamed from: f */
    public int f25742f = 250000;

    public C13812h(C14080e c14080e, C13802b c13802b) {
        this.f25739c = c14080e;
        this.f25740d = c13802b;
    }

    /* renamed from: a */
    public static C14118f m78339a(C13812h c13812h, C13783a c13783a) {
        c13812h.getClass();
        C13760i c13760i = (C13760i) c13783a.f25655b.get();
        C13627a c13627a = c13760i != null ? c13760i.f25591b : (C13627a) c13783a.f25654a.get();
        if (c13627a != null && c13783a.m78375a() && c13627a.f25184b == CreativeType.MOVIE && c13627a.f25181K == 1 && c13627a.f25180J != 3) {
            C13691u c13691u = c13627a.f25197o;
            C13741n m78117a = c13812h.f25739c.m78117a(c13691u);
            if (m78117a.m78408d()) {
                return new C14118f(true, null, Boolean.FALSE);
            }
            C14118f m78410b = m78117a.m78410b();
            if (!m78410b.f26746a) {
                return new C14118f(false, m78410b.f26747b, null);
            }
            if (c13627a.m78471b() && ((Integer) m78410b.f26748c).intValue() >= c13627a.f25190h.f25400b) {
                return new C14118f(true, null, Boolean.FALSE);
            }
            return c13812h.m78341a(c13691u, m78117a, new C13814j(c13783a));
        }
        return new C14118f(true, null, Boolean.FALSE);
    }

    /* renamed from: b */
    public final void m78338b() {
        Iterator it = this.f25743g.iterator();
        while (it.hasNext()) {
            C13818n c13818n = (C13818n) it.next();
            synchronized (c13818n.f25756g) {
                if (c13818n.f25762m == 5) {
                    c13818n.f25762m = 1;
                    c13818n.f25766q++;
                }
            }
        }
    }

    /* renamed from: c */
    public final void m78337c() {
        int i;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f25743g.iterator();
        while (it.hasNext()) {
            C13818n c13818n = (C13818n) it.next();
            if (c13818n.m78316h()) {
                arrayList.add(c13818n);
            }
        }
        this.f25743g = arrayList;
        while (this.f25744h.size() < this.f25741e) {
            Iterator it2 = this.f25743g.iterator();
            C13818n c13818n2 = null;
            while (it2.hasNext()) {
                C13818n c13818n3 = (C13818n) it2.next();
                if (c13818n3.m78315i()) {
                    if (c13818n2 != null) {
                        if (AbstractC13796b.m78362a(c13818n3.m78318f()) - AbstractC13796b.m78362a(c13818n2.m78318f()) > 0) {
                        }
                    }
                    c13818n2 = c13818n3;
                }
            }
            if (c13818n2 == null) {
                break;
            }
            synchronized (c13818n2.f25756g) {
                if (c13818n2.f25762m == 1) {
                    int i2 = c13818n2.f25760k;
                    boolean z = c13818n2.f25765p;
                    C13798a c13798a = new C13798a(c13818n2.f25750a, c13818n2, c13818n2.f25752c);
                    synchronized (c13818n2.f25756g) {
                        c13818n2.f25762m = 2;
                        c13818n2.f25757h = c13798a;
                    }
                    if (z) {
                        i = 0;
                    } else {
                        i = c13818n2.f25754e;
                    }
                    c13798a.m78356b(i2, i);
                    this.f25744h.add(c13818n2);
                }
            }
        }
        if (this.f25744h.isEmpty()) {
            m78342a();
        }
    }

    /* renamed from: a */
    public static void m78340a(C13812h c13812h) {
        c13812h.f25745i = null;
        Iterator it = c13812h.f25743g.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C13818n c13818n = (C13818n) it.next();
            if (c13818n.m78318f() == 3 && c13818n.m78316h() && c13818n.m78315i()) {
                Iterator it2 = c13812h.f25744h.iterator();
                while (it2.hasNext()) {
                    C13818n c13818n2 = (C13818n) it2.next();
                    if (c13818n2.m78318f() != 3) {
                        synchronized (c13818n2.f25756g) {
                            if (c13818n2.f25762m == 2) {
                                c13818n2.f25757h.m78359a();
                            }
                        }
                    }
                }
            }
        }
        c13812h.m78338b();
        c13812h.m78337c();
    }

    /* renamed from: a */
    public final void m78342a() {
        boolean z;
        Iterator it = this.f25743g.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            C13818n c13818n = (C13818n) it.next();
            if (c13818n.m78316h()) {
                synchronized (c13818n.f25756g) {
                    z = c13818n.f25762m == 5;
                }
                if (z) {
                    j = Math.min(j, c13818n.m78319e());
                }
            }
        }
        if (j != Long.MAX_VALUE) {
            Object obj = new Object();
            this.f25745i = obj;
            this.f25738b.postDelayed(new RunnableC13811g(this, obj), j);
        }
    }

    @Override // com.five_corp.p372ad.internal.cache.InterfaceC13751x
    /* renamed from: a */
    public final void mo78129a(C13750w c13750w) {
        this.f25742f = c13750w.f25563b.f25846e;
    }

    /* renamed from: a */
    public final C14118f m78341a(C13691u c13691u, C13741n c13741n, InterfaceC13813i interfaceC13813i) {
        C13818n c13818n;
        boolean z;
        boolean z2;
        int i;
        if (interfaceC13813i.mo78329e() && !c13741n.m78408d()) {
            Iterator it = this.f25743g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c13818n = null;
                    break;
                }
                c13818n = (C13818n) it.next();
                if (c13818n.f25750a.equals(c13691u)) {
                    break;
                }
            }
            if (c13818n == null) {
                C14118f m78410b = c13741n.m78410b();
                if (!m78410b.f26746a) {
                    return new C14118f(false, m78410b.f26747b, null);
                }
                c13818n = new C13818n(c13691u, c13741n, ((Integer) m78410b.f26748c).intValue(), this.f25740d, this, this.f25742f);
                this.f25743g.add(c13818n);
            }
            boolean mo78330d = interfaceC13813i.mo78330d();
            synchronized (c13818n.f25756g) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = c13818n.f25759j.iterator();
                while (it2.hasNext()) {
                    InterfaceC13813i interfaceC13813i2 = (InterfaceC13813i) it2.next();
                    if (interfaceC13813i2.mo78329e()) {
                        arrayList.add(interfaceC13813i2);
                    }
                }
                arrayList.add(interfaceC13813i);
                c13818n.f25759j = arrayList;
                if (!c13818n.f25765p && mo78330d) {
                    c13818n.f25765p = true;
                }
                z = c13818n.f25762m == 3;
                z2 = c13818n.f25763n;
                i = c13818n.f25760k;
            }
            if (!z) {
                interfaceC13813i.mo78334a(i, z2, c13818n.f25755f, false);
            } else if (interfaceC13813i.mo78335a(i)) {
                interfaceC13813i.mo78334a(i, z2, c13818n.f25755f, false);
                c13818n.m78313k();
            } else {
                interfaceC13813i.mo78334a(i, z2, c13818n.f25755f, true);
            }
            return new C14118f(true, null, Boolean.TRUE);
        }
        return new C14118f(true, null, Boolean.FALSE);
    }
}
