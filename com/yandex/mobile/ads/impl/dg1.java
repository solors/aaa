package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class dg1 implements o32 {
    @NotNull

    /* renamed from: a */
    private final kl1 f78124a;
    @NotNull

    /* renamed from: b */
    private final gz1 f78125b;
    @NotNull

    /* renamed from: c */
    private final m32 f78126c;

    /* renamed from: d */
    private String f78127d;

    public dg1(@NotNull Context context, @NotNull kl1 reporter, @NotNull gz1 targetUrlHandler, @NotNull m32 urlModifier) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(targetUrlHandler, "targetUrlHandler");
        Intrinsics.checkNotNullParameter(urlModifier, "urlModifier");
        this.f78124a = reporter;
        this.f78125b = targetUrlHandler;
        this.f78126c = urlModifier;
    }

    @Override // com.yandex.mobile.ads.impl.o32
    /* renamed from: a */
    public final void mo31187a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String m32106a = this.f78126c.m32106a(url);
        if (url.length() != 0) {
            url = m32106a;
        }
        this.f78127d = url;
        String str = null;
        if (url == null) {
            Intrinsics.m17056y("targetUrl");
            url = null;
        }
        if (url.length() == 0) {
            um0.m28727b(new Object[0]);
            return;
        }
        gz1 gz1Var = this.f78125b;
        kl1 kl1Var = this.f78124a;
        String str2 = this.f78127d;
        if (str2 == null) {
            Intrinsics.m17056y("targetUrl");
        } else {
            str = str2;
        }
        gz1Var.mo31254a(kl1Var, str);
    }
}
