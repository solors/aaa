package com.bytedance.sdk.component.adexpress.dynamic.eqN;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.eqN.bX */
/* loaded from: classes3.dex */
public class C7459bX {

    /* renamed from: IL */
    private JSONObject f16151IL;

    /* renamed from: bg */
    private HashMap<String, Object> f16152bg = new HashMap<>();

    public C7459bX(JSONObject jSONObject) {
        this.f16151IL = jSONObject;
    }

    /* renamed from: IL */
    public boolean m88970IL(String str) {
        return this.f16152bg.containsKey(str);
    }

    /* renamed from: bg */
    public Object m88968bg(String str) {
        if (this.f16152bg.containsKey(str)) {
            return this.f16152bg.get(str);
        }
        return null;
    }

    /* renamed from: bg */
    public void m88969bg() {
        Iterator<String> keys = this.f16151IL.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = this.f16151IL.opt(next);
            int i = 0;
            if (TextUtils.equals("image", next)) {
                if (opt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) opt;
                        if (i < jSONArray.length()) {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i);
                            if (optJSONObject != null) {
                                Iterator<String> keys2 = optJSONObject.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    Object opt2 = optJSONObject.opt(next2);
                                    this.f16152bg.put(next + "." + i + "." + next2, opt2);
                                }
                            }
                            i++;
                        }
                    }
                }
            } else if (TextUtils.equals("dynamic_creative", next)) {
                if (opt instanceof String) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) opt);
                        Iterator<String> keys3 = jSONObject.keys();
                        while (keys3.hasNext()) {
                            String next3 = keys3.next();
                            Object opt3 = jSONObject.opt(next3);
                            if ((opt3 instanceof JSONArray) && !TextUtils.equals(next3, "short_phrase") && !TextUtils.equals(next3, "long_phrase")) {
                                for (int i2 = 0; i2 < ((JSONArray) opt3).length(); i2++) {
                                    this.f16152bg.put(next + "." + next3 + "." + i2, ((JSONArray) opt3).opt(i2));
                                }
                            } else if ((opt3 instanceof JSONObject) && TextUtils.equals(next3, FirebaseAnalytics.Param.COUPON)) {
                                Iterator<String> keys4 = ((JSONObject) opt3).keys();
                                while (keys4.hasNext()) {
                                    String next4 = keys4.next();
                                    Object opt4 = ((JSONObject) opt3).opt(next4);
                                    this.f16152bg.put(next + "." + next3 + "." + next4, opt4);
                                }
                            } else if ((opt3 instanceof JSONObject) && TextUtils.equals(next3, "live_room_data")) {
                                m88967bg(next, next3, opt3);
                            } else {
                                this.f16152bg.put(next + "." + next3, opt3);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else if (!(opt instanceof JSONObject)) {
                this.f16152bg.put(next, opt);
                if (opt instanceof String) {
                    this.f16152bg.put(next, opt);
                }
            } else if (opt != null) {
                JSONObject jSONObject2 = (JSONObject) opt;
                Iterator<String> keys5 = jSONObject2.keys();
                while (keys5.hasNext()) {
                    String next5 = keys5.next();
                    Object opt5 = jSONObject2.opt(next5);
                    this.f16152bg.put(next + "." + next5, opt5);
                }
            }
        }
    }

    /* renamed from: bg */
    private void m88967bg(String str, String str2, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if ((opt instanceof JSONArray) && TextUtils.equals(next, "product_infos")) {
                int i = 0;
                while (true) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (i < jSONArray.length()) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        Iterator<String> keys2 = optJSONObject.keys();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            Object opt2 = optJSONObject.opt(next2);
                            HashMap<String, Object> hashMap = this.f16152bg;
                            hashMap.put(str + "." + str2 + "." + next + "." + i + "." + next2, opt2);
                        }
                        i++;
                    }
                }
            } else {
                HashMap<String, Object> hashMap2 = this.f16152bg;
                hashMap2.put(str + "." + str2 + "." + next, opt);
            }
        }
    }
}
