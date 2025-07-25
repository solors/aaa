package com.yandex.mobile.ads.impl;

import android.location.Location;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.k7 */
/* loaded from: classes8.dex */
public final class C30705k7 {
    @NotNull

    /* renamed from: a */
    private final String f81300a;
    @Nullable

    /* renamed from: b */
    private final String f81301b;
    @Nullable

    /* renamed from: c */
    private final String f81302c;
    @Nullable

    /* renamed from: d */
    private final String f81303d;
    @Nullable

    /* renamed from: e */
    private final List<String> f81304e;
    @Nullable

    /* renamed from: f */
    private final Location f81305f;
    @Nullable

    /* renamed from: g */
    private final Map<String, String> f81306g;
    @Nullable

    /* renamed from: h */
    private final String f81307h;
    @Nullable

    /* renamed from: i */
    private final String f81308i;
    @Nullable

    /* renamed from: j */
    private final fm1 f81309j;

    /* renamed from: k */
    private final boolean f81310k;
    @Nullable

    /* renamed from: l */
    private final String f81311l;

    /* renamed from: com.yandex.mobile.ads.impl.k7$a */
    /* loaded from: classes8.dex */
    public static final class C30706a {
        @NotNull

        /* renamed from: a */
        private final String f81312a;
        @Nullable

        /* renamed from: b */
        private String f81313b;
        @Nullable

        /* renamed from: c */
        private String f81314c;
        @Nullable

        /* renamed from: d */
        private Location f81315d;
        @Nullable

        /* renamed from: e */
        private String f81316e;
        @Nullable

        /* renamed from: f */
        private List<String> f81317f;
        @Nullable

        /* renamed from: g */
        private Map<String, String> f81318g;
        @Nullable

        /* renamed from: h */
        private String f81319h;
        @Nullable

        /* renamed from: i */
        private String f81320i;
        @Nullable

        /* renamed from: j */
        private fm1 f81321j;

        /* renamed from: k */
        private boolean f81322k;

        public C30706a(@NotNull String adUnitId) {
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            this.f81312a = adUnitId;
        }

        @NotNull
        /* renamed from: a */
        public final C30705k7 m32650a() {
            return new C30705k7(this.f81312a, this.f81313b, this.f81314c, this.f81316e, this.f81317f, this.f81315d, this.f81318g, this.f81319h, this.f81320i, this.f81321j, this.f81322k, null);
        }

        @NotNull
        /* renamed from: b */
        public final C30706a m32642b(@Nullable String str) {
            this.f81316e = str;
            return this;
        }

        @NotNull
        /* renamed from: c */
        public final C30706a m32641c(@Nullable String str) {
            this.f81314c = str;
            return this;
        }

        @NotNull
        /* renamed from: d */
        public final C30706a m32640d(@Nullable String str) {
            this.f81319h = str;
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final C30706a m32643b() {
            this.f81320i = null;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30706a m32647a(@Nullable String str) {
            this.f81313b = str;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30706a m32646a(@Nullable List<String> list) {
            this.f81317f = list;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30706a m32649a(@Nullable Location location) {
            this.f81315d = location;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30706a m32645a(@Nullable Map<String, String> map) {
            this.f81318g = map;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30706a m32648a(@Nullable fm1 fm1Var) {
            this.f81321j = fm1Var;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30706a m32644a(boolean z) {
            this.f81322k = z;
            return this;
        }
    }

    public C30705k7(@NotNull String adUnitId, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, @Nullable Location location, @Nullable Map<String, String> map, @Nullable String str4, @Nullable String str5, @Nullable fm1 fm1Var, boolean z, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f81300a = adUnitId;
        this.f81301b = str;
        this.f81302c = str2;
        this.f81303d = str3;
        this.f81304e = list;
        this.f81305f = location;
        this.f81306g = map;
        this.f81307h = str4;
        this.f81308i = str5;
        this.f81309j = fm1Var;
        this.f81310k = z;
        this.f81311l = str6;
    }

    /* renamed from: a */
    public static C30705k7 m32662a(C30705k7 c30705k7, Map map, String str, int i) {
        String adUnitId = c30705k7.f81300a;
        String str2 = c30705k7.f81301b;
        String str3 = c30705k7.f81302c;
        String str4 = c30705k7.f81303d;
        List<String> list = c30705k7.f81304e;
        Location location = c30705k7.f81305f;
        Map map2 = (i & 64) != 0 ? c30705k7.f81306g : map;
        String str5 = c30705k7.f81307h;
        String str6 = c30705k7.f81308i;
        fm1 fm1Var = c30705k7.f81309j;
        boolean z = c30705k7.f81310k;
        String str7 = (i & 2048) != 0 ? c30705k7.f81311l : str;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return new C30705k7(adUnitId, str2, str3, str4, list, location, map2, str5, str6, fm1Var, z, str7);
    }

    @Nullable
    /* renamed from: b */
    public final String m32661b() {
        return this.f81301b;
    }

    @Nullable
    /* renamed from: c */
    public final String m32660c() {
        return this.f81303d;
    }

    @Nullable
    /* renamed from: d */
    public final List<String> m32659d() {
        return this.f81304e;
    }

    @Nullable
    /* renamed from: e */
    public final String m32658e() {
        return this.f81302c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30705k7)) {
            return false;
        }
        C30705k7 c30705k7 = (C30705k7) obj;
        if (Intrinsics.m17075f(this.f81300a, c30705k7.f81300a) && Intrinsics.m17075f(this.f81301b, c30705k7.f81301b) && Intrinsics.m17075f(this.f81302c, c30705k7.f81302c) && Intrinsics.m17075f(this.f81303d, c30705k7.f81303d) && Intrinsics.m17075f(this.f81304e, c30705k7.f81304e) && Intrinsics.m17075f(this.f81305f, c30705k7.f81305f) && Intrinsics.m17075f(this.f81306g, c30705k7.f81306g) && Intrinsics.m17075f(this.f81307h, c30705k7.f81307h) && Intrinsics.m17075f(this.f81308i, c30705k7.f81308i) && this.f81309j == c30705k7.f81309j && this.f81310k == c30705k7.f81310k && Intrinsics.m17075f(this.f81311l, c30705k7.f81311l)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final Location m32657f() {
        return this.f81305f;
    }

    @Nullable
    /* renamed from: g */
    public final String m32656g() {
        return this.f81307h;
    }

    @Nullable
    /* renamed from: h */
    public final Map<String, String> m32655h() {
        return this.f81306g;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10 = this.f81300a.hashCode() * 31;
        String str = this.f81301b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode10 + hashCode) * 31;
        String str2 = this.f81302c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.f81303d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        List<String> list = this.f81304e;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Location location = this.f81305f;
        if (location == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = location.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Map<String, String> map = this.f81306g;
        if (map == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = map.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str4 = this.f81307h;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str5 = this.f81308i;
        if (str5 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str5.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        fm1 fm1Var = this.f81309j;
        if (fm1Var == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = fm1Var.hashCode();
        }
        int m29848a = C31331s6.m29848a(this.f81310k, (i9 + hashCode9) * 31, 31);
        String str6 = this.f81311l;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return m29848a + i;
    }

    @Nullable
    /* renamed from: i */
    public final fm1 m32654i() {
        return this.f81309j;
    }

    @Nullable
    /* renamed from: j */
    public final String m32653j() {
        return this.f81311l;
    }

    @Nullable
    /* renamed from: k */
    public final String m32652k() {
        return this.f81308i;
    }

    /* renamed from: l */
    public final boolean m32651l() {
        return this.f81310k;
    }

    @NotNull
    public final String toString() {
        String str = this.f81300a;
        String str2 = this.f81301b;
        String str3 = this.f81302c;
        String str4 = this.f81303d;
        List<String> list = this.f81304e;
        Location location = this.f81305f;
        Map<String, String> map = this.f81306g;
        String str5 = this.f81307h;
        String str6 = this.f81308i;
        fm1 fm1Var = this.f81309j;
        boolean z = this.f81310k;
        String str7 = this.f81311l;
        return "AdRequestData(adUnitId=" + str + ", age=" + str2 + ", gender=" + str3 + ", contextQuery=" + str4 + ", contextTags=" + list + ", location=" + location + ", parameters=" + map + ", openBiddingData=" + str5 + ", readyResponse=" + str6 + ", preferredTheme=" + fm1Var + ", shouldLoadImagesAutomatically=" + z + ", preloadType=" + str7 + ")";
    }

    @NotNull
    /* renamed from: a */
    public final String m32663a() {
        return this.f81300a;
    }
}
