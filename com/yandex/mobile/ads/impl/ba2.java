package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ba2;

/* loaded from: classes8.dex */
public interface ba2 {

    /* renamed from: com.yandex.mobile.ads.impl.ba2$a */
    /* loaded from: classes8.dex */
    public static final class C30007a {
        @Nullable

        /* renamed from: a */
        private final Handler f77245a;
        @Nullable

        /* renamed from: b */
        private final ba2 f77246b;

        public C30007a(@Nullable Handler handler, @Nullable ba2 ba2Var) {
            this.f77245a = (Handler) C30937nf.m31570a(handler);
            this.f77246b = ba2Var;
        }

        /* renamed from: c */
        public void m35529c(C30277ex c30277ex) {
            synchronized (c30277ex) {
            }
            ba2 ba2Var = this.f77246b;
            int i = y32.f88010a;
            ba2Var.mo34248c(c30277ex);
        }

        /* renamed from: d */
        public void m35527d(C30277ex c30277ex) {
            ba2 ba2Var = this.f77246b;
            int i = y32.f88010a;
            ba2Var.mo34243d(c30277ex);
        }

        /* renamed from: a */
        public final void m35540a(final String str, final long j, final long j2) {
            Handler handler = this.f77245a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.yk2
                    {
                        ba2.C30007a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ba2.C30007a.this.m35532b(str, j, j2);
                    }
                });
            }
        }

        /* renamed from: b */
        public final void m35537b(final C30277ex c30277ex) {
            Handler handler = this.f77245a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.al2
                    {
                        ba2.C30007a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ba2.C30007a.this.m35527d(c30277ex);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m35532b(String str, long j, long j2) {
            ba2 ba2Var = this.f77246b;
            int i = y32.f88010a;
            ba2Var.mo34260a(str, j, j2);
        }

        /* renamed from: a */
        public final void m35541a(final String str) {
            Handler handler = this.f77245a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.sk2
                    {
                        ba2.C30007a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ba2.C30007a.this.m35533b(str);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m35533b(String str) {
            ba2 ba2Var = this.f77246b;
            int i = y32.f88010a;
            ba2Var.mo34261a(str);
        }

        /* renamed from: a */
        public final void m35546a(final C30277ex c30277ex) {
            synchronized (c30277ex) {
            }
            Handler handler = this.f77245a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.zk2
                    {
                        ba2.C30007a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ba2.C30007a.this.m35529c(c30277ex);
                    }
                });
            }
        }

        /* renamed from: c */
        public final void m35531c(final int i, final long j) {
            Handler handler = this.f77245a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.wk2
                    {
                        ba2.C30007a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ba2.C30007a.this.m35549a(j, i);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m35539b(int i, long j) {
            ba2 ba2Var = this.f77246b;
            int i2 = y32.f88010a;
            ba2Var.mo34256b(i, j);
        }

        /* renamed from: b */
        public void m35535b(v90 v90Var, C30585ix c30585ix) {
            ba2 ba2Var = this.f77246b;
            int i = y32.f88010a;
            ba2Var.getClass();
            this.f77246b.mo34253b(v90Var, c30585ix);
        }

        /* renamed from: a */
        public final void m35550a(final int i, final long j) {
            Handler handler = this.f77245a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.xk2
                    {
                        ba2.C30007a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ba2.C30007a.this.m35539b(i, j);
                    }
                });
            }
        }

        /* renamed from: a */
        public final void m35544a(final v90 v90Var, @Nullable final C30585ix c30585ix) {
            Handler handler = this.f77245a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vk2
                    {
                        ba2.C30007a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ba2.C30007a.this.m35535b(v90Var, c30585ix);
                    }
                });
            }
        }

        /* renamed from: b */
        public final void m35534b(final Exception exc) {
            Handler handler = this.f77245a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.tk2
                    {
                        ba2.C30007a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ba2.C30007a.this.m35543a(exc);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m35542a(Object obj, long j) {
            ba2 ba2Var = this.f77246b;
            int i = y32.f88010a;
            ba2Var.mo34262a(obj, j);
        }

        /* renamed from: b */
        public final void m35536b(final ia2 ia2Var) {
            Handler handler = this.f77245a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.rk2
                    {
                        ba2.C30007a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ba2.C30007a.this.m35545a(ia2Var);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m35549a(long j, int i) {
            ba2 ba2Var = this.f77246b;
            int i2 = y32.f88010a;
            ba2Var.mo34276a(i, j);
        }

        /* renamed from: a */
        public void m35543a(Exception exc) {
            ba2 ba2Var = this.f77246b;
            int i = y32.f88010a;
            ba2Var.mo34246c(exc);
        }

        /* renamed from: a */
        public void m35545a(ia2 ia2Var) {
            ba2 ba2Var = this.f77246b;
            int i = y32.f88010a;
            ba2Var.mo34268a(ia2Var);
        }

        /* renamed from: a */
        public final void m35548a(final Surface surface) {
            if (this.f77245a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f77245a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.uk2
                    {
                        ba2.C30007a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ba2.C30007a.this.m35542a(surface, elapsedRealtime);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    default void mo34276a(int i, long j) {
    }

    /* renamed from: b */
    default void mo34256b(int i, long j) {
    }

    /* renamed from: c */
    default void mo34248c(C30277ex c30277ex) {
    }

    /* renamed from: a */
    default void mo34268a(ia2 ia2Var) {
    }

    /* renamed from: b */
    default void mo34253b(v90 v90Var, @Nullable C30585ix c30585ix) {
    }

    /* renamed from: c */
    default void mo34246c(Exception exc) {
    }

    /* renamed from: a */
    default void mo34262a(Object obj, long j) {
    }

    /* renamed from: a */
    default void mo34261a(String str) {
    }

    /* renamed from: a */
    default void mo34260a(String str, long j, long j2) {
    }

    /* renamed from: d */
    default void mo34243d(C30277ex c30277ex) {
    }
}
