package p763kf;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.Protocol;

@Metadata
/* renamed from: kf.j */
/* loaded from: classes10.dex */
public final class DeferredSocketAdapter implements SocketAdapter {
    @NotNull

    /* renamed from: a */
    private final InterfaceC37525a f99201a;
    @Nullable

    /* renamed from: b */
    private SocketAdapter f99202b;

    /* compiled from: DeferredSocketAdapter.kt */
    @Metadata
    /* renamed from: kf.j$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC37525a {
        /* renamed from: a */
        boolean mo17639a(@NotNull SSLSocket sSLSocket);

        @NotNull
        /* renamed from: b */
        SocketAdapter mo17638b(@NotNull SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(@NotNull InterfaceC37525a socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f99201a = socketAdapterFactory;
    }

    /* renamed from: d */
    private final synchronized SocketAdapter m17640d(SSLSocket sSLSocket) {
        if (this.f99202b == null && this.f99201a.mo17639a(sSLSocket)) {
            this.f99202b = this.f99201a.mo17638b(sSLSocket);
        }
        return this.f99202b;
    }

    @Override // p763kf.SocketAdapter
    /* renamed from: a */
    public boolean mo17637a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f99201a.mo17639a(sslSocket);
    }

    @Override // p763kf.SocketAdapter
    @Nullable
    /* renamed from: b */
    public String mo17636b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        SocketAdapter m17640d = m17640d(sslSocket);
        if (m17640d == null) {
            return null;
        }
        return m17640d.mo17636b(sslSocket);
    }

    @Override // p763kf.SocketAdapter
    /* renamed from: c */
    public void mo17635c(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        SocketAdapter m17640d = m17640d(sslSocket);
        if (m17640d != null) {
            m17640d.mo17635c(sslSocket, str, protocols);
        }
    }

    @Override // p763kf.SocketAdapter
    public boolean isSupported() {
        return true;
    }
}
