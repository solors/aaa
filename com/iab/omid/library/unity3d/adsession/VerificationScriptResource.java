package com.iab.omid.library.unity3d.adsession;

import com.iab.omid.library.unity3d.utils.C18708c;
import com.iab.omid.library.unity3d.utils.C18715g;
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
        C18715g.m61632a(str, "VendorKey is null or empty");
        C18715g.m61634a(url, "ResourceURL is null");
        C18715g.m61632a(str2, "VerificationParameters is null or empty");
        return new VerificationScriptResource(str, url, str2);
    }

    public static VerificationScriptResource createVerificationScriptResourceWithoutParameters(URL url) {
        C18715g.m61634a(url, "ResourceURL is null");
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
        C18708c.m61655a(jSONObject, POBNativeConstants.NATIVE_VENDOR_KEY, this.vendorKey);
        C18708c.m61655a(jSONObject, "resourceUrl", this.resourceUrl.toString());
        C18708c.m61655a(jSONObject, "verificationParameters", this.verificationParameters);
        return jSONObject;
    }
}
