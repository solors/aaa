package p791mf;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p747jf.C37357h;

@Metadata
/* renamed from: mf.c */
/* loaded from: classes10.dex */
public abstract class CertificateChainCleaner {
    @NotNull

    /* renamed from: a */
    public static final C38297a f101204a = new C38297a(null);

    /* compiled from: CertificateChainCleaner.kt */
    @Metadata
    /* renamed from: mf.c$a */
    /* loaded from: classes10.dex */
    public static final class C38297a {
        private C38297a() {
        }

        public /* synthetic */ C38297a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final CertificateChainCleaner m15123a(@NotNull X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            return C37357h.f98616a.m18318g().mo18339c(trustManager);
        }
    }

    @NotNull
    /* renamed from: a */
    public abstract List<Certificate> mo15124a(@NotNull List<? extends Certificate> list, @NotNull String str) throws SSLPeerUnverifiedException;
}
