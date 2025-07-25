package p681g4;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p681g4.BaseGrtModel;
import p711i4.BaseGrtEvent;
import p711i4.IaaRevenueEvent;
import p753k4.StatsUtils;

/* renamed from: g4.g */
/* loaded from: classes6.dex */
public class IaaRevenueModel extends BaseGrtModel {

    /* renamed from: a */
    private String f90719a;

    /* renamed from: b */
    private BaseGrtModel.C33189a f90720b;

    /* renamed from: a */
    public static void m24381a(List<BaseGrtEvent> list, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("iaa");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            IaaRevenueModel iaaRevenueModel = null;
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    StatsUtils.m18210c();
                } else {
                    String optString = optJSONObject.optString("eventName");
                    if (TextUtils.isEmpty(optString)) {
                        StatsUtils.m18210c();
                    } else if (TextUtils.equals(optString, "grt_client_revenue")) {
                        iaaRevenueModel = new IaaRevenueModel();
                        iaaRevenueModel.m24377e(optString);
                        iaaRevenueModel.m24378d(BaseGrtModel.C33189a.m24438a(optJSONObject));
                    }
                }
            }
            if (iaaRevenueModel != null) {
                list.add(new IaaRevenueEvent(iaaRevenueModel));
            }
        }
    }

    /* renamed from: b */
    public BaseGrtModel.C33189a m24380b() {
        return this.f90720b;
    }

    /* renamed from: c */
    public String m24379c() {
        return this.f90719a;
    }

    /* renamed from: d */
    public void m24378d(BaseGrtModel.C33189a c33189a) {
        this.f90720b = c33189a;
    }

    /* renamed from: e */
    public void m24377e(String str) {
        this.f90719a = str;
    }

    public String toString() {
        return "IaaRevenueModel\n{\neventName='" + this.f90719a + "', \neventAreaModel=" + this.f90720b + "\n}";
    }
}
