package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C30306fd;
import com.yandex.mobile.ads.impl.C30591iz;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ed */
/* loaded from: classes8.dex */
public final class C30230ed implements C30591iz.InterfaceC30592a {

    /* renamed from: a */
    final /* synthetic */ String f78505a = "com.google.android.gms.org.conscrypt";

    @Override // com.yandex.mobile.ads.impl.C30591iz.InterfaceC30592a
    /* renamed from: a */
    public final boolean mo33090a(@NotNull SSLSocket sslSocket) {
        boolean m16624M;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String name = sslSocket.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String str = this.f78505a;
        m16624M = StringsJVM.m16624M(name, str + ".", false, 2, null);
        return m16624M;
    }

    @Override // com.yandex.mobile.ads.impl.C30591iz.InterfaceC30592a
    @NotNull
    /* renamed from: b */
    public final C30306fd mo33089b(@NotNull SSLSocket sslSocket) {
        C30306fd m34173b;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i = C30306fd.f79045g;
        m34173b = C30306fd.C30307a.m34173b(sslSocket.getClass());
        return m34173b;
    }
}
