package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import okio.C39208h;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ut */
/* loaded from: classes8.dex */
public final class C31609ut {
    @NotNull
    /* renamed from: a */
    public static final String m28639a(@NotNull String username, @NotNull String password, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(charset, "charset");
        String mo13398b = C39208h.f102952f.m13548c(username + ":" + password, charset).mo13398b();
        return "Basic " + mo13398b;
    }
}
