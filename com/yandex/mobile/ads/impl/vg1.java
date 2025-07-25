package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class vg1<T, V> {

    /* renamed from: a */
    private final long f86742a;

    /* renamed from: b */
    private final int f86743b;
    @NotNull

    /* renamed from: c */
    private final b50 f86744c;
    @NotNull

    /* renamed from: d */
    private final c50 f86745d;
    @NotNull

    /* renamed from: e */
    private final ArrayList f86746e;

    /* renamed from: com.yandex.mobile.ads.impl.vg1$a */
    /* loaded from: classes8.dex */
    public static final class C31656a<T, V> implements a50 {

        /* renamed from: a */
        private final T f86747a;

        /* renamed from: b */
        private final V f86748b;

        /* renamed from: c */
        private final long f86749c;

        /* JADX WARN: Multi-variable type inference failed */
        public C31656a(hb0 hb0Var, Object obj, long j) {
            this.f86747a = hb0Var;
            this.f86748b = obj;
            this.f86749c = j;
        }

        @Override // com.yandex.mobile.ads.impl.a50
        /* renamed from: a */
        public final long mo28314a() {
            return this.f86749c;
        }

        /* renamed from: b */
        public final V m28313b() {
            return this.f86748b;
        }

        /* renamed from: c */
        public final T m28312c() {
            return this.f86747a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31656a)) {
                return false;
            }
            C31656a c31656a = (C31656a) obj;
            if (Intrinsics.m17075f(this.f86747a, c31656a.f86747a) && Intrinsics.m17075f(this.f86748b, c31656a.f86748b) && this.f86749c == c31656a.f86749c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            T t = this.f86747a;
            int i = 0;
            if (t == null) {
                hashCode = 0;
            } else {
                hashCode = t.hashCode();
            }
            int i2 = hashCode * 31;
            V v = this.f86748b;
            if (v != null) {
                i = v.hashCode();
            }
            return Long.hashCode(this.f86749c) + ((i2 + i) * 31);
        }

        @NotNull
        public final String toString() {
            T t = this.f86747a;
            V v = this.f86748b;
            long j = this.f86749c;
            return "CachedItem(params=" + t + ", item=" + v + ", expiresAtTimestampMillis=" + j + ")";
        }
    }

    public /* synthetic */ vg1() {
        this(86400000L, 5, new b50(), new c50());
    }

    /* renamed from: a */
    public final synchronized void m28316a(hb0 hb0Var, Object obj) {
        m28318a();
        if (this.f86746e.size() < this.f86743b) {
            ArrayList arrayList = this.f86746e;
            c50 c50Var = this.f86745d;
            long j = this.f86742a;
            c50Var.getClass();
            arrayList.add(new C31656a(hb0Var, obj, System.currentTimeMillis() + j));
        }
    }

    /* renamed from: b */
    public final synchronized boolean m28315b() {
        boolean z;
        m28318a();
        if (this.f86746e.size() < this.f86743b) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public vg1(long j, int i, @NotNull b50 expirationChecker, @NotNull c50 expirationTimestampUtil) {
        Intrinsics.checkNotNullParameter(expirationChecker, "expirationChecker");
        Intrinsics.checkNotNullParameter(expirationTimestampUtil, "expirationTimestampUtil");
        this.f86742a = j;
        this.f86743b = i;
        this.f86744c = expirationChecker;
        this.f86745d = expirationTimestampUtil;
        this.f86746e = new ArrayList();
    }

    /* renamed from: a */
    private final void m28318a() {
        ArrayList arrayList = this.f86746e;
        b50 b50Var = this.f86744c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            a50 any = (a50) next;
            b50Var.getClass();
            Intrinsics.checkNotNullParameter(any, "any");
            if (System.currentTimeMillis() > any.mo28314a()) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.f86746e.remove((C31656a) it2.next());
        }
    }

    @Nullable
    /* renamed from: a */
    public final synchronized Object m28317a(hb0 hb0Var) {
        Object obj;
        Object obj2;
        Object m28313b;
        m28318a();
        Iterator it = this.f86746e.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.m17075f(((C31656a) obj2).m28312c(), hb0Var)) {
                break;
            }
        }
        C31656a c31656a = (C31656a) obj2;
        if (c31656a != null && (m28313b = c31656a.m28313b()) != null) {
            this.f86746e.remove(c31656a);
            obj = m28313b;
        }
        return obj;
    }
}
