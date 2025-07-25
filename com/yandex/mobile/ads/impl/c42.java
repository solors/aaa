package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c42 {
    @NotNull

    /* renamed from: a */
    private final as1 f77504a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c42() {
        this(as1.C29962a.m35776a());
        int i = as1.f76895l;
    }

    /* renamed from: a */
    public final boolean m35360a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        yp1 m35796a = this.f77504a.m35796a(context);
        if (m35796a != null && m35796a.m26788I()) {
            return true;
        }
        return false;
    }

    public c42(@NotNull as1 sdkSettings) {
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f77504a = sdkSettings;
    }
}
