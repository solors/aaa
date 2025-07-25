package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.N4 */
/* loaded from: classes6.dex */
public abstract class AbstractC19031N4 {

    /* renamed from: a */
    public static final Object f47556a = new Object();

    /* renamed from: b */
    public static final Object f47557b = new Object();

    /* renamed from: c */
    public static boolean f47558c;

    /* renamed from: d */
    public static boolean f47559d;

    /* renamed from: e */
    public static JSONObject f47560e;

    /* renamed from: f */
    public static JSONObject f47561f;

    /* renamed from: a */
    public static final void m60858a(JSONObject jSONObject) {
        synchronized (f47557b) {
            Objects.toString(f47561f);
            Objects.toString(jSONObject);
            f47561f = jSONObject;
            f47559d = true;
            Context m61068d = C18954Ha.m61068d();
            if (m61068d != null) {
                ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
                C19508w5 m59823a = AbstractC19494v5.m59823a(m61068d, "unified_id_info_store");
                JSONObject jSONObject2 = f47561f;
                if (jSONObject2 == null) {
                    m59823a.m59621a("publisher_provided_unified_id");
                } else {
                    m59823a.m59618a("publisher_provided_unified_id", String.valueOf(jSONObject2));
                    Unit unit = Unit.f99208a;
                }
            }
        }
    }

    /* renamed from: b */
    public static final JSONObject m60857b() {
        synchronized (f47556a) {
            if (f47558c) {
                return f47560e;
            }
            f47558c = true;
            Context m61068d = C18954Ha.m61068d();
            if (m61068d != null) {
                ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
                C19508w5 m59823a = AbstractC19494v5.m59823a(m61068d, "unified_id_info_store");
                Intrinsics.checkNotNullParameter("ufids", "key");
                String string = m59823a.f48820a.getString("ufids", null);
                if (string != null) {
                    try {
                        f47560e = new JSONObject(string);
                    } catch (JSONException unused) {
                    }
                    return f47560e;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final JSONObject m60859a() {
        synchronized (f47557b) {
            if (f47559d) {
                Objects.toString(f47561f);
                return f47561f;
            }
            f47559d = true;
            Context m61068d = C18954Ha.m61068d();
            String str = null;
            if (m61068d != null) {
                ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
                C19508w5 m59823a = AbstractC19494v5.m59823a(m61068d, "unified_id_info_store");
                Intrinsics.checkNotNullParameter("publisher_provided_unified_id", "key");
                str = m59823a.f48820a.getString("publisher_provided_unified_id", null);
            }
            try {
                f47561f = new JSONObject(str);
            } catch (NullPointerException | JSONException unused) {
            }
            Objects.toString(f47561f);
            return f47561f;
        }
    }

    /* renamed from: b */
    public static final void m60856b(JSONObject jSONObject) {
        synchronized (f47556a) {
            f47560e = jSONObject;
            f47558c = true;
            Context m61068d = C18954Ha.m61068d();
            if (m61068d != null) {
                ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
                C19508w5 m59823a = AbstractC19494v5.m59823a(m61068d, "unified_id_info_store");
                JSONObject jSONObject2 = f47560e;
                if (jSONObject2 == null) {
                    m59823a.m59621a("ufids");
                } else {
                    String valueOf = String.valueOf(jSONObject2);
                    Intrinsics.checkNotNullParameter("ufids", "key");
                    SharedPreferences.Editor edit = m59823a.f48820a.edit();
                    edit.putString("ufids", valueOf);
                    edit.apply();
                }
                SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(m61068d).edit();
                JSONObject jSONObject3 = f47560e;
                if (jSONObject3 == null) {
                    edit2.remove("InMobi_unifiedId");
                } else {
                    edit2.putString("InMobi_unifiedId", String.valueOf(jSONObject3));
                }
                edit2.apply();
            }
        }
    }
}
