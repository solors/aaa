package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class uo1 implements to1 {
    @NotNull

    /* renamed from: a */
    private final as1 f86344a;

    public uo1(@NotNull as1 sdkSettings) {
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f86344a = sdkSettings;
    }

    @Override // com.yandex.mobile.ads.impl.to1
    @Nullable
    /* renamed from: a */
    public final SSLSocketFactory mo28716a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        yp1 m35796a = this.f86344a.m35796a(context);
        Intrinsics.checkNotNullParameter(context, "context");
        xp1 customCertificatesProvider = new xp1(context);
        if (m35796a != null && m35796a.m26759f0()) {
            Intrinsics.checkNotNullParameter(customCertificatesProvider, "customCertificatesProvider");
            es1 trustManager = ro0.m29971a(customCertificatesProvider);
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            SSLSocketFactory socketFactory = new ro1(trustManager).m29970a().getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        }
        if (C30155da.m34983a(21)) {
            int i = xf1.f87675b;
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLSv1");
                try {
                    sSLContext.init(null, null, null);
                } catch (KeyManagementException e) {
                    um0.m28727b(e.getMessage());
                }
                SSLSocketFactory socketFactory2 = sSLContext.getSocketFactory();
                Intrinsics.checkNotNullExpressionValue(socketFactory2, "getSocketFactory(...)");
                return new xf1(socketFactory2);
            } catch (NoSuchAlgorithmException e2) {
                um0.m28727b("TLSv1", e2.getMessage());
            }
        }
        return null;
    }
}
