package com.p551my.tracker.obfuscated;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.v */
/* loaded from: classes7.dex */
public final class C26443v {

    /* renamed from: a */
    private final JSONObject f69047a;

    /* renamed from: b */
    private final String f69048b;

    /* renamed from: c */
    private final String f69049c;

    /* renamed from: d */
    private final boolean f69050d;

    /* renamed from: e */
    private final long f69051e;

    /* renamed from: f */
    private JSONObject f69052f;

    /* renamed from: g */
    private Long f69053g;

    C26443v(JSONObject jSONObject, String str, String str2, boolean z, long j) {
        this.f69048b = str;
        this.f69047a = jSONObject;
        this.f69049c = str2;
        this.f69050d = z;
        this.f69051e = j;
    }

    /* renamed from: a */
    public C26443v m41585a(long j) {
        this.f69053g = Long.valueOf(j);
        return this;
    }

    /* renamed from: b */
    public Long m41581b() {
        return this.f69053g;
    }

    /* renamed from: c */
    public String m41580c() {
        return this.f69049c;
    }

    /* renamed from: d */
    public JSONObject m41579d() {
        return this.f69047a;
    }

    /* renamed from: e */
    public JSONObject m41578e() {
        return this.f69052f;
    }

    /* renamed from: f */
    public long m41577f() {
        return this.f69051e;
    }

    /* renamed from: g */
    public boolean m41576g() {
        return this.f69050d;
    }

    /* renamed from: a */
    public static C26443v m41584a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (TextUtils.isEmpty(jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID))) {
                C26468z0.m41528a("RawPurchase: empty productId in data " + str);
                return null;
            }
            return m41582a(jSONObject, str2, j);
        } catch (Throwable th) {
            C26468z0.m41524b("RawPurchase error: creating object failed", th);
            return null;
        }
    }

    /* renamed from: a */
    public C26443v m41583a(JSONObject jSONObject) {
        this.f69052f = jSONObject;
        return this;
    }

    /* renamed from: a */
    public static C26443v m41582a(JSONObject jSONObject, String str, long j) {
        return new C26443v(jSONObject, str, jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID), jSONObject.has("autoRenewing"), j);
    }

    /* renamed from: a */
    public String m41586a() {
        return this.f69048b;
    }
}
