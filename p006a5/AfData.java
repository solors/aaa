package p006a5;

import java.util.HashMap;
import java.util.Map;
import p738j5.DataProcessUtils;

/* renamed from: a5.a */
/* loaded from: classes6.dex */
public class AfData {

    /* renamed from: a */
    private String f71a;

    /* renamed from: b */
    private String f72b;

    /* renamed from: c */
    private String f73c;

    /* renamed from: d */
    private String f74d;

    /* renamed from: e */
    private String f75e;

    /* renamed from: f */
    private String f76f;

    /* renamed from: g */
    private Map<String, String> f77g;

    /* renamed from: a */
    public void m105870a(Map<String, String> map) {
        m105859l(map);
        String str = map.get("media_source");
        String str2 = map.get("af_status");
        if (DataProcessUtils.m18555b(str2, "Organic")) {
            str = str2;
        }
        m105856o(str);
        m105861j(str2);
        String str3 = map.get("campaign_id");
        if (DataProcessUtils.m18551f(str3)) {
            str3 = map.get("af_c_id");
        }
        m105858m(str3);
        m105857n(map.get("campaign"));
        String str4 = map.get("adset_id");
        if (DataProcessUtils.m18551f(str4)) {
            str4 = map.get("af_adset_id");
        }
        m105862i(str4);
        m105860k(map.get("agency"));
    }

    /* renamed from: b */
    public String m105869b() {
        return DataProcessUtils.m18552e(this.f75e);
    }

    /* renamed from: c */
    public String m105868c() {
        return DataProcessUtils.m18552e(this.f72b);
    }

    /* renamed from: d */
    public String m105867d() {
        return DataProcessUtils.m18552e(this.f76f);
    }

    /* renamed from: e */
    public Map<String, String> m105866e() {
        if (this.f77g == null) {
            this.f77g = new HashMap();
        }
        return this.f77g;
    }

    /* renamed from: f */
    public String m105865f() {
        return DataProcessUtils.m18552e(this.f73c);
    }

    /* renamed from: g */
    public String m105864g() {
        return DataProcessUtils.m18552e(this.f74d);
    }

    /* renamed from: h */
    public String m105863h() {
        return DataProcessUtils.m18552e(this.f71a);
    }

    /* renamed from: i */
    public void m105862i(String str) {
        this.f75e = str;
    }

    /* renamed from: j */
    public void m105861j(String str) {
        this.f72b = str;
    }

    /* renamed from: k */
    public void m105860k(String str) {
        this.f76f = str;
    }

    /* renamed from: l */
    public void m105859l(Map<String, String> map) {
        this.f77g = map;
    }

    /* renamed from: m */
    public void m105858m(String str) {
        this.f73c = str;
    }

    /* renamed from: n */
    public void m105857n(String str) {
        this.f74d = str;
    }

    /* renamed from: o */
    public void m105856o(String str) {
        this.f71a = str;
    }

    public String toString() {
        return "{\n\t\tmediaSource = " + m105863h() + "\n\t\tafStatus = " + m105868c() + "\n\t\tcampaignId = " + m105865f() + "\n\t\tcampaignName = " + m105864g() + "\n\t\tadSetId = " + m105869b() + "\n\t\tagency = " + m105867d() + "\n\t\tallData = " + DataProcessUtils.m18548i(m105866e()) + "\n\t\t}";
    }
}
