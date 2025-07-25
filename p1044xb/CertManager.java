package p1044xb;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: xb.c */
/* loaded from: classes9.dex */
public final class CertManager {
    @NonNull

    /* renamed from: a */
    private final List<Integer> f118304a;

    public CertManager() {
        ArrayList arrayList = new ArrayList();
        this.f118304a = arrayList;
        arrayList.add(Integer.valueOf(C44963d.russian_trusted_root_ca));
        arrayList.add(Integer.valueOf(C44963d.russian_trusted_sub_ca));
    }

    @Nullable
    /* renamed from: b */
    private final CertificateFactory m1232b() {
        try {
            return CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
        } catch (CertificateException e) {
            Log.e("CertManager", "", e);
            return null;
        }
    }

    @Nullable
    /* renamed from: c */
    private final KeyStore m1231c() {
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            return keyStore;
        } catch (Throwable th) {
            Log.e("CertManager", "", th);
            return null;
        }
    }

    @Nullable
    /* renamed from: d */
    private final SSLContext m1230d(@NonNull TrustManagerFactory trustManagerFactory) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerFactory.getTrustManagers(), new SecureRandom());
            return sSLContext;
        } catch (Throwable th) {
            Log.e("CertManager", "", th);
            return null;
        }
    }

    @Nullable
    /* renamed from: e */
    private final TrustManagerFactory m1229e(@NonNull KeyStore keyStore) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            return trustManagerFactory;
        } catch (Throwable th) {
            Log.e("CertManager", "", th);
            return null;
        }
    }

    @Nullable
    /* renamed from: f */
    private final X509TrustManager m1228f(@NonNull TrustManagerFactory trustManagerFactory) {
        TrustManager[] trustManagers;
        for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    public final CertData m1233a(@Nullable Context context) {
        String str;
        if (context == null) {
            Log.e("CertManager", "Error make certData – context is null");
            return null;
        }
        CertificateFactory m1232b = m1232b();
        if (m1232b == null) {
            Log.e("CertManager", "Error make certData – certificateFactory is null");
            return null;
        }
        KeyStore m1231c = m1231c();
        if (m1231c == null) {
            Log.e("CertManager", "Error make certData – keyStore is null");
            return null;
        }
        CertLoader certLoader = new CertLoader(context, m1232b);
        for (Integer num : this.f118304a) {
            int intValue = num.intValue();
            Certificate m1237d = certLoader.m1237d(intValue);
            if (m1237d != null) {
                try {
                    if (intValue == C44963d.russian_trusted_root_ca) {
                        str = "root_ca";
                    } else if (intValue == C44963d.russian_trusted_sub_ca) {
                        str = "sub_ca";
                    } else {
                        str = "resid_" + intValue;
                    }
                    m1231c.setCertificateEntry("russian_trusted_" + str, m1237d);
                } catch (KeyStoreException e) {
                    Log.e("CertManager", "", e);
                }
            }
        }
        Iterator<X509Certificate> it = certLoader.m1236e().iterator();
        while (it.hasNext()) {
            X509Certificate next = it.next();
            try {
                m1231c.setCertificateEntry(next.getIssuerDN().getName(), next);
            } catch (KeyStoreException e2) {
                Log.e("CertManager", "", e2);
            }
        }
        TrustManagerFactory m1229e = m1229e(m1231c);
        if (m1229e == null) {
            Log.e("CertManager", "Error make certData – trustManagerFactory is null");
            return null;
        }
        X509TrustManager m1228f = m1228f(m1229e);
        if (m1228f == null) {
            Log.e("CertManager", "Error make certData – x509TrustManager is null");
            return null;
        }
        SSLContext m1230d = m1230d(m1229e);
        if (m1230d == null) {
            Log.e("CertManager", "Error make certData – sslContext is null");
            return null;
        }
        return new CertData(m1228f, m1230d, m1229e);
    }
}
