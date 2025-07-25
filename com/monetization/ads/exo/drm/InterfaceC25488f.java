package com.monetization.ads.exo.drm;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.monetization.ads.exo.drm.InterfaceC25488f;
import com.yandex.mobile.ads.impl.vt0;
import com.yandex.mobile.ads.impl.y32;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.monetization.ads.exo.drm.f */
/* loaded from: classes7.dex */
public interface InterfaceC25488f {

    /* renamed from: com.monetization.ads.exo.drm.f$a */
    /* loaded from: classes7.dex */
    public static class C25489a {

        /* renamed from: a */
        public final int f66184a;
        @Nullable

        /* renamed from: b */
        public final vt0.C31682b f66185b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C25490a> f66186c;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.monetization.ads.exo.drm.f$a$a */
        /* loaded from: classes7.dex */
        public static final class C25490a {

            /* renamed from: a */
            public Handler f66187a;

            /* renamed from: b */
            public InterfaceC25488f f66188b;

            public C25490a(Handler handler, InterfaceC25488f interfaceC25488f) {
                this.f66187a = handler;
                this.f66188b = interfaceC25488f;
            }
        }

        private C25489a(CopyOnWriteArrayList<C25490a> copyOnWriteArrayList, int i, @Nullable vt0.C31682b c31682b) {
            this.f66186c = copyOnWriteArrayList;
            this.f66184a = i;
            this.f66185b = c31682b;
        }

        /* renamed from: a */
        public static /* synthetic */ void m44444a(C25489a c25489a, InterfaceC25488f interfaceC25488f) {
            c25489a.m44437b(interfaceC25488f);
        }

        /* renamed from: b */
        public static /* synthetic */ void m44438b(C25489a c25489a, InterfaceC25488f interfaceC25488f) {
            c25489a.m44434c(interfaceC25488f);
        }

        /* renamed from: c */
        public static /* synthetic */ void m44435c(C25489a c25489a, InterfaceC25488f interfaceC25488f) {
            c25489a.m44431d(interfaceC25488f);
        }

        /* renamed from: d */
        public static /* synthetic */ void m44432d(C25489a c25489a, InterfaceC25488f interfaceC25488f) {
            c25489a.m44443a(interfaceC25488f);
        }

        /* renamed from: e */
        public static /* synthetic */ void m44430e(C25489a c25489a, InterfaceC25488f interfaceC25488f, int i) {
            c25489a.m44442a(interfaceC25488f, i);
        }

        /* renamed from: f */
        public static /* synthetic */ void m44428f(C25489a c25489a, InterfaceC25488f interfaceC25488f, Exception exc) {
            c25489a.m44441a(interfaceC25488f, exc);
        }

        @CheckResult
        /* renamed from: a */
        public final C25489a m44446a(int i, @Nullable vt0.C31682b c31682b) {
            return new C25489a(this.f66186c, i, c31682b);
        }

        /* renamed from: b */
        public final void m44439b() {
            Iterator<C25490a> it = this.f66186c.iterator();
            while (it.hasNext()) {
                C25490a next = it.next();
                final InterfaceC25488f interfaceC25488f = next.f66188b;
                y32.m27083a(next.f66187a, new Runnable() { // from class: com.monetization.ads.exo.drm.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC25488f.C25489a.m44444a(InterfaceC25488f.C25489a.this, interfaceC25488f);
                    }
                });
            }
        }

        /* renamed from: c */
        public final void m44436c() {
            Iterator<C25490a> it = this.f66186c.iterator();
            while (it.hasNext()) {
                C25490a next = it.next();
                final InterfaceC25488f interfaceC25488f = next.f66188b;
                y32.m27083a(next.f66187a, new Runnable() { // from class: com.monetization.ads.exo.drm.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC25488f.C25489a.m44438b(InterfaceC25488f.C25489a.this, interfaceC25488f);
                    }
                });
            }
        }

        /* renamed from: d */
        public final void m44433d() {
            Iterator<C25490a> it = this.f66186c.iterator();
            while (it.hasNext()) {
                C25490a next = it.next();
                final InterfaceC25488f interfaceC25488f = next.f66188b;
                y32.m27083a(next.f66187a, new Runnable() { // from class: com.monetization.ads.exo.drm.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC25488f.C25489a.m44435c(InterfaceC25488f.C25489a.this, interfaceC25488f);
                    }
                });
            }
        }

        /* renamed from: e */
        public final void m44429e(InterfaceC25488f interfaceC25488f) {
            Iterator<C25490a> it = this.f66186c.iterator();
            while (it.hasNext()) {
                C25490a next = it.next();
                if (next.f66188b == interfaceC25488f) {
                    this.f66186c.remove(next);
                }
            }
        }

        /* renamed from: a */
        public final void m44445a(Handler handler, InterfaceC25488f interfaceC25488f) {
            interfaceC25488f.getClass();
            this.f66186c.add(new C25490a(handler, interfaceC25488f));
        }

        public C25489a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* renamed from: b */
        public /* synthetic */ void m44437b(InterfaceC25488f interfaceC25488f) {
            interfaceC25488f.mo26586d(this.f66184a, this.f66185b);
        }

        /* renamed from: c */
        public /* synthetic */ void m44434c(InterfaceC25488f interfaceC25488f) {
            interfaceC25488f.mo26596a(this.f66184a, this.f66185b);
        }

        /* renamed from: d */
        public /* synthetic */ void m44431d(InterfaceC25488f interfaceC25488f) {
            interfaceC25488f.mo26590b(this.f66184a, this.f66185b);
        }

        /* renamed from: a */
        public final void m44447a(final int i) {
            Iterator<C25490a> it = this.f66186c.iterator();
            while (it.hasNext()) {
                C25490a next = it.next();
                final InterfaceC25488f interfaceC25488f = next.f66188b;
                y32.m27083a(next.f66187a, new Runnable() { // from class: com.monetization.ads.exo.drm.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC25488f.C25489a.m44430e(InterfaceC25488f.C25489a.this, interfaceC25488f, i);
                    }
                });
            }
        }

        /* renamed from: a */
        public /* synthetic */ void m44442a(InterfaceC25488f interfaceC25488f, int i) {
            interfaceC25488f.getClass();
            interfaceC25488f.mo26595a(this.f66184a, this.f66185b, i);
        }

        /* renamed from: a */
        public final void m44448a() {
            Iterator<C25490a> it = this.f66186c.iterator();
            while (it.hasNext()) {
                C25490a next = it.next();
                final InterfaceC25488f interfaceC25488f = next.f66188b;
                y32.m27083a(next.f66187a, new Runnable() { // from class: com.monetization.ads.exo.drm.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC25488f.C25489a.m44432d(InterfaceC25488f.C25489a.this, interfaceC25488f);
                    }
                });
            }
        }

        /* renamed from: a */
        public /* synthetic */ void m44443a(InterfaceC25488f interfaceC25488f) {
            interfaceC25488f.mo26588c(this.f66184a, this.f66185b);
        }

        /* renamed from: a */
        public final void m44440a(final Exception exc) {
            Iterator<C25490a> it = this.f66186c.iterator();
            while (it.hasNext()) {
                C25490a next = it.next();
                final InterfaceC25488f interfaceC25488f = next.f66188b;
                y32.m27083a(next.f66187a, new Runnable() { // from class: com.monetization.ads.exo.drm.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC25488f.C25489a.m44428f(InterfaceC25488f.C25489a.this, interfaceC25488f, exc);
                    }
                });
            }
        }

        /* renamed from: a */
        public /* synthetic */ void m44441a(InterfaceC25488f interfaceC25488f, Exception exc) {
            interfaceC25488f.mo26591a(this.f66184a, this.f66185b, exc);
        }
    }

    /* renamed from: a */
    default void mo26596a(int i, @Nullable vt0.C31682b c31682b) {
    }

    /* renamed from: a */
    default void mo26595a(int i, @Nullable vt0.C31682b c31682b, int i2) {
    }

    /* renamed from: a */
    default void mo26591a(int i, @Nullable vt0.C31682b c31682b, Exception exc) {
    }

    /* renamed from: b */
    default void mo26590b(int i, @Nullable vt0.C31682b c31682b) {
    }

    /* renamed from: c */
    default void mo26588c(int i, @Nullable vt0.C31682b c31682b) {
    }

    /* renamed from: d */
    default void mo26586d(int i, @Nullable vt0.C31682b c31682b) {
    }
}
