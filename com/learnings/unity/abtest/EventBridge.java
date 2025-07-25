package com.learnings.unity.abtest;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class EventBridge {
    private static final String TAG = "EventBridge";

    public static void sendEvent(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str2 : bundle.keySet()) {
                jSONObject.put(str2, bundle.get(str2));
            }
            jSONObject.put("eventNameKey", str);
            LogUtil.m53621i(TAG, "eventName: " + str + " " + bundle);
            UnityUtil.unitySendMessage("ABTestManager", "SendEvent", jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void setEventProperty(String str, String str2) {
        String str3;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eventPropertyKey", str);
            if (TextUtils.isEmpty(str2)) {
                str3 = "";
            } else {
                str3 = str2;
            }
            jSONObject.put("eventPropertyValue", str3);
            LogUtil.m53621i(TAG, "eventPropertyKey: " + str + " eventPropertyValue: " + str2);
            UnityUtil.unitySendMessage("ABTestManager", "SetEventProperty", jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void setUserProperty(String str, String str2) {
        String str3;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userPropertyKey", str);
            if (TextUtils.isEmpty(str2)) {
                str3 = "";
            } else {
                str3 = str2;
            }
            jSONObject.put("userPropertyValue", str3);
            LogUtil.m53621i(TAG, "userPropertyKey: " + str + " userPropertyValue: " + str2);
            UnityUtil.unitySendMessage("ABTestManager", "SetUserProperty", jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
