package p1077ze;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ze.e0 */
/* loaded from: classes10.dex */
public final class Route {
    @NotNull

    /* renamed from: a */
    private final Address f119116a;
    @NotNull

    /* renamed from: b */
    private final Proxy f119117b;
    @NotNull

    /* renamed from: c */
    private final InetSocketAddress f119118c;

    public Route(@NotNull Address address, @NotNull Proxy proxy, @NotNull InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f119116a = address;
        this.f119117b = proxy;
        this.f119118c = socketAddress;
    }

    @NotNull
    /* renamed from: a */
    public final Address m338a() {
        return this.f119116a;
    }

    @NotNull
    /* renamed from: b */
    public final Proxy m337b() {
        return this.f119117b;
    }

    /* renamed from: c */
    public final boolean m336c() {
        if (this.f119116a.m497k() != null && this.f119117b.type() == Proxy.Type.HTTP) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: d */
    public final InetSocketAddress m335d() {
        return this.f119118c;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            if (Intrinsics.m17075f(route.f119116a, this.f119116a) && Intrinsics.m17075f(route.f119117b, this.f119117b) && Intrinsics.m17075f(route.f119118c, this.f119118c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f119116a.hashCode()) * 31) + this.f119117b.hashCode()) * 31) + this.f119118c.hashCode();
    }

    @NotNull
    public String toString() {
        return "Route{" + this.f119118c + '}';
    }
}
