package com.yandex.mobile.ads.impl;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.iz */
/* loaded from: classes8.dex */
public final class C30591iz implements tw1 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC30592a f80690a;
    @Nullable

    /* renamed from: b */
    private tw1 f80691b;

    /* renamed from: com.yandex.mobile.ads.impl.iz$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC30592a {
        /* renamed from: a */
        boolean mo33090a(@NotNull SSLSocket sSLSocket);

        @NotNull
        /* renamed from: b */
        C30306fd mo33089b(@NotNull SSLSocket sSLSocket);
    }

    public C30591iz(@NotNull C30230ed socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f80690a = socketAdapterFactory;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    /* renamed from: a */
    public final boolean mo27584a() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    @Nullable
    /* renamed from: b */
    public final String mo27581b(@NotNull SSLSocket sslSocket) {
        tw1 tw1Var;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        synchronized (this) {
            if (this.f80691b == null && this.f80690a.mo33090a(sslSocket)) {
                this.f80691b = this.f80690a.mo33089b(sslSocket);
            }
            tw1Var = this.f80691b;
        }
        if (tw1Var != null) {
            return tw1Var.mo27581b(sslSocket);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    /* renamed from: a */
    public final void mo27582a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends hi1> protocols) {
        tw1 tw1Var;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        synchronized (this) {
            if (this.f80691b == null && this.f80690a.mo33090a(sslSocket)) {
                this.f80691b = this.f80690a.mo33089b(sslSocket);
            }
            tw1Var = this.f80691b;
        }
        if (tw1Var != null) {
            tw1Var.mo27582a(sslSocket, str, protocols);
        }
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    /* renamed from: a */
    public final boolean mo27583a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f80690a.mo33090a(sslSocket);
    }
}
