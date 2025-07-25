package com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222;

import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32604c2oc2i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32610cii2c2;
import java.net.URL;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.ciii2coi2 */
/* loaded from: classes8.dex */
public final class C32704ciii2coi2 {
    private final String c2oc2i;
    private final URL coi222o222;
    private final String coo2iico;

    private C32704ciii2coi2(String str, URL url, String str2) {
        this.coo2iico = str;
        this.coi222o222 = url;
        this.c2oc2i = str2;
    }

    public static C32704ciii2coi2 coo2iico(String str, URL url, String str2) {
        C32610cii2c2.coo2iico(str, "VendorKey is null or empty");
        C32610cii2c2.coo2iico(url, "ResourceURL is null");
        C32610cii2c2.coo2iico(str2, "VerificationParameters is null or empty");
        return new C32704ciii2coi2(str, url, str2);
    }

    public String c2oc2i() {
        return this.c2oc2i;
    }

    public JSONObject cioccoiococ() {
        JSONObject jSONObject = new JSONObject();
        C32604c2oc2i.coo2iico(jSONObject, POBNativeConstants.NATIVE_VENDOR_KEY, this.coo2iico);
        C32604c2oc2i.coo2iico(jSONObject, "resourceUrl", this.coi222o222.toString());
        C32604c2oc2i.coo2iico(jSONObject, "verificationParameters", this.c2oc2i);
        return jSONObject;
    }

    public String coi222o222() {
        return this.coo2iico;
    }

    public static C32704ciii2coi2 coo2iico(URL url) {
        C32610cii2c2.coo2iico(url, "ResourceURL is null");
        return new C32704ciii2coi2(null, url, null);
    }

    public URL coo2iico() {
        return this.coi222o222;
    }
}
