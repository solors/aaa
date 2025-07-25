package p681g4;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p681g4.BaseGrtModel;
import p711i4.BaseGrtEvent;
import p711i4.PangleVboEvent;
import p753k4.StatsUtils;

/* renamed from: g4.l */
/* loaded from: classes6.dex */
public class PangleVboModel extends BaseGrtModel {

    /* renamed from: a */
    private String f90735a;

    /* renamed from: b */
    private BaseGrtModel.C33189a f90736b;

    /* renamed from: a */
    public static void m24345a(List<BaseGrtEvent> list, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("vbo");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            PangleVboModel pangleVboModel = null;
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    StatsUtils.m18210c();
                } else {
                    String optString = optJSONObject.optString("eventName");
                    if (TextUtils.isEmpty(optString)) {
                        StatsUtils.m18210c();
                    } else if (TextUtils.equals(optString, "impressionLevelAdRevenue")) {
                        pangleVboModel = new PangleVboModel();
                        pangleVboModel.m24342d(optString);
                        pangleVboModel.m24343c(BaseGrtModel.C33189a.m24438a(optJSONObject));
                    }
                }
            }
            if (pangleVboModel != null) {
                list.add(new PangleVboEvent(pangleVboModel));
            }
        }
    }

    /* renamed from: b */
    public BaseGrtModel.C33189a m24344b() {
        return this.f90736b;
    }

    /* renamed from: c */
    public void m24343c(BaseGrtModel.C33189a c33189a) {
        this.f90736b = c33189a;
    }

    /* renamed from: d */
    public void m24342d(String str) {
        this.f90735a = str;
    }

    public String toString() {
        return "PangleVboModel\n{\neventName='" + this.f90735a + "', \neventAreaModel=" + this.f90736b + "\n}";
    }
}
