package com.iab.omid.library.pubmatic.adsession;

import com.iab.omid.library.pubmatic.utils.C18459c;
import com.iab.omid.library.pubmatic.utils.C18466g;
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
        C18466g.m62612a(str, "VendorKey is null or empty");
        C18466g.m62614a(url, "ResourceURL is null");
        C18466g.m62612a(str2, "VerificationParameters is null or empty");
        return new VerificationScriptResource(str, url, str2);
    }

    public static VerificationScriptResource createVerificationScriptResourceWithoutParameters(URL url) {
        C18466g.m62614a(url, "ResourceURL is null");
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
        C18459c.m62637a(jSONObject, POBNativeConstants.NATIVE_VENDOR_KEY, this.vendorKey);
        C18459c.m62637a(jSONObject, "resourceUrl", this.resourceUrl.toString());
        C18459c.m62637a(jSONObject, "verificationParameters", this.verificationParameters);
        return jSONObject;
    }
}
