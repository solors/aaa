package p1066z2;

import android.content.SharedPreferences;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;
import p752k3.C37383m;

/* renamed from: z2.b */
/* loaded from: classes5.dex */
public class MigrationLogger {

    /* renamed from: a */
    private final SharedPreferences f118664a;

    public MigrationLogger(SharedPreferences sharedPreferences) {
        this.f118664a = sharedPreferences;
    }

    /* renamed from: d */
    private String m882d(Throwable th) {
        if (th == null) {
            return "";
        }
        String stackTraceString = Log.getStackTraceString(th);
        return th.getMessage() + " \n " + stackTraceString;
    }

    /* renamed from: a */
    public void m885a(String str, String str2) {
        Log.d(str, str2);
    }

    /* renamed from: b */
    public void m884b(String str, String str2) {
        m883c(str, str2, null);
    }

    /* renamed from: c */
    public void m883c(String str, String str2, Throwable th) {
        JSONArray jSONArray;
        Log.e(str, str2, th);
        try {
            String m882d = m882d(th);
            String string = this.f118664a.getString("error_logs", "");
            if (C37383m.m18236d(string)) {
                jSONArray = new JSONArray();
            } else {
                jSONArray = new JSONArray(string);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("message", str2);
            jSONObject.put("error", m882d);
            jSONArray.put(jSONObject);
            this.f118664a.edit().putString("error_logs", jSONArray.toString()).commit();
        } catch (Exception e) {
            Log.e("Helpshift_mgrtLog", "Error setting error logs in prefs", e);
        }
    }
}
