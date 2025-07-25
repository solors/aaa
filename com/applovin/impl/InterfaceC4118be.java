package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.InterfaceC4058ae;
import com.applovin.impl.InterfaceC4118be;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.applovin.impl.be */
/* loaded from: classes2.dex */
public interface InterfaceC4118be {

    /* renamed from: com.applovin.impl.be$a */
    /* loaded from: classes2.dex */
    public static class C4119a {

        /* renamed from: a */
        public final int f4994a;

        /* renamed from: b */
        public final InterfaceC4058ae.C4059a f4995b;

        /* renamed from: c */
        private final CopyOnWriteArrayList f4996c;

        /* renamed from: d */
        private final long f4997d;

        /* renamed from: com.applovin.impl.be$a$a */
        /* loaded from: classes2.dex */
        public static final class C4120a {

            /* renamed from: a */
            public Handler f4998a;

            /* renamed from: b */
            public InterfaceC4118be f4999b;

            public C4120a(Handler handler, InterfaceC4118be interfaceC4118be) {
                this.f4998a = handler;
                this.f4999b = interfaceC4118be;
            }
        }

        public C4119a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private C4119a(CopyOnWriteArrayList copyOnWriteArrayList, int i, InterfaceC4058ae.C4059a c4059a, long j) {
            this.f4996c = copyOnWriteArrayList;
            this.f4994a = i;
            this.f4995b = c4059a;
            this.f4997d = j;
        }

        /* renamed from: b */
        public /* synthetic */ void m100453b(InterfaceC4118be interfaceC4118be, C4827mc c4827mc, C5558td c5558td) {
            interfaceC4118be.mo96109c(this.f4994a, this.f4995b, c4827mc, c5558td);
        }

        /* renamed from: c */
        public /* synthetic */ void m100449c(InterfaceC4118be interfaceC4118be, C4827mc c4827mc, C5558td c5558td) {
            interfaceC4118be.mo96129b(this.f4994a, this.f4995b, c4827mc, c5558td);
        }

        /* renamed from: a */
        public void m100465a(Handler handler, InterfaceC4118be interfaceC4118be) {
            AbstractC4100b1.m100583a(handler);
            AbstractC4100b1.m100583a(interfaceC4118be);
            this.f4996c.add(new C4120a(handler, interfaceC4118be));
        }

        /* renamed from: b */
        public void m100452b(C4827mc c4827mc, int i, int i2, C4310e9 c4310e9, int i3, Object obj, long j, long j2) {
            m100451b(c4827mc, new C5558td(i, i2, c4310e9, i3, obj, m100466a(j), m100466a(j2)));
        }

        /* renamed from: c */
        public void m100448c(C4827mc c4827mc, int i, int i2, C4310e9 c4310e9, int i3, Object obj, long j, long j2) {
            m100447c(c4827mc, new C5558td(i, i2, c4310e9, i3, obj, m100466a(j), m100466a(j2)));
        }

        /* renamed from: a */
        private long m100466a(long j) {
            long m94552b = AbstractC5538t2.m94552b(j);
            if (m94552b == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f4997d + m94552b;
        }

        /* renamed from: a */
        public void m100467a(int i, C4310e9 c4310e9, int i2, Object obj, long j) {
            m100455a(new C5558td(1, i, c4310e9, i2, obj, m100466a(j), -9223372036854775807L));
        }

        /* renamed from: b */
        public void m100451b(final C4827mc c4827mc, final C5558td c5558td) {
            Iterator it = this.f4996c.iterator();
            while (it.hasNext()) {
                C4120a c4120a = (C4120a) it.next();
                final InterfaceC4118be interfaceC4118be = c4120a.f4999b;
                AbstractC5863xp.m93028a(c4120a.f4998a, new Runnable() { // from class: com.applovin.impl.tt
                    {
                        InterfaceC4118be.C4119a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4118be.C4119a.this.m100453b(interfaceC4118be, c4827mc, c5558td);
                    }
                });
            }
        }

        /* renamed from: c */
        public void m100447c(final C4827mc c4827mc, final C5558td c5558td) {
            Iterator it = this.f4996c.iterator();
            while (it.hasNext()) {
                C4120a c4120a = (C4120a) it.next();
                final InterfaceC4118be interfaceC4118be = c4120a.f4999b;
                AbstractC5863xp.m93028a(c4120a.f4998a, new Runnable() { // from class: com.applovin.impl.xt
                    {
                        InterfaceC4118be.C4119a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4118be.C4119a.this.m100449c(interfaceC4118be, c4827mc, c5558td);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m100455a(final C5558td c5558td) {
            Iterator it = this.f4996c.iterator();
            while (it.hasNext()) {
                C4120a c4120a = (C4120a) it.next();
                final InterfaceC4118be interfaceC4118be = c4120a.f4999b;
                AbstractC5863xp.m93028a(c4120a.f4998a, new Runnable() { // from class: com.applovin.impl.ut
                    {
                        InterfaceC4118be.C4119a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4118be.C4119a.this.m100460a(interfaceC4118be, c5558td);
                    }
                });
            }
        }

        /* renamed from: a */
        public /* synthetic */ void m100460a(InterfaceC4118be interfaceC4118be, C5558td c5558td) {
            interfaceC4118be.mo96183a(this.f4994a, this.f4995b, c5558td);
        }

        /* renamed from: a */
        public /* synthetic */ void m100462a(InterfaceC4118be interfaceC4118be, C4827mc c4827mc, C5558td c5558td) {
            interfaceC4118be.mo96185a(this.f4994a, this.f4995b, c4827mc, c5558td);
        }

        /* renamed from: a */
        public /* synthetic */ void m100461a(InterfaceC4118be interfaceC4118be, C4827mc c4827mc, C5558td c5558td, IOException iOException, boolean z) {
            interfaceC4118be.mo96184a(this.f4994a, this.f4995b, c4827mc, c5558td, iOException, z);
        }

        /* renamed from: a */
        public void m100459a(C4827mc c4827mc, int i, int i2, C4310e9 c4310e9, int i3, Object obj, long j, long j2) {
            m100457a(c4827mc, new C5558td(i, i2, c4310e9, i3, obj, m100466a(j), m100466a(j2)));
        }

        /* renamed from: a */
        public void m100457a(final C4827mc c4827mc, final C5558td c5558td) {
            Iterator it = this.f4996c.iterator();
            while (it.hasNext()) {
                C4120a c4120a = (C4120a) it.next();
                final InterfaceC4118be interfaceC4118be = c4120a.f4999b;
                AbstractC5863xp.m93028a(c4120a.f4998a, new Runnable() { // from class: com.applovin.impl.wt
                    {
                        InterfaceC4118be.C4119a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4118be.C4119a.this.m100462a(interfaceC4118be, c4827mc, c5558td);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m100458a(C4827mc c4827mc, int i, int i2, C4310e9 c4310e9, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            m100456a(c4827mc, new C5558td(i, i2, c4310e9, i3, obj, m100466a(j), m100466a(j2)), iOException, z);
        }

        /* renamed from: a */
        public void m100456a(final C4827mc c4827mc, final C5558td c5558td, final IOException iOException, final boolean z) {
            Iterator it = this.f4996c.iterator();
            while (it.hasNext()) {
                C4120a c4120a = (C4120a) it.next();
                final InterfaceC4118be interfaceC4118be = c4120a.f4999b;
                AbstractC5863xp.m93028a(c4120a.f4998a, new Runnable() { // from class: com.applovin.impl.vt
                    {
                        InterfaceC4118be.C4119a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4118be.C4119a.this.m100461a(interfaceC4118be, c4827mc, c5558td, iOException, z);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m100463a(InterfaceC4118be interfaceC4118be) {
            Iterator it = this.f4996c.iterator();
            while (it.hasNext()) {
                C4120a c4120a = (C4120a) it.next();
                if (c4120a.f4999b == interfaceC4118be) {
                    this.f4996c.remove(c4120a);
                }
            }
        }

        /* renamed from: a */
        public C4119a m100468a(int i, InterfaceC4058ae.C4059a c4059a, long j) {
            return new C4119a(this.f4996c, i, c4059a, j);
        }
    }

    /* renamed from: a */
    void mo96185a(int i, InterfaceC4058ae.C4059a c4059a, C4827mc c4827mc, C5558td c5558td);

    /* renamed from: a */
    void mo96184a(int i, InterfaceC4058ae.C4059a c4059a, C4827mc c4827mc, C5558td c5558td, IOException iOException, boolean z);

    /* renamed from: a */
    void mo96183a(int i, InterfaceC4058ae.C4059a c4059a, C5558td c5558td);

    /* renamed from: b */
    void mo96129b(int i, InterfaceC4058ae.C4059a c4059a, C4827mc c4827mc, C5558td c5558td);

    /* renamed from: c */
    void mo96109c(int i, InterfaceC4058ae.C4059a c4059a, C4827mc c4827mc, C5558td c5558td);
}
