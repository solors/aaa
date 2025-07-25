package com.inmobi.media;

import java.lang.reflect.Field;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.l5 */
/* loaded from: classes6.dex */
public final class C19354l5 {
    /* JADX WARN: Removed duplicated region for block: B:62:0x0188 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018a A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m60068a(java.lang.Object r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C19354l5.m60068a(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: b */
    public static final boolean m60063b(Class cls) {
        Class cls2 = Integer.TYPE;
        if (!Intrinsics.m17075f(cls2, cls) && !Intrinsics.m17075f(cls2, cls)) {
            Class cls3 = Boolean.TYPE;
            if (!Intrinsics.m17075f(cls3, cls) && !Intrinsics.m17075f(cls3, cls)) {
                Class cls4 = Double.TYPE;
                if (!Intrinsics.m17075f(cls4, cls) && !Intrinsics.m17075f(cls4, cls)) {
                    Class cls5 = Float.TYPE;
                    if (!Intrinsics.m17075f(cls5, cls) && !Intrinsics.m17075f(cls5, cls)) {
                        Class cls6 = Long.TYPE;
                        if (!Intrinsics.m17075f(cls6, cls) && !Intrinsics.m17075f(cls6, cls) && !Intrinsics.m17075f(String.class, cls)) {
                            Class cls7 = Byte.TYPE;
                            if (!Intrinsics.m17075f(cls7, cls) && !Intrinsics.m17075f(cls7, cls)) {
                                Class cls8 = Short.TYPE;
                                if (!Intrinsics.m17075f(cls8, cls) && !Intrinsics.m17075f(cls8, cls)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m60062b(Object copyFrom, Object copyTo) {
        Intrinsics.checkNotNullParameter(copyFrom, "copyFrom");
        Intrinsics.checkNotNullParameter(copyTo, "copyTo");
        Class<?> cls = copyFrom.getClass();
        if (cls.isAssignableFrom(copyTo.getClass())) {
            Object cast = cls.cast(copyTo);
            Intrinsics.checkNotNullExpressionValue(cast, "cast(...)");
            Field[] declaredFields = cls.getDeclaredFields();
            Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
            for (Field field : declaredFields) {
                try {
                    field.setAccessible(true);
                    field.set(cast, field.get(copyFrom));
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m60066a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray.length() == jSONArray2.length()) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    Object obj = jSONArray.get(i);
                    Object obj2 = jSONArray2.get(i);
                    if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                        if (!m60064a((JSONObject) obj, (JSONObject) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                        if (!m60066a((JSONArray) obj, (JSONArray) obj2)) {
                            return false;
                        }
                    } else {
                        Intrinsics.m17074g(obj);
                        Intrinsics.m17074g(obj2);
                        if (!m60068a(obj, obj2)) {
                            return false;
                        }
                    }
                } catch (JSONException unused) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m60064a(JSONObject json1, JSONObject json2) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(json1, "json1");
        Intrinsics.checkNotNullParameter(json2, "json2");
        if (json1.length() == json2.length()) {
            Iterator<String> keys = json1.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    obj = json1.get(next);
                    obj2 = json2.get(next);
                } catch (JSONException unused) {
                }
                if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                    if (!m60064a((JSONObject) obj, (JSONObject) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                    if (!m60066a((JSONArray) obj, (JSONArray) obj2)) {
                        return false;
                    }
                } else {
                    Intrinsics.m17074g(obj);
                    Intrinsics.m17074g(obj2);
                    if (!m60068a(obj, obj2)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m60069a(Class cls) {
        return Intrinsics.m17075f(Integer.class, cls) || Intrinsics.m17075f(Boolean.class, cls) || Intrinsics.m17075f(Double.class, cls) || Intrinsics.m17075f(Float.class, cls) || Intrinsics.m17075f(Long.class, cls) || Intrinsics.m17075f(String.class, cls) || Intrinsics.m17075f(Byte.class, cls) || Intrinsics.m17075f(Short.class, cls);
    }

    /* renamed from: a */
    public static final Object m60067a(JSONArray jSONArray, int i, Class cls) {
        Object obj;
        if (Intrinsics.m17075f(Integer.TYPE, cls)) {
            obj = Integer.valueOf(jSONArray.getInt(i));
        } else if (Intrinsics.m17075f(Double.TYPE, cls)) {
            obj = Double.valueOf(jSONArray.getDouble(i));
        } else if (Intrinsics.m17075f(Float.TYPE, cls)) {
            obj = Float.valueOf((float) jSONArray.getDouble(i));
        } else if (Intrinsics.m17075f(Long.TYPE, cls)) {
            obj = Long.valueOf(jSONArray.getLong(i));
        } else if (Intrinsics.m17075f(Byte.TYPE, cls)) {
            obj = Byte.valueOf((byte) jSONArray.getInt(i));
        } else if (Intrinsics.m17075f(Short.TYPE, cls)) {
            obj = Short.valueOf((short) jSONArray.getInt(i));
        } else {
            obj = jSONArray.get(i);
        }
        Intrinsics.m17074g(obj);
        return obj;
    }

    /* renamed from: a */
    public static final Object m60065a(JSONObject jSONObject, String str, Class cls) {
        Object obj;
        if (Intrinsics.m17075f(Integer.TYPE, cls)) {
            obj = Integer.valueOf(jSONObject.getInt(str));
        } else if (Intrinsics.m17075f(Double.TYPE, cls)) {
            obj = Double.valueOf(jSONObject.getDouble(str));
        } else if (Intrinsics.m17075f(Float.TYPE, cls)) {
            obj = Float.valueOf((float) jSONObject.getDouble(str));
        } else if (Intrinsics.m17075f(Long.TYPE, cls)) {
            obj = Long.valueOf(jSONObject.getLong(str));
        } else if (Intrinsics.m17075f(Byte.TYPE, cls)) {
            obj = Byte.valueOf((byte) jSONObject.getInt(str));
        } else if (Intrinsics.m17075f(Short.TYPE, cls)) {
            obj = Short.valueOf((short) jSONObject.getInt(str));
        } else {
            obj = jSONObject.get(str);
        }
        Intrinsics.m17074g(obj);
        return obj;
    }
}
