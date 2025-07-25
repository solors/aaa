package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.amazon.device.ads.DtbConstants;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class gf0 implements InterfaceC31607ur {
    @NotNull

    /* renamed from: a */
    private final Context f79648a;
    @NotNull

    /* renamed from: b */
    private final to1 f79649b;

    public gf0(@NotNull Context context, @NotNull to1 sslSocketFactoryCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sslSocketFactoryCreator, "sslSocketFactoryCreator");
        this.f79648a = context;
        this.f79649b = sslSocketFactoryCreator;
    }

    /* renamed from: b */
    private final HttpsURLConnection m33838b(String str) {
        boolean m16624M;
        boolean m16616x;
        StringBuilder sb2 = new StringBuilder(str.length() + 13);
        m16624M = StringsJVM.m16624M(str, DtbConstants.HTTPS, false, 2, null);
        if (!m16624M) {
            sb2.append(DtbConstants.HTTPS);
        }
        sb2.append(str);
        m16616x = StringsJVM.m16616x(str, "/ping", false, 2, null);
        if (!m16616x) {
            sb2.append("/ping");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        URLConnection openConnection = new URL(sb3).openConnection();
        Intrinsics.m17073h(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
        httpsURLConnection.setSSLSocketFactory(this.f79649b.mo28716a(this.f79648a));
        httpsURLConnection.setRequestMethod("HEAD");
        httpsURLConnection.setConnectTimeout(2000);
        httpsURLConnection.setReadTimeout(2000);
        return httpsURLConnection;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31607ur
    /* renamed from: a */
    public final boolean mo28686a(@NotNull String host) {
        HttpsURLConnection httpsURLConnection;
        Intrinsics.checkNotNullParameter(host, "host");
        boolean z = false;
        try {
            httpsURLConnection = m33838b(host);
            try {
                int responseCode = httpsURLConnection.getResponseCode();
                if (200 <= responseCode && responseCode < 500) {
                    z = true;
                }
                httpsURLConnection.disconnect();
                return z;
            } catch (Throwable unused) {
                try {
                    um0.m28726c(new Object[0]);
                    return false;
                } finally {
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable unused2) {
            httpsURLConnection = null;
        }
    }
}
