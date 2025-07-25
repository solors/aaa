package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdSize;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class lf2 {
    @NotNull
    /* renamed from: a */
    public static AdInfo m32275a(@NotNull C30743kr coreAdInfo) {
        AdSize adSize;
        Intrinsics.checkNotNullParameter(coreAdInfo, "coreAdInfo");
        C31727w8 m32462a = coreAdInfo.m32462a();
        if (m32462a != null) {
            adSize = new AdSize(m32462a.m28013b(), m32462a.m28014a());
        } else {
            adSize = null;
        }
        return new AdInfo(coreAdInfo.m32461b(), adSize, coreAdInfo.m32460c());
    }
}
