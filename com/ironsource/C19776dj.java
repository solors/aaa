package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C20688qf;
import com.ironsource.C21114v8;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.dj */
/* loaded from: classes6.dex */
public class C19776dj {

    /* renamed from: b */
    private static final String f49800b = "dj";

    /* renamed from: c */
    private static final String f49801c = "supersonic_shared_preferen";

    /* renamed from: d */
    private static final String f49802d = "version";

    /* renamed from: e */
    private static final String f49803e = "back_button_state";

    /* renamed from: f */
    private static final String f49804f = "search_keys";

    /* renamed from: g */
    private static final String f49805g = "^\\d+_\\d+$";

    /* renamed from: h */
    private static C19776dj f49806h;

    /* renamed from: a */
    private SharedPreferences f49807a;

    private C19776dj(Context context) {
        this.f49807a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    /* renamed from: a */
    public static synchronized C19776dj m58887a(Context context) {
        C19776dj c19776dj;
        synchronized (C19776dj.class) {
            if (f49806h == null) {
                f49806h = new C19776dj(context);
            }
            c19776dj = f49806h;
        }
        return c19776dj;
    }

    /* renamed from: e */
    public static synchronized C19776dj m58877e() {
        C19776dj c19776dj;
        synchronized (C19776dj.class) {
            c19776dj = f49806h;
        }
        return c19776dj;
    }

    /* renamed from: b */
    public C20688qf.EnumC20689a m58883b() {
        int parseInt = Integer.parseInt(this.f49807a.getString(f49803e, "2"));
        return parseInt == 0 ? C20688qf.EnumC20689a.None : parseInt == 1 ? C20688qf.EnumC20689a.Device : parseInt == 2 ? C20688qf.EnumC20689a.Controller : C20688qf.EnumC20689a.Controller;
    }

    /* renamed from: c */
    public String m58881c() {
        return this.f49807a.getString("version", "-1");
    }

    /* renamed from: d */
    public List<String> m58879d() {
        String string = this.f49807a.getString(f49804f, null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            C21189wp c21189wp = new C21189wp(string);
            if (c21189wp.m54319a(C21114v8.C21122h.f54045R)) {
                try {
                    arrayList.addAll(c21189wp.m54315a((JSONArray) c21189wp.m54312b(C21114v8.C21122h.f54045R)));
                } catch (JSONException e) {
                    C20086i9.m57997d().m58003a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private boolean m58882b(String str) {
        return str.matches(f49805g);
    }

    /* renamed from: a */
    public String m58886a(String str) {
        String string = this.f49807a.getString(str, null);
        return string != null ? string : JsonUtils.EMPTY_JSON;
    }

    /* renamed from: c */
    public void m58880c(String str) {
        SharedPreferences.Editor edit = this.f49807a.edit();
        edit.putString(f49803e, str);
        edit.apply();
    }

    /* renamed from: d */
    public void m58878d(String str) {
        if (m58881c().equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor edit = this.f49807a.edit();
        edit.putString("version", str);
        edit.apply();
    }

    /* renamed from: e */
    public void m58876e(String str) {
        SharedPreferences.Editor edit = this.f49807a.edit();
        edit.putString(f49804f, str);
        edit.apply();
    }

    /* renamed from: a */
    public ArrayList<String> m58888a() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = (String[]) this.f49807a.getAll().keySet().toArray(new String[0]);
        SharedPreferences.Editor edit = this.f49807a.edit();
        for (String str : strArr) {
            if (m58882b(str)) {
                arrayList.add(str);
                edit.remove(str);
            }
        }
        edit.apply();
        return arrayList;
    }

    /* renamed from: a */
    public void m58885a(String str, String str2) {
        SharedPreferences.Editor edit = this.f49807a.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* renamed from: a */
    public boolean m58884a(String str, String str2, String str3) {
        String string = this.f49807a.getString("ssaUserData", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor edit = this.f49807a.edit();
            edit.putString("ssaUserData", jSONObject.toString());
            edit.apply();
            return true;
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }
}
