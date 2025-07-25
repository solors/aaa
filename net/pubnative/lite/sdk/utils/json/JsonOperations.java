package net.pubnative.lite.sdk.utils.json;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class JsonOperations {
    private static synchronized JSONObject merge(JSONObject jSONObject, JSONObject jSONObject2) {
        synchronized (JsonOperations.class) {
            if (jSONObject2 != null && jSONObject != null) {
                if (jSONObject2.length() != 0) {
                    try {
                        JSONArray names = jSONObject2.names();
                        if (names != null) {
                            for (int i = 0; i < names.length(); i++) {
                                String string = names.getString(i);
                                jSONObject.put(string, jSONObject2.get(string));
                            }
                        }
                    } catch (ArrayIndexOutOfBoundsException | RuntimeException | JSONException unused) {
                    }
                    return jSONObject;
                }
            }
            return jSONObject;
        }
    }

    public static void mergeJsonObjects(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject2.length() != 0) {
            merge(jSONObject, jSONObject2);
        }
    }

    public static void putJsonArray(JSONObject jSONObject, String str, JSONArray jSONArray) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, jSONArray);
            } catch (JSONException unused) {
            }
        }
    }

    public static void putJsonBoolean(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, z);
            } catch (JSONException unused) {
            }
        }
    }

    public static void putJsonLong(JSONObject jSONObject, String str, long j) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, j);
            } catch (JSONException unused) {
            }
        }
    }

    public static void putJsonString(JSONObject jSONObject, String str, String str2) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException unused) {
            }
        }
    }

    public static void putJsonValue(JSONObject jSONObject, String str, Integer num) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, num);
            } catch (JSONException unused) {
            }
        }
    }

    public static void putStringArray(JSONObject jSONObject, String str, List<String> list) {
        if (jSONObject != null && list != null) {
            try {
                if (!list.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    for (String str2 : list) {
                        jSONArray.put(str2);
                    }
                    jSONObject.put(str, jSONArray);
                }
            } catch (JSONException unused) {
            }
        }
    }

    public static void removeJsonValue(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            jSONObject.remove(str);
        }
    }

    public static void putJsonString(JSONArray jSONArray, String str) {
        if (jSONArray != null) {
            jSONArray.put(str);
        }
    }

    public static void putJsonValue(JSONObject jSONObject, String str, Double d) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, d);
            } catch (JSONException unused) {
            }
        }
    }
}
