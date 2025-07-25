package com.chartboost.sdk.impl;

import android.os.Build;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.g9 */
/* loaded from: classes3.dex */
public class C9869g9 {

    /* renamed from: a */
    public final String f22100a;

    /* renamed from: b */
    public final String f22101b;

    /* renamed from: c */
    public final String f22102c;

    /* renamed from: d */
    public final String f22103d;

    /* renamed from: e */
    public final String f22104e;

    /* renamed from: f */
    public final String f22105f;

    /* renamed from: g */
    public final String f22106g;

    /* renamed from: h */
    public final String f22107h;

    /* renamed from: i */
    public final String f22108i;

    /* renamed from: j */
    public final String f22109j;

    /* renamed from: k */
    public final String f22110k;

    /* renamed from: l */
    public final String f22111l;

    /* renamed from: m */
    public final JSONObject f22112m;

    /* renamed from: n */
    public final String f22113n;

    /* renamed from: o */
    public final String f22114o;

    /* renamed from: p */
    public final Integer f22115p;

    /* renamed from: q */
    public final C10160r2 f22116q;

    /* renamed from: r */
    public final C10066n8 f22117r;

    /* renamed from: s */
    public final C10266u9 f22118s;

    /* renamed from: t */
    public final C10186s5 f22119t;

    /* renamed from: u */
    public final C10321w8 f22120u;

    /* renamed from: v */
    public final C9816da f22121v;

    /* renamed from: w */
    public final C10061n3 f22122w;

    /* renamed from: x */
    public final C10310w3 f22123x;

    /* renamed from: y */
    public final C9848f7 f22124y;

    public C9869g9(String str, String str2, C10186s5 c10186s5, C10321w8 c10321w8, C10160r2 c10160r2, C10266u9 c10266u9, C9816da c9816da, C10066n8 c10066n8, C10061n3 c10061n3, C10310w3 c10310w3, C9848f7 c9848f7) {
        String str3;
        this.f22119t = c10186s5;
        this.f22120u = c10321w8;
        this.f22116q = c10160r2;
        this.f22118s = c10266u9;
        this.f22121v = c9816da;
        this.f22117r = c10066n8;
        this.f22107h = str;
        this.f22108i = str2;
        this.f22122w = c10061n3;
        this.f22123x = c10310w3;
        this.f22124y = c9848f7;
        String str4 = Build.PRODUCT;
        if (!"sdk".equals(str4) && !"google_sdk".equals(str4) && ((str3 = Build.MANUFACTURER) == null || !str3.contains("Genymotion"))) {
            this.f22100a = Build.MODEL;
        } else {
            this.f22100a = "Android Simulator";
        }
        String str5 = Build.MANUFACTURER;
        this.f22110k = str5 == null ? "unknown" : str5;
        this.f22109j = str5 + " " + Build.MODEL;
        this.f22111l = c10310w3.m80200b();
        this.f22101b = "Android " + Build.VERSION.RELEASE;
        this.f22102c = Locale.getDefault().getCountry();
        this.f22103d = Locale.getDefault().getLanguage();
        this.f22106g = "9.8.1";
        this.f22104e = c10310w3.m80193i();
        this.f22105f = c10310w3.m80195g();
        this.f22113n = m81616b(c10160r2);
        this.f22112m = m81619a(c10160r2);
        this.f22114o = C10060n2.m81043a();
        this.f22115p = c10321w8.m80156a();
    }

    /* renamed from: a */
    public final JSONObject m81619a(C10160r2 c10160r2) {
        if (c10160r2 != null) {
            return m81618a(c10160r2, new C10211t2());
        }
        return new JSONObject();
    }

    /* renamed from: b */
    public final String m81616b(C10160r2 c10160r2) {
        return c10160r2 != null ? c10160r2.m80692d() : "";
    }

    /* renamed from: c */
    public C10186s5 m81615c() {
        return this.f22119t;
    }

    /* renamed from: d */
    public C9848f7 m81614d() {
        return this.f22124y;
    }

    /* renamed from: e */
    public Integer m81613e() {
        return Integer.valueOf(this.f22123x.m80196f());
    }

    /* renamed from: f */
    public C10066n8 m81612f() {
        return this.f22117r;
    }

    /* renamed from: g */
    public C10321w8 m81611g() {
        return this.f22120u;
    }

    /* renamed from: h */
    public C10266u9 m81610h() {
        return this.f22118s;
    }

    /* renamed from: i */
    public int m81609i() {
        C10266u9 c10266u9 = this.f22118s;
        if (c10266u9 != null) {
            return c10266u9.m80385f();
        }
        return -1;
    }

    /* renamed from: j */
    public C9816da m81608j() {
        return this.f22121v;
    }

    /* renamed from: b */
    public C10310w3 m81617b() {
        return this.f22123x;
    }

    /* renamed from: a */
    public C10061n3 m81620a() {
        return this.f22122w;
    }

    /* renamed from: a */
    public JSONObject m81618a(C10160r2 c10160r2, C10211t2 c10211t2) {
        if (c10211t2 != null) {
            return c10211t2.m80559a(c10160r2);
        }
        return new JSONObject();
    }
}
