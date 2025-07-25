package com.five_corp.p372ad.internal.cache;

import android.os.Handler;
import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;
import com.five_corp.p372ad.internal.movie.partialcache.C13970f;
import com.five_corp.p372ad.internal.storage.C14076a;
import com.five_corp.p372ad.internal.storage.C14078c;
import com.five_corp.p372ad.internal.storage.C14086k;
import com.five_corp.p372ad.internal.storage.C14092q;
import com.five_corp.p372ad.internal.storage.InterfaceC14077b;
import com.five_corp.p372ad.internal.storage.InterfaceC14091p;
import com.five_corp.p372ad.internal.storage.RunnableC14089n;
import com.five_corp.p372ad.internal.util.C14118f;
import com.five_corp.p372ad.internal.util.C14119g;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.five_corp.ad.internal.cache.n */
/* loaded from: classes4.dex */
public final class C13741n {

    /* renamed from: b */
    public final Handler f25527b;

    /* renamed from: c */
    public final C14076a f25528c;

    /* renamed from: d */
    public final C14076a f25529d;

    /* renamed from: e */
    public boolean f25530e;

    /* renamed from: a */
    public final Object f25526a = new Object();

    /* renamed from: f */
    public boolean f25531f = false;

    /* renamed from: g */
    public List f25532g = new ArrayList();

    /* renamed from: h */
    public C13736i f25533h = null;

    /* renamed from: i */
    public WeakReference f25534i = null;

    public C13741n(Handler handler, C14076a c14076a, C14076a c14076a2, boolean z) {
        this.f25527b = handler;
        this.f25528c = c14076a;
        this.f25529d = c14076a2;
        this.f25530e = z;
    }

    /* renamed from: a */
    public final void m78414a() {
        synchronized (this.f25526a) {
            if (this.f25531f) {
                return;
            }
            this.f25531f = true;
            this.f25527b.post(new RunnableC13739l(this));
        }
    }

    /* renamed from: b */
    public final C14118f m78410b() {
        synchronized (this.f25526a) {
            if (this.f25531f) {
                return new C14118f(false, new C14068s(EnumC14106t.f26474T5, null, null, null), null);
            }
            C14076a c14076a = this.f25528c;
            C14118f m78121b = ((C14078c) c14076a.f26255a).m78121b(c14076a.f26256b);
            if (!m78121b.f26746a) {
                return new C14118f(false, m78121b.f26747b, null);
            }
            if (((Boolean) m78121b.f26748c).booleanValue()) {
                return ((C14078c) c14076a.f26255a).m78120c(c14076a.f26256b);
            }
            return new C14118f(true, null, 0);
        }
    }

    /* renamed from: c */
    public final String m78409c() {
        C14118f c14118f;
        C14076a c14076a = this.f25528c;
        InterfaceC14077b interfaceC14077b = c14076a.f26255a;
        String str = c14076a.f26256b;
        C14078c c14078c = (C14078c) interfaceC14077b;
        c14078c.getClass();
        try {
            c14118f = new C14118f(true, null, new File(c14078c.f26258a, str).getAbsolutePath());
        } catch (SecurityException e) {
            c14118f = new C14118f(false, new C14068s(EnumC14106t.f26582i3, null, e, null), null);
        }
        if (!c14118f.f26746a) {
            return null;
        }
        return (String) c14118f.f26748c;
    }

    /* renamed from: d */
    public final boolean m78408d() {
        boolean z;
        synchronized (this.f25526a) {
            if (!this.f25531f && this.f25530e) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: e */
    public final C14119g m78407e() {
        synchronized (this.f25526a) {
            if (this.f25531f) {
                return new C14119g(false, new C14068s(EnumC14106t.f26481U5, null, null, null));
            }
            C14076a c14076a = this.f25528c;
            return ((C14078c) c14076a.f26255a).m78118e(c14076a.f26256b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13741n.class == obj.getClass()) {
            return ((C13741n) obj).f25528c.f26256b.equals(this.f25528c.f26256b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25528c.f26256b.hashCode();
    }

    /* renamed from: a */
    public final C14118f m78413a(int i, C13970f c13970f) {
        synchronized (this.f25526a) {
            if (this.f25531f) {
                return new C14118f(false, new C14068s(EnumC14106t.f26429N5, null, null, null), null);
            }
            WeakReference weakReference = this.f25534i;
            C14092q c14092q = weakReference != null ? (C14092q) weakReference.get() : null;
            if (c14092q != null) {
                c14092q.f26294d.post(new RunnableC14089n(c14092q));
            }
            C14076a c14076a = this.f25528c;
            return new C14118f(true, null, new C14086k(i, c14076a.f26256b, c14076a.f26255a, this.f25527b, c13970f));
        }
    }

    /* renamed from: a */
    public final C14118f m78412a(int i, InterfaceC14091p interfaceC14091p) {
        C14076a c14076a = this.f25528c;
        C14092q c14092q = new C14092q(i, c14076a.f26256b, c14076a.f26255a, this.f25527b, interfaceC14091p, c14076a.f26257c);
        synchronized (this.f25526a) {
            if (this.f25531f) {
                return new C14118f(false, new C14068s(EnumC14106t.f26437O5, null, null, null), null);
            }
            this.f25534i = new WeakReference(c14092q);
            return new C14118f(true, null, c14092q);
        }
    }

    /* renamed from: a */
    public final void m78411a(C13736i c13736i) {
        synchronized (this.f25526a) {
            this.f25532g.add(c13736i);
            if (this.f25530e || this.f25531f) {
                this.f25527b.post(new RunnableC13738k(this));
            }
        }
    }
}
