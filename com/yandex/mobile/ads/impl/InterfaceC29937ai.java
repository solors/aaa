package com.yandex.mobile.ads.impl;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC29937ai;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.mobile.ads.impl.ai */
/* loaded from: classes8.dex */
public interface InterfaceC29937ai {
    @Nullable
    /* renamed from: a */
    C31857xx mo27175a();

    /* renamed from: a */
    void mo27172a(Handler handler, InterfaceC31346sc interfaceC31346sc);

    /* renamed from: a */
    void mo27171a(InterfaceC31346sc interfaceC31346sc);

    /* renamed from: com.yandex.mobile.ads.impl.ai$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC29938a {
        /* renamed from: b */
        void mo29427b(int i, long j, long j2);

        /* renamed from: com.yandex.mobile.ads.impl.ai$a$a */
        /* loaded from: classes8.dex */
        public static final class C29939a {

            /* renamed from: a */
            private final CopyOnWriteArrayList<C29940a> f76795a = new CopyOnWriteArrayList<>();

            /* renamed from: com.yandex.mobile.ads.impl.ai$a$a$a */
            /* loaded from: classes8.dex */
            public static final class C29940a {

                /* renamed from: a */
                private final Handler f76796a;

                /* renamed from: b */
                private final InterfaceC29938a f76797b;

                /* renamed from: c */
                private boolean f76798c;

                public C29940a(Handler handler, InterfaceC31346sc interfaceC31346sc) {
                    this.f76796a = handler;
                    this.f76797b = interfaceC31346sc;
                }
            }

            /* renamed from: b */
            public static /* synthetic */ void m35864b(C29940a c29940a, int i, long j, long j2) {
                m35866a(c29940a, i, j, j2);
            }

            /* renamed from: a */
            public final void m35867a(Handler handler, InterfaceC31346sc interfaceC31346sc) {
                interfaceC31346sc.getClass();
                m35865a(interfaceC31346sc);
                this.f76795a.add(new C29940a(handler, interfaceC31346sc));
            }

            /* renamed from: a */
            public final void m35868a(final int i, final long j, final long j2) {
                Iterator<C29940a> it = this.f76795a.iterator();
                while (it.hasNext()) {
                    final C29940a next = it.next();
                    if (!next.f76798c) {
                        next.f76796a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.bk2
                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC29937ai.InterfaceC29938a.C29939a.m35864b(InterfaceC29937ai.InterfaceC29938a.C29939a.C29940a.this, i, j, j2);
                            }
                        });
                    }
                }
            }

            /* renamed from: a */
            public static /* synthetic */ void m35866a(C29940a c29940a, int i, long j, long j2) {
                c29940a.f76797b.mo29427b(i, j, j2);
            }

            /* renamed from: a */
            public final void m35865a(InterfaceC31346sc interfaceC31346sc) {
                Iterator<C29940a> it = this.f76795a.iterator();
                while (it.hasNext()) {
                    C29940a next = it.next();
                    if (next.f76797b == interfaceC31346sc) {
                        next.f76798c = true;
                        this.f76795a.remove(next);
                    }
                }
            }
        }
    }
}
