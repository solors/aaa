package com.amazon.p047a.p048a.p071o.p073b;

import android.app.Application;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p065m.KiwiDataStore;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p047a.p048a.p071o.p073b.p074a.DataAuthenticationKeyLoadException;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* renamed from: com.amazon.a.a.o.b.c */
/* loaded from: classes2.dex */
public class DataAuthenticationKeyLoaderV2 implements DataAuthenticationKeyLoader {

    /* renamed from: a */
    private static final KiwiLogger f2751a = new KiwiLogger("DataAuthenticationKeyLoaderV2");

    /* renamed from: b */
    private static final String f2752b = "kiwi";

    /* renamed from: c */
    private static final int f2753c = 0;
    @Resource

    /* renamed from: d */
    private Application f2754d;
    @Resource

    /* renamed from: e */
    private KiwiDataStore f2755e;

    /* renamed from: b */
    private PublicKey m102848b() {
        if (KiwiLogger.f2770a) {
            f2751a.m102829a("Checking KiwiDataStore for key...");
        }
        PublicKey publicKey = (PublicKey) this.f2755e.m103005a(KiwiDataStore.f2522a);
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2751a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Key was cached: ");
            sb2.append(publicKey != null);
            kiwiLogger.m102829a(sb2.toString());
        }
        return publicKey;
    }

    /* renamed from: c */
    private PublicKey m102846c() throws DataAuthenticationKeyLoadException {
        if (KiwiLogger.f2770a) {
            f2751a.m102829a("Loading authentication key from apk...");
        }
        CertPath m102844d = m102844d();
        if (m102852a(m102844d)) {
            m102843d(m102844d);
            return m102847b(m102844d);
        }
        throw DataAuthenticationKeyLoadException.m102859e();
    }

    /* renamed from: d */
    private CertPath m102844d() throws DataAuthenticationKeyLoadException {
        JarFile m102842e = m102842e();
        return m102849a(m102842e, m102850a(m102842e));
    }

    /* renamed from: e */
    private JarFile m102842e() throws DataAuthenticationKeyLoadException {
        String packageCodePath = this.f2754d.getPackageCodePath();
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2751a;
            kiwiLogger.m102829a("Opening apk: " + packageCodePath);
        }
        try {
            return new JarFile(packageCodePath, false);
        } catch (IOException e) {
            throw DataAuthenticationKeyLoadException.m102862a((Throwable) e);
        }
    }

    /* renamed from: f */
    private CertVerifier m102841f() throws DataAuthenticationKeyLoadException {
        try {
            return new CertVerifier();
        } catch (GeneralSecurityException e) {
            throw DataAuthenticationKeyLoadException.m102861b((Throwable) e);
        }
    }

    @Override // com.amazon.p047a.p048a.p071o.p073b.DataAuthenticationKeyLoader
    /* renamed from: a */
    public PublicKey mo102840a() throws DataAuthenticationKeyLoadException {
        if (KiwiLogger.f2770a) {
            f2751a.m102829a("Loading data authentication key...");
        }
        PublicKey m102848b = m102848b();
        if (m102848b != null) {
            return m102848b;
        }
        PublicKey m102846c = m102846c();
        m102853a(m102846c);
        return m102846c;
    }

    /* renamed from: d */
    private void m102843d(CertPath certPath) throws DataAuthenticationKeyLoadException {
        if (!m102841f().m102865a(certPath)) {
            throw DataAuthenticationKeyLoadException.m102858f();
        }
    }

    /* renamed from: a */
    private JarEntry m102850a(JarFile jarFile) throws DataAuthenticationKeyLoadException {
        if (KiwiLogger.f2770a) {
            f2751a.m102829a("Searching for cert in apk");
        }
        Enumeration<JarEntry> entries = jarFile.entries();
        while (entries.hasMoreElements()) {
            JarEntry nextElement = entries.nextElement();
            if (!nextElement.isDirectory() && nextElement.getName().equals(f2752b)) {
                return nextElement;
            }
        }
        throw DataAuthenticationKeyLoadException.m102860d();
    }

    /* renamed from: b */
    private PublicKey m102847b(CertPath certPath) {
        return m102845c(certPath).getPublicKey();
    }

    /* renamed from: c */
    private X509Certificate m102845c(CertPath certPath) {
        return (X509Certificate) certPath.getCertificates().get(0);
    }

    /* renamed from: a */
    private CertPath m102849a(JarFile jarFile, JarEntry jarEntry) throws DataAuthenticationKeyLoadException {
        try {
            if (KiwiLogger.f2770a) {
                KiwiLogger kiwiLogger = f2751a;
                kiwiLogger.m102829a("Extracting cert from entry: " + jarEntry.getName());
            }
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            if (KiwiLogger.f2770a) {
                f2751a.m102829a("Generating certificates from entry input stream");
            }
            return certificateFactory.generateCertPath(m102851a(certificateFactory.generateCertificates(jarFile.getInputStream(jarEntry))));
        } catch (Exception e) {
            throw DataAuthenticationKeyLoadException.m102862a((Throwable) e);
        }
    }

    /* renamed from: a */
    public List<? extends Certificate> m102851a(Collection<? extends Certificate> collection) {
        return new ArrayList(collection);
    }

    /* renamed from: a */
    private boolean m102852a(CertPath certPath) {
        if (certPath != null && certPath.getCertificates().size() > 0) {
            Certificate certificate = certPath.getCertificates().get(0);
            if (certificate instanceof X509Certificate) {
                String name = ((X509Certificate) certificate).getSubjectX500Principal().getName();
                if (KiwiLogger.f2770a) {
                    KiwiLogger kiwiLogger = f2751a;
                    kiwiLogger.m102829a("Kiwi Cert Details: " + name);
                }
                return name.contains("O=Amazon.com\\, Inc.") && name.contains("C=US") && name.contains("ST=Washington") && name.contains("L=Seattle");
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    private void m102853a(PublicKey publicKey) {
        if (KiwiLogger.f2770a) {
            f2751a.m102829a("Placing auth key into storage");
        }
        this.f2755e.m103003a(KiwiDataStore.f2522a, (String) publicKey);
    }
}
