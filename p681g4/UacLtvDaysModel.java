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
import p711i4.UacLtvDaysEvent;
import p753k4.StatsUtils;

/* renamed from: g4.m */
/* loaded from: classes6.dex */
public class UacLtvDaysModel extends BaseGrtModel {

    /* renamed from: a */
    private List<C33197a> f90737a;

    /* compiled from: UacLtvDaysModel.java */
    /* renamed from: g4.m$a */
    /* loaded from: classes6.dex */
    public static class C33197a {

        /* renamed from: a */
        private String f90738a;

        /* renamed from: b */
        private String f90739b;

        /* renamed from: c */
        private Map<String, List<C33198a>> f90740c;

        /* renamed from: d */
        private BaseGrtModel.C33189a f90741d;

        /* compiled from: UacLtvDaysModel.java */
        /* renamed from: g4.m$a$a */
        /* loaded from: classes6.dex */
        public static class C33198a {

            /* renamed from: a */
            private int f90742a;

            /* renamed from: b */
            private double f90743b;

            /* renamed from: a */
            public int m24330a() {
                return this.f90742a;
            }

            /* renamed from: b */
            public double m24329b() {
                return this.f90743b;
            }

            /* renamed from: c */
            public void m24328c(int i) {
                this.f90742a = i;
            }

            /* renamed from: d */
            public void m24327d(double d) {
                this.f90743b = d;
            }

            public String toString() {
                return "{day=" + this.f90742a + ", value=" + this.f90743b + '}';
            }
        }

        /* renamed from: a */
        public Map<String, List<C33198a>> m24338a() {
            return this.f90740c;
        }

        /* renamed from: b */
        public BaseGrtModel.C33189a m24337b() {
            return this.f90741d;
        }

        /* renamed from: c */
        public String m24336c() {
            return this.f90738a;
        }

        /* renamed from: d */
        public String m24335d() {
            return this.f90739b;
        }

        /* renamed from: e */
        public void m24334e(Map<String, List<C33198a>> map) {
            this.f90740c = map;
        }

        /* renamed from: f */
        public void m24333f(BaseGrtModel.C33189a c33189a) {
            this.f90741d = c33189a;
        }

        /* renamed from: g */
        public void m24332g(String str) {
            this.f90738a = str;
        }

        /* renamed from: h */
        public void m24331h(String str) {
            this.f90739b = str;
        }

        public String toString() {
            return "\n{\neventName='" + this.f90738a + "', \nthresholdName='" + this.f90739b + "', \ncountryThresholdMap=" + this.f90740c + ", \neventAreaModel=" + this.f90741d + "\n}\n";
        }
    }

    /* renamed from: a */
    public static void m24341a(List<BaseGrtEvent> list, JSONObject jSONObject) {
        int i;
        int i2;
        int i3;
        JSONArray optJSONArray = jSONObject.optJSONArray("uacLtvDays");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            while (i4 < optJSONArray.length()) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i4);
                if (optJSONObject == null) {
                    StatsUtils.m18210c();
                } else {
                    String optString = optJSONObject.optString("eventName");
                    if (TextUtils.isEmpty(optString)) {
                        StatsUtils.m18210c();
                    } else {
                        String optString2 = optJSONObject.optString("thresholdName");
                        if (TextUtils.isEmpty(optString2)) {
                            StatsUtils.m18210c();
                        } else {
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("countryThreshold");
                            if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                                HashMap hashMap = new HashMap();
                                int i5 = 0;
                                while (i5 < optJSONArray2.length()) {
                                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i5);
                                    if (optJSONObject2 == null) {
                                        StatsUtils.m18210c();
                                    } else {
                                        JSONArray optJSONArray3 = optJSONObject2.optJSONArray("thresholds");
                                        if (optJSONArray3 != null && optJSONArray3.length() != 0) {
                                            String optString3 = optJSONObject2.optString("name");
                                            if (TextUtils.isEmpty(optString3)) {
                                                StatsUtils.m18210c();
                                            } else {
                                                String lowerCase = optString3.toLowerCase();
                                                ArrayList arrayList2 = new ArrayList();
                                                int i6 = 0;
                                                while (i6 < optJSONArray3.length()) {
                                                    JSONObject optJSONObject3 = optJSONArray3.optJSONObject(i6);
                                                    if (optJSONObject3 == null) {
                                                        StatsUtils.m18210c();
                                                        i3 = i4;
                                                    } else {
                                                        int optInt = optJSONObject3.optInt("day");
                                                        i3 = i4;
                                                        double optDouble = optJSONObject3.optDouble("value");
                                                        if (optInt >= 0 && !Double.isNaN(optDouble) && optDouble > 0.0d) {
                                                            C33197a.C33198a c33198a = new C33197a.C33198a();
                                                            c33198a.m24328c(optInt);
                                                            c33198a.m24327d(optDouble);
                                                            arrayList2.add(c33198a);
                                                        } else {
                                                            StatsUtils.m18210c();
                                                        }
                                                    }
                                                    i6++;
                                                    i4 = i3;
                                                }
                                                i2 = i4;
                                                if (arrayList2.isEmpty()) {
                                                    StatsUtils.m18210c();
                                                } else {
                                                    hashMap.put(lowerCase, arrayList2);
                                                }
                                            }
                                        } else {
                                            i2 = i4;
                                            StatsUtils.m18210c();
                                        }
                                        i5++;
                                        i4 = i2;
                                    }
                                    i2 = i4;
                                    i5++;
                                    i4 = i2;
                                }
                                i = i4;
                                if (hashMap.isEmpty()) {
                                    StatsUtils.m18210c();
                                } else {
                                    C33197a c33197a = new C33197a();
                                    c33197a.m24332g(optString);
                                    c33197a.m24334e(hashMap);
                                    c33197a.m24333f(BaseGrtModel.C33189a.m24438a(optJSONObject));
                                    c33197a.m24331h(optString2);
                                    arrayList.add(c33197a);
                                }
                            } else {
                                i = i4;
                                StatsUtils.m18210c();
                            }
                            i4 = i + 1;
                        }
                    }
                }
                i = i4;
                i4 = i + 1;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            UacLtvDaysModel uacLtvDaysModel = new UacLtvDaysModel();
            uacLtvDaysModel.m24339c(arrayList);
            list.add(new UacLtvDaysEvent(uacLtvDaysModel));
        }
    }

    /* renamed from: b */
    public List<C33197a> m24340b() {
        return this.f90737a;
    }

    /* renamed from: c */
    public void m24339c(List<C33197a> list) {
        this.f90737a = list;
    }

    public String toString() {
        return "UacLtvDaysModel\n{\n" + this.f90737a + "\n}";
    }
}
