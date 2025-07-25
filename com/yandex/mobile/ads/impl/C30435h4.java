package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.h4 */
/* loaded from: classes8.dex */
public final class C30435h4 {
    @NotNull

    /* renamed from: a */
    private final rd0 f79872a;

    public C30435h4(@NotNull rd0 hostValidator) {
        Intrinsics.checkNotNullParameter(hostValidator, "hostValidator");
        this.f79872a = hostValidator;
    }

    @Nullable
    /* renamed from: a */
    public final String m33702a(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String optString = jsonObject.optString("dev_ad_host", null);
        this.f79872a.getClass();
        if (!rd0.m30073a(optString)) {
            return null;
        }
        return optString;
    }
}
