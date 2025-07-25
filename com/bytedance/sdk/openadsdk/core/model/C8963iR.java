package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C7741PX;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.model.iR */
/* loaded from: classes3.dex */
public class C8963iR {

    /* renamed from: IL */
    private List<String> f19878IL;

    /* renamed from: bg */
    private String f19879bg;

    public C8963iR(String str) {
        HashMap<String, Object> m84186bg;
        this.f19879bg = "";
        this.f19878IL = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            m84186bg = new HashMap<>();
        } else {
            m84186bg = m84186bg(str);
        }
        try {
            this.f19879bg = (String) m84186bg.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) m84186bg.get("auto_test_hosts"));
            this.f19878IL = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f19878IL.add(jSONArray.optString(i));
            }
        } catch (Exception e) {
            C7741PX.m87873bg("AutoTestModel", e.getMessage());
        }
    }

    /* renamed from: IL */
    public List<String> m84188IL() {
        return this.f19878IL;
    }

    /* renamed from: bg */
    public String m84187bg() {
        return this.f19879bg;
    }

    /* renamed from: bg */
    private static final HashMap<String, Object> m84186bg(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                hashMap.put(optJSONObject.optString("name"), optJSONObject.optString("value"));
            }
            return hashMap;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }
}
