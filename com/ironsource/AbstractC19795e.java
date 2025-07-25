package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.e */
/* loaded from: classes6.dex */
abstract class AbstractC19795e {

    /* renamed from: a */
    private final String f49839a = "eventId";

    /* renamed from: b */
    private final String f49840b = "timestamp";

    /* renamed from: c */
    private final String f49841c = "InterstitialEvents";

    /* renamed from: d */
    private final String f49842d = "events";

    /* renamed from: e */
    private final String f49843e = "events";

    /* renamed from: f */
    JSONObject f49844f;

    /* renamed from: g */
    int f49845g;

    /* renamed from: h */
    private String f49846h;

    /* renamed from: a */
    private String m58842a(int i) {
        return i != 2 ? "events" : "InterstitialEvents";
    }

    /* renamed from: a */
    protected abstract String mo56110a();

    /* renamed from: a */
    public abstract String mo56109a(ArrayList<C20200kb> arrayList, JSONObject jSONObject);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m58838b() {
        if (TextUtils.isEmpty(this.f49846h)) {
            return mo56110a();
        }
        return this.f49846h;
    }

    /* renamed from: c */
    public abstract String mo56108c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m58839a(JSONArray jSONArray) {
        try {
            if (this.f49844f != null) {
                JSONObject jSONObject = new JSONObject(this.f49844f.toString());
                jSONObject.put("timestamp", IronSourceUtils.getTimestamp());
                jSONObject.put(m58842a(this.f49845g), jSONArray);
                return jSONObject.toString();
            }
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject m58841a(C20200kb c20200kb) {
        try {
            String m57658a = c20200kb.m57658a();
            JSONObject jSONObject = !TextUtils.isEmpty(m57658a) ? new JSONObject(m57658a) : new JSONObject();
            jSONObject.put("eventId", c20200kb.m57653c());
            jSONObject.put("timestamp", c20200kb.m57652d());
            return jSONObject;
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m58840a(String str) {
        this.f49846h = str;
    }
}
