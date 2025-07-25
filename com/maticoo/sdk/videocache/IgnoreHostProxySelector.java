package com.maticoo.sdk.videocache;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
class IgnoreHostProxySelector extends ProxySelector {
    private static final List<Proxy> NO_PROXY_LIST = Arrays.asList(Proxy.NO_PROXY);
    private final ProxySelector defaultProxySelector;
    private final String hostToIgnore;
    private final int portToIgnore;

    IgnoreHostProxySelector(ProxySelector proxySelector, String str, int i) {
        this.defaultProxySelector = (ProxySelector) Preconditions.checkNotNull(proxySelector);
        this.hostToIgnore = (String) Preconditions.checkNotNull(str);
        this.portToIgnore = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void install(String str, int i) {
        ProxySelector.setDefault(new IgnoreHostProxySelector(ProxySelector.getDefault(), str, i));
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.defaultProxySelector.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        boolean z;
        if (this.hostToIgnore.equals(uri.getHost()) && this.portToIgnore == uri.getPort()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return NO_PROXY_LIST;
        }
        return this.defaultProxySelector.select(uri);
    }
}
