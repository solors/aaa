package p1044xb;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: xb.e */
/* loaded from: classes9.dex */
public final class SslErrorVerifier {
    /* renamed from: a */
    public static boolean m1227a(@NonNull SslError sslError, @NonNull TrustManagerFactory trustManagerFactory) {
        TrustManager[] trustManagers;
        if (sslError.getPrimaryError() == 3) {
            SslCertificate certificate = sslError.getCertificate();
            try {
                Field declaredField = certificate.getClass().getDeclaredField("mX509Certificate");
                declaredField.setAccessible(true);
                X509Certificate[] x509CertificateArr = {(X509Certificate) declaredField.get(certificate)};
                for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                    if (trustManager instanceof X509TrustManager) {
                        try {
                            ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, "generic");
                            return true;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                return false;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }
}
