package p681g4;

import android.text.TextUtils;
import com.learnings.abcenter.bridge.AbUserTagData;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: g4.c */
/* loaded from: classes6.dex */
public class BaseGrtModel {

    /* compiled from: BaseGrtModel.java */
    /* renamed from: g4.c$a */
    /* loaded from: classes6.dex */
    public static class C33189a {

        /* renamed from: a */
        private List<String> f90695a;

        /* renamed from: b */
        private List<String> f90696b;

        /* renamed from: c */
        private C33190a f90697c;

        /* renamed from: d */
        private C33191b f90698d;

        /* compiled from: BaseGrtModel.java */
        /* renamed from: g4.c$a$a */
        /* loaded from: classes6.dex */
        public static class C33190a {

            /* renamed from: a */
            private String f90699a;

            /* renamed from: b */
            private List<String> f90700b;

            /* renamed from: a */
            public boolean m24425a(String str) {
                if (TextUtils.equals(this.f90699a, POBProfileInfo.COUNTRY_FILTERING_ALLOW_MODE)) {
                    return !this.f90700b.contains(str);
                }
                return this.f90700b.contains(str);
            }

            /* renamed from: b */
            public boolean m24424b() {
                return !this.f90700b.isEmpty();
            }

            /* renamed from: c */
            public void m24423c(String str) {
                this.f90699a = str;
            }

            /* renamed from: d */
            public void m24422d(List<String> list) {
                this.f90700b = list;
            }

            public String toString() {
                return "{type='" + this.f90699a + "', valueList=" + this.f90700b + '}';
            }
        }

        /* compiled from: BaseGrtModel.java */
        /* renamed from: g4.c$a$b */
        /* loaded from: classes6.dex */
        public static class C33191b {

            /* renamed from: a */
            private int f90701a = 0;

            /* renamed from: b */
            private int f90702b = -1;

            /* renamed from: a */
            public boolean m24421a(int i) {
                if (i >= this.f90701a && i <= this.f90702b) {
                    return false;
                }
                return true;
            }

            /* renamed from: b */
            public boolean m24420b() {
                if (this.f90701a == 0 && this.f90702b == -1) {
                    return false;
                }
                return true;
            }

            /* renamed from: c */
            public void m24419c(int i) {
                this.f90702b = i;
            }

            /* renamed from: d */
            public void m24418d(int i) {
                this.f90701a = i;
            }

            public String toString() {
                return "{min=" + this.f90701a + ", max=" + this.f90702b + '}';
            }
        }

        /* renamed from: a */
        public static C33189a m24438a(JSONObject jSONObject) {
            C33189a c33189a = new C33189a();
            ArrayList arrayList = new ArrayList();
            c33189a.m24427l(arrayList);
            JSONArray optJSONArray = jSONObject.optJSONArray("receiver");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        arrayList.add(optString);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            c33189a.m24428k(arrayList2);
            JSONArray optJSONArray2 = jSONObject.optJSONArray(AbUserTagData.AREA_MEDIA_SOURCE);
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    String optString2 = optJSONArray2.optString(i2);
                    if (!TextUtils.isEmpty(optString2)) {
                        arrayList2.add(optString2);
                    }
                }
            }
            C33190a c33190a = new C33190a();
            c33189a.m24429j(c33190a);
            ArrayList arrayList3 = new ArrayList();
            c33190a.m24422d(arrayList3);
            JSONObject optJSONObject = jSONObject.optJSONObject("country");
            if (optJSONObject != null) {
                c33190a.m24423c(optJSONObject.optString("type"));
                JSONArray optJSONArray3 = optJSONObject.optJSONArray("value");
                if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                    for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                        String optString3 = optJSONArray3.optString(i3);
                        if (!TextUtils.isEmpty(optString3)) {
                            arrayList3.add(optString3.toLowerCase());
                        }
                    }
                }
            }
            C33191b c33191b = new C33191b();
            c33189a.m24426m(c33191b);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("userLifetime");
            if (optJSONObject2 != null) {
                c33191b.m24418d(optJSONObject2.optInt("min", 0));
                c33191b.m24419c(optJSONObject2.optInt("max", -1));
            }
            return c33189a;
        }

        /* renamed from: b */
        public C33190a m24437b() {
            return this.f90697c;
        }

        /* renamed from: c */
        public List<String> m24436c() {
            return this.f90696b;
        }

        /* renamed from: d */
        public List<String> m24435d() {
            return this.f90695a;
        }

        /* renamed from: e */
        public List<String> m24434e(String str) {
            ArrayList arrayList = new ArrayList(this.f90695a);
            arrayList.remove(str);
            return arrayList;
        }

        /* renamed from: f */
        public List<String> m24433f(String str) {
            ArrayList arrayList = new ArrayList();
            if (this.f90695a.contains(str)) {
                arrayList.add(str);
            }
            return arrayList;
        }

        /* renamed from: g */
        public C33191b m24432g() {
            return this.f90698d;
        }

        /* renamed from: h */
        public boolean m24431h(String str) {
            return !this.f90696b.contains(str);
        }

        /* renamed from: i */
        public boolean m24430i() {
            return !this.f90696b.isEmpty();
        }

        /* renamed from: j */
        public void m24429j(C33190a c33190a) {
            this.f90697c = c33190a;
        }

        /* renamed from: k */
        public void m24428k(List<String> list) {
            this.f90696b = list;
        }

        /* renamed from: l */
        public void m24427l(List<String> list) {
            this.f90695a = list;
        }

        /* renamed from: m */
        public void m24426m(C33191b c33191b) {
            this.f90698d = c33191b;
        }

        public String toString() {
            return "{receiverList=" + this.f90695a + ", mediaSourceList=" + this.f90696b + ", country=" + this.f90697c + ", userLifeTime=" + this.f90698d + '}';
        }
    }
}
