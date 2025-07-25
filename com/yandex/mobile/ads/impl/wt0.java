package com.yandex.mobile.ads.impl;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.vt0;
import com.yandex.mobile.ads.impl.wt0;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public interface wt0 {

    /* renamed from: com.yandex.mobile.ads.impl.wt0$a */
    /* loaded from: classes8.dex */
    public static class C31769a {

        /* renamed from: a */
        public final int f87401a;
        @Nullable

        /* renamed from: b */
        public final vt0.C31682b f87402b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C31770a> f87403c;

        /* renamed from: d */
        private final long f87404d;

        /* renamed from: com.yandex.mobile.ads.impl.wt0$a$a */
        /* loaded from: classes8.dex */
        public static final class C31770a {

            /* renamed from: a */
            public Handler f87405a;

            /* renamed from: b */
            public wt0 f87406b;

            public C31770a(Handler handler, wt0 wt0Var) {
                this.f87405a = handler;
                this.f87406b = wt0Var;
            }
        }

        public C31769a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private C31769a(CopyOnWriteArrayList copyOnWriteArrayList, int i, @Nullable vt0.C31682b c31682b) {
            this.f87403c = copyOnWriteArrayList;
            this.f87401a = i;
            this.f87402b = c31682b;
            this.f87404d = 0L;
        }

        /* renamed from: b */
        public /* synthetic */ void m27773b(wt0 wt0Var, gp0 gp0Var, lt0 lt0Var) {
            wt0Var.mo26589b(this.f87401a, this.f87402b, gp0Var, lt0Var);
        }

        /* renamed from: c */
        public /* synthetic */ void m27770c(wt0 wt0Var, gp0 gp0Var, lt0 lt0Var) {
            wt0Var.mo26587c(this.f87401a, this.f87402b, gp0Var, lt0Var);
        }

        /* renamed from: a */
        public final void m27788a(Handler handler, wt0 wt0Var) {
            wt0Var.getClass();
            this.f87403c.add(new C31770a(handler, wt0Var));
        }

        /* renamed from: b */
        public final void m27776b(final gp0 gp0Var, final lt0 lt0Var) {
            Iterator<C31770a> it = this.f87403c.iterator();
            while (it.hasNext()) {
                C31770a next = it.next();
                final wt0 wt0Var = next.f87406b;
                y32.m27083a(next.f87405a, new Runnable() { // from class: com.yandex.mobile.ads.impl.h03
                    {
                        wt0.C31769a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        wt0.C31769a.this.m27773b(wt0Var, gp0Var, lt0Var);
                    }
                });
            }
        }

        /* renamed from: c */
        public final void m27772c(final gp0 gp0Var, final lt0 lt0Var) {
            Iterator<C31770a> it = this.f87403c.iterator();
            while (it.hasNext()) {
                C31770a next = it.next();
                final wt0 wt0Var = next.f87406b;
                y32.m27083a(next.f87405a, new Runnable() { // from class: com.yandex.mobile.ads.impl.g03
                    {
                        wt0.C31769a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        wt0.C31769a.this.m27770c(wt0Var, gp0Var, lt0Var);
                    }
                });
            }
        }

        /* renamed from: a */
        private long m27789a(long j) {
            long m27061b = y32.m27061b(j);
            if (m27061b == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f87404d + m27061b;
        }

        /* renamed from: a */
        public final void m27791a(int i, @Nullable v90 v90Var, long j) {
            m27782a(new lt0(1, i, v90Var, 0, null, m27789a(j), -9223372036854775807L));
        }

        /* renamed from: b */
        public final void m27775b(gp0 gp0Var, @Nullable v90 v90Var, long j, long j2) {
            m27772c(gp0Var, new lt0(1, -1, v90Var, 0, null, m27789a(j), m27789a(j2)));
        }

        /* renamed from: a */
        public final void m27782a(final lt0 lt0Var) {
            Iterator<C31770a> it = this.f87403c.iterator();
            while (it.hasNext()) {
                C31770a next = it.next();
                final wt0 wt0Var = next.f87406b;
                y32.m27083a(next.f87405a, new Runnable() { // from class: com.yandex.mobile.ads.impl.i03
                    {
                        wt0.C31769a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        wt0.C31769a.this.m27777a(wt0Var, lt0Var);
                    }
                });
            }
        }

        /* renamed from: a */
        public /* synthetic */ void m27777a(wt0 wt0Var, lt0 lt0Var) {
            wt0Var.mo26592a(this.f87401a, this.f87402b, lt0Var);
        }

        /* renamed from: a */
        public /* synthetic */ void m27779a(wt0 wt0Var, gp0 gp0Var, lt0 lt0Var) {
            wt0Var.mo26594a(this.f87401a, this.f87402b, gp0Var, lt0Var);
        }

        /* renamed from: a */
        public /* synthetic */ void m27778a(wt0 wt0Var, gp0 gp0Var, lt0 lt0Var, IOException iOException, boolean z) {
            wt0Var.mo26593a(this.f87401a, this.f87402b, gp0Var, lt0Var, iOException, z);
        }

        /* renamed from: a */
        public final void m27786a(gp0 gp0Var, long j, long j2) {
            m27785a(gp0Var, new lt0(1, -1, null, 0, null, m27789a(j), m27789a(j2)));
        }

        /* renamed from: a */
        public final void m27785a(final gp0 gp0Var, final lt0 lt0Var) {
            Iterator<C31770a> it = this.f87403c.iterator();
            while (it.hasNext()) {
                C31770a next = it.next();
                final wt0 wt0Var = next.f87406b;
                y32.m27083a(next.f87405a, new Runnable() { // from class: com.yandex.mobile.ads.impl.j03
                    {
                        wt0.C31769a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        wt0.C31769a.this.m27779a(wt0Var, gp0Var, lt0Var);
                    }
                });
            }
        }

        /* renamed from: a */
        public final void m27783a(gp0 gp0Var, @Nullable v90 v90Var, long j, long j2) {
            m27776b(gp0Var, new lt0(1, -1, v90Var, 0, null, m27789a(j), m27789a(j2)));
        }

        /* renamed from: a */
        public final void m27787a(gp0 gp0Var, int i, @Nullable v90 v90Var, long j, long j2, IOException iOException, boolean z) {
            m27784a(gp0Var, new lt0(i, -1, v90Var, 0, null, m27789a(j), m27789a(j2)), iOException, z);
        }

        /* renamed from: a */
        public final void m27784a(final gp0 gp0Var, final lt0 lt0Var, final IOException iOException, final boolean z) {
            Iterator<C31770a> it = this.f87403c.iterator();
            while (it.hasNext()) {
                C31770a next = it.next();
                final wt0 wt0Var = next.f87406b;
                y32.m27083a(next.f87405a, new Runnable() { // from class: com.yandex.mobile.ads.impl.f03
                    {
                        wt0.C31769a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        wt0.C31769a.this.m27778a(wt0Var, gp0Var, lt0Var, iOException, z);
                    }
                });
            }
        }

        /* renamed from: a */
        public final void m27780a(wt0 wt0Var) {
            Iterator<C31770a> it = this.f87403c.iterator();
            while (it.hasNext()) {
                C31770a next = it.next();
                if (next.f87406b == wt0Var) {
                    this.f87403c.remove(next);
                }
            }
        }

        @CheckResult
        /* renamed from: a */
        public final C31769a m27790a(int i, @Nullable vt0.C31682b c31682b) {
            return new C31769a(this.f87403c, i, c31682b);
        }
    }

    /* renamed from: a */
    default void mo26594a(int i, @Nullable vt0.C31682b c31682b, gp0 gp0Var, lt0 lt0Var) {
    }

    /* renamed from: a */
    default void mo26593a(int i, @Nullable vt0.C31682b c31682b, gp0 gp0Var, lt0 lt0Var, IOException iOException, boolean z) {
    }

    /* renamed from: a */
    default void mo26592a(int i, @Nullable vt0.C31682b c31682b, lt0 lt0Var) {
    }

    /* renamed from: b */
    default void mo26589b(int i, @Nullable vt0.C31682b c31682b, gp0 gp0Var, lt0 lt0Var) {
    }

    /* renamed from: c */
    default void mo26587c(int i, @Nullable vt0.C31682b c31682b, gp0 gp0Var, lt0 lt0Var) {
    }
}
