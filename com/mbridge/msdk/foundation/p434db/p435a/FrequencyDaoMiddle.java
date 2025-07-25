package com.mbridge.msdk.foundation.p434db.p435a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.Frequence;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SharedPreferencesUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.db.a.a */
/* loaded from: classes6.dex */
public class FrequencyDaoMiddle {

    /* renamed from: a */
    private static String f56204a = "FrequencyDaoMiddle";

    /* renamed from: b */
    private static FrequencyDaoMiddle f56205b = null;

    /* renamed from: c */
    private static String f56206c = "FrequencyDaoMiddle";

    /* renamed from: d */
    private static JSONArray f56207d = new JSONArray();

    private FrequencyDaoMiddle() {
        try {
            String str = (String) SharedPreferencesUtils.m51698a(MBSDKContext.m52746m().m52792c(), f56206c, f56207d.toString());
            if (!TextUtils.isEmpty(str)) {
                f56207d = new JSONArray(str);
            }
        } catch (Exception e) {
            SameLogTool.m51824b(f56204a, e.getMessage());
        }
    }

    /* renamed from: a */
    public static FrequencyDaoMiddle m52673a() {
        if (f56205b == null) {
            synchronized (FrequencyDaoMiddle.class) {
                if (f56205b == null) {
                    f56205b = new FrequencyDaoMiddle();
                }
            }
        }
        return f56205b;
    }

    /* renamed from: c */
    private void m52667c() {
        try {
            if (f56207d != null) {
                SharedPreferencesUtils.m51697b(MBSDKContext.m52746m().m52792c(), f56206c, f56207d.toString());
            }
        } catch (Exception e) {
            SameLogTool.m51824b(f56204a, e.getMessage());
        }
    }

    /* renamed from: b */
    public final String[] m52668b() {
        ArrayList arrayList = new ArrayList();
        if (f56207d != null) {
            for (int i = 0; i < f56207d.length(); i++) {
                try {
                    JSONObject jSONObject = f56207d.getJSONObject(i);
                    if (jSONObject != null && jSONObject.optInt("fc_a") < jSONObject.optInt("impression_count")) {
                        arrayList.add(jSONObject.optString("id"));
                    }
                } catch (JSONException e) {
                    SameLogTool.m51824b(f56204a, e.getMessage());
                }
            }
        }
        String[] strArr = new String[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            strArr[i2] = (String) arrayList.get(i2);
        }
        return strArr;
    }

    /* renamed from: a */
    public final void m52671a(Frequence frequence) {
        JSONObject m52669a;
        if (frequence == null || (m52669a = m52669a(frequence.m52465a(), frequence.m52459c(), frequence.m52457d(), frequence.m52454f(), frequence.m52455e(), frequence.m52461b())) == null) {
            return;
        }
        if (f56207d == null) {
            f56207d = new JSONArray();
        }
        f56207d.put(m52669a);
        m52667c();
    }

    /* renamed from: a */
    public final void m52670a(String str) {
        if (f56207d != null) {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < f56207d.length(); i++) {
                try {
                    JSONObject jSONObject = f56207d.getJSONObject(i);
                    if (jSONObject != null) {
                        if (jSONObject.optString("id", "").equals(str)) {
                            jSONObject.put("impression_count", jSONObject.optInt("impression_count", 0) + 1);
                            jSONArray.put(jSONObject);
                        } else {
                            jSONArray.put(jSONObject);
                        }
                    }
                } catch (JSONException e) {
                    SameLogTool.m51824b(f56204a, e.getMessage());
                }
            }
            if (jSONArray.length() > 0) {
                f56207d = jSONArray;
            }
            m52667c();
        }
    }

    /* renamed from: a */
    public final void m52672a(long j) {
        if (f56207d != null) {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < f56207d.length(); i++) {
                try {
                    JSONObject jSONObject = f56207d.getJSONObject(i);
                    if (jSONObject != null && jSONObject.optInt("ts") >= j) {
                        jSONArray.put(jSONObject);
                    }
                } catch (JSONException e) {
                    SameLogTool.m51824b(f56204a, e.getMessage());
                }
            }
            if (jSONArray.length() > 0) {
                f56207d = jSONArray;
            }
        }
        m52667c();
    }

    /* renamed from: a */
    private JSONObject m52669a(String str, int i, int i2, long j, int i3, int i4) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("id", str);
                jSONObject2.put("fc_a", i);
                jSONObject2.put("fc_b", i2);
                jSONObject2.put("ts", j);
                jSONObject2.put("impression_count", i3);
                jSONObject2.put("click_count", i4);
                return jSONObject2;
            } catch (Exception e) {
                e = e;
                jSONObject = jSONObject2;
                SameLogTool.m51824b(f56204a, e.getMessage());
                return jSONObject;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
