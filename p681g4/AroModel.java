package p681g4;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p681g4.BaseGrtModel;
import p711i4.AroEvent;
import p711i4.BaseGrtEvent;
import p753k4.StatsUtils;

/* renamed from: g4.b */
/* loaded from: classes6.dex */
public class AroModel extends BaseGrtModel {

    /* renamed from: a */
    private String f90688a;

    /* renamed from: b */
    private BaseGrtModel.C33189a f90689b;

    /* renamed from: c */
    private List<String> f90690c;

    /* renamed from: d */
    private List<C33188a> f90691d;

    /* compiled from: AroModel.java */
    /* renamed from: g4.b$a */
    /* loaded from: classes6.dex */
    public static class C33188a {

        /* renamed from: a */
        private String f90692a;

        /* renamed from: b */
        private double f90693b;

        /* renamed from: c */
        private double f90694c;

        /* renamed from: a */
        public double m24445a() {
            return this.f90694c;
        }

        /* renamed from: b */
        public String m24444b() {
            return this.f90692a;
        }

        /* renamed from: c */
        public double m24443c() {
            return this.f90693b;
        }

        /* renamed from: d */
        public boolean m24442d() {
            if (this.f90693b <= 0.0d) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public void m24441e(double d) {
            this.f90694c = d;
        }

        /* renamed from: f */
        public void m24440f(String str) {
            this.f90692a = str;
        }

        /* renamed from: g */
        public void m24439g(double d) {
            this.f90693b = d;
        }

        public String toString() {
            return "CountryThreshold{name='" + this.f90692a + "', threshold=" + this.f90693b + ", min=" + this.f90694c + '}';
        }
    }

    /* renamed from: a */
    public static void m24454a(List<BaseGrtEvent> list, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("aro");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            AroModel aroModel = null;
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    StatsUtils.m18210c();
                } else {
                    String optString = optJSONObject.optString("eventName");
                    if (TextUtils.isEmpty(optString)) {
                        StatsUtils.m18210c();
                    } else if (TextUtils.equals(optString, FirebaseAnalytics.Event.AD_IMPRESSION)) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray(MRAIDCommunicatorUtil.KEY_PLACEMENTTYPE);
                        if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                            ArrayList arrayList = new ArrayList();
                            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                String optString2 = optJSONArray2.optString(i2);
                                if (!TextUtils.isEmpty(optString2)) {
                                    arrayList.add(optString2.toLowerCase());
                                }
                            }
                            JSONArray optJSONArray3 = optJSONObject.optJSONArray("countryThreshold");
                            if (optJSONArray3 != null && optJSONArray3.length() != 0) {
                                ArrayList arrayList2 = new ArrayList();
                                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                                    JSONObject optJSONObject2 = optJSONArray3.optJSONObject(i3);
                                    if (optJSONObject2 == null) {
                                        StatsUtils.m18210c();
                                    } else {
                                        String optString3 = optJSONObject2.optString("name");
                                        double optDouble = optJSONObject2.optDouble("threshold");
                                        double optDouble2 = optJSONObject2.optDouble("min");
                                        if (!TextUtils.isEmpty(optString3) && !Double.isNaN(optDouble) && optDouble >= 0.0d && !Double.isNaN(optDouble2) && optDouble2 >= 0.0d) {
                                            C33188a c33188a = new C33188a();
                                            c33188a.m24440f(optString3.toLowerCase());
                                            c33188a.m24439g(optDouble);
                                            c33188a.m24441e(optDouble2);
                                            arrayList2.add(c33188a);
                                        } else {
                                            StatsUtils.m18210c();
                                        }
                                    }
                                }
                                if (!arrayList2.isEmpty()) {
                                    aroModel = new AroModel();
                                    aroModel.m24447h(optString);
                                    aroModel.m24446i(arrayList);
                                    aroModel.m24449f(arrayList2);
                                    aroModel.m24448g(BaseGrtModel.C33189a.m24438a(optJSONObject));
                                }
                            } else {
                                StatsUtils.m18210c();
                            }
                        } else {
                            StatsUtils.m18210c();
                        }
                    }
                }
            }
            if (aroModel != null) {
                list.add(new AroEvent(aroModel));
            }
        }
    }

    /* renamed from: b */
    public List<C33188a> m24453b() {
        return this.f90691d;
    }

    /* renamed from: c */
    public BaseGrtModel.C33189a m24452c() {
        return this.f90689b;
    }

    /* renamed from: d */
    public String m24451d() {
        return this.f90688a;
    }

    /* renamed from: e */
    public boolean m24450e(String str) {
        List<String> list = this.f90690c;
        if (list != null && !list.contains(str.toLowerCase())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m24449f(List<C33188a> list) {
        this.f90691d = list;
    }

    /* renamed from: g */
    public void m24448g(BaseGrtModel.C33189a c33189a) {
        this.f90689b = c33189a;
    }

    /* renamed from: h */
    public void m24447h(String str) {
        this.f90688a = str;
    }

    /* renamed from: i */
    public void m24446i(List<String> list) {
        this.f90690c = list;
    }

    public String toString() {
        return "AroModel\n{\neventName='" + this.f90688a + "'\nplacementType='" + this.f90690c + "'\ncountryThresholdList='" + this.f90691d + "', \neventAreaModel=" + this.f90689b + "\n}";
    }
}
