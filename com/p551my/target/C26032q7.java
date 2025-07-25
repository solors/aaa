package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.q7 */
/* loaded from: classes7.dex */
public final class C26032q7 {

    /* renamed from: a */
    public final boolean f67637a;

    /* renamed from: b */
    public final C25832j f67638b;

    /* renamed from: c */
    public final String f67639c;

    /* renamed from: d */
    public final Context f67640d;

    public C26032q7(C25832j c25832j, String str, boolean z, Context context) {
        this.f67638b = c25832j;
        this.f67639c = str;
        this.f67637a = z;
        this.f67640d = context;
    }

    /* renamed from: a */
    public static C26032q7 m43124a(C25832j c25832j, String str, boolean z, Context context) {
        return new C26032q7(c25832j, str, z, context);
    }

    /* renamed from: a */
    public C26010p7 m43123a(C26010p7 c26010p7, JSONObject jSONObject) {
        if (c26010p7 == null) {
            String optString = jSONObject.optString("customReferenceData", null);
            if (optString != null && optString.length() > 256) {
                m43122a("Bad value", "customReferenceData more then 256 symbols");
                optString = null;
            }
            c26010p7 = C26010p7.m43199a(jSONObject.optString("contentUrl", null), optString);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("resources");
        if (optJSONArray != null) {
            m43121a(optJSONArray, c26010p7);
        }
        return c26010p7;
    }

    /* renamed from: a */
    public final void m43121a(JSONArray jSONArray, C26010p7 c26010p7) {
        C25987oa m43231a;
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                if (optJSONObject.has("url")) {
                    String optString = optJSONObject.optString("url");
                    if (optJSONObject.has(POBNativeConstants.NATIVE_VENDOR_KEY) && optJSONObject.has("params")) {
                        String optString2 = optJSONObject.optString(POBNativeConstants.NATIVE_VENDOR_KEY);
                        String optString3 = optJSONObject.optString("params");
                        if (TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3)) {
                            AbstractC25846ja.m43680a("VerificationScriptResource has empty param: vendorKey=" + optString2 + ", verificationParameters=" + optString3);
                        } else {
                            m43231a = C25987oa.m43230a(optString, optString2, optString3);
                        }
                    } else {
                        m43231a = C25987oa.m43231a(optString);
                    }
                    c26010p7.f67552c.add(m43231a);
                } else {
                    m43122a("Required field", "VerificationScriptResource has no url");
                }
            }
        }
    }

    /* renamed from: a */
    public final void m43122a(String str, String str2) {
        if (this.f67637a) {
            C25656b5.m44178a(str).m44173e(str2).m44180a(this.f67638b.getSlotId()).m44176b(this.f67639c).m44177b(this.f67640d);
        }
    }
}
