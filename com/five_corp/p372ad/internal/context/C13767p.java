package com.five_corp.p372ad.internal.context;

import android.os.Handler;
import android.os.Looper;
import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;
import com.five_corp.p372ad.internal.cache.C13750w;
import com.five_corp.p372ad.internal.cache.InterfaceC13751x;
import com.five_corp.p372ad.internal.context.C13767p;
import com.five_corp.p372ad.internal.media_config.C13838a;
import com.five_corp.p372ad.internal.media_config.C13840c;
import com.five_corp.p372ad.internal.util.C14116d;
import java.util.ArrayList;
import java.util.Iterator;
import p003a2.RunnableC0005c;

/* renamed from: com.five_corp.ad.internal.context.p */
/* loaded from: classes4.dex */
public final class C13767p implements InterfaceC13751x {

    /* renamed from: a */
    public final C14116d f25619a;

    /* renamed from: b */
    public final Handler f25620b;

    /* renamed from: c */
    public ArrayList f25621c;

    /* renamed from: d */
    public C13838a f25622d;

    public C13767p(C14116d c14116d) {
        this(c14116d, 0);
    }

    /* renamed from: a */
    public final void m78393a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f25621c.iterator();
        while (it.hasNext()) {
            C13764m c13764m = (C13764m) it.next();
            long j = c13764m.f25616b;
            this.f25619a.getClass();
            if (j < System.currentTimeMillis()) {
                c13764m.f25618d.mo898a(new C14068s(EnumC14106t.f26389I5, null, null, null));
            } else {
                arrayList.add(c13764m);
            }
        }
        this.f25621c = arrayList;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f25620b.postDelayed(new RunnableC0005c(this), 1000L);
    }

    /* renamed from: b */
    public final void m78390b(C13757f c13757f, InterfaceC13765n interfaceC13765n, long j, InterfaceC13766o interfaceC13766o) {
        C13768q c13768q;
        C13838a c13838a = this.f25622d;
        if (c13838a != null) {
            for (C13840c c13840c : c13838a.f25843b) {
                if (c13840c.f25855a.equals(c13757f.f25586c)) {
                    c13768q = new C13768q(c13757f, this.f25622d, c13840c);
                    break;
                }
            }
        }
        c13768q = null;
        if (c13768q != null) {
            interfaceC13765n.mo899a(c13768q);
            return;
        }
        if (this.f25621c.isEmpty()) {
            this.f25620b.postDelayed(new RunnableC0005c(this), 1000L);
        }
        ArrayList arrayList = this.f25621c;
        this.f25619a.getClass();
        arrayList.add(new C13764m(c13757f, interfaceC13765n, System.currentTimeMillis() + j, interfaceC13766o));
    }

    public C13767p(C14116d c14116d, int i) {
        this.f25619a = c14116d;
        this.f25620b = new Handler(Looper.getMainLooper());
        this.f25621c = new ArrayList();
        this.f25622d = null;
    }

    /* renamed from: b */
    public final void m78391b(C13750w c13750w) {
        C13768q c13768q;
        this.f25622d = c13750w.f25563b;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f25621c.iterator();
        while (it.hasNext()) {
            C13764m c13764m = (C13764m) it.next();
            C13757f c13757f = c13764m.f25615a;
            C13838a c13838a = this.f25622d;
            if (c13838a != null) {
                for (C13840c c13840c : c13838a.f25843b) {
                    if (c13840c.f25855a.equals(c13757f.f25586c)) {
                        c13768q = new C13768q(c13757f, this.f25622d, c13840c);
                        break;
                    }
                }
            }
            c13768q = null;
            if (c13768q != null) {
                c13764m.f25617c.mo899a(c13768q);
            } else {
                arrayList.add(c13764m);
            }
        }
        this.f25621c = arrayList;
    }

    /* renamed from: a */
    public final void m78392a(final C13757f c13757f, final InterfaceC13765n interfaceC13765n, final long j, final InterfaceC13766o interfaceC13766o) {
        this.f25620b.post(new Runnable() { // from class: a2.a
            {
                C13767p.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C13767p.this.m78390b(c13757f, interfaceC13765n, j, interfaceC13766o);
            }
        });
    }

    @Override // com.five_corp.p372ad.internal.cache.InterfaceC13751x
    /* renamed from: a */
    public final void mo78129a(final C13750w c13750w) {
        this.f25620b.post(new Runnable() { // from class: a2.b
            {
                C13767p.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C13767p.this.m78391b(c13750w);
            }
        });
    }
}
