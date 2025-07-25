package com.yandex.mobile.ads.impl;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections._Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class v10 implements w10 {
    @Override // com.yandex.mobile.ads.impl.w10
    @NotNull
    /* renamed from: a */
    public final List<InetAddress> mo28076a(@NotNull String hostname) {
        List<InetAddress> m17348D0;
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(...)");
            m17348D0 = _Arrays.m17348D0(allByName);
            return m17348D0;
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
