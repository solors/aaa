package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.h0 */
/* loaded from: classes2.dex */
public final class C4498h0 {

    /* renamed from: e */
    private static final Map f6503e = new HashMap();

    /* renamed from: f */
    private static final Object f6504f = new Object();

    /* renamed from: a */
    private JSONObject f6505a;

    /* renamed from: b */
    private final String f6506b;

    /* renamed from: c */
    private AppLovinAdSize f6507c;

    /* renamed from: d */
    private AppLovinAdType f6508d;

    private C4498h0(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z, boolean z2) {
        String lowerCase;
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.f6507c = appLovinAdSize;
        this.f6508d = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        } else {
            lowerCase = (appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
        }
        if (z) {
            lowerCase = lowerCase + "_bidding";
        }
        if (z2) {
            lowerCase = lowerCase + "_direct_sold";
        }
        this.f6506b = lowerCase;
    }

    /* renamed from: a */
    public static C4498h0 m98853a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return m98852a(appLovinAdSize, appLovinAdType, null);
    }

    /* renamed from: b */
    public static C4498h0 m98847b(String str) {
        return m98852a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    /* renamed from: c */
    public static C4498h0 m98846c() {
        return m98853a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    /* renamed from: h */
    public static C4498h0 m98841h() {
        return m98853a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    /* renamed from: j */
    public static C4498h0 m98839j() {
        return m98853a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    /* renamed from: k */
    public static C4498h0 m98838k() {
        return m98853a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    /* renamed from: l */
    public static C4498h0 m98837l() {
        return m98853a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    /* renamed from: m */
    public static C4498h0 m98836m() {
        return m98853a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    /* renamed from: d */
    public MaxAdFormat m98845d() {
        AppLovinAdSize m98843f = m98843f();
        if (m98843f == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (m98843f == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (m98843f == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (m98843f == AppLovinAdSize.INTERSTITIAL) {
            if (m98842g() == AppLovinAdType.REGULAR) {
                return MaxAdFormat.INTERSTITIAL;
            }
            if (m98842g() == AppLovinAdType.APP_OPEN) {
                return MaxAdFormat.APP_OPEN;
            }
            if (m98842g() == AppLovinAdType.INCENTIVIZED) {
                return MaxAdFormat.REWARDED;
            }
            if (m98842g() == AppLovinAdType.AUTO_INCENTIVIZED) {
                return MaxAdFormat.REWARDED_INTERSTITIAL;
            }
            return null;
        } else if (m98843f == AppLovinAdSize.NATIVE) {
            return MaxAdFormat.NATIVE;
        } else {
            return null;
        }
    }

    /* renamed from: e */
    public String m98844e() {
        return this.f6506b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4498h0.class == obj.getClass()) {
            return this.f6506b.equalsIgnoreCase(((C4498h0) obj).f6506b);
        }
        return false;
    }

    /* renamed from: f */
    public AppLovinAdSize m98843f() {
        if (this.f6507c == null && JsonUtils.valueExists(this.f6505a, "ad_size")) {
            this.f6507c = AppLovinAdSize.fromString(JsonUtils.getString(this.f6505a, "ad_size", null));
        }
        return this.f6507c;
    }

    /* renamed from: g */
    public AppLovinAdType m98842g() {
        if (this.f6508d == null && JsonUtils.valueExists(this.f6505a, "ad_type")) {
            this.f6508d = AppLovinAdType.fromString(JsonUtils.getString(this.f6505a, "ad_type", null));
        }
        return this.f6508d;
    }

    public int hashCode() {
        return this.f6506b.hashCode();
    }

    /* renamed from: i */
    public boolean m98840i() {
        return m98854a().contains(this);
    }

    public String toString() {
        return "AdZone{id=" + this.f6506b + ", zoneObject=" + this.f6505a + '}';
    }

    /* renamed from: a */
    public static C4498h0 m98852a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        return m98851a(appLovinAdSize, appLovinAdType, str, false, false);
    }

    /* renamed from: b */
    public static C4498h0 m98848b() {
        return m98853a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    /* renamed from: a */
    public static C4498h0 m98850a(String str) {
        return m98852a(null, null, str);
    }

    /* renamed from: a */
    public static void m98849a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f6504f) {
                C4498h0 c4498h0 = (C4498h0) f6503e.get(JsonUtils.getString(jSONObject, "zone_id", ""));
                if (c4498h0 != null) {
                    c4498h0.f6507c = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                    c4498h0.f6508d = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                }
            }
        }
    }

    /* renamed from: a */
    public static C4498h0 m98851a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z, boolean z2) {
        C4498h0 c4498h0 = new C4498h0(appLovinAdSize, appLovinAdType, str, z, z2);
        synchronized (f6504f) {
            String str2 = c4498h0.f6506b;
            Map map = f6503e;
            if (map.containsKey(str2)) {
                c4498h0 = (C4498h0) map.get(str2);
            } else {
                map.put(str2, c4498h0);
            }
        }
        return c4498h0;
    }

    /* renamed from: a */
    public static Collection m98854a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        Collections.addAll(linkedHashSet, m98846c(), m98838k(), m98839j(), m98836m(), m98848b(), m98841h(), m98837l());
        return Collections.unmodifiableSet(linkedHashSet);
    }
}
