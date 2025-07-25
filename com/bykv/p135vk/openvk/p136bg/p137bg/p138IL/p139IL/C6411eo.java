package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.eo */
/* loaded from: classes3.dex */
class C6411eo extends ProxySelector {

    /* renamed from: bg */
    private static final List<Proxy> f13363bg = Collections.singletonList(Proxy.NO_PROXY);

    /* renamed from: IL */
    private final ProxySelector f13364IL = ProxySelector.getDefault();

    /* renamed from: bX */
    private final String f13365bX;
    private final int eqN;

    private C6411eo(String str, int i) {
        this.f13365bX = str;
        this.eqN = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static void m92029bg(String str, int i) {
        ProxySelector.setDefault(new C6411eo(str, i));
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f13364IL.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        if (uri != null) {
            if (this.f13365bX.equalsIgnoreCase(uri.getHost()) && this.eqN == uri.getPort()) {
                return f13363bg;
            }
            return this.f13364IL.select(uri);
        }
        throw new IllegalArgumentException("URI can't be null");
    }
}
