package p858r4;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: r4.a */
/* loaded from: classes6.dex */
public class SharedPreferencesManager {

    /* renamed from: a */
    Map<String, SharedPreferences> f103676a;

    /* compiled from: SharedPreferencesManager.java */
    /* renamed from: r4.a$b */
    /* loaded from: classes6.dex */
    private static class C39439b {

        /* renamed from: a */
        private static final SharedPreferencesManager f103677a = new SharedPreferencesManager();
    }

    /* renamed from: b */
    public static SharedPreferencesManager m12681b() {
        return C39439b.f103677a;
    }

    /* renamed from: d */
    private SharedPreferences m12679d(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.f103676a.containsKey(str)) {
                return this.f103676a.get(str);
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            this.f103676a.put(str, sharedPreferences);
            return sharedPreferences;
        }
        throw new IllegalArgumentException("Empty name for SharedPreferences");
    }

    /* renamed from: a */
    public boolean m12682a(Context context, String str, String str2, boolean z) {
        if (context == null) {
            return z;
        }
        return m12679d(context, str).getBoolean(str2, z);
    }

    /* renamed from: c */
    public long m12680c(Context context, String str, String str2, long j) {
        if (context == null) {
            return j;
        }
        return m12679d(context, str).getLong(str2, j);
    }

    /* renamed from: e */
    public String m12678e(Context context, String str, String str2, String str3) {
        if (context == null) {
            return str3;
        }
        return m12679d(context, str).getString(str2, str3);
    }

    /* renamed from: f */
    public void m12677f(Context context, String str, String str2, boolean z) {
        if (context == null) {
            return;
        }
        m12679d(context, str).edit().putBoolean(str2, z).apply();
    }

    /* renamed from: g */
    public void m12676g(Context context, String str, String str2, long j) {
        if (context == null) {
            return;
        }
        m12679d(context, str).edit().putLong(str2, j).apply();
    }

    /* renamed from: h */
    public void m12675h(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        m12679d(context, str).edit().putString(str2, str3).apply();
    }

    private SharedPreferencesManager() {
        this.f103676a = new HashMap();
    }
}
