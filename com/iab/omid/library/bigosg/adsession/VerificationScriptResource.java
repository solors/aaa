package com.iab.omid.library.bigosg.adsession;

import com.iab.omid.library.bigosg.p389d.C17955e;
import java.net.URL;

/* loaded from: classes6.dex */
public final class VerificationScriptResource {
    private final URL resourceUrl;
    private final String vendorKey;
    private final String verificationParameters;

    private VerificationScriptResource(String str, URL url, String str2) {
        this.vendorKey = str;
        this.resourceUrl = url;
        this.verificationParameters = str2;
    }

    public static VerificationScriptResource createVerificationScriptResourceWithParameters(String str, URL url, String str2) {
        C17955e.m64568a(str, "VendorKey is null or empty");
        C17955e.m64570a(url, "ResourceURL is null");
        C17955e.m64568a(str2, "VerificationParameters is null or empty");
        return new VerificationScriptResource(str, url, str2);
    }

    public static VerificationScriptResource createVerificationScriptResourceWithoutParameters(String str, URL url) {
        C17955e.m64568a(str, "VendorKey is null or empty");
        C17955e.m64570a(url, "ResourceURL is null");
        return new VerificationScriptResource(str, url, null);
    }

    public final URL getResourceUrl() {
        return this.resourceUrl;
    }

    public final String getVendorKey() {
        return this.vendorKey;
    }

    public final String getVerificationParameters() {
        return this.verificationParameters;
    }

    public static VerificationScriptResource createVerificationScriptResourceWithoutParameters(URL url) {
        C17955e.m64570a(url, "ResourceURL is null");
        return new VerificationScriptResource(null, url, null);
    }
}
