package com.amazon.device.drm.p090a.p095e;

import android.app.Application;
import com.amazon.p047a.p048a.p071o.p073b.SignedToken;
import com.amazon.p047a.p048a.p071o.p073b.p074a.SignedTokenParseException;
import com.amazon.p047a.p048a.p071o.p073b.p074a.SignedTokenSignatureVerificationException;
import com.amazon.p047a.p048a.p071o.p076d.VerificationErrorCode;
import com.amazon.p047a.p048a.p071o.p076d.Verifier;
import com.amazon.p047a.p077b.ContentLicense;
import com.amazon.p047a.p077b.LicenseResult;
import com.amazon.p047a.p077b.LicenseVerificationErrorCode;
import com.amazon.p047a.p077b.p078a.LicenseVerificationException;
import java.security.PublicKey;
import java.util.Date;

/* renamed from: com.amazon.device.drm.a.e.a */
/* loaded from: classes2.dex */
public class LicensingHelper {
    /* renamed from: a */
    public static ContentLicense m102478a(LicenseResult licenseResult, PublicKey publicKey) throws SignedTokenParseException, SignedTokenSignatureVerificationException {
        return new ContentLicense(new SignedToken(licenseResult.m102773c(), publicKey));
    }

    /* renamed from: a */
    public static void m102479a(LicenseResult licenseResult, ContentLicense contentLicense, Application application) throws LicenseVerificationException {
        Verifier verifier = new Verifier();
        verifier.m102809a(licenseResult.m102777a(), contentLicense.m102790b(), (VerificationErrorCode) LicenseVerificationErrorCode.CUSTOMER_ID);
        verifier.m102809a(licenseResult.m102774b(), contentLicense.m102788c(), (VerificationErrorCode) LicenseVerificationErrorCode.DEVICE_ID);
        verifier.m102809a(contentLicense.m102786e(), application.getPackageName(), (VerificationErrorCode) LicenseVerificationErrorCode.PACKAGE_NAME);
        verifier.m102812a(contentLicense.m102787d(), new Date(), (VerificationErrorCode) LicenseVerificationErrorCode.EXPIRATION);
        if (verifier.m102814a()) {
            throw new LicenseVerificationException(verifier);
        }
    }
}
