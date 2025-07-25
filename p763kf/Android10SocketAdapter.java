package p763kf;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.Protocol;
import p747jf.C37357h;

@Metadata
@SuppressLint({"NewApi"})
/* renamed from: kf.a */
/* loaded from: classes10.dex */
public final class Android10SocketAdapter implements SocketAdapter {
    @NotNull

    /* renamed from: a */
    public static final C37514a f99177a = new C37514a(null);

    /* compiled from: Android10SocketAdapter.kt */
    @Metadata
    /* renamed from: kf.a$a */
    /* loaded from: classes10.dex */
    public static final class C37514a {
        private C37514a() {
        }

        public /* synthetic */ C37514a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public final SocketAdapter m17661a() {
            if (m17660b()) {
                return new Android10SocketAdapter();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m17660b() {
            if (C37357h.f98616a.m18317h() && Build.VERSION.SDK_INT >= 29) {
                return true;
            }
            return false;
        }
    }

    @Override // p763kf.SocketAdapter
    /* renamed from: a */
    public boolean mo17637a(@NotNull SSLSocket sslSocket) {
        boolean isSupportedSocket;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        isSupportedSocket = SSLSockets.isSupportedSocket(sslSocket);
        return isSupportedSocket;
    }

    @Override // p763kf.SocketAdapter
    @SuppressLint({"NewApi"})
    @Nullable
    /* renamed from: b */
    public String mo17636b(@NotNull SSLSocket sslSocket) {
        String applicationProtocol;
        boolean m17075f;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null) {
            m17075f = true;
        } else {
            m17075f = Intrinsics.m17075f(applicationProtocol, "");
        }
        if (m17075f) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p763kf.SocketAdapter
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public void mo17635c(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            Object[] array = C37357h.f98616a.m18323b(protocols).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sslSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // p763kf.SocketAdapter
    public boolean isSupported() {
        return f99177a.m17660b();
    }
}
