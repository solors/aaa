package p778lf;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: lf.a */
/* loaded from: classes10.dex */
public final class NullProxySelector extends ProxySelector {
    @NotNull

    /* renamed from: a */
    public static final NullProxySelector f100957a = new NullProxySelector();

    private NullProxySelector() {
    }

    @Override // java.net.ProxySelector
    @NotNull
    public List<Proxy> select(@Nullable URI uri) {
        List<Proxy> m17175e;
        if (uri != null) {
            m17175e = CollectionsJVM.m17175e(Proxy.NO_PROXY);
            return m17175e;
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }

    @Override // java.net.ProxySelector
    public void connectFailed(@Nullable URI uri, @Nullable SocketAddress socketAddress, @Nullable IOException iOException) {
    }
}
