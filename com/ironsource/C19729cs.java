package com.ironsource;

import com.ironsource.InterfaceC21175wd;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;

@Metadata
/* renamed from: com.ironsource.cs */
/* loaded from: classes6.dex */
public final class C19729cs implements InterfaceC21175wd, InterfaceC21175wd.InterfaceC21176a {
    @NotNull

    /* renamed from: a */
    private final InterfaceC20197k9 f49666a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC20589og f49667b;
    @NotNull

    /* renamed from: c */
    private final Map<String, C21332zr> f49668c;

    @Metadata
    /* renamed from: com.ironsource.cs$a */
    /* loaded from: classes6.dex */
    public static final class C19730a {

        /* renamed from: a */
        private int f49669a;

        /* renamed from: b */
        private long f49670b;
        @Nullable

        /* renamed from: c */
        private Long f49671c;

        public C19730a(int i, long j, @Nullable Long l) {
            this.f49669a = i;
            this.f49670b = j;
            this.f49671c = l;
        }

        /* renamed from: a */
        public final int m59019a() {
            return this.f49669a;
        }

        /* renamed from: b */
        public final long m59013b() {
            return this.f49670b;
        }

        @Nullable
        /* renamed from: c */
        public final Long m59012c() {
            return this.f49671c;
        }

        /* renamed from: d */
        public final int m59011d() {
            return this.f49669a;
        }

        /* renamed from: e */
        public final long m59010e() {
            return this.f49670b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19730a)) {
                return false;
            }
            C19730a c19730a = (C19730a) obj;
            if (this.f49669a == c19730a.f49669a && this.f49670b == c19730a.f49670b && Intrinsics.m17075f(this.f49671c, c19730a.f49671c)) {
                return true;
            }
            return false;
        }

        @Nullable
        /* renamed from: f */
        public final Long m59009f() {
            return this.f49671c;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((Integer.hashCode(this.f49669a) * 31) + Long.hashCode(this.f49670b)) * 31;
            Long l = this.f49671c;
            if (l == null) {
                hashCode = 0;
            } else {
                hashCode = l.hashCode();
            }
            return hashCode2 + hashCode;
        }

        @NotNull
        public String toString() {
            return "ShowCountCappingInfo(currentNumberOfShows=" + this.f49669a + ", currentTime=" + this.f49670b + ", currentTimeThreshold=" + this.f49671c + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19730a m59017a(int i, long j, @Nullable Long l) {
            return new C19730a(i, j, l);
        }

        /* renamed from: a */
        public static /* synthetic */ C19730a m59015a(C19730a c19730a, int i, long j, Long l, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = c19730a.f49669a;
            }
            if ((i2 & 2) != 0) {
                j = c19730a.f49670b;
            }
            if ((i2 & 4) != 0) {
                l = c19730a.f49671c;
            }
            return c19730a.m59017a(i, j, l);
        }

        /* renamed from: a */
        public final void m59018a(int i) {
            this.f49669a = i;
        }

        /* renamed from: a */
        public final void m59016a(long j) {
            this.f49670b = j;
        }

        /* renamed from: a */
        public final void m59014a(@Nullable Long l) {
            this.f49671c = l;
        }
    }

    public C19729cs(@NotNull InterfaceC20197k9 currentTimeProvider, @NotNull InterfaceC20589og serviceDataRepository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(serviceDataRepository, "serviceDataRepository");
        this.f49666a = currentTimeProvider;
        this.f49667b = serviceDataRepository;
        this.f49668c = new LinkedHashMap();
    }

    /* renamed from: c */
    private final C19730a m59020c(String str) {
        return new C19730a(this.f49667b.mo55981a(str), this.f49666a.mo57675a(), this.f49667b.mo55980b(str));
    }

    @Override // com.ironsource.InterfaceC21175wd
    @NotNull
    /* renamed from: a */
    public C19902f8 mo54349a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C21332zr c21332zr = this.f49668c.get(identifier);
        if (c21332zr != null && m59021a(c21332zr, identifier)) {
            return new C19902f8(true, EnumC20037h8.ShowCount);
        }
        return new C19902f8(false, null, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r4 >= r6) goto L15;
     */
    @Override // com.ironsource.InterfaceC21175wd.InterfaceC21176a
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo54347b(@org.jetbrains.annotations.NotNull java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "identifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.Map<java.lang.String, com.ironsource.zr> r0 = r8.f49668c
            java.lang.Object r0 = r0.get(r9)
            com.ironsource.zr r0 = (com.ironsource.C21332zr) r0
            if (r0 != 0) goto L10
            return
        L10:
            com.ironsource.cs$a r1 = r8.m59020c(r9)
            int r2 = r1.m59011d()
            r3 = 1
            if (r2 == 0) goto L30
            long r4 = r1.m59010e()
            java.lang.Long r2 = r1.m59009f()
            if (r2 == 0) goto L2a
            long r6 = r2.longValue()
            goto L2c
        L2a:
            r6 = 0
        L2c:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L47
        L30:
            long r4 = r1.m59010e()
            com.ironsource.g8 r0 = r0.m53738b()
            r2 = 0
            long r6 = com.ironsource.EnumC19963g8.m58450a(r0, r2, r3, r2)
            long r4 = r4 + r6
            com.ironsource.og r0 = r8.f49667b
            r0.mo55982a(r4, r9)
            r0 = 0
            r1.m59018a(r0)
        L47:
            int r0 = r1.m59011d()
            int r0 = r0 + r3
            r1.m59018a(r0)
            com.ironsource.og r0 = r8.f49667b
            int r1 = r1.m59011d()
            r0.mo55983a(r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C19729cs.mo54347b(java.lang.String):void");
    }

    @Override // com.ironsource.InterfaceC21175wd.InterfaceC21176a
    @NotNull
    /* renamed from: a */
    public Object mo54348a(@NotNull String identifier, @NotNull EnumC20037h8 cappingType, @NotNull InterfaceC21075ud cappingConfig) {
        Object m14540a;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object mo54022c = cappingConfig.mo54022c();
        if (Result.m14543h(mo54022c)) {
            C21332zr c21332zr = (C21332zr) mo54022c;
            if (c21332zr != null) {
                this.f49668c.put(identifier, c21332zr);
            }
        } else {
            Throwable m14546e = Result.m14546e(mo54022c);
            if (m14546e != null) {
                m14540a = C38508r.m14540a(m14546e);
                return Result.m14549b(m14540a);
            }
        }
        m14540a = Unit.f99208a;
        return Result.m14549b(m14540a);
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, C21332zr> m59022a() {
        return this.f49668c;
    }

    /* renamed from: a */
    private final boolean m59021a(C21332zr c21332zr, String str) {
        C19730a m59020c = m59020c(str);
        Long m59009f = m59020c.m59009f();
        if (m59009f != null) {
            return m59020c.m59011d() >= c21332zr.m53739a() && this.f49666a.mo57675a() < m59009f.longValue();
        }
        return false;
    }
}
