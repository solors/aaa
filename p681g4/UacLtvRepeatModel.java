package p681g4;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p681g4.BaseGrtModel;
import p711i4.BaseGrtEvent;
import p711i4.UacLtvRepeatEvent;
import p753k4.StatsUtils;

/* renamed from: g4.n */
/* loaded from: classes6.dex */
public class UacLtvRepeatModel extends BaseGrtModel {

    /* renamed from: a */
    private List<C33199a> f90744a;

    /* compiled from: UacLtvRepeatModel.java */
    /* renamed from: g4.n$a */
    /* loaded from: classes6.dex */
    public static class C33199a {

        /* renamed from: a */
        private String f90745a;

        /* renamed from: b */
        private double f90746b;

        /* renamed from: c */
        private BaseGrtModel.C33189a f90747c;

        /* renamed from: a */
        public BaseGrtModel.C33189a m24323a() {
            return this.f90747c;
        }

        /* renamed from: b */
        public String m24322b() {
            return this.f90745a;
        }

        /* renamed from: c */
        public double m24321c() {
            return this.f90746b;
        }

        /* renamed from: d */
        public void m24320d(BaseGrtModel.C33189a c33189a) {
            this.f90747c = c33189a;
        }

        /* renamed from: e */
        public void m24319e(String str) {
            this.f90745a = str;
        }

        /* renamed from: f */
        public void m24318f(double d) {
            this.f90746b = d;
        }

        public String toString() {
            return "\n{\neventName='" + this.f90745a + "', \nthreshold=" + this.f90746b + ", \neventAreaModel=" + this.f90747c + "\n}\n";
        }
    }

    /* renamed from: a */
    public static void m24326a(List<BaseGrtEvent> list, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("uacLtvRepeat");
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
                        double optDouble = optJSONObject.optDouble("threshold");
                        if (!Double.isNaN(optDouble) && optDouble > 0.0d) {
                            C33199a c33199a = new C33199a();
                            c33199a.m24319e(optString);
                            c33199a.m24318f(optDouble);
                            c33199a.m24320d(BaseGrtModel.C33189a.m24438a(optJSONObject));
                            arrayList.add(c33199a);
                        } else {
                            StatsUtils.m18210c();
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            UacLtvRepeatModel uacLtvRepeatModel = new UacLtvRepeatModel();
            uacLtvRepeatModel.m24324c(arrayList);
            list.add(new UacLtvRepeatEvent(uacLtvRepeatModel));
        }
    }

    /* renamed from: b */
    public List<C33199a> m24325b() {
        return this.f90744a;
    }

    /* renamed from: c */
    public void m24324c(List<C33199a> list) {
        this.f90744a = list;
    }

    public String toString() {
        return "UacLtvRepeatModel\n{\n" + this.f90744a + "\n}";
    }
}
