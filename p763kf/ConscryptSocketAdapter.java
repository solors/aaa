package p763kf;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.Protocol;
import p747jf.C37357h;
import p747jf.ConscryptPlatform;
import p763kf.DeferredSocketAdapter;

@Metadata
/* renamed from: kf.i */
/* loaded from: classes10.dex */
public final class ConscryptSocketAdapter implements SocketAdapter {
    @NotNull

    /* renamed from: a */
    public static final C37524b f99199a = new C37524b(null);
    @NotNull

    /* renamed from: b */
    private static final DeferredSocketAdapter.InterfaceC37525a f99200b = new C37523a();

    /* compiled from: ConscryptSocketAdapter.kt */
    @Metadata
    /* renamed from: kf.i$a */
    /* loaded from: classes10.dex */
    public static final class C37523a implements DeferredSocketAdapter.InterfaceC37525a {
        C37523a() {
        }

        @Override // p763kf.DeferredSocketAdapter.InterfaceC37525a
        /* renamed from: a */
        public boolean mo17639a(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            if (ConscryptPlatform.f98598e.m18351c() && Conscrypt.isConscrypt(sslSocket)) {
                return true;
            }
            return false;
        }

        @Override // p763kf.DeferredSocketAdapter.InterfaceC37525a
        @NotNull
        /* renamed from: b */
        public SocketAdapter mo17638b(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new ConscryptSocketAdapter();
        }
    }

    /* compiled from: ConscryptSocketAdapter.kt */
    @Metadata
    /* renamed from: kf.i$b */
    /* loaded from: classes10.dex */
    public static final class C37524b {
        private C37524b() {
        }

        public /* synthetic */ C37524b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final DeferredSocketAdapter.InterfaceC37525a m17641a() {
            return ConscryptSocketAdapter.f99200b;
        }
    }

    @Override // p763kf.SocketAdapter
    /* renamed from: a */
    public boolean mo17637a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // p763kf.SocketAdapter
    @Nullable
    /* renamed from: b */
    public String mo17636b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (mo17637a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // p763kf.SocketAdapter
    /* renamed from: c */
    public void mo17635c(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (mo17637a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Object[] array = C37357h.f98616a.m18323b(protocols).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    @Override // p763kf.SocketAdapter
    public boolean isSupported() {
        return ConscryptPlatform.f98598e.m18351c();
    }
}
