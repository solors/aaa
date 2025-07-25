package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import com.yandex.mobile.ads.impl.qf0;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class rf0 {
    @NotNull
    /* renamed from: a */
    public static AbstractC31047oj m30057a(@NotNull Context context, @Nullable qf0.InterfaceC31200b interfaceC31200b, @Nullable SSLSocketFactory sSLSocketFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = as1.f76895l;
        yp1 m35796a = as1.C29962a.m35776a().m35796a(context);
        if (m35796a != null && m35796a.m26731t0()) {
            return new sf0(interfaceC31200b, sSLSocketFactory);
        }
        return new qf0(interfaceC31200b, sSLSocketFactory);
    }
}
