package p681g4;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p681g4.BaseGrtModel;
import p711i4.AdvancedTaiChiEvent;
import p711i4.BaseGrtEvent;
import p753k4.StatsUtils;

/* renamed from: g4.a */
/* loaded from: classes6.dex */
public class AdvancedTaiChiModel extends BaseGrtModel {

    /* renamed from: a */
    private List<C33185a> f90678a;

    /* compiled from: AdvancedTaiChiModel.java */
    /* renamed from: g4.a$a */
    /* loaded from: classes6.dex */
    public static class C33185a {

        /* renamed from: a */
        private String f90679a;

        /* renamed from: b */
        private Map<String, C33186a> f90680b;

        /* renamed from: c */
        private BaseGrtModel.C33189a f90681c;

        /* compiled from: AdvancedTaiChiModel.java */
        /* renamed from: g4.a$a$a */
        /* loaded from: classes6.dex */
        public static class C33186a {

            /* renamed from: a */
            private String f90682a;

            /* renamed from: b */
            private double f90683b;

            /* renamed from: c */
            private List<C33187b> f90684c;

            /* renamed from: a */
            public List<C33187b> m24465a() {
                return this.f90684c;
            }

            /* renamed from: b */
            public double m24464b() {
                return this.f90683b;
            }

            /* renamed from: c */
            public void m24463c(List<C33187b> list) {
                this.f90684c = list;
            }

            /* renamed from: d */
            public void m24462d(String str) {
                this.f90682a = str;
            }

            /* renamed from: e */
            public void m24461e(double d) {
                this.f90683b = d;
            }

            public String toString() {
                return "{name=" + this.f90682a + ", value=" + this.f90683b + '}';
            }
        }

        /* compiled from: AdvancedTaiChiModel.java */
        /* renamed from: g4.a$a$b */
        /* loaded from: classes6.dex */
        public static class C33187b {

            /* renamed from: a */
            private int f90685a;

            /* renamed from: b */
            private double f90686b;

            /* renamed from: c */
            private int f90687c;

            /* renamed from: a */
            public int m24460a() {
                return this.f90685a;
            }

            /* renamed from: b */
            public int m24459b() {
                return this.f90687c;
            }

            /* renamed from: c */
            public double m24458c() {
                return this.f90686b;
            }

            /* renamed from: d */
            public void m24457d(int i) {
                this.f90685a = i;
            }

            /* renamed from: e */
            public void m24456e(int i) {
                this.f90687c = i;
            }

            /* renamed from: f */
            public void m24455f(double d) {
                this.f90686b = d;
            }

            public String toString() {
                return "{day=" + this.f90685a + "threshold=" + this.f90686b + ", multipplier=" + this.f90687c + '}';
            }
        }

        /* renamed from: a */
        public Map<String, C33186a> m24471a() {
            return this.f90680b;
        }

        /* renamed from: b */
        public BaseGrtModel.C33189a m24470b() {
            return this.f90681c;
        }

        /* renamed from: c */
        public String m24469c() {
            return this.f90679a;
        }

        /* renamed from: d */
        public void m24468d(Map<String, C33186a> map) {
            this.f90680b = map;
        }

        /* renamed from: e */
        public void m24467e(BaseGrtModel.C33189a c33189a) {
            this.f90681c = c33189a;
        }

        /* renamed from: f */
        public void m24466f(String str) {
            this.f90679a = str;
        }

        public String toString() {
            return "\n{\neventName='" + this.f90679a + "', \ncountryThresholdMap=" + this.f90680b + ", \neventAreaModel=" + this.f90681c + "\n}\n";
        }
    }

    /* renamed from: a */
    private static boolean m24476a(C33185a.C33186a c33186a, JSONObject jSONObject) {
        JSONArray optJSONArray;
        boolean z;
        boolean z2;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("ltvMultipliers")) != null && optJSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            Boolean bool = null;
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C33185a.C33187b c33187b = new C33185a.C33187b();
                    int optInt = optJSONObject.optInt("day");
                    if (bool == null) {
                        if (optInt >= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        bool = Boolean.valueOf(z2);
                    } else {
                        boolean booleanValue = bool.booleanValue();
                        if (optInt >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (booleanValue != z) {
                            StatsUtils.m18210c();
                            return false;
                        }
                    }
                    double optDouble = optJSONObject.optDouble("threshold");
                    int optInt2 = optJSONObject.optInt("multiplier");
                    if (!Double.isNaN(optDouble) && optDouble >= 0.0d && optInt2 >= 0) {
                        c33187b.m24457d(optInt);
                        c33187b.m24455f(optJSONObject.optDouble("threshold"));
                        c33187b.m24456e(optJSONObject.optInt("multiplier"));
                        arrayList.add(c33187b);
                    } else {
                        StatsUtils.m18210c();
                        return false;
                    }
                }
            }
            c33186a.m24463c(arrayList);
        }
        return true;
    }

    /* renamed from: b */
    public static void m24475b(List<BaseGrtEvent> list, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("advancedTaiChi");
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
                            Map<String, C33185a.C33186a> m24473d = m24473d(optJSONArray2);
                            if (m24473d.isEmpty()) {
                                StatsUtils.m18210c();
                            } else {
                                C33185a c33185a = new C33185a();
                                c33185a.m24466f(optString);
                                c33185a.m24468d(m24473d);
                                c33185a.m24467e(BaseGrtModel.C33189a.m24438a(optJSONObject));
                                arrayList.add(c33185a);
                            }
                        } else {
                            StatsUtils.m18210c();
                        }
                    }
                }
            }
            AdvancedTaiChiModel advancedTaiChiModel = new AdvancedTaiChiModel();
            advancedTaiChiModel.m24472e(arrayList);
            list.add(new AdvancedTaiChiEvent(advancedTaiChiModel));
        }
    }

    /* renamed from: d */
    private static Map<String, C33185a.C33186a> m24473d(JSONArray jSONArray) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                StatsUtils.m18210c();
            } else {
                String optString = optJSONObject.optString("name");
                if (TextUtils.isEmpty(optString)) {
                    StatsUtils.m18210c();
                } else {
                    String lowerCase = optString.toLowerCase();
                    double optDouble = optJSONObject.optDouble("threshold");
                    if (!Double.isNaN(optDouble) && optDouble >= 0.0d) {
                        C33185a.C33186a c33186a = new C33185a.C33186a();
                        c33186a.m24462d(lowerCase);
                        c33186a.m24461e(optDouble);
                        if (m24476a(c33186a, optJSONObject)) {
                            hashMap.put(lowerCase, c33186a);
                        }
                    } else {
                        StatsUtils.m18210c();
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    public List<C33185a> m24474c() {
        return this.f90678a;
    }

    /* renamed from: e */
    public void m24472e(List<C33185a> list) {
        this.f90678a = list;
    }

    public String toString() {
        return "AdvancedTaiChiModel\n{\n" + this.f90678a + "\n}";
    }
}
