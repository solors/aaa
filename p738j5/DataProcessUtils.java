package p738j5;

import android.text.TextUtils;
import com.ironsource.C21114v8;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: j5.a */
/* loaded from: classes6.dex */
public class DataProcessUtils {
    /* renamed from: a */
    public static boolean m18556a(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && str2 != null) {
            Locale locale = Locale.US;
            return str.toLowerCase(locale).contains(str2.toLowerCase(locale));
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m18555b(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && str2 != null) {
            return str.equalsIgnoreCase(str2);
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m18554c(Map<String, String> map, Map<String, String> map2) {
        if (map == null && map2 == null) {
            return true;
        }
        if (map == null || map2 == null) {
            return false;
        }
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(map.keySet());
        hashSet.addAll(map2.keySet());
        for (String str : hashSet) {
            if (!TextUtils.equals(map.get(str), map2.get(str))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static String m18553d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unset";
        }
        return str;
    }

    /* renamed from: e */
    public static String m18552e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    /* renamed from: f */
    public static boolean m18551f(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return str.equalsIgnoreCase("null");
    }

    /* renamed from: g */
    public static boolean m18550g(List<?> list) {
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m18549h(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static String m18548i(Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append("\n\t\t\t\t[" + entry.getKey() + " = " + entry.getValue() + C21114v8.C21123i.f54139e);
        }
        sb2.append("\n\t\t\t\t}");
        return sb2.toString();
    }

    /* renamed from: j */
    public static Map<String, String> m18547j(Map<String, List<String>> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (String str : map.keySet()) {
                        hashMap.put(str, GsonUtils.m18539c(map.get(str)));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }
}
