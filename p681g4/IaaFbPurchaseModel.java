package p681g4;

import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p681g4.BaseGrtModel;
import p711i4.BaseGrtEvent;
import p711i4.IaaFbPurchaseEvent;
import p753k4.StatsUtils;

/* renamed from: g4.e */
/* loaded from: classes6.dex */
public class IaaFbPurchaseModel extends BaseGrtModel {

    /* renamed from: a */
    private String f90708a;

    /* renamed from: b */
    private BaseGrtModel.C33189a f90709b;

    /* renamed from: c */
    private List<C33193a> f90710c;

    /* compiled from: IaaFbPurchaseModel.java */
    /* renamed from: g4.e$a */
    /* loaded from: classes6.dex */
    public static class C33193a {

        /* renamed from: a */
        private String f90711a;

        /* renamed from: b */
        private double f90712b;

        /* renamed from: a */
        public String m24399a() {
            return this.f90711a;
        }

        /* renamed from: b */
        public double m24398b() {
            return this.f90712b;
        }

        /* renamed from: c */
        public void m24397c(String str) {
            this.f90711a = str;
        }

        /* renamed from: d */
        public void m24396d(double d) {
            this.f90712b = d;
        }

        public String toString() {
            return "{name='" + this.f90711a + "', threshold=" + this.f90712b + '}';
        }
    }

    /* renamed from: a */
    public static void m24406a(List<BaseGrtEvent> list, JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("vo");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            IaaFbPurchaseModel iaaFbPurchaseModel = null;
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 == null) {
                    StatsUtils.m18210c();
                } else {
                    String optString = optJSONObject2.optString("eventName");
                    if (TextUtils.isEmpty(optString)) {
                        StatsUtils.m18210c();
                    } else if (TextUtils.equals(optString, AppEventsConstants.EVENT_NAME_PURCHASED) && (optJSONObject = optJSONObject2.optJSONObject("iaa")) != null) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("countryThreshold");
                        if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                            ArrayList arrayList = new ArrayList();
                            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i2);
                                if (optJSONObject3 == null) {
                                    StatsUtils.m18210c();
                                } else {
                                    String optString2 = optJSONObject3.optString("name");
                                    double optDouble = optJSONObject3.optDouble("threshold");
                                    if (!TextUtils.isEmpty(optString2) && !Double.isNaN(optDouble) && optDouble > 0.0d) {
                                        C33193a c33193a = new C33193a();
                                        c33193a.m24397c(optString2.toLowerCase());
                                        c33193a.m24396d(optDouble);
                                        arrayList.add(c33193a);
                                    } else {
                                        StatsUtils.m18210c();
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                iaaFbPurchaseModel = new IaaFbPurchaseModel();
                                iaaFbPurchaseModel.m24400g(optString);
                                iaaFbPurchaseModel.m24402e(arrayList);
                                iaaFbPurchaseModel.m24401f(BaseGrtModel.C33189a.m24438a(optJSONObject));
                            }
                        } else {
                            StatsUtils.m18210c();
                        }
                    }
                }
            }
            if (iaaFbPurchaseModel != null) {
                list.add(new IaaFbPurchaseEvent(iaaFbPurchaseModel));
            }
        }
    }

    /* renamed from: b */
    public List<C33193a> m24405b() {
        return this.f90710c;
    }

    /* renamed from: c */
    public BaseGrtModel.C33189a m24404c() {
        return this.f90709b;
    }

    /* renamed from: d */
    public String m24403d() {
        return this.f90708a;
    }

    /* renamed from: e */
    public void m24402e(List<C33193a> list) {
        this.f90710c = list;
    }

    /* renamed from: f */
    public void m24401f(BaseGrtModel.C33189a c33189a) {
        this.f90709b = c33189a;
    }

    /* renamed from: g */
    public void m24400g(String str) {
        this.f90708a = str;
    }

    public String toString() {
        return "IaaFbPurchaseModel\n{\neventName='" + this.f90708a + "', \neventAreaModel=" + this.f90709b + ", \ncountryThresholdList=" + this.f90710c + "\n}";
    }
}
