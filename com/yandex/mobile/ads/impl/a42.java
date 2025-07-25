package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a42 {
    @NotNull

    /* renamed from: a */
    private final as1 f76712a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a42() {
        this(as1.C29962a.m35776a());
        int i = as1.f76895l;
    }

    /* renamed from: a */
    public final boolean m35967a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        yp1 m35796a = this.f76712a.m35796a(context);
        if (m35796a != null && m35796a.m26789H()) {
            return true;
        }
        return false;
    }

    public a42(@NotNull as1 sdkSettings) {
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f76712a = sdkSettings;
    }
}
