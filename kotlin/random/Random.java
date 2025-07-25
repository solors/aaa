package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p1001ud.C44472b;

@Metadata
/* renamed from: kotlin.random.c */
/* loaded from: classes7.dex */
public abstract class Random {
    @NotNull

    /* renamed from: b */
    public static final C37621a f99344b = new C37621a(null);
    @NotNull

    /* renamed from: c */
    private static final Random f99345c = C44472b.f116736a.mo2116b();

    /* compiled from: Random.kt */
    @Metadata
    /* renamed from: kotlin.random.c$a */
    /* loaded from: classes7.dex */
    public static final class C37621a extends Random implements Serializable {

        /* compiled from: Random.kt */
        @Metadata
        /* renamed from: kotlin.random.c$a$a */
        /* loaded from: classes7.dex */
        private static final class C37622a implements Serializable {
            @NotNull

            /* renamed from: b */
            public static final C37622a f99346b = new C37622a();

            private C37622a() {
            }

            private final Object readResolve() {
                return Random.f99344b;
            }
        }

        public /* synthetic */ C37621a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object writeReplace() {
            return C37622a.f99346b;
        }

        @Override // kotlin.random.Random
        /* renamed from: b */
        public int mo16982b(int i) {
            return Random.f99345c.mo16982b(i);
        }

        @Override // kotlin.random.Random
        /* renamed from: c */
        public int mo16981c() {
            return Random.f99345c.mo16981c();
        }

        @Override // kotlin.random.Random
        /* renamed from: d */
        public int mo16980d(int i) {
            return Random.f99345c.mo16980d(i);
        }

        @Override // kotlin.random.Random
        /* renamed from: e */
        public int mo16979e(int i, int i2) {
            return Random.f99345c.mo16979e(i, i2);
        }

        @Override // kotlin.random.Random
        /* renamed from: f */
        public long mo16978f() {
            return Random.f99345c.mo16978f();
        }

        @Override // kotlin.random.Random
        /* renamed from: g */
        public long mo16977g(long j) {
            return Random.f99345c.mo16977g(j);
        }

        @Override // kotlin.random.Random
        /* renamed from: h */
        public long mo16976h(long j, long j2) {
            return Random.f99345c.mo16976h(j, j2);
        }

        private C37621a() {
        }
    }

    /* renamed from: b */
    public abstract int mo16982b(int i);

    /* renamed from: c */
    public int mo16981c() {
        return mo16982b(32);
    }

    /* renamed from: d */
    public int mo16980d(int i) {
        return mo16979e(0, i);
    }

    /* renamed from: e */
    public int mo16979e(int i, int i2) {
        int mo16981c;
        int i3;
        int i4;
        int mo16981c2;
        boolean z;
        C37623d.m16974b(i, i2);
        int i5 = i2 - i;
        if (i5 <= 0 && i5 != Integer.MIN_VALUE) {
            do {
                mo16981c2 = mo16981c();
                z = false;
                if (i <= mo16981c2 && mo16981c2 < i2) {
                    z = true;
                    continue;
                }
            } while (!z);
            return mo16981c2;
        }
        if (((-i5) & i5) == i5) {
            i4 = mo16982b(C37623d.m16972d(i5));
        } else {
            do {
                mo16981c = mo16981c() >>> 1;
                i3 = mo16981c % i5;
            } while ((mo16981c - i3) + (i5 - 1) < 0);
            i4 = i3;
        }
        return i + i4;
    }

    /* renamed from: f */
    public long mo16978f() {
        return (mo16981c() << 32) + mo16981c();
    }

    /* renamed from: g */
    public long mo16977g(long j) {
        return mo16976h(0L, j);
    }

    /* renamed from: h */
    public long mo16976h(long j, long j2) {
        long mo16978f;
        boolean z;
        long mo16978f2;
        long j3;
        long j4;
        int mo16981c;
        C37623d.m16973c(j, j2);
        long j5 = j2 - j;
        if (j5 > 0) {
            if (((-j5) & j5) == j5) {
                int i = (int) j5;
                int i2 = (int) (j5 >>> 32);
                if (i != 0) {
                    mo16981c = mo16982b(C37623d.m16972d(i));
                } else if (i2 == 1) {
                    mo16981c = mo16981c();
                } else {
                    j4 = (mo16982b(C37623d.m16972d(i2)) << 32) + (mo16981c() & 4294967295L);
                }
                j4 = mo16981c & 4294967295L;
            } else {
                do {
                    mo16978f2 = mo16978f() >>> 1;
                    j3 = mo16978f2 % j5;
                } while ((mo16978f2 - j3) + (j5 - 1) < 0);
                j4 = j3;
            }
            return j + j4;
        }
        do {
            mo16978f = mo16978f();
            z = false;
            if (j <= mo16978f && mo16978f < j2) {
                z = true;
                continue;
            }
        } while (!z);
        return mo16978f;
    }
}
