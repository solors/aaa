package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import com.p551my.target.common.models.ImageData;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.z3 */
/* loaded from: classes7.dex */
public class C26266z3 {

    /* renamed from: a */
    public final C26073s f68412a;

    /* renamed from: b */
    public final C25832j f68413b;

    /* renamed from: c */
    public final Context f68414c;

    /* renamed from: d */
    public boolean f68415d = true;

    public C26266z3(C26073s c26073s, C25832j c25832j, Context context) {
        this.f68412a = c26073s;
        this.f68413b = c25832j;
        this.f68414c = context;
    }

    /* renamed from: a */
    public static C26266z3 m42259a(C26073s c26073s, C25832j c25832j, Context context) {
        return new C26266z3(c26073s, c25832j, context);
    }

    /* renamed from: a */
    public boolean m42257a(JSONObject jSONObject, C26243y3 c26243y3, C25923n c25923n) {
        ImageData m42256a;
        ImageData m42256a2;
        this.f68415d = c26243y3.isLogErrors();
        JSONArray optJSONArray = jSONObject.optJSONArray("portrait");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("landscape");
        boolean z = false;
        if ((optJSONArray == null || optJSONArray.length() <= 0) && (optJSONArray2 == null || optJSONArray2.length() <= 0)) {
            c25923n.m43428a(C25902m.f67234p);
            m42258a("No images in InterstitialAdImageBanner", "Required field", c26243y3.getId());
            return false;
        }
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && (m42256a2 = m42256a(optJSONObject, c26243y3.getId())) != null) {
                    c26243y3.addPortraitImage(m42256a2);
                }
            }
        }
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                if (optJSONObject2 != null && (m42256a = m42256a(optJSONObject2, c26243y3.getId())) != null) {
                    c26243y3.addLandscapeImage(m42256a);
                }
            }
        }
        z = (c26243y3.getLandscapeImages().isEmpty() && c26243y3.getPortraitImages().isEmpty()) ? true : true;
        if (z) {
            c25923n.m43428a(C25902m.f67234p);
        }
        return z;
    }

    /* renamed from: a */
    public final ImageData m42256a(JSONObject jSONObject, String str) {
        String str2;
        String optString = jSONObject.optString("imageLink");
        if (TextUtils.isEmpty(optString)) {
            str2 = "InterstitialAdImageBanner no imageLink for image";
        } else {
            int optInt = jSONObject.optInt("width");
            int optInt2 = jSONObject.optInt("height");
            if (optInt > 0 && optInt2 > 0) {
                return ImageData.newImageData(optString, optInt, optInt2);
            }
            str2 = "InterstitialAdImageBanner  image has wrong dimensions, w = " + optInt + ", h = " + optInt2;
        }
        m42258a(str2, "Required field", str);
        return null;
    }

    /* renamed from: a */
    public final void m42258a(String str, String str2, String str3) {
        if (this.f68415d) {
            String str4 = this.f68412a.f67806a;
            C25656b5 m44175c = C25656b5.m44178a(str2).m44173e(str).m44180a(this.f68413b.getSlotId()).m44175c(str3);
            if (str4 == null) {
                str4 = this.f68412a.f67807b;
            }
            m44175c.m44176b(str4).m44177b(this.f68414c);
        }
    }
}
