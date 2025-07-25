package com.yandex.mobile.ads.impl;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class tl1 {
    /* renamed from: a */
    public static void m29106a(@NotNull Uri.Builder builder, @NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(key, "key");
        if (str != null && str.length() != 0) {
            builder.appendQueryParameter(key, str);
        }
    }
}
