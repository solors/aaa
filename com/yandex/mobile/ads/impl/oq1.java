package com.yandex.mobile.ads.impl;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class oq1 extends C30680jy {
    @Nullable

    /* renamed from: s */
    private final SSLSocketFactory f83580s;

    public oq1(@Nullable String str, @Nullable cf0 cf0Var, @Nullable SSLSocketFactory sSLSocketFactory) {
        super(str, 8000, 8000, cf0Var);
        this.f83580s = sSLSocketFactory;
    }

    @Override // com.yandex.mobile.ads.impl.C30680jy
    @NotNull
    /* renamed from: a */
    public final HttpURLConnection mo30941a(@NotNull URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        SSLSocketFactory sSLSocketFactory = this.f83580s;
        if (sSLSocketFactory != null && (httpURLConnection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        Intrinsics.m17074g(httpURLConnection);
        return httpURLConnection;
    }
}
