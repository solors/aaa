package com.bytedance.sdk.openadsdk.multipro.eqN;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.C7170IL;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.core.C8840WR;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.bytedance.sdk.openadsdk.multipro.eqN.IL */
/* loaded from: classes3.dex */
public class C9349IL {

    /* renamed from: bg */
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> f20867bg;

    /* renamed from: IL */
    private static void m83018IL(String str) {
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f20867bg;
        if (softReference == null || softReference.get() == null || (map = f20867bg.get().get(m83010bg(str))) == null) {
            return;
        }
        map.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bX */
    public static Map<String, ?> m83017bX(Context context, String str) {
        SharedPreferences m83016bg = m83016bg(context, str);
        if (m83016bg == null) {
            return null;
        }
        return m83016bg.getAll();
    }

    @Nullable
    /* renamed from: bg */
    public static SharedPreferences m83016bg(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(m83010bg(str), 0);
        } catch (Throwable th) {
            C7741PX.m87870bg("SPMultiHelperImpl", "getSharedPreferences error ", th.getMessage());
            return null;
        }
    }

    /* renamed from: bg */
    private static String m83010bg(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    /* renamed from: IL */
    private static Object m83019IL(Context context, String str, String str2, String str3) {
        String m83010bg = m83010bg(str);
        if (m83015bg(context, m83010bg, str2)) {
            if (str3.equalsIgnoreCase("string")) {
                return C9351bg.m82997bg(context, m83010bg, str2, (String) null);
            }
            if (str3.equalsIgnoreCase("boolean")) {
                return Boolean.valueOf(C9351bg.m82996bg(context, m83010bg, str2, false));
            }
            if (str3.equalsIgnoreCase("int")) {
                return Integer.valueOf(C9351bg.m82999bg(context, m83010bg, str2, 0));
            }
            if (str3.equalsIgnoreCase("long")) {
                return Long.valueOf(C9351bg.m82998bg(context, m83010bg, str2, 0L));
            }
            if (str3.equalsIgnoreCase("float")) {
                return Float.valueOf(C9351bg.m83000bg(context, m83010bg, str2, 0.0f));
            }
            if (str3.equalsIgnoreCase("string_set")) {
                return C9351bg.m82997bg(context, m83010bg, str2, (String) null);
            }
            return null;
        }
        return null;
    }

    /* renamed from: bg */
    private static Object m83009bg(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f20867bg;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(m83010bg(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    /* renamed from: bg */
    private static void m83008bg(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f20867bg;
        if (softReference == null || softReference.get() == null) {
            f20867bg = new SoftReference<>(new ConcurrentHashMap());
        }
        String m83010bg = m83010bg(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = f20867bg.get();
        if (concurrentHashMap.get(m83010bg) == null) {
            concurrentHashMap.put(m83010bg, new HashMap());
        }
        concurrentHashMap.get(m83010bg).put(str2, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static synchronized <T> void m83014bg(Context context, String str, String str2, T t) {
        synchronized (C9349IL.class) {
            String m82994bg = C9351bg.m82994bg(str, str2);
            if (C8840WR.m84699iR(m82994bg)) {
                C7170IL m89731bg = C7170IL.m89731bg(context, m82994bg);
                if (t.equals(m83009bg(m82994bg, str2))) {
                    return;
                }
                C7170IL.SharedPreferences$EditorC7175bX m89740IL = m89731bg.m89740IL();
                m83011bg(m89740IL, str2, (Object) t);
                m89740IL.apply();
                m83008bg(m82994bg, str2, t);
                return;
            }
            SharedPreferences m83016bg = m83016bg(context, m82994bg);
            if (m83016bg == null) {
                return;
            }
            if (t.equals(m83009bg(m82994bg, str2))) {
                return;
            }
            SharedPreferences.Editor edit = m83016bg.edit();
            m83012bg(edit, str2, t);
            edit.apply();
            m83008bg(m82994bg, str2, t);
        }
    }

    /* renamed from: IL */
    public static void m83020IL(Context context, String str, String str2) {
        try {
            String m82994bg = C9351bg.m82994bg(str, str2);
            if (C8840WR.m84699iR(m82994bg)) {
                C7170IL.m89731bg(context, m82994bg).m89740IL().remove(str2).apply();
                return;
            }
            SharedPreferences m83016bg = m83016bg(context, m82994bg);
            if (m83016bg == null) {
                return;
            }
            SharedPreferences.Editor edit = m83016bg.edit();
            edit.remove(str2);
            edit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f20867bg;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            Map<String, Object> map = f20867bg.get().get(m83010bg(m82994bg));
            if (map != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: IL */
    public static void m83021IL(Context context, String str) {
        if (C8840WR.m84699iR(str)) {
            C7170IL.m89731bg(context, str).m89740IL().clear().apply();
            m83018IL(str);
            return;
        }
        SharedPreferences m83016bg = m83016bg(context, str);
        if (m83016bg == null) {
            return;
        }
        SharedPreferences.Editor edit = m83016bg.edit();
        edit.clear();
        edit.apply();
        m83018IL(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bg */
    public static <T> void m83012bg(SharedPreferences.Editor editor, String str, T t) {
        if (t instanceof Integer) {
            editor.putInt(str, ((Integer) t).intValue());
        }
        if (t instanceof Long) {
            editor.putLong(str, ((Long) t).longValue());
        }
        if (t instanceof Float) {
            editor.putFloat(str, ((Float) t).floatValue());
        }
        if (t instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t).booleanValue());
        }
        if (t instanceof String) {
            editor.putString(str, (String) t);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bg */
    public static <T> void m83011bg(C7170IL.SharedPreferences$EditorC7175bX sharedPreferences$EditorC7175bX, String str, T t) {
        if (t instanceof Integer) {
            sharedPreferences$EditorC7175bX.putInt(str, ((Integer) t).intValue());
        }
        if (t instanceof Long) {
            sharedPreferences$EditorC7175bX.putLong(str, ((Long) t).longValue());
        }
        if (t instanceof Float) {
            sharedPreferences$EditorC7175bX.putFloat(str, ((Float) t).floatValue());
        }
        if (t instanceof Boolean) {
            sharedPreferences$EditorC7175bX.putBoolean(str, ((Boolean) t).booleanValue());
        }
        if (t instanceof String) {
            sharedPreferences$EditorC7175bX.putString(str, (String) t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static String m83013bg(Context context, String str, String str2, String str3) {
        Object m83009bg = m83009bg(str, str2);
        if (m83009bg != null) {
            return String.valueOf(m83009bg);
        }
        Object m83019IL = m83019IL(context, str, str2, str3);
        m83008bg(str, str2, m83019IL);
        return String.valueOf(m83019IL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static boolean m83015bg(Context context, String str, String str2) {
        String m82994bg = C9351bg.m82994bg(str, str2);
        if (C8840WR.m84699iR(m82994bg)) {
            return C7170IL.m89731bg(context, m82994bg).m89724bg(str2);
        }
        SharedPreferences m83016bg = m83016bg(context, m82994bg);
        return m83016bg != null && m83016bg.contains(str2);
    }
}
