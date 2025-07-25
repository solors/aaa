package sg.bigo.ads.core.player.p971a;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import sg.bigo.ads.common.C43718m;

/* renamed from: sg.bigo.ads.core.player.a.f */
/* loaded from: classes10.dex */
final class C44316f extends ProxySelector {

    /* renamed from: a */
    private static final List<Proxy> f116337a = Arrays.asList(Proxy.NO_PROXY);

    /* renamed from: b */
    private final ProxySelector f116338b;

    /* renamed from: c */
    private final String f116339c;

    /* renamed from: d */
    private final int f116340d;

    private C44316f(ProxySelector proxySelector, String str, int i) {
        this.f116338b = (ProxySelector) C43718m.m5142a(proxySelector);
        this.f116339c = (String) C43718m.m5142a(str);
        this.f116340d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m3409a(String str, int i) {
        ProxySelector.setDefault(new C44316f(ProxySelector.getDefault(), str, i));
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f116338b.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public final List<Proxy> select(URI uri) {
        boolean z;
        if (this.f116339c.equals(uri.getHost()) && this.f116340d == uri.getPort()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return f116337a;
        }
        return this.f116338b.select(uri);
    }
}
