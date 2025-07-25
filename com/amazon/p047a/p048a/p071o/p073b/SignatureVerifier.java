package com.amazon.p047a.p048a.p071o.p073b;

import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p081c.p082a.p083a.Base64;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.Signature;

/* renamed from: com.amazon.a.a.o.b.e */
/* loaded from: classes2.dex */
public class SignatureVerifier {

    /* renamed from: a */
    public static final String f2763a = "SHA384withRSA";

    /* renamed from: b */
    private static final KiwiLogger f2764b = new KiwiLogger("SignatureVerifier");

    /* renamed from: a */
    public static boolean m102835a(String str, String str2, PublicKey publicKey) {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2764b;
            kiwiLogger.m102829a("Verifying signature of data: '" + str + "', signature: '" + str2 + "', with key: '" + publicKey.toString());
        }
        try {
            byte[] m102654c = Base64.m102654c(str2.getBytes());
            Signature signature = Signature.getInstance(f2763a);
            signature.initVerify(publicKey);
            signature.update(str.getBytes());
            return signature.verify(m102654c);
        } catch (IOException | GeneralSecurityException unused) {
            return false;
        }
    }
}
