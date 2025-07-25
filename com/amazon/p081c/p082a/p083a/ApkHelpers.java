package com.amazon.p081c.p082a.p083a;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.CodeSigner;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* renamed from: com.amazon.c.a.a.a */
/* loaded from: classes2.dex */
public class ApkHelpers {

    /* renamed from: a */
    private static final String f2904a = "com.amazon.content.id.";

    /* renamed from: a */
    public static String m102687a(JarFile jarFile) {
        String m102688a;
        if (jarFile != null) {
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                JarEntry nextElement = entries.nextElement();
                if (!nextElement.isDirectory() && (m102688a = m102688a(nextElement.getName())) != null && m102688a.length() != 0) {
                    return m102688a;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("apkSrc must not be null!");
    }

    /* renamed from: b */
    public static boolean m102685b(JarFile jarFile) throws IOException {
        if (jarFile != null) {
            try {
                m102682e(jarFile);
                return m102683d(jarFile) != null;
            } catch (SecurityException unused) {
                return true;
            }
        }
        throw new IllegalArgumentException("apkSrc must not be null!");
    }

    /* renamed from: c */
    private static Certificate m102684c(JarFile jarFile) {
        CodeSigner[] m102683d = m102683d(jarFile);
        if (m102683d != null && m102683d.length > 0) {
            List<? extends Certificate> certificates = m102683d[0].getSignerCertPath().getCertificates();
            if (!certificates.isEmpty()) {
                return certificates.get(0);
            }
        }
        return null;
    }

    /* renamed from: d */
    private static CodeSigner[] m102683d(JarFile jarFile) {
        Enumeration<JarEntry> entries = jarFile.entries();
        CodeSigner[] codeSignerArr = null;
        while (entries.hasMoreElements() && (codeSignerArr = entries.nextElement().getCodeSigners()) == null) {
        }
        return codeSignerArr;
    }

    /* renamed from: e */
    private static void m102682e(JarFile jarFile) throws IOException {
        Enumeration<JarEntry> entries = jarFile.entries();
        byte[] bArr = new byte[8192];
        while (entries.hasMoreElements()) {
            InputStream inputStream = null;
            try {
                try {
                    inputStream = jarFile.getInputStream(entries.nextElement());
                    do {
                    } while (inputStream.read(bArr, 0, 8192) != -1);
                    inputStream.close();
                } catch (Exception e) {
                    throw new ApkInvalidException(e);
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static byte[] m102686b(String str) throws IOException, ApkInvalidException {
        if (str != null && str.length() != 0) {
            JarFile jarFile = new JarFile(str);
            try {
                m102682e(jarFile);
                Certificate m102684c = m102684c(jarFile);
                if (m102684c != null && (m102684c instanceof X509Certificate)) {
                    return ((X509Certificate) m102684c).getSignature();
                }
                return null;
            } catch (SecurityException unused) {
                return null;
            }
        }
        throw new IllegalArgumentException("apkFileName cannot be null or empty!");
    }

    /* renamed from: a */
    public static String m102688a(String str) {
        if (str != null && str.length() != 0) {
            int indexOf = str.indexOf(f2904a);
            if (indexOf >= 0 && str.length() > 22) {
                return str.substring(indexOf + 22);
            }
            return null;
        }
        throw new IllegalArgumentException("name cannot be null or empty!");
    }

    /* renamed from: a */
    public static boolean m102689a(File file) throws IOException {
        JarFile jarFile = null;
        try {
            JarFile jarFile2 = new JarFile(file);
            try {
                boolean m102685b = m102685b(jarFile2);
                jarFile2.close();
                return m102685b;
            } catch (Throwable th) {
                th = th;
                jarFile = jarFile2;
                jarFile.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
