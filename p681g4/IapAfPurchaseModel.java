package p681g4;

import android.text.TextUtils;
import com.appsflyer.AFInAppEventType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p681g4.BaseGrtModel;
import p711i4.BaseGrtEvent;
import p711i4.IapAfPurchaseEvent;
import p753k4.StatsUtils;

/* renamed from: g4.h */
/* loaded from: classes6.dex */
public class IapAfPurchaseModel extends BaseGrtModel {

    /* renamed from: a */
    private String f90721a;

    /* renamed from: b */
    private BaseGrtModel.C33189a f90722b;

    /* renamed from: c */
    private List<String> f90723c;

    /* renamed from: a */
    public static void m24376a(List<BaseGrtEvent> list, JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("advancedIAP");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            IapAfPurchaseModel iapAfPurchaseModel = null;
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 == null) {
                    StatsUtils.m18210c();
                } else {
                    String optString = optJSONObject2.optString("eventName");
                    if (TextUtils.isEmpty(optString)) {
                        StatsUtils.m18210c();
                    } else if (TextUtils.equals(optString, AFInAppEventType.PURCHASE) && (optJSONObject = optJSONObject2.optJSONObject("iap")) != null) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("countryThreshold");
                        if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                            ArrayList arrayList = new ArrayList();
                            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                String optString2 = optJSONArray2.optString(i2);
                                if (TextUtils.isEmpty(optString2)) {
                                    StatsUtils.m18210c();
                                } else {
                                    arrayList.add(optString2.toLowerCase());
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                iapAfPurchaseModel = new IapAfPurchaseModel();
                                iapAfPurchaseModel.m24370g(optString);
                                iapAfPurchaseModel.m24372e(arrayList);
                                iapAfPurchaseModel.m24371f(BaseGrtModel.C33189a.m24438a(optJSONObject));
                            }
                        } else {
                            StatsUtils.m18210c();
                        }
                    }
                }
            }
            if (iapAfPurchaseModel != null) {
                list.add(new IapAfPurchaseEvent(iapAfPurchaseModel));
            }
        }
    }

    /* renamed from: b */
    public List<String> m24375b() {
        return this.f90723c;
    }

    /* renamed from: c */
    public BaseGrtModel.C33189a m24374c() {
        return this.f90722b;
    }

    /* renamed from: d */
    public String m24373d() {
        return this.f90721a;
    }

    /* renamed from: e */
    public void m24372e(List<String> list) {
        this.f90723c = list;
    }

    /* renamed from: f */
    public void m24371f(BaseGrtModel.C33189a c33189a) {
        this.f90722b = c33189a;
    }

    /* renamed from: g */
    public void m24370g(String str) {
        this.f90721a = str;
    }

    public String toString() {
        return "IapAfPurchaseModel\n{\neventName='" + this.f90721a + "', \neventAreaModel=" + this.f90722b + ", \ncountryThresholdList=" + this.f90723c + "\n}";
    }
}
