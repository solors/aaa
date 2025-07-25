package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.collections.CollectionsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class z91 extends ProxySelector {
    @NotNull

    /* renamed from: a */
    public static final z91 f88792a = new z91();

    private z91() {
    }

    @Override // java.net.ProxySelector
    @NotNull
    public final List<Proxy> select(@Nullable URI uri) {
        List<Proxy> m17175e;
        if (uri != null) {
            m17175e = CollectionsJVM.m17175e(Proxy.NO_PROXY);
            return m17175e;
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(@Nullable URI uri, @Nullable SocketAddress socketAddress, @Nullable IOException iOException) {
    }
}
