package com.bytedance.sdk.openadsdk.core.p316PX;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.PX.eo */
/* loaded from: classes3.dex */
public class C8653eo {

    /* renamed from: IL */
    private final URL f19095IL;

    /* renamed from: bX */
    private final String f19096bX;

    /* renamed from: bg */
    private final String f19097bg;
    private final String eqN;

    private C8653eo(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.f19097bg = str2;
        this.f19095IL = new URL(str);
        this.f19096bX = str3;
        this.eqN = str4;
    }

    /* renamed from: IL */
    public String m85419IL() {
        return this.f19096bX;
    }

    /* renamed from: bX */
    public URL m85418bX() {
        return this.f19095IL;
    }

    /* renamed from: bg */
    public String m85417bg() {
        return this.f19097bg;
    }

    public JSONObject eqN() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apiFramework", CampaignEx.KEY_OMID);
            jSONObject.put("javascriptResourceUrl", this.f19095IL.toString());
            if (!TextUtils.isEmpty(this.f19097bg)) {
                jSONObject.put(POBNativeConstants.NATIVE_VENDOR_KEY, this.f19097bg);
            }
            if (!TextUtils.isEmpty(this.f19096bX)) {
                jSONObject.put("verificationParameters", this.f19096bX);
            }
            if (!TextUtils.isEmpty(this.eqN)) {
                jSONObject.put("verificationNotExecuted", this.eqN);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8653eo)) {
            return false;
        }
        C8653eo c8653eo = (C8653eo) obj;
        if (!m85416bg(this.f19097bg, c8653eo.f19097bg) || !m85416bg(this.f19095IL, c8653eo.f19095IL) || !m85416bg(this.f19096bX, c8653eo.f19096bX)) {
            return false;
        }
        return m85416bg(this.eqN, c8653eo.eqN);
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f19097bg;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = ((i * 31) + this.f19095IL.hashCode()) * 31;
        String str2 = this.f19096bX;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (hashCode + i2) * 31;
        String str3 = this.eqN;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i4 + i3;
    }

    /* renamed from: bg */
    private boolean m85416bg(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    /* renamed from: bg */
    public static C8653eo m85415bg(String str, String str2, String str3, String str4, String str5) {
        if (CampaignEx.KEY_OMID.equalsIgnoreCase(str) && !TextUtils.isEmpty(str2)) {
            try {
                return new C8653eo(str2, str3, str4, str5);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: bg */
    public static C8653eo m85413bg(JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("apiFramework");
            String optString2 = jSONObject.optString("javascriptResourceUrl");
            if (CampaignEx.KEY_OMID.equalsIgnoreCase(optString) && !TextUtils.isEmpty(optString2)) {
                return new C8653eo(optString2, jSONObject.optString(POBNativeConstants.NATIVE_VENDOR_KEY), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: bg */
    public static Set<C8653eo> m85414bg(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray == null) {
            return hashSet;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                hashSet.add(m85413bg(jSONArray.getJSONObject(i)));
            } catch (Throwable unused) {
            }
        }
        return hashSet;
    }
}
