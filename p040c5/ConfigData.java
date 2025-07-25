package p040c5;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: c5.a */
/* loaded from: classes6.dex */
public class ConfigData {

    /* renamed from: a */
    private C3427b f1866a;

    /* renamed from: b */
    private Map<String, String> f1867b;

    /* renamed from: c */
    private C3426a f1868c;

    /* renamed from: d */
    private Map<String, String> f1869d;

    /* compiled from: ConfigData.java */
    /* renamed from: c5.a$a */
    /* loaded from: classes6.dex */
    public static class C3426a {

        /* renamed from: a */
        private double f1870a;

        /* renamed from: b */
        private double f1871b;

        /* renamed from: a */
        public double m103641a() {
            return this.f1871b;
        }

        /* renamed from: b */
        public double m103640b() {
            return this.f1870a;
        }

        /* renamed from: c */
        public boolean m103639c() {
            if (this.f1871b > 0.0d && this.f1870a > 0.0d) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public void m103638d(double d) {
            this.f1871b = d;
        }

        /* renamed from: e */
        public void m103637e(double d) {
            this.f1870a = d;
        }

        public String toString() {
            return "EcpmRank{mid=" + this.f1870a + ", high=" + this.f1871b + '}';
        }
    }

    /* compiled from: ConfigData.java */
    /* renamed from: c5.a$b */
    /* loaded from: classes6.dex */
    public static class C3427b {

        /* renamed from: a */
        private String f1872a;

        /* renamed from: b */
        private String f1873b;

        /* renamed from: c */
        private long f1874c;

        /* renamed from: d */
        private List<C3429b> f1875d;

        /* renamed from: e */
        private List<C3428a> f1876e;

        /* compiled from: ConfigData.java */
        /* renamed from: c5.a$b$a */
        /* loaded from: classes6.dex */
        public static class C3428a {

            /* renamed from: a */
            private String f1877a;

            /* renamed from: b */
            private List<String> f1878b;

            /* renamed from: b */
            public static String m103625b(String str) {
                try {
                    return new JSONObject(str).optJSONArray("tag_value_list").toString();
                } catch (Throwable th) {
                    th.printStackTrace();
                    return "";
                }
            }

            /* renamed from: a */
            public String m103626a() {
                return this.f1877a;
            }

            /* renamed from: c */
            public List<String> m103624c() {
                return this.f1878b;
            }

            /* renamed from: d */
            public void m103623d(String str) {
                this.f1877a = str;
            }

            /* renamed from: e */
            public void m103622e(List<String> list) {
                this.f1878b = list;
            }

            /* renamed from: f */
            public String m103621f() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("tag_id", this.f1877a);
                    jSONObject.put("tag_value_list", new JSONArray((Collection) this.f1878b));
                    return jSONObject.toString();
                } catch (Throwable th) {
                    th.printStackTrace();
                    return "";
                }
            }
        }

        /* compiled from: ConfigData.java */
        /* renamed from: c5.a$b$b */
        /* loaded from: classes6.dex */
        public static class C3429b {

            /* renamed from: a */
            private String f1879a;

            /* renamed from: b */
            private String f1880b;

            /* renamed from: c */
            public static String m103618c(String str) {
                try {
                    return new JSONObject(str).optString("tag_value");
                } catch (Throwable th) {
                    th.printStackTrace();
                    return "";
                }
            }

            /* renamed from: a */
            public String m103620a() {
                return this.f1879a;
            }

            /* renamed from: b */
            public String m103619b() {
                return this.f1880b;
            }

            /* renamed from: d */
            public void m103617d(String str) {
                this.f1879a = str;
            }

            /* renamed from: e */
            public void m103616e(String str) {
                this.f1880b = str;
            }

            /* renamed from: f */
            public String m103615f() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("tag_id", this.f1879a);
                    jSONObject.put("tag_value", this.f1880b);
                    return jSONObject.toString();
                } catch (Throwable th) {
                    th.printStackTrace();
                    return "";
                }
            }
        }

        /* renamed from: a */
        public String m103636a() {
            return this.f1873b;
        }

        /* renamed from: b */
        public long m103635b() {
            return this.f1874c;
        }

        /* renamed from: c */
        public List<C3428a> m103634c() {
            return this.f1876e;
        }

        /* renamed from: d */
        public String m103633d() {
            return this.f1872a;
        }

        /* renamed from: e */
        public List<C3429b> m103632e() {
            return this.f1875d;
        }

        /* renamed from: f */
        public void m103631f(String str) {
            this.f1873b = str;
        }

        /* renamed from: g */
        public void m103630g(long j) {
            this.f1874c = j;
        }

        /* renamed from: h */
        public void m103629h(List<C3428a> list) {
            this.f1876e = list;
        }

        /* renamed from: i */
        public void m103628i(String str) {
            this.f1872a = str;
        }

        /* renamed from: j */
        public void m103627j(List<C3429b> list) {
            this.f1875d = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ConfigData m103651a(JSONObject jSONObject) {
        JSONArray optJSONArray;
        ConfigData configData = new ConfigData();
        JSONObject optJSONObject = jSONObject.optJSONObject("user_prop");
        if (optJSONObject != null) {
            C3427b c3427b = new C3427b();
            configData.m103642j(c3427b);
            c3427b.m103628i(optJSONObject.optString("user_id"));
            c3427b.m103631f(optJSONObject.optString("first_app_version"));
            c3427b.m103630g(optJSONObject.optLong("create_dt"));
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("user_tags");
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                ArrayList arrayList = new ArrayList();
                c3427b.m103627j(arrayList);
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i);
                    if (optJSONObject2 != null) {
                        C3427b.C3429b c3429b = new C3427b.C3429b();
                        String optString = optJSONObject2.optString("tag_id");
                        if (!TextUtils.isEmpty(optString)) {
                            c3429b.m103617d(optString);
                            c3429b.m103616e(optJSONObject2.optString("tag_value"));
                            arrayList.add(c3429b);
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = optJSONObject.optJSONArray("user_tag_list");
            if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                ArrayList arrayList2 = new ArrayList();
                c3427b.m103629h(arrayList2);
                for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                    JSONObject optJSONObject3 = optJSONArray3.optJSONObject(i2);
                    if (optJSONObject3 != null) {
                        String optString2 = optJSONObject3.optString("tag_id");
                        if (!TextUtils.isEmpty(optString2) && (optJSONArray = optJSONObject3.optJSONArray("tag_value_list")) != null && optJSONArray.length() != 0) {
                            C3427b.C3428a c3428a = new C3427b.C3428a();
                            arrayList2.add(c3428a);
                            c3428a.m103623d(optString2);
                            ArrayList arrayList3 = new ArrayList();
                            c3428a.m103622e(arrayList3);
                            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                arrayList3.add(optJSONArray.optString(i3));
                            }
                        }
                    }
                }
            }
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("campaign_prop");
        if (optJSONObject4 != null) {
            configData.m103645g(m103646f(optJSONObject4));
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("ecpm_rank");
        if (optJSONObject5 != null) {
            C3426a c3426a = new C3426a();
            configData.m103644h(c3426a);
            c3426a.m103638d(optJSONObject5.optDouble("high"));
            c3426a.m103637e(optJSONObject5.optDouble("mid"));
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("ua_ad_tag");
        if (optJSONObject6 != null) {
            configData.m103643i(m103646f(optJSONObject6));
        }
        return configData;
    }

    /* renamed from: f */
    private static Map<String, String> m103646f(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, jSONObject.optString(next));
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public Map<String, String> m103650b() {
        return this.f1867b;
    }

    /* renamed from: c */
    public C3426a m103649c() {
        return this.f1868c;
    }

    /* renamed from: d */
    public Map<String, String> m103648d() {
        return this.f1869d;
    }

    /* renamed from: e */
    public C3427b m103647e() {
        return this.f1866a;
    }

    /* renamed from: g */
    public void m103645g(Map<String, String> map) {
        this.f1867b = map;
    }

    /* renamed from: h */
    public void m103644h(C3426a c3426a) {
        this.f1868c = c3426a;
    }

    /* renamed from: i */
    public void m103643i(Map<String, String> map) {
        this.f1869d = map;
    }

    /* renamed from: j */
    public void m103642j(C3427b c3427b) {
        this.f1866a = c3427b;
    }

    public String toString() {
        return "ConfigData{ecpmRank=" + this.f1868c + '}';
    }
}
