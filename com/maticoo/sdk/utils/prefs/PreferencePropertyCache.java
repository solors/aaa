package com.maticoo.sdk.utils.prefs;

import android.content.SharedPreferences;
import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.crash.CrashUtil;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class PreferencePropertyCache {
    private static final Map<String, Map<String, Object>> cachePropertyMaps = new ConcurrentHashMap();

    public static boolean getBoolean(String str, boolean z) {
        return getBoolean("zmaticoo_sdk_default", str, z);
    }

    private static Map<String, Object> getCachedMapWithSpName(String str) {
        Map<String, Map<String, Object>> map = cachePropertyMaps;
        Map<String, Object> map2 = map.get(str);
        if (map2 == null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            map.put(str, concurrentHashMap);
            return concurrentHashMap;
        }
        return map2;
    }

    public static double getDouble(String str, double d) {
        return getDouble("zmaticoo_sdk_default", str, d);
    }

    public static float getFloat(String str, float f) {
        return getFloat("zmaticoo_sdk_default", str, f);
    }

    public static int getInteger(String str, int i) {
        return getInteger("zmaticoo_sdk_default", str, i);
    }

    public static long getLong(String str, long j) {
        return getLong("zmaticoo_sdk_default", str, j);
    }

    public static <T> T getObject(String str, String str2, Class<T> cls, T t) {
        Map<String, Object> cachedMapWithSpName = getCachedMapWithSpName(str);
        try {
            if (cachedMapWithSpName.containsKey(str2)) {
                return (T) cachedMapWithSpName.get(str2);
            }
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            cachedMapWithSpName.remove(str2);
            CrashUtil.getSingleton().reportSDKException(e);
            return t;
        }
    }

    private static SharedPreferences getSharedPreferences(String str) {
        return ApplicationUtil.getInstance().getApplicationContext().getSharedPreferences(str, 0);
    }

    public static String getString(String str, String str2) {
        return getString("zmaticoo_sdk_default", str, str2);
    }

    public static <T> T getValue(PreferenceProperty<T> preferenceProperty) {
        if (preferenceProperty == null) {
            return null;
        }
        if (preferenceProperty.getType() == Boolean.class) {
            return (T) Boolean.valueOf(getBoolean(preferenceProperty.getSpName(), preferenceProperty.getName(), ((Boolean) preferenceProperty.getDefaultValue()).booleanValue()));
        }
        if (preferenceProperty.getType() != Integer.class && preferenceProperty.getType() != Short.class) {
            if (preferenceProperty.getType() == Float.class) {
                return (T) Float.valueOf(getFloat(preferenceProperty.getSpName(), preferenceProperty.getName(), ((Float) preferenceProperty.getDefaultValue()).floatValue()));
            }
            if (preferenceProperty.getType() == Long.class) {
                return (T) Long.valueOf(getLong(preferenceProperty.getSpName(), preferenceProperty.getName(), ((Long) preferenceProperty.getDefaultValue()).longValue()));
            }
            if (preferenceProperty.getType() == Double.class) {
                return (T) Double.valueOf(getDouble(preferenceProperty.getSpName(), preferenceProperty.getName(), ((Double) preferenceProperty.getDefaultValue()).doubleValue()));
            }
            if (preferenceProperty.getType() == String.class) {
                return (T) getString(preferenceProperty.getSpName(), preferenceProperty.getName(), (String) preferenceProperty.getDefaultValue());
            }
            return (T) getObject(preferenceProperty.getSpName(), preferenceProperty.getName(), preferenceProperty.getType(), preferenceProperty.getDefaultValue());
        }
        return (T) Integer.valueOf(getInteger(preferenceProperty.getSpName(), preferenceProperty.getName(), ((Integer) preferenceProperty.getDefaultValue()).intValue()));
    }

    public static void setBoolean(String str, boolean z) {
        setBoolean("zmaticoo_sdk_default", str, z);
    }

    public static void setDouble(String str, double d) {
        setDouble("zmaticoo_sdk_default", str, d);
    }

    public static void setFloat(String str, float f) {
        setFloat("zmaticoo_sdk_default", str, f);
    }

    public static void setInteger(String str, int i) {
        setInteger("zmaticoo_sdk_default", str, i);
    }

    public static void setLong(String str, long j) {
        setLong("zmaticoo_sdk_default", str, j);
    }

    public static void setString(String str, String str2) {
        setString("zmaticoo_sdk_default", str, str2);
    }

    public static <T> void setValue(PreferenceProperty<T> preferenceProperty, T t) {
        if (preferenceProperty == null) {
            return;
        }
        String spName = preferenceProperty.getSpName();
        if (t == null) {
            getCachedMapWithSpName(spName).remove(preferenceProperty.getName());
            getSharedPreferences(spName).edit().remove(preferenceProperty.getName()).apply();
        } else if (preferenceProperty.getType() == Boolean.class) {
            setBoolean(spName, preferenceProperty.getName(), ((Boolean) t).booleanValue());
        } else if (preferenceProperty.getType() == Integer.class) {
            setInteger(spName, preferenceProperty.getName(), ((Integer) t).intValue());
        } else if (preferenceProperty.getType() == Float.class) {
            setFloat(spName, preferenceProperty.getName(), ((Float) t).floatValue());
        } else if (preferenceProperty.getType() == Long.class) {
            setLong(spName, preferenceProperty.getName(), ((Long) t).longValue());
        } else if (preferenceProperty.getType() == Double.class) {
            setDouble(spName, preferenceProperty.getName(), ((Double) t).doubleValue());
        } else if (preferenceProperty.getType() == String.class) {
            setString(spName, preferenceProperty.getName(), (String) t);
        } else {
            getCachedMapWithSpName(spName).put(preferenceProperty.getName(), t);
        }
    }

    public static boolean getBoolean(String str, String str2, boolean z) {
        return getSharedPreferences(str).getBoolean(str2, z);
    }

    public static double getDouble(String str, String str2, double d) {
        try {
            return Double.parseDouble(getSharedPreferences(str).getString(str2, String.valueOf(d)));
        } catch (Exception e) {
            e.printStackTrace();
            CrashUtil.getSingleton().reportSDKException(e);
            return d;
        }
    }

    public static float getFloat(String str, String str2, float f) {
        return getSharedPreferences(str).getFloat(str2, f);
    }

    public static int getInteger(String str, String str2, int i) {
        return getSharedPreferences(str).getInt(str2, i);
    }

    public static long getLong(String str, String str2, long j) {
        return getSharedPreferences(str).getLong(str2, j);
    }

    public static String getString(String str, String str2, String str3) {
        return getSharedPreferences(str).getString(str2, str3);
    }

    public static void setBoolean(String str, String str2, boolean z) {
        getSharedPreferences(str).edit().putBoolean(str2, z).apply();
    }

    public static void setDouble(String str, String str2, double d) {
        getSharedPreferences(str).edit().putString(str2, String.valueOf(d)).apply();
    }

    public static void setFloat(String str, String str2, float f) {
        getSharedPreferences(str).edit().putFloat(str2, f).apply();
    }

    public static void setInteger(String str, String str2, int i) {
        getSharedPreferences(str).edit().putInt(str2, i).apply();
    }

    public static void setLong(String str, String str2, long j) {
        getSharedPreferences(str).edit().putLong(str2, j).apply();
    }

    public static void setString(String str, String str2, String str3) {
        getSharedPreferences(str).edit().putString(str2, str3).apply();
    }
}
