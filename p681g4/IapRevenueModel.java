package p681g4;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p681g4.BaseGrtModel;
import p711i4.BaseGrtEvent;
import p711i4.IapRevenueEvent;
import p753k4.StatsUtils;

/* renamed from: g4.j */
/* loaded from: classes6.dex */
public class IapRevenueModel extends BaseGrtModel {

    /* renamed from: a */
    private String f90727a;

    /* renamed from: b */
    private BaseGrtModel.C33189a f90728b;

    /* renamed from: a */
    public static void m24362a(List<BaseGrtEvent> list, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("iap");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            IapRevenueModel iapRevenueModel = null;
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    StatsUtils.m18210c();
                } else {
                    String optString = optJSONObject.optString("eventName");
                    if (TextUtils.isEmpty(optString)) {
                        StatsUtils.m18210c();
                    } else if (TextUtils.equals(optString, "grt_iap_revenue")) {
                        iapRevenueModel = new IapRevenueModel();
                        iapRevenueModel.m24358e(optString);
                        iapRevenueModel.m24359d(BaseGrtModel.C33189a.m24438a(optJSONObject));
                    }
                }
            }
            if (iapRevenueModel != null) {
                list.add(new IapRevenueEvent(iapRevenueModel));
            }
        }
    }

    /* renamed from: b */
    public BaseGrtModel.C33189a m24361b() {
        return this.f90728b;
    }

    /* renamed from: c */
    public String m24360c() {
        return this.f90727a;
    }

    /* renamed from: d */
    public void m24359d(BaseGrtModel.C33189a c33189a) {
        this.f90728b = c33189a;
    }

    /* renamed from: e */
    public void m24358e(String str) {
        this.f90727a = str;
    }

    public String toString() {
        return "IapRevenueModel\n{\neventName='" + this.f90727a + "', \neventAreaModel=" + this.f90728b + "\n}";
    }
}
