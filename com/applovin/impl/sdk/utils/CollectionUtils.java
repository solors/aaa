package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C5434n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class CollectionUtils {
    public static <T> boolean addObjectIfExists(@Nullable T t, List<T> list) {
        if (t != null) {
            return list.add(t);
        }
        return false;
    }

    public static <T> boolean addUniqueObjectIfExists(@Nullable T t, List<T> list) {
        if (t != null && !list.contains(t)) {
            return list.add(t);
        }
        return false;
    }

    public static <T> void addUniqueObjectsIfExists(@Nullable List<T> list, List<T> list2) {
        if (list == null) {
            return;
        }
        for (T t : list) {
            if (!list2.contains(t)) {
                list2.add(t);
            }
        }
    }

    public static List<String> explode(String str) {
        return explode(str, ",\\s*");
    }

    public static boolean getBoolean(Map<String, Object> map, String str) {
        return getBoolean(map, str, false);
    }

    @Nullable
    public static <T> Set<T> getDifferenceSet(@Nullable Set<T> set, @Nullable Set<T> set2) {
        if (set == null) {
            return null;
        }
        if (set2 == null) {
            return new HashSet(set);
        }
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(set2);
        return hashSet;
    }

    public static HashMap<String, String> hashMap(String str, String str2) {
        return (HashMap) map(str, str2);
    }

    public static String implode(Collection<String> collection, int i) {
        return implode(collection, ",", i);
    }

    public static <K, V> boolean isEmpty(@Nullable Map<K, V> map) {
        return map == null || map.isEmpty();
    }

    public static <K, V> Map<K, V> map(Map<K, V> map) {
        if (map == null) {
            return new HashMap();
        }
        return new HashMap(map);
    }

    public static void putBooleanIfValid(String str, Boolean bool, Map map) {
        if (StringUtils.isValidString(str) && bool != null) {
            map.put(str, bool);
        }
    }

    public static void putDoubleIfValid(String str, Double d, Map map) {
        if (StringUtils.isValidString(str) && d != null) {
            map.put(str, d);
        }
    }

    public static void putFloatIfValid(String str, Float f, Map map) {
        if (StringUtils.isValidString(str) && f != null) {
            map.put(str, f);
        }
    }

    public static void putIntegerIfValid(String str, Integer num, Map map) {
        if (StringUtils.isValidString(str) && num != null) {
            map.put(str, num);
        }
    }

    public static void putJsonArrayIfValid(String str, JSONArray jSONArray, Map map) {
        if (StringUtils.isValidString(str) && jSONArray != null && jSONArray.length() > 0) {
            map.put(str, jSONArray);
        }
    }

    public static void putLongIfValid(String str, Long l, Map map) {
        if (StringUtils.isValidString(str) && l != null) {
            map.put(str, l);
        }
    }

    public static void putObjectToStringIfValid(String str, Object obj, Map map) {
        if (obj == null) {
            return;
        }
        putStringIfValid(str, obj.toString(), map);
    }

    public static void putStringIfValid(String str, String str2, Map map) {
        if (StringUtils.isValidString(str) && StringUtils.isValidString(str2)) {
            map.put(str, str2);
        }
    }

    public static List<String> removeTrimmedEmptyStrings(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            String trim = str.trim();
            if (!TextUtils.isEmpty(trim)) {
                arrayList.add(trim);
            }
        }
        return arrayList;
    }

    public static <T> List<T> synchronizedList() {
        return synchronizedList(-1);
    }

    public static Bundle toBundle(Map<String, ?> map) {
        if (map != null && map.size() != 0) {
            Bundle bundle = new Bundle();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (obj instanceof Map) {
                    bundle.putBundle(str, toBundle((Map) obj));
                } else if (obj instanceof Boolean) {
                    bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    bundle.putString(str, (String) obj);
                } else if (obj instanceof Integer) {
                    bundle.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    bundle.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(str, ((Double) obj).doubleValue());
                } else if (obj instanceof Parcelable) {
                    bundle.putParcelable(str, (Parcelable) obj);
                }
            }
            return bundle;
        }
        return new Bundle();
    }

    @Nullable
    public static JSONArray toJSONArray(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    public static JSONObject toJson(Map<String, ?> map) throws JSONException {
        if (map == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    public static String toJsonString(Map<String, String> map, String str) {
        try {
            return toJson(map).toString();
        } catch (JSONException e) {
            C5434n.m94904c("CollectionUtils", "Failed to convert map '" + map + "' to JSON string.", e);
            return str;
        }
    }

    public static List<String> explode(String str, String str2) {
        return TextUtils.isEmpty(str) ? Collections.emptyList() : Arrays.asList(str.split(str2));
    }

    public static boolean getBoolean(Map<String, Object> map, String str, boolean z) {
        if (map != null && map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                return Boolean.parseBoolean((String) obj);
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if (obj instanceof Number) {
                return ((Number) obj).intValue() >= 1;
            }
        }
        return z;
    }

    public static String implode(Collection<String> collection, String str, int i) {
        if (str != null) {
            if (collection == null || collection.size() < 1) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            int i2 = 0;
            for (String str2 : collection) {
                if (i2 >= i) {
                    break;
                }
                i2++;
                sb2.append(str2);
                sb2.append(str);
            }
            if (sb2.length() > str.length()) {
                sb2.setLength(sb2.length() - str.length());
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("No glue specified");
    }

    public static <E> boolean isEmpty(@Nullable Collection<E> collection) {
        return collection == null || collection.isEmpty();
    }

    public static <T> List<T> synchronizedList(int i) {
        if (i >= 0) {
            return Collections.synchronizedList(new ArrayList(i));
        }
        return Collections.synchronizedList(new ArrayList());
    }

    public static <K, V> Map<K, V> map(K k, V v) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(k, v);
        return hashMap;
    }
}
