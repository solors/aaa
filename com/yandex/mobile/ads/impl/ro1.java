package com.yandex.mobile.ads.impl;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ro1 {
    @NotNull

    /* renamed from: a */
    private final X509TrustManager f84843a;

    public ro1(@NotNull es1 trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        this.f84843a = trustManager;
    }

    @NotNull
    /* renamed from: a */
    public final SSLContext m29970a() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new X509TrustManager[]{this.f84843a}, null);
            Intrinsics.m17074g(sSLContext);
            return sSLContext;
        } catch (KeyManagementException e) {
            throw new IllegalStateException("Failed to initialize SSLContext", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No system TLS", e2);
        }
    }
}
