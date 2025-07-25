package p681g4;

import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p681g4.BaseGrtModel;
import p711i4.BaseGrtEvent;
import p711i4.IapFbPurchaseEvent;
import p753k4.StatsUtils;

/* renamed from: g4.i */
/* loaded from: classes6.dex */
public class IapFbPurchaseModel extends BaseGrtModel {

    /* renamed from: a */
    private String f90724a;

    /* renamed from: b */
    private BaseGrtModel.C33189a f90725b;

    /* renamed from: c */
    private List<String> f90726c;

    /* renamed from: a */
    public static void m24369a(List<BaseGrtEvent> list, JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("vo");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            IapFbPurchaseModel iapFbPurchaseModel = null;
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 == null) {
                    StatsUtils.m18210c();
                } else {
                    String optString = optJSONObject2.optString("eventName");
                    if (TextUtils.isEmpty(optString)) {
                        StatsUtils.m18210c();
                    } else if (TextUtils.equals(optString, AppEventsConstants.EVENT_NAME_PURCHASED) && (optJSONObject = optJSONObject2.optJSONObject("iap")) != null) {
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
                                iapFbPurchaseModel = new IapFbPurchaseModel();
                                iapFbPurchaseModel.m24363g(optString);
                                iapFbPurchaseModel.m24365e(arrayList);
                                iapFbPurchaseModel.m24364f(BaseGrtModel.C33189a.m24438a(optJSONObject));
                            }
                        } else {
                            StatsUtils.m18210c();
                        }
                    }
                }
            }
            if (iapFbPurchaseModel != null) {
                list.add(new IapFbPurchaseEvent(iapFbPurchaseModel));
            }
        }
    }

    /* renamed from: b */
    public List<String> m24368b() {
        return this.f90726c;
    }

    /* renamed from: c */
    public BaseGrtModel.C33189a m24367c() {
        return this.f90725b;
    }

    /* renamed from: d */
    public String m24366d() {
        return this.f90724a;
    }

    /* renamed from: e */
    public void m24365e(List<String> list) {
        this.f90726c = list;
    }

    /* renamed from: f */
    public void m24364f(BaseGrtModel.C33189a c33189a) {
        this.f90725b = c33189a;
    }

    /* renamed from: g */
    public void m24363g(String str) {
        this.f90724a = str;
    }

    public String toString() {
        return "IapFbPurchaseModel\n{\neventName='" + this.f90724a + "', \neventAreaModel=" + this.f90725b + ", \ncountryThresholdList=" + this.f90726c + "\n}";
    }
}
