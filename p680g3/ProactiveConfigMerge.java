package p680g3;

import com.helpshift.log.HSLogger;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: g3.b */
/* loaded from: classes5.dex */
public class ProactiveConfigMerge {
    /* renamed from: a */
    public static JSONObject m24477a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (!jSONObject2.has(next)) {
                    jSONObject2.put(next, obj);
                } else {
                    Object obj2 = jSONObject2.get(next);
                    if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                        JSONArray jSONArray = (JSONArray) obj;
                        JSONArray jSONArray2 = (JSONArray) obj2;
                        HashSet hashSet = new HashSet();
                        for (int i = 0; i < jSONArray2.length(); i++) {
                            hashSet.add(jSONArray2.get(i));
                        }
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            hashSet.add(jSONArray.get(i2));
                        }
                        jSONObject2.put(next, new JSONArray((Collection) hashSet));
                    }
                    if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                        JSONObject jSONObject3 = (JSONObject) obj;
                        JSONObject jSONObject4 = (JSONObject) obj2;
                        Iterator<String> keys2 = jSONObject3.keys();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            if (!jSONObject4.has(next2)) {
                                jSONObject4.put(next2, jSONObject3.get(next2));
                            }
                        }
                        jSONObject2.put(next, jSONObject4);
                    }
                }
            }
        } catch (Exception e) {
            HSLogger.m65438e("ProactivConfigMerge", "Proactive Config merge failed", e);
        }
        return jSONObject2;
    }
}
