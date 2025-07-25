package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class z51 {
    /* renamed from: a */
    public static final boolean m26371a(@NotNull JSONObject jsonNative, @NotNull String... keys) {
        Intrinsics.checkNotNullParameter(jsonNative, "jsonNative");
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (String str : keys) {
            if (!jsonNative.has(str)) {
                return false;
            }
        }
        return true;
    }
}
