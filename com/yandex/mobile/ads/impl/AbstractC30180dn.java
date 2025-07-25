package com.yandex.mobile.ads.impl;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.dn */
/* loaded from: classes8.dex */
public abstract class AbstractC30180dn {

    /* renamed from: com.yandex.mobile.ads.impl.dn$a */
    /* loaded from: classes8.dex */
    public static final class C30181a {
        @NotNull
        /* renamed from: a */
        public static AbstractC30180dn m34881a(@NotNull X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            return qd1.f84301a.mo27987a(trustManager);
        }
    }

    @NotNull
    /* renamed from: a */
    public abstract List mo26968a(@NotNull String str, @NotNull List list) throws SSLPeerUnverifiedException;
}
