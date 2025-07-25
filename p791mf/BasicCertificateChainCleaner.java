package p791mf;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: mf.a */
/* loaded from: classes10.dex */
public final class BasicCertificateChainCleaner extends CertificateChainCleaner {
    @NotNull

    /* renamed from: c */
    public static final C38296a f101201c = new C38296a(null);
    @NotNull

    /* renamed from: b */
    private final TrustRootIndex f101202b;

    /* compiled from: BasicCertificateChainCleaner.kt */
    @Metadata
    /* renamed from: mf.a$a */
    /* loaded from: classes10.dex */
    public static final class C38296a {
        private C38296a() {
        }

        public /* synthetic */ C38296a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BasicCertificateChainCleaner(@NotNull TrustRootIndex trustRootIndex) {
        Intrinsics.checkNotNullParameter(trustRootIndex, "trustRootIndex");
        this.f101202b = trustRootIndex;
    }

    /* renamed from: b */
    private final boolean m15125b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!Intrinsics.m17075f(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // p791mf.CertificateChainCleaner
    @NotNull
    /* renamed from: a */
    public List<Certificate> mo15124a(@NotNull List<? extends Certificate> chain, @NotNull String hostname) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        Intrinsics.checkNotNullExpressionValue(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        int i = 0;
        boolean z = false;
        while (i < 9) {
            i++;
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate findByIssuerAndSignature = this.f101202b.findByIssuerAndSignature(x509Certificate);
            if (findByIssuerAndSignature != null) {
                if (arrayList.size() > 1 || !Intrinsics.m17075f(x509Certificate, findByIssuerAndSignature)) {
                    arrayList.add(findByIssuerAndSignature);
                }
                if (m15125b(findByIssuerAndSignature, findByIssuerAndSignature)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        X509Certificate x509Certificate2 = (X509Certificate) next;
                        if (m15125b(x509Certificate, x509Certificate2)) {
                            it.remove();
                            arrayList.add(x509Certificate2);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException(Intrinsics.m17064q("Failed to find a trusted cert that signed ", x509Certificate));
            }
        }
        throw new SSLPeerUnverifiedException(Intrinsics.m17064q("Certificate chain too long: ", arrayList));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof BasicCertificateChainCleaner) && Intrinsics.m17075f(((BasicCertificateChainCleaner) obj).f101202b, this.f101202b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f101202b.hashCode();
    }
}
