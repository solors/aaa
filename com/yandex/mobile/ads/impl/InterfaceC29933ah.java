package com.yandex.mobile.ads.impl;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC29933ah;

/* renamed from: com.yandex.mobile.ads.impl.ah */
/* loaded from: classes8.dex */
public interface InterfaceC29933ah {

    /* renamed from: com.yandex.mobile.ads.impl.ah$a */
    /* loaded from: classes8.dex */
    public static final class C29934a {
        @Nullable

        /* renamed from: a */
        private final Handler f76787a;
        @Nullable

        /* renamed from: b */
        private final InterfaceC29933ah f76788b;

        public C29934a(@Nullable Handler handler, @Nullable InterfaceC29933ah interfaceC29933ah) {
            this.f76787a = (Handler) C30937nf.m31570a(handler);
            this.f76788b = interfaceC29933ah;
        }

        /* renamed from: c */
        public void m35880c(Exception exc) {
            InterfaceC29933ah interfaceC29933ah = this.f76788b;
            int i = y32.f88010a;
            interfaceC29933ah.mo34252b(exc);
        }

        /* renamed from: d */
        public void m35877d(Exception exc) {
            InterfaceC29933ah interfaceC29933ah = this.f76788b;
            int i = y32.f88010a;
            interfaceC29933ah.mo34263a(exc);
        }

        /* renamed from: a */
        public final void m35895a(final Exception exc) {
            Handler handler = this.f76787a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.ak2
                    {
                        InterfaceC29933ah.C29934a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC29933ah.C29934a.this.m35880c(exc);
                    }
                });
            }
        }

        /* renamed from: b */
        public final void m35886b(final Exception exc) {
            Handler handler = this.f76787a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.zj2
                    {
                        InterfaceC29933ah.C29934a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC29933ah.C29934a.this.m35877d(exc);
                    }
                });
            }
        }

        /* renamed from: c */
        public void m35881c(C30277ex c30277ex) {
            synchronized (c30277ex) {
            }
            InterfaceC29933ah interfaceC29933ah = this.f76788b;
            int i = y32.f88010a;
            interfaceC29933ah.mo34271a(c30277ex);
        }

        /* renamed from: d */
        public void m35878d(C30277ex c30277ex) {
            InterfaceC29933ah interfaceC29933ah = this.f76788b;
            int i = y32.f88010a;
            interfaceC29933ah.mo34254b(c30277ex);
        }

        /* renamed from: a */
        public final void m35893a(final String str, final long j, final long j2) {
            Handler handler = this.f76787a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vj2
                    {
                        InterfaceC29933ah.C29934a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC29933ah.C29934a.this.m35884b(str, j, j2);
                    }
                });
            }
        }

        /* renamed from: b */
        public final void m35888b(final C30277ex c30277ex) {
            Handler handler = this.f76787a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.wj2
                    {
                        InterfaceC29933ah.C29934a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC29933ah.C29934a.this.m35878d(c30277ex);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m35884b(String str, long j, long j2) {
            InterfaceC29933ah interfaceC29933ah = this.f76788b;
            int i = y32.f88010a;
            interfaceC29933ah.mo34250b(str, j, j2);
        }

        /* renamed from: a */
        public final void m35894a(final String str) {
            Handler handler = this.f76787a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.rj2
                    {
                        InterfaceC29933ah.C29934a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC29933ah.C29934a.this.m35885b(str);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m35885b(String str) {
            InterfaceC29933ah interfaceC29933ah = this.f76788b;
            int i = y32.f88010a;
            interfaceC29933ah.mo34251b(str);
        }

        /* renamed from: a */
        public final void m35897a(final C30277ex c30277ex) {
            synchronized (c30277ex) {
            }
            Handler handler = this.f76787a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.uj2
                    {
                        InterfaceC29933ah.C29934a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC29933ah.C29934a.this.m35881c(c30277ex);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m35887b(v90 v90Var, C30585ix c30585ix) {
            InterfaceC29933ah interfaceC29933ah = this.f76788b;
            int i = y32.f88010a;
            interfaceC29933ah.getClass();
            this.f76788b.mo34265a(v90Var, c30585ix);
        }

        /* renamed from: a */
        public final void m35896a(final v90 v90Var, @Nullable final C30585ix c30585ix) {
            Handler handler = this.f76787a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.tj2
                    {
                        InterfaceC29933ah.C29934a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC29933ah.C29934a.this.m35887b(v90Var, c30585ix);
                    }
                });
            }
        }

        /* renamed from: b */
        public final void m35890b(final long j) {
            Handler handler = this.f76787a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.yj2
                    {
                        InterfaceC29933ah.C29934a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC29933ah.C29934a.this.m35899a(j);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m35899a(long j) {
            InterfaceC29933ah interfaceC29933ah = this.f76788b;
            int i = y32.f88010a;
            interfaceC29933ah.mo34273a(j);
        }

        /* renamed from: b */
        public final void m35883b(final boolean z) {
            Handler handler = this.f76787a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.sj2
                    {
                        InterfaceC29933ah.C29934a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC29933ah.C29934a.this.m35892a(z);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m35892a(boolean z) {
            InterfaceC29933ah interfaceC29933ah = this.f76788b;
            int i = y32.f88010a;
            interfaceC29933ah.onSkipSilenceEnabledChanged(z);
        }

        /* renamed from: b */
        public final void m35891b(final int i, final long j, final long j2) {
            Handler handler = this.f76787a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.xj2
                    {
                        InterfaceC29933ah.C29934a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC29933ah.C29934a.this.m35900a(i, j, j2);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m35900a(int i, long j, long j2) {
            InterfaceC29933ah interfaceC29933ah = this.f76788b;
            int i2 = y32.f88010a;
            interfaceC29933ah.mo34275a(i, j, j2);
        }
    }

    /* renamed from: a */
    default void mo34275a(int i, long j, long j2) {
    }

    /* renamed from: b */
    default void mo34254b(C30277ex c30277ex) {
    }

    /* renamed from: a */
    default void mo34273a(long j) {
    }

    /* renamed from: b */
    default void mo34252b(Exception exc) {
    }

    /* renamed from: a */
    default void mo34271a(C30277ex c30277ex) {
    }

    /* renamed from: b */
    default void mo34251b(String str) {
    }

    /* renamed from: a */
    default void mo34265a(v90 v90Var, @Nullable C30585ix c30585ix) {
    }

    /* renamed from: b */
    default void mo34250b(String str, long j, long j2) {
    }

    /* renamed from: a */
    default void mo34263a(Exception exc) {
    }

    default void onSkipSilenceEnabledChanged(boolean z) {
    }
}
