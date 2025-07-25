package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class l91 {
    @NotNull
    /* renamed from: a */
    public static URL m32301a(@NotNull ml1 request, @Nullable n32 n32Var) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        String mo31943l = request.mo31943l();
        if (n32Var != null) {
            String mo31667a = n32Var.mo31667a(mo31943l);
            if (mo31667a != null) {
                mo31943l = mo31667a;
            } else {
                throw new IOException("URL blocked by rewriter: " + mo31943l);
            }
        }
        return new URL(mo31943l);
    }
}
