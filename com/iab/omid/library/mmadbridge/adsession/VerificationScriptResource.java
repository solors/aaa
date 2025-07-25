package com.iab.omid.library.mmadbridge.adsession;

import com.iab.omid.library.mmadbridge.utils.C18319c;
import com.iab.omid.library.mmadbridge.utils.C18326g;
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
        C18326g.m63118a(str, "VendorKey is null or empty");
        C18326g.m63120a(url, "ResourceURL is null");
        C18326g.m63118a(str2, "VerificationParameters is null or empty");
        return new VerificationScriptResource(str, url, str2);
    }

    public static VerificationScriptResource createVerificationScriptResourceWithoutParameters(URL url) {
        C18326g.m63120a(url, "ResourceURL is null");
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
        C18319c.m63143a(jSONObject, POBNativeConstants.NATIVE_VENDOR_KEY, this.vendorKey);
        C18319c.m63143a(jSONObject, "resourceUrl", this.resourceUrl.toString());
        C18319c.m63143a(jSONObject, "verificationParameters", this.verificationParameters);
        return jSONObject;
    }
}
