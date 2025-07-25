package com.yandex.mobile.ads.impl;

import com.monetization.ads.video.models.p550ad.JavaScriptResource;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class j52 implements pa2 {
    @NotNull

    /* renamed from: a */
    private final String f80756a;
    @Nullable

    /* renamed from: b */
    private final JavaScriptResource f80757b;
    @Nullable

    /* renamed from: c */
    private final String f80758c;
    @NotNull

    /* renamed from: d */
    private final Map<String, List<String>> f80759d;

    public j52(@NotNull String vendor, @Nullable JavaScriptResource javaScriptResource, @Nullable String str, @NotNull HashMap events) {
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f80756a = vendor;
        this.f80757b = javaScriptResource;
        this.f80758c = str;
        this.f80759d = events;
    }

    @Override // com.yandex.mobile.ads.impl.pa2
    @NotNull
    /* renamed from: a */
    public final Map<String, List<String>> mo26370a() {
        Map<String, List<String>> unmodifiableMap = Collections.unmodifiableMap(this.f80759d);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        return unmodifiableMap;
    }

    @Nullable
    /* renamed from: b */
    public final JavaScriptResource m33042b() {
        return this.f80757b;
    }

    @Nullable
    /* renamed from: c */
    public final String m33041c() {
        return this.f80758c;
    }

    @NotNull
    /* renamed from: d */
    public final String m33040d() {
        return this.f80756a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j52)) {
            return false;
        }
        j52 j52Var = (j52) obj;
        if (Intrinsics.m17075f(this.f80756a, j52Var.f80756a) && Intrinsics.m17075f(this.f80757b, j52Var.f80757b) && Intrinsics.m17075f(this.f80758c, j52Var.f80758c) && Intrinsics.m17075f(this.f80759d, j52Var.f80759d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f80756a.hashCode() * 31;
        JavaScriptResource javaScriptResource = this.f80757b;
        int i = 0;
        if (javaScriptResource == null) {
            hashCode = 0;
        } else {
            hashCode = javaScriptResource.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str = this.f80758c;
        if (str != null) {
            i = str.hashCode();
        }
        return this.f80759d.hashCode() + ((i2 + i) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f80756a;
        JavaScriptResource javaScriptResource = this.f80757b;
        String str2 = this.f80758c;
        Map<String, List<String>> map = this.f80759d;
        return "Verification(vendor=" + str + ", javaScriptResource=" + javaScriptResource + ", parameters=" + str2 + ", events=" + map + ")";
    }
}
