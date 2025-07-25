package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.kq */
/* loaded from: classes8.dex */
public final class C30742kq {
    @NotNull

    /* renamed from: a */
    private final List<C30652jq> f81517a;

    /* renamed from: b */
    private int f81518b;

    /* renamed from: c */
    private boolean f81519c;

    /* renamed from: d */
    private boolean f81520d;

    public C30742kq(@NotNull List<C30652jq> connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f81517a = connectionSpecs;
    }

    @NotNull
    /* renamed from: a */
    public final C30652jq m32467a(@NotNull SSLSocket sslSocket) throws IOException {
        boolean z;
        C30652jq c30652jq;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i = this.f81518b;
        int size = this.f81517a.size();
        while (true) {
            z = true;
            if (i >= size) {
                c30652jq = null;
                break;
            }
            c30652jq = this.f81517a.get(i);
            if (c30652jq.m32806a(sslSocket)) {
                this.f81518b = i + 1;
                break;
            }
            i++;
        }
        if (c30652jq != null) {
            int i2 = this.f81518b;
            int size2 = this.f81517a.size();
            while (true) {
                if (i2 >= size2) {
                    z = false;
                    break;
                } else if (this.f81517a.get(i2).m32806a(sslSocket)) {
                    break;
                } else {
                    i2++;
                }
            }
            this.f81519c = z;
            c30652jq.m32805a(sslSocket, this.f81520d);
            return c30652jq;
        }
        boolean z2 = this.f81520d;
        List<C30652jq> list = this.f81517a;
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.m17074g(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + z2 + ", modes=" + list + ", supported protocols=" + arrays);
    }

    /* renamed from: a */
    public final boolean m32468a(@NotNull IOException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f81520d = true;
        return (!this.f81519c || (e instanceof ProtocolException) || (e instanceof InterruptedIOException) || ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || !(e instanceof SSLException)) ? false : true;
    }
}
