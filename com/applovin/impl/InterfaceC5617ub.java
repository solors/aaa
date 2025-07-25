package com.applovin.impl;

import com.applovin.impl.InterfaceC5617ub;
import java.lang.ref.WeakReference;
import java.util.Stack;

/* renamed from: com.applovin.impl.ub */
/* loaded from: classes2.dex */
public interface InterfaceC5617ub {

    /* renamed from: com.applovin.impl.ub$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC5618a {
        /* renamed from: a */
        Object mo94181a();
    }

    /* renamed from: com.applovin.impl.ub$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC5619b {
        /* renamed from: a */
        void mo94180a(Object obj);
    }

    /* renamed from: com.applovin.impl.ub$c */
    /* loaded from: classes2.dex */
    public static class C5620c implements InterfaceC5617ub {

        /* renamed from: a */
        private final int f11130a;

        /* renamed from: b */
        private final Stack f11131b;

        public C5620c() {
            this(3);
        }

        @Override // com.applovin.impl.InterfaceC5617ub
        /* renamed from: a */
        public synchronized Object mo94179a(InterfaceC5618a interfaceC5618a) {
            return this.f11131b.isEmpty() ? interfaceC5618a.mo94181a() : this.f11131b.pop();
        }

        public C5620c(int i) {
            this.f11131b = new Stack();
            this.f11130a = i;
        }

        @Override // com.applovin.impl.InterfaceC5617ub
        /* renamed from: a */
        public synchronized void mo94177a(Object obj, InterfaceC5619b interfaceC5619b) {
            if (this.f11131b.size() < this.f11130a) {
                this.f11131b.push(obj);
            } else {
                try {
                    interfaceC5619b.mo94180a(obj);
                } catch (RuntimeException e) {
                    AbstractC5106p6.m96592a((Throwable) e);
                }
            }
        }
    }

    /* renamed from: com.applovin.impl.ub$d */
    /* loaded from: classes2.dex */
    public static class C5621d implements InterfaceC5617ub {

        /* renamed from: a */
        private final C5620c f11132a = new C5620c();

        /* renamed from: b */
        public static /* synthetic */ WeakReference m94176b(InterfaceC5618a interfaceC5618a) {
            return new WeakReference(interfaceC5618a.mo94181a());
        }

        /* renamed from: c */
        public static /* synthetic */ WeakReference m94175c(InterfaceC5618a interfaceC5618a) {
            return m94176b(interfaceC5618a);
        }

        /* renamed from: d */
        public static /* synthetic */ void m94174d(InterfaceC5619b interfaceC5619b, Object obj, WeakReference weakReference) {
            interfaceC5619b.mo94180a(obj);
        }

        @Override // com.applovin.impl.InterfaceC5617ub
        /* renamed from: a */
        public Object mo94179a(final InterfaceC5618a interfaceC5618a) {
            Object obj;
            do {
                obj = ((WeakReference) this.f11132a.mo94179a(new InterfaceC5618a() { // from class: com.applovin.impl.p60
                    @Override // com.applovin.impl.InterfaceC5617ub.InterfaceC5618a
                    /* renamed from: a */
                    public final Object mo94181a() {
                        return InterfaceC5617ub.C5621d.m94175c(InterfaceC5617ub.InterfaceC5618a.this);
                    }
                })).get();
            } while (obj == null);
            return obj;
        }

        @Override // com.applovin.impl.InterfaceC5617ub
        /* renamed from: a */
        public void mo94177a(final Object obj, final InterfaceC5619b interfaceC5619b) {
            AbstractC5106p6.m96595a(obj);
            this.f11132a.mo94177a(new WeakReference(obj), new InterfaceC5619b() { // from class: com.applovin.impl.q60
                @Override // com.applovin.impl.InterfaceC5617ub.InterfaceC5619b
                /* renamed from: a */
                public final void mo94180a(Object obj2) {
                    InterfaceC5617ub.C5621d.m94174d(InterfaceC5617ub.InterfaceC5619b.this, obj, (WeakReference) obj2);
                }
            });
        }
    }

    /* renamed from: a */
    Object mo94179a(InterfaceC5618a interfaceC5618a);

    /* renamed from: a */
    void mo94177a(Object obj, InterfaceC5619b interfaceC5619b);
}
