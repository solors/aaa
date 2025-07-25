package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class qq1 {
    @NotNull

    /* renamed from: a */
    private final to1 f84470a;

    public qq1(@NotNull to1 sslSocketFactoryCreator) {
        Intrinsics.checkNotNullParameter(sslSocketFactoryCreator, "sslSocketFactoryCreator");
        this.f84470a = sslSocketFactoryCreator;
    }

    @NotNull
    /* renamed from: a */
    public final rq1 m30245a(@NotNull Context context) {
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        String mo28049a = C30926nc.m31619a().mo28049a();
        SSLSocketFactory mo28716a = this.f84470a.mo28716a(context);
        int i = as1.f76895l;
        yp1 m35796a = as1.C29962a.m35776a().m35796a(context);
        if (m35796a != null && m35796a.m26731t0()) {
            z = true;
        } else {
            z = false;
        }
        return new rq1(mo28049a, mo28716a, z);
    }
}
