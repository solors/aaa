package com.mbridge.msdk.foundation.tools;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.inmobi.unification.sdk.InitializationStatus;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.tools.s */
/* loaded from: classes6.dex */
public final class JsonUtils {
    /* renamed from: a */
    public static String m51618a(int i, int i2, int i3, int i4, int i5) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put(C26559a.f69635d, 0);
                jSONObject.put("message", InitializationStatus.SUCCESS);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("rotateAngle", i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("left", i2);
                jSONObject3.put("right", i3);
                jSONObject3.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, i4);
                jSONObject3.put("bottom", i5);
                jSONObject2.put("cutoutInfo", jSONObject3);
                jSONObject.put("data", jSONObject2);
            } catch (Exception e) {
                SameLogTool.m51824b("JSONUtils", e.getMessage());
            }
        } catch (Throwable th) {
            SameLogTool.m51824b("JSONUtils", th.getMessage());
            try {
                jSONObject.put(C26559a.f69635d, 1);
                jSONObject.put("message", "Fail");
            } catch (JSONException e2) {
                SameLogTool.m51824b("JSONUtils", e2.getMessage());
            }
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static ArrayList<String> m51617a(JSONArray jSONArray) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            ArrayList<String> arrayList = new ArrayList<>(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.optString(i));
            }
            return arrayList;
        }
        return null;
    }
}
