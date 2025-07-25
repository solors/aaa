package p681g4;

import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p681g4.BaseGrtModel;
import p711i4.BaseGrtEvent;
import p711i4.IaaFbRoasEvent;
import p753k4.StatsUtils;

/* renamed from: g4.f */
/* loaded from: classes6.dex */
public class IaaFbRoasModel extends BaseGrtModel {

    /* renamed from: a */
    private String f90713a;

    /* renamed from: b */
    private BaseGrtModel.C33189a f90714b;

    /* renamed from: c */
    private List<C33194a> f90715c;

    /* compiled from: IaaFbRoasModel.java */
    /* renamed from: g4.f$a */
    /* loaded from: classes6.dex */
    public static class C33194a {

        /* renamed from: a */
        private String f90716a;

        /* renamed from: b */
        private double f90717b;

        /* renamed from: c */
        private double f90718c;

        /* renamed from: a */
        public double m24388a() {
            return this.f90718c;
        }

        /* renamed from: b */
        public String m24387b() {
            return this.f90716a;
        }

        /* renamed from: c */
        public double m24386c() {
            return this.f90717b;
        }

        /* renamed from: d */
        public boolean m24385d() {
            if (this.f90717b <= 0.0d) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public void m24384e(double d) {
            this.f90718c = d;
        }

        /* renamed from: f */
        public void m24383f(String str) {
            this.f90716a = str;
        }

        /* renamed from: g */
        public void m24382g(double d) {
            this.f90717b = d;
        }

        public String toString() {
            return "CountryThreshold{name='" + this.f90716a + "', threshold=" + this.f90717b + ", min=" + this.f90718c + '}';
        }
    }

    /* renamed from: a */
    public static void m24395a(List<BaseGrtEvent> list, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("fbIAAROAS");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            IaaFbRoasModel iaaFbRoasModel = null;
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    StatsUtils.m18210c();
                } else {
                    String optString = optJSONObject.optString("eventName");
                    if (TextUtils.isEmpty(optString)) {
                        StatsUtils.m18210c();
                    } else if (TextUtils.equals(optString, AppEventsConstants.EVENT_NAME_AD_IMPRESSION)) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("countryThreshold");
                        if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                            ArrayList arrayList = new ArrayList();
                            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                                if (optJSONObject2 == null) {
                                    StatsUtils.m18210c();
                                } else {
                                    String optString2 = optJSONObject2.optString("name");
                                    double optDouble = optJSONObject2.optDouble("threshold");
                                    double optDouble2 = optJSONObject2.optDouble("min");
                                    if (!TextUtils.isEmpty(optString2) && !Double.isNaN(optDouble) && optDouble >= 0.0d && !Double.isNaN(optDouble2) && optDouble2 >= 0.0d) {
                                        C33194a c33194a = new C33194a();
                                        c33194a.m24383f(optString2.toLowerCase());
                                        c33194a.m24382g(optDouble);
                                        c33194a.m24384e(optDouble2);
                                        arrayList.add(c33194a);
                                    } else {
                                        StatsUtils.m18210c();
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                iaaFbRoasModel = new IaaFbRoasModel();
                                iaaFbRoasModel.m24389g(optString);
                                iaaFbRoasModel.m24391e(arrayList);
                                iaaFbRoasModel.m24390f(BaseGrtModel.C33189a.m24438a(optJSONObject));
                            }
                        } else {
                            StatsUtils.m18210c();
                        }
                    }
                }
            }
            if (iaaFbRoasModel != null) {
                list.add(new IaaFbRoasEvent(iaaFbRoasModel));
            }
        }
    }

    /* renamed from: b */
    public List<C33194a> m24394b() {
        return this.f90715c;
    }

    /* renamed from: c */
    public BaseGrtModel.C33189a m24393c() {
        return this.f90714b;
    }

    /* renamed from: d */
    public String m24392d() {
        return this.f90713a;
    }

    /* renamed from: e */
    public void m24391e(List<C33194a> list) {
        this.f90715c = list;
    }

    /* renamed from: f */
    public void m24390f(BaseGrtModel.C33189a c33189a) {
        this.f90714b = c33189a;
    }

    /* renamed from: g */
    public void m24389g(String str) {
        this.f90713a = str;
    }

    public String toString() {
        return "IaaFbRoasModel\n{\neventName='" + this.f90713a + "'\ncountryThresholdList='" + this.f90715c + "', \neventAreaModel=" + this.f90714b + "\n}";
    }
}
