package com.yandex.mobile.ads.impl;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.e6 */
/* loaded from: classes8.dex */
public final class C30222e6 implements v00 {
    @NotNull

    /* renamed from: a */
    private final uu1 f78464a;

    public C30222e6(@NotNull uu1 skipAdController) {
        Intrinsics.checkNotNullParameter(skipAdController, "skipAdController");
        this.f78464a = skipAdController;
    }

    @Override // com.yandex.mobile.ads.impl.v00
    /* renamed from: a */
    public final boolean mo28581a(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (Intrinsics.m17075f(uri.getHost(), "showNextAd")) {
            this.f78464a.mo28628a();
            return true;
        }
        return false;
    }
}
