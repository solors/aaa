package p1044xb;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;

/* renamed from: xb.b */
/* loaded from: classes9.dex */
final class CertLoader {
    @NonNull

    /* renamed from: a */
    private final Context f118302a;
    @NonNull

    /* renamed from: b */
    private final CertificateFactory f118303b;

    public CertLoader(@NonNull Context context, @NonNull CertificateFactory certificateFactory) {
        this.f118302a = context;
        this.f118303b = certificateFactory;
    }

    @NonNull
    /* renamed from: a */
    private final InputStream m1240a(@NonNull String str) {
        return new ByteArrayInputStream(Base64.decode(str, 2));
    }

    @NonNull
    /* renamed from: b */
    private InputStream m1239b(@NonNull String str) {
        return m1240a(m1235f(str));
    }

    @Nullable
    /* renamed from: c */
    private final String m1238c(@RawRes int i) {
        try {
            InputStream openRawResource = this.f118302a.getResources().openRawResource(i);
            StringBuilder sb2 = new StringBuilder();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, StandardCharsets.UTF_8));
                while (true) {
                    int read = bufferedReader.read();
                    if (read == -1) {
                        break;
                    }
                    sb2.append((char) read);
                }
                bufferedReader.close();
            } catch (IOException e) {
                Log.e("CertLoader", "", e);
            }
            return sb2.toString();
        } catch (Resources.NotFoundException e2) {
            Log.e("CertLoader", "resource not found, certResId=" + i, e2);
            return null;
        }
    }

    @NonNull
    /* renamed from: f */
    private final String m1235f(@NonNull String str) {
        return str.replace("\\s+", "").replace("\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "").replace("-----BEGIN CERTIFICATE-----", "").replace("-----END CERTIFICATE-----", "");
    }

    @Nullable
    /* renamed from: g */
    private final InputStream m1234g(@RawRes int i) {
        try {
            String m1238c = m1238c(i);
            if (TextUtils.isEmpty(m1238c)) {
                return null;
            }
            return m1239b(m1238c);
        } catch (Exception e) {
            Log.e("CertLoader", "unexpected error, certResId=" + i, e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: d */
    public final Certificate m1237d(@RawRes int i) {
        try {
            InputStream m1234g = m1234g(i);
            if (m1234g != null) {
                return this.f118303b.generateCertificate(m1234g);
            }
            return null;
        } catch (CertificateException e) {
            Log.e("CertLoader", "", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: e */
    public final ArrayList<X509Certificate> m1236e() {
        ArrayList<X509Certificate> arrayList = new ArrayList<>();
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
            if (keyStore != null) {
                keyStore.load(null, null);
                Enumeration<String> aliases = keyStore.aliases();
                while (aliases.hasMoreElements()) {
                    X509Certificate x509Certificate = (X509Certificate) keyStore.getCertificate(aliases.nextElement());
                    if (x509Certificate != null) {
                        arrayList.add(x509Certificate);
                    }
                }
            }
        } catch (Throwable th) {
            Log.e("CertLoader", "", th);
        }
        return arrayList;
    }
}
