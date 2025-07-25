package com.maticoo.sdk.utils;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.log.AdLog;
import com.maticoo.sdk.utils.log.DeveloperLog;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class JSONUtil {
    public static void addWithMap(JSONObject jSONObject, Map<String, Object> map) {
        if (jSONObject == null || map == null) {
            return;
        }
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj != null) {
                put(jSONObject, str, obj);
            }
        }
    }

    public static JSONObject convert(Map<String, Object> map) {
        if (map != null && !map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && value != null) {
                        if (value instanceof List) {
                            jSONObject.put(key, convertList((List) value));
                        } else if (isArray(value)) {
                            jSONObject.put(key, convertArray(value));
                        } else {
                            jSONObject.put(key, value);
                        }
                    }
                }
                return jSONObject;
            } catch (Exception e) {
                String str = "Error: setCustomTags(), " + e.getMessage();
                DeveloperLog.LogE(str);
                AdLog.getSingleton().LogE(str);
            }
        }
        return null;
    }

    public static JSONArray convertArray(Object obj) {
        if (obj == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            jSONArray.put(Array.get(obj, i));
        }
        return jSONArray;
    }

    public static <T> List<T> convertFromList(@Nullable JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(jSONArray.opt(i));
            } catch (Exception e) {
                e.printStackTrace();
                CrashUtil.getSingleton().reportSDKException(e);
            }
        }
        return arrayList;
    }

    public static JSONArray convertList(List list) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            jSONArray.put(obj);
        }
        return jSONArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T[] convertToArray(@Nullable JSONArray jSONArray, Class<T> cls) {
        if (jSONArray == null) {
            return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, 0));
        }
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, jSONArray.length()));
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                tArr[i] = jSONArray.opt(i);
            } catch (Exception e) {
                e.printStackTrace();
                CrashUtil.getSingleton().reportSDKException(e);
            }
        }
        return tArr;
    }

    public static boolean isArray(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.getClass().isArray();
    }

    public static Map<String, Object> jsonObjToMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (!TextUtils.isEmpty(next) && opt != null) {
                hashMap.put(next, opt);
            }
        }
        return hashMap;
    }

    public static void mergeJSONObject(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject != null && jSONObject2 != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = (JSONArray) obj;
                    for (int i = 0; i < jSONArray2.length(); i++) {
                        jSONArray.put(jSONArray2.get(i));
                    }
                    jSONObject2.put(next, jSONArray);
                } else {
                    jSONObject2.put(next, obj);
                }
            }
        }
    }

    public static JSONObject put(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null && obj != null) {
            try {
                if (obj instanceof String) {
                    if (TextUtils.isEmpty((String) obj)) {
                        return jSONObject;
                    }
                    jSONObject.put(str, obj);
                } else if (obj instanceof Integer) {
                    if (((Integer) obj).intValue() < 0) {
                        return jSONObject;
                    }
                    jSONObject.put(str, obj);
                } else if (obj instanceof Double) {
                    if (((Double) obj).doubleValue() < 0.0d) {
                        return jSONObject;
                    }
                    jSONObject.put(str, obj);
                } else {
                    jSONObject.put(str, obj);
                }
                return jSONObject;
            } catch (JSONException e) {
                DeveloperLog.LogD("JSONUtil error : ", e);
            }
        }
        return jSONObject;
    }
}
