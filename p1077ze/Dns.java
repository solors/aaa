package p1077ze;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections._Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: ze.q */
/* loaded from: classes10.dex */
public interface Dns {
    @NotNull

    /* renamed from: a */
    public static final C45315a f119304a = C45315a.f119306a;
    @NotNull

    /* renamed from: b */
    public static final Dns f119305b = new C45315a.C45316a();

    /* compiled from: Dns.kt */
    @Metadata
    /* renamed from: ze.q$a */
    /* loaded from: classes10.dex */
    public static final class C45315a {

        /* renamed from: a */
        static final /* synthetic */ C45315a f119306a = new C45315a();

        /* compiled from: Dns.kt */
        @Metadata
        /* renamed from: ze.q$a$a */
        /* loaded from: classes10.dex */
        private static final class C45316a implements Dns {
            @Override // p1077ze.Dns
            @NotNull
            public List<InetAddress> lookup(@NotNull String hostname) {
                List<InetAddress> m17348D0;
                Intrinsics.checkNotNullParameter(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(hostname)");
                    m17348D0 = _Arrays.m17348D0(allByName);
                    return m17348D0;
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException(Intrinsics.m17064q("Broken system behaviour for dns lookup of ", hostname));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        private C45315a() {
        }
    }

    @NotNull
    List<InetAddress> lookup(@NotNull String str) throws UnknownHostException;
}
