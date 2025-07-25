package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.InterfaceC4058ae;
import com.applovin.impl.InterfaceC5956z6;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.applovin.impl.z6 */
/* loaded from: classes2.dex */
public interface InterfaceC5956z6 {

    /* renamed from: com.applovin.impl.z6$a */
    /* loaded from: classes2.dex */
    public static class C5957a {

        /* renamed from: a */
        public final int f12503a;

        /* renamed from: b */
        public final InterfaceC4058ae.C4059a f12504b;

        /* renamed from: c */
        private final CopyOnWriteArrayList f12505c;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.applovin.impl.z6$a$a */
        /* loaded from: classes2.dex */
        public static final class C5958a {

            /* renamed from: a */
            public Handler f12506a;

            /* renamed from: b */
            public InterfaceC5956z6 f12507b;

            public C5958a(Handler handler, InterfaceC5956z6 interfaceC5956z6) {
                this.f12506a = handler;
                this.f12507b = interfaceC5956z6;
            }
        }

        public C5957a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* renamed from: a */
        public static /* synthetic */ void m92493a(C5957a c5957a, InterfaceC5956z6 interfaceC5956z6) {
            c5957a.m92480d(interfaceC5956z6);
        }

        /* renamed from: b */
        public static /* synthetic */ void m92487b(C5957a c5957a, InterfaceC5956z6 interfaceC5956z6) {
            c5957a.m92492a(interfaceC5956z6);
        }

        /* renamed from: c */
        public static /* synthetic */ void m92484c(C5957a c5957a, InterfaceC5956z6 interfaceC5956z6) {
            c5957a.m92486b(interfaceC5956z6);
        }

        /* renamed from: d */
        public static /* synthetic */ void m92481d(C5957a c5957a, InterfaceC5956z6 interfaceC5956z6, int i) {
            c5957a.m92491a(interfaceC5956z6, i);
        }

        /* renamed from: e */
        public static /* synthetic */ void m92479e(C5957a c5957a, InterfaceC5956z6 interfaceC5956z6) {
            c5957a.m92483c(interfaceC5956z6);
        }

        /* renamed from: f */
        public static /* synthetic */ void m92477f(C5957a c5957a, InterfaceC5956z6 interfaceC5956z6, Exception exc) {
            c5957a.m92490a(interfaceC5956z6, exc);
        }

        private C5957a(CopyOnWriteArrayList copyOnWriteArrayList, int i, InterfaceC4058ae.C4059a c4059a) {
            this.f12505c = copyOnWriteArrayList;
            this.f12503a = i;
            this.f12504b = c4059a;
        }

        /* renamed from: a */
        public void m92494a(Handler handler, InterfaceC5956z6 interfaceC5956z6) {
            AbstractC4100b1.m100583a(handler);
            AbstractC4100b1.m100583a(interfaceC5956z6);
            this.f12505c.add(new C5958a(handler, interfaceC5956z6));
        }

        /* renamed from: b */
        public void m92488b() {
            Iterator it = this.f12505c.iterator();
            while (it.hasNext()) {
                C5958a c5958a = (C5958a) it.next();
                final InterfaceC5956z6 interfaceC5956z6 = c5958a.f12507b;
                AbstractC5863xp.m93028a(c5958a.f12506a, new Runnable() { // from class: com.applovin.impl.e90
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5956z6.C5957a.m92484c(InterfaceC5956z6.C5957a.this, interfaceC5956z6);
                    }
                });
            }
        }

        /* renamed from: c */
        public void m92485c() {
            Iterator it = this.f12505c.iterator();
            while (it.hasNext()) {
                C5958a c5958a = (C5958a) it.next();
                final InterfaceC5956z6 interfaceC5956z6 = c5958a.f12507b;
                AbstractC5863xp.m93028a(c5958a.f12506a, new Runnable() { // from class: com.applovin.impl.f90
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5956z6.C5957a.m92479e(InterfaceC5956z6.C5957a.this, interfaceC5956z6);
                    }
                });
            }
        }

        /* renamed from: d */
        public void m92482d() {
            Iterator it = this.f12505c.iterator();
            while (it.hasNext()) {
                C5958a c5958a = (C5958a) it.next();
                final InterfaceC5956z6 interfaceC5956z6 = c5958a.f12507b;
                AbstractC5863xp.m93028a(c5958a.f12506a, new Runnable() { // from class: com.applovin.impl.d90
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5956z6.C5957a.m92493a(InterfaceC5956z6.C5957a.this, interfaceC5956z6);
                    }
                });
            }
        }

        /* renamed from: e */
        public void m92478e(InterfaceC5956z6 interfaceC5956z6) {
            Iterator it = this.f12505c.iterator();
            while (it.hasNext()) {
                C5958a c5958a = (C5958a) it.next();
                if (c5958a.f12507b == interfaceC5956z6) {
                    this.f12505c.remove(c5958a);
                }
            }
        }

        /* renamed from: b */
        public /* synthetic */ void m92486b(InterfaceC5956z6 interfaceC5956z6) {
            interfaceC5956z6.mo92504a(this.f12503a, this.f12504b);
        }

        /* renamed from: c */
        public /* synthetic */ void m92483c(InterfaceC5956z6 interfaceC5956z6) {
            interfaceC5956z6.mo92500c(this.f12503a, this.f12504b);
        }

        /* renamed from: d */
        public /* synthetic */ void m92480d(InterfaceC5956z6 interfaceC5956z6) {
            interfaceC5956z6.mo92501b(this.f12503a, this.f12504b);
        }

        /* renamed from: a */
        public void m92497a() {
            Iterator it = this.f12505c.iterator();
            while (it.hasNext()) {
                C5958a c5958a = (C5958a) it.next();
                final InterfaceC5956z6 interfaceC5956z6 = c5958a.f12507b;
                AbstractC5863xp.m93028a(c5958a.f12506a, new Runnable() { // from class: com.applovin.impl.h90
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5956z6.C5957a.m92487b(InterfaceC5956z6.C5957a.this, interfaceC5956z6);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m92496a(final int i) {
            Iterator it = this.f12505c.iterator();
            while (it.hasNext()) {
                C5958a c5958a = (C5958a) it.next();
                final InterfaceC5956z6 interfaceC5956z6 = c5958a.f12507b;
                AbstractC5863xp.m93028a(c5958a.f12506a, new Runnable() { // from class: com.applovin.impl.c90
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5956z6.C5957a.m92481d(InterfaceC5956z6.C5957a.this, interfaceC5956z6, i);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m92489a(final Exception exc) {
            Iterator it = this.f12505c.iterator();
            while (it.hasNext()) {
                C5958a c5958a = (C5958a) it.next();
                final InterfaceC5956z6 interfaceC5956z6 = c5958a.f12507b;
                AbstractC5863xp.m93028a(c5958a.f12506a, new Runnable() { // from class: com.applovin.impl.g90
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5956z6.C5957a.m92477f(InterfaceC5956z6.C5957a.this, interfaceC5956z6, exc);
                    }
                });
            }
        }

        /* renamed from: a */
        public /* synthetic */ void m92492a(InterfaceC5956z6 interfaceC5956z6) {
            interfaceC5956z6.mo92499d(this.f12503a, this.f12504b);
        }

        /* renamed from: a */
        public /* synthetic */ void m92491a(InterfaceC5956z6 interfaceC5956z6, int i) {
            interfaceC5956z6.m92498e(this.f12503a, this.f12504b);
            interfaceC5956z6.mo92503a(this.f12503a, this.f12504b, i);
        }

        /* renamed from: a */
        public /* synthetic */ void m92490a(InterfaceC5956z6 interfaceC5956z6, Exception exc) {
            interfaceC5956z6.mo92502a(this.f12503a, this.f12504b, exc);
        }

        /* renamed from: a */
        public C5957a m92495a(int i, InterfaceC4058ae.C4059a c4059a) {
            return new C5957a(this.f12505c, i, c4059a);
        }
    }

    /* renamed from: a */
    void mo92504a(int i, InterfaceC4058ae.C4059a c4059a);

    /* renamed from: a */
    void mo92503a(int i, InterfaceC4058ae.C4059a c4059a, int i2);

    /* renamed from: a */
    void mo92502a(int i, InterfaceC4058ae.C4059a c4059a, Exception exc);

    /* renamed from: b */
    void mo92501b(int i, InterfaceC4058ae.C4059a c4059a);

    /* renamed from: c */
    void mo92500c(int i, InterfaceC4058ae.C4059a c4059a);

    /* renamed from: d */
    void mo92499d(int i, InterfaceC4058ae.C4059a c4059a);

    /* renamed from: e */
    default void m92498e(int i, InterfaceC4058ae.C4059a c4059a) {
    }
}
