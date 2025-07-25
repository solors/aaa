package p791mf;

import java.security.cert.X509Certificate;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: mf.e */
/* loaded from: classes10.dex */
public interface TrustRootIndex {
    @Nullable
    X509Certificate findByIssuerAndSignature(@NotNull X509Certificate x509Certificate);
}
