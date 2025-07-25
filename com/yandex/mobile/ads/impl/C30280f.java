package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.f */
/* loaded from: classes8.dex */
public final class C30280f {
    @NotNull

    /* renamed from: a */
    private final String f78848a;
    @NotNull

    /* renamed from: b */
    private final Set<Long> f78849b;

    public C30280f() {
        this(0);
    }

    @NotNull
    /* renamed from: a */
    public final String m34406a() {
        return this.f78848a;
    }

    @NotNull
    /* renamed from: b */
    public final Set<Long> m34405b() {
        return this.f78849b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30280f)) {
            return false;
        }
        C30280f c30280f = (C30280f) obj;
        if (Intrinsics.m17075f(this.f78848a, c30280f.f78848a) && Intrinsics.m17075f(this.f78849b, c30280f.f78849b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f78849b.hashCode() + (this.f78848a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f78848a;
        Set<Long> set = this.f78849b;
        return "AbExperimentData(experiments=" + str + ", triggeredTestIds=" + set + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C30280f(int r2) {
        /*
            r1 = this;
            java.lang.String r2 = ""
            java.util.Set r0 = kotlin.collections.C37570x0.m17138f()
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C30280f.<init>(int):void");
    }

    public C30280f(@NotNull String experiments, @NotNull Set<Long> triggeredTestIds) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(triggeredTestIds, "triggeredTestIds");
        this.f78848a = experiments;
        this.f78849b = triggeredTestIds;
    }
}
