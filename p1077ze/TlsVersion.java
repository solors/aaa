package p1077ze;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: ze.f0 */
/* loaded from: classes10.dex */
public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    @NotNull

    /* renamed from: c */
    public static final C45302a f119119c = new C45302a(null);
    @NotNull

    /* renamed from: b */
    private final String f119126b;

    /* compiled from: TlsVersion.kt */
    @Metadata
    /* renamed from: ze.f0$a */
    /* loaded from: classes10.dex */
    public static final class C45302a {
        private C45302a() {
        }

        public /* synthetic */ C45302a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final TlsVersion m332a(@NotNull String javaName) {
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            int hashCode = javaName.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return TlsVersion.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return TlsVersion.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return TlsVersion.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return TlsVersion.TLS_1_0;
                }
            } else if (javaName.equals("SSLv3")) {
                return TlsVersion.SSL_3_0;
            }
            throw new IllegalArgumentException(Intrinsics.m17064q("Unexpected TLS version: ", javaName));
        }
    }

    TlsVersion(String str) {
        this.f119126b = str;
    }

    @NotNull
    /* renamed from: c */
    public final String m333c() {
        return this.f119126b;
    }
}
