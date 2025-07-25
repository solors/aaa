package p681g4;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p681g4.BaseGrtModel;
import p711i4.BaseGrtEvent;
import p711i4.LtvEvent;
import p753k4.StatsUtils;

/* renamed from: g4.k */
/* loaded from: classes6.dex */
public class LtvModel extends BaseGrtModel {

    /* renamed from: a */
    private List<C33195a> f90729a;

    /* compiled from: LtvModel.java */
    /* renamed from: g4.k$a */
    /* loaded from: classes6.dex */
    public static class C33195a {

        /* renamed from: a */
        private String f90730a;

        /* renamed from: b */
        private Map<String, C33196a> f90731b;

        /* renamed from: c */
        private BaseGrtModel.C33189a f90732c;

        /* compiled from: LtvModel.java */
        /* renamed from: g4.k$a$a */
        /* loaded from: classes6.dex */
        public static class C33196a {

            /* renamed from: a */
            private String f90733a;

            /* renamed from: b */
            private double f90734b;

            /* renamed from: a */
            public double m24348a() {
                return this.f90734b;
            }

            /* renamed from: b */
            public void m24347b(String str) {
                this.f90733a = str;
            }

            /* renamed from: c */
            public void m24346c(double d) {
                this.f90734b = d;
            }

            public String toString() {
                return "{name=" + this.f90733a + ", value=" + this.f90734b + '}';
            }
        }

        /* renamed from: a */
        public Map<String, C33196a> m24354a() {
            return this.f90731b;
        }

        /* renamed from: b */
        public BaseGrtModel.C33189a m24353b() {
            return this.f90732c;
        }

        /* renamed from: c */
        public String m24352c() {
            return this.f90730a;
        }

        /* renamed from: d */
        public void m24351d(Map<String, C33196a> map) {
            this.f90731b = map;
        }

        /* renamed from: e */
        public void m24350e(BaseGrtModel.C33189a c33189a) {
            this.f90732c = c33189a;
        }

        /* renamed from: f */
        public void m24349f(String str) {
            this.f90730a = str;
        }

        public String toString() {
            return "\n{\neventName='" + this.f90730a + "', \ncountryThresholdMap=" + this.f90731b + ", \neventAreaModel=" + this.f90732c + "\n}\n";
        }
    }

    /* renamed from: a */
    public static void m24357a(List<BaseGrtEvent> list, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("ltv");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    StatsUtils.m18210c();
                } else {
                    String optString = optJSONObject.optString("eventName");
                    if (TextUtils.isEmpty(optString)) {
                        StatsUtils.m18210c();
                    } else {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("countryThreshold");
                        if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                            HashMap hashMap = new HashMap();
                            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                                if (optJSONObject2 == null) {
                                    StatsUtils.m18210c();
                                } else {
                                    String optString2 = optJSONObject2.optString("name");
                                    if (TextUtils.isEmpty(optString2)) {
                                        StatsUtils.m18210c();
                                    } else {
                                        String lowerCase = optString2.toLowerCase();
                                        C33195a.C33196a c33196a = new C33195a.C33196a();
                                        c33196a.m24347b(lowerCase);
                                        c33196a.m24346c(optJSONObject2.optDouble("threshold"));
                                        hashMap.put(lowerCase, c33196a);
                                    }
                                }
                            }
                            if (hashMap.isEmpty()) {
                                StatsUtils.m18210c();
                            } else {
                                C33195a c33195a = new C33195a();
                                c33195a.m24351d(hashMap);
                                c33195a.m24349f(optString);
                                c33195a.m24350e(BaseGrtModel.C33189a.m24438a(optJSONObject));
                                arrayList.add(c33195a);
                            }
                        } else {
                            StatsUtils.m18210c();
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            LtvModel ltvModel = new LtvModel();
            ltvModel.m24355c(arrayList);
            list.add(new LtvEvent(ltvModel));
        }
    }

    /* renamed from: b */
    public List<C33195a> m24356b() {
        return this.f90729a;
    }

    /* renamed from: c */
    public void m24355c(List<C33195a> list) {
        this.f90729a = list;
    }

    public String toString() {
        return "LtvModel\n{\n" + this.f90729a + "\n}";
    }
}
