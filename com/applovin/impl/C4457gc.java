package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.impl.C3997a9;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.applovin.impl.gc */
/* loaded from: classes2.dex */
public final class C4457gc {

    /* renamed from: a */
    private final InterfaceC4747l3 f6384a;

    /* renamed from: b */
    private final InterfaceC4576ia f6385b;

    /* renamed from: c */
    private final InterfaceC4459b f6386c;

    /* renamed from: d */
    private final CopyOnWriteArraySet f6387d;

    /* renamed from: e */
    private final ArrayDeque f6388e;

    /* renamed from: f */
    private final ArrayDeque f6389f;

    /* renamed from: g */
    private boolean f6390g;

    /* renamed from: com.applovin.impl.gc$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4458a {
        /* renamed from: a */
        void mo92305a(Object obj);
    }

    /* renamed from: com.applovin.impl.gc$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC4459b {
        /* renamed from: a */
        void mo98965a(Object obj, C3997a9 c3997a9);
    }

    public C4457gc(Looper looper, InterfaceC4747l3 interfaceC4747l3, InterfaceC4459b interfaceC4459b) {
        this(new CopyOnWriteArraySet(), looper, interfaceC4747l3, interfaceC4459b);
    }

    /* renamed from: b */
    public static /* synthetic */ void m98967b(CopyOnWriteArraySet copyOnWriteArraySet, int i, InterfaceC4458a interfaceC4458a) {
        m98971a(copyOnWriteArraySet, i, interfaceC4458a);
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m98966c(C4457gc c4457gc, Message message) {
        return c4457gc.m98973a(message);
    }

    /* renamed from: a */
    public void m98972a(Object obj) {
        if (this.f6390g) {
            return;
        }
        AbstractC4100b1.m100583a(obj);
        this.f6387d.add(new C4460c(obj));
    }

    private C4457gc(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, InterfaceC4747l3 interfaceC4747l3, InterfaceC4459b interfaceC4459b) {
        this.f6384a = interfaceC4747l3;
        this.f6387d = copyOnWriteArraySet;
        this.f6386c = interfaceC4459b;
        this.f6388e = new ArrayDeque();
        this.f6389f = new ArrayDeque();
        this.f6385b = interfaceC4747l3.mo93851a(looper, new Handler.Callback() { // from class: com.applovin.impl.kx
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return C4457gc.m98966c(C4457gc.this, message);
            }
        });
    }

    /* renamed from: b */
    public void m98970b() {
        Iterator it = this.f6387d.iterator();
        while (it.hasNext()) {
            ((C4460c) it.next()).m98962b(this.f6386c);
        }
        this.f6387d.clear();
        this.f6390g = true;
    }

    /* renamed from: com.applovin.impl.gc$c */
    /* loaded from: classes2.dex */
    public static final class C4460c {

        /* renamed from: a */
        public final Object f6391a;

        /* renamed from: b */
        private C3997a9.C3999b f6392b = new C3997a9.C3999b();

        /* renamed from: c */
        private boolean f6393c;

        /* renamed from: d */
        private boolean f6394d;

        public C4460c(Object obj) {
            this.f6391a = obj;
        }

        /* renamed from: a */
        public void m98964a(int i, InterfaceC4458a interfaceC4458a) {
            if (this.f6394d) {
                return;
            }
            if (i != -1) {
                this.f6392b.m101016a(i);
            }
            this.f6393c = true;
            interfaceC4458a.mo92305a(this.f6391a);
        }

        /* renamed from: b */
        public void m98962b(InterfaceC4459b interfaceC4459b) {
            this.f6394d = true;
            if (this.f6393c) {
                interfaceC4459b.mo98965a(this.f6391a, this.f6392b.m101017a());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C4460c.class == obj.getClass()) {
                return this.f6391a.equals(((C4460c) obj).f6391a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6391a.hashCode();
        }

        /* renamed from: a */
        public void m98963a(InterfaceC4459b interfaceC4459b) {
            if (this.f6394d || !this.f6393c) {
                return;
            }
            C3997a9 m101017a = this.f6392b.m101017a();
            this.f6392b = new C3997a9.C3999b();
            this.f6393c = false;
            interfaceC4459b.mo98965a(this.f6391a, m101017a);
        }
    }

    /* renamed from: a */
    public void m98976a() {
        if (this.f6389f.isEmpty()) {
            return;
        }
        if (!this.f6385b.mo93484a(0)) {
            InterfaceC4576ia interfaceC4576ia = this.f6385b;
            interfaceC4576ia.mo93479a(interfaceC4576ia.mo93472d(0));
        }
        boolean z = !this.f6388e.isEmpty();
        this.f6388e.addAll(this.f6389f);
        this.f6389f.clear();
        if (z) {
            return;
        }
        while (!this.f6388e.isEmpty()) {
            ((Runnable) this.f6388e.peekFirst()).run();
            this.f6388e.removeFirst();
        }
    }

    /* renamed from: b */
    public void m98968b(Object obj) {
        Iterator it = this.f6387d.iterator();
        while (it.hasNext()) {
            C4460c c4460c = (C4460c) it.next();
            if (c4460c.f6391a.equals(obj)) {
                c4460c.m98962b(this.f6386c);
                this.f6387d.remove(c4460c);
            }
        }
    }

    /* renamed from: b */
    public void m98969b(int i, InterfaceC4458a interfaceC4458a) {
        m98975a(i, interfaceC4458a);
        m98976a();
    }

    /* renamed from: a */
    public boolean m98973a(Message message) {
        Iterator it = this.f6387d.iterator();
        while (it.hasNext()) {
            ((C4460c) it.next()).m98963a(this.f6386c);
            if (this.f6385b.mo93484a(0)) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static /* synthetic */ void m98971a(CopyOnWriteArraySet copyOnWriteArraySet, int i, InterfaceC4458a interfaceC4458a) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((C4460c) it.next()).m98964a(i, interfaceC4458a);
        }
    }

    /* renamed from: a */
    public void m98975a(final int i, final InterfaceC4458a interfaceC4458a) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f6387d);
        this.f6389f.add(new Runnable() { // from class: com.applovin.impl.jx
            @Override // java.lang.Runnable
            public final void run() {
                C4457gc.m98967b(copyOnWriteArraySet, i, interfaceC4458a);
            }
        });
    }

    /* renamed from: a */
    public C4457gc m98974a(Looper looper, InterfaceC4459b interfaceC4459b) {
        return new C4457gc(this.f6387d, looper, this.f6384a, interfaceC4459b);
    }
}
