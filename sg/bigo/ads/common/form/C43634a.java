package sg.bigo.ads.common.form;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import sg.bigo.ads.api.p903a.InterfaceC43518e;
import sg.bigo.ads.common.form.C43636b;
import sg.bigo.ads.common.utils.C43810a;

/* renamed from: sg.bigo.ads.common.form.a */
/* loaded from: classes10.dex */
public final class C43634a {

    /* renamed from: a */
    public static String f114222a;

    /* renamed from: b */
    public static Locale f114223b;

    /* renamed from: a */
    public static String m5287a(Context context, int i) {
        return C43810a.m4953a(context, i, f114223b);
    }

    /* renamed from: b */
    public static void m5283b(int i) {
        C43636b.m5282a();
        C43636b.m5278b(i);
    }

    /* renamed from: a */
    public static String m5286a(String str, Map<String, Object> map) {
        if (map == null) {
            return "";
        }
        try {
            JSONObject jSONObject = (JSONObject) map.get("form_qa");
            if (jSONObject != null) {
                return jSONObject.getString(str);
            }
        } catch (Exception unused) {
        }
        return "";
    }

    @Nullable
    /* renamed from: a */
    public static Map<String, Object> m5290a(int i) {
        C43636b.m5282a();
        return C43636b.m5281a(i);
    }

    /* renamed from: a */
    public static Map<String, Object> m5284a(@NonNull InterfaceC43518e interfaceC43518e, boolean z, @NonNull JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject(interfaceC43518e.mo5390g());
            Iterator<String> keys = jSONObject3.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.put(next, jSONObject3.optString(next, ""));
            }
            jSONObject2.put("privacy", z ? "1" : "0");
            jSONObject2.put("style_id", String.valueOf(interfaceC43518e.mo5391f()));
        } catch (Exception unused) {
        }
        hashMap.put("extra", jSONObject2);
        hashMap.put("form_qa", jSONObject);
        hashMap.put("form_id", Long.valueOf(interfaceC43518e.mo5394c()));
        hashMap.put("timestamp_ms", Long.valueOf(System.currentTimeMillis()));
        return hashMap;
    }

    /* renamed from: a */
    public static void m5289a(final int i, int i2) {
        C43636b.m5282a().m5279a(m5290a(i), new C43636b.InterfaceC43638a() { // from class: sg.bigo.ads.common.form.a.1
            @Override // sg.bigo.ads.common.form.C43636b.InterfaceC43638a
            /* renamed from: a */
            public final void mo5264a(int i3) {
                C43634a.m5283b(i);
            }

            @Override // sg.bigo.ads.common.form.C43636b.InterfaceC43638a
            /* renamed from: a */
            public final void mo5261a(Map<String, Object> map) {
            }
        }, i2);
    }

    /* renamed from: a */
    public static void m5288a(int i, @Nullable Map<String, Object> map) {
        if (map != null) {
            C43636b.m5282a();
            C43636b.m5280a(i, map);
        }
    }

    /* renamed from: a */
    public static boolean m5285a(Map<String, Object> map) {
        if (map == null) {
            return true;
        }
        String str = "";
        try {
            JSONObject jSONObject = (JSONObject) map.get("extra");
            if (jSONObject != null && jSONObject.has("privacy")) {
                str = jSONObject.optString("privacy", "0");
            }
        } catch (Exception unused) {
        }
        return "1".equals(str);
    }
}
