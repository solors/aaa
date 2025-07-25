package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ds */
/* loaded from: classes8.dex */
public final class C30191ds {
    @NotNull
    /* renamed from: a */
    public static C31763wr m34863a(@NotNull InstreamAd instreamAd) {
        Intrinsics.checkNotNullParameter(instreamAd, "instreamAd");
        if (instreamAd instanceof cg2) {
            return ((cg2) instreamAd).m35234a();
        }
        throw new IllegalArgumentException("You should pass InstreamAd received from InstreamAdLoader");
    }
}
