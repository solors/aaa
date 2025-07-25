package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.m8 */
/* loaded from: classes6.dex */
public final class C20331m8 {
    @Nullable

    /* renamed from: a */
    private final C20654pp f51192a;
    @Nullable

    /* renamed from: b */
    private final C20052hi f51193b;
    @Nullable

    /* renamed from: c */
    private final C20512n6 f51194c;
    @Nullable

    /* renamed from: d */
    private final C20157jl f51195d;
    @Nullable

    /* renamed from: e */
    private final C20999t3 f51196e;
    @Nullable

    /* renamed from: f */
    private final C19788dt f51197f;
    @Nullable

    /* renamed from: g */
    private final C19666c1 f51198g;

    @Metadata
    /* renamed from: com.ironsource.m8$a */
    /* loaded from: classes6.dex */
    public static final class C20332a {
        @Nullable

        /* renamed from: a */
        private C20654pp f51199a;
        @Nullable

        /* renamed from: b */
        private C20052hi f51200b;
        @Nullable

        /* renamed from: c */
        private C20512n6 f51201c;
        @Nullable

        /* renamed from: d */
        private C20157jl f51202d;
        @Nullable

        /* renamed from: e */
        private C20999t3 f51203e;
        @Nullable

        /* renamed from: f */
        private C19788dt f51204f;
        @Nullable

        /* renamed from: g */
        private C19666c1 f51205g;

        public C20332a() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        @NotNull
        /* renamed from: a */
        public final C20332a m57206a(@Nullable C19666c1 c19666c1) {
            this.f51205g = c19666c1;
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final C20332a m57195b(@Nullable C19788dt c19788dt) {
            this.f51204f = c19788dt;
            return this;
        }

        @Nullable
        /* renamed from: c */
        public final C20052hi m57189c() {
            return this.f51200b;
        }

        @Nullable
        /* renamed from: d */
        public final C20512n6 m57188d() {
            return this.f51201c;
        }

        @Nullable
        /* renamed from: e */
        public final C20157jl m57187e() {
            return this.f51202d;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20332a)) {
                return false;
            }
            C20332a c20332a = (C20332a) obj;
            if (Intrinsics.m17075f(this.f51199a, c20332a.f51199a) && Intrinsics.m17075f(this.f51200b, c20332a.f51200b) && Intrinsics.m17075f(this.f51201c, c20332a.f51201c) && Intrinsics.m17075f(this.f51202d, c20332a.f51202d) && Intrinsics.m17075f(this.f51203e, c20332a.f51203e) && Intrinsics.m17075f(this.f51204f, c20332a.f51204f) && Intrinsics.m17075f(this.f51205g, c20332a.f51205g)) {
                return true;
            }
            return false;
        }

        @Nullable
        /* renamed from: f */
        public final C20999t3 m57186f() {
            return this.f51203e;
        }

        @Nullable
        /* renamed from: g */
        public final C19788dt m57185g() {
            return this.f51204f;
        }

        @Nullable
        /* renamed from: h */
        public final C19666c1 m57184h() {
            return this.f51205g;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            C20654pp c20654pp = this.f51199a;
            int i = 0;
            if (c20654pp == null) {
                hashCode = 0;
            } else {
                hashCode = c20654pp.hashCode();
            }
            int i2 = hashCode * 31;
            C20052hi c20052hi = this.f51200b;
            if (c20052hi == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = c20052hi.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            C20512n6 c20512n6 = this.f51201c;
            if (c20512n6 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = c20512n6.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            C20157jl c20157jl = this.f51202d;
            if (c20157jl == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = c20157jl.hashCode();
            }
            int i5 = (i4 + hashCode4) * 31;
            C20999t3 c20999t3 = this.f51203e;
            if (c20999t3 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = c20999t3.hashCode();
            }
            int i6 = (i5 + hashCode5) * 31;
            C19788dt c19788dt = this.f51204f;
            if (c19788dt == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = c19788dt.hashCode();
            }
            int i7 = (i6 + hashCode6) * 31;
            C19666c1 c19666c1 = this.f51205g;
            if (c19666c1 != null) {
                i = c19666c1.hashCode();
            }
            return i7 + i;
        }

        @Nullable
        /* renamed from: i */
        public final C19666c1 m57183i() {
            return this.f51205g;
        }

        @Nullable
        /* renamed from: j */
        public final C20999t3 m57182j() {
            return this.f51203e;
        }

        @Nullable
        /* renamed from: k */
        public final C20512n6 m57181k() {
            return this.f51201c;
        }

        @Nullable
        /* renamed from: l */
        public final C20052hi m57180l() {
            return this.f51200b;
        }

        @Nullable
        /* renamed from: m */
        public final C20157jl m57179m() {
            return this.f51202d;
        }

        @Nullable
        /* renamed from: n */
        public final C20654pp m57178n() {
            return this.f51199a;
        }

        @Nullable
        /* renamed from: o */
        public final C19788dt m57177o() {
            return this.f51204f;
        }

        @NotNull
        public String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.f51199a + ", interstitialConfigurations=" + this.f51200b + ", bannerConfigurations=" + this.f51201c + ", nativeAdConfigurations=" + this.f51202d + ", applicationConfigurations=" + this.f51203e + ", testSuiteSettings=" + this.f51204f + ", adQualityConfigurations=" + this.f51205g + ')';
        }

        public C20332a(@Nullable C20654pp c20654pp, @Nullable C20052hi c20052hi, @Nullable C20512n6 c20512n6, @Nullable C20157jl c20157jl, @Nullable C20999t3 c20999t3, @Nullable C19788dt c19788dt, @Nullable C19666c1 c19666c1) {
            this.f51199a = c20654pp;
            this.f51200b = c20052hi;
            this.f51201c = c20512n6;
            this.f51202d = c20157jl;
            this.f51203e = c20999t3;
            this.f51204f = c19788dt;
            this.f51205g = c19666c1;
        }

        @NotNull
        /* renamed from: a */
        public final C20332a m57204a(@Nullable C20052hi c20052hi) {
            this.f51200b = c20052hi;
            return this;
        }

        @Nullable
        /* renamed from: b */
        public final C20654pp m57197b() {
            return this.f51199a;
        }

        public /* synthetic */ C20332a(C20654pp c20654pp, C20052hi c20052hi, C20512n6 c20512n6, C20157jl c20157jl, C20999t3 c20999t3, C19788dt c19788dt, C19666c1 c19666c1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : c20654pp, (i & 2) != 0 ? null : c20052hi, (i & 4) != 0 ? null : c20512n6, (i & 8) != 0 ? null : c20157jl, (i & 16) != 0 ? null : c20999t3, (i & 32) != 0 ? null : c19788dt, (i & 64) != 0 ? null : c19666c1);
        }

        @NotNull
        /* renamed from: a */
        public final C20332a m57203a(@Nullable C20157jl c20157jl) {
            this.f51202d = c20157jl;
            return this;
        }

        /* renamed from: b */
        public final void m57196b(@Nullable C19666c1 c19666c1) {
            this.f51205g = c19666c1;
        }

        /* renamed from: a */
        public static /* synthetic */ C20332a m57202a(C20332a c20332a, C20654pp c20654pp, C20052hi c20052hi, C20512n6 c20512n6, C20157jl c20157jl, C20999t3 c20999t3, C19788dt c19788dt, C19666c1 c19666c1, int i, Object obj) {
            if ((i & 1) != 0) {
                c20654pp = c20332a.f51199a;
            }
            if ((i & 2) != 0) {
                c20052hi = c20332a.f51200b;
            }
            C20052hi c20052hi2 = c20052hi;
            if ((i & 4) != 0) {
                c20512n6 = c20332a.f51201c;
            }
            C20512n6 c20512n62 = c20512n6;
            if ((i & 8) != 0) {
                c20157jl = c20332a.f51202d;
            }
            C20157jl c20157jl2 = c20157jl;
            if ((i & 16) != 0) {
                c20999t3 = c20332a.f51203e;
            }
            C20999t3 c20999t32 = c20999t3;
            if ((i & 32) != 0) {
                c19788dt = c20332a.f51204f;
            }
            C19788dt c19788dt2 = c19788dt;
            if ((i & 64) != 0) {
                c19666c1 = c20332a.f51205g;
            }
            return c20332a.m57199a(c20654pp, c20052hi2, c20512n62, c20157jl2, c20999t32, c19788dt2, c19666c1);
        }

        /* renamed from: b */
        public final void m57194b(@Nullable C20052hi c20052hi) {
            this.f51200b = c20052hi;
        }

        @NotNull
        /* renamed from: a */
        public final C20332a m57201a(@Nullable C20512n6 c20512n6) {
            this.f51201c = c20512n6;
            return this;
        }

        /* renamed from: b */
        public final void m57193b(@Nullable C20157jl c20157jl) {
            this.f51202d = c20157jl;
        }

        @NotNull
        /* renamed from: a */
        public final C20332a m57200a(@Nullable C20654pp c20654pp) {
            this.f51199a = c20654pp;
            return this;
        }

        /* renamed from: b */
        public final void m57192b(@Nullable C20512n6 c20512n6) {
            this.f51201c = c20512n6;
        }

        @NotNull
        /* renamed from: a */
        public final C20332a m57199a(@Nullable C20654pp c20654pp, @Nullable C20052hi c20052hi, @Nullable C20512n6 c20512n6, @Nullable C20157jl c20157jl, @Nullable C20999t3 c20999t3, @Nullable C19788dt c19788dt, @Nullable C19666c1 c19666c1) {
            return new C20332a(c20654pp, c20052hi, c20512n6, c20157jl, c20999t3, c19788dt, c19666c1);
        }

        /* renamed from: b */
        public final void m57191b(@Nullable C20654pp c20654pp) {
            this.f51199a = c20654pp;
        }

        @NotNull
        /* renamed from: a */
        public final C20332a m57198a(@Nullable C20999t3 c20999t3) {
            this.f51203e = c20999t3;
            return this;
        }

        /* renamed from: b */
        public final void m57190b(@Nullable C20999t3 c20999t3) {
            this.f51203e = c20999t3;
        }

        @NotNull
        /* renamed from: a */
        public final C20331m8 m57207a() {
            return new C20331m8(this.f51199a, this.f51200b, this.f51201c, this.f51202d, this.f51203e, this.f51204f, this.f51205g, null);
        }

        /* renamed from: a */
        public final void m57205a(@Nullable C19788dt c19788dt) {
            this.f51204f = c19788dt;
        }
    }

    private C20331m8(C20654pp c20654pp, C20052hi c20052hi, C20512n6 c20512n6, C20157jl c20157jl, C20999t3 c20999t3, C19788dt c19788dt, C19666c1 c19666c1) {
        this.f51192a = c20654pp;
        this.f51193b = c20052hi;
        this.f51194c = c20512n6;
        this.f51195d = c20157jl;
        this.f51196e = c20999t3;
        this.f51197f = c19788dt;
        this.f51198g = c19666c1;
    }

    @Nullable
    /* renamed from: a */
    public final C19666c1 m57214a() {
        return this.f51198g;
    }

    @Nullable
    /* renamed from: b */
    public final C20999t3 m57213b() {
        return this.f51196e;
    }

    @Nullable
    /* renamed from: c */
    public final C20512n6 m57212c() {
        return this.f51194c;
    }

    @Nullable
    /* renamed from: d */
    public final C20052hi m57211d() {
        return this.f51193b;
    }

    @Nullable
    /* renamed from: e */
    public final C20157jl m57210e() {
        return this.f51195d;
    }

    @Nullable
    /* renamed from: f */
    public final C20654pp m57209f() {
        return this.f51192a;
    }

    @Nullable
    /* renamed from: g */
    public final C19788dt m57208g() {
        return this.f51197f;
    }

    @NotNull
    public String toString() {
        return "configurations(\n" + this.f51192a + '\n' + this.f51193b + '\n' + this.f51194c + '\n' + this.f51195d + ')';
    }

    public /* synthetic */ C20331m8(C20654pp c20654pp, C20052hi c20052hi, C20512n6 c20512n6, C20157jl c20157jl, C20999t3 c20999t3, C19788dt c19788dt, C19666c1 c19666c1, DefaultConstructorMarker defaultConstructorMarker) {
        this(c20654pp, c20052hi, c20512n6, c20157jl, c20999t3, c19788dt, c19666c1);
    }
}
