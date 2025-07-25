package sg.bigo.ads.controller.p952h;

import android.text.TextUtils;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.C43837r;

/* renamed from: sg.bigo.ads.controller.h.a */
/* loaded from: classes10.dex */
public final class C44061a {

    /* renamed from: a */
    public int f115585a;

    /* renamed from: b */
    public String f115586b;

    /* renamed from: c */
    public String f115587c;

    /* renamed from: d */
    public Map<String, Object> f115588d;

    public C44061a(String str) {
        m4063a(str);
    }

    /* renamed from: a */
    private void m4063a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f115587c = jSONObject.optString("data");
            this.f115585a = jSONObject.optInt(C26559a.f69635d);
            this.f115586b = jSONObject.optString("msg");
            C43837r.m4818a(jSONObject.optInt("timestamp", 0));
            this.f115588d = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.equals("data", next) && !TextUtils.equals(C26559a.f69635d, next) && !TextUtils.equals("msg", next)) {
                    this.f115588d.put(next, jSONObject.opt(next));
                }
            }
        } catch (JSONException unused) {
            this.f115587c = "";
            this.f115585a = 1005;
            this.f115586b = "Invalid response.";
        }
    }

    /* renamed from: a */
    public final boolean m4064a() {
        return this.f115585a == 1;
    }
}
