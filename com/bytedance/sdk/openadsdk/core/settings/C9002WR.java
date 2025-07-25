package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C7741PX;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.settings.WR */
/* loaded from: classes3.dex */
public class C9002WR {

    /* renamed from: bg */
    public static final C9002WR f20091bg = new C9002WR("");

    /* renamed from: IL */
    private final HashMap<String, C9003bg> f20092IL = new HashMap<>();

    /* renamed from: com.bytedance.sdk.openadsdk.core.settings.WR$bg */
    /* loaded from: classes3.dex */
    public static class C9003bg {

        /* renamed from: IL */
        public String f20093IL;

        /* renamed from: bX */
        public int f20094bX;

        /* renamed from: bg */
        public final String f20095bg;
        public int eqN;

        /* renamed from: zx */
        public String f20096zx;

        public C9003bg(JSONObject jSONObject) {
            this.f20095bg = jSONObject.optString("name");
            this.f20093IL = jSONObject.optString("app_id");
            this.f20094bX = jSONObject.optInt("init_thread", 2);
            this.eqN = jSONObject.optInt("request_after_init", 2);
            this.f20096zx = jSONObject.optString("class_name");
        }
    }

    public C9002WR(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C9003bg c9003bg = new C9003bg(optJSONObject);
                    this.f20092IL.put(c9003bg.f20095bg, c9003bg);
                }
            }
        } catch (JSONException e) {
            C7741PX.m87873bg("MediationInitConfigs", e.getMessage());
        }
    }
}
