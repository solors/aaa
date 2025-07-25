package com.chartboost.sdk.impl;

import com.ironsource.C21114v8;
import com.maticoo.sdk.utils.constant.KeyConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.p9 */
/* loaded from: classes3.dex */
public class C10127p9 {

    /* renamed from: A */
    public C10129b f22916A;

    /* renamed from: B */
    public final String f22917B;

    /* renamed from: C */
    public final C9986ja f22918C;

    /* renamed from: D */
    public final C10080nb f22919D;

    /* renamed from: E */
    public final C10099o7 f22920E;

    /* renamed from: a */
    public final String f22921a;

    /* renamed from: b */
    public final boolean f22922b;

    /* renamed from: c */
    public final boolean f22923c;

    /* renamed from: d */
    public final List f22924d;

    /* renamed from: e */
    public final boolean f22925e;

    /* renamed from: f */
    public final boolean f22926f;

    /* renamed from: g */
    public final boolean f22927g;

    /* renamed from: h */
    public final boolean f22928h;

    /* renamed from: i */
    public final boolean f22929i;

    /* renamed from: j */
    public final boolean f22930j;

    /* renamed from: k */
    public final boolean f22931k;

    /* renamed from: l */
    public final boolean f22932l;

    /* renamed from: m */
    public final int f22933m;

    /* renamed from: n */
    public final int f22934n;

    /* renamed from: o */
    public final int f22935o;

    /* renamed from: p */
    public final List f22936p;

    /* renamed from: q */
    public final boolean f22937q;

    /* renamed from: r */
    public final boolean f22938r;

    /* renamed from: s */
    public final boolean f22939s;

    /* renamed from: t */
    public final int f22940t;

    /* renamed from: u */
    public final boolean f22941u;

    /* renamed from: v */
    public final int f22942v;

    /* renamed from: w */
    public final boolean f22943w;

    /* renamed from: x */
    public final String f22944x;

    /* renamed from: y */
    public final String f22945y;

    /* renamed from: z */
    public final C10128a f22946z;

    /* renamed from: com.chartboost.sdk.impl.p9$a */
    /* loaded from: classes3.dex */
    public static class C10128a {

        /* renamed from: a */
        public boolean f22947a;

        /* renamed from: a */
        public boolean m80810a() {
            return this.f22947a;
        }

        /* renamed from: a */
        public static C10128a m80809a(JSONObject jSONObject) {
            C10128a c10128a = new C10128a();
            c10128a.f22947a = jSONObject.optBoolean("bannerEnable", true);
            return c10128a;
        }
    }

    /* renamed from: com.chartboost.sdk.impl.p9$b */
    /* loaded from: classes3.dex */
    public static class C10129b {

        /* renamed from: a */
        public HashSet f22948a;

        /* renamed from: a */
        public static void m80807a(HashSet hashSet, int i) {
            if (i == 0) {
                hashSet.clear();
            }
        }

        /* renamed from: a */
        public HashSet m80808a() {
            return this.f22948a;
        }

        /* renamed from: a */
        public static void m80806a(JSONArray jSONArray, HashSet hashSet, int i) {
            for (int i2 = 0; i2 < i; i2++) {
                hashSet.add(jSONArray.getString(i2));
            }
        }

        /* renamed from: a */
        public static C10129b m80805a(JSONObject jSONObject) {
            C10129b c10129b = new C10129b();
            HashSet hashSet = new HashSet();
            hashSet.add("us_privacy");
            hashSet.add("coppa");
            hashSet.add("lgpd");
            JSONArray optJSONArray = jSONObject.optJSONArray("privacyStandards");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                m80806a(optJSONArray, hashSet, length);
                m80807a(hashSet, length);
            }
            c10129b.f22948a = hashSet;
            return c10129b;
        }
    }

    public C10127p9(JSONObject jSONObject) {
        this.f22921a = jSONObject.optString("configVariant");
        this.f22922b = jSONObject.optBoolean("prefetchDisable");
        this.f22923c = jSONObject.optBoolean("publisherDisable");
        this.f22946z = C10128a.m80809a(jSONObject);
        try {
            this.f22916A = C10129b.m80805a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.f22917B = jSONObject.optString("publisherWarning", null);
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("invalidateFolderList");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = optJSONArray.optString(i);
                if (!optString.isEmpty()) {
                    arrayList.add(optString);
                }
            }
        }
        this.f22924d = Collections.unmodifiableList(arrayList);
        JSONObject optJSONObject = jSONObject.optJSONObject("trackingLevels");
        optJSONObject = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.f22925e = optJSONObject.optBoolean("critical", true);
        this.f22932l = optJSONObject.optBoolean("includeStackTrace", true);
        this.f22926f = optJSONObject.optBoolean("error");
        this.f22927g = optJSONObject.optBoolean("debug");
        this.f22928h = optJSONObject.optBoolean(KeyConstants.RequestBody.KEY_SESSION);
        this.f22929i = optJSONObject.optBoolean("system");
        this.f22930j = optJSONObject.optBoolean("timing");
        this.f22931k = optJSONObject.optBoolean("user");
        this.f22918C = AbstractC10004ka.m81213b(jSONObject);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("videoPreCaching");
        this.f22919D = C10080nb.m81001a(optJSONObject2 == null ? new JSONObject() : optJSONObject2);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("omSdk");
        this.f22920E = AbstractC10121p7.m80830b(optJSONObject3 == null ? new JSONObject() : optJSONObject3);
        JSONObject optJSONObject4 = jSONObject.optJSONObject(C21114v8.C21122h.f54036K);
        optJSONObject4 = optJSONObject4 == null ? new JSONObject() : optJSONObject4;
        this.f22933m = optJSONObject4.optInt("cacheMaxBytes", 104857600);
        int optInt = optJSONObject4.optInt("cacheMaxUnits", 10);
        this.f22934n = optInt > 0 ? optInt : 10;
        this.f22935o = (int) TimeUnit.SECONDS.toDays(optJSONObject4.optInt("cacheTTLs", InterfaceC10159r1.f23039a));
        ArrayList arrayList2 = new ArrayList();
        JSONArray optJSONArray2 = optJSONObject4.optJSONArray("directories");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                String optString2 = optJSONArray2.optString(i2);
                if (!optString2.isEmpty()) {
                    arrayList2.add(optString2);
                }
            }
        }
        this.f22936p = Collections.unmodifiableList(arrayList2);
        this.f22937q = optJSONObject4.optBoolean("enabled", m80813i());
        this.f22938r = optJSONObject4.optBoolean("inplayEnabled", true);
        this.f22939s = optJSONObject4.optBoolean("interstitialEnabled", true);
        int optInt2 = optJSONObject4.optInt("invalidatePendingImpression", 3);
        this.f22940t = optInt2 <= 0 ? 3 : optInt2;
        this.f22941u = optJSONObject4.optBoolean("lockOrientation", true);
        this.f22942v = optJSONObject4.optInt("prefetchSession", 3);
        this.f22943w = optJSONObject4.optBoolean("rewardVideoEnabled", true);
        String optString3 = optJSONObject4.optString("version", "v2");
        this.f22944x = optString3;
        this.f22945y = String.format("%s/%s%s", C21114v8.C21122h.f54036K, optString3, "/prefetch");
    }

    /* renamed from: i */
    public static boolean m80813i() {
        int[] iArr = {4, 4, 2};
        String m80329a = C10274v0.m80326b().m80329a();
        if (m80329a != null && m80329a.length() > 0) {
            String[] split = m80329a.replaceAll("[^\\d.]", "").split("\\.");
            for (int i = 0; i < split.length && i < 3; i++) {
                try {
                    if (Integer.parseInt(split[i]) > iArr[i]) {
                        return true;
                    }
                    if (Integer.parseInt(split[i]) < iArr[i]) {
                        return false;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public C10128a m80821a() {
        return this.f22946z;
    }

    /* renamed from: b */
    public C10099o7 m80820b() {
        return this.f22920E;
    }

    /* renamed from: c */
    public C10080nb m80819c() {
        return this.f22919D;
    }

    /* renamed from: d */
    public boolean m80818d() {
        return this.f22922b;
    }

    /* renamed from: e */
    public boolean m80817e() {
        return this.f22923c;
    }

    /* renamed from: f */
    public String m80816f() {
        return this.f22917B;
    }

    /* renamed from: g */
    public C9986ja m80815g() {
        return this.f22918C;
    }

    /* renamed from: h */
    public boolean m80814h() {
        return this.f22937q;
    }

    /* renamed from: j */
    public boolean m80812j() {
        return this.f22941u;
    }

    /* renamed from: k */
    public C10061n3 m80811k() {
        return new C10061n3(this.f22921a, this.f22937q, this.f22944x);
    }
}
