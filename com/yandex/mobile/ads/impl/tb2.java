package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class tb2 {
    @NotNull

    /* renamed from: a */
    private final sb2 f85575a;
    @NotNull

    /* renamed from: b */
    private final po0 f85576b;
    @NotNull

    /* renamed from: c */
    private final ur0 f85577c;
    @NotNull

    /* renamed from: d */
    private final Map<String, String> f85578d;

    public tb2(@NotNull sb2 view, @NotNull po0 layoutParams, @NotNull ur0 measured, @NotNull Map<String, String> additionalInfo) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        Intrinsics.checkNotNullParameter(measured, "measured");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        this.f85575a = view;
        this.f85576b = layoutParams;
        this.f85577c = measured;
        this.f85578d = additionalInfo;
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, String> m29237a() {
        return this.f85578d;
    }

    @NotNull
    /* renamed from: b */
    public final po0 m29236b() {
        return this.f85576b;
    }

    @NotNull
    /* renamed from: c */
    public final ur0 m29235c() {
        return this.f85577c;
    }

    @NotNull
    /* renamed from: d */
    public final sb2 m29234d() {
        return this.f85575a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb2)) {
            return false;
        }
        tb2 tb2Var = (tb2) obj;
        if (Intrinsics.m17075f(this.f85575a, tb2Var.f85575a) && Intrinsics.m17075f(this.f85576b, tb2Var.f85576b) && Intrinsics.m17075f(this.f85577c, tb2Var.f85577c) && Intrinsics.m17075f(this.f85578d, tb2Var.f85578d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f85576b.hashCode();
        int hashCode2 = this.f85577c.hashCode();
        return this.f85578d.hashCode() + ((hashCode2 + ((hashCode + (this.f85575a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        sb2 sb2Var = this.f85575a;
        po0 po0Var = this.f85576b;
        ur0 ur0Var = this.f85577c;
        Map<String, String> map = this.f85578d;
        return "ViewSizeInfo(view=" + sb2Var + ", layoutParams=" + po0Var + ", measured=" + ur0Var + ", additionalInfo=" + map + ")";
    }
}
