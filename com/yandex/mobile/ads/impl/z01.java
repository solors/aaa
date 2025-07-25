package com.yandex.mobile.ads.impl;

import com.monetization.ads.common.AdImpressionData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class z01 {
    @NotNull

    /* renamed from: a */
    private final xm1 f88644a;
    @NotNull

    /* renamed from: b */
    private List<? extends C31034of<?>> f88645b;
    @Nullable

    /* renamed from: c */
    private final String f88646c;
    @Nullable

    /* renamed from: d */
    private final String f88647d;
    @Nullable

    /* renamed from: e */
    private final xo0 f88648e;
    @Nullable

    /* renamed from: f */
    private final AdImpressionData f88649f;
    @Nullable

    /* renamed from: g */
    private final v80 f88650g;
    @Nullable

    /* renamed from: h */
    private final v80 f88651h;
    @NotNull

    /* renamed from: i */
    private final List<String> f88652i;
    @NotNull

    /* renamed from: j */
    private final List<ot1> f88653j;

    public z01(@NotNull xm1 responseNativeType, @NotNull List<? extends C31034of<?>> assets, @Nullable String str, @Nullable String str2, @Nullable xo0 xo0Var, @Nullable AdImpressionData adImpressionData, @Nullable v80 v80Var, @Nullable v80 v80Var2, @NotNull List<String> renderTrackingUrls, @NotNull List<ot1> showNotices) {
        Intrinsics.checkNotNullParameter(responseNativeType, "responseNativeType");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(renderTrackingUrls, "renderTrackingUrls");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        this.f88644a = responseNativeType;
        this.f88645b = assets;
        this.f88646c = str;
        this.f88647d = str2;
        this.f88648e = xo0Var;
        this.f88649f = adImpressionData;
        this.f88650g = v80Var;
        this.f88651h = v80Var2;
        this.f88652i = renderTrackingUrls;
        this.f88653j = showNotices;
    }

    @Nullable
    /* renamed from: a */
    public final String m26494a() {
        return this.f88646c;
    }

    @NotNull
    /* renamed from: b */
    public final List<C31034of<?>> m26492b() {
        return this.f88645b;
    }

    @Nullable
    /* renamed from: c */
    public final AdImpressionData m26491c() {
        return this.f88649f;
    }

    @Nullable
    /* renamed from: d */
    public final String m26490d() {
        return this.f88647d;
    }

    @Nullable
    /* renamed from: e */
    public final xo0 m26489e() {
        return this.f88648e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z01)) {
            return false;
        }
        z01 z01Var = (z01) obj;
        if (this.f88644a == z01Var.f88644a && Intrinsics.m17075f(this.f88645b, z01Var.f88645b) && Intrinsics.m17075f(this.f88646c, z01Var.f88646c) && Intrinsics.m17075f(this.f88647d, z01Var.f88647d) && Intrinsics.m17075f(this.f88648e, z01Var.f88648e) && Intrinsics.m17075f(this.f88649f, z01Var.f88649f) && Intrinsics.m17075f(this.f88650g, z01Var.f88650g) && Intrinsics.m17075f(this.f88651h, z01Var.f88651h) && Intrinsics.m17075f(this.f88652i, z01Var.f88652i) && Intrinsics.m17075f(this.f88653j, z01Var.f88653j)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final List<String> m26488f() {
        return this.f88652i;
    }

    @NotNull
    /* renamed from: g */
    public final xm1 m26487g() {
        return this.f88644a;
    }

    @NotNull
    /* renamed from: h */
    public final List<ot1> m26486h() {
        return this.f88653j;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int m30807a = C31097p9.m30807a(this.f88645b, this.f88644a.hashCode() * 31, 31);
        String str = this.f88646c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (m30807a + hashCode) * 31;
        String str2 = this.f88647d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        xo0 xo0Var = this.f88648e;
        if (xo0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = xo0Var.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        AdImpressionData adImpressionData = this.f88649f;
        if (adImpressionData == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = adImpressionData.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        v80 v80Var = this.f88650g;
        if (v80Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = v80Var.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        v80 v80Var2 = this.f88651h;
        if (v80Var2 != null) {
            i = v80Var2.hashCode();
        }
        return this.f88653j.hashCode() + C31097p9.m30807a(this.f88652i, (i6 + i) * 31, 31);
    }

    @NotNull
    public final String toString() {
        xm1 xm1Var = this.f88644a;
        List<? extends C31034of<?>> list = this.f88645b;
        String str = this.f88646c;
        String str2 = this.f88647d;
        xo0 xo0Var = this.f88648e;
        AdImpressionData adImpressionData = this.f88649f;
        v80 v80Var = this.f88650g;
        v80 v80Var2 = this.f88651h;
        List<String> list2 = this.f88652i;
        List<ot1> list3 = this.f88653j;
        return "Native(responseNativeType=" + xm1Var + ", assets=" + list + ", adId=" + str + ", info=" + str2 + ", link=" + xo0Var + ", impressionData=" + adImpressionData + ", hideConditions=" + v80Var + ", showConditions=" + v80Var2 + ", renderTrackingUrls=" + list2 + ", showNotices=" + list3 + ")";
    }

    /* renamed from: a */
    public final void m26493a(@NotNull ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.f88645b = arrayList;
    }
}
