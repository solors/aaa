package com.iab.omid.library.appodeal.adsession;

import com.iab.omid.library.appodeal.utils.C17900c;
import com.iab.omid.library.appodeal.utils.C17907g;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.net.URL;
import org.json.JSONObject;

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
        C17907g.m64764a(str, "VendorKey is null or empty");
        C17907g.m64766a(url, "ResourceURL is null");
        C17907g.m64764a(str2, "VerificationParameters is null or empty");
        return new VerificationScriptResource(str, url, str2);
    }

    public static VerificationScriptResource createVerificationScriptResourceWithoutParameters(URL url) {
        C17907g.m64766a(url, "ResourceURL is null");
        return new VerificationScriptResource(null, url, null);
    }

    public URL getResourceUrl() {
        return this.resourceUrl;
    }

    public String getVendorKey() {
        return this.vendorKey;
    }

    public String getVerificationParameters() {
        return this.verificationParameters;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        C17900c.m64789a(jSONObject, POBNativeConstants.NATIVE_VENDOR_KEY, this.vendorKey);
        C17900c.m64789a(jSONObject, "resourceUrl", this.resourceUrl.toString());
        C17900c.m64789a(jSONObject, "verificationParameters", this.verificationParameters);
        return jSONObject;
    }
}
