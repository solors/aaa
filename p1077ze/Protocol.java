package p1077ze;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: ze.z */
/* loaded from: classes10.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    @NotNull

    /* renamed from: c */
    public static final C45338a f119418c = new C45338a(null);
    @NotNull

    /* renamed from: b */
    private final String f119426b;

    /* compiled from: Protocol.kt */
    @Metadata
    /* renamed from: ze.z$a */
    /* loaded from: classes10.dex */
    public static final class C45338a {
        private C45338a() {
        }

        public /* synthetic */ C45338a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Protocol m0a(@NotNull String protocol) throws IOException {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            Protocol protocol2 = Protocol.HTTP_1_0;
            if (!Intrinsics.m17075f(protocol, protocol2.f119426b)) {
                protocol2 = Protocol.HTTP_1_1;
                if (!Intrinsics.m17075f(protocol, protocol2.f119426b)) {
                    protocol2 = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!Intrinsics.m17075f(protocol, protocol2.f119426b)) {
                        protocol2 = Protocol.HTTP_2;
                        if (!Intrinsics.m17075f(protocol, protocol2.f119426b)) {
                            protocol2 = Protocol.SPDY_3;
                            if (!Intrinsics.m17075f(protocol, protocol2.f119426b)) {
                                protocol2 = Protocol.QUIC;
                                if (!Intrinsics.m17075f(protocol, protocol2.f119426b)) {
                                    throw new IOException(Intrinsics.m17064q("Unexpected protocol: ", protocol));
                                }
                            }
                        }
                    }
                }
            }
            return protocol2;
        }
    }

    Protocol(String str) {
        this.f119426b = str;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.f119426b;
    }
}
