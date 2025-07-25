package com.five_corp.p372ad.internal.http.auxcache;

import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;
import com.five_corp.p372ad.internal.cache.C13741n;
import com.five_corp.p372ad.internal.cache.InterfaceC13740m;
import com.five_corp.p372ad.internal.cache.RunnableC13737j;
import com.five_corp.p372ad.internal.http.client.C13798a;
import com.five_corp.p372ad.internal.http.client.InterfaceC13799b;
import com.five_corp.p372ad.internal.http.connection.AbstractC13803c;
import com.five_corp.p372ad.internal.p373ad.C13691u;
import com.five_corp.p372ad.internal.storage.C14092q;
import com.five_corp.p372ad.internal.storage.InterfaceC14091p;
import com.five_corp.p372ad.internal.storage.RunnableC14088m;
import com.five_corp.p372ad.internal.storage.RunnableC14090o;
import com.five_corp.p372ad.internal.util.C14118f;
import java.util.ArrayList;

/* renamed from: com.five_corp.ad.internal.http.auxcache.j */
/* loaded from: classes4.dex */
public final class C13793j implements InterfaceC13799b, InterfaceC14091p, InterfaceC13740m {

    /* renamed from: a */
    public final C13691u f25685a;

    /* renamed from: b */
    public final C13741n f25686b;

    /* renamed from: c */
    public final ArrayList f25687c;

    /* renamed from: d */
    public final AbstractC13803c f25688d;

    /* renamed from: e */
    public final C13792i f25689e;

    /* renamed from: f */
    public final Object f25690f;

    /* renamed from: g */
    public C13798a f25691g;

    /* renamed from: h */
    public C14092q f25692h;

    /* renamed from: i */
    public int f25693i;

    /* renamed from: j */
    public boolean f25694j;

    /* renamed from: k */
    public boolean f25695k;

    /* renamed from: l */
    public boolean f25696l;

    public C13793j(C13691u c13691u, C13741n c13741n, C13794k c13794k, AbstractC13803c abstractC13803c, C13792i c13792i) {
        this.f25685a = c13691u;
        this.f25686b = c13741n;
        ArrayList arrayList = new ArrayList();
        this.f25687c = arrayList;
        arrayList.add(c13794k);
        this.f25688d = abstractC13803c;
        this.f25689e = c13792i;
        this.f25690f = new Object();
        this.f25691g = null;
        this.f25692h = null;
        this.f25693i = 0;
        this.f25694j = false;
        this.f25695k = false;
        this.f25696l = false;
    }

    @Override // com.five_corp.p372ad.internal.http.client.InterfaceC13799b
    /* renamed from: a */
    public final void mo78328a() {
        C14092q c14092q;
        synchronized (this.f25690f) {
            this.f25691g = null;
            c14092q = this.f25692h;
            this.f25692h = null;
        }
        if (c14092q != null) {
            c14092q.f26294d.post(new RunnableC14090o(c14092q));
        }
        m78369e();
    }

    @Override // com.five_corp.p372ad.internal.storage.InterfaceC14091p
    /* renamed from: b */
    public final void mo78108b(C14068s c14068s) {
        m78370d(c14068s);
    }

    @Override // com.five_corp.p372ad.internal.http.client.InterfaceC13799b
    /* renamed from: c */
    public final void mo78321c(C14068s c14068s) {
        C14092q c14092q;
        synchronized (this.f25690f) {
            this.f25691g = null;
            c14092q = this.f25692h;
            this.f25692h = null;
        }
        if (c14092q != null) {
            c14092q.f26294d.post(new RunnableC14090o(c14092q));
        }
        m78368e(c14068s);
    }

    /* renamed from: d */
    public final void m78370d(C14068s c14068s) {
        C13798a c13798a;
        synchronized (this.f25690f) {
            c13798a = this.f25691g;
        }
        m78368e(c14068s);
        if (c13798a != null) {
            c13798a.m78359a();
        }
    }

    /* renamed from: e */
    public final void m78368e(C14068s c14068s) {
        synchronized (this.f25690f) {
            if (this.f25696l) {
                return;
            }
            this.f25696l = true;
            C13792i c13792i = this.f25689e;
            c13792i.f25674b.post(new RunnableC13790g(c13792i, this, c14068s));
        }
    }

    @Override // com.five_corp.p372ad.internal.cache.InterfaceC13740m
    /* renamed from: b */
    public final void mo78323b() {
        synchronized (this.f25690f) {
            if (this.f25696l) {
                return;
            }
            C13792i c13792i = this.f25689e;
            c13792i.f25674b.post(new RunnableC13788e(c13792i, this));
        }
    }

    @Override // com.five_corp.p372ad.internal.http.client.InterfaceC13799b
    /* renamed from: d */
    public final void mo78320d() {
        C14118f m78412a = this.f25686b.m78412a(0, this);
        if (!m78412a.f26746a) {
            m78368e(m78412a.f26747b);
            return;
        }
        synchronized (this.f25690f) {
            this.f25692h = (C14092q) m78412a.f26748c;
            this.f25694j = true;
        }
    }

    @Override // com.five_corp.p372ad.internal.cache.InterfaceC13740m
    /* renamed from: a */
    public final void mo78325a(C14068s c14068s) {
        m78370d(c14068s);
    }

    @Override // com.five_corp.p372ad.internal.http.client.InterfaceC13799b
    /* renamed from: c */
    public final void mo78322c() {
        C14092q c14092q;
        boolean z;
        synchronized (this.f25690f) {
            this.f25691g = null;
            c14092q = this.f25692h;
            this.f25692h = null;
            z = this.f25694j;
        }
        if (c14092q != null) {
            c14092q.f26294d.post(new RunnableC14090o(c14092q));
        }
        if (z) {
            C13741n c13741n = this.f25686b;
            c13741n.f25527b.post(new RunnableC13737j(c13741n, this));
            return;
        }
        m78369e();
    }

    @Override // com.five_corp.p372ad.internal.http.client.InterfaceC13799b
    /* renamed from: a */
    public final void mo78327a(int i) {
        synchronized (this.f25690f) {
            if (this.f25693i == i) {
                this.f25694j = true;
            } else {
                m78368e(new C14068s(EnumC14106t.f26410L2, null, null, null));
            }
        }
    }

    /* renamed from: e */
    public final void m78369e() {
        synchronized (this.f25690f) {
            if (this.f25696l) {
                return;
            }
            C13792i c13792i = this.f25689e;
            c13792i.f25674b.post(new RunnableC13789f(c13792i, this));
        }
    }

    @Override // com.five_corp.p372ad.internal.http.client.InterfaceC13799b
    /* renamed from: a */
    public final void mo78324a(byte[] bArr, int i) {
        C14092q c14092q;
        synchronized (this.f25690f) {
            c14092q = this.f25692h;
        }
        if (c14092q == null) {
            m78370d(new C14068s(EnumC14106t.f26402K2, null, null, null));
        } else {
            c14092q.f26294d.post(new RunnableC14088m(c14092q, bArr, 0, i));
        }
    }

    @Override // com.five_corp.p372ad.internal.http.client.InterfaceC13799b
    /* renamed from: a */
    public final void mo78326a(int i, int i2, int i3) {
        C14068s c14068s;
        synchronized (this.f25690f) {
            c14068s = this.f25693i < i ? new C14068s(EnumC14106t.f26394J2, null, null, null) : null;
        }
        if (c14068s != null) {
            m78370d(c14068s);
            return;
        }
        C14118f m78412a = this.f25686b.m78412a(i, this);
        if (!m78412a.f26746a) {
            m78368e(m78412a.f26747b);
            return;
        }
        synchronized (this.f25690f) {
            this.f25692h = (C14092q) m78412a.f26748c;
            boolean z = true;
            if (i2 + 1 != i3) {
                z = false;
            }
            this.f25694j = z;
        }
    }
}
