package com.p551my.tracker.obfuscated;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.d */
/* loaded from: classes7.dex */
public class C26308d {

    /* renamed from: a */
    private final JSONObject f68538a;

    /* renamed from: b */
    private final String f68539b;

    /* renamed from: c */
    private final String f68540c;

    /* renamed from: d */
    private final String f68541d;

    /* renamed from: e */
    private final int f68542e;

    /* renamed from: f */
    private final boolean f68543f;

    /* renamed from: g */
    private final long f68544g;

    /* renamed from: h */
    private JSONObject f68545h;

    /* renamed from: i */
    private Long f68546i;

    C26308d(JSONObject jSONObject, String str, String str2, String str3, int i, boolean z, long j) {
        this.f68539b = str;
        this.f68538a = jSONObject;
        this.f68540c = str2;
        this.f68541d = str3;
        this.f68542e = i;
        this.f68543f = z;
        this.f68544g = j;
    }

    /* renamed from: a */
    public C26308d m42107a(long j) {
        this.f68546i = Long.valueOf(j);
        return this;
    }

    /* renamed from: b */
    public Long m42104b() {
        return this.f68546i;
    }

    /* renamed from: c */
    public String m42103c() {
        return this.f68541d;
    }

    /* renamed from: d */
    public JSONObject m42102d() {
        return this.f68545h;
    }

    /* renamed from: e */
    public JSONObject m42101e() {
        return this.f68538a;
    }

    /* renamed from: f */
    public String m42100f() {
        return this.f68540c;
    }

    /* renamed from: g */
    public int m42099g() {
        return this.f68542e;
    }

    /* renamed from: h */
    public long m42098h() {
        return this.f68544g;
    }

    /* renamed from: a */
    public static C26308d m42106a(String str, String str2, String str3, int i, long j) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            if (!TextUtils.isEmpty(optString)) {
                return new C26308d(jSONObject, str2, str3, optString, i, jSONObject.has("priceType") && jSONObject.getInt("priceType") == 2, j);
            }
            C26468z0.m41528a("RawPurchase: empty productId in data " + str);
            return null;
        } catch (Throwable th) {
            C26468z0.m41524b("RawPurchase error: creating object failed", th);
            return null;
        }
    }

    /* renamed from: a */
    public C26308d m42105a(JSONObject jSONObject) {
        this.f68545h = jSONObject;
        return this;
    }

    /* renamed from: a */
    public String m42108a() {
        return this.f68539b;
    }
}
