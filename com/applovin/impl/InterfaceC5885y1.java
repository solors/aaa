package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.InterfaceC5885y1;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.applovin.impl.y1 */
/* loaded from: classes2.dex */
public interface InterfaceC5885y1 {
    /* renamed from: a */
    InterfaceC5862xo mo92889a();

    /* renamed from: a */
    void mo92888a(Handler handler, InterfaceC5886a interfaceC5886a);

    /* renamed from: a */
    void mo92887a(InterfaceC5886a interfaceC5886a);

    /* renamed from: com.applovin.impl.y1$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC5886a {
        /* renamed from: a */
        void mo92886a(int i, long j, long j2);

        /* renamed from: com.applovin.impl.y1$a$a */
        /* loaded from: classes2.dex */
        public static final class C5887a {

            /* renamed from: a */
            private final CopyOnWriteArrayList f12235a = new CopyOnWriteArrayList();

            /* renamed from: com.applovin.impl.y1$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C5888a {

                /* renamed from: a */
                private final Handler f12236a;

                /* renamed from: b */
                private final InterfaceC5886a f12237b;

                /* renamed from: c */
                private boolean f12238c;

                public C5888a(Handler handler, InterfaceC5886a interfaceC5886a) {
                    this.f12236a = handler;
                    this.f12237b = interfaceC5886a;
                }

                /* renamed from: a */
                public void m92880a() {
                    this.f12238c = true;
                }
            }

            /* renamed from: b */
            public static /* synthetic */ void m92881b(C5888a c5888a, int i, long j, long j2) {
                m92883a(c5888a, i, j, j2);
            }

            /* renamed from: a */
            public void m92884a(Handler handler, InterfaceC5886a interfaceC5886a) {
                AbstractC4100b1.m100583a(handler);
                AbstractC4100b1.m100583a(interfaceC5886a);
                m92882a(interfaceC5886a);
                this.f12235a.add(new C5888a(handler, interfaceC5886a));
            }

            /* renamed from: a */
            public void m92885a(final int i, final long j, final long j2) {
                Iterator it = this.f12235a.iterator();
                while (it.hasNext()) {
                    final C5888a c5888a = (C5888a) it.next();
                    if (!c5888a.f12238c) {
                        c5888a.f12236a.post(new Runnable() { // from class: com.applovin.impl.w80
                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC5885y1.InterfaceC5886a.C5887a.m92881b(InterfaceC5885y1.InterfaceC5886a.C5887a.C5888a.this, i, j, j2);
                            }
                        });
                    }
                }
            }

            /* renamed from: a */
            public static /* synthetic */ void m92883a(C5888a c5888a, int i, long j, long j2) {
                c5888a.f12237b.mo92886a(i, j, j2);
            }

            /* renamed from: a */
            public void m92882a(InterfaceC5886a interfaceC5886a) {
                Iterator it = this.f12235a.iterator();
                while (it.hasNext()) {
                    C5888a c5888a = (C5888a) it.next();
                    if (c5888a.f12237b == interfaceC5886a) {
                        c5888a.m92880a();
                        this.f12235a.remove(c5888a);
                    }
                }
            }
        }
    }
}
