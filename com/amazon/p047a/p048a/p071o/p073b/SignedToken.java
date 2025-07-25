package com.amazon.p047a.p048a.p071o.p073b;

import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p047a.p048a.p071o.p072a.Assert;
import com.amazon.p047a.p048a.p071o.p073b.p074a.SignedTokenParseException;
import com.amazon.p047a.p048a.p071o.p073b.p074a.SignedTokenSignatureVerificationException;
import com.amazon.p081c.p082a.p083a.Base64;
import java.io.IOException;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* renamed from: com.amazon.a.a.o.b.f */
/* loaded from: classes2.dex */
public class SignedToken {

    /* renamed from: a */
    public static final String f2765a = ",";

    /* renamed from: b */
    public static final String f2766b = "=";

    /* renamed from: c */
    public static final String f2767c = "|";

    /* renamed from: d */
    private static final KiwiLogger f2768d = new KiwiLogger("SignedToken");

    /* renamed from: e */
    private final Map<String, String> f2769e = new HashMap();

    public SignedToken(String str, PublicKey publicKey) throws SignedTokenParseException, SignedTokenSignatureVerificationException {
        String m102832b = m102832b(str);
        int lastIndexOf = m102832b.lastIndexOf(f2767c);
        if (lastIndexOf != -1) {
            String substring = m102832b.substring(0, lastIndexOf);
            String substring2 = m102832b.substring(lastIndexOf + 1);
            if (KiwiLogger.f2770a) {
                KiwiLogger kiwiLogger = f2768d;
                kiwiLogger.m102829a("Token data: " + substring);
                kiwiLogger.m102829a("Signature: " + substring2);
            }
            m102833a(substring, substring2, publicKey);
            m102831c(substring);
            return;
        }
        throw SignedTokenParseException.m102854d();
    }

    /* renamed from: a */
    private void m102833a(String str, String str2, PublicKey publicKey) throws SignedTokenSignatureVerificationException {
        if (!SignatureVerifier.m102835a(str, str2, publicKey)) {
            throw new SignedTokenSignatureVerificationException();
        }
    }

    /* renamed from: b */
    private String m102832b(String str) throws SignedTokenParseException {
        try {
            return new String(Base64.m102654c(str.getBytes()));
        } catch (IOException e) {
            throw SignedTokenParseException.m102855a((Throwable) e);
        }
    }

    /* renamed from: c */
    private void m102831c(String str) throws SignedTokenParseException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreElements()) {
            String nextToken = stringTokenizer.nextToken();
            KiwiLogger kiwiLogger = f2768d;
            kiwiLogger.m102829a("Field: " + nextToken);
            int indexOf = nextToken.indexOf("=");
            if (indexOf != -1) {
                String substring = nextToken.substring(0, indexOf);
                String substring2 = nextToken.substring(indexOf + 1);
                kiwiLogger.m102829a("FieldName: " + substring);
                kiwiLogger.m102829a("FieldValue: " + substring2);
                this.f2769e.put(substring, substring2);
            } else {
                throw SignedTokenParseException.m102854d();
            }
        }
    }

    public String toString() {
        return "Signed Token: " + this.f2769e;
    }

    /* renamed from: a */
    public String m102834a(String str) {
        Assert.m102872a((Object) str, "key");
        return this.f2769e.get(str);
    }
}
