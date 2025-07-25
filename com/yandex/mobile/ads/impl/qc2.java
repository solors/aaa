package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class qc2 {
    @NotNull

    /* renamed from: a */
    private final List<C30530i2> f84296a;

    public qc2(@NotNull String version, @NotNull ArrayList adBreaks, @NotNull ArrayList extensions) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f84296a = adBreaks;
    }

    @NotNull
    /* renamed from: a */
    public final List<C30530i2> m30407a() {
        return this.f84296a;
    }
}
