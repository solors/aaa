package com.ironsource;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.js */
/* loaded from: classes6.dex */
public final class C20166js implements InterfaceC21187wn {
    @NotNull

    /* renamed from: a */
    private final Handler f50752a;

    /* renamed from: b */
    private final long f50753b;

    /* renamed from: c */
    private long f50754c;

    /* renamed from: d */
    private long f50755d;

    /* renamed from: e */
    private long f50756e;
    @NotNull

    /* renamed from: f */
    private final C20168b f50757f;

    @Metadata
    /* renamed from: com.ironsource.js$a */
    /* loaded from: classes6.dex */
    public static final class C20167a {

        /* renamed from: a */
        private final long f50758a;

        /* renamed from: b */
        private final long f50759b;

        public C20167a(long j, long j2) {
            this.f50758a = j;
            this.f50759b = j2;
        }

        /* renamed from: a */
        public final long m57786a() {
            return this.f50758a;
        }

        /* renamed from: b */
        public final long m57783b() {
            return this.f50759b;
        }

        /* renamed from: c */
        public final long m57782c() {
            return this.f50758a;
        }

        /* renamed from: d */
        public final long m57781d() {
            return this.f50759b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20167a)) {
                return false;
            }
            C20167a c20167a = (C20167a) obj;
            if (this.f50758a == c20167a.f50758a && this.f50759b == c20167a.f50759b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Long.hashCode(this.f50758a) * 31) + Long.hashCode(this.f50759b);
        }

        @NotNull
        public String toString() {
            return "Status(remainingTime=" + this.f50758a + ", timePassed=" + this.f50759b + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C20167a m57785a(long j, long j2) {
            return new C20167a(j, j2);
        }

        /* renamed from: a */
        public static /* synthetic */ C20167a m57784a(C20167a c20167a, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = c20167a.f50758a;
            }
            if ((i & 2) != 0) {
                j2 = c20167a.f50759b;
            }
            return c20167a.m57785a(j, j2);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.js$b */
    /* loaded from: classes6.dex */
    public static final class C20168b extends AbstractRunnableC21276yp {

        /* renamed from: a */
        final /* synthetic */ Runnable f50760a;

        C20168b(Runnable runnable) {
            this.f50760a = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC21276yp
        /* renamed from: a */
        public void mo53791a() {
            this.f50760a.run();
        }
    }

    public C20166js(@NotNull Handler handler, @NotNull Runnable task, long j) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(task, "task");
        this.f50752a = handler;
        this.f50753b = j;
        this.f50757f = new C20168b(task);
        this.f50756e = m57789c();
        mo54324a();
    }

    /* renamed from: c */
    private final long m57789c() {
        return System.currentTimeMillis();
    }

    /* renamed from: d */
    private final long m57788d() {
        return this.f50753b - this.f50754c;
    }

    @Override // com.ironsource.InterfaceC21187wn
    @NotNull
    /* renamed from: a */
    public C20167a mo54324a() {
        if (m57787e()) {
            this.f50755d = m57789c();
            this.f50756e = 0L;
            this.f50752a.postDelayed(this.f50757f, m57788d());
        }
        return new C20167a(m57788d(), this.f50754c);
    }

    @Override // com.ironsource.InterfaceC21187wn
    @NotNull
    /* renamed from: b */
    public C20167a mo54323b() {
        if (!m57787e()) {
            long m57789c = m57789c();
            this.f50756e = m57789c;
            this.f50754c += m57789c - this.f50755d;
            this.f50752a.removeCallbacks(this.f50757f);
        }
        return new C20167a(m57788d(), this.f50754c);
    }

    /* renamed from: e */
    public final boolean m57787e() {
        if (this.f50756e > 0) {
            return true;
        }
        return false;
    }
}
