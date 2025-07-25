package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import com.yandex.mobile.ads.impl.qd1;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"NewApi"})
/* renamed from: com.yandex.mobile.ads.impl.xc */
/* loaded from: classes8.dex */
public final class C31808xc implements tw1 {

    /* renamed from: com.yandex.mobile.ads.impl.xc$a */
    /* loaded from: classes8.dex */
    public static final class C31809a {
        @Nullable
        /* renamed from: a */
        public static C31808xc m27580a() {
            if (m27579b()) {
                return new C31808xc();
            }
            return null;
        }

        /* renamed from: b */
        public static boolean m27579b() {
            int i = qd1.f84303c;
            if (Intrinsics.m17075f("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29) {
                return true;
            }
            return false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public final void mo27582a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends hi1> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            int i = qd1.f84303c;
            sSLParameters.setApplicationProtocols((String[]) qd1.C31196a.m30395a(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    @SuppressLint({"NewApi"})
    @Nullable
    /* renamed from: b */
    public final String mo27581b(@NotNull SSLSocket sslSocket) {
        String applicationProtocol;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null || Intrinsics.m17075f(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    /* renamed from: a */
    public final boolean mo27583a(@NotNull SSLSocket sslSocket) {
        boolean isSupportedSocket;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        isSupportedSocket = SSLSockets.isSupportedSocket(sslSocket);
        return isSupportedSocket;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    /* renamed from: a */
    public final boolean mo27584a() {
        return C31809a.m27579b();
    }
}
