package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class b70 extends w70 {
    @NotNull

    /* renamed from: a */
    private final lv1 f77166a;
    @NotNull

    /* renamed from: b */
    private final C30149d8<String> f77167b;
    @NotNull

    /* renamed from: c */
    private final List<tg1> f77168c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b70(@NotNull lv1 sliderAd, @NotNull C30149d8 adResponse, @NotNull ArrayList preloadedDivKitDesigns) {
        super(0);
        Intrinsics.checkNotNullParameter(sliderAd, "sliderAd");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(preloadedDivKitDesigns, "preloadedDivKitDesigns");
        this.f77166a = sliderAd;
        this.f77167b = adResponse;
        this.f77168c = preloadedDivKitDesigns;
    }

    @NotNull
    /* renamed from: a */
    public final C30149d8<String> m35583a() {
        return this.f77167b;
    }

    @NotNull
    /* renamed from: b */
    public final List<tg1> m35582b() {
        return this.f77168c;
    }

    @NotNull
    /* renamed from: c */
    public final lv1 m35581c() {
        return this.f77166a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b70)) {
            return false;
        }
        b70 b70Var = (b70) obj;
        if (Intrinsics.m17075f(this.f77166a, b70Var.f77166a) && Intrinsics.m17075f(this.f77167b, b70Var.f77167b) && Intrinsics.m17075f(this.f77168c, b70Var.f77168c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f77167b.hashCode();
        return this.f77168c.hashCode() + ((hashCode + (this.f77166a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        lv1 lv1Var = this.f77166a;
        C30149d8<String> c30149d8 = this.f77167b;
        List<tg1> list = this.f77168c;
        return "FeedItem(sliderAd=" + lv1Var + ", adResponse=" + c30149d8 + ", preloadedDivKitDesigns=" + list + ")";
    }
}
