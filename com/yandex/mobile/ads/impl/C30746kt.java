package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.kt */
/* loaded from: classes8.dex */
public final class C30746kt implements pa2 {
    @NotNull

    /* renamed from: a */
    private final List<et0> f81551a;
    @NotNull

    /* renamed from: b */
    private final List<tf0> f81552b;
    @NotNull

    /* renamed from: c */
    private final List<i12> f81553c;
    @Nullable

    /* renamed from: d */
    private final C30972nt f81554d;
    @Nullable

    /* renamed from: e */
    private final String f81555e;
    @Nullable

    /* renamed from: f */
    private final cv1 f81556f;
    @Nullable

    /* renamed from: g */
    private final String f81557g;

    /* renamed from: h */
    private final int f81558h;

    /* renamed from: com.yandex.mobile.ads.impl.kt$a */
    /* loaded from: classes8.dex */
    public static final class C30747a {
        @NotNull

        /* renamed from: a */
        private final ArrayList f81559a = new ArrayList();
        @NotNull

        /* renamed from: b */
        private final ArrayList f81560b = new ArrayList();
        @NotNull

        /* renamed from: c */
        private final ArrayList f81561c = new ArrayList();
        @Nullable

        /* renamed from: d */
        private C30972nt f81562d;
        @Nullable

        /* renamed from: e */
        private String f81563e;
        @Nullable

        /* renamed from: f */
        private cv1 f81564f;
        @Nullable

        /* renamed from: g */
        private String f81565g;

        /* renamed from: h */
        private int f81566h;

        @NotNull
        /* renamed from: a */
        public final C30747a m32431a(@Nullable List list) {
            ArrayList arrayList = this.f81560b;
            if (list == null) {
                list = C37563v.m17166m();
            }
            arrayList.addAll(list);
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final C30747a m32429b(@Nullable List list) {
            ArrayList arrayList = this.f81559a;
            if (list == null) {
                list = C37563v.m17166m();
            }
            arrayList.addAll(list);
            return this;
        }

        @NotNull
        /* renamed from: c */
        public final C30747a m32428c(@Nullable List<i12> list) {
            ArrayList arrayList = this.f81561c;
            if (list == null) {
                list = C37563v.m17166m();
            }
            arrayList.addAll(list);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final void m32434a(@NotNull i12 trackingEvent) {
            Intrinsics.checkNotNullParameter(trackingEvent, "trackingEvent");
            this.f81561c.add(trackingEvent);
        }

        @NotNull
        /* renamed from: b */
        public final C30747a m32430b(@Nullable String str) {
            this.f81565g = str;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30747a m32432a(@Nullable String str) {
            this.f81563e = str;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final void m32433a(@NotNull C30972nt creativeExtensions) {
            Intrinsics.checkNotNullParameter(creativeExtensions, "creativeExtensions");
            this.f81562d = creativeExtensions;
        }

        @NotNull
        /* renamed from: a */
        public final C30747a m32436a(int i) {
            this.f81566h = i;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30747a m32435a(@Nullable cv1 cv1Var) {
            this.f81564f = cv1Var;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30746kt m32437a() {
            return new C30746kt(this.f81559a, this.f81560b, this.f81561c, this.f81562d, this.f81563e, this.f81564f, this.f81565g, this.f81566h);
        }
    }

    public C30746kt(@NotNull ArrayList mediaFiles, @NotNull ArrayList icons, @NotNull ArrayList trackingEventsList, @Nullable C30972nt c30972nt, @Nullable String str, @Nullable cv1 cv1Var, @Nullable String str2, int i) {
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(trackingEventsList, "trackingEventsList");
        this.f81551a = mediaFiles;
        this.f81552b = icons;
        this.f81553c = trackingEventsList;
        this.f81554d = c30972nt;
        this.f81555e = str;
        this.f81556f = cv1Var;
        this.f81557g = str2;
        this.f81558h = i;
    }

    @Override // com.yandex.mobile.ads.impl.pa2
    @NotNull
    /* renamed from: a */
    public final Map<String, List<String>> mo26370a() {
        List<i12> list = this.f81553c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (i12 i12Var : list) {
            String m33392a = i12Var.m33392a();
            Object obj = linkedHashMap.get(m33392a);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(m33392a, obj);
            }
            ((List) obj).add(i12Var.m33390c());
        }
        return linkedHashMap;
    }

    @Nullable
    /* renamed from: b */
    public final String m32445b() {
        return this.f81555e;
    }

    @Nullable
    /* renamed from: c */
    public final C30972nt m32444c() {
        return this.f81554d;
    }

    /* renamed from: d */
    public final int m32443d() {
        return this.f81558h;
    }

    @NotNull
    /* renamed from: e */
    public final List<tf0> m32442e() {
        return this.f81552b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30746kt)) {
            return false;
        }
        C30746kt c30746kt = (C30746kt) obj;
        if (Intrinsics.m17075f(this.f81551a, c30746kt.f81551a) && Intrinsics.m17075f(this.f81552b, c30746kt.f81552b) && Intrinsics.m17075f(this.f81553c, c30746kt.f81553c) && Intrinsics.m17075f(this.f81554d, c30746kt.f81554d) && Intrinsics.m17075f(this.f81555e, c30746kt.f81555e) && Intrinsics.m17075f(this.f81556f, c30746kt.f81556f) && Intrinsics.m17075f(this.f81557g, c30746kt.f81557g) && this.f81558h == c30746kt.f81558h) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final String m32441f() {
        return this.f81557g;
    }

    @NotNull
    /* renamed from: g */
    public final List<et0> m32440g() {
        return this.f81551a;
    }

    @Nullable
    /* renamed from: h */
    public final cv1 m32439h() {
        return this.f81556f;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int m30807a = C31097p9.m30807a(this.f81553c, C31097p9.m30807a(this.f81552b, this.f81551a.hashCode() * 31, 31), 31);
        C30972nt c30972nt = this.f81554d;
        int i = 0;
        if (c30972nt == null) {
            hashCode = 0;
        } else {
            hashCode = c30972nt.hashCode();
        }
        int i2 = (m30807a + hashCode) * 31;
        String str = this.f81555e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        cv1 cv1Var = this.f81556f;
        if (cv1Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = cv1Var.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str2 = this.f81557g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Integer.hashCode(this.f81558h) + ((i4 + i) * 31);
    }

    @NotNull
    /* renamed from: i */
    public final List<i12> m32438i() {
        return this.f81553c;
    }

    @NotNull
    public final String toString() {
        List<et0> list = this.f81551a;
        List<tf0> list2 = this.f81552b;
        List<i12> list3 = this.f81553c;
        C30972nt c30972nt = this.f81554d;
        String str = this.f81555e;
        cv1 cv1Var = this.f81556f;
        String str2 = this.f81557g;
        int i = this.f81558h;
        return "Creative(mediaFiles=" + list + ", icons=" + list2 + ", trackingEventsList=" + list3 + ", creativeExtensions=" + c30972nt + ", clickThroughUrl=" + str + ", skipOffset=" + cv1Var + ", id=" + str2 + ", durationMillis=" + i + ")";
    }
}
