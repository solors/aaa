package com.amazon.p047a.p077b.p078a;

import com.amazon.p047a.p048a.p055d.KiwiException;
import com.amazon.p047a.p048a.p071o.p072a.Assert;
import com.amazon.p047a.p048a.p071o.p076d.VerificationError;
import com.amazon.p047a.p048a.p071o.p076d.Verifier;
import java.util.Iterator;

/* renamed from: com.amazon.a.b.a.a */
/* loaded from: classes2.dex */
public class LicenseVerificationException extends KiwiException {

    /* renamed from: a */
    private static final long f2796a = 1;

    /* renamed from: b */
    private final Verifier f2797b;

    public LicenseVerificationException(Verifier verifier) {
        super("LICENSE_VERIFICATION_FAILURE", "VERIFICATION_ERRORS", m102794a(verifier));
        Assert.m102869a(verifier.m102814a(), "Created a verification exception with a Verifier that has no errors");
        this.f2797b = verifier;
    }

    /* renamed from: a */
    private static String m102794a(Verifier verifier) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<VerificationError> it = verifier.iterator();
        while (it.hasNext()) {
            VerificationError next = it.next();
            if (sb2.length() != 0) {
                sb2.append(",");
            }
            sb2.append(next.m102816a().mo102772a());
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public Verifier m102793d() {
        return this.f2797b;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.f2797b.toString();
    }
}
