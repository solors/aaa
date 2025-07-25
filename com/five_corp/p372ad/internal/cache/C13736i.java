package com.five_corp.p372ad.internal.cache;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;
import com.five_corp.p372ad.internal.storage.C14081f;
import com.five_corp.p372ad.internal.util.C14118f;
import com.five_corp.p372ad.internal.util.C14120h;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.five_corp.ad.internal.cache.i */
/* loaded from: classes4.dex */
public final class C13736i {

    /* renamed from: a */
    public final C13741n f25515a;

    /* renamed from: b */
    public final String f25516b;

    /* renamed from: c */
    public final Handler f25517c;

    /* renamed from: d */
    public final Object f25518d = new Object();

    /* renamed from: e */
    public boolean f25519e = false;

    /* renamed from: f */
    public WeakReference f25520f = null;

    /* renamed from: g */
    public C14120h f25521g = new C14120h();

    public C13736i(C13741n c13741n, String str, Handler handler) {
        this.f25515a = c13741n;
        this.f25516b = str;
        this.f25517c = handler;
    }

    /* renamed from: a */
    public final void m78417a(InterfaceC13732e interfaceC13732e) {
        synchronized (this.f25518d) {
            if (this.f25519e) {
                this.f25521g.f26749a.add(new WeakReference(interfaceC13732e));
                return;
            }
            WeakReference weakReference = this.f25520f;
            Bitmap bitmap = weakReference != null ? (Bitmap) weakReference.get() : null;
            if (bitmap == null) {
                this.f25521g.f26749a.add(new WeakReference(interfaceC13732e));
                this.f25520f = null;
                this.f25519e = true;
            }
            if (bitmap != null) {
                this.f25517c.post(new RunnableC13735h(interfaceC13732e, bitmap));
            } else {
                this.f25515a.m78411a(this);
            }
        }
    }

    /* renamed from: a */
    public final void m78416a(C14068s c14068s) {
        ArrayList arrayList;
        synchronized (this.f25518d) {
            this.f25519e = false;
            C14120h c14120h = this.f25521g;
            c14120h.getClass();
            arrayList = new ArrayList();
            c14120h.m78083a((AbstractCollection) arrayList);
            this.f25521g = new C14120h();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f25517c.post(new RunnableC13734g((InterfaceC13732e) it.next(), c14068s));
        }
    }

    /* renamed from: a */
    public final void m78415a(C14081f c14081f) {
        C14118f c14118f;
        ArrayList arrayList;
        try {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c14081f.f26268a, 0, c14081f.f26269b);
            if (decodeByteArray == null) {
                c14118f = new C14118f(false, new C14068s(EnumC14106t.f26407L, String.format("BitmapFactory.decodeByteArray return null: URL: %s, Size: %d.", this.f25516b, Integer.valueOf(c14081f.f26269b)), null, null), null);
            } else {
                c14118f = new C14118f(true, null, decodeByteArray);
            }
        } catch (OutOfMemoryError e) {
            c14118f = new C14118f(false, new C14068s(EnumC14106t.f26415M, String.format("BitmapFactory.decodeByteArray raise OutOfMemoryError: URL: %s, Size: %d.", this.f25516b, Integer.valueOf(c14081f.f26269b)), e, null), null);
        }
        if (!c14118f.f26746a) {
            m78416a(c14118f.f26747b);
            return;
        }
        synchronized (this.f25518d) {
            this.f25519e = false;
            this.f25520f = new WeakReference((Bitmap) c14118f.f26748c);
            C14120h c14120h = this.f25521g;
            c14120h.getClass();
            arrayList = new ArrayList();
            c14120h.m78083a((AbstractCollection) arrayList);
            this.f25521g = new C14120h();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f25517c.post(new RunnableC13735h((InterfaceC13732e) it.next(), (Bitmap) c14118f.f26748c));
        }
    }
}
