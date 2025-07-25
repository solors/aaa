package com.iab.omid.library.pubnativenet.adsession;

import com.iab.omid.library.pubnativenet.utils.C18529c;
import com.iab.omid.library.pubnativenet.utils.C18536g;
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
        C18536g.m62359a(str, "VendorKey is null or empty");
        C18536g.m62361a(url, "ResourceURL is null");
        C18536g.m62359a(str2, "VerificationParameters is null or empty");
        return new VerificationScriptResource(str, url, str2);
    }

    public static VerificationScriptResource createVerificationScriptResourceWithoutParameters(URL url) {
        C18536g.m62361a(url, "ResourceURL is null");
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
        C18529c.m62384a(jSONObject, POBNativeConstants.NATIVE_VENDOR_KEY, this.vendorKey);
        C18529c.m62384a(jSONObject, "resourceUrl", this.resourceUrl.toString());
        C18529c.m62384a(jSONObject, "verificationParameters", this.verificationParameters);
        return jSONObject;
    }
}
