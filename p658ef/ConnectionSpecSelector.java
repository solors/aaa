package p658ef;

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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1077ze.ConnectionSpec;

@Metadata
/* renamed from: ef.b */
/* loaded from: classes10.dex */
public final class ConnectionSpecSelector {
    @NotNull

    /* renamed from: a */
    private final List<ConnectionSpec> f90138a;

    /* renamed from: b */
    private int f90139b;

    /* renamed from: c */
    private boolean f90140c;

    /* renamed from: d */
    private boolean f90141d;

    public ConnectionSpecSelector(@NotNull List<ConnectionSpec> connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f90138a = connectionSpecs;
    }

    /* renamed from: c */
    private final boolean m25153c(SSLSocket sSLSocket) {
        int i = this.f90139b;
        int size = this.f90138a.size();
        while (i < size) {
            int i2 = i + 1;
            if (this.f90138a.get(i).m301e(sSLSocket)) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    @NotNull
    /* renamed from: a */
    public final ConnectionSpec m25155a(@NotNull SSLSocket sslSocket) throws IOException {
        ConnectionSpec connectionSpec;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i = this.f90139b;
        int size = this.f90138a.size();
        while (true) {
            if (i < size) {
                int i2 = i + 1;
                connectionSpec = this.f90138a.get(i);
                if (connectionSpec.m301e(sslSocket)) {
                    this.f90139b = i2;
                    break;
                }
                i = i2;
            } else {
                connectionSpec = null;
                break;
            }
        }
        if (connectionSpec != null) {
            this.f90140c = m25153c(sslSocket);
            connectionSpec.m303c(sslSocket, this.f90141d);
            return connectionSpec;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f90141d);
        sb2.append(", modes=");
        sb2.append(this.f90138a);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.m17074g(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    /* renamed from: b */
    public final boolean m25154b(@NotNull IOException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f90141d = true;
        if (this.f90140c && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
            return true;
        }
        return false;
    }
}
