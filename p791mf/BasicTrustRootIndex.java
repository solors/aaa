package p791mf;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: mf.b */
/* loaded from: classes10.dex */
public final class BasicTrustRootIndex implements TrustRootIndex {
    @NotNull

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f101203a;

    public BasicTrustRootIndex(@NotNull X509Certificate... caCerts) {
        Intrinsics.checkNotNullParameter(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = caCerts.length;
        int i = 0;
        while (i < length) {
            X509Certificate x509Certificate = caCerts[i];
            i++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Intrinsics.checkNotNullExpressionValue(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f101203a = linkedHashMap;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != this && (!(obj instanceof BasicTrustRootIndex) || !Intrinsics.m17075f(((BasicTrustRootIndex) obj).f101203a, this.f101203a))) {
            return false;
        }
        return true;
    }

    @Override // p791mf.TrustRootIndex
    @Nullable
    public X509Certificate findByIssuerAndSignature(@NotNull X509Certificate cert) {
        boolean z;
        Intrinsics.checkNotNullParameter(cert, "cert");
        Set<X509Certificate> set = this.f101203a.get(cert.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                cert.verify(((X509Certificate) next).getPublicKey());
                z = true;
                continue;
            } catch (Exception unused) {
                z = false;
                continue;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    public int hashCode() {
        return this.f101203a.hashCode();
    }
}
