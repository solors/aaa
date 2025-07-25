package com.yandex.mobile.ads.banner;

import com.yandex.mobile.ads.impl.C31309rr;
import com.yandex.mobile.ads.impl.qu1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.banner.a */
/* loaded from: classes8.dex */
public final class C29890a {
    @NotNull
    /* renamed from: a */
    public static final C31309rr m36051a(@NotNull BannerAdSize adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        qu1 m36052a = adSize.m36052a();
        Intrinsics.checkNotNullExpressionValue(m36052a, "getSizeInfo(...)");
        return new C31309rr(m36052a);
    }
}
