package com.yandex.mobile.ads.impl;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;

/* renamed from: com.yandex.mobile.ads.impl.xi */
/* loaded from: classes8.dex */
public final class C31824xi {
    @Nullable
    /* renamed from: a */
    public static String m27477a(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        byte[] bytes = value.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return m27476a(bytes);
    }

    @Nullable
    /* renamed from: a */
    public static String m27476a(@NotNull byte[] data) {
        Object m14549b;
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Result.C38506a c38506a = Result.f101870c;
            m14549b = Result.m14549b(Base64.encodeToString(data, 2));
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        if (Result.m14546e(m14549b) != null) {
            um0.m28726c(new Object[0]);
        }
        if (Result.m14544g(m14549b)) {
            m14549b = null;
        }
        return (String) m14549b;
    }
}
