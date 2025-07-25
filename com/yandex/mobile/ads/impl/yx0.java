package com.yandex.mobile.ads.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class yx0 {
    @NotNull

    /* renamed from: a */
    private final Context f88604a;

    public yx0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f88604a = applicationContext;
    }

    @NotNull
    /* renamed from: a */
    public final xx0 m26542a(@Nullable SSLSocketFactory sSLSocketFactory) {
        Context context = this.f88604a;
        return new xx0(context, sSLSocketFactory, new C30063c(context, sSLSocketFactory), new kj1(), C30136d.m35130a(context), new d91(), new rf0());
    }
}
