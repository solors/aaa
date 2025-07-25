package com.chartboost.sdk.impl;

import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.net.URL;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.hb */
/* loaded from: classes3.dex */
public final class C9933hb {

    /* renamed from: a */
    public final String f22241a;

    /* renamed from: b */
    public final URL f22242b;

    /* renamed from: c */
    public final String f22243c;

    public C9933hb(String str, URL url, String str2) {
        this.f22241a = str;
        this.f22242b = url;
        this.f22243c = str2;
    }

    /* renamed from: a */
    public static C9933hb m81481a(String str, URL url, String str2) {
        AbstractC10085nd.m80980a(str, "VendorKey is null or empty");
        AbstractC10085nd.m80982a(url, "ResourceURL is null");
        AbstractC10085nd.m80980a(str2, "VerificationParameters is null or empty");
        return new C9933hb(str, url, str2);
    }

    /* renamed from: b */
    public String m81480b() {
        return this.f22241a;
    }

    /* renamed from: c */
    public String m81479c() {
        return this.f22243c;
    }

    /* renamed from: d */
    public JSONObject m81478d() {
        JSONObject jSONObject = new JSONObject();
        AbstractC10359xc.m80049a(jSONObject, POBNativeConstants.NATIVE_VENDOR_KEY, this.f22241a);
        AbstractC10359xc.m80049a(jSONObject, "resourceUrl", this.f22242b.toString());
        AbstractC10359xc.m80049a(jSONObject, "verificationParameters", this.f22243c);
        return jSONObject;
    }

    /* renamed from: a */
    public URL m81482a() {
        return this.f22242b;
    }
}
