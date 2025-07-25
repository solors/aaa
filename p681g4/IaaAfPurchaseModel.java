package p681g4;

import android.text.TextUtils;
import com.appsflyer.AFInAppEventType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p681g4.BaseGrtModel;
import p711i4.BaseGrtEvent;
import p711i4.IaaAfPurchaseEvent;
import p753k4.StatsUtils;

/* renamed from: g4.d */
/* loaded from: classes6.dex */
public class IaaAfPurchaseModel extends BaseGrtModel {

    /* renamed from: a */
    private String f90703a;

    /* renamed from: b */
    private BaseGrtModel.C33189a f90704b;

    /* renamed from: c */
    private List<C33192a> f90705c;

    /* compiled from: IaaAfPurchaseModel.java */
    /* renamed from: g4.d$a */
    /* loaded from: classes6.dex */
    public static class C33192a {

        /* renamed from: a */
        private String f90706a;

        /* renamed from: b */
        private double f90707b;

        /* renamed from: a */
        public String m24410a() {
            return this.f90706a;
        }

        /* renamed from: b */
        public double m24409b() {
            return this.f90707b;
        }

        /* renamed from: c */
        public void m24408c(String str) {
            this.f90706a = str;
        }

        /* renamed from: d */
        public void m24407d(double d) {
            this.f90707b = d;
        }

        public String toString() {
            return "{name='" + this.f90706a + "', threshold=" + this.f90707b + '}';
        }
    }

    /* renamed from: a */
    public static void m24417a(List<BaseGrtEvent> list, JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("advancedIAP");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            IaaAfPurchaseModel iaaAfPurchaseModel = null;
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 == null) {
                    StatsUtils.m18210c();
                } else {
                    String optString = optJSONObject2.optString("eventName");
                    if (TextUtils.isEmpty(optString)) {
                        StatsUtils.m18210c();
                    } else if (TextUtils.equals(optString, AFInAppEventType.PURCHASE) && (optJSONObject = optJSONObject2.optJSONObject("iaa")) != null) {
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
                                        C33192a c33192a = new C33192a();
                                        c33192a.m24408c(optString2.toLowerCase());
                                        c33192a.m24407d(optDouble);
                                        arrayList.add(c33192a);
                                    } else {
                                        StatsUtils.m18210c();
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                iaaAfPurchaseModel = new IaaAfPurchaseModel();
                                iaaAfPurchaseModel.m24411g(optString);
                                iaaAfPurchaseModel.m24413e(arrayList);
                                iaaAfPurchaseModel.m24412f(BaseGrtModel.C33189a.m24438a(optJSONObject));
                            }
                        } else {
                            StatsUtils.m18210c();
                        }
                    }
                }
            }
            if (iaaAfPurchaseModel != null) {
                list.add(new IaaAfPurchaseEvent(iaaAfPurchaseModel));
            }
        }
    }

    /* renamed from: b */
    public List<C33192a> m24416b() {
        return this.f90705c;
    }

    /* renamed from: c */
    public BaseGrtModel.C33189a m24415c() {
        return this.f90704b;
    }

    /* renamed from: d */
    public String m24414d() {
        return this.f90703a;
    }

    /* renamed from: e */
    public void m24413e(List<C33192a> list) {
        this.f90705c = list;
    }

    /* renamed from: f */
    public void m24412f(BaseGrtModel.C33189a c33189a) {
        this.f90704b = c33189a;
    }

    /* renamed from: g */
    public void m24411g(String str) {
        this.f90703a = str;
    }

    public String toString() {
        return "IaaAfPurchaseModel\n{\neventName='" + this.f90703a + "', \neventAreaModel=" + this.f90704b + ", \ncountryThresholdList=" + this.f90705c + "\n}";
    }
}
