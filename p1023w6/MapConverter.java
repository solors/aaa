package p1023w6;

import android.text.TextUtils;
import androidx.room.TypeConverter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: w6.b */
/* loaded from: classes5.dex */
public class MapConverter {
    @TypeConverter
    /* renamed from: a */
    public static String m2352a(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            return new JSONObject(map).toString();
        }
        return null;
    }

    @TypeConverter
    /* renamed from: b */
    public static Map<String, String> m2351b(String str) {
        HashMap hashMap;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            hashMap = new HashMap();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt != null) {
                    hashMap.put(next, (String) opt);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (hashMap.size() <= 0) {
            return null;
        }
        return hashMap;
    }
}
