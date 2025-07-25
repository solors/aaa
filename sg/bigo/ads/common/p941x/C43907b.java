package sg.bigo.ads.common.p941x;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Set;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.p941x.C43908c;

/* renamed from: sg.bigo.ads.common.x.b */
/* loaded from: classes10.dex */
public final class C43907b {

    /* renamed from: a */
    public static Context f114979a;

    /* renamed from: a */
    public static SharedPreferences m4603a(String str) {
        Context context = f114979a;
        if (context == null) {
            C43782a.m5009a(0, "SharedPreferenceManager", "sContext is null");
            return null;
        }
        return context.getSharedPreferences(str, 0);
    }

    /* renamed from: b */
    public static SharedPreferences.Editor m4600b(String str) {
        try {
            return m4603a(str).edit();
        } catch (Exception e) {
            C43782a.m5009a(0, "SharedPreferenceManager", Log.getStackTraceString(e));
            return null;
        }
    }

    /* renamed from: a */
    private static <T> void m4604a(SharedPreferences.Editor editor, String str, T t, int i) {
        if (editor != null) {
            if (i == 0) {
                if (!(t instanceof Number)) {
                    throw new NumberFormatException();
                }
                editor.putInt(str, ((Number) t).intValue());
            } else if (i == 1) {
                if (!(t instanceof Number)) {
                    throw new NumberFormatException();
                }
                editor.putLong(str, ((Number) t).longValue());
            } else if (i == 2) {
                if (!(t instanceof Number)) {
                    throw new NumberFormatException();
                }
                editor.putFloat(str, ((Number) t).floatValue());
            } else if (i == 3) {
                if (t != null && !(t instanceof String)) {
                    throw new ClassCastException();
                }
                editor.putString(str, (String) t);
            } else if (i == 4) {
                if (!(t instanceof Boolean)) {
                    throw new ClassCastException();
                }
                editor.putBoolean(str, ((Boolean) t).booleanValue());
            } else if (i != 5) {
            } else {
                if (t != null && !(t instanceof Set)) {
                    throw new ClassCastException();
                }
                editor.putStringSet(str, (Set) t);
            }
        }
    }

    /* renamed from: b */
    public static <T> Object m4599b(String str, T t, int i) {
        return m4598b("sp_ads", str, t, i);
    }

    /* renamed from: a */
    public static <T> void m4602a(String str, T t, int i) {
        m4601a("sp_ads", str, t, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> Object m4598b(String str, String str2, T t, int i) {
        SharedPreferences m4603a = m4603a(str);
        if (m4603a != null) {
            if (i == 0) {
                if (t instanceof Number) {
                    int intValue = ((Number) t).intValue();
                    Object obj = m4603a.getAll().get(str2);
                    if (obj instanceof Integer) {
                        intValue = ((Integer) obj).intValue();
                    } else if (obj instanceof String) {
                        try {
                            intValue = Integer.parseInt((String) obj);
                        } catch (Exception unused) {
                        }
                    }
                    return Integer.valueOf(intValue);
                }
                throw new NumberFormatException();
            } else if (i == 1) {
                if (t instanceof Number) {
                    long longValue = ((Number) t).longValue();
                    Object obj2 = m4603a.getAll().get(str2);
                    if (obj2 instanceof Long) {
                        longValue = ((Long) obj2).longValue();
                    } else if (obj2 instanceof String) {
                        try {
                            longValue = Long.parseLong((String) obj2);
                        } catch (Exception unused2) {
                        }
                    }
                    return Long.valueOf(longValue);
                }
                throw new NumberFormatException();
            } else if (i == 2) {
                if (t instanceof Number) {
                    float floatValue = ((Number) t).floatValue();
                    Object obj3 = m4603a.getAll().get(str2);
                    if (obj3 instanceof Float) {
                        floatValue = ((Float) obj3).floatValue();
                    } else if (obj3 instanceof String) {
                        try {
                            floatValue = Float.parseFloat((String) obj3);
                        } catch (Exception unused3) {
                        }
                    }
                    return Float.valueOf(floatValue);
                }
                throw new NumberFormatException();
            } else if (i == 3) {
                if (t == null || (t instanceof String)) {
                    try {
                        return m4603a.getString(str2, (String) t);
                    } catch (ClassCastException unused4) {
                        return null;
                    }
                }
                throw new ClassCastException();
            } else if (i == 4) {
                if (t instanceof Boolean) {
                    boolean booleanValue = ((Boolean) t).booleanValue();
                    Object obj4 = m4603a.getAll().get(str2);
                    if (obj4 instanceof Boolean) {
                        booleanValue = ((Boolean) obj4).booleanValue();
                    } else if (obj4 instanceof String) {
                        try {
                            booleanValue = Boolean.parseBoolean((String) obj4);
                        } catch (Exception unused5) {
                        }
                    }
                    return Boolean.valueOf(booleanValue);
                }
                throw new ClassCastException();
            } else if (i == 5) {
                if (t == null || (t instanceof Set)) {
                    return m4603a.getStringSet(str2, (Set) t);
                }
                throw new ClassCastException();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> void m4601a(String str, String str2, T t, int i) {
        try {
            SharedPreferences.Editor m4600b = m4600b(str);
            m4604a(m4600b, str2, t, i);
            C43908c.C43909a.m4597a();
            C43908c.C43909a.C43910a.m4596a(m4600b);
        } catch (Exception e) {
            C43782a.m5009a(0, "SharedPreferenceManager", Log.getStackTraceString(e));
        }
    }

    /* renamed from: a */
    public static boolean m4605a() {
        return f114979a != null;
    }
}
