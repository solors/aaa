package com.amazon.p047a.p048a.p066n.p067a;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.amazon.p047a.p048a.p055d.KiwiException;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p066n.p067a.p068a.AuthenticationTokenVerificationException;
import com.amazon.p047a.p048a.p066n.p067a.p068a.CommandServiceNotInstalledException;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p047a.p048a.p071o.p073b.DataAuthenticationKeyLoader;
import com.amazon.p047a.p048a.p071o.p073b.SignatureVerifier;
import com.amazon.p047a.p048a.p071o.p073b.p074a.DataAuthenticationKeyLoadException;
import com.amazon.p081c.p082a.p083a.Base64;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;

/* renamed from: com.amazon.a.a.n.a.b */
/* loaded from: classes2.dex */
public class AuthenticationTokenVerifier {

    /* renamed from: a */
    private static final KiwiLogger f2553a = new KiwiLogger("CommandResultVerifier");
    @Resource

    /* renamed from: b */
    private Application f2554b;
    @Resource

    /* renamed from: c */
    private DataAuthenticationKeyLoader f2555c;

    /* renamed from: b */
    private boolean m102975b(String str, Signature signature) {
        boolean z = false;
        try {
            z = str.equals(m102981a(signature));
            KiwiLogger kiwiLogger = f2553a;
            kiwiLogger.m102829a("Signature valid: " + z);
            return z;
        } catch (CertificateException unused) {
            f2553a.m102826b("Failed to extract fingerprint from signature");
            return z;
        }
    }

    /* renamed from: a */
    public void m102978a(String str, String str2) throws KiwiException {
        if (KiwiLogger.f2770a) {
            f2553a.m102829a("Verifying auth token: " + str);
        }
        for (Signature signature : m102980a(str2).signatures) {
            if (m102979a(str, signature)) {
                return;
            }
        }
        throw new AuthenticationTokenVerificationException();
    }

    /* renamed from: b */
    private X509Certificate m102976b(Signature signature) throws CertificateException {
        return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
    }

    /* renamed from: a */
    public boolean m102977a(String str, List<String> list) {
        Signature[] signatureArr;
        f2553a.m102829a("checkSignatures(" + str + ", " + list);
        try {
            for (Signature signature : m102980a(str).signatures) {
                for (String str2 : list) {
                    if (m102975b(str2, signature)) {
                        return true;
                    }
                }
            }
        } catch (CommandServiceNotInstalledException e) {
            f2553a.m102825b("isPackageSignatureValid: caught exception while checking", e);
        }
        return false;
    }

    /* renamed from: a */
    private boolean m102979a(String str, Signature signature) throws DataAuthenticationKeyLoadException {
        try {
            return SignatureVerifier.m102835a(m102981a(signature), str, this.f2555c.mo102840a());
        } catch (CertificateException unused) {
            if (KiwiLogger.f2771b) {
                KiwiLogger kiwiLogger = f2553a;
                kiwiLogger.m102826b("Failed to extract fingerprint from signature: " + signature);
                return false;
            }
            return false;
        }
    }

    /* renamed from: a */
    private PackageInfo m102980a(String str) throws CommandServiceNotInstalledException {
        try {
            return this.f2554b.getPackageManager().getPackageInfo(str, 64);
        } catch (PackageManager.NameNotFoundException e) {
            KiwiLogger kiwiLogger = f2553a;
            kiwiLogger.m102829a("getPackageInfo() caught exception" + e);
            throw new CommandServiceNotInstalledException();
        }
    }

    /* renamed from: a */
    private String m102981a(Signature signature) throws CertificateException {
        return Base64.m102673a(m102976b(signature).getSignature());
    }
}
