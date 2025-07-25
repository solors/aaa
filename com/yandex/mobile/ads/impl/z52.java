package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.h62;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class z52 implements pa2 {

    /* renamed from: a */
    private final boolean f88719a;
    @NotNull

    /* renamed from: b */
    private final List<C30746kt> f88720b;
    @NotNull

    /* renamed from: c */
    private final Map<String, List<String>> f88721c;
    @NotNull

    /* renamed from: d */
    private final h62 f88722d;
    @Nullable

    /* renamed from: e */
    private final String f88723e;
    @Nullable

    /* renamed from: f */
    private final String f88724f;
    @Nullable

    /* renamed from: g */
    private final String f88725g;
    @Nullable

    /* renamed from: h */
    private final String f88726h;
    @Nullable

    /* renamed from: i */
    private final String f88727i;
    @Nullable

    /* renamed from: j */
    private final fc2 f88728j;
    @Nullable

    /* renamed from: k */
    private final Integer f88729k;
    @Nullable

    /* renamed from: l */
    private final String f88730l;
    @Nullable

    /* renamed from: m */
    private final xe2 f88731m;
    @NotNull

    /* renamed from: n */
    private final List<j52> f88732n;
    @NotNull

    /* renamed from: o */
    private final Map<String, List<String>> f88733o;

    /* renamed from: com.yandex.mobile.ads.impl.z52$a */
    /* loaded from: classes8.dex */
    public static final class C31954a {

        /* renamed from: a */
        private final boolean f88734a;
        @NotNull

        /* renamed from: b */
        private final a82 f88735b;
        @Nullable

        /* renamed from: c */
        private xe2 f88736c;
        @Nullable

        /* renamed from: d */
        private String f88737d;
        @Nullable

        /* renamed from: e */
        private String f88738e;
        @Nullable

        /* renamed from: f */
        private String f88739f;
        @Nullable

        /* renamed from: g */
        private String f88740g;
        @Nullable

        /* renamed from: h */
        private String f88741h;
        @Nullable

        /* renamed from: i */
        private fc2 f88742i;
        @Nullable

        /* renamed from: j */
        private Integer f88743j;
        @Nullable

        /* renamed from: k */
        private String f88744k;
        @NotNull

        /* renamed from: l */
        private final ArrayList f88745l;
        @NotNull

        /* renamed from: m */
        private final ArrayList f88746m;
        @NotNull

        /* renamed from: n */
        private final LinkedHashMap f88747n;
        @NotNull

        /* renamed from: o */
        private h62 f88748o;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C31954a(@NotNull Context context, boolean z) {
            this(z, new a82(context));
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @NotNull
        /* renamed from: a */
        public final C31954a m26348a(@Nullable List list) {
            ArrayList arrayList = this.f88746m;
            if (list == null) {
                list = C37563v.m17166m();
            }
            arrayList.addAll(list);
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final void m26346b(@NotNull String impression) {
            Intrinsics.checkNotNullParameter(impression, "impression");
            LinkedHashMap linkedHashMap = this.f88747n;
            Object obj = linkedHashMap.get("impression");
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put("impression", obj);
            }
            ((List) obj).add(impression);
        }

        @NotNull
        /* renamed from: c */
        public final C31954a m26345c(@Nullable String str) {
            this.f88737d = str;
            return this;
        }

        @NotNull
        /* renamed from: d */
        public final C31954a m26344d(@Nullable String str) {
            this.f88738e = str;
            return this;
        }

        @NotNull
        /* renamed from: e */
        public final C31954a m26343e(@Nullable String str) {
            this.f88739f = str;
            return this;
        }

        @NotNull
        /* renamed from: f */
        public final C31954a m26342f(@Nullable String str) {
            this.f88744k = str;
            return this;
        }

        @NotNull
        /* renamed from: g */
        public final C31954a m26341g(@Nullable String str) {
            this.f88740g = str;
            return this;
        }

        @NotNull
        /* renamed from: h */
        public final C31954a m26340h(@Nullable String str) {
            this.f88741h = str;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C31954a m26349a(@Nullable ArrayList arrayList) {
            this.f88745l.addAll(arrayList);
            return this;
        }

        private C31954a(boolean z, a82 a82Var) {
            this.f88734a = z;
            this.f88735b = a82Var;
            this.f88745l = new ArrayList();
            this.f88746m = new ArrayList();
            C37559r0.m17284j();
            this.f88747n = new LinkedHashMap();
            this.f88748o = new h62.C30445a().m33604a();
        }

        @NotNull
        /* renamed from: a */
        public final void m26350a(@NotNull String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            LinkedHashMap linkedHashMap = this.f88747n;
            Object obj = linkedHashMap.get("error");
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put("error", obj);
            }
            ((List) obj).add(error);
        }

        @NotNull
        /* renamed from: a */
        public final C31954a m26347a(@Nullable Map<String, ? extends List<String>> map) {
            List<String> m17534m0;
            if (map == null) {
                map = C37559r0.m17284j();
            }
            for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (value == null) {
                    value = C37563v.m17166m();
                }
                m17534m0 = _Collections.m17534m0(value);
                for (String str : m17534m0) {
                    LinkedHashMap linkedHashMap = this.f88747n;
                    Object obj = linkedHashMap.get(key);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(key, obj);
                    }
                    ((List) obj).add(str);
                }
            }
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final z52 m26355a() {
            return new z52(this.f88734a, this.f88745l, this.f88747n, this.f88748o, this.f88737d, this.f88738e, this.f88739f, this.f88740g, this.f88741h, this.f88742i, this.f88743j, this.f88744k, this.f88736c, this.f88746m, this.f88735b.m35937a(this.f88747n, this.f88742i));
        }

        @NotNull
        /* renamed from: a */
        public final void m26351a(@Nullable Integer num) {
            this.f88743j = num;
        }

        @NotNull
        /* renamed from: a */
        public final C31954a m26353a(@NotNull h62 videoAdExtensions) {
            Intrinsics.checkNotNullParameter(videoAdExtensions, "videoAdExtensions");
            this.f88748o = videoAdExtensions;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C31954a m26354a(@NotNull fc2 viewableImpression) {
            Intrinsics.checkNotNullParameter(viewableImpression, "viewableImpression");
            this.f88742i = viewableImpression;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C31954a m26352a(@Nullable xe2 xe2Var) {
            this.f88736c = xe2Var;
            return this;
        }
    }

    public z52(boolean z, @NotNull ArrayList creatives, @NotNull LinkedHashMap rawTrackingEvents, @NotNull h62 videoAdExtensions, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable fc2 fc2Var, @Nullable Integer num, @Nullable String str6, @Nullable xe2 xe2Var, @NotNull ArrayList adVerifications, @NotNull Map trackingEvents) {
        Intrinsics.checkNotNullParameter(creatives, "creatives");
        Intrinsics.checkNotNullParameter(rawTrackingEvents, "rawTrackingEvents");
        Intrinsics.checkNotNullParameter(videoAdExtensions, "videoAdExtensions");
        Intrinsics.checkNotNullParameter(adVerifications, "adVerifications");
        Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
        this.f88719a = z;
        this.f88720b = creatives;
        this.f88721c = rawTrackingEvents;
        this.f88722d = videoAdExtensions;
        this.f88723e = str;
        this.f88724f = str2;
        this.f88725g = str3;
        this.f88726h = str4;
        this.f88727i = str5;
        this.f88728j = fc2Var;
        this.f88729k = num;
        this.f88730l = str6;
        this.f88731m = xe2Var;
        this.f88732n = adVerifications;
        this.f88733o = trackingEvents;
    }

    @Override // com.yandex.mobile.ads.impl.pa2
    @NotNull
    /* renamed from: a */
    public final Map<String, List<String>> mo26370a() {
        return this.f88733o;
    }

    @Nullable
    /* renamed from: b */
    public final String m26369b() {
        return this.f88723e;
    }

    @Nullable
    /* renamed from: c */
    public final String m26368c() {
        return this.f88724f;
    }

    @NotNull
    /* renamed from: d */
    public final List<j52> m26367d() {
        return this.f88732n;
    }

    @NotNull
    /* renamed from: e */
    public final List<C30746kt> m26366e() {
        return this.f88720b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z52)) {
            return false;
        }
        z52 z52Var = (z52) obj;
        if (this.f88719a == z52Var.f88719a && Intrinsics.m17075f(this.f88720b, z52Var.f88720b) && Intrinsics.m17075f(this.f88721c, z52Var.f88721c) && Intrinsics.m17075f(this.f88722d, z52Var.f88722d) && Intrinsics.m17075f(this.f88723e, z52Var.f88723e) && Intrinsics.m17075f(this.f88724f, z52Var.f88724f) && Intrinsics.m17075f(this.f88725g, z52Var.f88725g) && Intrinsics.m17075f(this.f88726h, z52Var.f88726h) && Intrinsics.m17075f(this.f88727i, z52Var.f88727i) && Intrinsics.m17075f(this.f88728j, z52Var.f88728j) && Intrinsics.m17075f(this.f88729k, z52Var.f88729k) && Intrinsics.m17075f(this.f88730l, z52Var.f88730l) && Intrinsics.m17075f(this.f88731m, z52Var.f88731m) && Intrinsics.m17075f(this.f88732n, z52Var.f88732n) && Intrinsics.m17075f(this.f88733o, z52Var.f88733o)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final String m26365f() {
        return this.f88725g;
    }

    @Nullable
    /* renamed from: g */
    public final String m26364g() {
        return this.f88730l;
    }

    @NotNull
    /* renamed from: h */
    public final Map<String, List<String>> m26363h() {
        return this.f88721c;
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
        int hashCode9 = (this.f88722d.hashCode() + ((this.f88721c.hashCode() + C31097p9.m30807a(this.f88720b, Boolean.hashCode(this.f88719a) * 31, 31)) * 31)) * 31;
        String str = this.f88723e;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode9 + hashCode) * 31;
        String str2 = this.f88724f;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.f88725g;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.f88726h;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.f88727i;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        fc2 fc2Var = this.f88728j;
        if (fc2Var == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = fc2Var.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Integer num = this.f88729k;
        if (num == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str6 = this.f88730l;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        xe2 xe2Var = this.f88731m;
        if (xe2Var != null) {
            i = xe2Var.hashCode();
        }
        return this.f88733o.hashCode() + C31097p9.m30807a(this.f88732n, (i9 + i) * 31, 31);
    }

    @Nullable
    /* renamed from: i */
    public final Integer m26362i() {
        return this.f88729k;
    }

    @Nullable
    /* renamed from: j */
    public final String m26361j() {
        return this.f88726h;
    }

    @Nullable
    /* renamed from: k */
    public final String m26360k() {
        return this.f88727i;
    }

    @NotNull
    /* renamed from: l */
    public final h62 m26359l() {
        return this.f88722d;
    }

    @Nullable
    /* renamed from: m */
    public final fc2 m26358m() {
        return this.f88728j;
    }

    @Nullable
    /* renamed from: n */
    public final xe2 m26357n() {
        return this.f88731m;
    }

    /* renamed from: o */
    public final boolean m26356o() {
        return this.f88719a;
    }

    @NotNull
    public final String toString() {
        boolean z = this.f88719a;
        List<C30746kt> list = this.f88720b;
        Map<String, List<String>> map = this.f88721c;
        h62 h62Var = this.f88722d;
        String str = this.f88723e;
        String str2 = this.f88724f;
        String str3 = this.f88725g;
        String str4 = this.f88726h;
        String str5 = this.f88727i;
        fc2 fc2Var = this.f88728j;
        Integer num = this.f88729k;
        String str6 = this.f88730l;
        xe2 xe2Var = this.f88731m;
        List<j52> list2 = this.f88732n;
        Map<String, List<String>> map2 = this.f88733o;
        return "VideoAd(isWrapper=" + z + ", creatives=" + list + ", rawTrackingEvents=" + map + ", videoAdExtensions=" + h62Var + ", adSystem=" + str + ", adTitle=" + str2 + ", description=" + str3 + ", survey=" + str4 + ", vastAdTagUri=" + str5 + ", viewableImpression=" + fc2Var + ", sequence=" + num + ", id=" + str6 + ", wrapperConfiguration=" + xe2Var + ", adVerifications=" + list2 + ", trackingEvents=" + map2 + ")";
    }
}
