package com.yandex.mobile.ads.impl;

import com.monetization.ads.common.AdImpressionData;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class n31 {
    @NotNull

    /* renamed from: a */
    private final List<z01> f82597a;
    @NotNull

    /* renamed from: b */
    private final List<C31034of<?>> f82598b;
    @NotNull

    /* renamed from: c */
    private final List<String> f82599c;
    @Nullable

    /* renamed from: d */
    private final AdImpressionData f82600d;
    @NotNull

    /* renamed from: e */
    private final Map<String, Object> f82601e;
    @NotNull

    /* renamed from: f */
    private final List<h10> f82602f;
    @NotNull

    /* renamed from: g */
    private final List<ot1> f82603g;
    @Nullable

    /* renamed from: h */
    private final String f82604h;
    @Nullable

    /* renamed from: i */
    private final it1 f82605i;
    @Nullable

    /* renamed from: j */
    private final C31953z5 f82606j;

    /* JADX WARN: Multi-variable type inference failed */
    public n31(@NotNull List<z01> nativeAds, @NotNull List<? extends C31034of<?>> assets, @NotNull List<String> renderTrackingUrls, @Nullable AdImpressionData adImpressionData, @NotNull Map<String, ? extends Object> properties, @NotNull List<h10> divKitDesigns, @NotNull List<ot1> showNotices, @Nullable String str, @Nullable it1 it1Var, @Nullable C31953z5 c31953z5) {
        Intrinsics.checkNotNullParameter(nativeAds, "nativeAds");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(renderTrackingUrls, "renderTrackingUrls");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(divKitDesigns, "divKitDesigns");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        this.f82597a = nativeAds;
        this.f82598b = assets;
        this.f82599c = renderTrackingUrls;
        this.f82600d = adImpressionData;
        this.f82601e = properties;
        this.f82602f = divKitDesigns;
        this.f82603g = showNotices;
        this.f82604h = str;
        this.f82605i = it1Var;
        this.f82606j = c31953z5;
    }

    @Nullable
    /* renamed from: a */
    public final C31953z5 m31676a() {
        return this.f82606j;
    }

    @NotNull
    /* renamed from: b */
    public final List<C31034of<?>> m31675b() {
        return this.f82598b;
    }

    @NotNull
    /* renamed from: c */
    public final List<h10> m31674c() {
        return this.f82602f;
    }

    @Nullable
    /* renamed from: d */
    public final AdImpressionData m31673d() {
        return this.f82600d;
    }

    @NotNull
    /* renamed from: e */
    public final List<z01> m31672e() {
        return this.f82597a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n31)) {
            return false;
        }
        n31 n31Var = (n31) obj;
        if (Intrinsics.m17075f(this.f82597a, n31Var.f82597a) && Intrinsics.m17075f(this.f82598b, n31Var.f82598b) && Intrinsics.m17075f(this.f82599c, n31Var.f82599c) && Intrinsics.m17075f(this.f82600d, n31Var.f82600d) && Intrinsics.m17075f(this.f82601e, n31Var.f82601e) && Intrinsics.m17075f(this.f82602f, n31Var.f82602f) && Intrinsics.m17075f(this.f82603g, n31Var.f82603g) && Intrinsics.m17075f(this.f82604h, n31Var.f82604h) && Intrinsics.m17075f(this.f82605i, n31Var.f82605i) && Intrinsics.m17075f(this.f82606j, n31Var.f82606j)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final Map<String, Object> m31671f() {
        return this.f82601e;
    }

    @NotNull
    /* renamed from: g */
    public final List<String> m31670g() {
        return this.f82599c;
    }

    @Nullable
    /* renamed from: h */
    public final it1 m31669h() {
        return this.f82605i;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int m30807a = C31097p9.m30807a(this.f82599c, C31097p9.m30807a(this.f82598b, this.f82597a.hashCode() * 31, 31), 31);
        AdImpressionData adImpressionData = this.f82600d;
        int i = 0;
        if (adImpressionData == null) {
            hashCode = 0;
        } else {
            hashCode = adImpressionData.hashCode();
        }
        int m30807a2 = C31097p9.m30807a(this.f82603g, C31097p9.m30807a(this.f82602f, (this.f82601e.hashCode() + ((m30807a + hashCode) * 31)) * 31, 31), 31);
        String str = this.f82604h;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i2 = (m30807a2 + hashCode2) * 31;
        it1 it1Var = this.f82605i;
        if (it1Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = it1Var.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        C31953z5 c31953z5 = this.f82606j;
        if (c31953z5 != null) {
            i = c31953z5.hashCode();
        }
        return i3 + i;
    }

    @NotNull
    /* renamed from: i */
    public final List<ot1> m31668i() {
        return this.f82603g;
    }

    @NotNull
    public final String toString() {
        List<z01> list = this.f82597a;
        List<C31034of<?>> list2 = this.f82598b;
        List<String> list3 = this.f82599c;
        AdImpressionData adImpressionData = this.f82600d;
        Map<String, Object> map = this.f82601e;
        List<h10> list4 = this.f82602f;
        List<ot1> list5 = this.f82603g;
        String str = this.f82604h;
        it1 it1Var = this.f82605i;
        C31953z5 c31953z5 = this.f82606j;
        return "NativeAdResponse(nativeAds=" + list + ", assets=" + list2 + ", renderTrackingUrls=" + list3 + ", impressionData=" + adImpressionData + ", properties=" + map + ", divKitDesigns=" + list4 + ", showNotices=" + list5 + ", version=" + str + ", settings=" + it1Var + ", adPod=" + c31953z5 + ")";
    }
}
