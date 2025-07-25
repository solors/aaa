package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class za1 {
    @NotNull

    /* renamed from: a */
    private final as1 f88799a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ za1() {
        this(as1.C29962a.m35776a());
        int i = as1.f76895l;
    }

    /* renamed from: a */
    public final boolean m26292a(@NotNull Context context) {
        yp1 m35796a;
        Intrinsics.checkNotNullParameter(context, "context");
        if (C30079ca.m35333a(context) && (m35796a = this.f88799a.m35796a(context)) != null && !m35796a.m26745m0()) {
            return true;
        }
        return false;
    }

    public za1(@NotNull as1 sdkSettings) {
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f88799a = sdkSettings;
    }
}
